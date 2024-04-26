package com.google.android.gms.internal.ads;

import android.view.View;
import d7.e;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yc implements e {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public e f8598a;

    public final synchronized void B() {
        e eVar = this.f8598a;
        if (eVar != null) {
            eVar.B();
        }
    }

    public final synchronized void J() {
        e eVar = this.f8598a;
        if (eVar != null) {
            eVar.J();
        }
    }

    public final synchronized void t(View view) {
        e eVar = this.f8598a;
        if (eVar != null) {
            eVar.t(view);
        }
    }
}
