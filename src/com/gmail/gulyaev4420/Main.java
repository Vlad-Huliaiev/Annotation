package com.gmail.gulyaev4420;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args){
        Test test = new Test();
        Class<?> cls = test.getClass();

        Method [] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation tes = method.getAnnotation(TestAnnotation.class);
                try {
                    method.invoke(test, tes.a(), tes.b());
                } catch (InvocationTargetException | IllegalAccessException tr) {
                    tr.printStackTrace();
                }
            }
        }
    }
}
