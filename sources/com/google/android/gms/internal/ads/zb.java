package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import e8.kj;
import e8.l5;
import e8.zh0;
import javax.annotation.concurrent.GuardedBy;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zb extends b3 implements kj {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public y2 f8692a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public c f8693b;

    public final synchronized void B1(String str) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.B1(str);
        }
    }

    public final synchronized void C() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.C();
        }
    }

    public final synchronized void E2() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.E2();
        }
    }

    public final synchronized void F() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.F();
        }
    }

    public final synchronized void J() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.J();
        }
    }

    public final synchronized void O() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.O();
        }
    }

    public final synchronized void Q3(int i10) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.Q3(i10);
        }
    }

    public final synchronized void S0(l5 l5Var) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.S0(l5Var);
        }
    }

    public final synchronized void U(zh0 zh0) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.U(zh0);
        }
        c cVar = this.f8693b;
        if (cVar != null) {
            synchronized (cVar) {
                cVar.f27859d = true;
                cVar.d(zh0);
            }
        }
    }

    public final synchronized void V(b6 b6Var) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.V(b6Var);
        }
    }

    public final synchronized void V0() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.V0();
        }
    }

    public final synchronized void X5(zh0 zh0) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.X5(zh0);
        }
    }

    public final synchronized void a(String str, String str2) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.a(str, str2);
        }
    }

    public final synchronized void a0() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.a0();
        }
    }

    public final synchronized void b0(Bundle bundle) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.b0(bundle);
        }
    }

    public final synchronized void c0() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.c0();
        }
    }

    public final synchronized void g3(String str) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.g3(str);
        }
    }

    public final synchronized void h0(int i10) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.h0(i10);
        }
        c cVar = this.f8693b;
        if (cVar != null) {
            cVar.b(i10);
        }
    }

    public final synchronized void l3(a6 a6Var) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.l3(a6Var);
        }
    }

    public final synchronized void m(c cVar) {
        this.f8693b = cVar;
    }

    public final synchronized void n() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.n();
        }
    }

    public final synchronized void t4(int i10, String str) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.t4(i10, str);
        }
        c cVar = this.f8693b;
        if (cVar != null) {
            cVar.c(i10, str);
        }
    }

    public final synchronized void t6(y2 y2Var) {
        this.f8692a = y2Var;
    }

    public final synchronized void u0(l0 l0Var, String str) throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.u0(l0Var, str);
        }
    }

    public final synchronized void v() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.v();
        }
        c cVar = this.f8693b;
        if (cVar != null) {
            synchronized (cVar) {
                ((d7) cVar.f27857b).b(null);
            }
        }
    }

    public final synchronized void y0() throws RemoteException {
        y2 y2Var = this.f8692a;
        if (y2Var != null) {
            y2Var.y0();
        }
    }
}
