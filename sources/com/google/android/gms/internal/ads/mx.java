package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import c8.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.m30;
import e8.r7;
import e8.s7;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class mx extends nx<r5> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7510b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f7511c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m30 f7512d;

    public mx(m30 m30, Context context, s2 s2Var) {
        this.f7512d = m30;
        this.f7510b = context;
        this.f7511c = s2Var;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.m5(new b(this.f7510b), this.f7511c, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* synthetic */ Object c() {
        m30.b(this.f7510b, "rewarded_video");
        return new c();
    }

    public final Object d() throws RemoteException {
        Object r7Var;
        s7 s7Var = (s7) this.f7512d.f15455e;
        Context context = this.f7510b;
        s2 s2Var = this.f7511c;
        s7Var.getClass();
        try {
            IBinder g12 = ((s5) s7Var.b(context)).g1(new b(context), s2Var, ModuleDescriptor.MODULE_VERSION);
            if (g12 == null) {
                return null;
            }
            IInterface queryLocalInterface = g12.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof r5) {
                r7Var = (r5) queryLocalInterface;
            } else {
                r7Var = new r7(g12);
            }
            return r7Var;
        } catch (RemoteException | c.a e10) {
            e.D("Could not get remote RewardedVideoAd.", e10);
            return null;
        }
    }
}
