package e8;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import d7.l;
import f7.j0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kr implements vr {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f15320f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a  reason: collision with root package name */
    public final dr f15321a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f15322b;

    /* renamed from: c  reason: collision with root package name */
    public final w00 f15323c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f15324d;

    /* renamed from: e  reason: collision with root package name */
    public final xs f15325e;

    public kr(w00 w00, dr drVar, o50 o50, ScheduledExecutorService scheduledExecutorService, xs xsVar) {
        this.f15323c = w00;
        this.f15321a = drVar;
        this.f15322b = o50;
        this.f15324d = scheduledExecutorService;
        this.f15325e = xsVar;
    }

    public final p50<t00> a(l5 l5Var) {
        p50<V> p50;
        dr drVar = this.f15321a;
        drVar.getClass();
        String str = l5Var.f7317d;
        p pVar = l.B.f13186c;
        if (p.A(str)) {
            p50 = new ai.a<>(new wr(we.INTERNAL_ERROR));
        } else {
            p50 = yh.k(drVar.f14324a.i(new cr(drVar, l5Var)), ExecutionException.class, fr.f14676a, drVar.f14325b);
        }
        p50<t00> j10 = yh.j(yh.k(p50, wr.class, new er(drVar, l5Var, Binder.getCallingUid()), drVar.f14325b), new w3(this), this.f15322b);
        if (((Boolean) ti0.f16763j.f16769f.a(t.S2)).booleanValue()) {
            j10 = yh.k(yh.e(j10, (long) ((Integer) ti0.f16763j.f16769f.a(t.T2)).intValue(), TimeUnit.SECONDS, this.f15324d), TimeoutException.class, lr.f15422a, h9.f14886f);
        }
        g2 g2Var = new g2(this);
        o50 o50 = h9.f14886f;
        ((gh) j10).a(new j0((Future) j10, (zh) g2Var), o50);
        return j10;
    }
}
