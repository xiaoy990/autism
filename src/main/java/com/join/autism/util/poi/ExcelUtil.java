package com.join.autism.util.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 通过POI操作Excel的工具类
 * 功能：导出Excel
 */
public class ExcelUtil<T> {

    public static void main(String[] args) {
        ExcelUtil<Test> objectExcelUtil = new ExcelUtil<>();
        ArrayList<Test> hzhGenerals = new ArrayList<>();
        Test test = new Test();
        test.setSickNum("0001");
        test.setName("joiner");
        Test test1 = new Test();
        test1.setSickNum("0002");
        test1.setName("joiner1");
        hzhGenerals.add(test);
        hzhGenerals.add(test1);
        objectExcelUtil.creatExcelFile(hzhGenerals);
    }

    public String creatExcelFile(List<T> list,String url){
        return creatExcelFile(list,url,"temp.xls");
    }

    public String creatExcelFile(List<T> list,String url,String fileName){
        Workbook wb = new HSSFWorkbook();
        AtomicInteger currentRowNumber = new AtomicInteger();
        AtomicInteger currentCellNumber = new AtomicInteger();
        //创建sheet
        Sheet sheet = wb.createSheet("new sheet");
        //获取当前实体类的属性
        T t = list.get(0);
        Field[] declaredFields = t.getClass().getDeclaredFields();
        //创建第一行
        Row row = sheet.createRow(currentRowNumber.get());
        //向第一行写入数据(表头)
        Arrays.asList(declaredFields).forEach((field)->{
            //获取当前属性的注解，如果没有则annotation为null
            ExpressInExcel annotation = field.getAnnotation(ExpressInExcel.class);
            //若annotation不为null，则读取并输出到当前sheet的当前行(默认第一行)
            if (annotation != null) {
                String name = annotation.value();
                row.createCell(currentCellNumber.get()).setCellValue(name);
                currentCellNumber.getAndIncrement();
            }
            //默认只有拥有ExpressInExcel注解的属性才输出，如果需要输出不带注解的属性 请打开下面代码的注释
//            else {
//                row.createCell(currentCellNumber.get()).setCellValue(field.getName());
//                currentCellNumber.getAndIncrement();
//            }
        });
        currentRowNumber.getAndIncrement();

        //遍历参数链表,写入excel，行指针和cell指针
        list.forEach((entity)->{
            currentCellNumber.set(0);
            Row row1 = sheet.createRow(currentRowNumber.get());
            //由于反射获取的属性不具有顺序性，因此使用双重for循环保证顺序。
            //TODO: 思考如何性能调优
            Arrays.asList(declaredFields).forEach(field -> {
                //只输出有ExpressInExcel注解的属性
                if (field.getAnnotation(ExpressInExcel.class)!=null){
                    try {
                        Field declaredField = entity.getClass().getDeclaredField(field.getName());
                        declaredField.setAccessible(true);
                        Object o = declaredField.get(entity);
                        if (o != null){
                            row1.createCell(currentCellNumber.get()).setCellValue(o.toString());
                            currentCellNumber.incrementAndGet();
                        }else{
                            //如果当前属性为null输出空串
                            row1.createCell(currentCellNumber.get()).setCellValue("");
                            currentCellNumber.incrementAndGet();
                        }

                    } catch (IllegalAccessException | NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                }
            });
            currentRowNumber.incrementAndGet();
        });

        File file = new File(url);
        if (!file.exists()){
            try {
                boolean mkdirs = file.mkdirs();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try (OutputStream fileOut = new FileOutputStream(url+fileName)) {
            wb.write(fileOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url+fileName;
    }

    public String creatExcelFile(List<T> list) {
        return creatExcelFile(list,"/tmp/autism/excel/");
    }
}