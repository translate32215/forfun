package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.e1;
import e8.f9;
import e8.t;
import e8.ti0;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6911a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Object f6912b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c  reason: collision with root package name */
    public m2 f6913c;
    @GuardedBy("lockService")

    /* renamed from: d  reason: collision with root package name */
    public m2 f6914d;

    public final m2 a(Context context, f9 f9Var) {
        m2 m2Var;
        synchronized (this.f6912b) {
            if (this.f6914d == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f6914d = new m2(context, f9Var, (String) e1.f14353a.b());
            }
            m2Var = this.f6914d;
        }
        return m2Var;
    }

    public final m2 b(Context context, f9 f9Var) {
        m2 m2Var;
        synchronized (this.f6911a) {
            if (this.f6913c == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f6913c = new m2(context, f9Var, (String) ti0.f16763j.f16769f.a(t.f16542a));
            }
            m2Var = this.f6913c;
        }
        return m2Var;
    }
}
