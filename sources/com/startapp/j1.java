package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class j1 extends z7<String> implements v7 {

    /* renamed from: j  reason: collision with root package name */
    public final e f10572j;

    /* renamed from: k  reason: collision with root package name */
    public final e2 f10573k;

    /* renamed from: l  reason: collision with root package name */
    public final d3<BluetoothConfig> f10574l;

    public j1(Context context, e eVar, e eVar2, e2 e2Var, r3 r3Var, d3<BluetoothConfig> d3Var) {
        super(context, eVar2, r3Var, "26787005dc4a1477", "c8ef3e50475fc527");
        this.f10572j = eVar;
        this.f10573k = e2Var;
        this.f10574l = d3Var;
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
        BluetoothConfig call = this.f10574l.call();
        if (call != null) {
            return call.b();
        }
        return 0;
    }

    public boolean f() {
        BluetoothConfig call;
        if (!this.f10573k.c() || (call = this.f10574l.call()) == null || !call.d()) {
            return false;
        }
        return true;
    }

    public void g() {
        if (a0.a(this.f10529a, "android.permission.BLUETOOTH")) {
            Context context = this.f10529a;
            ComponentLocator.a(context).j().execute(new j3(context, this.f10572j, this).f12783d);
        }
    }
}
