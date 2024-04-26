package hd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.q0;
import dd.b;
import de.y;
import e.j;
import kd.o;
import md.d;
import md.f;
import od.e;
import od.h;
import qc.m;
import s4.g;
import td.p;
import ud.k;

/* compiled from: SearchViewModel.kt */
public final class a extends q0 {

    /* renamed from: d  reason: collision with root package name */
    public final cd.a f18975d;

    /* renamed from: e  reason: collision with root package name */
    public final a0<m<b>> f18976e = new a0<>();

    @e(c = "dev.pankaj.ytvlib.ui.search.viewmodel.SearchViewModel$search$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hd.a$a  reason: collision with other inner class name */
    /* compiled from: SearchViewModel.kt */
    public static final class C0157a extends h implements p<y, d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f18977e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f18978f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0157a(a aVar, String str, d<? super C0157a> dVar) {
            super(2, dVar);
            this.f18977e = aVar;
            this.f18978f = str;
        }

        public final d<o> a(Object obj, d<?> dVar) {
            return new C0157a(this.f18977e, this.f18978f, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            C0157a aVar = new C0157a(this.f18977e, this.f18978f, (d) obj2);
            o oVar = o.f20627a;
            aVar.l(oVar);
            return oVar;
        }

        public final Object l(Object obj) {
            l0.e.l(obj);
            LiveData<qc.e<b>> e10 = this.f18977e.f18975d.e(this.f18978f);
            a aVar = this.f18977e;
            aVar.f18976e.m(e10, new g(aVar, (LiveData) e10));
            return o.f20627a;
        }
    }

    public a(cd.a aVar) {
        k.f(aVar, "apiService");
        this.f18975d = aVar;
    }

    public final void f(String str) {
        k.f(str, "query");
        m.b bVar = new m.b((Object) null, 1);
        a0<m<b>> a0Var = this.f18976e;
        if (!k.a(a0Var.d(), bVar)) {
            a0Var.l(bVar);
        }
        j.b(o.a.f(this), (f) null, 0, new C0157a(this, str, (d<? super C0157a>) null), 3, (Object) null);
    }
}
