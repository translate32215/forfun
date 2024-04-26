package z5;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import u6.i;
import v6.e0;
import x4.c1;
import x4.e0;
import z5.f;
import z5.r;

/* compiled from: MaskingMediaSource */
public final class m extends f<Void> {

    /* renamed from: r  reason: collision with root package name */
    public final r f28607r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f28608s;

    /* renamed from: t  reason: collision with root package name */
    public final c1.c f28609t;

    /* renamed from: u  reason: collision with root package name */
    public final c1.b f28610u;

    /* renamed from: v  reason: collision with root package name */
    public a f28611v;

    /* renamed from: w  reason: collision with root package name */
    public l f28612w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f28613x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f28614y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f28615z;

    /* compiled from: MaskingMediaSource */
    public static final class a extends i {

        /* renamed from: e  reason: collision with root package name */
        public static final Object f28616e = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final Object f28617c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f28618d;

        public a(c1 c1Var, Object obj, Object obj2) {
            super(c1Var);
            this.f28617c = obj;
            this.f28618d = obj2;
        }

        public int b(Object obj) {
            Object obj2;
            c1 c1Var = this.f28592b;
            if (f28616e.equals(obj) && (obj2 = this.f28618d) != null) {
                obj = obj2;
            }
            return c1Var.b(obj);
        }

        public c1.b g(int i10, c1.b bVar, boolean z10) {
            this.f28592b.g(i10, bVar, z10);
            if (e0.a(bVar.f27463b, this.f28618d) && z10) {
                bVar.f27463b = f28616e;
            }
            return bVar;
        }

        public Object m(int i10) {
            Object m10 = this.f28592b.m(i10);
            return e0.a(m10, this.f28618d) ? f28616e : m10;
        }

        public c1.c o(int i10, c1.c cVar, long j10) {
            this.f28592b.o(i10, cVar, j10);
            if (e0.a(cVar.f27470a, this.f28617c)) {
                cVar.f27470a = c1.c.f27468r;
            }
            return cVar;
        }
    }

    /* compiled from: MaskingMediaSource */
    public static final class b extends c1 {

        /* renamed from: b  reason: collision with root package name */
        public final x4.e0 f28619b;

        public b(x4.e0 e0Var) {
            this.f28619b = e0Var;
        }

        public int b(Object obj) {
            return obj == a.f28616e ? 0 : -1;
        }

        public c1.b g(int i10, c1.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f28616e;
            }
            bVar.f(num, obj, 0, -9223372036854775807L, 0);
            return bVar;
        }

        public int i() {
            return 1;
        }

        public Object m(int i10) {
            return a.f28616e;
        }

        public c1.c o(int i10, c1.c cVar, long j10) {
            c1.c cVar2 = cVar;
            cVar.d(c1.c.f27468r, this.f28619b, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (e0.f) null, 0, -9223372036854775807L, 0, 0, 0);
            c1.c cVar3 = cVar;
            cVar3.f27481l = true;
            return cVar3;
        }

        public int p() {
            return 1;
        }
    }

    public m(r rVar, boolean z10) {
        this.f28607r = rVar;
        this.f28608s = z10 && rVar.d();
        this.f28609t = new c1.c();
        this.f28610u = new c1.b();
        c1 e10 = rVar.e();
        if (e10 != null) {
            this.f28611v = new a(e10, (Object) null, (Object) null);
            this.f28615z = true;
            return;
        }
        this.f28611v = new a(new b(rVar.a()), c1.c.f27468r, a.f28616e);
    }

    public x4.e0 a() {
        return this.f28607r.a();
    }

    public void c() {
    }

    public void g(o oVar) {
        l lVar = (l) oVar;
        if (lVar.f28604e != null) {
            r rVar = lVar.f28603d;
            rVar.getClass();
            rVar.g(lVar.f28604e);
        }
        if (oVar == this.f28612w) {
            this.f28612w = null;
        }
    }

    public void u(i iVar) {
        this.f28575i = iVar;
        this.f28574h = v6.e0.l();
        if (!this.f28608s) {
            this.f28613x = true;
            x(null, this.f28607r);
        }
    }

    public void w() {
        this.f28614y = false;
        this.f28613x = false;
        for (f.b next : this.f28573g.values()) {
            next.f28580a.b(next.f28581b);
            next.f28580a.l(next.f28582c);
        }
        this.f28573g.clear();
    }

    /* renamed from: y */
    public l o(r.a aVar, u6.f fVar, long j10) {
        l lVar = new l(aVar, fVar, j10);
        r rVar = this.f28607r;
        v6.a.d(lVar.f28603d == null);
        lVar.f28603d = rVar;
        if (this.f28614y) {
            Object obj = aVar.f28627a;
            if (this.f28611v.f28618d != null && obj.equals(a.f28616e)) {
                obj = this.f28611v.f28618d;
            }
            lVar.b(aVar.b(obj));
        } else {
            this.f28612w = lVar;
            if (!this.f28613x) {
                this.f28613x = true;
                x(null, this.f28607r);
            }
        }
        return lVar;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void z(long j10) {
        l lVar = this.f28612w;
        int b10 = this.f28611v.b(lVar.f28600a.f28627a);
        if (b10 != -1) {
            long j11 = this.f28611v.f(b10, this.f28610u).f27465d;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            lVar.f28606g = j10;
        }
    }
}
