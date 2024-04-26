package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.g2;
import d7.l;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i7 implements Callable<h7> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14994a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14995b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14996c;

    public i7(p50 p50, p50 p502) {
        this.f14995b = p50;
        this.f14996c = p502;
    }

    public final Object call() {
        h7 h7Var;
        switch (this.f14994a) {
            case 0:
                k7 k7Var = (k7) ((WeakHashMap) ((g2) this.f14996c).f6511b).get((Context) this.f14995b);
                if (k7Var != null) {
                    if (!(((Long) o0.f15724a.b()).longValue() + k7Var.f15241a < l.B.f13193j.b())) {
                        h7Var = new g7((Context) this.f14995b, k7Var.f15242b).e();
                        ((WeakHashMap) ((g2) this.f14996c).f6511b).put((Context) this.f14995b, new k7(h7Var));
                        return h7Var;
                    }
                }
                h7Var = new g7((Context) this.f14995b).e();
                ((WeakHashMap) ((g2) this.f14996c).f6511b).put((Context) this.f14995b, new k7(h7Var));
                return h7Var;
            case 1:
                return new ls((JSONObject) ((p50) this.f14995b).get(), (e7) ((p50) this.f14996c).get());
            default:
                Object obj = this.f14996c;
                for (p50 p50 : (List) this.f14995b) {
                    by byVar = (by) p50.get();
                    if (byVar != null) {
                        byVar.a(obj);
                    }
                }
                return obj;
        }
    }

    public i7(List list, Object obj) {
        this.f14995b = list;
        this.f14996c = obj;
    }

    public i7(g2 g2Var, Context context) {
        this.f14996c = g2Var;
        this.f14995b = context;
    }
}
