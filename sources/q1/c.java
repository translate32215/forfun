package q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ld.l;
import o1.b;
import o1.d0;
import o1.f0;
import o1.h;
import o1.x;
import ud.k;

@d0.b("dialog")
/* compiled from: DialogFragmentNavigator.kt */
public final class c extends d0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f24021c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f24022d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f24023e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final r f24024f = new b(this);

    /* compiled from: DialogFragmentNavigator.kt */
    public static class a extends o1.r implements b {

        /* renamed from: s  reason: collision with root package name */
        public String f24025s;

        public a(d0<? extends a> d0Var) {
            super(d0Var);
        }

        public final String A() {
            String str = this.f24025s;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            } else if (str != null) {
                return str;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a) || !super.equals(obj) || !k.a(this.f24025s, ((a) obj).f24025s)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f24025s;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public void y(Context context, AttributeSet attributeSet) {
            k.f(context, "context");
            k.f(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.f24031a);
            k.e(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                k.f(string, "className");
                this.f24025s = string;
            }
            obtainAttributes.recycle();
        }
    }

    public c(Context context, a0 a0Var) {
        this.f24021c = context;
        this.f24022d = a0Var;
    }

    public o1.r a() {
        return new a(this);
    }

    public void d(List<h> list, x xVar, d0.a aVar) {
        k.f(list, "entries");
        if (this.f24022d.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for (h next : list) {
            a aVar2 = (a) next.f22696b;
            String A = aVar2.A();
            if (A.charAt(0) == '.') {
                A = this.f24021c.getPackageName() + A;
            }
            p a10 = this.f24022d.J().a(this.f24021c.getClassLoader(), A);
            k.e(a10, "fragmentManager.fragment…ader, className\n        )");
            if (o.class.isAssignableFrom(a10.getClass())) {
                o oVar = (o) a10;
                oVar.l0(next.f22697c);
                oVar.f1793e0.a(this.f24024f);
                oVar.w0(this.f24022d, next.f22700f);
                b().d(next);
            } else {
                StringBuilder a11 = android.support.v4.media.a.a("Dialog destination ");
                a11.append(aVar2.A());
                a11.append(" is not an instance of DialogFragment");
                throw new IllegalArgumentException(a11.toString().toString());
            }
        }
    }

    public void e(f0 f0Var) {
        u uVar;
        this.f22667a = f0Var;
        this.f22668b = true;
        for (h hVar : f0Var.f22685e.getValue()) {
            o oVar = (o) this.f24022d.G(hVar.f22700f);
            if (oVar == null || (uVar = oVar.f1793e0) == null) {
                this.f24023e.add(hVar.f22700f);
            } else {
                uVar.a(this.f24024f);
            }
        }
        a0 a0Var = this.f24022d;
        a0Var.f1591o.add(new a(this));
    }

    public void i(h hVar, boolean z10) {
        k.f(hVar, "popUpTo");
        if (this.f24022d.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List value = b().f22685e.getValue();
        for (h hVar2 : l.s(value.subList(value.indexOf(hVar), value.size()))) {
            p G = this.f24022d.G(hVar2.f22700f);
            if (G != null) {
                G.f1793e0.c(this.f24024f);
                ((o) G).r0();
            }
        }
        b().c(hVar, z10);
    }
}
