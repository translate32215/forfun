package e8;

import cb.d;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.tm;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class o4 implements f3<u4> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tm f15741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h4 f15742b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f15743c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h2 f15744d;

    public o4(h2 h2Var, tm tmVar, h4 h4Var, d dVar) {
        this.f15744d = h2Var;
        this.f15741a = tmVar;
        this.f15742b = h4Var;
        this.f15743c = dVar;
    }

    public final /* synthetic */ void f(Object obj, Map map) {
        u4 u4Var = (u4) obj;
        synchronized (this.f15744d.f6725a) {
            e.J("JS Engine is requesting an update");
            if (this.f15744d.f6732h == 0) {
                e.J("Starting reload.");
                h2 h2Var = this.f15744d;
                h2Var.f6732h = 2;
                h2Var.a(this.f15741a);
            }
            this.f15742b.e("/requestReload", (f3) this.f15743c.get());
        }
    }
}
