package e8;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.us;
import com.google.android.gms.internal.ads.ws;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vb0 {

    /* renamed from: a  reason: collision with root package name */
    public final ws[] f17041a;

    /* renamed from: b  reason: collision with root package name */
    public final iu f17042b;

    /* renamed from: c  reason: collision with root package name */
    public final lf0 f17043c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f17044d;

    /* renamed from: e  reason: collision with root package name */
    public final us f17045e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<tb0> f17046f;

    /* renamed from: g  reason: collision with root package name */
    public final hc0 f17047g;

    /* renamed from: h  reason: collision with root package name */
    public final ic0 f17048h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17049i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17050j;

    /* renamed from: k  reason: collision with root package name */
    public int f17051k;

    /* renamed from: l  reason: collision with root package name */
    public int f17052l;

    /* renamed from: m  reason: collision with root package name */
    public int f17053m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17054n;

    /* renamed from: o  reason: collision with root package name */
    public gc0 f17055o;

    /* renamed from: p  reason: collision with root package name */
    public Object f17056p;

    /* renamed from: q  reason: collision with root package name */
    public bf0 f17057q;

    /* renamed from: r  reason: collision with root package name */
    public lf0 f17058r;

    /* renamed from: s  reason: collision with root package name */
    public dc0 f17059s;

    /* renamed from: t  reason: collision with root package name */
    public xb0 f17060t;

    /* renamed from: u  reason: collision with root package name */
    public int f17061u;

    /* renamed from: v  reason: collision with root package name */
    public long f17062v;

    @SuppressLint({"HandlerLeak"})
    public vb0(ws[] wsVarArr, iu iuVar, ra raVar) {
        String str = eg0.f14483e;
        StringBuilder sb2 = new StringBuilder(o.a(str, 26));
        sb2.append("Init ExoPlayerLib/2.4.2 [");
        sb2.append(str);
        sb2.append("]");
        Log.i("ExoPlayerImpl", sb2.toString());
        a.c(wsVarArr.length > 0);
        this.f17041a = wsVarArr;
        iuVar.getClass();
        this.f17042b = iuVar;
        this.f17050j = false;
        this.f17051k = 1;
        this.f17046f = new CopyOnWriteArraySet<>();
        lf0 lf0 = new lf0(new kf0[wsVarArr.length]);
        this.f17043c = lf0;
        this.f17055o = gc0.f14764a;
        this.f17047g = new hc0();
        this.f17048h = new ic0();
        this.f17057q = bf0.f14005d;
        this.f17058r = lf0;
        this.f17059s = dc0.f14249d;
        wb0 wb0 = new wb0(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f17044d = wb0;
        xb0 xb0 = new xb0(0, 0);
        this.f17060t = xb0;
        this.f17045e = new us(wsVarArr, iuVar, raVar, this.f17050j, wb0, xb0, this);
    }

    public final long a() {
        if (this.f17055o.a() || this.f17052l > 0) {
            return this.f17062v;
        }
        this.f17055o.e(this.f17060t.f17459a, this.f17048h, false);
        this.f17048h.getClass();
        return sb0.a(this.f17060t.f17462d) + sb0.a(0);
    }

    public final long b() {
        if (this.f17055o.a()) {
            return -9223372036854775807L;
        }
        return sb0.a(this.f17055o.c(f(), this.f17047g).f14894a);
    }

    public final void c(ub0... ub0Arr) {
        us usVar = this.f17045e;
        if (usVar.f8294z) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        usVar.F++;
        usVar.f8282f.obtainMessage(11, ub0Arr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|22|19|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0021, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(e8.ub0... r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.us r0 = r4.f17045e
            monitor-enter(r0)
            boolean r1 = r0.f8294z     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0010
            java.lang.String r5 = "ExoPlayerImplInternal"
            java.lang.String r1 = "Ignoring messages sent after release."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)
            goto L_0x0032
        L_0x0010:
            int r1 = r0.F     // Catch:{ all -> 0x0033 }
            int r2 = r1 + 1
            r0.F = r2     // Catch:{ all -> 0x0033 }
            android.os.Handler r2 = r0.f8282f     // Catch:{ all -> 0x0033 }
            r3 = 11
            android.os.Message r5 = r2.obtainMessage(r3, r5)     // Catch:{ all -> 0x0033 }
            r5.sendToTarget()     // Catch:{ all -> 0x0033 }
        L_0x0021:
            int r5 = r0.G     // Catch:{ all -> 0x0033 }
            if (r5 > r1) goto L_0x0031
            r0.wait()     // Catch:{ InterruptedException -> 0x0029 }
            goto L_0x0021
        L_0x0029:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0033 }
            r5.interrupt()     // Catch:{ all -> 0x0033 }
            goto L_0x0021
        L_0x0031:
            monitor-exit(r0)
        L_0x0032:
            return
        L_0x0033:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0037
        L_0x0036:
            throw r5
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.vb0.d(e8.ub0[]):void");
    }

    public final long e() {
        if (this.f17055o.a() || this.f17052l > 0) {
            return this.f17062v;
        }
        this.f17055o.e(this.f17060t.f17459a, this.f17048h, false);
        this.f17048h.getClass();
        return sb0.a(this.f17060t.f17461c) + sb0.a(0);
    }

    public final int f() {
        if (this.f17055o.a() || this.f17052l > 0) {
            return this.f17061u;
        }
        this.f17055o.e(this.f17060t.f17459a, this.f17048h, false);
        return 0;
    }

    public final void g(boolean z10) {
        if (this.f17050j != z10) {
            this.f17050j = z10;
            this.f17045e.f8282f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator<tb0> it = this.f17046f.iterator();
            while (it.hasNext()) {
                it.next().j(z10, this.f17051k);
            }
        }
    }
}
