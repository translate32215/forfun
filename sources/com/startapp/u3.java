package com.startapp;

import com.startapp.networkTest.data.TimeInfo;

/* compiled from: Sta */
public class u3 {
    public static String a(TimeInfo timeInfo, String str) {
        byte[] bArr;
        if (timeInfo == null || str == null || str.length() == 0) {
            return null;
        }
        StringBuilder a10 = b1.a(str);
        a10.append(timeInfo.TimestampMillis);
        try {
            bArr = u9.a(a10.toString().getBytes("UTF-8"));
        } catch (Throwable th) {
            x2.a(th);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return f2.a(bArr);
    }
}
