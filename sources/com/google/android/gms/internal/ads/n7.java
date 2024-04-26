package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.p;
import e7.i;
import e8.b9;
import e8.bf0;
import e8.d40;
import e8.dc0;
import e8.ff0;
import e8.gc0;
import e8.gf0;
import e8.h9;
import e8.hd0;
import e8.ia;
import e8.ja;
import e8.lf0;
import e8.mc0;
import e8.nf0;
import e8.og0;
import e8.p9;
import e8.pe0;
import e8.qf0;
import e8.ra;
import e8.rb0;
import e8.rf0;
import e8.sa;
import e8.t;
import e8.ta;
import e8.tb0;
import e8.ti0;
import e8.ua;
import e8.vb0;
import e8.vf0;
import e8.wy;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l0.e;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n7 implements tb0, mc0, pe0, vf0<ju>, og0 {
    public static int B;
    public static int C;
    public Set<WeakReference<k7>> A = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Context f7532a;

    /* renamed from: b  reason: collision with root package name */
    public final ra f7533b;

    /* renamed from: c  reason: collision with root package name */
    public final ws f7534c;

    /* renamed from: d  reason: collision with root package name */
    public final ws f7535d;

    /* renamed from: e  reason: collision with root package name */
    public final hu f7536e;

    /* renamed from: f  reason: collision with root package name */
    public final ja f7537f;

    /* renamed from: g  reason: collision with root package name */
    public vb0 f7538g;

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f7539h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7540i;

    /* renamed from: r  reason: collision with root package name */
    public final WeakReference<ia> f7541r;

    /* renamed from: s  reason: collision with root package name */
    public ua f7542s;

    /* renamed from: t  reason: collision with root package name */
    public int f7543t;

    /* renamed from: u  reason: collision with root package name */
    public int f7544u;

    /* renamed from: v  reason: collision with root package name */
    public long f7545v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7546w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7547x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<rf0> f7548y;

    /* renamed from: z  reason: collision with root package name */
    public volatile l7 f7549z;

    public n7(Context context, ja jaVar, ia iaVar) {
        this.f7532a = context;
        this.f7537f = jaVar;
        this.f7541r = new WeakReference<>(iaVar);
        ra raVar = new ra();
        this.f7533b = raVar;
        st stVar = st.f8151a;
        d40 d40 = p.f5702i;
        nu nuVar = new nu(context, stVar, d40, this);
        this.f7534c = nuVar;
        bt btVar = new bt(stVar, d40, this);
        this.f7535d = btVar;
        ff0 ff0 = new ff0();
        this.f7536e = ff0;
        if (e.O()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
            sb2.append("ExoPlayerAdapter initialize ");
            sb2.append(valueOf);
            e.H(sb2.toString());
        }
        B++;
        int i10 = 0;
        vb0 vb0 = new vb0(new ws[]{btVar, nuVar}, ff0, raVar);
        this.f7538g = vb0;
        vb0.f17046f.add(this);
        this.f7543t = 0;
        this.f7545v = 0;
        this.f7544u = 0;
        this.f7548y = new ArrayList<>();
        this.f7549z = null;
        this.f7546w = (iaVar == null || iaVar.w() == null) ? "" : iaVar.w();
        this.f7547x = iaVar != null ? iaVar.S() : i10;
    }

    public final void a(dc0 dc0) {
    }

    public final void b(rb0 rb0) {
        ua uaVar = this.f7542s;
        if (uaVar != null) {
            uaVar.f("onPlayerError", rb0);
        }
    }

    public final void c() {
    }

    public final void d(boolean z10) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final void f(bf0 bf0, lf0 lf0) {
    }

    public final void finalize() throws Throwable {
        B--;
        if (e.O()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("ExoPlayerAdapter finalize ");
            sb2.append(valueOf);
            e.H(sb2.toString());
        }
    }

    public final void g(Object obj, qf0 qf0) {
        ju juVar = (ju) obj;
        if (juVar instanceof rf0) {
            this.f7548y.add((rf0) juVar);
        } else if (juVar instanceof l7) {
            this.f7549z = (l7) juVar;
            ia iaVar = (ia) this.f7541r.get();
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue() && iaVar != null && this.f7549z.f7337l) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f7549z.f7339n));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f7549z.f7340o));
                p.f5702i.post(new i(iaVar, (Map) hashMap));
            }
        }
    }

    public final void h(gc0 gc0, Object obj) {
    }

    public final /* synthetic */ void i(Object obj, int i10) {
        this.f7543t += i10;
    }

    public final void j(boolean z10, int i10) {
        ua uaVar = this.f7542s;
        if (uaVar != null) {
            uaVar.b(i10);
        }
    }

    public final long k() {
        long j10;
        boolean z10;
        char c10;
        if (!n()) {
            while (!this.f7548y.isEmpty()) {
                long j11 = this.f7545v;
                Map<String, List<String>> N = this.f7548y.remove(0).N();
                if (N != null) {
                    Iterator<Map.Entry<String, List<String>>> it = N.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next != null) {
                            try {
                                if (next.getKey() != null) {
                                    CharSequence charSequence = (CharSequence) next.getKey();
                                    if ("content-length" != charSequence) {
                                        if (14 == charSequence.length()) {
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < 14) {
                                                    char charAt = "content-length".charAt(i10);
                                                    char charAt2 = charSequence.charAt(i10);
                                                    if (charAt != charAt2 && ((c10 = (char) ((charAt | ' ') - 'a')) >= 26 || c10 != ((char) ((charAt2 | ' ') - 'a')))) {
                                                        break;
                                                    }
                                                    i10++;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (!(!z10 || next.getValue() == null || ((List) next.getValue()).get(0) == null)) {
                                            j10 = Long.parseLong((String) ((List) next.getValue()).get(0));
                                            break;
                                        }
                                    }
                                    z10 = true;
                                    j10 = Long.parseLong((String) ((List) next.getValue()).get(0));
                                    break;
                                    break;
                                }
                                continue;
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                j10 = 0;
                this.f7545v = j11 + j10;
            }
            return this.f7545v;
        }
        l7 l7Var = this.f7549z;
        if (l7Var.f7336k == null) {
            return -1;
        }
        if (l7Var.f7343r.get() != -1) {
            return l7Var.f7343r.get();
        }
        synchronized (l7Var) {
            if (l7Var.f7342q == null) {
                l7Var.f7342q = ((ih) h9.f14881a).i(new wy(l7Var));
            }
        }
        if (!l7Var.f7342q.isDone()) {
            return -1;
        }
        try {
            l7Var.f7343r.compareAndSet(-1, l7Var.f7342q.get().longValue());
            return l7Var.f7343r.get();
        } catch (InterruptedException | ExecutionException unused2) {
            return -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|25|22|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x001a, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r4 = this;
            e8.vb0 r0 = r4.f7538g
            if (r0 == 0) goto L_0x0042
            java.util.concurrent.CopyOnWriteArraySet<e8.tb0> r0 = r0.f17046f
            r0.remove(r4)
            e8.vb0 r0 = r4.f7538g
            com.google.android.gms.internal.ads.us r1 = r0.f17045e
            monitor-enter(r1)
            boolean r2 = r1.f8294z     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r1)
            goto L_0x0030
        L_0x0014:
            android.os.Handler r2 = r1.f8282f     // Catch:{ all -> 0x003f }
            r3 = 6
            r2.sendEmptyMessage(r3)     // Catch:{ all -> 0x003f }
        L_0x001a:
            boolean r2 = r1.f8294z     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x002a
            r1.wait()     // Catch:{ InterruptedException -> 0x0022 }
            goto L_0x001a
        L_0x0022:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003f }
            r2.interrupt()     // Catch:{ all -> 0x003f }
            goto L_0x001a
        L_0x002a:
            android.os.HandlerThread r2 = r1.f8283g     // Catch:{ all -> 0x003f }
            r2.quit()     // Catch:{ all -> 0x003f }
            monitor-exit(r1)
        L_0x0030:
            android.os.Handler r0 = r0.f17044d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r4.f7538g = r1
            int r0 = C
            int r0 = r0 + -1
            C = r0
            goto L_0x0042
        L_0x003f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n7.l():void");
    }

    public final void m(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        Object obj;
        if (this.f7538g != null) {
            this.f7539h = byteBuffer;
            this.f7540i = z10;
            if (uriArr.length == 1) {
                obj = p(uriArr[0], str);
            } else {
                du[] duVarArr = new du[uriArr.length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    duVarArr[i10] = p(uriArr[i10], str);
                }
                obj = new eu(duVarArr);
            }
            vb0 vb0 = this.f7538g;
            if (!vb0.f17055o.a() || vb0.f17056p != null) {
                vb0.f17055o = gc0.f14764a;
                vb0.f17056p = null;
                Iterator<tb0> it = vb0.f17046f.iterator();
                while (it.hasNext()) {
                    it.next().h(vb0.f17055o, vb0.f17056p);
                }
            }
            if (vb0.f17049i) {
                vb0.f17049i = false;
                vb0.f17057q = bf0.f14005d;
                vb0.f17058r = vb0.f17043c;
                vb0.f17042b.b((Object) null);
                Iterator<tb0> it2 = vb0.f17046f.iterator();
                while (it2.hasNext()) {
                    it2.next().f(vb0.f17057q, vb0.f17058r);
                }
            }
            vb0.f17053m++;
            vb0.f17045e.f8282f.obtainMessage(0, 1, 0, obj).sendToTarget();
            C++;
        }
    }

    public final boolean n() {
        return this.f7549z != null && this.f7549z.f7338m;
    }

    public final void o(boolean z10) {
        if (this.f7538g != null) {
            for (int i10 = 0; i10 < this.f7538g.f17041a.length; i10++) {
                hu huVar = this.f7536e;
                boolean z11 = !z10;
                if (huVar.f6901c.get(i10) != z11) {
                    huVar.f6901c.put(i10, z11);
                    nf0 nf0 = huVar.f7111a;
                    if (nf0 != null) {
                        ((us) nf0).f8282f.sendEmptyMessage(10);
                    }
                }
            }
        }
    }

    public final du p(Uri uri, String str) {
        b9 b9Var;
        hd0 hd0;
        gf0 gf0;
        if (!this.f7540i || this.f7539h.limit() <= 0) {
            ja jaVar = this.f7537f;
            if (jaVar.f15115h > 0) {
                gf0 = new p9(this, str);
            } else {
                gf0 = new gf0(this, str);
            }
            if (jaVar.f15116i) {
                gf0 = new gf0(this, gf0);
            }
            if (this.f7539h.limit() > 0) {
                byte[] bArr = new byte[this.f7539h.limit()];
                this.f7539h.get(bArr);
                gf0 = new c(gf0, bArr);
            }
            b9Var = gf0;
        } else {
            byte[] bArr2 = new byte[this.f7539h.limit()];
            this.f7539h.get(bArr2);
            b9Var = new b9(bArr2, 1, (q.e) null);
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16602k)).booleanValue()) {
            hd0 = ta.f16731a;
        } else {
            hd0 = sa.f16385a;
        }
        hd0 hd02 = hd0;
        ja jaVar2 = this.f7537f;
        return new bu(uri, b9Var, hd02, jaVar2.f15117j, p.f5702i, this, jaVar2.f15113f);
    }

    public final long q() {
        if (n() && this.f7549z.f7339n) {
            return Math.min((long) this.f7543t, this.f7549z.f7341p);
        }
        return 0;
    }
}
