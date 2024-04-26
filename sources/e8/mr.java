package e8;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.zh;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mr implements zh, ff {

    /* renamed from: a  reason: collision with root package name */
    public Object f15536a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15537b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15538c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15539d;

    public mr(zu zuVar, t00 t00, qe qeVar, mt mtVar) {
        this.f15536a = zuVar;
        this.f15537b = t00;
        this.f15538c = qeVar;
        this.f15539d = mtVar;
    }

    public /* synthetic */ void a(Object obj) {
        s7 s7Var = (s7) this.f15539d;
        int i10 = s7.H;
        s7Var.w((Map) obj, (List) this.f15536a, (String) this.f15537b);
    }

    public void n(Throwable th) {
        String valueOf = String.valueOf((Uri) this.f15538c);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
        sb2.append("Failed to parse gmsg params for: ");
        sb2.append(valueOf);
        e.K(sb2.toString());
    }

    public void run() {
        ((zu) this.f15536a).f17795b.b((t00) this.f15537b, (qe) this.f15538c, (mt) this.f15539d);
    }

    public mr(Context context, f9 f9Var, w00 w00, Executor executor) {
        this.f15536a = context;
        this.f15537b = f9Var;
        this.f15538c = w00;
        this.f15539d = executor;
    }

    public mr(s7 s7Var, List list, String str, Uri uri) {
        this.f15539d = s7Var;
        this.f15536a = list;
        this.f15537b = str;
        this.f15538c = uri;
    }

    public mr(nd ndVar) {
        this.f15539d = ndVar;
    }

    public mr(uu uuVar, t00 t00, qe qeVar, mt mtVar) {
        this.f15539d = uuVar;
        this.f15536a = t00;
        this.f15537b = qeVar;
        this.f15538c = mtVar;
    }
}
