package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import java.util.ArrayList;
import java.util.Arrays;
import k1.a;
import k1.e;
import ud.k;
import ud.l;
import ud.v;
import w1.a;

/* compiled from: SavedStateHandleSupport.kt */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<w1.c> f2671a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<v0> f2672b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f2673c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<w1.c> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<v0> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class d extends l implements td.l<k1.a, l0> {

        /* renamed from: b  reason: collision with root package name */
        public static final d f2674b = new d();

        public d() {
            super(1);
        }

        public Object c(Object obj) {
            k.f((k1.a) obj, "$this$initializer");
            return new l0();
        }
    }

    public static final i0 a(k1.a aVar) {
        w1.c cVar = (w1.c) aVar.a(f2671a);
        if (cVar != null) {
            v0 v0Var = (v0) aVar.a(f2672b);
            if (v0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f2673c);
                s0.c.a aVar2 = s0.c.f2722a;
                String str = (String) aVar.a(s0.c.a.C0034a.f2724a);
                if (str != null) {
                    a.b b10 = cVar.e().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    k0 k0Var = b10 instanceof k0 ? (k0) b10 : null;
                    if (k0Var != null) {
                        l0 c10 = c(v0Var);
                        i0 i0Var = c10.f2680d.get(str);
                        if (i0Var != null) {
                            return i0Var;
                        }
                        i0.a aVar3 = i0.f2664f;
                        k0Var.b();
                        Bundle bundle2 = k0Var.f2677c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = k0Var.f2677c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = k0Var.f2677c;
                        boolean z10 = true;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                            z10 = false;
                        }
                        if (z10) {
                            k0Var.f2677c = null;
                        }
                        i0 a10 = aVar3.a(bundle3, bundle);
                        c10.f2680d.put(str, a10);
                        return a10;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends w1.c & v0> void b(T t10) {
        k.f(t10, "<this>");
        o.c b10 = t10.c().b();
        k.e(b10, "lifecycle.currentState");
        if (!(b10 == o.c.INITIALIZED || b10 == o.c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t10.e().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            k0 k0Var = new k0(t10.e(), (v0) t10);
            t10.e().d("androidx.lifecycle.internal.SavedStateHandlesProvider", k0Var);
            t10.c().a(new SavedStateHandleAttacher(k0Var));
        }
    }

    public static final l0 c(v0 v0Var) {
        Class cls = l0.class;
        k.f(v0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        d dVar = d.f2674b;
        ae.b a10 = v.a(cls);
        k.f(a10, "clazz");
        k.f(dVar, "initializer");
        arrayList.add(new e(sd.a.a(a10), dVar));
        Object[] array = arrayList.toArray(new e[0]);
        if (array != null) {
            e[] eVarArr = (e[]) array;
            return (l0) new s0(v0Var, new k1.b((e[]) Arrays.copyOf(eVarArr, eVarArr.length))).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
