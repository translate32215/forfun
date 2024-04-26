package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.ai;
import d7.l;
import e.h;
import e8.er;
import e8.h9;
import e8.jr;
import e8.l50;
import e8.o50;
import e8.p50;
import e8.pr;
import e8.t;
import e8.ti0;
import e8.wr;
import e8.zr;
import f7.j;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class od implements oh<l5, pd> {

    /* renamed from: a  reason: collision with root package name */
    public Executor f7680a;

    /* renamed from: b  reason: collision with root package name */
    public jr f7681b;

    public od(Executor executor, jr jrVar) {
        this.f7680a = executor;
        this.f7681b = jrVar;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [e8.p50, e8.l50] */
    /* JADX WARNING: type inference failed for: r1v3, types: [e8.p50, com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.fh, java.lang.Runnable] */
    public final p50 a(Object obj) throws Exception {
        p50 p50;
        p50 p502;
        l5 l5Var = (l5) obj;
        jr jrVar = this.f7681b;
        jrVar.getClass();
        String str = l5Var.f7317d;
        p pVar = l.B.f13186c;
        if (p.A(str)) {
            p50 = new ai.a(new wr(we.INTERNAL_ERROR));
        } else {
            pr prVar = jrVar.f15183c;
            synchronized (prVar.f15834b) {
                if (prVar.f15835c) {
                    p502 = prVar.f15833a;
                } else {
                    prVar.f15835c = true;
                    prVar.f15837e = l5Var;
                    prVar.f15838f.n();
                    d7<InputStream> d7Var = prVar.f15833a;
                    d7Var.f6188a.a(new j(prVar), h9.f14886f);
                    p502 = prVar.f15833a;
                }
            }
            p50 = p502;
        }
        int callingUid = Binder.getCallingUid();
        ? s10 = l50.v(p50).s((long) ((Integer) ti0.f16763j.f16769f.a(t.T2)).intValue(), TimeUnit.SECONDS, jrVar.f15181a);
        er erVar = new er(jrVar, l5Var, callingUid);
        o50 o50 = jrVar.f15182b;
        ? fhVar = new fh(s10, Throwable.class, erVar);
        s10.a(fhVar, h.d(o50, fhVar));
        return yh.j(fhVar, new zr(l5Var, 1), this.f7680a);
    }
}
