package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.b9;
import e8.dg;
import e8.fv;
import e8.nu;
import e8.p50;
import e8.w00;
import e8.xg;
import e8.ym;
import e8.zd;
import e8.zf;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jc extends nu<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f7142a;

    /* renamed from: b  reason: collision with root package name */
    public final b9.a f7143b;

    /* renamed from: c  reason: collision with root package name */
    public final fv f7144c;

    /* renamed from: d  reason: collision with root package name */
    public final i9 f7145d;

    /* renamed from: e  reason: collision with root package name */
    public final ym f7146e;

    /* renamed from: f  reason: collision with root package name */
    public final d9 f7147f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f7148g;

    public jc(b8 b8Var, b9.a aVar, fv fvVar, i9 i9Var, ym ymVar, d9 d9Var, ViewGroup viewGroup) {
        this.f7142a = b8Var;
        this.f7143b = aVar;
        this.f7144c = fvVar;
        this.f7145d = i9Var;
        this.f7146e = ymVar;
        this.f7147f = d9Var;
        this.f7148g = viewGroup;
    }

    public final p50<dg> c(w00 w00, Bundle bundle) {
        zd l10 = this.f7142a.l();
        b9.a aVar = this.f7143b;
        aVar.f6003b = w00;
        aVar.f6004c = bundle;
        b9 a10 = aVar.a();
        l10.getClass();
        l10.f17717b = a10;
        i9 i9Var = this.f7145d;
        i9Var.getClass();
        l10.f17716a = i9Var;
        fv fvVar = this.f7144c;
        fvVar.getClass();
        l10.f17718c = fvVar;
        ym ymVar = this.f7146e;
        ymVar.getClass();
        l10.f17721f = ymVar;
        l10.f17719d = new xg(this.f7147f);
        l10.f17720e = new zf(this.f7148g);
        return l10.b().c().b();
    }
}
