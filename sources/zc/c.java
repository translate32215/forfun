package zc;

import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import kd.d;
import kd.e;
import qc.g;
import qc.m;
import rc.b;
import ud.k;
import ud.l;

/* compiled from: PlayerViewModel.kt */
public final class c extends q0 {

    /* renamed from: d  reason: collision with root package name */
    public final g f28823d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<String> f28824e = new b0<>();

    /* renamed from: f  reason: collision with root package name */
    public final b0<String> f28825f = new b0<>();

    /* renamed from: g  reason: collision with root package name */
    public final d f28826g = e.b(new a(this));

    /* compiled from: PlayerViewModel.kt */
    public static final class a extends l implements td.a<a0<m<b>>> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f28827b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f28827b = cVar;
        }

        public Object d() {
            a0 a0Var = new a0();
            c cVar = this.f28827b;
            b0<String> b0Var = cVar.f28824e;
            a aVar = new a(cVar, 0);
            a0 a0Var2 = new a0();
            a0Var2.m(b0Var, new p0(aVar, a0Var2));
            a0Var.m(a0Var2, new b(cVar, 1));
            b0<String> b0Var2 = cVar.f28825f;
            b bVar = new b(cVar, 0);
            a0 a0Var3 = new a0();
            a0Var3.m(b0Var2, new p0(bVar, a0Var3));
            a0Var.m(a0Var3, new a(cVar, 1));
            return a0Var;
        }
    }

    public c(g gVar) {
        k.f(gVar, "apiService");
        this.f28823d = gVar;
    }
}
