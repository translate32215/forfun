package id;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.q0;
import de.y;
import kd.o;
import md.d;
import md.f;
import od.e;
import od.h;
import qc.m;
import sc.g;
import t4.j;
import td.p;
import ud.k;

/* compiled from: SplashViewModel.kt */
public final class a extends q0 {

    /* renamed from: d  reason: collision with root package name */
    public final cd.a f19358d;

    /* renamed from: e  reason: collision with root package name */
    public final a0<m<rc.a>> f19359e = new a0<>();

    @e(c = "dev.pankaj.ytvlib.ui.splash.viewmodel.SplashViewModel$fetch$1", f = "SplashViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: id.a$a  reason: collision with other inner class name */
    /* compiled from: SplashViewModel.kt */
    public static final class C0164a extends h implements p<y, d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f19360e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f19361f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0164a(a aVar, String str, d<? super C0164a> dVar) {
            super(2, dVar);
            this.f19360e = aVar;
            this.f19361f = str;
        }

        public final d<o> a(Object obj, d<?> dVar) {
            return new C0164a(this.f19360e, this.f19361f, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            C0164a aVar = new C0164a(this.f19360e, this.f19361f, (d) obj2);
            o oVar = o.f20627a;
            aVar.l(oVar);
            return oVar;
        }

        public final Object l(Object obj) {
            l0.e.l(obj);
            LiveData<qc.e<rc.a>> a10 = this.f19360e.f19358d.a(this.f19361f);
            a aVar = this.f19360e;
            aVar.f19359e.m(a10, new j(aVar, (LiveData) a10));
            return o.f20627a;
        }
    }

    public a(cd.a aVar) {
        k.f(aVar, "apiService");
        this.f19358d = aVar;
    }

    public static final void f(a aVar, m mVar) {
        if (!k.a(aVar.f19359e.d(), mVar)) {
            aVar.f19359e.l(mVar);
        }
    }

    public final void g(g gVar) {
        String str;
        if (gVar == null || (str = gVar.a()) == null) {
            str = "";
        }
        m.b bVar = new m.b((Object) null, 1);
        if (!k.a(this.f19359e.d(), bVar)) {
            this.f19359e.l(bVar);
        }
        e.j.b(o.a.f(this), (f) null, 0, new C0164a(this, str, (d<? super C0164a>) null), 3, (Object) null);
    }
}
