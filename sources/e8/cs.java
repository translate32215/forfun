package e8;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.f5;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.i5;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.ze;
import com.google.android.gms.internal.ads.zh;
import d7.l;
import f7.j;
import f7.j0;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cs extends f5 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14183a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f14184b;

    /* renamed from: c  reason: collision with root package name */
    public final o7 f14185c;

    /* renamed from: d  reason: collision with root package name */
    public final l7 f14186d;

    /* renamed from: e  reason: collision with root package name */
    public final ue f14187e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, ks> f14188f;

    public cs(Context context, Executor executor, o7 o7Var, ue ueVar, l7 l7Var, HashMap<String, ks> hashMap) {
        t.a(context);
        this.f14183a = context;
        this.f14184b = executor;
        this.f14185c = o7Var;
        this.f14186d = l7Var;
        this.f14187e = ueVar;
        this.f14188f = hashMap;
    }

    public static p50<JSONObject> s6(l5 l5Var, n20 n20, qd qdVar) {
        vo voVar = new vo(qdVar);
        gf gfVar = gs.f14818a;
        dv b10 = n20.b(Cif.GMS_SIGNALS, yh.h(l5Var.f7314a));
        return b10.c(voVar, ((k20) b10.f14338f).f15223a).f(gfVar).e();
    }

    public static p50<e7> t6(p50<JSONObject> p50, n20 n20, m2 m2Var) {
        n2 n2Var = new n2(m2Var.f7437a, "AFMA_getAdDictionary", x4.f17438b, fs.f14677a);
        dv b10 = n20.b(Cif.BUILD_URL, p50);
        return b10.c(n2Var, ((k20) b10.f14338f).f15223a).e();
    }

    public final void F3(l5 l5Var, i5 i5Var) {
        u6(w6(l5Var, Binder.getCallingUid()), i5Var);
    }

    public final void L0(String str, i5 i5Var) {
        u6(y6(str), i5Var);
    }

    public final void c2(l5 l5Var, i5 i5Var) {
        u6(x6(l5Var, Binder.getCallingUid()), i5Var);
    }

    public final void k6(l5 l5Var, i5 i5Var) {
        p50<InputStream> v62 = v6(l5Var, Binder.getCallingUid());
        u6(v62, i5Var);
        ((hf) v62).f6857c.a(new j(this), this.f14184b);
    }

    public final void u6(p50<InputStream> p50, i5 i5Var) {
        p50<O> j10 = yh.j(p50, new vo(this), h9.f14881a);
        g2 g2Var = new g2(i5Var);
        o50 o50 = h9.f14886f;
        ((gh) j10).a(new j0((Future) j10, (zh) g2Var), o50);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.p50<java.io.InputStream> v6(com.google.android.gms.internal.ads.l5 r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            com.google.android.gms.internal.ads.if r2 = com.google.android.gms.internal.ads.Cif.PRE_PROCESS
            com.google.android.gms.internal.ads.if r3 = com.google.android.gms.internal.ads.Cif.HTTP
            d7.l r4 = d7.l.B
            com.google.android.gms.internal.ads.i2 r4 = r4.f13199p
            android.content.Context r5 = r0.f14183a
            e8.f9 r6 = e8.f9.i()
            com.google.android.gms.internal.ads.m2 r4 = r4.a(r5, r6)
            e8.ue r5 = r0.f14187e
            r11 = r16
            e8.qd r5 = r5.a(r15, r11)
            com.google.android.gms.internal.ads.j2<e8.js> r6 = e8.js.f15185d
            com.google.android.gms.internal.ads.k2<java.io.InputStream> r7 = e8.x4.f17439c
            com.google.android.gms.internal.ads.n2 r12 = new com.google.android.gms.internal.ads.n2
            com.google.android.gms.internal.ads.h2 r8 = r4.f7437a
            java.lang.String r9 = "google.afma.response.normalize"
            r12.<init>(r8, r9, r6, r7)
            com.google.android.gms.internal.ads.pb r13 = new com.google.android.gms.internal.ads.pb
            android.content.Context r7 = r0.f14183a
            e8.f9 r6 = r1.f7315b
            java.lang.String r8 = r6.f14544a
            e8.o7 r9 = r0.f14185c
            java.lang.String r10 = r1.f7320g
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            e8.n20 r6 = r5.c()
            a6.b<java.lang.Boolean> r7 = e8.a1.f13652a
            java.lang.Object r7 = r7.b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x005b
            java.lang.String r7 = r1.f7323r
            if (r7 == 0) goto L_0x0077
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0077
            java.lang.String r7 = "Request contained a PoolKey but split request is disabled."
            l0.e.H(r7)
            goto L_0x0077
        L_0x005b:
            java.lang.String r7 = r1.f7323r
            if (r7 == 0) goto L_0x0077
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0077
            java.util.HashMap<java.lang.String, e8.ks> r7 = r0.f14188f
            java.lang.String r8 = r1.f7323r
            java.lang.Object r7 = r7.remove(r8)
            e8.ks r7 = (e8.ks) r7
            if (r7 != 0) goto L_0x0078
            java.lang.String r8 = "Request contained a PoolKey but no matching parameters were found."
            l0.e.H(r8)
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r8 = 1
            r9 = 0
            r10 = 2
            if (r7 != 0) goto L_0x00c5
            e8.p50 r1 = s6(r15, r6, r5)
            e8.p50 r4 = t6(r1, r6, r4)
            e8.p50[] r5 = new e8.p50[r10]
            r5[r9] = r4
            r5[r8] = r1
            com.google.android.gms.internal.ads.j8 r3 = r6.a(r3, r5)
            e8.i7 r5 = new e8.i7
            r5.<init>((e8.p50) r1, (e8.p50) r4)
            e8.dv r3 = r3.i(r5)
            e8.dv r3 = r3.f(r13)
            com.google.android.gms.internal.ads.hf r3 = r3.e()
            r5 = 3
            e8.p50[] r5 = new e8.p50[r5]
            r5[r9] = r1
            r5[r8] = r4
            r5[r10] = r3
            com.google.android.gms.internal.ads.j8 r2 = r6.a(r2, r5)
            e8.es r5 = new e8.es
            r5.<init>((e8.p50) r3, (e8.p50) r1, (e8.p50) r4)
            e8.dv r1 = r2.i(r5)
            java.lang.Object r2 = r1.f14338f
            e8.k20 r2 = (e8.k20) r2
            e8.o50 r2 = r2.f15223a
            e8.dv r1 = r1.c(r12, r2)
            com.google.android.gms.internal.ads.hf r1 = r1.e()
            return r1
        L_0x00c5:
            e8.ls r1 = new e8.ls
            org.json.JSONObject r4 = r7.f15327b
            e8.e7 r5 = r7.f15326a
            r1.<init>(r4, r5)
            e8.p50 r1 = com.google.android.gms.internal.ads.yh.h(r1)
            e8.dv r1 = r6.b(r3, r1)
            e8.dv r1 = r1.f(r13)
            com.google.android.gms.internal.ads.hf r1 = r1.e()
            e8.p50 r3 = com.google.android.gms.internal.ads.yh.h(r7)
            e8.p50[] r4 = new e8.p50[r10]
            r4[r9] = r1
            r4[r8] = r3
            com.google.android.gms.internal.ads.j8 r2 = r6.a(r2, r4)
            e8.cr r4 = new e8.cr
            r4.<init>((e8.p50) r1, (e8.p50) r3)
            e8.dv r1 = r2.i(r4)
            java.lang.Object r2 = r1.f14338f
            e8.k20 r2 = (e8.k20) r2
            e8.o50 r2 = r2.f15223a
            e8.dv r1 = r1.c(r12, r2)
            com.google.android.gms.internal.ads.hf r1 = r1.e()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.cs.v6(com.google.android.gms.internal.ads.l5, int):e8.p50");
    }

    public final p50<InputStream> w6(l5 l5Var, int i10) {
        if (!((Boolean) a1.f13652a.b()).booleanValue()) {
            return new ai.a(new Exception("Split request is disabled."));
        }
        ze zeVar = l5Var.f7322i;
        if (zeVar == null) {
            return new ai.a(new Exception("Pool configuration missing from request."));
        }
        if (zeVar.f8700d == 0 || zeVar.f8701e == 0) {
            return new ai.a(new Exception("Caching is disabled."));
        }
        m2 a10 = l.B.f13199p.a(this.f14183a, f9.i());
        qd a11 = this.f14187e.a(l5Var, i10);
        n20 c10 = a11.c();
        p50<JSONObject> s62 = s6(l5Var, c10, a11);
        p50<e7> t62 = t6(s62, c10, a10);
        return c10.a(Cif.GET_URL_AND_CACHE_KEY, s62, t62).i(new es(this, (p50) t62, (p50) s62)).e();
    }

    public final p50<InputStream> x6(l5 l5Var, int i10) {
        m2 a10 = l.B.f13199p.a(this.f14183a, f9.i());
        if (!((Boolean) g1.f14697a.b()).booleanValue()) {
            return new ai.a(new Exception("Signal collection disabled."));
        }
        qd a11 = this.f14187e.a(l5Var, i10);
        Object obj = a11.f16144u.S.get();
        py b10 = a11.b();
        ow a12 = a11.a();
        pa0<my> a13 = ua0.a(a11.f16126c);
        pa0<fw> a14 = ua0.a(a11.f16128e);
        pa0<sy> a15 = ua0.a(a11.f16129f);
        pa0<ow> a16 = ua0.a(a11.f16130g);
        ua0.a(a11.f16131h);
        pa0<ow> a17 = ua0.a(a11.f16132i);
        pa0<cz> a18 = ua0.a(a11.f16133j);
        o50 a19 = me.a();
        ScheduledExecutorService scheduledExecutorService = a11.f16144u.f15632m.get();
        HashSet hashSet = new HashSet();
        hashSet.add((uy) obj);
        hashSet.add(b10);
        hashSet.add(a12);
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16558c3)).booleanValue()) {
            hashSet.add(a13.get());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16564d3)).booleanValue()) {
            hashSet.add(a14.get());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16570e3)).booleanValue()) {
            hashSet.add(a15.get());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16576f3)).booleanValue()) {
            hashSet.add(a16.get());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16588h3)).booleanValue()) {
            hashSet.add(a17.get());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16594i3)).booleanValue()) {
            hashSet.add(a18.get());
        }
        cy cyVar = new cy(a19, hashSet);
        n2 n2Var = new n2(a10.f7437a, "google.afma.request.getSignals", x4.f17438b, x4.f17439c);
        dv b11 = a11.c().b(Cif.GET_SIGNALS, yh.h(l5Var.f7314a));
        dv c10 = b11.c(new w3(cyVar), ((k20) b11.f14338f).f15223a);
        dv b12 = ((k20) c10.f14338f).b(Cif.JS_SIGNALS, c10.e());
        return b12.c(n2Var, ((k20) b12.f14338f).f15223a).e();
    }

    public final p50<InputStream> y6(String str) {
        if (!((Boolean) a1.f13652a.b()).booleanValue()) {
            return new ai.a(new Exception("Split request is disabled."));
        }
        is isVar = new is();
        if (this.f14188f.remove(str) != null) {
            return yh.h(isVar);
        }
        String valueOf = String.valueOf(str);
        return new ai.a(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }
}
