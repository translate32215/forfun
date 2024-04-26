package e8;

import com.google.android.gms.internal.ads.ca;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.t7;
import java.lang.ref.WeakReference;
import java.util.Map;
import l0.e;
import u.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n2 implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15580a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15581b;

    public n2(xo xoVar) {
        this.f15580a = 2;
        this.f15581b = xoVar;
    }

    public final void f(Object obj, Map map) {
        switch (this.f15580a) {
            case 0:
                String str = (String) map.get("name");
                if (str == null) {
                    e.K("App event with no name parameter.");
                    return;
                } else {
                    ((p1) this.f15581b).a(str, (String) map.get("info"));
                    return;
                }
            case 1:
                ca caVar = (ca) ((WeakReference) this.f15581b).get();
                if (caVar != null && "_ac".equals((String) map.get("eventName"))) {
                    caVar.f6086h.I0(ji.f15149a);
                    return;
                }
                return;
            default:
                t7 t7Var = (t7) obj;
                ((xo) this.f15581b).f17504b.f14902e = false;
                return;
        }
    }

    public n2(p1 p1Var) {
        this.f15580a = 0;
        this.f15581b = p1Var;
    }

    public n2(ca caVar, b bVar) {
        this.f15580a = 1;
        this.f15580a = 1;
        this.f15581b = new WeakReference(caVar);
    }
}
