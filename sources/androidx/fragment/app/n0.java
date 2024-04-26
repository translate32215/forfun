package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.j0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import k1.d;
import w1.a;
import w1.b;
import w1.c;

/* compiled from: FragmentViewLifecycleOwner */
public class n0 implements n, c, v0 {

    /* renamed from: a  reason: collision with root package name */
    public final p f1760a;

    /* renamed from: b  reason: collision with root package name */
    public final u0 f1761b;

    /* renamed from: c  reason: collision with root package name */
    public u f1762c = null;

    /* renamed from: d  reason: collision with root package name */
    public b f1763d = null;

    public n0(p pVar, u0 u0Var) {
        this.f1760a = pVar;
        this.f1761b = u0Var;
    }

    public void a(o.b bVar) {
        u uVar = this.f1762c;
        uVar.e("handleLifecycleEvent");
        uVar.h(bVar.a());
    }

    public void b() {
        if (this.f1762c == null) {
            this.f1762c = new u(this);
            b a10 = b.a(this);
            this.f1763d = a10;
            a10.b();
            j0.b(this);
        }
    }

    public o c() {
        b();
        return this.f1762c;
    }

    public a e() {
        b();
        return this.f1763d.f26867b;
    }

    public k1.a l() {
        Application application;
        Context applicationContext = this.f1760a.h0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        d dVar = new d();
        if (application != null) {
            s0.a.C0032a aVar = s0.a.f2718d;
            dVar.b(s0.a.C0032a.C0033a.f2721a, application);
        }
        dVar.b(j0.f2671a, this);
        dVar.b(j0.f2672b, this);
        Bundle bundle = this.f1760a.f1796g;
        if (bundle != null) {
            dVar.b(j0.f2673c, bundle);
        }
        return dVar;
    }

    public u0 v() {
        b();
        return this.f1761b;
    }
}
