package com.startapp;

import android.content.Context;
import com.startapp.o7;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class bb implements Runnable, b3<Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final x8 f10203a;

    /* renamed from: b  reason: collision with root package name */
    public final y3 f10204b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10205c;

    /* renamed from: d  reason: collision with root package name */
    public final c3<String, o7.a, Throwable, Void> f10206d;

    /* renamed from: e  reason: collision with root package name */
    public o7.a f10207e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f10208f;

    public bb(x8 x8Var, y3 y3Var, String str, c3<String, o7.a, Throwable, Void> c3Var) {
        this.f10203a = x8Var;
        this.f10204b = y3Var;
        this.f10205c = str;
        this.f10206d = c3Var;
    }

    public Object a(Object obj) {
        this.f10208f = (Throwable) obj;
        return null;
    }

    public void run() {
        try {
            o7.a a10 = a(this.f10203a, this.f10204b, this.f10205c, (b3<Throwable, Void>) this);
            this.f10207e = a10;
            c3<String, o7.a, Throwable, Void> c3Var = this.f10206d;
            if (c3Var != null) {
                c3Var.a(this.f10205c, a10, this.f10208f);
            }
        } catch (Throwable th) {
            c3<String, o7.a, Throwable, Void> c3Var2 = this.f10206d;
            if (c3Var2 != null) {
                c3Var2.a(this.f10205c, this.f10207e, this.f10208f);
            }
            throw th;
        }
    }

    public static String a(String str, TrackingParams trackingParams) {
        StringBuilder sb2 = new StringBuilder(str);
        String a10 = a.a(str, (String) null);
        if (a10 != null) {
            sb2.append(a.c(a10));
        }
        if (trackingParams != null && (a10 != null || wb.d(str))) {
            sb2.append(trackingParams.e());
        }
        return sb2.toString();
    }

    public static Pair<String, Boolean> a(Context context, String str, TrackingParams trackingParams, c3<String, o7.a, Throwable, Void> c3Var) {
        String a10 = a(str, trackingParams);
        return new Pair<>(a10, Boolean.valueOf(a(context, a10, c3Var)));
    }

    public static boolean a(Context context, String str, c3<String, o7.a, Throwable, Void> c3Var) {
        try {
            ComponentLocator a10 = ComponentLocator.a(context);
            a10.p().execute(new bb(a10.q(), a10.k(), str, c3Var));
            return true;
        } catch (Throwable th) {
            i4.a(th);
            if (c3Var == null) {
                return false;
            }
            c3Var.a(str, null, th);
            return false;
        }
    }

    public static o7.a a(x8 x8Var, y3 y3Var, String str, b3<Throwable, Void> b3Var) {
        cb cbVar = new cb();
        try {
            cbVar.J = x8Var.a((Object) cbVar);
        } catch (Throwable th) {
            i4.a(th);
        }
        y3Var.getClass();
        try {
            return y3Var.a(str, cbVar, b3Var);
        } catch (Throwable th2) {
            i4.a(th2);
            return null;
        }
    }
}
