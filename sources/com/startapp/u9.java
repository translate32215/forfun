package com.startapp;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* compiled from: Sta */
public class u9 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12660a = "u9";

    /* renamed from: b  reason: collision with root package name */
    private static final String f12661b = "SHA-256";

    /* renamed from: c  reason: collision with root package name */
    private static final int f12662c = 8192;

    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f12661b);
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            x2.a(th);
            return null;
        }
    }

    public static byte[] a(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f12661b);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[f12662c];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return instance.digest();
                }
            }
        } catch (Throwable th) {
            x2.a(th);
            return null;
        }
    }
}
