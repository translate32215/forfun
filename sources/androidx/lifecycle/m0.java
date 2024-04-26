package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.s0;
import java.lang.reflect.Constructor;
import ud.k;
import w1.a;
import w1.c;

/* compiled from: SavedStateViewModelFactory.kt */
public final class m0 extends s0.d implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public Application f2681a;

    /* renamed from: b  reason: collision with root package name */
    public final s0.b f2682b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2683c;

    /* renamed from: d  reason: collision with root package name */
    public o f2684d;

    /* renamed from: e  reason: collision with root package name */
    public a f2685e;

    @SuppressLint({"LambdaLast"})
    public m0(Application application, c cVar, Bundle bundle) {
        s0.a aVar;
        k.f(cVar, "owner");
        this.f2685e = cVar.e();
        this.f2684d = cVar.c();
        this.f2683c = bundle;
        this.f2681a = application;
        if (application != null) {
            s0.a.C0032a aVar2 = s0.a.f2718d;
            if (s0.a.f2719e == null) {
                s0.a.f2719e = new s0.a(application);
            }
            aVar = s0.a.f2719e;
            k.c(aVar);
        } else {
            aVar = new s0.a();
        }
        this.f2682b = aVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        k.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q0> T b(Class<T> cls, k1.a aVar) {
        Constructor<T> constructor;
        s0.c.a aVar2 = s0.c.f2722a;
        String str = (String) aVar.a(s0.c.a.C0034a.f2724a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(j0.f2671a) != null && aVar.a(j0.f2672b) != null) {
            s0.a.C0032a aVar3 = s0.a.f2718d;
            Application application = (Application) aVar.a(s0.a.C0032a.C0033a.f2721a);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = n0.a(cls, n0.f2687b);
            } else {
                constructor = n0.a(cls, n0.f2686a);
            }
            if (constructor == null) {
                return this.f2682b.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return n0.b(cls, constructor, j0.a(aVar));
            }
            return n0.b(cls, constructor, application, j0.a(aVar));
        } else if (this.f2684d != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(q0 q0Var) {
        o oVar = this.f2684d;
        if (oVar != null) {
            LegacySavedStateHandleController.a(q0Var, this.f2685e, oVar);
        }
    }

    public final <T extends q0> T d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t10;
        Application application;
        if (this.f2684d != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f2681a == null) {
                constructor = n0.a(cls, n0.f2687b);
            } else {
                constructor = n0.a(cls, n0.f2686a);
            }
            if (constructor != null) {
                a aVar = this.f2685e;
                o oVar = this.f2684d;
                Bundle bundle = this.f2683c;
                i0 a10 = i0.f2664f.a(aVar.a(str), bundle);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a10);
                savedStateHandleController.h(aVar, oVar);
                LegacySavedStateHandleController.b(aVar, oVar);
                if (!isAssignableFrom || (application = this.f2681a) == null) {
                    t10 = n0.b(cls, constructor, a10);
                } else {
                    t10 = n0.b(cls, constructor, application, a10);
                }
                t10.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                return t10;
            } else if (this.f2681a != null) {
                return this.f2682b.a(cls);
            } else {
                s0.c.a aVar2 = s0.c.f2722a;
                if (s0.c.f2723b == null) {
                    s0.c.f2723b = new s0.c();
                }
                s0.c cVar = s0.c.f2723b;
                k.c(cVar);
                return cVar.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
