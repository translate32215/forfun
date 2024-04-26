package com.startapp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* compiled from: Sta */
public class l5 {
    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(ob.class)) {
                ob obVar = (ob) annotation;
                if (!"".equals(obVar.name())) {
                    return obVar.name();
                }
            }
        }
        return field.getName();
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (!annotation.annotationType().equals(ob.class)) {
            return false;
        }
        return ((ob) annotation).complex();
    }
}
