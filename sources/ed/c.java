package ed;

import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import cd.a;
import ud.k;

/* compiled from: CouponViewModelFactory.kt */
public final class c extends s0.c {

    /* renamed from: c  reason: collision with root package name */
    public final a f17839c;

    public c(a aVar) {
        k.f(aVar, "apiService");
        this.f17839c = aVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        k.f(cls, "modelClass");
        return new b(this.f17839c);
    }
}
