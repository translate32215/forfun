package e8;

import com.google.android.gms.internal.ads.ca;
import java.lang.ref.WeakReference;
import java.util.Map;
import u.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cn implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14165a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<ca> f14166b;

    public cn(ca caVar, int i10) {
        this.f14165a = i10;
        if (i10 != 1) {
            this.f14166b = new WeakReference<>(caVar);
        } else {
            this.f14166b = new WeakReference<>(caVar);
        }
    }

    public final void f(Object obj, Map map) {
        switch (this.f14165a) {
            case 0:
                ca caVar = (ca) this.f14166b.get();
                if (caVar != null) {
                    caVar.f6086h.I0(ji.f15149a);
                    return;
                }
                return;
            default:
                ca caVar2 = (ca) this.f14166b.get();
                if (caVar2 != null) {
                    caVar2.f6085g.O();
                    return;
                }
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn(ca caVar, b bVar, int i10) {
        this(caVar, 0);
        this.f14165a = i10;
        if (i10 != 1) {
        } else {
            this(caVar, 1);
        }
    }
}
