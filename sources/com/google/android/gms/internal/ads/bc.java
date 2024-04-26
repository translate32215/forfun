package com.google.android.gms.internal.ads;

import android.content.Context;
import c8.b;
import e8.t;
import e8.ti0;
import e8.um;
import e8.yi;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bc implements t9 {

    /* renamed from: a  reason: collision with root package name */
    public final qe f6012a;

    /* renamed from: b  reason: collision with root package name */
    public final a4 f6013b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6014c;

    /* renamed from: d  reason: collision with root package name */
    public yi f6015d = null;

    public bc(qe qeVar, a4 a4Var, boolean z10) {
        this.f6012a = qeVar;
        this.f6013b = a4Var;
        this.f6014c = z10;
    }

    public final void a(boolean z10, Context context) throws um {
        boolean z11;
        try {
            if (this.f6014c) {
                z11 = this.f6013b.V2(new b(context));
            } else {
                z11 = this.f6013b.q5(new b(context));
            }
            if (!z11) {
                throw new um("Adapter failed to show.");
            } else if (this.f6015d != null) {
                if (!((Boolean) ti0.f16763j.f16769f.a(t.V0)).booleanValue() && this.f6012a.S == 2) {
                    this.f6015d.O();
                }
            }
        } catch (Throwable th) {
            throw new um(th);
        }
    }
}
