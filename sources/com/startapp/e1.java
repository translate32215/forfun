package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import j.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Bitmap> f10316a = new ConcurrentHashMap();

    public static Bitmap a(Context context, String str) {
        Bitmap b10 = b(context, str);
        return b10 == null ? b(context, str) : b10;
    }

    public static Bitmap b(Context context, String str) {
        FileInputStream fileInputStream;
        Map<String, Bitmap> map = f10316a;
        Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) map).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(context.getFilesDir().getPath() + "/" + str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                decodeStream.setDensity(context.getResources() != null ? context.getResources().getDisplayMetrics().densityDpi : 160);
                ((ConcurrentHashMap) map).put(str, decodeStream);
                wb.a((Closeable) fileInputStream);
                return decodeStream;
            } catch (Exception unused) {
                wb.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                wb.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            wb.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            wb.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        if (!str.endsWith(str2)) {
            str = f.a(str, str2);
        }
        if (!((ConcurrentHashMap) f10316a).containsKey(str)) {
            if (!new File(context.getFilesDir().getPath() + "/" + str).exists()) {
                return false;
            }
        }
        return true;
    }
}
