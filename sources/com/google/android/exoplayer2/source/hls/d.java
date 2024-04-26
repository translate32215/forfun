package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.SparseArray;
import b2.t;
import ba.y;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.hls.f;
import de.a0;
import e6.e;
import f6.i;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import q5.a;
import u6.h;
import v6.e0;
import v6.s;
import x4.b0;
import x4.m0;
import x4.z0;
import z5.b0;
import z5.c0;
import z5.f0;
import z5.g0;
import z5.o;
import z5.v;

/* compiled from: HlsMediaPeriod */
public final class d implements o, f.b, i.b {
    public f[] A = new f[0];
    public f[] B = new f[0];
    public int C;
    public c0 D = new t(new c0[0]);

    /* renamed from: a  reason: collision with root package name */
    public final e6.f f5203a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5204b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5205c;

    /* renamed from: d  reason: collision with root package name */
    public final u6.i f5206d;

    /* renamed from: e  reason: collision with root package name */
    public final l f5207e;

    /* renamed from: f  reason: collision with root package name */
    public final j.a f5208f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5209g;

    /* renamed from: h  reason: collision with root package name */
    public final v.a f5210h;

    /* renamed from: i  reason: collision with root package name */
    public final u6.f f5211i;

    /* renamed from: r  reason: collision with root package name */
    public final IdentityHashMap<b0, Integer> f5212r = new IdentityHashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public final t f5213s = new t(7);

    /* renamed from: t  reason: collision with root package name */
    public final a0 f5214t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f5215u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5216v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5217w;

    /* renamed from: x  reason: collision with root package name */
    public o.a f5218x;

    /* renamed from: y  reason: collision with root package name */
    public int f5219y;

    /* renamed from: z  reason: collision with root package name */
    public g0 f5220z;

    public d(e6.f fVar, i iVar, e eVar, u6.i iVar2, l lVar, j.a aVar, h hVar, v.a aVar2, u6.f fVar2, a0 a0Var, boolean z10, int i10, boolean z11) {
        this.f5203a = fVar;
        this.f5204b = iVar;
        this.f5205c = eVar;
        this.f5206d = iVar2;
        this.f5207e = lVar;
        this.f5208f = aVar;
        this.f5209g = hVar;
        this.f5210h = aVar2;
        this.f5211i = fVar2;
        this.f5214t = a0Var;
        this.f5215u = z10;
        this.f5216v = i10;
        this.f5217w = z11;
        a0Var.getClass();
    }

    public static x4.b0 m(x4.b0 b0Var, x4.b0 b0Var2, boolean z10) {
        String str;
        int i10;
        String str2;
        int i11;
        int i12;
        a aVar;
        String str3;
        int i13 = -1;
        if (b0Var2 != null) {
            str3 = b0Var2.f27405i;
            aVar = b0Var2.f27406r;
            int i14 = b0Var2.G;
            i11 = b0Var2.f27400d;
            int i15 = b0Var2.f27401e;
            String str4 = b0Var2.f27399c;
            str = b0Var2.f27398b;
            String str5 = str4;
            i10 = i14;
            i12 = i15;
            str2 = str5;
        } else {
            String s10 = e0.s(b0Var.f27405i, 1);
            a aVar2 = b0Var.f27406r;
            if (z10) {
                int i16 = b0Var.G;
                int i17 = b0Var.f27400d;
                int i18 = b0Var.f27401e;
                str2 = b0Var.f27399c;
                int i19 = i16;
                str3 = s10;
                str = b0Var.f27398b;
                i10 = i19;
                int i20 = i18;
                i11 = i17;
                aVar = aVar2;
                i12 = i20;
            } else {
                str2 = null;
                aVar = aVar2;
                i12 = 0;
                i11 = 0;
                i10 = -1;
                str3 = s10;
                str = null;
            }
        }
        String e10 = s.e(str3);
        int i21 = z10 ? b0Var.f27402f : -1;
        if (z10) {
            i13 = b0Var.f27403g;
        }
        b0.b bVar = new b0.b();
        bVar.f27415a = b0Var.f27397a;
        bVar.f27416b = str;
        bVar.f27424j = b0Var.f27407s;
        bVar.f27425k = e10;
        bVar.f27422h = str3;
        bVar.f27423i = aVar;
        bVar.f27420f = i21;
        bVar.f27421g = i13;
        bVar.f27438x = i10;
        bVar.f27418d = i11;
        bVar.f27419e = i12;
        bVar.f27417c = str2;
        return bVar.a();
    }

    public void A(long j10, boolean z10) {
        for (f fVar : this.B) {
            if (fVar.J && !fVar.z()) {
                int length = fVar.C.length;
                for (int i10 = 0; i10 < length; i10++) {
                    fVar.C[i10].h(j10, z10, fVar.f5226a0[i10]);
                }
            }
        }
    }

    public long D(long j10) {
        f[] fVarArr = this.B;
        if (fVarArr.length > 0) {
            boolean H = fVarArr[0].H(j10, false);
            int i10 = 1;
            while (true) {
                f[] fVarArr2 = this.B;
                if (i10 >= fVarArr2.length) {
                    break;
                }
                fVarArr2[i10].H(j10, H);
                i10++;
            }
            if (H) {
                ((SparseArray) this.f5213s.f3445b).clear();
            }
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r13 = r7.f4317c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(z5.o.a r23, long r24) {
        /*
            r22 = this;
            r9 = r22
            r0 = r23
            r9.f5218x = r0
            f6.i r0 = r9.f5204b
            r0.g(r9)
            f6.i r0 = r9.f5204b
            f6.d r10 = r0.b()
            r10.getClass()
            boolean r0 = r9.f5217w
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x008c
            java.util.List<c5.f> r0 = r10.f18167m
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
        L_0x0027:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x0090
            java.lang.Object r4 = r0.get(r3)
            c5.f r4 = (c5.f) r4
            java.lang.String r5 = r4.f4317c
            int r3 = r3 + 1
            r6 = r3
        L_0x0038:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0088
            java.lang.Object r7 = r1.get(r6)
            c5.f r7 = (c5.f) r7
            java.lang.String r8 = r7.f4317c
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0085
            java.lang.String r8 = r4.f4317c
            if (r8 == 0) goto L_0x005d
            java.lang.String r13 = r7.f4317c
            if (r13 == 0) goto L_0x005d
            boolean r8 = android.text.TextUtils.equals(r8, r13)
            if (r8 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r8 = 0
            goto L_0x005e
        L_0x005d:
            r8 = 1
        L_0x005e:
            v6.a.d(r8)
            java.lang.String r8 = r4.f4317c
            if (r8 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            java.lang.String r8 = r7.f4317c
        L_0x0068:
            c5.f$b[] r4 = r4.f4315a
            c5.f$b[] r7 = r7.f4315a
            int r13 = v6.e0.f26436a
            int r13 = r4.length
            int r14 = r7.length
            int r13 = r13 + r14
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r4, r13)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r11, r13, r4, r14)
            c5.f$b[] r13 = (c5.f.b[]) r13
            c5.f r4 = new c5.f
            r4.<init>(r8, r12, r13)
            r1.remove(r6)
            goto L_0x0038
        L_0x0085:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0088:
            r2.put(r5, r4)
            goto L_0x0027
        L_0x008c:
            java.util.Map r2 = java.util.Collections.emptyMap()
        L_0x0090:
            r13 = r2
            java.util.List<f6.d$b> r0 = r10.f18159e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r12
            java.util.List<f6.d$a> r14 = r10.f18161g
            java.util.List<f6.d$a> r15 = r10.f18162h
            r9.f5219y = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r0 == 0) goto L_0x027d
            java.util.List<f6.d$b> r0 = r10.f18159e
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x00b5:
            java.util.List<f6.d$b> r5 = r10.f18159e
            int r5 = r5.size()
            r6 = 2
            if (r2 >= r5) goto L_0x00ee
            java.util.List<f6.d$b> r5 = r10.f18159e
            java.lang.Object r5 = r5.get(r2)
            f6.d$b r5 = (f6.d.b) r5
            x4.b0 r5 = r5.f18172b
            int r11 = r5.f27414z
            if (r11 > 0) goto L_0x00e6
            java.lang.String r11 = r5.f27405i
            java.lang.String r11 = v6.e0.s(r11, r6)
            if (r11 == 0) goto L_0x00d5
            goto L_0x00e6
        L_0x00d5:
            java.lang.String r5 = r5.f27405i
            java.lang.String r5 = v6.e0.s(r5, r12)
            if (r5 == 0) goto L_0x00e2
            r1[r2] = r12
            int r4 = r4 + 1
            goto L_0x00ea
        L_0x00e2:
            r5 = -1
            r1[r2] = r5
            goto L_0x00ea
        L_0x00e6:
            r1[r2] = r6
            int r3 = r3 + 1
        L_0x00ea:
            int r2 = r2 + 1
            r11 = 0
            goto L_0x00b5
        L_0x00ee:
            if (r3 <= 0) goto L_0x00f2
            r0 = 1
            goto L_0x00fb
        L_0x00f2:
            if (r4 >= r0) goto L_0x00f9
            int r0 = r0 - r4
            r11 = r0
            r0 = 0
            r2 = 1
            goto L_0x00fd
        L_0x00f9:
            r3 = r0
            r0 = 0
        L_0x00fb:
            r11 = r3
            r2 = 0
        L_0x00fd:
            android.net.Uri[] r3 = new android.net.Uri[r11]
            x4.b0[] r5 = new x4.b0[r11]
            int[] r4 = new int[r11]
            r12 = 0
            r16 = 0
        L_0x0106:
            java.util.List<f6.d$b> r6 = r10.f18159e
            int r6 = r6.size()
            if (r12 >= r6) goto L_0x013c
            if (r0 == 0) goto L_0x0118
            r6 = r1[r12]
            r18 = r0
            r0 = 2
            if (r6 != r0) goto L_0x0137
            goto L_0x011a
        L_0x0118:
            r18 = r0
        L_0x011a:
            if (r2 == 0) goto L_0x0121
            r0 = r1[r12]
            r6 = 1
            if (r0 == r6) goto L_0x0137
        L_0x0121:
            java.util.List<f6.d$b> r0 = r10.f18159e
            java.lang.Object r0 = r0.get(r12)
            f6.d$b r0 = (f6.d.b) r0
            android.net.Uri r6 = r0.f18171a
            r3[r16] = r6
            x4.b0 r0 = r0.f18172b
            r5[r16] = r0
            int r0 = r16 + 1
            r4[r16] = r12
            r16 = r0
        L_0x0137:
            int r12 = r12 + 1
            r0 = r18
            goto L_0x0106
        L_0x013c:
            r0 = 0
            r1 = r5[r0]
            java.lang.String r0 = r1.f27405i
            r6 = 2
            int r12 = v6.e0.r(r0, r6)
            r1 = 1
            int r2 = v6.e0.r(r0, r1)
            if (r2 > r1) goto L_0x0156
            if (r12 > r1) goto L_0x0156
            int r0 = r2 + r12
            if (r0 <= 0) goto L_0x0156
            r16 = 1
            goto L_0x0158
        L_0x0156:
            r16 = 0
        L_0x0158:
            r1 = 0
            x4.b0 r0 = r10.f18164j
            java.util.List<x4.b0> r6 = r10.f18165k
            r18 = r0
            r0 = r22
            r19 = r2
            r2 = r3
            r3 = r5
            r20 = r4
            r4 = r18
            r18 = r5
            r5 = r6
            r6 = r13
            r21 = r13
            r17 = r15
            r15 = r7
            r13 = r8
            r7 = r24
            com.google.android.exoplayer2.source.hls.f r0 = r0.l(r1, r2, r3, r4, r5, r6, r7)
            r15.add(r0)
            r1 = r20
            r13.add(r1)
            boolean r1 = r9.f5215u
            if (r1 == 0) goto L_0x0283
            if (r16 == 0) goto L_0x0283
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r12 <= 0) goto L_0x022e
            x4.b0[] r2 = new x4.b0[r11]
            r3 = 0
        L_0x0191:
            if (r3 >= r11) goto L_0x01de
            r4 = r18[r3]
            java.lang.String r5 = r4.f27405i
            r6 = 2
            java.lang.String r5 = v6.e0.s(r5, r6)
            java.lang.String r7 = v6.s.e(r5)
            x4.b0$b r8 = new x4.b0$b
            r8.<init>()
            java.lang.String r12 = r4.f27397a
            r8.f27415a = r12
            java.lang.String r12 = r4.f27398b
            r8.f27416b = r12
            java.lang.String r12 = r4.f27407s
            r8.f27424j = r12
            r8.f27425k = r7
            r8.f27422h = r5
            q5.a r5 = r4.f27406r
            r8.f27423i = r5
            int r5 = r4.f27402f
            r8.f27420f = r5
            int r5 = r4.f27403g
            r8.f27421g = r5
            int r5 = r4.f27413y
            r8.f27430p = r5
            int r5 = r4.f27414z
            r8.f27431q = r5
            float r5 = r4.A
            r8.f27432r = r5
            int r5 = r4.f27400d
            r8.f27418d = r5
            int r4 = r4.f27401e
            r8.f27419e = r4
            x4.b0 r4 = r8.a()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0191
        L_0x01de:
            z5.f0 r3 = new z5.f0
            r3.<init>((x4.b0[]) r2)
            r1.add(r3)
            if (r19 <= 0) goto L_0x020a
            x4.b0 r2 = r10.f18164j
            if (r2 != 0) goto L_0x01f4
            java.util.List<f6.d$a> r2 = r10.f18161g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x020a
        L_0x01f4:
            z5.f0 r2 = new z5.f0
            r3 = 1
            x4.b0[] r4 = new x4.b0[r3]
            r3 = 0
            r5 = r18[r3]
            x4.b0 r6 = r10.f18164j
            x4.b0 r5 = m(r5, r6, r3)
            r4[r3] = r5
            r2.<init>((x4.b0[]) r4)
            r1.add(r2)
        L_0x020a:
            java.util.List<x4.b0> r2 = r10.f18165k
            if (r2 == 0) goto L_0x022c
            r3 = 0
        L_0x020f:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x022c
            z5.f0 r4 = new z5.f0
            r5 = 1
            x4.b0[] r6 = new x4.b0[r5]
            java.lang.Object r5 = r2.get(r3)
            x4.b0 r5 = (x4.b0) r5
            r7 = 0
            r6[r7] = r5
            r4.<init>((x4.b0[]) r6)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x020f
        L_0x022c:
            r6 = 1
            goto L_0x024a
        L_0x022e:
            x4.b0[] r2 = new x4.b0[r11]
            r3 = 0
        L_0x0231:
            if (r3 >= r11) goto L_0x0241
            r4 = r18[r3]
            x4.b0 r5 = r10.f18164j
            r6 = 1
            x4.b0 r4 = m(r4, r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0231
        L_0x0241:
            r6 = 1
            z5.f0 r3 = new z5.f0
            r3.<init>((x4.b0[]) r2)
            r1.add(r3)
        L_0x024a:
            z5.f0 r2 = new z5.f0
            x4.b0[] r3 = new x4.b0[r6]
            x4.b0$b r4 = new x4.b0$b
            r4.<init>()
            java.lang.String r5 = "ID3"
            r4.f27415a = r5
            java.lang.String r5 = "application/id3"
            r4.f27425k = r5
            x4.b0 r4 = r4.a()
            r5 = 0
            r3[r5] = r4
            r2.<init>((x4.b0[]) r3)
            r1.add(r2)
            z5.f0[] r3 = new z5.f0[r5]
            java.lang.Object[] r3 = r1.toArray(r3)
            z5.f0[] r3 = (z5.f0[]) r3
            r4 = 1
            int[] r6 = new int[r4]
            int r1 = r1.indexOf(r2)
            r6[r5] = r1
            r0.F(r3, r5, r6)
            goto L_0x0283
        L_0x027d:
            r21 = r13
            r17 = r15
            r15 = r7
            r13 = r8
        L_0x0283:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r14.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r14.size()
            r11.<init>(r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r14.size()
            r12.<init>(r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r8 = 0
        L_0x02a4:
            int r0 = r14.size()
            if (r8 >= r0) goto L_0x0360
            java.lang.Object r0 = r14.get(r8)
            f6.d$a r0 = (f6.d.a) r0
            java.lang.String r0 = r0.f18170c
            boolean r1 = r7.add(r0)
            if (r1 != 0) goto L_0x02be
            r18 = r7
            r19 = r8
            goto L_0x035a
        L_0x02be:
            r10.clear()
            r11.clear()
            r12.clear()
            r1 = 0
            r16 = 1
        L_0x02ca:
            int r2 = r14.size()
            if (r1 >= r2) goto L_0x030a
            java.lang.Object r2 = r14.get(r1)
            f6.d$a r2 = (f6.d.a) r2
            java.lang.String r2 = r2.f18170c
            boolean r2 = v6.e0.a(r0, r2)
            if (r2 == 0) goto L_0x0307
            java.lang.Object r2 = r14.get(r1)
            f6.d$a r2 = (f6.d.a) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r12.add(r3)
            android.net.Uri r3 = r2.f18168a
            r10.add(r3)
            x4.b0 r3 = r2.f18169b
            r11.add(r3)
            x4.b0 r2 = r2.f18169b
            java.lang.String r2 = r2.f27405i
            r3 = 1
            int r2 = v6.e0.r(r2, r3)
            if (r2 != r3) goto L_0x0302
            r2 = 1
            goto L_0x0303
        L_0x0302:
            r2 = 0
        L_0x0303:
            r2 = r16 & r2
            r16 = r2
        L_0x0307:
            int r1 = r1 + 1
            goto L_0x02ca
        L_0x030a:
            r1 = 1
            r0 = 0
            android.net.Uri[] r2 = new android.net.Uri[r0]
            int r3 = v6.e0.f26436a
            java.lang.Object[] r2 = r10.toArray(r2)
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            x4.b0[] r3 = new x4.b0[r0]
            java.lang.Object[] r0 = r11.toArray(r3)
            r3 = r0
            x4.b0[] r3 = (x4.b0[]) r3
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r22
            r6 = r21
            r18 = r7
            r19 = r8
            r7 = r24
            com.google.android.exoplayer2.source.hls.f r0 = r0.l(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = da.a.b(r12)
            r13.add(r1)
            r15.add(r0)
            boolean r1 = r9.f5215u
            if (r1 == 0) goto L_0x035a
            if (r16 == 0) goto L_0x035a
            r1 = 0
            x4.b0[] r2 = new x4.b0[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            x4.b0[] r2 = (x4.b0[]) r2
            r3 = 1
            z5.f0[] r4 = new z5.f0[r3]
            z5.f0 r3 = new z5.f0
            r3.<init>((x4.b0[]) r2)
            r4[r1] = r3
            int[] r2 = new int[r1]
            r0.F(r4, r1, r2)
        L_0x035a:
            int r8 = r19 + 1
            r7 = r18
            goto L_0x02a4
        L_0x0360:
            int r0 = r15.size()
            r9.C = r0
            r10 = 0
        L_0x0367:
            int r0 = r17.size()
            if (r10 >= r0) goto L_0x03b7
            r11 = r17
            java.lang.Object r0 = r11.get(r10)
            r12 = r0
            f6.d$a r12 = (f6.d.a) r12
            r1 = 3
            r0 = 1
            android.net.Uri[] r2 = new android.net.Uri[r0]
            android.net.Uri r3 = r12.f18168a
            r4 = 0
            r2[r4] = r3
            x4.b0[] r3 = new x4.b0[r0]
            x4.b0 r0 = r12.f18169b
            r3[r4] = r0
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r22
            r6 = r21
            r7 = r24
            com.google.android.exoplayer2.source.hls.f r0 = r0.l(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 0
            r2[r3] = r10
            r13.add(r2)
            r15.add(r0)
            z5.f0[] r2 = new z5.f0[r1]
            z5.f0 r4 = new z5.f0
            x4.b0[] r5 = new x4.b0[r1]
            x4.b0 r1 = r12.f18169b
            r5[r3] = r1
            r4.<init>((x4.b0[]) r5)
            r2[r3] = r4
            int[] r1 = new int[r3]
            r0.F(r2, r3, r1)
            int r10 = r10 + 1
            goto L_0x0367
        L_0x03b7:
            r3 = 0
            com.google.android.exoplayer2.source.hls.f[] r0 = new com.google.android.exoplayer2.source.hls.f[r3]
            java.lang.Object[] r0 = r15.toArray(r0)
            com.google.android.exoplayer2.source.hls.f[] r0 = (com.google.android.exoplayer2.source.hls.f[]) r0
            r9.A = r0
            int[][] r0 = new int[r3][]
            java.lang.Object[] r0 = r13.toArray(r0)
            int[][] r0 = (int[][]) r0
            com.google.android.exoplayer2.source.hls.f[] r0 = r9.A
            int r1 = r0.length
            r9.f5219y = r1
            r1 = r0[r3]
            com.google.android.exoplayer2.source.hls.b r1 = r1.f5229c
            r2 = 1
            r1.f5169k = r2
            int r1 = r0.length
            r11 = 0
        L_0x03d8:
            if (r11 >= r1) goto L_0x03e8
            r2 = r0[r11]
            boolean r3 = r2.K
            if (r3 != 0) goto L_0x03e5
            long r3 = r2.f5230c0
            r2.f(r3)
        L_0x03e5:
            int r11 = r11 + 1
            goto L_0x03d8
        L_0x03e8:
            com.google.android.exoplayer2.source.hls.f[] r0 = r9.A
            r9.B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.d.E(z5.o$a, long):void");
    }

    public long a() {
        return this.D.a();
    }

    public void b() {
        for (f fVar : this.A) {
            if (!fVar.f5248u.isEmpty()) {
                c cVar = (c) y.b(fVar.f5248u);
                int b10 = fVar.f5229c.b(cVar);
                if (b10 == 1) {
                    cVar.K = true;
                } else if (b10 == 2 && !fVar.f5238g0 && fVar.f5241i.e()) {
                    fVar.f5241i.a();
                }
            }
        }
        this.f5218x.d(this);
    }

    public long c(long j10, z0 z0Var) {
        return j10;
    }

    public void d(c0 c0Var) {
        f fVar = (f) c0Var;
        this.f5218x.d(this);
    }

    public long e() {
        return this.D.e();
    }

    public boolean f(long j10) {
        if (this.f5220z != null) {
            return this.D.f(j10);
        }
        for (f fVar : this.A) {
            if (!fVar.K) {
                fVar.f(fVar.f5230c0);
            }
        }
        return false;
    }

    public void g(long j10) {
        this.D.g(j10);
    }

    public boolean h(Uri uri, long j10) {
        boolean z10;
        int t10;
        boolean z11 = true;
        for (f fVar : this.A) {
            b bVar = fVar.f5229c;
            int i10 = 0;
            while (true) {
                Uri[] uriArr = bVar.f5163e;
                if (i10 >= uriArr.length) {
                    i10 = -1;
                    break;
                } else if (uriArr[i10].equals(uri)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!(i10 == -1 || (t10 = bVar.f5174p.t(i10)) == -1)) {
                bVar.f5176r |= uri.equals(bVar.f5172n);
                if (j10 != -9223372036854775807L && !bVar.f5174p.a(t10, j10)) {
                    z10 = false;
                    z11 &= z10;
                }
            }
            z10 = true;
            z11 &= z10;
        }
        this.f5218x.d(this);
        return z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i(r6.h[] r36, boolean[] r37, z5.b0[] r38, boolean[] r39, long r40) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r38
            r12 = r40
            int r3 = r1.length
            int[] r14 = new int[r3]
            int r3 = r1.length
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            r10 = -1
            if (r3 >= r4) goto L_0x0051
            r4 = r2[r3]
            if (r4 != 0) goto L_0x0019
            r4 = -1
            goto L_0x0027
        L_0x0019:
            java.util.IdentityHashMap<z5.b0, java.lang.Integer> r4 = r0.f5212r
            r5 = r2[r3]
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0027:
            r14[r3] = r4
            r15[r3] = r10
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004e
            r4 = r1[r3]
            z5.f0 r4 = r4.j()
            r5 = 0
        L_0x0036:
            com.google.android.exoplayer2.source.hls.f[] r6 = r0.A
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004e
            r6 = r6[r5]
            r6.p()
            z5.g0 r6 = r6.P
            int r6 = r6.a(r4)
            if (r6 == r10) goto L_0x004b
            r15[r3] = r5
            goto L_0x004e
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x0036
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0051:
            java.util.IdentityHashMap<z5.b0, java.lang.Integer> r3 = r0.f5212r
            r3.clear()
            int r8 = r1.length
            z5.b0[] r9 = new z5.b0[r8]
            int r6 = r1.length
            z5.b0[] r7 = new z5.b0[r6]
            int r4 = r1.length
            r6.h[] r5 = new r6.h[r4]
            com.google.android.exoplayer2.source.hls.f[] r3 = r0.A
            int r3 = r3.length
            com.google.android.exoplayer2.source.hls.f[] r3 = new com.google.android.exoplayer2.source.hls.f[r3]
            r16 = r8
            r8 = 0
            r17 = 0
            r18 = 0
        L_0x006b:
            com.google.android.exoplayer2.source.hls.f[] r11 = r0.A
            int r11 = r11.length
            if (r8 >= r11) goto L_0x031a
            r11 = 0
        L_0x0071:
            int r10 = r1.length
            r21 = r3
            if (r11 >= r10) goto L_0x008f
            r10 = r14[r11]
            if (r10 != r8) goto L_0x007d
            r10 = r2[r11]
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r7[r11] = r10
            r10 = r15[r11]
            if (r10 != r8) goto L_0x0087
            r3 = r1[r11]
            goto L_0x0088
        L_0x0087:
            r3 = 0
        L_0x0088:
            r5[r11] = r3
            int r11 = r11 + 1
            r3 = r21
            goto L_0x0071
        L_0x008f:
            com.google.android.exoplayer2.source.hls.f[] r10 = r0.A
            r11 = r10[r8]
            r11.p()
            int r10 = r11.L
            r3 = 0
        L_0x0099:
            if (r3 >= r4) goto L_0x00f5
            r23 = r7[r3]
            r24 = r6
            r6 = r23
            com.google.android.exoplayer2.source.hls.e r6 = (com.google.android.exoplayer2.source.hls.e) r6
            if (r6 == 0) goto L_0x00e3
            r23 = r5[r3]
            if (r23 == 0) goto L_0x00ad
            boolean r23 = r37[r3]
            if (r23 != 0) goto L_0x00e3
        L_0x00ad:
            r23 = r8
            int r8 = r11.L
            r25 = r9
            r9 = -1
            int r8 = r8 + r9
            r11.L = r8
            int r8 = r6.f5223c
            if (r8 == r9) goto L_0x00dc
            com.google.android.exoplayer2.source.hls.f r8 = r6.f5222b
            int r9 = r6.f5221a
            r8.p()
            int[] r2 = r8.R
            r2.getClass()
            int[] r2 = r8.R
            r2 = r2[r9]
            boolean[] r9 = r8.f5226a0
            boolean r9 = r9[r2]
            v6.a.d(r9)
            boolean[] r8 = r8.f5226a0
            r19 = 0
            r8[r2] = r19
            r2 = -1
            r6.f5223c = r2
            goto L_0x00df
        L_0x00dc:
            r2 = -1
            r19 = 0
        L_0x00df:
            r6 = 0
            r7[r3] = r6
            goto L_0x00ea
        L_0x00e3:
            r23 = r8
            r25 = r9
            r2 = -1
            r19 = 0
        L_0x00ea:
            int r3 = r3 + 1
            r2 = r38
            r8 = r23
            r6 = r24
            r9 = r25
            goto L_0x0099
        L_0x00f5:
            r24 = r6
            r23 = r8
            r25 = r9
            r2 = -1
            r19 = 0
            if (r18 != 0) goto L_0x0110
            boolean r3 = r11.f5236f0
            if (r3 == 0) goto L_0x0107
            if (r10 != 0) goto L_0x010e
            goto L_0x0110
        L_0x0107:
            long r9 = r11.f5230c0
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r3 = 0
            goto L_0x0111
        L_0x0110:
            r3 = 1
        L_0x0111:
            com.google.android.exoplayer2.source.hls.b r6 = r11.f5229c
            r6.h r6 = r6.f5174p
            r20 = r3
            r10 = r6
            r3 = 0
        L_0x0119:
            if (r3 >= r4) goto L_0x0171
            r9 = r5[r3]
            if (r9 != 0) goto L_0x0120
            goto L_0x016d
        L_0x0120:
            z5.g0 r2 = r11.P
            z5.f0 r8 = r9.j()
            int r2 = r2.a(r8)
            int r8 = r11.S
            if (r2 != r8) goto L_0x0133
            com.google.android.exoplayer2.source.hls.b r8 = r11.f5229c
            r8.f5174p = r9
            r10 = r9
        L_0x0133:
            r8 = r7[r3]
            if (r8 != 0) goto L_0x016d
            int r8 = r11.L
            r9 = 1
            int r8 = r8 + r9
            r11.L = r8
            com.google.android.exoplayer2.source.hls.e r8 = new com.google.android.exoplayer2.source.hls.e
            r8.<init>(r11, r2)
            r7[r3] = r8
            r39[r3] = r9
            int[] r8 = r11.R
            if (r8 == 0) goto L_0x016d
            r8 = r7[r3]
            com.google.android.exoplayer2.source.hls.e r8 = (com.google.android.exoplayer2.source.hls.e) r8
            r8.a()
            if (r20 != 0) goto L_0x016d
            com.google.android.exoplayer2.source.hls.f$d[] r8 = r11.C
            int[] r9 = r11.R
            r2 = r9[r2]
            r2 = r8[r2]
            r8 = 1
            boolean r9 = r2.F(r12, r8)
            if (r9 != 0) goto L_0x016a
            int r2 = r2.p()
            if (r2 == 0) goto L_0x016a
            r9 = 1
            goto L_0x016b
        L_0x016a:
            r9 = 0
        L_0x016b:
            r20 = r9
        L_0x016d:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x0119
        L_0x0171:
            int r2 = r11.L
            if (r2 != 0) goto L_0x01be
            com.google.android.exoplayer2.source.hls.b r2 = r11.f5229c
            r3 = 0
            r2.f5171m = r3
            r11.N = r3
            r2 = 1
            r11.f5234e0 = r2
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r3 = r11.f5248u
            r3.clear()
            com.google.android.exoplayer2.upstream.n r3 = r11.f5241i
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x01a4
            boolean r3 = r11.J
            if (r3 == 0) goto L_0x019e
            com.google.android.exoplayer2.source.hls.f$d[] r3 = r11.C
            int r6 = r3.length
            r8 = 0
        L_0x0194:
            if (r8 >= r6) goto L_0x019e
            r9 = r3[r8]
            r9.i()
            int r8 = r8 + 1
            goto L_0x0194
        L_0x019e:
            com.google.android.exoplayer2.upstream.n r3 = r11.f5241i
            r3.a()
            goto L_0x01a7
        L_0x01a4:
            r11.G()
        L_0x01a7:
            r28 = r4
            r29 = r5
            r0 = r11
            r31 = r14
            r32 = r16
            r30 = r21
            r34 = r23
            r2 = r24
            r33 = r25
            r23 = -1
            r24 = r7
            goto L_0x0271
        L_0x01be:
            r2 = 1
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r3 = r11.f5248u
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0244
            boolean r3 = v6.e0.a(r10, r6)
            if (r3 != 0) goto L_0x0244
            boolean r3 = r11.f5236f0
            if (r3 != 0) goto L_0x0226
            r8 = 0
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x01d8
            long r8 = -r12
        L_0x01d8:
            com.google.android.exoplayer2.source.hls.c r6 = r11.w()
            com.google.android.exoplayer2.source.hls.b r3 = r11.f5229c
            b6.n[] r22 = r3.a(r6, r12)
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.c> r3 = r11.f5249v
            r2 = r21
            r21 = r3
            r3 = r10
            r28 = r4
            r29 = r5
            r4 = r40
            r30 = r2
            r31 = r14
            r2 = r24
            r14 = r6
            r24 = r7
            r6 = r8
            r32 = r16
            r34 = r23
            r33 = r25
            r0 = 1
            r8 = r26
            r16 = r10
            r23 = -1
            r10 = r21
            r0 = r11
            r11 = r22
            r3.h(r4, r6, r8, r10, r11)
            com.google.android.exoplayer2.source.hls.b r3 = r0.f5229c
            z5.f0 r3 = r3.f5166h
            x4.b0 r4 = r14.f3592d
            int r3 = r3.a(r4)
            int r4 = r16.i()
            if (r4 == r3) goto L_0x0224
            goto L_0x023b
        L_0x0224:
            r11 = 0
            goto L_0x023c
        L_0x0226:
            r28 = r4
            r29 = r5
            r0 = r11
            r31 = r14
            r32 = r16
            r30 = r21
            r34 = r23
            r2 = r24
            r33 = r25
            r23 = -1
            r24 = r7
        L_0x023b:
            r11 = 1
        L_0x023c:
            if (r11 == 0) goto L_0x0259
            r3 = 1
            r0.f5234e0 = r3
            r3 = 1
            r8 = 1
            goto L_0x025d
        L_0x0244:
            r28 = r4
            r29 = r5
            r0 = r11
            r31 = r14
            r32 = r16
            r30 = r21
            r34 = r23
            r2 = r24
            r33 = r25
            r23 = -1
            r24 = r7
        L_0x0259:
            r3 = r18
            r8 = r20
        L_0x025d:
            if (r8 == 0) goto L_0x026f
            r0.H(r12, r3)
            r11 = 0
        L_0x0263:
            if (r11 >= r2) goto L_0x026f
            r3 = r24[r11]
            if (r3 == 0) goto L_0x026c
            r3 = 1
            r39[r11] = r3
        L_0x026c:
            int r11 = r11 + 1
            goto L_0x0263
        L_0x026f:
            r20 = r8
        L_0x0271:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.e> r3 = r0.f5253z
            r3.clear()
            r11 = 0
        L_0x0277:
            if (r11 >= r2) goto L_0x0287
            r3 = r24[r11]
            if (r3 == 0) goto L_0x0284
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.e> r4 = r0.f5253z
            com.google.android.exoplayer2.source.hls.e r3 = (com.google.android.exoplayer2.source.hls.e) r3
            r4.add(r3)
        L_0x0284:
            int r11 = r11 + 1
            goto L_0x0277
        L_0x0287:
            r3 = 1
            r0.f5236f0 = r3
            r4 = 0
            r11 = 0
        L_0x028c:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x02c5
            r5 = r24[r11]
            r6 = r15[r11]
            r7 = r34
            if (r6 != r7) goto L_0x02ac
            r5.getClass()
            r6 = r33
            r6[r11] = r5
            r8 = 1
            r3 = r35
            java.util.IdentityHashMap<z5.b0, java.lang.Integer> r4 = r3.f5212r
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r4.put(r5, r9)
            r4 = 1
            goto L_0x02bd
        L_0x02ac:
            r8 = 1
            r3 = r35
            r6 = r33
            r9 = r31[r11]
            if (r9 != r7) goto L_0x02bd
            if (r5 != 0) goto L_0x02b9
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            v6.a.d(r5)
        L_0x02bd:
            int r11 = r11 + 1
            r33 = r6
            r34 = r7
            r3 = 1
            goto L_0x028c
        L_0x02c5:
            r3 = r35
            r6 = r33
            r7 = r34
            r8 = 1
            if (r4 == 0) goto L_0x0301
            r11 = r17
            r30[r11] = r0
            int r17 = r11 + 1
            if (r11 != 0) goto L_0x02f4
            com.google.android.exoplayer2.source.hls.b r4 = r0.f5229c
            r4.f5169k = r8
            if (r20 != 0) goto L_0x02e7
            com.google.android.exoplayer2.source.hls.f[] r4 = r3.B
            int r5 = r4.length
            if (r5 == 0) goto L_0x02e7
            r5 = 0
            r4 = r4[r5]
            if (r0 == r4) goto L_0x0304
            goto L_0x02e8
        L_0x02e7:
            r5 = 0
        L_0x02e8:
            b2.t r0 = r3.f5213s
            java.lang.Object r0 = r0.f3445b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r18 = 1
            goto L_0x0304
        L_0x02f4:
            r5 = 0
            int r4 = r3.C
            if (r7 >= r4) goto L_0x02fb
            r11 = 1
            goto L_0x02fc
        L_0x02fb:
            r11 = 0
        L_0x02fc:
            com.google.android.exoplayer2.source.hls.b r0 = r0.f5229c
            r0.f5169k = r11
            goto L_0x0304
        L_0x0301:
            r11 = r17
            r5 = 0
        L_0x0304:
            int r8 = r7 + 1
            r0 = r3
            r9 = r6
            r7 = r24
            r4 = r28
            r5 = r29
            r3 = r30
            r14 = r31
            r16 = r32
            r10 = -1
            r6 = r2
            r2 = r38
            goto L_0x006b
        L_0x031a:
            r30 = r3
            r6 = r9
            r4 = r16
            r11 = r17
            r5 = 0
            r3 = r0
            r0 = r2
            java.lang.System.arraycopy(r6, r5, r0, r5, r4)
            r0 = r30
            java.lang.Object[] r0 = v6.e0.L(r0, r11)
            com.google.android.exoplayer2.source.hls.f[] r0 = (com.google.android.exoplayer2.source.hls.f[]) r0
            r3.B = r0
            de.a0 r1 = r3.f5214t
            r1.getClass()
            b2.t r1 = new b2.t
            r1.<init>((z5.c0[]) r0)
            r3.D = r1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.d.i(r6.h[], boolean[], z5.b0[], boolean[], long):long");
    }

    public boolean j() {
        return this.D.j();
    }

    public final f l(int i10, Uri[] uriArr, Format[] formatArr, x4.b0 b0Var, List<x4.b0> list, Map<String, c5.f> map, long j10) {
        return new f(i10, this, new b(this.f5203a, this.f5204b, uriArr, formatArr, this.f5205c, this.f5206d, this.f5213s, list), map, this.f5211i, j10, b0Var, this.f5207e, this.f5208f, this.f5209g, this.f5210h, this.f5216v);
    }

    public void n() {
        int i10 = this.f5219y - 1;
        this.f5219y = i10;
        if (i10 <= 0) {
            int i11 = 0;
            for (f fVar : this.A) {
                fVar.p();
                i11 += fVar.P.f28589a;
            }
            f0[] f0VarArr = new f0[i11];
            int i12 = 0;
            for (f fVar2 : this.A) {
                fVar2.p();
                int i13 = fVar2.P.f28589a;
                int i14 = 0;
                while (i14 < i13) {
                    fVar2.p();
                    f0VarArr[i12] = fVar2.P.f28590b[i14];
                    i14++;
                    i12++;
                }
            }
            this.f5220z = new g0(f0VarArr);
            this.f5218x.k(this);
        }
    }

    public long r() {
        return -9223372036854775807L;
    }

    public g0 v() {
        g0 g0Var = this.f5220z;
        g0Var.getClass();
        return g0Var;
    }

    public void y() throws IOException {
        f[] fVarArr = this.A;
        int length = fVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f fVar = fVarArr[i10];
            fVar.C();
            if (!fVar.f5238g0 || fVar.K) {
                i10++;
            } else {
                throw new m0("Loading finished before preparation is complete.");
            }
        }
    }
}
