package dev.pankaj.ytvlib.ui.base;

import ae.g;
import android.view.View;
import androidx.fragment.app.n0;
import androidx.fragment.app.p;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import e2.a;
import r1.c;
import td.l;
import ud.k;

/* compiled from: FragmentViewBindingDelegate.kt */
public final class FragmentViewBindingDelegate<T extends a> implements wd.a<p, T> {

    /* renamed from: a  reason: collision with root package name */
    public final p f13483a;

    /* renamed from: b  reason: collision with root package name */
    public final l<View, T> f13484b;

    /* renamed from: c  reason: collision with root package name */
    public T f13485c;

    public FragmentViewBindingDelegate(p pVar, l<? super View, ? extends T> lVar) {
        this.f13483a = pVar;
        this.f13484b = lVar;
        pVar.f1793e0.a(new j(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FragmentViewBindingDelegate<T> f13486a;

            {
                this.f13486a = r1;
            }

            public /* synthetic */ void a(t tVar) {
                i.d(this, tVar);
            }

            public /* synthetic */ void b(t tVar) {
                i.b(this, tVar);
            }

            public void c(t tVar) {
                k.f(tVar, "owner");
                FragmentViewBindingDelegate<T> fragmentViewBindingDelegate = this.f13486a;
                p pVar = fragmentViewBindingDelegate.f13483a;
                pVar.f1797g0.f(pVar, new c((FragmentViewBindingDelegate) fragmentViewBindingDelegate));
            }

            public /* synthetic */ void e(t tVar) {
                i.c(this, tVar);
            }

            public /* synthetic */ void f(t tVar) {
                i.e(this, tVar);
            }

            public /* synthetic */ void g(t tVar) {
                i.f(this, tVar);
            }
        });
    }

    /* renamed from: b */
    public T a(p pVar, g<?> gVar) {
        k.f(pVar, "thisRef");
        k.f(gVar, "property");
        T t10 = this.f13485c;
        if (t10 != null) {
            return t10;
        }
        n0 n0Var = (n0) this.f13483a.F();
        n0Var.b();
        u uVar = n0Var.f1762c;
        k.e(uVar, "fragment.viewLifecycleOwner.lifecycle");
        if (uVar.f2726b.compareTo(o.c.INITIALIZED) >= 0) {
            T t11 = (a) this.f13484b.c(pVar.i0());
            this.f13485c = t11;
            return t11;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }
}
