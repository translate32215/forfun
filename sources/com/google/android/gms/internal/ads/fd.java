package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fd implements e9 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<cz> f6459a = new AtomicReference<>();

    public final void l(fx fxVar) {
        cz czVar = this.f6459a.get();
        if (czVar != null) {
            try {
                czVar.I1(fxVar);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }
}
