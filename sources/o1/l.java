package o1;

import be.f;
import java.util.Iterator;
import kd.o;
import o1.x;
import ud.k;

/* compiled from: NavController.kt */
public final class l extends ud.l implements td.l<y, o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f22766b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f22767c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(r rVar, k kVar) {
        super(1);
        this.f22766b = rVar;
        this.f22767c = kVar;
    }

    public Object c(Object obj) {
        boolean z10;
        y yVar = (y) obj;
        k.f(yVar, "$this$navOptions");
        x.a aVar = yVar.f22846a;
        boolean z11 = false;
        aVar.f22842g = 0;
        aVar.f22843h = 0;
        aVar.f22844i = -1;
        aVar.f22845j = -1;
        r rVar = this.f22766b;
        if (rVar instanceof t) {
            r rVar2 = r.f22798r;
            f<r> s10 = r.s(rVar);
            k kVar = this.f22767c;
            Iterator<r> it = s10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                r next = it.next();
                r g10 = kVar.g();
                if (k.a(next, g10 != null ? g10.f22800b : null)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            yVar.f22848c = t.F(this.f22767c.i()).f22806h;
            yVar.f22850e = true;
        }
        return o.f20627a;
    }
}
