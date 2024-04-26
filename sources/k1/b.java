package k1;

import android.support.v4.media.a;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import ud.k;

/* compiled from: InitializerViewModelFactory.kt */
public final class b implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public final ViewModelInitializer<?>[] f19875a;

    public b(ViewModelInitializer<?>... viewModelInitializerArr) {
        k.f(viewModelInitializerArr, "initializers");
        this.f19875a = viewModelInitializerArr;
    }

    public /* synthetic */ q0 a(Class cls) {
        return t0.a(this, cls);
    }

    public <T extends q0> T b(Class<T> cls, a aVar) {
        T t10 = null;
        for (e eVar : this.f19875a) {
            if (k.a(eVar.f19877a, cls)) {
                T c10 = eVar.f19878b.c(aVar);
                t10 = c10 instanceof q0 ? (q0) c10 : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        StringBuilder a10 = a.a("No initializer set for given class ");
        a10.append(cls.getName());
        throw new IllegalArgumentException(a10.toString());
    }
}
