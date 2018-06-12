package com.yangs.javabeantransform;

import java.lang.reflect.Field;

public class JavaBeanTransform {


    /**
     * Bean转化函数
     *
     * @param  object  来源Bean对象
     * @param  clazz   目标Bean类
     * @return 目标Bean对象
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Object beanTransform(Object object, Class clazz)
            throws IllegalAccessException, InstantiationException {

        if (object == null || clazz == null) return null;

        Object result = clazz.newInstance();

        // 来源Bean类中的Field数组
        Field[] srcFields = object.getClass().getDeclaredFields();

        // 目标Bean类中的Field数组
        Field[] desFields = clazz.getDeclaredFields();

        // 遍历来源Bean类中的Field数组，判断是否有BeanProperty注解
        for (Field srcField : srcFields) {
            // 允许通过反射访问来源Bean
            srcField.setAccessible(true);

           if (srcField.isAnnotationPresent(BeanProperty.class)) {
               // 取出BeanProperty注解
               BeanProperty srcBP = srcField.getAnnotation(BeanProperty.class);

               if (!srcBP.value().equals("")) {
                   // 遍历目标Bean类中的Field数组，判断是否有BeanProperty注解
                   for (Field desField : desFields) {

                       if (desField.isAnnotationPresent(BeanProperty.class)) {
                           // 取出BeanProperty注解
                           BeanProperty desBP = desField.getAnnotation(BeanProperty.class);

                           // 如果来源Bean和目标Bean的注解值相等，则操作赋值
                           if (srcBP.value().equals(desBP.value())) {
                               // 允许通过反射访问目标Bean
                               desField.setAccessible(true);

                               if (srcField.getType().equals(desField.getType())) {
                                   Object value = srcField.get(object);
                                   desField.set(result, value);
                               } else {
                                   Object values = beanTransform(srcField.get(object), desField.getType());
                                   desField.set(result, values);
                               }

                               desField.setAccessible(false);
                               break;
                           }
                       }
                   }
               }
           }
           srcField.setAccessible(false);
        }
        return result;
    }
}
