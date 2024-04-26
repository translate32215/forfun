package e8;

import f7.j;
import java.util.Map;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cf implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ af f14129b;

    public cf(af afVar, int i10) {
        this.f14128a = i10;
        if (i10 != 1) {
            this.f14129b = afVar;
        } else {
            this.f14129b = afVar;
        }
    }

    public final void f(Object obj, Map map) {
        switch (this.f14128a) {
            case 0:
                if (af.b(this.f14129b, map)) {
                    this.f14129b.f13715c.execute(new j(this));
                    return;
                }
                return;
            default:
                if (af.b(this.f14129b, map)) {
                    this.f14129b.f13715c.execute(new j(this, (e) null));
                    return;
                }
                return;
        }
    }
}
