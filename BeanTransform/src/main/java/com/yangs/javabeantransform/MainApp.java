package com.yangs.javabeantransform;


public class MainApp {

    public static void main(String[] args) {
        JavaBean1 javaBean1 = new JavaBean1();

        javaBean1.value1 = "hello";
        javaBean1.value2 = "world";

        System.out.println("test1" + javaBean1.toString());

        JavaBean2 javaBean2 = null;

        try {
            javaBean2 = (JavaBean2) JavaBeanTransform.beanTransform(javaBean1, JavaBean2.class);
            System.out.println("test2" + javaBean2.toString());

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
