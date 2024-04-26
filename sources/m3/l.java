package m3;

import android.os.SystemClock;
import android.util.Log;
import c4.g;
import g4.g;
import h4.a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import m3.a;
import m3.i;
import m3.q;
import o3.a;
import o3.e;
import o3.f;
import o3.h;
import o3.i;

/* compiled from: Engine */
public class l implements n, i.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f21591h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final t f21592a;

    /* renamed from: b  reason: collision with root package name */
    public final p f21593b;

    /* renamed from: c  reason: collision with root package name */
    public final i f21594c;

    /* renamed from: d  reason: collision with root package name */
    public final b f21595d;

    /* renamed from: e  reason: collision with root package name */
    public final z f21596e;

    /* renamed from: f  reason: collision with root package name */
    public final a f21597f;

    /* renamed from: g  reason: collision with root package name */
    public final a f21598g;

    /* compiled from: Engine */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final i.d f21599a;

        /* renamed from: b  reason: collision with root package name */
        public final n0.d<i<?>> f21600b = h4.a.a(150, new C0193a());

        /* renamed from: c  reason: collision with root package name */
        public int f21601c;

        /* renamed from: m3.l$a$a  reason: collision with other inner class name */
        /* compiled from: Engine */
        public class C0193a implements a.b<i<?>> {
            public C0193a() {
            }

            public Object a() {
                a aVar = a.this;
                return new i(aVar.f21599a, aVar.f21600b);
            }
        }

        public a(i.d dVar) {
            this.f21599a = dVar;
        }
    }

    /* compiled from: Engine */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final p3.a f21603a;

        /* renamed from: b  reason: collision with root package name */
        public final p3.a f21604b;

        /* renamed from: c  reason: collision with root package name */
        public final p3.a f21605c;

        /* renamed from: d  reason: collision with root package name */
        public final p3.a f21606d;

        /* renamed from: e  reason: collision with root package name */
        public final n f21607e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f21608f;

        /* renamed from: g  reason: collision with root package name */
        public final n0.d<m<?>> f21609g = h4.a.a(150, new a());

        /* compiled from: Engine */
        public class a implements a.b<m<?>> {
            public a() {
            }

            public Object a() {
                b bVar = b.this;
                return new m(bVar.f21603a, bVar.f21604b, bVar.f21605c, bVar.f21606d, bVar.f21607e, bVar.f21608f, bVar.f21609g);
            }
        }

        public b(p3.a aVar, p3.a aVar2, p3.a aVar3, p3.a aVar4, n nVar, q.a aVar5) {
            this.f21603a = aVar;
            this.f21604b = aVar2;
            this.f21605c = aVar3;
            this.f21606d = aVar4;
            this.f21607e = nVar;
            this.f21608f = aVar5;
        }
    }

    /* compiled from: Engine */
    public static class c implements i.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0202a f21611a;

        /* renamed from: b  reason: collision with root package name */
        public volatile o3.a f21612b;

        public c(a.C0202a aVar) {
            this.f21611a = aVar;
        }

        public o3.a a() {
            if (this.f21612b == null) {
                synchronized (this) {
                    if (this.f21612b == null) {
                        o3.d dVar = (o3.d) this.f21611a;
                        f fVar = (f) dVar.f22901b;
                        File cacheDir = fVar.f22907a.getCacheDir();
                        e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f22908b != null) {
                            cacheDir = new File(cacheDir, fVar.f22908b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                eVar = new e(cacheDir, dVar.f22900a);
                            }
                        }
                        this.f21612b = eVar;
                    }
                    if (this.f21612b == null) {
                        this.f21612b = new o3.b();
                    }
                }
            }
            return this.f21612b;
        }
    }

    /* compiled from: Engine */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final m<?> f21613a;

        /* renamed from: b  reason: collision with root package name */
        public final g f21614b;

        public d(g gVar, m<?> mVar) {
            this.f21614b = gVar;
            this.f21613a = mVar;
        }
    }

    public l(o3.i iVar, a.C0202a aVar, p3.a aVar2, p3.a aVar3, p3.a aVar4, p3.a aVar5, boolean z10) {
        this.f21594c = iVar;
        c cVar = new c(aVar);
        a aVar6 = new a(z10);
        this.f21598g = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.f21499e = this;
            }
        }
        this.f21593b = new p();
        this.f21592a = new t(0);
        this.f21595d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f21597f = new a(cVar);
        this.f21596e = new z();
        ((h) iVar).f22909d = this;
    }

    public static void d(String str, long j10, k3.c cVar) {
        StringBuilder a10 = t.f.a(str, " in ");
        a10.append(g4.f.a(j10));
        a10.append("ms, key: ");
        a10.append(cVar);
        Log.v("Engine", a10.toString());
    }

    public void a(k3.c cVar, q<?> qVar) {
        a aVar = this.f21598g;
        synchronized (aVar) {
            a.b remove = aVar.f21497c.remove(cVar);
            if (remove != null) {
                remove.f21503c = null;
                remove.clear();
            }
        }
        if (qVar.f21650a) {
            w wVar = (w) ((h) this.f21594c).d(cVar, qVar);
        } else {
            this.f21596e.a(qVar, false);
        }
    }

    public <R> d b(com.bumptech.glide.d dVar, Object obj, k3.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.f fVar, k kVar, Map<Class<?>, k3.g<?>> map, boolean z10, boolean z11, k3.e eVar, boolean z12, boolean z13, boolean z14, boolean z15, g gVar, Executor executor) {
        long j10;
        if (f21591h) {
            int i12 = g4.f.f18457b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f21593b.getClass();
        o oVar = new o(obj, cVar, i10, i11, map, cls, cls2, eVar);
        synchronized (this) {
            q<?> c10 = c(oVar, z12, j11);
            if (c10 == null) {
                d g10 = g(dVar, obj, cVar, i10, i11, cls, cls2, fVar, kVar, map, z10, z11, eVar, z12, z13, z14, z15, gVar, executor, oVar, j11);
                return g10;
            }
            ((c4.h) gVar).p(c10, com.bumptech.glide.load.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public final q<?> c(o oVar, boolean z10, long j10) {
        q<?> qVar;
        Y y10;
        q<?> qVar2;
        if (!z10) {
            return null;
        }
        a aVar = this.f21598g;
        synchronized (aVar) {
            a.b bVar = aVar.f21497c.get(oVar);
            if (bVar == null) {
                qVar = null;
            } else {
                qVar = (q) bVar.get();
                if (qVar == null) {
                    aVar.b(bVar);
                }
            }
        }
        if (qVar != null) {
            qVar.d();
        }
        if (qVar != null) {
            if (f21591h) {
                d("Loaded resource from active resources", j10, oVar);
            }
            return qVar;
        }
        h hVar = (h) this.f21594c;
        synchronized (hVar) {
            g.a remove = hVar.f18458a.remove(oVar);
            if (remove == null) {
                y10 = null;
            } else {
                hVar.f18460c -= (long) remove.f18462b;
                y10 = remove.f18461a;
            }
        }
        w wVar = (w) y10;
        if (wVar == null) {
            qVar2 = null;
        } else if (wVar instanceof q) {
            qVar2 = (q) wVar;
        } else {
            qVar2 = new q<>(wVar, true, true, oVar, this);
        }
        if (qVar2 != null) {
            qVar2.d();
            this.f21598g.a(oVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f21591h) {
            d("Loaded resource from cache", j10, oVar);
        }
        return qVar2;
    }

    public synchronized void e(m<?> mVar, k3.c cVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.f21650a) {
                this.f21598g.a(cVar, qVar);
            }
        }
        t tVar = this.f21592a;
        tVar.getClass();
        Map<k3.c, m<?>> c10 = tVar.c(mVar.f21631x);
        if (mVar.equals(c10.get(cVar))) {
            c10.remove(cVar);
        }
    }

    public void f(w<?> wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> m3.l.d g(com.bumptech.glide.d r17, java.lang.Object r18, k3.c r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.f r24, m3.k r25, java.util.Map<java.lang.Class<?>, k3.g<?>> r26, boolean r27, boolean r28, k3.e r29, boolean r30, boolean r31, boolean r32, boolean r33, c4.g r34, java.util.concurrent.Executor r35, m3.o r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            m3.t r15 = r1.f21592a
            if (r9 == 0) goto L_0x0023
            java.util.Map<k3.c, m3.m<?>> r15 = r15.f21666b
            goto L_0x0025
        L_0x0023:
            java.util.Map<k3.c, m3.m<?>> r15 = r15.f21665a
        L_0x0025:
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r12)
            m3.m r15 = (m3.m) r15
            if (r15 == 0) goto L_0x0041
            r15.a(r10, r11)
            boolean r0 = f21591h
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "Added to existing load"
            d(r0, r13, r12)
        L_0x003b:
            m3.l$d r0 = new m3.l$d
            r0.<init>(r10, r15)
            return r0
        L_0x0041:
            m3.l$b r15 = r1.f21595d
            n0.d<m3.m<?>> r15 = r15.f21609g
            java.lang.Object r15 = r15.b()
            m3.m r15 = (m3.m) r15
            e.e.b(r15)
            monitor-enter(r15)
            r15.f21627t = r12     // Catch:{ all -> 0x0114 }
            r13 = r30
            r15.f21628u = r13     // Catch:{ all -> 0x0114 }
            r13 = r31
            r15.f21629v = r13     // Catch:{ all -> 0x0114 }
            r13 = r32
            r15.f21630w = r13     // Catch:{ all -> 0x0114 }
            r15.f21631x = r9     // Catch:{ all -> 0x0114 }
            monitor-exit(r15)
            m3.l$a r13 = r1.f21597f
            n0.d<m3.i<?>> r14 = r13.f21600b
            java.lang.Object r14 = r14.b()
            m3.i r14 = (m3.i) r14
            e.e.b(r14)
            int r10 = r13.f21601c
            int r11 = r10 + 1
            r13.f21601c = r11
            m3.h<R> r11 = r14.f21546a
            m3.i$d r13 = r14.f21549d
            r11.f21530c = r0
            r11.f21531d = r2
            r11.f21541n = r3
            r11.f21532e = r4
            r11.f21533f = r5
            r11.f21543p = r7
            r1 = r22
            r11.f21534g = r1
            r11.f21535h = r13
            r1 = r23
            r11.f21538k = r1
            r11.f21542o = r6
            r11.f21536i = r8
            r1 = r26
            r11.f21537j = r1
            r1 = r27
            r11.f21544q = r1
            r1 = r28
            r11.f21545r = r1
            r14.f21553h = r0
            r14.f21554i = r3
            r14.f21555r = r6
            r14.f21556s = r12
            r14.f21557t = r4
            r14.f21558u = r5
            r14.f21559v = r7
            r14.C = r9
            r14.f21560w = r8
            r14.f21561x = r15
            r14.f21562y = r10
            m3.i$f r0 = m3.i.f.INITIALIZE
            r14.A = r0
            r14.D = r2
            r1 = r16
            m3.t r0 = r1.f21592a
            r0.getClass()
            boolean r2 = r15.f21631x
            java.util.Map r0 = r0.c(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.a(r0, r2)
            monitor-enter(r15)
            r15.E = r14     // Catch:{ all -> 0x0111 }
            m3.i$g r2 = m3.i.g.INITIALIZE     // Catch:{ all -> 0x0111 }
            m3.i$g r2 = r14.r(r2)     // Catch:{ all -> 0x0111 }
            m3.i$g r3 = m3.i.g.RESOURCE_CACHE     // Catch:{ all -> 0x0111 }
            if (r2 == r3) goto L_0x00e4
            m3.i$g r3 = m3.i.g.DATA_CACHE     // Catch:{ all -> 0x0111 }
            if (r2 != r3) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r2 = 0
            goto L_0x00e5
        L_0x00e4:
            r2 = 1
        L_0x00e5:
            if (r2 == 0) goto L_0x00ea
            p3.a r2 = r15.f21622g     // Catch:{ all -> 0x0111 }
            goto L_0x00fa
        L_0x00ea:
            boolean r2 = r15.f21629v     // Catch:{ all -> 0x0111 }
            if (r2 == 0) goto L_0x00f1
            p3.a r2 = r15.f21624i     // Catch:{ all -> 0x0111 }
            goto L_0x00fa
        L_0x00f1:
            boolean r2 = r15.f21630w     // Catch:{ all -> 0x0111 }
            if (r2 == 0) goto L_0x00f8
            p3.a r2 = r15.f21625r     // Catch:{ all -> 0x0111 }
            goto L_0x00fa
        L_0x00f8:
            p3.a r2 = r15.f21623h     // Catch:{ all -> 0x0111 }
        L_0x00fa:
            java.util.concurrent.ExecutorService r2 = r2.f23807a     // Catch:{ all -> 0x0111 }
            r2.execute(r14)     // Catch:{ all -> 0x0111 }
            monitor-exit(r15)
            boolean r2 = f21591h
            if (r2 == 0) goto L_0x010b
            java.lang.String r2 = "Started new load"
            r3 = r37
            d(r2, r3, r12)
        L_0x010b:
            m3.l$d r2 = new m3.l$d
            r2.<init>(r0, r15)
            return r2
        L_0x0111:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0114:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l.g(com.bumptech.glide.d, java.lang.Object, k3.c, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.f, m3.k, java.util.Map, boolean, boolean, k3.e, boolean, boolean, boolean, boolean, c4.g, java.util.concurrent.Executor, m3.o, long):m3.l$d");
    }
}
