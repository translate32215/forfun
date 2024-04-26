package c5;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c5.d;
import c5.f;
import c5.g;
import c5.j;
import c5.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import v6.e0;
import v6.h;
import v6.p;
import z5.k;

/* compiled from: DefaultDrmSession */
public class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final List<f.b> f4255a;

    /* renamed from: b  reason: collision with root package name */
    public final q f4256b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4257c;

    /* renamed from: d  reason: collision with root package name */
    public final C0059b f4258d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4259e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4260f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4261g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, String> f4262h;

    /* renamed from: i  reason: collision with root package name */
    public final h<j.a> f4263i;

    /* renamed from: j  reason: collision with root package name */
    public final u6.h f4264j;

    /* renamed from: k  reason: collision with root package name */
    public final x f4265k;

    /* renamed from: l  reason: collision with root package name */
    public final UUID f4266l;

    /* renamed from: m  reason: collision with root package name */
    public final e f4267m;

    /* renamed from: n  reason: collision with root package name */
    public int f4268n;

    /* renamed from: o  reason: collision with root package name */
    public int f4269o;

    /* renamed from: p  reason: collision with root package name */
    public HandlerThread f4270p;

    /* renamed from: q  reason: collision with root package name */
    public c f4271q;

    /* renamed from: r  reason: collision with root package name */
    public p f4272r;

    /* renamed from: s  reason: collision with root package name */
    public g.a f4273s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f4274t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f4275u;

    /* renamed from: v  reason: collision with root package name */
    public q.a f4276v;

    /* renamed from: w  reason: collision with root package name */
    public q.d f4277w;

    /* compiled from: DefaultDrmSession */
    public interface a {
    }

    /* renamed from: c5.b$b  reason: collision with other inner class name */
    /* compiled from: DefaultDrmSession */
    public interface C0059b {
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSession */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4278a;

        public c(Looper looper) {
            super(looper);
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(k.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: c5.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: c5.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: c5.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Throwable, java.lang.Exception] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r10.obj
                c5.b$d r0 = (c5.b.d) r0
                r1 = 1
                int r2 = r10.what     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                if (r2 == 0) goto L_0x0023
                if (r2 != r1) goto L_0x001d
                c5.b r2 = c5.b.this     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.x r3 = r2.f4265k     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                java.util.UUID r2 = r2.f4266l     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                java.lang.Object r4 = r0.f4282c     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.q$a r4 = (c5.q.a) r4     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.v r3 = (c5.v) r3     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                byte[] r1 = r3.a(r2, r4)     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                goto L_0x00c0
            L_0x001d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                r2.<init>()     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                throw r2     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
            L_0x0023:
                c5.b r2 = c5.b.this     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.x r3 = r2.f4265k     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                java.util.UUID r2 = r2.f4266l     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                java.lang.Object r4 = r0.f4282c     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.q$d r4 = (c5.q.d) r4     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                c5.v r3 = (c5.v) r3     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                byte[] r1 = r3.c(r2, r4)     // Catch:{ y -> 0x003f, Exception -> 0x0035 }
                goto L_0x00c0
            L_0x0035:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                v6.p.d(r2, r3, r1)
                goto L_0x00c0
            L_0x003f:
                r2 = move-exception
                java.lang.Object r3 = r10.obj
                c5.b$d r3 = (c5.b.d) r3
                boolean r4 = r3.f4281b
                if (r4 != 0) goto L_0x004a
                goto L_0x00bb
            L_0x004a:
                int r4 = r3.f4283d
                int r4 = r4 + r1
                r3.f4283d = r4
                c5.b r5 = c5.b.this
                u6.h r5 = r5.f4264j
                com.google.android.exoplayer2.upstream.k r5 = (com.google.android.exoplayer2.upstream.k) r5
                r6 = 3
                int r5 = r5.a(r6)
                if (r4 <= r5) goto L_0x005d
                goto L_0x00bb
            L_0x005d:
                z5.k r4 = new z5.k
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L_0x0074
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L_0x007d
            L_0x0074:
                c5.b$f r4 = new c5.b$f
                java.lang.Throwable r5 = r2.getCause()
                r4.<init>(r5)
            L_0x007d:
                c5.b r5 = c5.b.this
                u6.h r5 = r5.f4264j
                int r3 = r3.f4283d
                com.google.android.exoplayer2.upstream.k r5 = (com.google.android.exoplayer2.upstream.k) r5
                boolean r5 = r4 instanceof x4.m0
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 != 0) goto L_0x00a6
                boolean r5 = r4 instanceof java.io.FileNotFoundException
                if (r5 != 0) goto L_0x00a6
                boolean r5 = r4 instanceof com.google.android.exoplayer2.upstream.m.b
                if (r5 != 0) goto L_0x00a6
                boolean r4 = r4 instanceof com.google.android.exoplayer2.upstream.n.h
                if (r4 == 0) goto L_0x009b
                goto L_0x00a6
            L_0x009b:
                r4 = -1
                r5 = 1000(0x3e8, float:1.401E-42)
                r8 = 5000(0x1388, float:7.006E-42)
                int r3 = c5.c.a(r3, r4, r5, r8)
                long r3 = (long) r3
                goto L_0x00a7
            L_0x00a6:
                r3 = r6
            L_0x00a7:
                int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x00ac
                goto L_0x00bb
            L_0x00ac:
                monitor-enter(r9)
                boolean r5 = r9.f4278a     // Catch:{ all -> 0x00e6 }
                if (r5 != 0) goto L_0x00ba
                android.os.Message r5 = android.os.Message.obtain(r10)     // Catch:{ all -> 0x00e6 }
                r9.sendMessageDelayed(r5, r3)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r9)     // Catch:{ all -> 0x00e6 }
                goto L_0x00bc
            L_0x00ba:
                monitor-exit(r9)     // Catch:{ all -> 0x00e6 }
            L_0x00bb:
                r1 = 0
            L_0x00bc:
                if (r1 == 0) goto L_0x00bf
                return
            L_0x00bf:
                r1 = r2
            L_0x00c0:
                c5.b r2 = c5.b.this
                u6.h r2 = r2.f4264j
                long r3 = r0.f4280a
                r2.getClass()
                monitor-enter(r9)
                boolean r2 = r9.f4278a     // Catch:{ all -> 0x00e3 }
                if (r2 != 0) goto L_0x00e1
                c5.b r2 = c5.b.this     // Catch:{ all -> 0x00e3 }
                c5.b$e r2 = r2.f4267m     // Catch:{ all -> 0x00e3 }
                int r10 = r10.what     // Catch:{ all -> 0x00e3 }
                java.lang.Object r0 = r0.f4282c     // Catch:{ all -> 0x00e3 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x00e3 }
                android.os.Message r10 = r2.obtainMessage(r10, r0)     // Catch:{ all -> 0x00e3 }
                r10.sendToTarget()     // Catch:{ all -> 0x00e3 }
            L_0x00e1:
                monitor-exit(r9)     // Catch:{ all -> 0x00e3 }
                return
            L_0x00e3:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00e3 }
                throw r10
            L_0x00e6:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00e6 }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.b.c.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: DefaultDrmSession */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f4280a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4281b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4282c;

        /* renamed from: d  reason: collision with root package name */
        public int f4283d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f4280a = j10;
            this.f4281b = z10;
            this.f4282c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSession */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Set<E> set;
            Set<E> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                b bVar = b.this;
                if (obj != bVar.f4277w) {
                    return;
                }
                if (bVar.f4268n == 2 || bVar.i()) {
                    bVar.f4277w = null;
                    if (obj2 instanceof Exception) {
                        ((d.e) bVar.f4257c).a((Exception) obj2);
                        return;
                    }
                    try {
                        bVar.f4256b.i((byte[]) obj2);
                        d.e eVar = (d.e) bVar.f4257c;
                        for (b next : d.this.f4297n) {
                            if (next.l(false)) {
                                next.h(true);
                            }
                        }
                        d.this.f4297n.clear();
                    } catch (Exception e10) {
                        ((d.e) bVar.f4257c).a(e10);
                    }
                }
            } else if (i10 == 1) {
                b bVar2 = b.this;
                if (obj == bVar2.f4276v && bVar2.i()) {
                    bVar2.f4276v = null;
                    if (obj2 instanceof Exception) {
                        bVar2.k((Exception) obj2);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (bVar2.f4259e == 3) {
                            q qVar = bVar2.f4256b;
                            byte[] bArr2 = bVar2.f4275u;
                            int i11 = e0.f26436a;
                            qVar.f(bArr2, bArr);
                            h<j.a> hVar = bVar2.f4263i;
                            synchronized (hVar.f26452a) {
                                set2 = hVar.f26454c;
                            }
                            for (E b10 : set2) {
                                b10.b();
                            }
                            return;
                        }
                        byte[] f10 = bVar2.f4256b.f(bVar2.f4274t, bArr);
                        int i12 = bVar2.f4259e;
                        if (!((i12 != 2 && (i12 != 0 || bVar2.f4275u == null)) || f10 == null || f10.length == 0)) {
                            bVar2.f4275u = f10;
                        }
                        bVar2.f4268n = 4;
                        h<j.a> hVar2 = bVar2.f4263i;
                        synchronized (hVar2.f26452a) {
                            set = hVar2.f26454c;
                        }
                        for (E a10 : set) {
                            a10.a();
                        }
                    } catch (Exception e11) {
                        bVar2.k(e11);
                    }
                }
            }
        }
    }

    /* compiled from: DefaultDrmSession */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, q qVar, a aVar, C0059b bVar, List<f.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, x xVar, Looper looper, u6.h hVar) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f4266l = uuid;
        this.f4257c = aVar;
        this.f4258d = bVar;
        this.f4256b = qVar;
        this.f4259e = i10;
        this.f4260f = z10;
        this.f4261g = z11;
        if (bArr != null) {
            this.f4275u = bArr;
            this.f4255a = null;
        } else {
            list.getClass();
            this.f4255a = Collections.unmodifiableList(list);
        }
        this.f4262h = hashMap;
        this.f4265k = xVar;
        this.f4263i = new h<>();
        this.f4264j = hVar;
        this.f4268n = 2;
        this.f4267m = new e(looper);
    }

    public boolean a() {
        return this.f4260f;
    }

    public final UUID b() {
        return this.f4266l;
    }

    public final p c() {
        return this.f4272r;
    }

    public void d(j.a aVar) {
        boolean z10 = false;
        v6.a.d(this.f4269o >= 0);
        if (aVar != null) {
            h<j.a> hVar = this.f4263i;
            synchronized (hVar.f26452a) {
                ArrayList arrayList = new ArrayList(hVar.f26455d);
                arrayList.add(aVar);
                hVar.f26455d = Collections.unmodifiableList(arrayList);
                Integer num = hVar.f26453b.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(hVar.f26454c);
                    hashSet.add(aVar);
                    hVar.f26454c = Collections.unmodifiableSet(hashSet);
                }
                hVar.f26453b.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i10 = this.f4269o + 1;
        this.f4269o = i10;
        if (i10 == 1) {
            if (this.f4268n == 2) {
                z10 = true;
            }
            v6.a.d(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f4270p = handlerThread;
            handlerThread.start();
            this.f4271q = new c(this.f4270p.getLooper());
            if (l(true)) {
                h(true);
            }
        } else if (aVar != null && i()) {
            aVar.d();
        }
        d.f fVar = (d.f) this.f4258d;
        d dVar = d.this;
        if (dVar.f4295l != -9223372036854775807L) {
            dVar.f4298o.remove(this);
            Handler handler = d.this.f4304u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public void e(j.a aVar) {
        Set<E> set;
        v6.a.d(this.f4269o > 0);
        int i10 = this.f4269o - 1;
        this.f4269o = i10;
        if (i10 == 0) {
            this.f4268n = 0;
            e eVar = this.f4267m;
            int i11 = e0.f26436a;
            eVar.removeCallbacksAndMessages((Object) null);
            c cVar = this.f4271q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages((Object) null);
                cVar.f4278a = true;
            }
            this.f4271q = null;
            this.f4270p.quit();
            this.f4270p = null;
            this.f4272r = null;
            this.f4273s = null;
            this.f4276v = null;
            this.f4277w = null;
            byte[] bArr = this.f4274t;
            if (bArr != null) {
                this.f4256b.e(bArr);
                this.f4274t = null;
            }
            h<j.a> hVar = this.f4263i;
            synchronized (hVar.f26452a) {
                set = hVar.f26454c;
            }
            for (E f10 : set) {
                f10.f();
            }
        }
        if (aVar != null) {
            if (i()) {
                aVar.f();
            }
            h<j.a> hVar2 = this.f4263i;
            synchronized (hVar2.f26452a) {
                Integer num = hVar2.f26453b.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(hVar2.f26455d);
                    arrayList.remove(aVar);
                    hVar2.f26455d = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        hVar2.f26453b.remove(aVar);
                        HashSet hashSet = new HashSet(hVar2.f26454c);
                        hashSet.remove(aVar);
                        hVar2.f26454c = Collections.unmodifiableSet(hashSet);
                    } else {
                        hVar2.f26453b.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
        }
        C0059b bVar = this.f4258d;
        int i12 = this.f4269o;
        d.f fVar = (d.f) bVar;
        fVar.getClass();
        if (i12 == 1) {
            d dVar = d.this;
            if (dVar.f4295l != -9223372036854775807L) {
                dVar.f4298o.add(this);
                Handler handler = d.this.f4304u;
                handler.getClass();
                handler.postAtTime(new androidx.activity.c(this), this, SystemClock.uptimeMillis() + d.this.f4295l);
                return;
            }
        }
        if (i12 == 0) {
            d.this.f4296m.remove(this);
            d dVar2 = d.this;
            if (dVar2.f4301r == this) {
                dVar2.f4301r = null;
            }
            if (dVar2.f4302s == this) {
                dVar2.f4302s = null;
            }
            if (dVar2.f4297n.size() > 1 && d.this.f4297n.get(0) == this) {
                d.this.f4297n.get(1).n();
            }
            d.this.f4297n.remove(this);
            d dVar3 = d.this;
            if (dVar3.f4295l != -9223372036854775807L) {
                Handler handler2 = dVar3.f4304u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                d.this.f4298o.remove(this);
            }
        }
    }

    public final g.a f() {
        if (this.f4268n == 1) {
            return this.f4273s;
        }
        return null;
    }

    public final void g(v6.g<j.a> gVar) {
        Set<E> set;
        h<j.a> hVar = this.f4263i;
        synchronized (hVar.f26452a) {
            set = hVar.f26454c;
        }
        for (E i10 : set) {
            ((r1.c) gVar).i(i10);
        }
    }

    public final int getState() {
        return this.f4268n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ NumberFormatException -> 0x0093 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.f4261g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.f4274t
            int r1 = v6.e0.f26436a
            int r1 = r10.f4259e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x003e
            if (r1 == r3) goto L_0x002f
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x0103
        L_0x0018:
            byte[] r1 = r10.f4275u
            r1.getClass()
            byte[] r1 = r10.f4274t
            r1.getClass()
            boolean r1 = r10.p()
            if (r1 == 0) goto L_0x0103
            byte[] r1 = r10.f4275u
            r10.m(r1, r0, r11)
            goto L_0x0103
        L_0x002f:
            byte[] r1 = r10.f4275u
            if (r1 == 0) goto L_0x0039
            boolean r1 = r10.p()
            if (r1 == 0) goto L_0x0103
        L_0x0039:
            r10.m(r0, r3, r11)
            goto L_0x0103
        L_0x003e:
            byte[] r1 = r10.f4275u
            if (r1 != 0) goto L_0x0047
            r10.m(r0, r2, r11)
            goto L_0x0103
        L_0x0047:
            int r1 = r10.f4268n
            r2 = 4
            if (r1 == r2) goto L_0x0052
            boolean r1 = r10.p()
            if (r1 == 0) goto L_0x0103
        L_0x0052:
            java.util.UUID r1 = x4.f.f27569d
            java.util.UUID r4 = r10.f4266l
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0062
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b2
        L_0x0062:
            java.util.Map r1 = r10.o()
            if (r1 != 0) goto L_0x006a
            r1 = 0
            goto L_0x009b
        L_0x006a:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x0080 }
            if (r5 == 0) goto L_0x0080
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x0081
        L_0x0080:
            r8 = r6
        L_0x0081:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x0093 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0093 }
            if (r1 == 0) goto L_0x0093
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0093 }
        L_0x0093:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r1)
            r1 = r4
        L_0x009b:
            r1.getClass()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r4 = java.lang.Math.min(r4, r6)
        L_0x00b2:
            int r1 = r10.f4259e
            if (r1 != 0) goto L_0x00d6
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x00d6
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Offline license has expired or will expire soon. Remaining seconds: "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            r10.m(r0, r3, r11)
            goto L_0x0103
        L_0x00d6:
            r0 = 0
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00e5
            c5.w r11 = new c5.w
            r11.<init>()
            r10.j(r11)
            goto L_0x0103
        L_0x00e5:
            r10.f4268n = r2
            v6.h<c5.j$a> r11 = r10.f4263i
            java.lang.Object r0 = r11.f26452a
            monitor-enter(r0)
            java.util.Set<E> r11 = r11.f26454c     // Catch:{ all -> 0x0104 }
            monitor-exit(r0)     // Catch:{ all -> 0x0104 }
            java.util.Iterator r11 = r11.iterator()
        L_0x00f3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r11.next()
            c5.j$a r0 = (c5.j.a) r0
            r0.c()
            goto L_0x00f3
        L_0x0103:
            return
        L_0x0104:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0107:
            throw r11
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.b.h(boolean):void");
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean i() {
        int i10 = this.f4268n;
        return i10 == 3 || i10 == 4;
    }

    public final void j(Exception exc) {
        this.f4273s = new g.a(exc);
        g(new r1.c(exc));
        if (this.f4268n != 4) {
            this.f4268n = 1;
        }
    }

    public final void k(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            ((d.e) this.f4257c).b(this);
        } else {
            j(exc);
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean l(boolean z10) {
        Set<E> set;
        if (i()) {
            return true;
        }
        try {
            byte[] l10 = this.f4256b.l();
            this.f4274t = l10;
            this.f4272r = this.f4256b.g(l10);
            h<j.a> hVar = this.f4263i;
            synchronized (hVar.f26452a) {
                set = hVar.f26454c;
            }
            for (E d10 : set) {
                d10.d();
            }
            this.f4268n = 3;
            this.f4274t.getClass();
            return true;
        } catch (NotProvisionedException e10) {
            if (z10) {
                ((d.e) this.f4257c).b(this);
                return false;
            }
            j(e10);
            return false;
        } catch (Exception e11) {
            j(e11);
            return false;
        }
    }

    public final void m(byte[] bArr, int i10, boolean z10) {
        try {
            q.a j10 = this.f4256b.j(bArr, this.f4255a, i10, this.f4262h);
            this.f4276v = j10;
            c cVar = this.f4271q;
            int i11 = e0.f26436a;
            j10.getClass();
            cVar.a(1, j10, z10);
        } catch (Exception e10) {
            k(e10);
        }
    }

    public void n() {
        q.d h10 = this.f4256b.h();
        this.f4277w = h10;
        c cVar = this.f4271q;
        int i10 = e0.f26436a;
        h10.getClass();
        cVar.a(0, h10, true);
    }

    public Map<String, String> o() {
        byte[] bArr = this.f4274t;
        if (bArr == null) {
            return null;
        }
        return this.f4256b.d(bArr);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean p() {
        try {
            this.f4256b.c(this.f4274t, this.f4275u);
            return true;
        } catch (Exception e10) {
            p.b("DefaultDrmSession", "Error trying to restore keys.", e10);
            j(e10);
            return false;
        }
    }
}
