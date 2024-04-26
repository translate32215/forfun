package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
public final class d0 extends q0 {

    /* renamed from: j  reason: collision with root package name */
    public static final s0.b f1647j = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, p> f1648d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, d0> f1649e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, u0> f1650f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1651g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1652h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1653i = false;

    /* compiled from: FragmentManagerViewModel */
    public class a implements s0.b {
        public <T extends q0> T a(Class<T> cls) {
            return new d0(true);
        }

        public /* synthetic */ q0 b(Class cls, k1.a aVar) {
            return t0.b(this, cls, aVar);
        }
    }

    public d0(boolean z10) {
        this.f1651g = z10;
    }

    public void d() {
        if (a0.N(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1652h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f1648d.equals(d0Var.f1648d) || !this.f1649e.equals(d0Var.f1649e) || !this.f1650f.equals(d0Var.f1650f)) {
            return false;
        }
        return true;
    }

    public void f(p pVar) {
        if (this.f1653i) {
            if (a0.N(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f1648d.containsKey(pVar.f1794f)) {
            this.f1648d.put(pVar.f1794f, pVar);
            if (a0.N(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + pVar);
            }
        }
    }

    public void g(p pVar) {
        if (a0.N(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pVar);
        }
        h(pVar.f1794f);
    }

    public final void h(String str) {
        d0 d0Var = this.f1649e.get(str);
        if (d0Var != null) {
            d0Var.d();
            this.f1649e.remove(str);
        }
        u0 u0Var = this.f1650f.get(str);
        if (u0Var != null) {
            u0Var.a();
            this.f1650f.remove(str);
        }
    }

    public int hashCode() {
        int hashCode = this.f1649e.hashCode();
        return this.f1650f.hashCode() + ((hashCode + (this.f1648d.hashCode() * 31)) * 31);
    }

    public void i(p pVar) {
        if (!this.f1653i) {
            if ((this.f1648d.remove(pVar.f1794f) != null) && a0.N(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + pVar);
            }
        } else if (a0.N(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean j(p pVar) {
        if (this.f1648d.containsKey(pVar.f1794f) && this.f1651g) {
            return this.f1652h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<p> it = this.f1648d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f1649e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1650f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
