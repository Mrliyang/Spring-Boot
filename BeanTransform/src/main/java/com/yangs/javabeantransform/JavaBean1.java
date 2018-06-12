package com.yangs.javabeantransform;

public class JavaBean1 {

    @BeanProperty(value = "name")
    public String value1;

    @BeanProperty(value = "pass")
    public String value2;

    @Override
    public String toString() {
        return "{\n"
                + "\tvalue_1:" + value1
                + "\n\tvalue_2:" + value2
                + "\n}";
    }
}
