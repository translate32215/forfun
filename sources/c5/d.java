package c5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ba.o0;
import c5.b;
import c5.f;
import c5.g;
import c5.j;
import c5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import u6.h;
import v6.e0;
import v6.s;
import x4.b0;

/* compiled from: DefaultDrmSessionManager */
public class d implements l {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f4285b;

    /* renamed from: c  reason: collision with root package name */
    public final q.c f4286c;

    /* renamed from: d  reason: collision with root package name */
    public final x f4287d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, String> f4288e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4289f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4290g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4291h;

    /* renamed from: i  reason: collision with root package name */
    public final e f4292i = new e((a) null);

    /* renamed from: j  reason: collision with root package name */
    public final h f4293j;

    /* renamed from: k  reason: collision with root package name */
    public final f f4294k = new f((a) null);

    /* renamed from: l  reason: collision with root package name */
    public final long f4295l;

    /* renamed from: m  reason: collision with root package name */
    public final List<b> f4296m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final List<b> f4297n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final Set<b> f4298o = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: p  reason: collision with root package name */
    public int f4299p;

    /* renamed from: q  reason: collision with root package name */
    public q f4300q;

    /* renamed from: r  reason: collision with root package name */
    public b f4301r;

    /* renamed from: s  reason: collision with root package name */
    public b f4302s;

    /* renamed from: t  reason: collision with root package name */
    public Looper f4303t;

    /* renamed from: u  reason: collision with root package name */
    public Handler f4304u;

    /* renamed from: v  reason: collision with root package name */
    public int f4305v = 0;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f4306w;

    /* renamed from: x  reason: collision with root package name */
    public volatile c f4307x;

    /* compiled from: DefaultDrmSessionManager */
    public class b implements q.b {
        public b(a aVar) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSessionManager */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (b next : d.this.f4296m) {
                    if (Arrays.equals(next.f4274t, bArr)) {
                        if (message.what == 2 && next.f4259e == 0 && next.f4268n == 4) {
                            int i10 = e0.f26436a;
                            next.h(false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: c5.d$d  reason: collision with other inner class name */
    /* compiled from: DefaultDrmSessionManager */
    public static final class C0060d extends Exception {
        public C0060d(UUID uuid, a aVar) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    public class e implements b.a {
        public e(a aVar) {
        }

        public void a(Exception exc) {
            for (b j10 : d.this.f4297n) {
                j10.j(exc);
            }
            d.this.f4297n.clear();
        }

        public void b(b bVar) {
            if (!d.this.f4297n.contains(bVar)) {
                d.this.f4297n.add(bVar);
                if (d.this.f4297n.size() == 1) {
                    bVar.n();
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    public class f implements b.C0059b {
        public f(a aVar) {
        }
    }

    public d(UUID uuid, q.c cVar, x xVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, h hVar, long j10, a aVar) {
        uuid.getClass();
        v6.a.b(!x4.f.f27567b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f4285b = uuid;
        this.f4286c = cVar;
        this.f4287d = xVar;
        this.f4288e = hashMap;
        this.f4289f = z10;
        this.f4290g = iArr;
        this.f4291h = z11;
        this.f4293j = hVar;
        this.f4295l = j10;
    }

    public static List<f.b> g(f fVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(fVar.f4318d);
        for (int i10 = 0; i10 < fVar.f4318d; i10++) {
            f.b bVar = fVar.f4315a[i10];
            if ((bVar.b(uuid) || (x4.f.f27568c.equals(uuid) && bVar.b(x4.f.f27567b))) && (bVar.f4323e != null || z10)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final void a() {
        int i10 = this.f4299p - 1;
        this.f4299p = i10;
        if (i10 == 0) {
            if (this.f4295l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f4296m);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((b) arrayList.get(i11)).e((j.a) null);
                }
            }
            q qVar = this.f4300q;
            qVar.getClass();
            qVar.a();
            this.f4300q = null;
        }
    }

    public final void b() {
        int i10 = this.f4299p;
        this.f4299p = i10 + 1;
        if (i10 == 0) {
            v6.a.d(this.f4300q == null);
            q a10 = this.f4286c.a(this.f4285b);
            this.f4300q = a10;
            a10.k(new b((a) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class<? extends c5.p> c(x4.b0 r6) {
        /*
            r5 = this;
            c5.q r0 = r5.f4300q
            r0.getClass()
            java.lang.Class r0 = r0.b()
            c5.f r1 = r6.f27411w
            r2 = 0
            if (r1 != 0) goto L_0x002a
            java.lang.String r6 = r6.f27408t
            int r6 = v6.s.i(r6)
            int[] r1 = r5.f4290g
            int r3 = v6.e0.f26436a
        L_0x0018:
            int r3 = r1.length
            r4 = -1
            if (r2 >= r3) goto L_0x0024
            r3 = r1[r2]
            if (r3 != r6) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0024:
            r2 = -1
        L_0x0025:
            if (r2 == r4) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            return r0
        L_0x002a:
            byte[] r6 = r5.f4306w
            r3 = 1
            if (r6 == 0) goto L_0x0030
            goto L_0x008f
        L_0x0030:
            java.util.UUID r6 = r5.f4285b
            java.util.List r6 = g(r1, r6, r3)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0062
            int r6 = r1.f4318d
            if (r6 != r3) goto L_0x0090
            c5.f$b[] r6 = r1.f4315a
            r6 = r6[r2]
            java.util.UUID r3 = x4.f.f27567b
            boolean r6 = r6.b(r3)
            if (r6 == 0) goto L_0x0090
            java.lang.String r6 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            java.util.UUID r3 = r5.f4285b
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r3 = "DefaultDrmSessionMgr"
            android.util.Log.w(r3, r6)
        L_0x0062:
            java.lang.String r6 = r1.f4317c
            if (r6 == 0) goto L_0x008f
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x006f
            goto L_0x008f
        L_0x006f:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x007e
            int r6 = v6.e0.f26436a
            r1 = 25
            if (r6 < r1) goto L_0x0090
            goto L_0x008f
        L_0x007e:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0090
            java.lang.String r1 = "cens"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 1
        L_0x0090:
            if (r2 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            java.lang.Class<c5.a0> r0 = c5.a0.class
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.d.c(x4.b0):java.lang.Class");
    }

    public g d(Looper looper, j.a aVar, b0 b0Var) {
        List<f.b> list;
        Looper looper2 = this.f4303t;
        int i10 = 0;
        if (looper2 == null) {
            this.f4303t = looper;
            this.f4304u = new Handler(looper);
        } else {
            v6.a.d(looper2 == looper);
        }
        if (this.f4307x == null) {
            this.f4307x = new c(looper);
        }
        f fVar = b0Var.f27411w;
        b bVar = null;
        if (fVar == null) {
            int i11 = s.i(b0Var.f27408t);
            q qVar = this.f4300q;
            qVar.getClass();
            if (r.class.equals(qVar.b()) && r.f4341d) {
                return null;
            }
            int[] iArr = this.f4290g;
            int i12 = e0.f26436a;
            while (true) {
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1 || a0.class.equals(qVar.b())) {
                return null;
            }
            b bVar2 = this.f4301r;
            if (bVar2 == null) {
                ba.a<Object> aVar2 = ba.s.f3795b;
                b f10 = f(o0.f3765e, true, (j.a) null);
                this.f4296m.add(f10);
                this.f4301r = f10;
            } else {
                bVar2.d((j.a) null);
            }
            return this.f4301r;
        }
        if (this.f4306w == null) {
            list = g(fVar, this.f4285b, false);
            if (((ArrayList) list).isEmpty()) {
                C0060d dVar = new C0060d(this.f4285b, (a) null);
                if (aVar != null) {
                    aVar.e(dVar);
                }
                return new o(new g.a(dVar));
            }
        } else {
            list = null;
        }
        if (this.f4289f) {
            Iterator<b> it = this.f4296m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (e0.a(next.f4255a, list)) {
                    bVar = next;
                    break;
                }
            }
        } else {
            bVar = this.f4302s;
        }
        if (bVar == null) {
            bVar = f(list, false, aVar);
            if (!this.f4289f) {
                this.f4302s = bVar;
            }
            this.f4296m.add(bVar);
        } else {
            bVar.d(aVar);
        }
        return bVar;
    }

    public final b e(List<f.b> list, boolean z10, j.a aVar) {
        this.f4300q.getClass();
        UUID uuid = this.f4285b;
        q qVar = this.f4300q;
        e eVar = this.f4292i;
        f fVar = this.f4294k;
        int i10 = this.f4305v;
        byte[] bArr = this.f4306w;
        HashMap<String, String> hashMap = this.f4288e;
        x xVar = this.f4287d;
        Looper looper = this.f4303t;
        looper.getClass();
        b bVar = new b(uuid, qVar, eVar, fVar, list, i10, this.f4291h | z10, z10, bArr, hashMap, xVar, looper, this.f4293j);
        bVar.d(aVar);
        if (this.f4295l != -9223372036854775807L) {
            bVar.d((j.a) null);
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r2.o() == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c5.b f(java.util.List<c5.f.b> r8, boolean r9, c5.j.a r10) {
        /*
            r7 = this;
            c5.b r0 = r7.e(r8, r9, r10)
            int r1 = r0.f4268n
            r2 = 1
            if (r1 != r2) goto L_0x006f
            int r1 = v6.e0.f26436a
            r2 = 19
            if (r1 < r2) goto L_0x001e
            c5.g$a r1 = r0.f()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto L_0x006f
        L_0x001e:
            java.util.Set<c5.b> r1 = r7.f4298o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x006f
            java.util.Set<c5.b> r1 = r7.f4298o
            int r2 = ba.x.f3817c
            boolean r2 = r1 instanceof ba.x
            if (r2 == 0) goto L_0x003c
            boolean r2 = r1 instanceof java.util.SortedSet
            if (r2 != 0) goto L_0x003c
            r2 = r1
            ba.x r2 = (ba.x) r2
            boolean r3 = r2.o()
            if (r3 != 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            java.lang.Object[] r1 = r1.toArray()
            int r2 = r1.length
            ba.x r2 = ba.x.x(r2, r1)
        L_0x0045:
            ba.y0 r1 = r2.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r1.next()
            c5.g r2 = (c5.g) r2
            r2.e(r3)
            goto L_0x0049
        L_0x005a:
            r0.e(r10)
            long r1 = r7.f4295l
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            r0.e(r3)
        L_0x006b:
            c5.b r0 = r7.e(r8, r9, r10)
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.d.f(java.util.List, boolean, c5.j$a):c5.b");
    }
}
