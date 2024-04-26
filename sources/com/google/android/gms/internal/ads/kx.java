package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import c8.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.ei0;
import e8.m30;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class kx extends nx<ay> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7306b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7307c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s2 f7308d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m30 f7309e;

    public kx(m30 m30, Context context, String str, s2 s2Var) {
        this.f7309e = m30;
        this.f7306b = context;
        this.f7307c = str;
        this.f7308d = s2Var;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.M2(new b(this.f7306b), this.f7307c, this.f7308d, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* synthetic */ Object c() {
        m30.b(this.f7306b, "native_ad");
        return new qz();
    }

    public final Object d() throws RemoteException {
        Object cyVar;
        ei0 ei0 = (ei0) this.f7309e.f15452b;
        Context context = this.f7306b;
        String str = this.f7307c;
        s2 s2Var = this.f7308d;
        ei0.getClass();
        try {
            IBinder o52 = ((by) ei0.b(context)).o5(new b(context), str, s2Var, ModuleDescriptor.MODULE_VERSION);
            if (o52 == null) {
                return null;
            }
            IInterface queryLocalInterface = o52.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof ay) {
                cyVar = (ay) queryLocalInterface;
            } else {
                cyVar = new cy(o52);
            }
            return cyVar;
        } catch (RemoteException | c.a e10) {
            e.D("Could not create remote builder for AdLoader.", e10);
            return null;
        }
    }
}
