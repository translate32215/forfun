package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.d9;
import e8.i6;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ix extends nx<j4> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f7121c;

    public ix(Context context, s2 s2Var) {
        this.f7120b = context;
        this.f7121c = s2Var;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.f0(new b(this.f7120b), this.f7121c, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return null;
    }

    public final Object d() throws RemoteException {
        m4 m4Var;
        b bVar = new b(this.f7120b);
        try {
            try {
                IBinder c10 = DynamiteModule.d(this.f7120b, DynamiteModule.f5902b, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i10 = i6.f14993a;
                if (c10 == null) {
                    m4Var = null;
                } else {
                    IInterface queryLocalInterface = c10.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    if (queryLocalInterface instanceof m4) {
                        m4Var = (m4) queryLocalInterface;
                    } else {
                        m4Var = new n4(c10);
                    }
                }
                return m4Var.f0(bVar, this.f7121c, ModuleDescriptor.MODULE_VERSION);
            } catch (Exception e10) {
                throw new d9(e10);
            } catch (Exception e11) {
                throw new d9(e11);
            }
        } catch (RemoteException | d9 | NullPointerException unused) {
            return null;
        }
    }
}
