package com.join.autism.util.poi;

public class Test {

    @ExpressInExcel(value = "患者编号")
    private String sickNum;
    @ExpressInExcel(value = "患者姓名")
    private String name;

    private String sex;

    public String getSickNum() {
        return sickNum;
    }

    public void setSickNum(String sickNum) {
        this.sickNum = sickNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "sickNum='" + sickNum + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
