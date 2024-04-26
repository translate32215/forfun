package fd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.q0;
import dd.d;
import de.y;
import e.j;
import kd.o;
import md.f;
import od.e;
import od.h;
import qc.m;
import s4.g;
import td.p;
import ud.k;

/* compiled from: EventViewModel.kt */
public final class a extends q0 {

    /* renamed from: d  reason: collision with root package name */
    public final cd.a f18343d;

    /* renamed from: e  reason: collision with root package name */
    public final a0<m<d>> f18344e = new a0<>();

    @e(c = "dev.pankaj.ytvlib.ui.event.viewmodel.EventViewModel$load$1", f = "EventViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fd.a$a  reason: collision with other inner class name */
    /* compiled from: EventViewModel.kt */
    public static final class C0140a extends h implements p<y, md.d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f18345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0140a(a aVar, md.d<? super C0140a> dVar) {
            super(2, dVar);
            this.f18345e = aVar;
        }

        public final md.d<o> a(Object obj, md.d<?> dVar) {
            return new C0140a(this.f18345e, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            C0140a aVar = new C0140a(this.f18345e, (md.d) obj2);
            o oVar = o.f20627a;
            aVar.l(oVar);
            return oVar;
        }

        public final Object l(Object obj) {
            l0.e.l(obj);
            LiveData<qc.e<d>> b10 = this.f18345e.f18343d.b();
            a aVar = this.f18345e;
            aVar.f18344e.m(b10, new g(aVar, (LiveData) b10));
            return o.f20627a;
        }
    }

    public a(cd.a aVar) {
        k.f(aVar, "apiService");
        this.f18343d = aVar;
    }

    public static final void f(a aVar, m mVar) {
        if (!k.a(aVar.f18344e.d(), mVar)) {
            aVar.f18344e.l(mVar);
        }
    }

    public final void g() {
        m.b bVar = new m.b((Object) null, 1);
        if (!k.a(this.f18344e.d(), bVar)) {
            this.f18344e.l(bVar);
        }
        j.b(o.a.f(this), (f) null, 0, new C0140a(this, (md.d<? super C0140a>) null), 3, (Object) null);
    }
}
