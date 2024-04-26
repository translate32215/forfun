package com.google.android.gms.internal.ads;

import e.h;
import e8.f80;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class op {

    /* renamed from: a  reason: collision with root package name */
    public int f7697a;

    /* renamed from: b  reason: collision with root package name */
    public int f7698b = 100;

    /* renamed from: c  reason: collision with root package name */
    public int f7699c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public rp f7700d;

    public op() {
    }

    public static int A(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static op d(byte[] bArr, int i10, int i11, boolean z10) {
        pp ppVar = new pp(bArr, i10, i11, z10, (h) null);
        try {
            ppVar.y(i11);
            return ppVar;
        } catch (f80 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static long v(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract int e() throws IOException;

    public abstract long f() throws IOException;

    public abstract long g() throws IOException;

    public abstract int h() throws IOException;

    public abstract long i() throws IOException;

    public abstract int j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract String l() throws IOException;

    public abstract mp m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract int u();

    public abstract void w(int i10) throws f80;

    public abstract boolean x(int i10) throws IOException;

    public abstract int y(int i10) throws f80;

    public abstract void z(int i10);

    public op(h hVar) {
    }
}
