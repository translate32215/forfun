package com.startapp;

import android.text.TextUtils;

/* compiled from: Sta */
public class se {
    public static void a(rd rdVar) {
        if (!rdVar.f11679f) {
            throw new IllegalStateException("AdSession is not started");
        } else if (rdVar.f11680g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void b(rd rdVar) {
        if (rdVar.f11680g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(rd rdVar) {
        if (!rdVar.d()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }
}
