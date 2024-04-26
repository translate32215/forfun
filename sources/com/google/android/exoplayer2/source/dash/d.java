package com.google.android.exoplayer2.source.dash;

import a5.f;
import d6.e;
import java.io.IOException;
import m3.t;
import s5.c;
import v6.e0;
import z5.b0;

/* compiled from: EventSampleStream */
public final class d implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final x4.b0 f5107a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5108b = new c();

    /* renamed from: c  reason: collision with root package name */
    public long[] f5109c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5110d;

    /* renamed from: e  reason: collision with root package name */
    public e f5111e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5112f;

    /* renamed from: g  reason: collision with root package name */
    public int f5113g;

    /* renamed from: h  reason: collision with root package name */
    public long f5114h = -9223372036854775807L;

    public d(e eVar, x4.b0 b0Var, boolean z10) {
        this.f5107a = b0Var;
        this.f5111e = eVar;
        this.f5109c = eVar.f13106b;
        c(eVar, z10);
    }

    public void a(long j10) {
        boolean z10 = true;
        int b10 = e0.b(this.f5109c, j10, true, false);
        this.f5113g = b10;
        if (!this.f5110d || b10 != this.f5109c.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f5114h = j10;
    }

    public void b() throws IOException {
    }

    public void c(e eVar, boolean z10) {
        int i10 = this.f5113g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f5109c[i10 - 1];
        this.f5110d = z10;
        this.f5111e = eVar;
        long[] jArr = eVar.f13106b;
        this.f5109c = jArr;
        long j11 = this.f5114h;
        if (j11 != -9223372036854775807L) {
            a(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f5113g = e0.b(jArr, j10, false, false);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [x4.b0, java.util.Map<k3.c, m3.m<?>>] */
    public int d(t tVar, f fVar, boolean z10) {
        if (z10 || !this.f5112f) {
            tVar.f21666b = this.f5107a;
            this.f5112f = true;
            return -5;
        }
        int i10 = this.f5113g;
        if (i10 != this.f5109c.length) {
            this.f5113g = i10 + 1;
            byte[] a10 = this.f5108b.a(this.f5111e.f13105a[i10]);
            fVar.v(a10.length);
            fVar.f86c.put(a10);
            fVar.f88e = this.f5109c[i10];
            fVar.f61a = 1;
            return -4;
        } else if (this.f5110d) {
            return -3;
        } else {
            fVar.f61a = 4;
            return -4;
        }
    }

    public boolean isReady() {
        return true;
    }

    public int l(long j10) {
        int max = Math.max(this.f5113g, e0.b(this.f5109c, j10, true, false));
        int i10 = max - this.f5113g;
        this.f5113g = max;
        return i10;
    }
}
