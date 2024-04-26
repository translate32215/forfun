package com.google.android.gms.internal.ads;

import android.view.View;
import c8.b;
import e8.b10;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ue {

    /* renamed from: a  reason: collision with root package name */
    public final x2 f8245a;

    public ue(x2 x2Var) {
        this.f8245a = x2Var;
    }

    public final View a() throws b10 {
        try {
            return (View) b.z0(this.f8245a.i5());
        } catch (Throwable th) {
            throw new b10(th);
        }
    }

    public final void b(boolean z10) throws b10 {
        try {
            this.f8245a.N(z10);
        } catch (Throwable th) {
            throw new b10(th);
        }
    }

    public final h4 c() throws b10 {
        try {
            return this.f8245a.r0();
        } catch (Throwable th) {
            throw new b10(th);
        }
    }

    public final h4 d() throws b10 {
        try {
            return this.f8245a.m0();
        } catch (Throwable th) {
            throw new b10(th);
        }
    }
}
