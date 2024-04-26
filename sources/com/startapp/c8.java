package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public class c8 {
    public static boolean a(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_CALL_LOG") == 0;
    }

    public static boolean b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
}
