package o1;

import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.a;
import ud.k;

/* compiled from: NavControllerViewModel.kt */
public final class m extends q0 implements b0 {

    /* renamed from: e  reason: collision with root package name */
    public static final m f22768e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final s0.b f22769f = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, u0> f22770d = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    public static final class a implements s0.b {
        public <T extends q0> T a(Class<T> cls) {
            k.f(cls, "modelClass");
            return new m();
        }

        public /* synthetic */ q0 b(Class cls, k1.a aVar) {
            return t0.b(this, cls, aVar);
        }
    }

    public static final m f(u0 u0Var) {
        return (m) new s0(u0Var, f22769f, a.C0172a.f19874b).a(m.class);
    }

    public u0 a(String str) {
        k.f(str, "backStackEntryId");
        u0 u0Var = this.f22770d.get(str);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0();
        this.f22770d.put(str, u0Var2);
        return u0Var2;
    }

    public void d() {
        for (u0 a10 : this.f22770d.values()) {
            a10.a();
        }
        this.f22770d.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.f22770d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        k.e(sb3, "sb.toString()");
        return sb3;
    }
}
