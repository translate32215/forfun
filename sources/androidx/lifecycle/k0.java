package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kd.d;
import kd.e;
import ud.k;
import ud.l;
import w1.a;

/* compiled from: SavedStateHandleSupport.kt */
public final class k0 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final w1.a f2675a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2676b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2677c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2678d;

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a extends l implements td.a<l0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v0 f2679b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v0 v0Var) {
            super(0);
            this.f2679b = v0Var;
        }

        public Object d() {
            return j0.c(this.f2679b);
        }
    }

    public k0(w1.a aVar, v0 v0Var) {
        k.f(aVar, "savedStateRegistry");
        this.f2675a = aVar;
        this.f2678d = e.b(new a(v0Var));
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2677c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : ((l0) this.f2678d.getValue()).f2680d.entrySet()) {
            String str = (String) next.getKey();
            Bundle a10 = ((i0) next.getValue()).f2670e.a();
            if (!k.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2676b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f2676b) {
            this.f2677c = this.f2675a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f2676b = true;
            l0 l0Var = (l0) this.f2678d.getValue();
        }
    }
}
