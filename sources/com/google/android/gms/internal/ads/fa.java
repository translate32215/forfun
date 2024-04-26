package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fa extends kz {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6453a = new Object();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public hz f6454b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final j3 f6455c;

    public fa(@Nullable hz hzVar, @Nullable j3 j3Var) {
        this.f6454b = hzVar;
        this.f6455c = j3Var;
    }

    public final float H0() throws RemoteException {
        j3 j3Var = this.f6455c;
        if (j3Var != null) {
            return j3Var.d3();
        }
        return 0.0f;
    }

    public final mz R1() throws RemoteException {
        synchronized (this.f6453a) {
            hz hzVar = this.f6454b;
            if (hzVar == null) {
                return null;
            }
            mz R1 = hzVar.R1();
            return R1;
        }
    }

    public final int W() throws RemoteException {
        throw new RemoteException();
    }

    public final void X3(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    public final void g() throws RemoteException {
        throw new RemoteException();
    }

    public final void k0() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean k3() throws RemoteException {
        throw new RemoteException();
    }

    public final float n0() throws RemoteException {
        j3 j3Var = this.f6455c;
        if (j3Var != null) {
            return j3Var.K3();
        }
        return 0.0f;
    }

    public final boolean p1() throws RemoteException {
        throw new RemoteException();
    }

    public final float s1() throws RemoteException {
        throw new RemoteException();
    }

    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean u2() throws RemoteException {
        throw new RemoteException();
    }

    public final void x3(mz mzVar) throws RemoteException {
        synchronized (this.f6453a) {
            hz hzVar = this.f6454b;
            if (hzVar != null) {
                hzVar.x3(mzVar);
            }
        }
    }
}
