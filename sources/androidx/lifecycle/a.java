package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.s0;
import o1.h;
import ud.k;
import w1.c;

/* compiled from: AbstractSavedStateViewModelFactory */
public abstract class a extends s0.d implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public w1.a f2618a;

    /* renamed from: b  reason: collision with root package name */
    public o f2619b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2620c = null;

    @SuppressLint({"LambdaLast"})
    public a(c cVar, Bundle bundle) {
        this.f2618a = cVar.e();
        this.f2619b = cVar.c();
    }

    public final <T extends q0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f2619b != null) {
            return d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public final <T extends q0> T b(Class<T> cls, k1.a aVar) {
        s0.c.a aVar2 = s0.c.f2722a;
        String str = (String) aVar.a(s0.c.a.C0034a.f2724a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f2618a != null) {
            return d(str, cls);
        } else {
            return new h.c(j0.a(aVar));
        }
    }

    public void c(q0 q0Var) {
        w1.a aVar = this.f2618a;
        if (aVar != null) {
            LegacySavedStateHandleController.a(q0Var, aVar, this.f2619b);
        }
    }

    public final <T extends q0> T d(String str, Class<T> cls) {
        w1.a aVar = this.f2618a;
        o oVar = this.f2619b;
        Bundle bundle = this.f2620c;
        i0 a10 = i0.f2664f.a(aVar.a(str), bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a10);
        savedStateHandleController.h(aVar, oVar);
        LegacySavedStateHandleController.b(aVar, oVar);
        k.f(cls, "modelClass");
        T cVar = new h.c(a10);
        cVar.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return cVar;
    }
}
