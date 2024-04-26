package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.b9;
import e8.fh;
import e8.nu;
import e8.od;
import e8.p50;
import e8.w00;
import e8.ym;
import e8.zf;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gc extends nu<fh> {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f6633a;

    /* renamed from: b  reason: collision with root package name */
    public final ym f6634b;

    /* renamed from: c  reason: collision with root package name */
    public final b9.a f6635c;

    /* renamed from: d  reason: collision with root package name */
    public final i9 f6636d;

    public gc(b8 b8Var, ym ymVar, b9.a aVar, i9 i9Var) {
        this.f6633a = b8Var;
        this.f6634b = ymVar;
        this.f6635c = aVar;
        this.f6636d = i9Var;
    }

    public final p50<fh> c(w00 w00, Bundle bundle) {
        od s10 = this.f6633a.s();
        b9.a aVar = this.f6635c;
        aVar.f6003b = w00;
        aVar.f6004c = bundle;
        b9 a10 = aVar.a();
        s10.getClass();
        s10.f15783b = a10;
        i9 i9Var = this.f6636d;
        i9Var.getClass();
        s10.f15782a = i9Var;
        ym ymVar = this.f6634b;
        ymVar.getClass();
        s10.f15784c = ymVar;
        s10.f15785d = new zf((ViewGroup) null);
        return s10.b().c().b();
    }
}
