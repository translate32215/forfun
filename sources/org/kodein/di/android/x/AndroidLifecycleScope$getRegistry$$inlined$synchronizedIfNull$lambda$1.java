package org.kodein.di.android.x;

import androidx.lifecycle.d0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import p000if.a;

/* compiled from: scopes.kt */
public final class AndroidLifecycleScope$getRegistry$$inlined$synchronizedIfNull$lambda$1 implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jf.s f23729a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f23730b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f23731c;

    @d0(o.b.ON_DESTROY)
    public final void onDestroy() {
        this.f23731c.c().c(this);
        this.f23729a.a();
        this.f23730b.f19407a.remove(this.f23731c);
    }
}
