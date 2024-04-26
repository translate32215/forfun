package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.ra;
import e8.a40;
import e8.j30;
import e8.wz;
import e8.z30;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class eg implements j30 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6283a;

    /* renamed from: b  reason: collision with root package name */
    public final wz f6284b;

    /* renamed from: c  reason: collision with root package name */
    public final a40 f6285c;

    /* renamed from: d  reason: collision with root package name */
    public final mf f6286d;

    public eg(Object obj, wz wzVar, a40 a40, mf mfVar) {
        this.f6283a = obj;
        this.f6284b = wzVar;
        this.f6285c = a40;
        this.f6286d = mfVar;
    }

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ra.a B = ra.B();
        mb mbVar = mb.DG;
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        ra.y((ra) B.f5970b, mbVar);
        B.o(mp.I(bArr, 0, bArr.length));
        return Base64.encodeToString(((ra) ((aq) B.j())).f(), 11);
    }

    public final synchronized void a() throws z30 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f6283a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f6283a, new Object[0]);
            this.f6286d.e(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new z30(2003, (Throwable) e10);
        }
    }

    public final synchronized void b(String str, MotionEvent motionEvent) throws z30 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f6283a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f6283a, new Object[]{hashMap});
            this.f6286d.e(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new z30(2005, (Throwable) e10);
        }
    }

    public final synchronized boolean c() throws z30 {
        try {
        } catch (Exception e10) {
            throw new z30(2001, (Throwable) e10);
        }
        return ((Boolean) this.f6283a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f6283a, new Object[0])).booleanValue();
    }

    public final synchronized int d() throws z30 {
        try {
        } catch (Exception e10) {
            throw new z30(2006, (Throwable) e10);
        }
        return ((Integer) this.f6283a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f6283a, new Object[0])).intValue();
    }

    public final synchronized byte[] e(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.f6286d.a(2007, System.currentTimeMillis() - currentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.f6283a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f6283a, new Object[]{null, map});
    }
}
