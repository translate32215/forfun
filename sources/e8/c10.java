package e8;

import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import d7.l;
import java.util.List;
import r7.m;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c10 {

    /* renamed from: a  reason: collision with root package name */
    public final qe f14075a;

    /* renamed from: b  reason: collision with root package name */
    public final re f14076b;

    /* renamed from: c  reason: collision with root package name */
    public final dt f14077c;

    /* renamed from: d  reason: collision with root package name */
    public final e30 f14078d;

    public c10(dt dtVar, e30 e30, qe qeVar, re reVar) {
        this.f14075a = qeVar;
        this.f14076b = reVar;
        this.f14077c = dtVar;
        this.f14078d = e30;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.String> r2, java.lang.Integer r3) {
        /*
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.b(r0, r3)
            goto L_0x0004
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c10.a(java.util.List, int):void");
    }

    public final void b(String str, int i10) {
        if (!this.f14075a.f7949d0) {
            e30 e30 = this.f14078d;
            e30.f14359a.execute(new m(e30, str));
            return;
        }
        ft ftVar = new ft(l.B.f13193j.b(), this.f14076b.f8030b, str, i10);
        dt dtVar = this.f14077c;
        dtVar.i(new c(dtVar, ftVar));
    }

    public final void c(List<String> list) {
        for (String b10 : list) {
            b(b10, 2);
        }
    }
}
