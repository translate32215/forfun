package com.google.android.exoplayer2.source.hls;

import c5.j;
import c5.l;
import c5.m;
import com.google.android.exoplayer2.source.hls.f;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.k;
import de.a0;
import e6.e;
import e6.f;
import f6.b;
import f6.i;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import u6.h;
import x4.e0;
import x4.z;
import y5.c;
import z5.o;
import z5.r;
import z5.v;
import z5.w;

public final class HlsMediaSource extends z5.a implements i.e {
    public e0.f A;
    public u6.i B;

    /* renamed from: g  reason: collision with root package name */
    public final f f5132g;

    /* renamed from: h  reason: collision with root package name */
    public final e0.g f5133h;

    /* renamed from: i  reason: collision with root package name */
    public final e f5134i;

    /* renamed from: r  reason: collision with root package name */
    public final a0 f5135r;

    /* renamed from: s  reason: collision with root package name */
    public final l f5136s;

    /* renamed from: t  reason: collision with root package name */
    public final h f5137t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f5138u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5139v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5140w;

    /* renamed from: x  reason: collision with root package name */
    public final i f5141x;

    /* renamed from: y  reason: collision with root package name */
    public final long f5142y;

    /* renamed from: z  reason: collision with root package name */
    public final e0 f5143z;

    public static final class Factory implements w {

        /* renamed from: a  reason: collision with root package name */
        public final e f5144a;

        /* renamed from: b  reason: collision with root package name */
        public f f5145b = f.f13618a;

        /* renamed from: c  reason: collision with root package name */
        public f6.h f5146c = new f6.a();

        /* renamed from: d  reason: collision with root package name */
        public i.a f5147d = b.f18129w;

        /* renamed from: e  reason: collision with root package name */
        public a0 f5148e = new a0(2);

        /* renamed from: f  reason: collision with root package name */
        public m f5149f = new c5.e();

        /* renamed from: g  reason: collision with root package name */
        public h f5150g = new k();

        /* renamed from: h  reason: collision with root package name */
        public boolean f5151h;

        /* renamed from: i  reason: collision with root package name */
        public int f5152i = 1;

        /* renamed from: j  reason: collision with root package name */
        public List<c> f5153j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        public long f5154k = -9223372036854775807L;

        public Factory(e.a aVar) {
            this.f5144a = new e6.b(aVar);
        }
    }

    static {
        z.a("goog.exo.hls");
    }

    public HlsMediaSource(e0 e0Var, e6.e eVar, f fVar, a0 a0Var, l lVar, h hVar, i iVar, long j10, boolean z10, int i10, boolean z11, a aVar) {
        e0.g gVar = e0Var.f27504b;
        gVar.getClass();
        this.f5133h = gVar;
        this.f5143z = e0Var;
        this.A = e0Var.f27505c;
        this.f5134i = eVar;
        this.f5132g = fVar;
        this.f5135r = a0Var;
        this.f5136s = lVar;
        this.f5137t = hVar;
        this.f5141x = iVar;
        this.f5142y = j10;
        this.f5138u = z10;
        this.f5139v = i10;
        this.f5140w = z11;
    }

    public e0 a() {
        return this.f5143z;
    }

    public void c() throws IOException {
        this.f5141x.d();
    }

    public void g(o oVar) {
        d dVar = (d) oVar;
        dVar.f5204b.e(dVar);
        for (f fVar : dVar.A) {
            if (fVar.K) {
                for (f.d A2 : fVar.C) {
                    A2.A();
                }
            }
            fVar.f5241i.g(fVar);
            fVar.f5252y.removeCallbacksAndMessages((Object) null);
            fVar.O = true;
            fVar.f5253z.clear();
        }
        dVar.f5218x = null;
    }

    public o o(r.a aVar, u6.f fVar, long j10) {
        r.a aVar2 = aVar;
        v.a r10 = this.f28511c.r(0, aVar2, 0);
        j.a g10 = this.f28512d.g(0, aVar2);
        return new d(this.f5132g, this.f5141x, this.f5134i, this.B, this.f5136s, g10, this.f5137t, r10, fVar, this.f5135r, this.f5138u, this.f5139v, this.f5140w);
    }

    public void u(u6.i iVar) {
        this.B = iVar;
        this.f5136s.b();
        this.f5141x.j(this.f5133h.f27554a, r((r.a) null), this);
    }

    public void w() {
        this.f5141x.stop();
        this.f5136s.a();
    }
}
