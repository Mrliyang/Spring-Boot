package com.yangs.javabeantransform;

public class JavaBean2 {

    @BeanProperty(value = "name")
    public String str1;

    @BeanProperty(value = "pass")
    public String str2;

    @Override
    public String toString() {
        return "{\n"
                + "\tvalue_1:" + str1
                + "\n\tvalue_2:" + str2
                + "\n}";
    }
}
