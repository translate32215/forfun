package org.kodein.di.android.x;

import androidx.lifecycle.d0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import p000if.a;

/* compiled from: scopes.kt */
public final class AndroidLifecycleScope$getRegistry$$inlined$synchronizedIfNull$lambda$2 implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jf.s f23732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f23733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f23734c;

    @d0(o.b.ON_DESTROY)
    public final void onDestroy() {
        this.f23734c.c().c(this);
        this.f23732a.a();
        this.f23733b.f19407a.remove(this.f23734c);
    }
}
