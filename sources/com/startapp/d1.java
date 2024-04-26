package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class d1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10261a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10262b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bitmap f10263c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f10264d;

    public d1(String str, String str2, Bitmap bitmap, Context context) {
        this.f10261a = str;
        this.f10262b = str2;
        this.f10263c = bitmap;
        this.f10264d = context;
    }

    public void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ((ConcurrentHashMap) e1.f10316a).put(this.f10261a + this.f10262b, this.f10263c);
        try {
            fileOutputStream = new FileOutputStream(this.f10264d.getFilesDir().getPath() + "/" + this.f10261a + this.f10262b);
            try {
                this.f10263c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                wb.a((Closeable) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    i4.a(th);
                } finally {
                    wb.a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            i4.a(th);
        }
    }
}
