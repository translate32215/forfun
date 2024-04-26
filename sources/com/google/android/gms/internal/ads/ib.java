package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pv;
import e8.ab0;
import e8.f9;
import e8.ta0;
import e8.th0;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ib implements ta0<nv> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<Context> f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<String> f7060b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<f9> f7061c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<pv.a> f7062d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<String> f7063e;

    public ib(ab0<Context> ab0, ab0<String> ab02, ab0<f9> ab03, ab0<pv.a> ab04, ab0<String> ab05) {
        this.f7059a = ab0;
        this.f7060b = ab02;
        this.f7061c = ab03;
        this.f7062d = ab04;
        this.f7063e = ab05;
    }

    public static ib a(ab0<Context> ab0, ab0<String> ab02, ab0<f9> ab03, ab0<pv.a> ab04, ab0<String> ab05) {
        return new ib(ab0, ab02, ab03, ab04, ab05);
    }

    public final Object get() {
        String str = this.f7060b.get();
        f9 f9Var = this.f7061c.get();
        pv.a aVar = this.f7062d.get();
        String str2 = this.f7063e.get();
        nv nvVar = new nv(new th0(this.f7059a.get()));
        ow.a B = ow.B();
        int i10 = f9Var.f14545b;
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        ow.y((ow) B.f5970b, i10);
        int i11 = f9Var.f14546c;
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        ow.z((ow) B.f5970b, i11);
        int i12 = f9Var.f14547d ? 0 : 2;
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        ow.A((ow) B.f5970b, i12);
        nvVar.a(new g(aVar, str, (ow) ((aq) B.j()), str2));
        return nvVar;
    }
}
