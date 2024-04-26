package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import b6.d;
import b6.f;
import b6.g;
import b6.j;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.o;
import g6.a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import k5.m;
import k5.n;
import r6.h;
import u6.i;
import v6.c0;
import v6.e0;
import x4.b0;
import x4.z0;

/* compiled from: DefaultSsChunkSource */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final o f5289a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5290b;

    /* renamed from: c  reason: collision with root package name */
    public final f[] f5291c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5292d;

    /* renamed from: e  reason: collision with root package name */
    public h f5293e;

    /* renamed from: f  reason: collision with root package name */
    public g6.a f5294f;

    /* renamed from: g  reason: collision with root package name */
    public int f5295g;

    /* renamed from: h  reason: collision with root package name */
    public IOException f5296h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* compiled from: DefaultSsChunkSource */
    public static final class C0078a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f5297a;

        public C0078a(e.a aVar) {
            this.f5297a = aVar;
        }

        public b a(o oVar, g6.a aVar, int i10, h hVar, i iVar) {
            e a10 = this.f5297a.a();
            if (iVar != null) {
                a10.P(iVar);
            }
            return new a(oVar, aVar, i10, hVar, a10);
        }
    }

    /* compiled from: DefaultSsChunkSource */
    public static final class b extends b6.b {
        public b(a.b bVar, int i10, int i11) {
            super((long) i11, (long) (bVar.f18523k - 1));
        }
    }

    public a(o oVar, g6.a aVar, int i10, h hVar, e eVar) {
        n[] nVarArr;
        g6.a aVar2 = aVar;
        int i11 = i10;
        h hVar2 = hVar;
        this.f5289a = oVar;
        this.f5294f = aVar2;
        this.f5290b = i11;
        this.f5293e = hVar2;
        this.f5292d = eVar;
        a.b bVar = aVar2.f18507f[i11];
        this.f5291c = new f[hVar.length()];
        int i12 = 0;
        while (i12 < this.f5291c.length) {
            int f10 = hVar2.f(i12);
            b0 b0Var = bVar.f18522j[f10];
            if (b0Var.f27411w != null) {
                a.C0145a aVar3 = aVar2.f18506e;
                aVar3.getClass();
                nVarArr = aVar3.f18512c;
            } else {
                nVarArr = null;
            }
            int i13 = bVar.f18513a;
            int i14 = i12;
            m mVar = r7;
            m mVar2 = new m(f10, i13, bVar.f18515c, -9223372036854775807L, aVar2.f18508g, b0Var, 0, nVarArr, i13 == 2 ? 4 : 0, (long[]) null, (long[]) null);
            this.f5291c[i14] = new d(new k5.f(3, (v6.b0) null, mVar, Collections.emptyList()), bVar.f18513a, b0Var);
            i12 = i14 + 1;
        }
    }

    public void a() {
        for (f fVar : this.f5291c) {
            ((d) fVar).f3573a.a();
        }
    }

    public void b() throws IOException {
        IOException iOException = this.f5296h;
        if (iOException == null) {
            this.f5289a.b();
            return;
        }
        throw iOException;
    }

    public long c(long j10, z0 z0Var) {
        a.b bVar = this.f5294f.f18507f[this.f5290b];
        int f10 = e0.f(bVar.f18527o, j10, true, true);
        long[] jArr = bVar.f18527o;
        long j11 = jArr[f10];
        return z0Var.a(j10, j11, (j11 >= j10 || f10 >= bVar.f18523k - 1) ? j11 : jArr[f10 + 1]);
    }

    public void d(h hVar) {
        this.f5293e = hVar;
    }

    public boolean e(long j10, b6.e eVar, List<? extends b6.m> list) {
        if (this.f5296h != null) {
            return false;
        }
        return this.f5293e.r(j10, eVar, list);
    }

    public boolean g(b6.e eVar, boolean z10, Exception exc, long j10) {
        if (z10 && j10 != -9223372036854775807L) {
            h hVar = this.f5293e;
            if (hVar.a(hVar.o(eVar.f3592d), j10)) {
                return true;
            }
        }
        return false;
    }

    public void h(g6.a aVar) {
        a.b[] bVarArr = this.f5294f.f18507f;
        int i10 = this.f5290b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f18523k;
        a.b bVar2 = aVar.f18507f[i10];
        if (i11 == 0 || bVar2.f18523k == 0) {
            this.f5295g += i11;
        } else {
            int i12 = i11 - 1;
            long b10 = bVar.b(i12) + bVar.f18527o[i12];
            long j10 = bVar2.f18527o[0];
            if (b10 <= j10) {
                this.f5295g += i11;
            } else {
                this.f5295g = bVar.c(j10) + this.f5295g;
            }
        }
        this.f5294f = aVar;
    }

    public int i(long j10, List<? extends b6.m> list) {
        if (this.f5296h != null || this.f5293e.length() < 2) {
            return list.size();
        }
        return this.f5293e.g(j10, list);
    }

    public final void j(long j10, long j11, List<? extends b6.m> list, g gVar) {
        int i10;
        long j12;
        long j13 = j11;
        g gVar2 = gVar;
        if (this.f5296h == null) {
            g6.a aVar = this.f5294f;
            a.b bVar = aVar.f18507f[this.f5290b];
            if (bVar.f18523k == 0) {
                gVar2.f3599b = !aVar.f18505d;
                return;
            }
            if (list.isEmpty()) {
                i10 = e0.f(bVar.f18527o, j13, true, true);
                List<? extends b6.m> list2 = list;
            } else {
                i10 = (int) (((b6.m) list.get(list.size() - 1)).c() - ((long) this.f5295g));
                if (i10 < 0) {
                    this.f5296h = new z5.b();
                    return;
                }
            }
            int i11 = i10;
            if (i11 >= bVar.f18523k) {
                gVar2.f3599b = !this.f5294f.f18505d;
                return;
            }
            long j14 = j13 - j10;
            g6.a aVar2 = this.f5294f;
            if (!aVar2.f18505d) {
                j12 = -9223372036854775807L;
            } else {
                a.b bVar2 = aVar2.f18507f[this.f5290b];
                int i12 = bVar2.f18523k - 1;
                j12 = (bVar2.b(i12) + bVar2.f18527o[i12]) - j10;
            }
            int length = this.f5293e.length();
            b6.n[] nVarArr = new b6.n[length];
            for (int i13 = 0; i13 < length; i13++) {
                nVarArr[i13] = new b(bVar, this.f5293e.f(i13), i11);
            }
            int i14 = i11;
            this.f5293e.h(j10, j14, j12, list, nVarArr);
            long j15 = bVar.f18527o[i14];
            long b10 = bVar.b(i14) + j15;
            long j16 = list.isEmpty() ? j11 : -9223372036854775807L;
            int i15 = i14 + this.f5295g;
            int m10 = this.f5293e.m();
            f fVar = this.f5291c[m10];
            int f10 = this.f5293e.f(m10);
            v6.a.d(bVar.f18522j != null);
            v6.a.d(bVar.f18526n != null);
            v6.a.d(i14 < bVar.f18526n.size());
            String num = Integer.toString(bVar.f18522j[f10].f27404h);
            String l10 = bVar.f18526n.get(i14).toString();
            Uri d10 = c0.d(bVar.f18524l, bVar.f18525m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
            b0 k10 = this.f5293e.k();
            e eVar = this.f5292d;
            int l11 = this.f5293e.l();
            Object p10 = this.f5293e.p();
            u6.e eVar2 = r3;
            u6.e eVar3 = new u6.e(d10, 0, -1);
            gVar2.f3598a = new j(eVar, eVar2, k10, l11, p10, j15, b10, j16, -9223372036854775807L, (long) i15, 1, j15, fVar);
        }
    }

    public void k(b6.e eVar) {
    }
}
