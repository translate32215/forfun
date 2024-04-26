package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import c8.a;
import e8.kj;
import e8.mr;
import e8.mt;
import e8.t00;
import e8.uu;
import e8.wu;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ac extends x5 implements kj {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public y5 f5946a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public c f5947b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public mr f5948c;

    public final synchronized void E0(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.E0(aVar);
        }
    }

    public final synchronized void F5(a aVar, a6 a6Var) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.F5(aVar, a6Var);
        }
    }

    public final synchronized void K1(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.K1(aVar);
        }
    }

    public final synchronized void M4(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.M4(aVar);
        }
    }

    public final synchronized void O3(a aVar, int i10) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.O3(aVar, i10);
        }
        mr mrVar = this.f5948c;
        if (mrVar != null) {
            String valueOf = String.valueOf(((mt) mrVar.f15538c).f15549a);
            e.K(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    public final synchronized void U3(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.U3(aVar);
        }
        mr mrVar = this.f5948c;
        if (mrVar != null) {
            ((uu) mrVar.f15539d).f16996c.execute(new wu(mrVar, (t00) mrVar.f15536a, (qe) mrVar.f15537b, (mt) mrVar.f15538c));
        }
    }

    public final synchronized void b0(Bundle bundle) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.b0(bundle);
        }
    }

    public final synchronized void d5(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.d5(aVar);
        }
        c cVar = this.f5947b;
        if (cVar != null) {
            synchronized (cVar) {
                ((d7) cVar.f27857b).b(null);
            }
        }
    }

    public final synchronized void f6(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.f6(aVar);
        }
    }

    public final synchronized void g2(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.g2(aVar);
        }
    }

    public final synchronized void j5(a aVar, int i10) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.j5(aVar, i10);
        }
        c cVar = this.f5947b;
        if (cVar != null) {
            cVar.b(i10);
        }
    }

    public final synchronized void m(c cVar) {
        this.f5947b = cVar;
    }

    public final synchronized void z3(a aVar) throws RemoteException {
        y5 y5Var = this.f5946a;
        if (y5Var != null) {
            y5Var.z3(aVar);
        }
    }
}
