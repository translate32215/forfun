package q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.p;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.g;
import ld.l;
import ld.t;
import o0.c0;
import o1.d0;
import o1.h;
import o1.r;
import o1.x;
import ud.k;

@d0.b("fragment")
/* compiled from: FragmentNavigator.kt */
public class d extends d0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f24026c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f24027d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24028e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<String> f24029f = new LinkedHashSet();

    /* compiled from: FragmentNavigator.kt */
    public static class a extends r {

        /* renamed from: s  reason: collision with root package name */
        public String f24030s;

        public a(d0<? extends a> d0Var) {
            super(d0Var);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a) || !super.equals(obj) || !k.a(this.f24030s, ((a) obj).f24030s)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f24030s;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f24030s;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            k.e(sb3, "sb.toString()");
            return sb3;
        }

        public void y(Context context, AttributeSet attributeSet) {
            k.f(context, "context");
            k.f(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.f24032b);
            k.e(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                k.f(string, "className");
                this.f24030s = string;
            }
            obtainAttributes.recycle();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    public static final class b implements d0.a {
    }

    public d(Context context, a0 a0Var, int i10) {
        this.f24026c = context;
        this.f24027d = a0Var;
        this.f24028e = i10;
    }

    public r a() {
        return new a(this);
    }

    public void d(List<h> list, x xVar, d0.a aVar) {
        k.f(list, "entries");
        if (this.f24027d.S()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for (h next : list) {
            boolean isEmpty = b().f22685e.getValue().isEmpty();
            if (xVar != null && !isEmpty && xVar.f22827b && this.f24029f.remove(next.f22700f)) {
                a0 a0Var = this.f24027d;
                a0Var.y(new a0.p(next.f22700f), false);
                b().d(next);
            } else {
                i0 k10 = k(next, xVar);
                if (!isEmpty) {
                    k10.d(next.f22700f);
                }
                if (aVar instanceof b) {
                    ((b) aVar).getClass();
                    for (Map.Entry entry : t.e((Map) null).entrySet()) {
                        View view = (View) entry.getKey();
                        String str = (String) entry.getValue();
                        if ((j0.f1732a == null && j0.f1733b == null) ? false : true) {
                            String p10 = c0.p(view);
                            if (p10 != null) {
                                if (k10.f1716n == null) {
                                    k10.f1716n = new ArrayList<>();
                                    k10.f1717o = new ArrayList<>();
                                } else if (k10.f1717o.contains(str)) {
                                    throw new IllegalArgumentException(q.b.a("A shared element with the target name '", str, "' has already been added to the transaction."));
                                } else if (k10.f1716n.contains(p10)) {
                                    throw new IllegalArgumentException(q.b.a("A shared element with the source name '", p10, "' has already been added to the transaction."));
                                }
                                k10.f1716n.add(p10);
                                k10.f1717o.add(str);
                            } else {
                                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                            }
                        }
                    }
                }
                k10.e();
                b().d(next);
            }
        }
    }

    public void f(h hVar) {
        if (this.f24027d.S()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        i0 k10 = k(hVar, (x) null);
        if (b().f22685e.getValue().size() > 1) {
            a0 a0Var = this.f24027d;
            a0Var.y(new a0.o(hVar.f22700f, -1, 1), false);
            k10.d(hVar.f22700f);
        }
        k10.e();
        b().b(hVar);
    }

    public void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f24029f.clear();
            ld.k.g(this.f24029f, stringArrayList);
        }
    }

    public Bundle h() {
        if (this.f24029f.isEmpty()) {
            return null;
        }
        return p.b(new g("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f24029f)));
    }

    public void i(h hVar, boolean z10) {
        k.f(hVar, "popUpTo");
        if (this.f24027d.S()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List value = b().f22685e.getValue();
            h hVar2 = (h) l.k(value);
            for (h hVar3 : l.s(value.subList(value.indexOf(hVar), value.size()))) {
                if (k.a(hVar3, hVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + hVar3);
                } else {
                    a0 a0Var = this.f24027d;
                    a0Var.y(new a0.q(hVar3.f22700f), false);
                    this.f24029f.add(hVar3.f22700f);
                }
            }
        } else {
            a0 a0Var2 = this.f24027d;
            a0Var2.y(new a0.o(hVar.f22700f, -1, 1), false);
        }
        b().c(hVar, z10);
    }

    public final i0 k(h hVar, x xVar) {
        Bundle bundle = hVar.f22697c;
        String str = ((a) hVar.f22696b).f24030s;
        if (str != null) {
            int i10 = 0;
            if (str.charAt(0) == '.') {
                str = this.f24026c.getPackageName() + str;
            }
            androidx.fragment.app.p a10 = this.f24027d.J().a(this.f24026c.getClassLoader(), str);
            k.e(a10, "fragmentManager.fragment…t.classLoader, className)");
            a10.l0(bundle);
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(this.f24027d);
            int i11 = xVar != null ? xVar.f22831f : -1;
            int i12 = xVar != null ? xVar.f22832g : -1;
            int i13 = xVar != null ? xVar.f22833h : -1;
            int i14 = xVar != null ? xVar.f22834i : -1;
            if (!(i11 == -1 && i12 == -1 && i13 == -1 && i14 == -1)) {
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i13 == -1) {
                    i13 = 0;
                }
                if (i14 != -1) {
                    i10 = i14;
                }
                bVar.f1704b = i11;
                bVar.f1705c = i12;
                bVar.f1706d = i13;
                bVar.f1707e = i10;
            }
            bVar.h(this.f24028e, a10);
            bVar.p(a10);
            bVar.f1718p = true;
            return bVar;
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }
}
