package e8;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.ju;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.l;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.pd;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.u3;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.zh;
import f7.j0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import l0.e;
import org.json.JSONObject;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class p9<T> implements b, q6, zh, pf0, tc, ff {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15879a;

    /* renamed from: b  reason: collision with root package name */
    public d7<T> f15880b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15881c;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 4
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(android.content.Context, java.lang.String):void");
    }

    public void a(Object obj) {
        switch (this.f15879a) {
            case 5:
                ((o9) this.f15880b).m(obj);
                return;
            case 10:
                ((t7) obj).e((String) this.f15880b, (f3) this.f15881c);
                return;
            case 11:
                ((t7) obj).O((String) this.f15880b, (Map) this.f15881c);
                return;
            case 14:
                pd pdVar = (pd) obj;
                try {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16559c4)).booleanValue()) {
                        if (((ld) this.f15881c).f7371d.f14546c >= ((Integer) ti0.f16763j.f16769f.a(t.f16571e4)).intValue()) {
                            if (pdVar == null) {
                                ((s6) this.f15880b).P5((String) null, (String) null, (Bundle) null);
                                return;
                            } else {
                                ((s6) this.f15880b).P5(pdVar.f7851a, pdVar.f7852b, pdVar.f7853c);
                                return;
                            }
                        }
                    }
                    if (pdVar == null) {
                        ((s6) this.f15880b).N1((String) null, (String) null);
                        return;
                    } else {
                        ((s6) this.f15880b).N1(pdVar.f7851a, pdVar.f7852b);
                        return;
                    }
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
            default:
                ((k20) ((dv) this.f15881c).f14338f).f15225c.l((hf) this.f15880b);
                return;
        }
    }

    public void b(String str) {
        switch (this.f15879a) {
            case 1:
                try {
                    String canonicalName = ((m3) this.f15881c).f7438a.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to loaded mediation ad: ");
                    sb2.append(str);
                    e.E(sb2.toString());
                    ((y2) this.f15880b).t4(0, str);
                    ((y2) this.f15880b).h0(0);
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
            default:
                try {
                    ((u3) this.f15880b).l(str);
                    return;
                } catch (RemoteException e11) {
                    e.C("", e11);
                    return;
                }
        }
    }

    public ju c() {
        n7 n7Var = (n7) this.f15880b;
        String str = (String) this.f15881c;
        n7Var.getClass();
        ja jaVar = n7Var.f7537f;
        k7 k7Var = new k7(str, jaVar.f15116i ? null : n7Var, jaVar.f15111d, jaVar.f15112e, jaVar.f15115h);
        n7Var.A.add(new WeakReference(k7Var));
        return k7Var;
    }

    public void d(boolean z10) {
        ja jaVar = (ja) this.f15880b;
        jaVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) ((Map) this.f15881c).get("id"));
        jaVar.f7138b.b("sendMessageToNativeJs", hashMap);
    }

    public void e(y7 y7Var) {
        Context context = (Context) this.f15880b;
        y7Var.l1(new c8.b(context), (String) this.f15881c, context.getPackageName());
    }

    @Deprecated
    public int f() {
        return ((AtomicInteger) this.f15881c).get();
    }

    @Deprecated
    public void g() {
        this.f15880b.c(new Exception());
    }

    public p9 h(re reVar) {
        ((Map) this.f15880b).put("gqi", reVar.f8030b);
        return this;
    }

    public List<Throwable> i(Throwable th, boolean z10) {
        Reference poll = ((ReferenceQueue) this.f15881c).poll();
        while (poll != null) {
            ((ConcurrentHashMap) this.f15880b).remove(poll);
            poll = ((ReferenceQueue) this.f15881c).poll();
        }
        List<Throwable> list = (List) ((ConcurrentHashMap) this.f15880b).get(new u60(th, (ReferenceQueue<Throwable>) null));
        if (!z10 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) ((ConcurrentHashMap) this.f15880b).putIfAbsent(new u60(th, (ReferenceQueue) this.f15881c), vector);
        return list2 == null ? vector : list2;
    }

    @Deprecated
    public void j(o9<T> o9Var, n9 n9Var) {
        d7 d7Var = this.f15880b;
        p9 p9Var = new p9((o9) o9Var, n9Var);
        o50 o50 = h9.f14886f;
        d7Var.f6188a.a(new j0((Future) d7Var, (zh) p9Var), o50);
    }

    public p9 k() {
        ((Map) this.f15880b).putAll(((oq) this.f15881c).f15832c);
        return this;
    }

    public void l() {
        ((oq) this.f15881c).f15831b.execute(new e7.e(this));
    }

    public synchronized Map<String, String> m() {
        try {
            if (((Map) this.f15881c) == null) {
                this.f15881c = Collections.unmodifiableMap(new HashMap((Map) this.f15880b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f15881c;
    }

    public void n(Throwable th) {
        switch (this.f15879a) {
            case 5:
                ((n9) this.f15881c).run();
                return;
            case 10:
            case 11:
                return;
            case 14:
                try {
                    s6 s6Var = (s6) this.f15880b;
                    String valueOf = String.valueOf(th.getMessage());
                    s6Var.s0(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
            default:
                ((k20) ((dv) this.f15881c).f14338f).f15225c.F0((hf) this.f15880b, th);
                return;
        }
    }

    public p9 o(String str, String str2) {
        ((Map) this.f15880b).put(str, str2);
        return this;
    }

    public void run() {
        ((bv) this.f15880b).f14064c.L3((l) this.f15881c);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, com.google.android.gms.internal.ads.n7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.n7 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 6
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.n7, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ja, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.ja r2, java.util.Map r3) {
        /*
            r1 = this;
            r0 = 9
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.ja, java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.bv, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(e8.bv r2, com.google.android.gms.internal.ads.l r3) {
        /*
            r1 = this;
            r0 = 13
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(e8.bv, com.google.android.gms.internal.ads.l):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.concurrent.ConcurrentHashMap, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.d7<T>, java.util.HashMap] */
    public p9(int i10) {
        this.f15879a = i10;
        if (i10 == 16) {
            this.f15880b = new ConcurrentHashMap(16, 0.75f, 10);
            this.f15881c = new ReferenceQueue();
        } else if (i10 != 17) {
            this.f15880b = new d7<>();
            this.f15881c = new AtomicInteger(0);
            d7 d7Var = this.f15880b;
            g2 g2Var = new g2(this);
            d7Var.a(new j0((Future) d7Var, (zh) g2Var), h9.f14886f);
        } else {
            this.f15880b = new HashMap();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.d7<T>] */
    public p9(Context context) {
        this.f15879a = 3;
        m2 a10 = d7.l.B.f13199p.a(context, f9.i());
        y4<JSONObject> y4Var = x4.f17438b;
        this.f15880b = new n2(a10.f7437a, "google.afma.request.getAdDictionary", y4Var, y4Var);
        this.f15881c = new n2(d7.l.B.f13199p.a(context, f9.i()).f7437a, "google.afma.sdkConstants.getSdkConstants", y4Var, y4Var);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, com.google.android.gms.internal.ads.g1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.g1 r2, java.lang.Runnable r3) {
        /*
            r1 = this;
            r0 = 7
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.g1, java.lang.Runnable):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.d7<T>, com.google.android.gms.internal.ads.y2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.m3 r2, com.google.android.gms.internal.ads.y2 r3) {
        /*
            r1 = this;
            r0 = 1
            r1.f15879a = r0
            r1.f15881c = r2
            r1.f15880b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.m3, com.google.android.gms.internal.ads.y2):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, com.google.android.gms.internal.ads.u3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.u3 r2, com.google.android.gms.internal.ads.y2 r3) {
        /*
            r1 = this;
            r0 = 2
            r1.f15879a = r0
            r1.f15880b = r2
            r1.f15881c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.u3, com.google.android.gms.internal.ads.y2):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.s6, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(com.google.android.gms.internal.ads.ld r2, com.google.android.gms.internal.ads.s6 r3) {
        /*
            r1 = this;
            r0 = 14
            r1.f15879a = r0
            r1.f15881c = r2
            r1.f15880b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(com.google.android.gms.internal.ads.ld, com.google.android.gms.internal.ads.s6):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, e8.o9] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(e8.o9 r2, e8.n9 r3) {
        /*
            r1 = this;
            r0 = 5
            r1.f15879a = r0
            r1.f15880b = r2
            r1.f15881c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(e8.o9, e8.n9):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.concurrent.ConcurrentHashMap, com.google.android.gms.internal.ads.d7<T>] */
    public p9(oq oqVar) {
        this.f15879a = 12;
        this.f15881c = oqVar;
        this.f15880b = new ConcurrentHashMap();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.d7<T>, com.google.android.gms.internal.ads.hf] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(e8.dv r2, com.google.android.gms.internal.ads.hf r3) {
        /*
            r1 = this;
            r0 = 15
            r1.f15879a = r0
            r1.f15881c = r2
            r1.f15880b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(e8.dv, com.google.android.gms.internal.ads.hf):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(java.lang.String r2, e8.f3 r3) {
        /*
            r1 = this;
            r0 = 10
            r1.f15879a = r0
            r1.f15880b = r2
            r1.f15881c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(java.lang.String, e8.f3):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.d7<T>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(java.lang.String r2, java.util.Map r3) {
        /*
            r1 = this;
            r0 = 11
            r1.f15879a = r0
            r1.f15880b = r2
            r1.f15881c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [org.json.JSONObject, com.google.android.gms.internal.ads.d7<T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p9(org.json.JSONObject r2, e8.cp r3) {
        /*
            r1 = this;
            r0 = 8
            r1.f15879a = r0
            r1.<init>()
            r1.f15880b = r2
            r1.f15881c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.p9.<init>(org.json.JSONObject, e8.cp):void");
    }
}
