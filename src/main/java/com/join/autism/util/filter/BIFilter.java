//package com.join.autism.util.filter;
//
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//@Component
//@Order(0)
//public class BIFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig){
//        System.out.println("filter init");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        Map<String, String[]> parameterMap = servletRequest.getParameterMap();
//        Iterator<Map.Entry<String, String[]>> iterator = parameterMap.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, String[]> next = iterator.next();
//            String key = next.getKey();
//            String[] value = next.getValue();
//            String[] sTrue = {"1"};
//            String[] sFalse = {"0"};
//            System.out.println("value为："+value[0]);
//            if (value[0].equals("false")){
//                System.out.println("!");
//                parameterMap.replace(key,sFalse);
//            }else if (value[0].equals("true")){
//                System.out.println("?");
//                parameterMap.replace(key,sTrue);
//            }
//            System.out.println(parameterMap.get(key)[0]);
//        }
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("filter destroy");
//    }
//}
