package gd;

import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import cd.a;
import ud.k;

/* compiled from: LiveTvViewModelFactory.kt */
public final class b extends s0.c {

    /* renamed from: c  reason: collision with root package name */
    public final a f18633c;

    public b(a aVar) {
        k.f(aVar, "apiService");
        this.f18633c = aVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        k.f(cls, "modelClass");
        return new a(this.f18633c);
    }
}
