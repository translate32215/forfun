package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e8.wh0;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gd implements wh0 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public ox f6637a;

    public final synchronized void n() {
        ox oxVar = this.f6637a;
        if (oxVar != null) {
            try {
                oxVar.n();
            } catch (RemoteException e10) {
                e.D("Remote Exception at onAdClicked.", e10);
            }
        }
    }
}
