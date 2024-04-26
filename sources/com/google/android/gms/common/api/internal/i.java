package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import s8.j;
import u7.e;
import u7.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class i extends g<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final e<?> f5797c;

    public i(e<?> eVar, j<Boolean> jVar) {
        super(4, jVar);
        this.f5797c = eVar;
    }

    public final /* bridge */ /* synthetic */ void d(h hVar, boolean z10) {
    }

    public final boolean f(e<?> eVar) {
        if (eVar.f5784f.get(this.f5797c) == null) {
            return false;
        }
        throw null;
    }

    public final Feature[] g(e<?> eVar) {
        if (eVar.f5784f.get(this.f5797c) == null) {
            return null;
        }
        throw null;
    }

    public final void h(e<?> eVar) throws RemoteException {
        if (eVar.f5784f.remove(this.f5797c) == null) {
            this.f5793b.b(Boolean.FALSE);
            return;
        }
        throw null;
    }
}
