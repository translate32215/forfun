package com.google.android.gms.internal.ads;

import e8.dj;
import e8.gj;
import e8.ij;
import e8.jj;
import e8.o3;
import e8.p7;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ya implements o3 {

    /* renamed from: a  reason: collision with root package name */
    public final dj f8592a;

    /* renamed from: b  reason: collision with root package name */
    public final a6 f8593b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8594c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8595d;

    public ya(dj djVar, qe qeVar) {
        this.f8592a = djVar;
        this.f8593b = qeVar.f7959l;
        this.f8594c = qeVar.f7957j;
        this.f8595d = qeVar.f7958k;
    }

    @ParametersAreNonnullByDefault
    public final void S(a6 a6Var) {
        int i10;
        String str;
        a6 a6Var2 = this.f8593b;
        if (a6Var2 != null) {
            a6Var = a6Var2;
        }
        if (a6Var != null) {
            str = a6Var.f5941a;
            i10 = a6Var.f5942b;
        } else {
            str = "";
            i10 = 1;
        }
        this.f8592a.I0(new jj(new p7(str, i10), this.f8594c, this.f8595d, 0));
    }

    public final void T() {
        this.f8592a.I0(gj.f14788a);
    }

    public final void y() {
        this.f8592a.I0(ij.f15053a);
    }
}
