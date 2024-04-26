package z5;

import android.net.Uri;
import c5.j;
import c5.l;
import c5.m;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.k;
import d5.o;
import u6.f;
import u6.h;
import u6.i;
import x4.c1;
import x4.e0;
import z5.r;
import z5.x;

/* compiled from: ProgressiveMediaSource */
public final class y extends a implements x.b {

    /* renamed from: g  reason: collision with root package name */
    public final e0 f28697g;

    /* renamed from: h  reason: collision with root package name */
    public final e0.g f28698h;

    /* renamed from: i  reason: collision with root package name */
    public final e.a f28699i;

    /* renamed from: r  reason: collision with root package name */
    public final o f28700r;

    /* renamed from: s  reason: collision with root package name */
    public final l f28701s;

    /* renamed from: t  reason: collision with root package name */
    public final h f28702t;

    /* renamed from: u  reason: collision with root package name */
    public final int f28703u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f28704v = true;

    /* renamed from: w  reason: collision with root package name */
    public long f28705w = -9223372036854775807L;

    /* renamed from: x  reason: collision with root package name */
    public boolean f28706x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f28707y;

    /* renamed from: z  reason: collision with root package name */
    public i f28708z;

    /* compiled from: ProgressiveMediaSource */
    public class a extends i {
        public a(y yVar, c1 c1Var) {
            super(c1Var);
        }

        public c1.c o(int i10, c1.c cVar, long j10) {
            this.f28592b.o(i10, cVar, j10);
            cVar.f27481l = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource */
    public static final class b implements w {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f28709a;

        /* renamed from: b  reason: collision with root package name */
        public o f28710b;

        /* renamed from: c  reason: collision with root package name */
        public m f28711c = new c5.e();

        /* renamed from: d  reason: collision with root package name */
        public h f28712d = new k();

        /* renamed from: e  reason: collision with root package name */
        public int f28713e = 1048576;

        public b(e.a aVar, o oVar) {
            this.f28709a = aVar;
            this.f28710b = oVar;
        }
    }

    public y(e0 e0Var, e.a aVar, o oVar, l lVar, h hVar, int i10) {
        e0.g gVar = e0Var.f27504b;
        gVar.getClass();
        this.f28698h = gVar;
        this.f28697g = e0Var;
        this.f28699i = aVar;
        this.f28700r = oVar;
        this.f28701s = lVar;
        this.f28702t = hVar;
        this.f28703u = i10;
    }

    public e0 a() {
        return this.f28697g;
    }

    public void c() {
    }

    public void g(o oVar) {
        x xVar = (x) oVar;
        if (xVar.D) {
            for (a0 A : xVar.A) {
                A.A();
            }
        }
        xVar.f28666s.g(xVar);
        xVar.f28671x.removeCallbacksAndMessages((Object) null);
        xVar.f28672y = null;
        xVar.Z = true;
    }

    public o o(r.a aVar, f fVar, long j10) {
        r.a aVar2 = aVar;
        e a10 = this.f28699i.a();
        i iVar = this.f28708z;
        if (iVar != null) {
            a10.P(iVar);
        }
        Uri uri = this.f28698h.f27554a;
        o oVar = this.f28700r;
        l lVar = this.f28701s;
        j.a g10 = this.f28512d.g(0, aVar);
        h hVar = this.f28702t;
        return new x(uri, a10, oVar, lVar, g10, hVar, this.f28511c.r(0, aVar, 0), this, fVar, this.f28698h.f27559f, this.f28703u);
    }

    public void u(i iVar) {
        this.f28708z = iVar;
        this.f28701s.b();
        x();
    }

    public void w() {
        this.f28701s.a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [z5.y$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r15 = this;
            z5.e0 r14 = new z5.e0
            long r3 = r15.f28705w
            boolean r9 = r15.f28706x
            boolean r11 = r15.f28707y
            x4.e0 r13 = r15.f28697g
            r5 = 0
            r7 = 0
            r10 = 0
            r12 = 0
            r0 = r14
            r1 = r3
            r0.<init>(r1, r3, r5, r7, r9, r10, r11, r12, r13)
            boolean r0 = r15.f28704v
            if (r0 == 0) goto L_0x001f
            z5.y$a r0 = new z5.y$a
            r0.<init>(r15, r14)
            r14 = r0
        L_0x001f:
            r15.v(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.y.x():void");
    }

    public void y(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f28705w;
        }
        if (this.f28704v || this.f28705w != j10 || this.f28706x != z10 || this.f28707y != z11) {
            this.f28705w = j10;
            this.f28706x = z10;
            this.f28707y = z11;
            this.f28704v = false;
            x();
        }
    }
}
