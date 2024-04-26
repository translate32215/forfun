package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.pv;
import e8.ab0;
import e8.f9;
import e8.ta0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u9 implements ta0<v9> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<Context> f8226a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<t7> f8227b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<qe> f8228c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<f9> f8229d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<pv.a> f8230e;

    public u9(ab0<Context> ab0, ab0<t7> ab02, ab0<qe> ab03, ab0<f9> ab04, ab0<pv.a> ab05) {
        this.f8226a = ab0;
        this.f8227b = ab02;
        this.f8228c = ab03;
        this.f8229d = ab04;
        this.f8230e = ab05;
    }

    public static u9 a(ab0<Context> ab0, ab0<t7> ab02, ab0<qe> ab03, ab0<f9> ab04, ab0<pv.a> ab05) {
        return new u9(ab0, ab02, ab03, ab04, ab05);
    }

    public final /* synthetic */ Object get() {
        return new v9(this.f8226a.get(), this.f8227b.get(), this.f8228c.get(), this.f8229d.get(), this.f8230e.get());
    }
}
