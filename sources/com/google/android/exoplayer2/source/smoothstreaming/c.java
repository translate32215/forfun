package com.google.android.exoplayer2.source.smoothstreaming;

import b2.t;
import b6.h;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import de.a0;
import g6.a;
import java.io.IOException;
import java.util.ArrayList;
import u6.f;
import u6.i;
import x4.b0;
import x4.z0;
import z5.c0;
import z5.f0;
import z5.g0;
import z5.o;
import z5.v;

/* compiled from: SsMediaPeriod */
public final class c implements o, c0.a<h<b>> {

    /* renamed from: a  reason: collision with root package name */
    public final b.a f5298a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5299b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.o f5300c;

    /* renamed from: d  reason: collision with root package name */
    public final l f5301d;

    /* renamed from: e  reason: collision with root package name */
    public final j.a f5302e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.h f5303f;

    /* renamed from: g  reason: collision with root package name */
    public final v.a f5304g;

    /* renamed from: h  reason: collision with root package name */
    public final f f5305h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f5306i;

    /* renamed from: r  reason: collision with root package name */
    public final a0 f5307r;

    /* renamed from: s  reason: collision with root package name */
    public o.a f5308s;

    /* renamed from: t  reason: collision with root package name */
    public a f5309t;

    /* renamed from: u  reason: collision with root package name */
    public ChunkSampleStream<b>[] f5310u;

    /* renamed from: v  reason: collision with root package name */
    public c0 f5311v;

    public c(a aVar, b.a aVar2, i iVar, a0 a0Var, l lVar, j.a aVar3, u6.h hVar, v.a aVar4, com.google.android.exoplayer2.upstream.o oVar, f fVar) {
        this.f5309t = aVar;
        this.f5298a = aVar2;
        this.f5299b = iVar;
        this.f5300c = oVar;
        this.f5301d = lVar;
        this.f5302e = aVar3;
        this.f5303f = hVar;
        this.f5304g = aVar4;
        this.f5305h = fVar;
        this.f5307r = a0Var;
        f0[] f0VarArr = new f0[aVar.f18507f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f18507f;
            if (i10 < bVarArr.length) {
                b0[] b0VarArr = bVarArr[i10].f18522j;
                b0[] b0VarArr2 = new b0[b0VarArr.length];
                for (int i11 = 0; i11 < b0VarArr.length; i11++) {
                    b0 b0Var = b0VarArr[i11];
                    b0VarArr2[i11] = b0Var.b(lVar.c(b0Var));
                }
                f0VarArr[i10] = new f0(b0VarArr2);
                i10++;
            } else {
                this.f5306i = new g0(f0VarArr);
                h[] hVarArr = new h[0];
                this.f5310u = hVarArr;
                a0Var.getClass();
                this.f5311v = new t((c0[]) hVarArr);
                return;
            }
        }
    }

    public void A(long j10, boolean z10) {
        for (h A : this.f5310u) {
            A.A(j10, z10);
        }
    }

    public long D(long j10) {
        for (h z10 : this.f5310u) {
            z10.z(j10);
        }
        return j10;
    }

    public void E(o.a aVar, long j10) {
        this.f5308s = aVar;
        aVar.k(this);
    }

    public long a() {
        return this.f5311v.a();
    }

    public long c(long j10, z0 z0Var) {
        for (h hVar : this.f5310u) {
            if (hVar.f3600a == 2) {
                return hVar.f3604e.c(j10, z0Var);
            }
        }
        return j10;
    }

    public void d(c0 c0Var) {
        this.f5308s.d(this);
    }

    public long e() {
        return this.f5311v.e();
    }

    public boolean f(long j10) {
        return this.f5311v.f(j10);
    }

    public void g(long j10) {
        this.f5311v.g(j10);
    }

    public long i(r6.h[] hVarArr, boolean[] zArr, z5.b0[] b0VarArr, boolean[] zArr2, long j10) {
        int i10;
        r6.h[] hVarArr2 = hVarArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < hVarArr2.length) {
            if (b0VarArr[i11] != null) {
                h hVar = b0VarArr[i11];
                if (hVarArr2[i11] == null || !zArr[i11]) {
                    hVar.w((h.b) null);
                    b0VarArr[i11] = null;
                } else {
                    ((b) hVar.f3604e).d(hVarArr2[i11]);
                    arrayList.add(hVar);
                }
            }
            if (b0VarArr[i11] != null || hVarArr2[i11] == null) {
                i10 = i11;
            } else {
                r6.h hVar2 = hVarArr2[i11];
                int a10 = this.f5306i.a(hVar2.j());
                b a11 = this.f5298a.a(this.f5300c, this.f5309t, a10, hVar2, this.f5299b);
                int i12 = this.f5309t.f18507f[a10].f18513a;
                f fVar = this.f5305h;
                l lVar = this.f5301d;
                j.a aVar = this.f5302e;
                h hVar3 = r0;
                u6.h hVar4 = this.f5303f;
                i10 = i11;
                h hVar5 = new h(i12, (int[]) null, (Format[]) null, a11, this, fVar, j10, lVar, aVar, hVar4, this.f5304g);
                h hVar6 = hVar3;
                arrayList.add(hVar6);
                b0VarArr[i10] = hVar6;
                zArr2[i10] = true;
            }
            i11 = i10 + 1;
        }
        h[] hVarArr3 = new h[arrayList.size()];
        this.f5310u = hVarArr3;
        arrayList.toArray(hVarArr3);
        a0 a0Var = this.f5307r;
        ChunkSampleStream<b>[] chunkSampleStreamArr = this.f5310u;
        a0Var.getClass();
        this.f5311v = new t((c0[]) chunkSampleStreamArr);
        return j10;
    }

    public boolean j() {
        return this.f5311v.j();
    }

    public long r() {
        return -9223372036854775807L;
    }

    public g0 v() {
        return this.f5306i;
    }

    public void y() throws IOException {
        this.f5300c.b();
    }
}
