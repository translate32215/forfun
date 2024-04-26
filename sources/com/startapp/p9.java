package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class p9 extends z7<String> implements v7 {

    /* renamed from: j  reason: collision with root package name */
    public final e2 f11578j;

    /* renamed from: k  reason: collision with root package name */
    public final d3<SensorsConfig> f11579k;

    public p9(Context context, e eVar, e2 e2Var, r3 r3Var, d3<SensorsConfig> d3Var) {
        super(context, eVar, r3Var, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        this.f11578j = e2Var;
        this.f11579k = d3Var;
    }

    public Object a(String str) {
        return str;
    }

    public void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }

    public /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    public long d() {
        SensorsConfig call = this.f11579k.call();
        if (call != null) {
            return call.h();
        }
        return 0;
    }

    public boolean f() {
        SensorsConfig call;
        if (!this.f11578j.c() || (call = this.f11579k.call()) == null || !call.l()) {
            return false;
        }
        return true;
    }

    public void g() {
        Context context = this.f10529a;
        ComponentLocator.a(context).j().execute(new p3(context, this).f12783d);
    }
}
