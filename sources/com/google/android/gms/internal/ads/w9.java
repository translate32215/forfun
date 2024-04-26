package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.pv;
import e8.ab0;
import e8.j8;
import e8.ta0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w9 implements ta0<x9> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<j8> f8432a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f8433b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<p6> f8434c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<View> f8435d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<pv.a> f8436e;

    public w9(ab0<j8> ab0, ab0<Context> ab02, ab0<p6> ab03, ab0<View> ab04, ab0<pv.a> ab05) {
        this.f8432a = ab0;
        this.f8433b = ab02;
        this.f8434c = ab03;
        this.f8435d = ab04;
        this.f8436e = ab05;
    }

    public static w9 a(ab0<j8> ab0, ab0<Context> ab02, ab0<p6> ab03, ab0<View> ab04, ab0<pv.a> ab05) {
        return new w9(ab0, ab02, ab03, ab04, ab05);
    }

    public final /* synthetic */ Object get() {
        return new x9(this.f8432a.get(), this.f8433b.get(), this.f8434c.get(), this.f8435d.get(), this.f8436e.get());
    }
}
