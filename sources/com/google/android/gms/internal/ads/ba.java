package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.b9;
import e8.ab0;
import e8.bh;
import e8.dg;
import e8.fv;
import e8.jc0;
import e8.ta0;
import e8.xg;
import e8.ym;
import e8.zd;
import e8.zf;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ba implements ta0<bh<dg>> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<b8> f6007a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<b9.a> f6008b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<i9> f6009c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<ym> f6010d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<d9> f6011e;

    public ba(ab0<b8> ab0, ab0<b9.a> ab02, ab0<i9> ab03, ab0<ym> ab04, ab0<d9> ab05) {
        this.f6007a = ab0;
        this.f6008b = ab02;
        this.f6009c = ab03;
        this.f6010d = ab04;
        this.f6011e = ab05;
    }

    public final Object get() {
        i9 i9Var = this.f6009c.get();
        ym ymVar = this.f6010d.get();
        zd l10 = this.f6007a.get().l();
        b9 a10 = this.f6008b.get().a();
        l10.getClass();
        l10.f17717b = a10;
        i9Var.getClass();
        l10.f17716a = i9Var;
        ymVar.getClass();
        l10.f17721f = ymVar;
        l10.f17718c = new fv((n) null);
        l10.f17719d = new xg(this.f6011e.get());
        l10.f17720e = new zf((ViewGroup) null);
        bh bhVar = ((g8) l10.b()).f6608x1.get();
        jc0.b(bhVar, "Cannot return null from a non-@Nullable @Provides method");
        return bhVar;
    }
}
