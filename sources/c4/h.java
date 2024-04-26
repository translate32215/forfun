package c4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import d4.g;
import e4.c;
import g4.j;
import h4.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k3.e;
import m3.k;
import m3.l;
import m3.r;
import m3.w;
import v3.a;

/* compiled from: SingleRequest */
public final class h<R> implements c, g, g {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f4221a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4222b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4223c;

    /* renamed from: d  reason: collision with root package name */
    public final e<R> f4224d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4225e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f4226f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.d f4227g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4228h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f4229i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f4230j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4231k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4232l;

    /* renamed from: m  reason: collision with root package name */
    public final f f4233m;

    /* renamed from: n  reason: collision with root package name */
    public final d4.h<R> f4234n;

    /* renamed from: o  reason: collision with root package name */
    public final List<e<R>> f4235o;

    /* renamed from: p  reason: collision with root package name */
    public final c<? super R> f4236p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f4237q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f4238r;

    /* renamed from: s  reason: collision with root package name */
    public l.d f4239s;

    /* renamed from: t  reason: collision with root package name */
    public long f4240t;

    /* renamed from: u  reason: collision with root package name */
    public volatile l f4241u;

    /* renamed from: v  reason: collision with root package name */
    public int f4242v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f4243w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f4244x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f4245y;

    /* renamed from: z  reason: collision with root package name */
    public int f4246z;

    public h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, f fVar, d4.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, l lVar, c<? super R> cVar, Executor executor) {
        com.bumptech.glide.d dVar3 = dVar;
        this.f4221a = D ? String.valueOf(hashCode()) : null;
        this.f4222b = new d.b();
        this.f4223c = obj;
        this.f4226f = context;
        this.f4227g = dVar3;
        this.f4228h = obj2;
        this.f4229i = cls;
        this.f4230j = aVar;
        this.f4231k = i10;
        this.f4232l = i11;
        this.f4233m = fVar;
        this.f4234n = hVar;
        this.f4224d = eVar;
        this.f4235o = list;
        this.f4225e = dVar2;
        this.f4241u = lVar;
        this.f4236p = cVar;
        this.f4237q = executor;
        this.f4242v = 1;
        if (this.C == null) {
            if (dVar3.f4915h.f4918a.containsKey(c.C0071c.class)) {
                this.C = new RuntimeException("Glide request origin trace");
            }
        }
    }

    public void a(int i10, int i11) {
        Object obj;
        int i12;
        l.d b10;
        int i13 = i10;
        int i14 = i11;
        this.f4222b.a();
        Object obj2 = this.f4223c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    n("Got onSizeReady in " + g4.f.a(this.f4240t));
                }
                if (this.f4242v == 3) {
                    this.f4242v = 2;
                    float f10 = this.f4230j.f4198b;
                    if (i13 != Integer.MIN_VALUE) {
                        i13 = Math.round(((float) i13) * f10);
                    }
                    this.f4246z = i13;
                    if (i14 == Integer.MIN_VALUE) {
                        i12 = i14;
                    } else {
                        i12 = Math.round(f10 * ((float) i14));
                    }
                    this.A = i12;
                    if (z10) {
                        n("finished setup for calling load in " + g4.f.a(this.f4240t));
                    }
                    l lVar = this.f4241u;
                    com.bumptech.glide.d dVar = this.f4227g;
                    Object obj3 = this.f4228h;
                    a<?> aVar = this.f4230j;
                    k3.c cVar = aVar.f4208t;
                    int i15 = this.f4246z;
                    int i16 = this.A;
                    Class<?> cls = aVar.A;
                    Class<R> cls2 = this.f4229i;
                    f fVar = this.f4233m;
                    k kVar = aVar.f4199c;
                    Map<Class<?>, k3.g<?>> map = aVar.f4214z;
                    boolean z11 = aVar.f4209u;
                    boolean z12 = aVar.G;
                    e eVar = aVar.f4213y;
                    Object obj4 = obj2;
                    try {
                        boolean z13 = aVar.f4205i;
                        boolean z14 = aVar.E;
                        boolean z15 = aVar.H;
                        e eVar2 = eVar;
                        obj = obj4;
                        try {
                            b10 = lVar.b(dVar, obj3, cVar, i15, i16, cls, cls2, fVar, kVar, map, z11, z12, eVar2, z13, z14, z15, aVar.F, this, this.f4237q);
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                        try {
                            this.f4239s = b10;
                            if (this.f4242v != 2) {
                                this.f4239s = null;
                            }
                            if (z10) {
                                n("finished onSizeReady in " + g4.f.a(this.f4240t));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public final void b() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void c() {
        b();
        this.f4222b.a();
        this.f4234n.a(this);
        l.d dVar = this.f4239s;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.f21613a.h(dVar.f21614b);
            }
            this.f4239s = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r5.f4241u.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4223c
            monitor-enter(r0)
            r5.b()     // Catch:{ all -> 0x0042 }
            h4.d r1 = r5.f4222b     // Catch:{ all -> 0x0042 }
            r1.a()     // Catch:{ all -> 0x0042 }
            int r1 = r5.f4242v     // Catch:{ all -> 0x0042 }
            r2 = 6
            if (r1 != r2) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0012:
            r5.c()     // Catch:{ all -> 0x0042 }
            m3.w<R> r1 = r5.f4238r     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r1 == 0) goto L_0x001d
            r5.f4238r = r3     // Catch:{ all -> 0x0042 }
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            c4.d r3 = r5.f4225e     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.b(r5)     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r3 = 0
            goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            if (r3 == 0) goto L_0x0037
            d4.h<R> r3 = r5.f4234n     // Catch:{ all -> 0x0042 }
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch:{ all -> 0x0042 }
            r3.h(r4)     // Catch:{ all -> 0x0042 }
        L_0x0037:
            r5.f4242v = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0041
            m3.l r0 = r5.f4241u
            r0.f(r1)
        L_0x0041:
            return
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.clear():void");
    }

    public final Drawable d() {
        int i10;
        if (this.f4245y == null) {
            a<?> aVar = this.f4230j;
            Drawable drawable = aVar.f4211w;
            this.f4245y = drawable;
            if (drawable == null && (i10 = aVar.f4212x) > 0) {
                this.f4245y = m(i10);
            }
        }
        return this.f4245y;
    }

    public final Drawable e() {
        int i10;
        if (this.f4244x == null) {
            a<?> aVar = this.f4230j;
            Drawable drawable = aVar.f4203g;
            this.f4244x = drawable;
            if (drawable == null && (i10 = aVar.f4204h) > 0) {
                this.f4244x = m(i10);
            }
        }
        return this.f4244x;
    }

    public final boolean f() {
        d dVar = this.f4225e;
        return dVar == null || !dVar.a().h();
    }

    public void g() {
        synchronized (this.f4223c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f4223c) {
            z10 = this.f4242v == 4;
        }
        return z10;
    }

    public boolean i(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        f fVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        f fVar2;
        int size2;
        boolean z10;
        c cVar2 = cVar;
        if (!(cVar2 instanceof h)) {
            return false;
        }
        synchronized (this.f4223c) {
            i10 = this.f4231k;
            i11 = this.f4232l;
            obj = this.f4228h;
            cls = this.f4229i;
            aVar = this.f4230j;
            fVar = this.f4233m;
            List<e<R>> list = this.f4235o;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar2;
        synchronized (hVar.f4223c) {
            i12 = hVar.f4231k;
            i13 = hVar.f4232l;
            obj2 = hVar.f4228h;
            cls2 = hVar.f4229i;
            aVar2 = hVar.f4230j;
            fVar2 = hVar.f4233m;
            List<e<R>> list2 = hVar.f4235o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i10 == i12 && i11 == i13) {
            char[] cArr = j.f18467a;
            if (obj == null) {
                z10 = obj2 == null;
            } else if (obj instanceof q3.k) {
                z10 = ((q3.k) obj).a(obj2);
            } else {
                z10 = obj.equals(obj2);
            }
            return z10 && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2;
        }
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f4223c) {
            int i10 = this.f4242v;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f4223c) {
            z10 = this.f4242v == 6;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4223c
            monitor-enter(r0)
            r6.b()     // Catch:{ all -> 0x00ac }
            h4.d r1 = r6.f4222b     // Catch:{ all -> 0x00ac }
            r1.a()     // Catch:{ all -> 0x00ac }
            int r1 = g4.f.f18457b     // Catch:{ all -> 0x00ac }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00ac }
            r6.f4240t = r1     // Catch:{ all -> 0x00ac }
            java.lang.Object r1 = r6.f4228h     // Catch:{ all -> 0x00ac }
            r2 = 3
            if (r1 != 0) goto L_0x003d
            int r1 = r6.f4231k     // Catch:{ all -> 0x00ac }
            int r3 = r6.f4232l     // Catch:{ all -> 0x00ac }
            boolean r1 = g4.j.j(r1, r3)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x002a
            int r1 = r6.f4231k     // Catch:{ all -> 0x00ac }
            r6.f4246z = r1     // Catch:{ all -> 0x00ac }
            int r1 = r6.f4232l     // Catch:{ all -> 0x00ac }
            r6.A = r1     // Catch:{ all -> 0x00ac }
        L_0x002a:
            android.graphics.drawable.Drawable r1 = r6.d()     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x0031
            r2 = 5
        L_0x0031:
            m3.r r1 = new m3.r     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x00ac }
            r6.o(r1, r2)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return
        L_0x003d:
            int r1 = r6.f4242v     // Catch:{ all -> 0x00ac }
            r3 = 2
            if (r1 == r3) goto L_0x00a4
            r4 = 4
            r5 = 0
            if (r1 != r4) goto L_0x004f
            m3.w<R> r1 = r6.f4238r     // Catch:{ all -> 0x00ac }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.a.MEMORY_CACHE     // Catch:{ all -> 0x00ac }
            r6.p(r1, r2, r5)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return
        L_0x004f:
            r6.f4242v = r2     // Catch:{ all -> 0x00ac }
            int r1 = r6.f4231k     // Catch:{ all -> 0x00ac }
            int r4 = r6.f4232l     // Catch:{ all -> 0x00ac }
            boolean r1 = g4.j.j(r1, r4)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x0063
            int r1 = r6.f4231k     // Catch:{ all -> 0x00ac }
            int r4 = r6.f4232l     // Catch:{ all -> 0x00ac }
            r6.a(r1, r4)     // Catch:{ all -> 0x00ac }
            goto L_0x0068
        L_0x0063:
            d4.h<R> r1 = r6.f4234n     // Catch:{ all -> 0x00ac }
            r1.b(r6)     // Catch:{ all -> 0x00ac }
        L_0x0068:
            int r1 = r6.f4242v     // Catch:{ all -> 0x00ac }
            if (r1 == r3) goto L_0x006e
            if (r1 != r2) goto L_0x0084
        L_0x006e:
            c4.d r1 = r6.f4225e     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x0078
            boolean r1 = r1.c(r6)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            r5 = 1
        L_0x0079:
            if (r5 == 0) goto L_0x0084
            d4.h<R> r1 = r6.f4234n     // Catch:{ all -> 0x00ac }
            android.graphics.drawable.Drawable r2 = r6.e()     // Catch:{ all -> 0x00ac }
            r1.e(r2)     // Catch:{ all -> 0x00ac }
        L_0x0084:
            boolean r1 = D     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00ac }
            long r2 = r6.f4240t     // Catch:{ all -> 0x00ac }
            double r2 = g4.f.a(r2)     // Catch:{ all -> 0x00ac }
            r1.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ac }
            r6.n(r1)     // Catch:{ all -> 0x00ac }
        L_0x00a2:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return
        L_0x00a4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.k():void");
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f4223c) {
            z10 = this.f4242v == 4;
        }
        return z10;
    }

    public final Drawable m(int i10) {
        Resources.Theme theme = this.f4230j.C;
        if (theme == null) {
            theme = this.f4226f.getTheme();
        }
        com.bumptech.glide.d dVar = this.f4227g;
        return a.a(dVar, dVar, i10, theme);
    }

    public final void n(String str) {
        StringBuilder a10 = t.f.a(str, " this: ");
        a10.append(this.f4221a);
        Log.v("Request", a10.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void o(r rVar, int i10) {
        boolean z10;
        this.f4222b.a();
        synchronized (this.f4223c) {
            rVar.getClass();
            int i11 = this.f4227g.f4916i;
            if (i11 <= i10) {
                Log.w("Glide", "Load failed for " + this.f4228h + " with size [" + this.f4246z + "x" + this.A + "]", rVar);
                if (i11 <= 4) {
                    rVar.e("Glide");
                }
            }
            this.f4239s = null;
            this.f4242v = 5;
            boolean z11 = true;
            this.B = true;
            try {
                List<e<R>> list = this.f4235o;
                if (list != null) {
                    z10 = false;
                    for (e<R> b10 : list) {
                        z10 |= b10.b(rVar, this.f4228h, this.f4234n, f());
                    }
                } else {
                    z10 = false;
                }
                e<R> eVar = this.f4224d;
                if (eVar == null || !eVar.b(rVar, this.f4228h, this.f4234n, f())) {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    r();
                }
                this.B = false;
                d dVar = this.f4225e;
                if (dVar != null) {
                    dVar.d(this);
                }
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r6.f4241u.f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(m3.w<?> r7, com.bumptech.glide.load.a r8, boolean r9) {
        /*
            r6 = this;
            h4.d r9 = r6.f4222b
            r9.a()
            r9 = 0
            java.lang.Object r0 = r6.f4223c     // Catch:{ all -> 0x00c5 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c5 }
            r6.f4239s = r9     // Catch:{ all -> 0x00b7 }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            m3.r r7 = new m3.r     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r8.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.Class<R> r2 = r6.f4229i     // Catch:{ all -> 0x00b7 }
            r8.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b7 }
            r7.<init>(r8)     // Catch:{ all -> 0x00b7 }
            r6.o(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0064
            java.lang.Class<R> r3 = r6.f4229i     // Catch:{ all -> 0x00b7 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b7 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b7 }
            if (r3 != 0) goto L_0x0043
            goto L_0x0064
        L_0x0043:
            c4.d r1 = r6.f4225e     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.e(r6)     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x005f
            r6.f4238r = r9     // Catch:{ all -> 0x00b3 }
            r8 = 4
            r6.f4242v = r8     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
        L_0x0059:
            m3.l r8 = r6.f4241u
            r8.f(r7)
            return
        L_0x005f:
            r6.q(r7, r2, r8)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0064:
            r6.f4238r = r9     // Catch:{ all -> 0x00b3 }
            m3.r r8 = new m3.r     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r9.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.Class<R> r3 = r6.f4229i     // Catch:{ all -> 0x00b3 }
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0083
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b3 }
            goto L_0x0085
        L_0x0083:
            java.lang.String r3 = ""
        L_0x0085:
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            r9.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            r9.append(r7)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = ""
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a4:
            r9.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b3 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b3 }
            r6.o(r8, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x0059
        L_0x00b3:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00bc
        L_0x00b7:
            r7 = move-exception
            r8 = r6
        L_0x00b9:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00bc:
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r8     // Catch:{ all -> 0x00be }
        L_0x00be:
            r8 = move-exception
            goto L_0x00c7
        L_0x00c0:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00b9
        L_0x00c5:
            r8 = move-exception
            r7 = r6
        L_0x00c7:
            if (r9 == 0) goto L_0x00ce
            m3.l r7 = r7.f4241u
            r7.f(r9)
        L_0x00ce:
            goto L_0x00d0
        L_0x00cf:
            throw r8
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.p(m3.w, com.bumptech.glide.load.a, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(m3.w r11, java.lang.Object r12, com.bumptech.glide.load.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.f()
            r0 = 4
            r10.f4242v = r0
            r10.f4238r = r11
            com.bumptech.glide.d r11 = r10.f4227g
            int r11 = r11.f4916i
            r0 = 3
            if (r11 > r0) goto L_0x0063
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = android.support.v4.media.a.a(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f4228h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f4246z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f4240t
            double r0 = g4.f.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x0063:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<c4.e<R>> r0 = r10.f4235o     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x008a
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b7 }
            r0 = 0
            r9 = 0
        L_0x0071:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b7 }
            c4.e r0 = (c4.e) r0     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r10.f4228h     // Catch:{ all -> 0x00b7 }
            d4.h<R> r3 = r10.f4234n     // Catch:{ all -> 0x00b7 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b7 }
            r9 = r9 | r0
            goto L_0x0071
        L_0x008a:
            r9 = 0
        L_0x008b:
            c4.e<R> r0 = r10.f4224d     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r10.f4228h     // Catch:{ all -> 0x00b7 }
            d4.h<R> r3 = r10.f4234n     // Catch:{ all -> 0x00b7 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r13 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b7 }
            if (r13 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r11 = 0
        L_0x009e:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00ad
            e4.c<? super R> r11 = r10.f4236p     // Catch:{ all -> 0x00b7 }
            r11.getClass()     // Catch:{ all -> 0x00b7 }
            e4.a<?> r11 = e4.a.f13588a     // Catch:{ all -> 0x00b7 }
            d4.h<R> r13 = r10.f4234n     // Catch:{ all -> 0x00b7 }
            r13.d(r12, r11)     // Catch:{ all -> 0x00b7 }
        L_0x00ad:
            r10.B = r7
            c4.d r11 = r10.f4225e
            if (r11 == 0) goto L_0x00b6
            r11.f(r10)
        L_0x00b6:
            return
        L_0x00b7:
            r11 = move-exception
            r10.B = r7
            goto L_0x00bc
        L_0x00bb:
            throw r11
        L_0x00bc:
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.q(m3.w, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    public final void r() {
        int i10;
        d dVar = this.f4225e;
        if (dVar == null || dVar.c(this)) {
            Drawable drawable = null;
            if (this.f4228h == null) {
                drawable = d();
            }
            if (drawable == null) {
                if (this.f4243w == null) {
                    a<?> aVar = this.f4230j;
                    Drawable drawable2 = aVar.f4201e;
                    this.f4243w = drawable2;
                    if (drawable2 == null && (i10 = aVar.f4202f) > 0) {
                        this.f4243w = m(i10);
                    }
                }
                drawable = this.f4243w;
            }
            if (drawable == null) {
                drawable = e();
            }
            this.f4234n.c(drawable);
        }
    }
}
