package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.activity.f;
import b6.h;
import c5.l;
import c5.m;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.p;
import de.a0;
import g6.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import u6.h;
import u6.i;
import x4.e0;
import x4.m0;
import x4.z;
import y5.c;
import z5.r;
import z5.v;
import z5.w;

public final class SsMediaSource extends z5.a implements n.b<p<g6.a>> {
    public static final /* synthetic */ int H = 0;
    public e A;
    public n B;
    public o C;
    public i D;
    public long E;
    public g6.a F = null;
    public Handler G;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5270g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f5271h;

    /* renamed from: i  reason: collision with root package name */
    public final e0 f5272i;

    /* renamed from: r  reason: collision with root package name */
    public final e.a f5273r;

    /* renamed from: s  reason: collision with root package name */
    public final b.a f5274s;

    /* renamed from: t  reason: collision with root package name */
    public final a0 f5275t;

    /* renamed from: u  reason: collision with root package name */
    public final l f5276u;

    /* renamed from: v  reason: collision with root package name */
    public final h f5277v;

    /* renamed from: w  reason: collision with root package name */
    public final long f5278w;

    /* renamed from: x  reason: collision with root package name */
    public final v.a f5279x;

    /* renamed from: y  reason: collision with root package name */
    public final p.a<? extends g6.a> f5280y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<c> f5281z;

    public static final class Factory implements w {

        /* renamed from: a  reason: collision with root package name */
        public final b.a f5282a;

        /* renamed from: b  reason: collision with root package name */
        public final e.a f5283b;

        /* renamed from: c  reason: collision with root package name */
        public a0 f5284c = new a0(2);

        /* renamed from: d  reason: collision with root package name */
        public m f5285d = new c5.e();

        /* renamed from: e  reason: collision with root package name */
        public h f5286e = new k();

        /* renamed from: f  reason: collision with root package name */
        public long f5287f = 30000;

        /* renamed from: g  reason: collision with root package name */
        public List<c> f5288g = Collections.emptyList();

        public Factory(e.a aVar) {
            this.f5282a = new a.C0078a(aVar);
            this.f5283b = aVar;
        }
    }

    static {
        z.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(e0 e0Var, g6.a aVar, e.a aVar2, p.a aVar3, b.a aVar4, a0 a0Var, l lVar, h hVar, long j10, a aVar5) {
        Uri uri;
        v6.a.d(true);
        this.f5272i = e0Var;
        e0.g gVar = e0Var.f27504b;
        gVar.getClass();
        if (gVar.f27554a.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            uri = gVar.f27554a;
            int i10 = v6.e0.f26436a;
            String V = v6.e0.V(uri.getPath());
            if (V != null) {
                Matcher matcher = v6.e0.f26444i.matcher(V);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.f5271h = uri;
        this.f5273r = aVar2;
        this.f5280y = aVar3;
        this.f5274s = aVar4;
        this.f5275t = a0Var;
        this.f5276u = lVar;
        this.f5277v = hVar;
        this.f5278w = j10;
        this.f5279x = r((r.a) null);
        this.f5270g = false;
        this.f5281z = new ArrayList<>();
    }

    public e0 a() {
        return this.f5272i;
    }

    public void c() throws IOException {
        this.C.b();
    }

    public void g(z5.o oVar) {
        c cVar = (c) oVar;
        for (b6.h w10 : cVar.f5310u) {
            w10.w((h.b) null);
        }
        cVar.f5308s = null;
        this.f5281z.remove(oVar);
    }

    public void k(n.e eVar, long j10, long j11, boolean z10) {
        p pVar = (p) eVar;
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        com.google.android.exoplayer2.upstream.r rVar = pVar.f5550d;
        z5.k kVar = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f5277v.getClass();
        this.f5279x.d(kVar, pVar.f5549c);
    }

    public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
        n.c cVar;
        IOException iOException2 = iOException;
        p pVar = (p) eVar;
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        com.google.android.exoplayer2.upstream.r rVar = pVar.f5550d;
        z5.k kVar = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        k kVar2 = (k) this.f5277v;
        long a10 = ((iOException2 instanceof m0) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof m.b) || (iOException2 instanceof n.h)) ? -9223372036854775807L : (long) c5.c.a(i10, -1, 1000, 5000);
        if (a10 == -9223372036854775807L) {
            cVar = n.f5530f;
        } else {
            cVar = n.c(false, a10);
        }
        boolean z10 = !cVar.a();
        this.f5279x.k(kVar, pVar.f5549c, iOException2, z10);
        if (z10) {
            this.f5277v.getClass();
        }
        return cVar;
    }

    public void n(n.e eVar, long j10, long j11) {
        p pVar = (p) eVar;
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        com.google.android.exoplayer2.upstream.r rVar = pVar.f5550d;
        z5.k kVar = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f5277v.getClass();
        this.f5279x.g(kVar, pVar.f5549c);
        this.F = (g6.a) pVar.f5552f;
        this.E = j10 - j11;
        x();
        if (this.F.f18505d) {
            this.G.postDelayed(new f(this), Math.max(0, (this.E + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public z5.o o(r.a aVar, u6.f fVar, long j10) {
        r.a aVar2 = aVar;
        v.a r10 = this.f28511c.r(0, aVar2, 0);
        c cVar = new c(this.F, this.f5274s, this.D, this.f5275t, this.f5276u, this.f28512d.g(0, aVar2), this.f5277v, r10, this.C, fVar);
        this.f5281z.add(cVar);
        return cVar;
    }

    public void u(i iVar) {
        this.D = iVar;
        this.f5276u.b();
        if (this.f5270g) {
            this.C = new o.a();
            x();
            return;
        }
        this.A = this.f5273r.a();
        n nVar = new n("Loader:Manifest");
        this.B = nVar;
        this.C = nVar;
        this.G = v6.e0.l();
        y();
    }

    public void w() {
        this.F = this.f5270g ? this.F : null;
        this.A = null;
        this.E = 0;
        n nVar = this.B;
        if (nVar != null) {
            nVar.g((n.f) null);
            this.B = null;
        }
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.G = null;
        }
        this.f5276u.a();
    }

    public final void x() {
        z5.e0 e0Var;
        for (int i10 = 0; i10 < this.f5281z.size(); i10++) {
            c cVar = this.f5281z.get(i10);
            g6.a aVar = this.F;
            cVar.f5309t = aVar;
            for (b6.h hVar : cVar.f5310u) {
                ((b) hVar.f3604e).h(aVar);
            }
            cVar.f5308s.d(cVar);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.F.f18507f) {
            if (bVar.f18523k > 0) {
                j11 = Math.min(j11, bVar.f18527o[0]);
                int i11 = bVar.f18523k;
                j10 = Math.max(j10, bVar.b(i11 - 1) + bVar.f18527o[i11 - 1]);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.F.f18505d ? -9223372036854775807L : 0;
            g6.a aVar2 = this.F;
            boolean z10 = aVar2.f18505d;
            e0Var = new z5.e0(j12, 0, 0, 0, true, z10, z10, aVar2, this.f5272i);
        } else {
            g6.a aVar3 = this.F;
            if (aVar3.f18505d) {
                long j13 = aVar3.f18509h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long b10 = j15 - x4.f.b(this.f5278w);
                if (b10 < 5000000) {
                    b10 = Math.min(5000000, j15 / 2);
                }
                e0Var = new z5.e0(-9223372036854775807L, j15, j14, b10, true, true, true, this.F, this.f5272i);
            } else {
                long j16 = aVar3.f18508g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                e0Var = new z5.e0(j11 + j17, j17, j11, 0, true, false, false, this.F, this.f5272i);
            }
        }
        v(e0Var);
    }

    public final void y() {
        if (!this.B.d()) {
            p pVar = new p(this.A, this.f5271h, 4, this.f5280y);
            this.f5279x.m(new z5.k(pVar.f5547a, pVar.f5548b, this.B.h(pVar, this, ((k) this.f5277v).a(pVar.f5549c))), pVar.f5549c);
        }
    }
}
