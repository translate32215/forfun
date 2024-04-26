package e8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Base64OutputStream;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.i4;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.ji;
import com.google.android.gms.internal.ads.ju;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.lu;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import e7.e;
import f7.j0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class gf0 implements n9, b, q6, pf0, l9, zh, tc, gf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14775a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<a<?>>> f14776b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14777c;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.n7, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.n7 r2, e8.pf0 r3) {
        /*
            r1 = this;
            r0 = 7
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.n7, e8.pf0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(e8.gf0 r5, com.google.android.gms.internal.ads.a r6) {
        /*
            monitor-enter(r5)
            java.lang.String r0 = r6.r()     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>> r1 = r5.f14776b     // Catch:{ all -> 0x0061 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0061 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0040
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>> r1 = r5.f14776b     // Catch:{ all -> 0x0061 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0061 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0061 }
            r1.<init>()     // Catch:{ all -> 0x0061 }
        L_0x0022:
            java.lang.String r4 = "waiting-for-response"
            r6.m(r4)     // Catch:{ all -> 0x0061 }
            r1.add(r6)     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>> r6 = r5.f14776b     // Catch:{ all -> 0x0061 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0061 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0061 }
            boolean r6 = com.google.android.gms.internal.ads.i4.f6915a     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            r1[r3] = r0     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.i4.a(r6, r1)     // Catch:{ all -> 0x0061 }
        L_0x003e:
            monitor-exit(r5)
            goto L_0x005d
        L_0x0040:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>> r1 = r5.f14776b     // Catch:{ all -> 0x0061 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0061 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r6.f5924e     // Catch:{ all -> 0x0061 }
            monitor-enter(r1)     // Catch:{ all -> 0x0061 }
            r6.f5932u = r5     // Catch:{ all -> 0x005e }
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            boolean r6 = com.google.android.gms.internal.ads.i4.f6915a     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x005b
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            r1[r3] = r0     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.i4.a(r6, r1)     // Catch:{ all -> 0x0061 }
        L_0x005b:
            monitor-exit(r5)
            r2 = 0
        L_0x005d:
            return r2
        L_0x005e:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            throw r6     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.k(e8.gf0, com.google.android.gms.internal.ads.a):boolean");
    }

    public void a(Object obj) {
        switch (this.f14775a) {
            case 9:
                gh ghVar = (gh) this.f14777c;
                List<? extends p50<? extends ah>> list = ((fh) obj).f14630a;
                zh zhVar = (zh) this.f14776b;
                ghVar.getClass();
                if (list == null || list.isEmpty()) {
                    ghVar.f14780a.execute(new e(zhVar));
                    return;
                }
                p50<O> h10 = yh.h(null);
                for (p50 ihVar : list) {
                    h10 = yh.j(yh.k(h10, Throwable.class, new w3(zhVar), ghVar.f14780a), new ih(ghVar, zhVar, ihVar), ghVar.f14780a);
                }
                c cVar = new c(ghVar, zhVar);
                h10.a(new j0((Future) h10, (zh) cVar), ghVar.f14780a);
                return;
            default:
                ((t7) obj).l0((qe) this.f14776b, (re) this.f14777c);
                return;
        }
    }

    public Object apply(Object obj) {
        dt.d((SQLiteDatabase) obj, (String) this.f14777c);
        return null;
    }

    public void b(String str) {
        try {
            ((p3) this.f14776b).l(str);
        } catch (RemoteException e10) {
            l0.e.C("", e10);
        }
    }

    public ju c() {
        switch (this.f14775a) {
            case 6:
                n7 n7Var = (n7) this.f14776b;
                String str = (String) this.f14777c;
                n7Var.getClass();
                ja jaVar = n7Var.f7537f;
                if (jaVar.f15116i) {
                    n7Var = null;
                }
                return new lu(str, n7Var, jaVar.f15111d, jaVar.f15112e);
            default:
                n7 n7Var2 = (n7) this.f14776b;
                return new l7(n7Var2.f7532a, ((pf0) this.f14777c).c(), n7Var2.f7546w, n7Var2.f7547x, n7Var2, new ri(n7Var2));
        }
    }

    public void d(boolean z10) {
        switch (this.f14775a) {
            case 11:
                ia iaVar = (ia) this.f14777c;
                iaVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("messageType", "htmlLoaded");
                hashMap.put("id", (String) this.f14776b.get("id"));
                iaVar.f7056b.b("sendMessageToNativeJs", hashMap);
                return;
            default:
                t7 t7Var = (t7) this.f14777c;
                ((wp) this.f14776b).a();
                t7Var.p0();
                ((s7) t7Var.H()).C();
                return;
        }
    }

    public void e(y7 y7Var) {
        y7Var.w0("am", (String) this.f14776b, (Bundle) this.f14777c);
    }

    public void g(int i10, int i11, int i12, float f10) {
        if (((og0) this.f14777c) != null) {
            ((Handler) this.f14776b).post(new rg0(this, i10, i11, i12, f10));
        }
    }

    public void h(int i10, int i11, int i12, int i13) {
        try {
            ((t7) this.f14776b).F("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            l0.e.C("Error occurred while dispatching size change.", e10);
        }
    }

    public void i(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            ((t7) this.f14776b).F("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", (double) f10).put("rotation", i14));
        } catch (JSONException e10) {
            l0.e.C("Error occurred while obtaining screen information.", e10);
        }
    }

    public synchronized void j(a<?> aVar) {
        String r10 = aVar.r();
        List list = (List) this.f14776b.remove(r10);
        if (list != null && !list.isEmpty()) {
            if (i4.f6915a) {
                i4.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), r10);
            }
            a aVar2 = (a) list.remove(0);
            this.f14776b.put(r10, list);
            synchronized (aVar2.f5924e) {
                aVar2.f5932u = this;
            }
            try {
                ((vt) this.f14777c).f8408b.put(aVar2);
            } catch (InterruptedException e10) {
                i4.b("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                vt vtVar = (vt) this.f14777c;
                vtVar.f8411e = true;
                vtVar.interrupt();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.File, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    public File l() {
        if (((File) this.f14776b) == null) {
            this.f14776b = new File(((Context) this.f14777c).getCacheDir(), "volley");
        }
        return (File) this.f14776b;
    }

    public gf0 m(ab0<? extends T> ab0) {
        ((List) this.f14776b).add(ab0);
        return this;
    }

    public void n(Throwable th) {
        switch (this.f14775a) {
            case 9:
                ((zh) this.f14776b).n(th);
                gh.a((gh) this.f14777c);
                return;
            default:
                return;
        }
    }

    public gf0 o(ab0<? extends Collection<? extends T>> ab0) {
        ((List) this.f14777c).add(ab0);
        return this;
    }

    public Set<ul<li>> p(bi biVar) {
        return Collections.singleton(new ul(biVar, h9.f14886f));
    }

    public ya0<T> q() {
        return new ya0<>((List) this.f14776b, (List) this.f14777c, (ji) null);
    }

    public Set<ul<ll>> r(bi biVar) {
        return Collections.singleton(new ul(biVar, h9.f14886f));
    }

    public void run() {
        synchronized (((h2) this.f14777c).f6725a) {
            ((h2) this.f14777c).f6732h = 1;
            l0.e.H("Failed loading new engine. Marking new engine destroyable.");
            ((r4) this.f14776b).r();
        }
    }

    public void s(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", (String) this.f14777c);
            Map<String, List<a<?>>> map = this.f14776b;
            if (((t7) map) != null) {
                ((t7) map).F("onError", put);
            }
        } catch (JSONException e10) {
            l0.e.C("Error occurred while dispatching error event.", e10);
        }
    }

    public void t(String str) {
        try {
            ((t7) this.f14776b).F("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            l0.e.C("Error occurred while dispatching state change.", e10);
        }
    }

    public String toString() {
        String str;
        switch (this.f14775a) {
            case 1:
                try {
                    ((Base64OutputStream) this.f14777c).close();
                } catch (IOException e10) {
                    l0.e.C("HashManager: Unable to convert to Base64.", e10);
                }
                try {
                    ((ByteArrayOutputStream) this.f14776b).close();
                    str = ((ByteArrayOutputStream) this.f14776b).toString();
                } catch (IOException e11) {
                    l0.e.C("HashManager: Unable to convert to Base64.", e11);
                    str = "";
                } finally {
                    this.f14776b = null;
                    this.f14777c = null;
                }
                return str;
            case 18:
                return (String) this.f14776b;
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.n7, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.n7 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 6
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.n7, java.lang.String):void");
    }

    public gf0(ia iaVar, Map map) {
        this.f14775a = 11;
        this.f14777c = iaVar;
        this.f14776b = map;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.wp, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(e8.wp r2, com.google.android.gms.internal.ads.t7 r3) {
        /*
            r1 = this;
            r0 = 14
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(e8.wp, com.google.android.gms.internal.ads.t7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e8.dt, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(e8.dt r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 13
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(e8.dt, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(java.lang.String r2, android.os.Bundle r3) {
        /*
            r1 = this;
            r0 = 5
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.ByteArrayOutputStream, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    public gf0() {
        this.f14775a = 1;
        this.f14776b = new ByteArrayOutputStream(4096);
        this.f14777c = new Base64OutputStream((ByteArrayOutputStream) this.f14776b, 10);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(int r2, int r3) {
        /*
            r1 = this;
            r0 = 16
            r1.f14775a = r0
            r1.<init>()
            if (r2 != 0) goto L_0x000e
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0014
        L_0x000e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r2 = r0
        L_0x0014:
            r1.f14776b = r2
            if (r3 != 0) goto L_0x001d
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0022
        L_0x001d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
        L_0x0022:
            r1.f14777c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(int, int):void");
    }

    public gf0(Context context) {
        this.f14775a = 8;
        this.f14777c = context;
        this.f14776b = null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(android.os.Handler r2, e8.og0 r3) {
        /*
            r1 = this;
            r0 = 17
            r1.f14775a = r0
            r1.<init>()
            if (r3 == 0) goto L_0x000d
            r2.getClass()
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(android.os.Handler, e8.og0):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e8.r4, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.h2 r2, e8.r4 r3) {
        /*
            r1 = this;
            r0 = 2
            r1.f14775a = r0
            r1.f14777c = r2
            r1.f14776b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.h2, e8.r4):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.p3, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.p3 r2, com.google.android.gms.internal.ads.y2 r3) {
        /*
            r1 = this;
            r0 = 3
            r1.f14775a = r0
            r1.f14776b = r2
            r1.f14777c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.p3, com.google.android.gms.internal.ads.y2):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gf0(t7 t7Var) {
        this(t7Var, "");
        this.f14775a = 4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public gf0(t9 t9Var) {
        this(t9Var, (t7) null);
        this.f14775a = 10;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.qe, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.qe r2, com.google.android.gms.internal.ads.re r3) {
        /*
            r1 = this;
            r0 = 12
            r1.f14775a = r0
            r1.f14776b = r2
            r1.f14777c = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.qe, com.google.android.gms.internal.ads.re):void");
    }

    public gf0(vt vtVar) {
        this.f14775a = 0;
        this.f14776b = new HashMap();
        this.f14777c = vtVar;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.zy r2) {
        /*
            r1 = this;
            r0 = 18
            r1.f14775a = r0
            r1.<init>()
            r1.f14777c = r2
            java.lang.String r2 = r2.getDescription()     // Catch:{ RemoteException -> 0x000e }
            goto L_0x0015
        L_0x000e:
            r2 = move-exception
            java.lang.String r0 = ""
            l0.e.C(r0, r2)
            r2 = 0
        L_0x0015:
            r1.f14776b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.zy):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zh, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(e8.gh r2, com.google.android.gms.internal.ads.zh r3) {
        /*
            r1 = this;
            r0 = 9
            r1.f14775a = r0
            r1.f14777c = r2
            r1.f14776b = r3
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(e8.gh, com.google.android.gms.internal.ads.zh):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [e8.b9, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    public gf0(byte[] bArr, byte[] bArr2) {
        this.f14775a = 15;
        this.f14776b = new b9(bArr, bArr.length);
        this.f14777c = new b9(bArr2, bArr2.length);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.t7, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.t7 r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 4
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.t7, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.t9, java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a<?>>>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gf0(com.google.android.gms.internal.ads.t9 r2, com.google.android.gms.internal.ads.t7 r3) {
        /*
            r1 = this;
            r0 = 10
            r1.f14775a = r0
            r1.<init>()
            r1.f14776b = r2
            r1.f14777c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gf0.<init>(com.google.android.gms.internal.ads.t9, com.google.android.gms.internal.ads.t7):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf0(int i10, int i11, ji jiVar) {
        this(i10, i11);
        this.f14775a = 16;
    }
}
