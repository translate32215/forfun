package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b;
import s7.a;
import v7.t;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class v extends t {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f5889g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f5890h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f5890h = bVar;
        this.f5889g = iBinder;
    }

    public final void d(a aVar) {
        b.C0083b bVar = this.f5890h.f5837x;
        if (bVar != null) {
            bVar.m(aVar);
        }
        this.f5890h.getClass();
        System.currentTimeMillis();
    }

    public final boolean e() {
        try {
            IBinder iBinder = this.f5889g;
            i.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f5890h.w().equals(interfaceDescriptor)) {
                String w10 = this.f5890h.w();
                Log.w("GmsClient", "service descriptor mismatch: " + w10 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o10 = this.f5890h.o(this.f5889g);
            if (o10 == null || (!b.B(this.f5890h, 2, 4, o10) && !b.B(this.f5890h, 3, 4, o10))) {
                return false;
            }
            b bVar = this.f5890h;
            bVar.B = null;
            b.a aVar = bVar.f5836w;
            if (aVar == null) {
                return true;
            }
            aVar.z0((Bundle) null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
