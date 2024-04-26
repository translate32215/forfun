package com.startapp;

import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.results.BaseResult;

/* compiled from: Sta */
public class r5 {
    public static String a(Object obj) {
        return a(obj, obj.getClass());
    }

    public static String a(Object obj, Class<?> cls) {
        return String.valueOf(k5.b(obj));
    }

    public static String a(FileTypes fileTypes, BaseResult baseResult) {
        return a(baseResult);
    }

    public static <T> T a(String str, Class<T> cls) {
        return a(str, cls, false);
    }

    public static <T> T a(String str, Class<T> cls, boolean z10) {
        return k5.a(str, cls);
    }
}
