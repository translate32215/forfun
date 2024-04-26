package ed;

import androidx.lifecycle.LiveData;
import dd.c;
import de.y;
import kd.o;
import md.d;
import od.e;
import od.h;
import t4.i;
import td.p;

@e(c = "dev.pankaj.ytvlib.ui.coupon.viewmodel.CouponViewModel$check$1", f = "CouponViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: CouponViewModel.kt */
public final class a extends h implements p<y, d<? super o>, Object> {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f17835e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f17836f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, d<? super a> dVar) {
        super(2, dVar);
        this.f17835e = bVar;
        this.f17836f = str;
    }

    public final d<o> a(Object obj, d<?> dVar) {
        return new a(this.f17835e, this.f17836f, dVar);
    }

    public Object h(Object obj, Object obj2) {
        y yVar = (y) obj;
        a aVar = new a(this.f17835e, this.f17836f, (d) obj2);
        o oVar = o.f20627a;
        aVar.l(oVar);
        return oVar;
    }

    public final Object l(Object obj) {
        l0.e.l(obj);
        LiveData<qc.e<c>> f10 = this.f17835e.f17837d.f(this.f17836f);
        b bVar = this.f17835e;
        bVar.f17838e.m(f10, new i(bVar, (LiveData) f10));
        return o.f20627a;
    }
}
