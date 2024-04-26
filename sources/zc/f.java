package zc;

import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import qc.g;
import ud.k;

/* compiled from: PlayerViewModelFactory.kt */
public final class f extends s0.c {

    /* renamed from: c  reason: collision with root package name */
    public final g f28838c;

    public f(g gVar) {
        k.f(gVar, "apiService");
        this.f28838c = gVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        k.f(cls, "modelClass");
        return new c(this.f28838c);
    }
}
