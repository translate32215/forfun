package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yh;
import f7.g;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xt implements lt<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final pg f17520a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17521b;

    /* renamed from: c  reason: collision with root package name */
    public final cb f17522c;

    /* renamed from: d  reason: collision with root package name */
    public final w00 f17523d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f17524e;

    /* renamed from: f  reason: collision with root package name */
    public final mg<qe, g> f17525f;

    public xt(pg pgVar, Context context, Executor executor, cb cbVar, w00 w00, mg<qe, g> mgVar) {
        this.f17521b = context;
        this.f17520a = pgVar;
        this.f17524e = executor;
        this.f17522c = cbVar;
        this.f17523d = w00;
        this.f17525f = mgVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        te teVar = qeVar.f7965r;
        return (teVar == null || teVar.f8193a == null) ? false : true;
    }

    public final p50<dg> b(t00 t00, qe qeVar) {
        return yh.j(yh.h(null), new ih(this, t00, qeVar), this.f17524e);
    }
}
