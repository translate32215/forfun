package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import c8.c;
import e8.j6;
import e8.m30;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class hx extends nx<r4> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f6907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m30 f6908c;

    public hx(m30 m30, Activity activity) {
        this.f6908c = m30;
        this.f6907b = activity;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.L4(new b(this.f6907b));
    }

    public final /* synthetic */ Object c() {
        m30.b(this.f6907b, "ad_overlay");
        return null;
    }

    public final Object d() throws RemoteException {
        Object s4Var;
        j6 j6Var = (j6) this.f6908c.f15457g;
        Activity activity = this.f6907b;
        j6Var.getClass();
        try {
            IBinder z22 = ((v4) j6Var.b(activity)).z2(new b(activity));
            if (z22 == null) {
                return null;
            }
            IInterface queryLocalInterface = z22.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof r4) {
                s4Var = (r4) queryLocalInterface;
            } else {
                s4Var = new s4(z22);
            }
            return s4Var;
        } catch (RemoteException e10) {
            e.D("Could not create remote AdOverlay.", e10);
            return null;
        } catch (c.a e11) {
            e.D("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
