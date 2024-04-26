package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class is implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final fr f7101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7102b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7103c;

    /* renamed from: d  reason: collision with root package name */
    public final ma.a f7104d;

    /* renamed from: e  reason: collision with root package name */
    public Method f7105e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7106f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7107g;

    public is(fr frVar, String str, String str2, ma.a aVar, int i10, int i11) {
        this.f7101a = frVar;
        this.f7102b = str;
        this.f7103c = str2;
        this.f7104d = aVar;
        this.f7106f = i10;
        this.f7107g = i11;
    }

    public abstract void a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method b10 = this.f7101a.b(this.f7102b, this.f7103c);
            this.f7105e = b10;
            if (b10 == null) {
                return null;
            }
            a();
            pf pfVar = this.f7101a.f6490l;
            if (!(pfVar == null || (i10 = this.f7106f) == Integer.MIN_VALUE)) {
                pfVar.a(this.f7107g, i10, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
