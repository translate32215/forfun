package e8;

import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.zh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import k8.y2;
import l0.e;
import o8.u5;
import o8.v2;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pu implements zh<T> {

    /* renamed from: a  reason: collision with root package name */
    public long f16023a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16024b;

    /* renamed from: c  reason: collision with root package name */
    public Object f16025c;

    /* renamed from: d  reason: collision with root package name */
    public Object f16026d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f16027e;

    public /* synthetic */ pu(u5 u5Var) {
        this.f16027e = u5Var;
    }

    public void a(T t10) {
        long a10 = ((qu) this.f16027e).f16204a.a() - this.f16023a;
        qu.a((qu) this.f16027e, (String) this.f16024b, 0, a10, ((qe) this.f16025c).f7943a0);
        qu quVar = (qu) this.f16027e;
        if (quVar.f16207d) {
            quVar.f16205b.a((re) this.f16026d, (qe) this.f16025c, 0, (ot) null, a10);
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue()) {
            ((qu) this.f16027e).f16208e.a((qe) this.f16025c, a10, (zh0) null);
        }
    }

    public boolean b(long j10, y2 y2Var) {
        if (((List) this.f16026d) == null) {
            this.f16026d = new ArrayList();
        }
        if (((List) this.f16025c) == null) {
            this.f16025c = new ArrayList();
        }
        if (((List) this.f16026d).size() > 0 && ((((y2) ((List) this.f16026d).get(0)).v() / 1000) / 60) / 60 != ((y2Var.v() / 1000) / 60) / 60) {
            return false;
        }
        long c10 = this.f16023a + ((long) y2Var.c());
        ((u5) this.f16027e).K();
        if (c10 >= ((long) Math.max(0, v2.f23515i.a(null).intValue()))) {
            return false;
        }
        this.f16023a = c10;
        ((List) this.f16026d).add(y2Var);
        ((List) this.f16025c).add(Long.valueOf(j10));
        int size = ((List) this.f16026d).size();
        ((u5) this.f16027e).K();
        if (size >= Math.max(1, v2.f23517j.a(null).intValue())) {
            return false;
        }
        return true;
    }

    public void n(Throwable th) {
        int i10;
        zh0 zh0;
        long a10 = ((qu) this.f16027e).f16204a.a() - this.f16023a;
        if (th instanceof TimeoutException) {
            i10 = 2;
        } else if (th instanceof mu) {
            i10 = 3;
        } else if (th instanceof CancellationException) {
            i10 = 4;
        } else if (th instanceof b10) {
            i10 = 5;
        } else {
            i10 = (!(th instanceof br) || e.N(th).f17753a != 3) ? 6 : 1;
        }
        qu.a((qu) this.f16027e, (String) this.f16024b, i10, a10, ((qe) this.f16025c).f7943a0);
        qu quVar = (qu) this.f16027e;
        if (quVar.f16207d) {
            quVar.f16205b.a((re) this.f16026d, (qe) this.f16025c, i10, th instanceof ot ? (ot) th : null, a10);
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue()) {
            zh0 N = e.N(th);
            int i11 = N.f17753a;
            if ((i11 == 3 || i11 == 0) && (zh0 = N.f17756d) != null && !zh0.f17755c.equals("com.google.android.gms.ads")) {
                N = e.N(new ot(we.MEDIATION_NO_FILL, N.f17756d));
            }
            ((qu) this.f16027e).f16208e.a((qe) this.f16025c, a10, N);
        }
    }

    public pu(qu quVar, long j10, String str, qe qeVar, re reVar) {
        this.f16027e = quVar;
        this.f16023a = j10;
        this.f16024b = str;
        this.f16025c = qeVar;
        this.f16026d = reVar;
    }
}
