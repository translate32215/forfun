package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import c8.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.gj0;
import e8.m30;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class lx extends nx<ry> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7433b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m30 f7434c;

    public lx(m30 m30, Context context) {
        this.f7434c = m30;
        this.f7433b = context;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.I5(new b(this.f7433b), ModuleDescriptor.MODULE_VERSION);
    }

    public final /* synthetic */ Object c() {
        m30.b(this.f7433b, "mobile_ads_settings");
        return new b();
    }

    public final Object d() throws RemoteException {
        Object tyVar;
        gj0 gj0 = (gj0) this.f7434c.f15453c;
        Context context = this.f7433b;
        gj0.getClass();
        try {
            IBinder C0 = ((wy) gj0.b(context)).C0(new b(context), ModuleDescriptor.MODULE_VERSION);
            if (C0 == null) {
                return null;
            }
            IInterface queryLocalInterface = C0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof ry) {
                tyVar = (ry) queryLocalInterface;
            } else {
                tyVar = new ty(C0);
            }
            return tyVar;
        } catch (RemoteException | c.a e10) {
            e.D("Could not get remote MobileAdsSettingManager.", e10);
            return null;
        }
    }
}
