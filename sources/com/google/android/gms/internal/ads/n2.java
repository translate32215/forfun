package com.google.android.gms.internal.ads;

import e8.p4;
import e8.p50;
import javax.annotation.ParametersAreNonnullByDefault;
import n2.g;
import t1.c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n2<I, O> implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final k2<O> f7513a;

    /* renamed from: b  reason: collision with root package name */
    public final j2<I> f7514b;

    /* renamed from: c  reason: collision with root package name */
    public final h2 f7515c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7516d;

    public n2(h2 h2Var, String str, j2<I> j2Var, k2<O> k2Var) {
        this.f7515c = h2Var;
        this.f7516d = str;
        this.f7514b = j2Var;
        this.f7513a = k2Var;
    }

    public final p50<O> a(I i10) throws Exception {
        return b(i10);
    }

    public final p50<O> b(I i10) {
        d7 d7Var = new d7();
        p4 b10 = this.f7515c.b();
        b10.j(new g(this, b10, (Object) i10, d7Var), new c(d7Var, b10));
        return d7Var;
    }
}
