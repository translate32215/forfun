package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class j3 extends x0 {

    /* renamed from: e  reason: collision with root package name */
    public final e f10583e;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n1 f10584a;

        public a(n1 n1Var) {
            this.f10584a = n1Var;
        }

        public void run() {
            this.f10584a.c();
            j3.this.f12781b.a(this.f10584a.b());
        }
    }

    public j3(Context context, e eVar, v7 v7Var) {
        super(context, v7Var);
        this.f10583e = eVar;
    }

    public void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f12393k.g().c());
            n1 n1Var = new n1(this.f12780a, this.f12781b);
            this.f12782c.postDelayed(new a(n1Var), millis);
            n1Var.a(b());
        } catch (Throwable th) {
            i4.a(th);
            this.f12781b.a((Object) null);
        }
    }

    public final boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = currentTimeMillis - this.f10583e.getLong("lastBtDiscoveringTime", 0) >= ((long) MetaData.f12393k.g().a()) * 60000;
        if (z10) {
            e.a a10 = this.f10583e.edit();
            a10.a("lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
            a10.f12335a.putLong("lastBtDiscoveringTime", currentTimeMillis);
            a10.apply();
        }
        return z10;
    }
}
