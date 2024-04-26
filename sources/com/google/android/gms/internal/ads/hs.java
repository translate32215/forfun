package com.google.android.gms.internal.ads;

import e8.m70;
import e8.qz;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class hs {

    /* renamed from: a  reason: collision with root package name */
    public final fr f6894a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6895b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6896c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Method f6897d = null;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?>[] f6898e;

    /* renamed from: f  reason: collision with root package name */
    public CountDownLatch f6899f = new CountDownLatch(1);

    public hs(fr frVar, String str, String str2, Class<?>... clsArr) {
        this.f6894a = frVar;
        this.f6895b = str;
        this.f6896c = str2;
        this.f6898e = clsArr;
        frVar.f6480b.submit(new qz(this));
    }

    public final String a(byte[] bArr, String str) throws m70, UnsupportedEncodingException {
        return new String(this.f6894a.f6482d.b(bArr, str), "UTF-8");
    }
}
