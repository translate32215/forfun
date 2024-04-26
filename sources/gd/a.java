package gd;

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
import t4.i;
import t4.j;
import td.p;
import ud.k;

/* compiled from: LiveTvViewModel.kt */
public final class a extends q0 {

    /* renamed from: d  reason: collision with root package name */
    public final cd.a f18626d;

    /* renamed from: e  reason: collision with root package name */
    public final a0<m<dd.a>> f18627e = new a0<>();

    /* renamed from: f  reason: collision with root package name */
    public final a0<m<dd.b>> f18628f = new a0<>();

    @e(c = "dev.pankaj.ytvlib.ui.livetv.viewmodel.LiveTvViewModel$loadCategories$1", f = "LiveTvViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gd.a$a  reason: collision with other inner class name */
    /* compiled from: LiveTvViewModel.kt */
    public static final class C0149a extends h implements p<y, d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Long f18629e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f18630f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0149a(Long l10, a aVar, d<? super C0149a> dVar) {
            super(2, dVar);
            this.f18629e = l10;
            this.f18630f = aVar;
        }

        public final d<o> a(Object obj, d<?> dVar) {
            return new C0149a(this.f18629e, this.f18630f, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            C0149a aVar = new C0149a(this.f18629e, this.f18630f, (d) obj2);
            o oVar = o.f20627a;
            aVar.l(oVar);
            return oVar;
        }

        public final Object l(Object obj) {
            LiveData<qc.e<dd.a>> liveData;
            l0.e.l(obj);
            Long l10 = this.f18629e;
            if (l10 == null) {
                liveData = null;
            } else {
                a aVar = this.f18630f;
                liveData = aVar.f18626d.g(l10.longValue());
            }
            if (liveData == null) {
                liveData = this.f18630f.f18626d.d();
            }
            a aVar2 = this.f18630f;
            aVar2.f18627e.m(liveData, new j(aVar2, (LiveData) liveData));
            return o.f20627a;
        }
    }

    @e(c = "dev.pankaj.ytvlib.ui.livetv.viewmodel.LiveTvViewModel$loadChannels$1", f = "LiveTvViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: LiveTvViewModel.kt */
    public static final class b extends h implements p<y, d<? super o>, Object> {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f18631e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f18632f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, long j10, d<? super b> dVar) {
            super(2, dVar);
            this.f18631e = aVar;
            this.f18632f = j10;
        }

        public final d<o> a(Object obj, d<?> dVar) {
            return new b(this.f18631e, this.f18632f, dVar);
        }

        public Object h(Object obj, Object obj2) {
            y yVar = (y) obj;
            b bVar = new b(this.f18631e, this.f18632f, (d) obj2);
            o oVar = o.f20627a;
            bVar.l(oVar);
            return oVar;
        }

        public final Object l(Object obj) {
            l0.e.l(obj);
            LiveData<qc.e<dd.b>> c10 = this.f18631e.f18626d.c(this.f18632f);
            a aVar = this.f18631e;
            aVar.f18628f.m(c10, new i(aVar, (LiveData) c10));
            return o.f20627a;
        }
    }

    public a(cd.a aVar) {
        k.f(aVar, "apiService");
        this.f18626d = aVar;
    }

    public final void f(Long l10) {
        h(new m.b((Object) null, 1), this.f18627e);
        e.j.b(o.a.f(this), (f) null, 0, new C0149a(l10, this, (d<? super C0149a>) null), 3, (Object) null);
    }

    public final void g(long j10) {
        h(new m.b((Object) null, 1), this.f18628f);
        e.j.b(o.a.f(this), (f) null, 0, new b(this, j10, (d<? super b>) null), 3, (Object) null);
    }

    public final <T> void h(m<T> mVar, a0<m<T>> a0Var) {
        if (!k.a(a0Var.d(), mVar)) {
            a0Var.l(mVar);
        }
    }
}
