package com.google.android.gms.internal.ads;

import android.content.Context;
import d7.a;
import e.e;
import e8.ac;
import e8.bp;
import e8.cp;
import e8.dt;
import e8.e30;
import e8.f9;
import e8.h9;
import e8.l;
import e8.oq;
import e8.p50;
import e8.t;
import e8.t20;
import e8.ti0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xa implements Callable<cp> {

    /* renamed from: a  reason: collision with root package name */
    public final a f8516a;

    /* renamed from: b  reason: collision with root package name */
    public final u7 f8517b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f8518c;

    /* renamed from: d  reason: collision with root package name */
    public final oq f8519d;

    /* renamed from: e  reason: collision with root package name */
    public final t20 f8520e;

    /* renamed from: f  reason: collision with root package name */
    public final dt f8521f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f8522g;

    /* renamed from: h  reason: collision with root package name */
    public final tm f8523h;

    /* renamed from: i  reason: collision with root package name */
    public final f9 f8524i;

    /* renamed from: j  reason: collision with root package name */
    public final e30 f8525j;

    public xa(Context context, Executor executor, tm tmVar, f9 f9Var, a aVar, u7 u7Var, dt dtVar, e30 e30, oq oqVar, t20 t20) {
        this.f8518c = context;
        this.f8522g = executor;
        this.f8523h = tmVar;
        this.f8524i = f9Var;
        this.f8516a = aVar;
        this.f8517b = u7Var;
        this.f8521f = dtVar;
        this.f8525j = e30;
        this.f8519d = oqVar;
        this.f8520e = t20;
    }

    public final Object call() throws Exception {
        cp cpVar = new cp(this);
        synchronized (cpVar) {
            Context context = cpVar.f14169c;
            f9 f9Var = cpVar.f14174h;
            l lVar = t.G1;
            p50<t7> i10 = yh.i(yh.j(yh.h(null), new ac(context, cpVar.f14173g, f9Var, cpVar.f14168b, (String) ti0.f16763j.f16769f.a(lVar)), h9.f14885e), new bp(cpVar), cpVar.f14172f);
            cpVar.f14178l = i10;
            e.g(i10, "NativeJavascriptExecutor.initializeEngine");
        }
        return cpVar;
    }
}
