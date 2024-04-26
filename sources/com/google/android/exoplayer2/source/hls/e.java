package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.f;
import e6.i;
import java.io.IOException;
import v6.a;
import z5.b0;
import z5.g0;

/* compiled from: HlsSampleStream */
public final class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5221a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5222b;

    /* renamed from: c  reason: collision with root package name */
    public int f5223c = -1;

    public e(f fVar, int i10) {
        this.f5222b = fVar;
        this.f5221a = i10;
    }

    public void a() {
        a.a(this.f5223c == -1);
        f fVar = this.f5222b;
        int i10 = this.f5221a;
        fVar.p();
        fVar.R.getClass();
        int i11 = fVar.R[i10];
        if (i11 != -1) {
            boolean[] zArr = fVar.f5226a0;
            if (!zArr[i11]) {
                zArr[i11] = true;
                this.f5223c = i11;
            }
        } else if (fVar.Q.contains(fVar.P.f28590b[i10])) {
            i11 = -3;
            this.f5223c = i11;
        }
        i11 = -2;
        this.f5223c = i11;
    }

    public void b() throws IOException {
        int i10 = this.f5223c;
        if (i10 == -2) {
            f fVar = this.f5222b;
            fVar.p();
            g0 g0Var = fVar.P;
            throw new i(g0Var.f28590b[this.f5221a].f28584b[0].f27408t);
        } else if (i10 == -1) {
            this.f5222b.C();
        } else if (i10 != -3) {
            f fVar2 = this.f5222b;
            fVar2.C();
            fVar2.C[i10].x();
        }
    }

    public final boolean c() {
        int i10 = this.f5223c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.Map<k3.c, m3.m<?>>] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(m3.t r17, a5.f r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r0.f5223c
            r4 = -3
            if (r3 != r4) goto L_0x0011
            r1 = 4
            r2.i(r1)
            r1 = -4
            return r1
        L_0x0011:
            boolean r3 = r16.c()
            if (r3 == 0) goto L_0x00f5
            com.google.android.exoplayer2.source.hls.f r3 = r0.f5222b
            int r5 = r0.f5223c
            boolean r6 = r3.z()
            if (r6 == 0) goto L_0x0023
            goto L_0x00f5
        L_0x0023:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            boolean r6 = r6.isEmpty()
            r7 = 0
            if (r6 != 0) goto L_0x0088
            r6 = 0
        L_0x002d:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r8 = r3.f5248u
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            if (r6 >= r8) goto L_0x0061
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r8 = r3.f5248u
            java.lang.Object r8 = r8.get(r6)
            com.google.android.exoplayer2.source.hls.c r8 = (com.google.android.exoplayer2.source.hls.c) r8
            int r8 = r8.f5187k
            com.google.android.exoplayer2.source.hls.f$d[] r10 = r3.C
            int r10 = r10.length
            r11 = 0
        L_0x0045:
            if (r11 >= r10) goto L_0x005c
            boolean[] r12 = r3.f5226a0
            boolean r12 = r12[r11]
            if (r12 == 0) goto L_0x0059
            com.google.android.exoplayer2.source.hls.f$d[] r12 = r3.C
            r12 = r12[r11]
            int r12 = r12.z()
            if (r12 != r8) goto L_0x0059
            r9 = 0
            goto L_0x005c
        L_0x0059:
            int r11 = r11 + 1
            goto L_0x0045
        L_0x005c:
            if (r9 == 0) goto L_0x0061
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0061:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r8 = r3.f5248u
            v6.e0.O(r8, r7, r6)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            java.lang.Object r6 = r6.get(r7)
            com.google.android.exoplayer2.source.hls.c r6 = (com.google.android.exoplayer2.source.hls.c) r6
            x4.b0 r15 = r6.f3592d
            x4.b0 r8 = r3.N
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0086
            z5.v$a r8 = r3.f5245r
            int r9 = r3.f5225a
            int r11 = r6.f3593e
            java.lang.Object r12 = r6.f3594f
            long r13 = r6.f3595g
            r10 = r15
            r8.b(r9, r10, r11, r12, r13)
        L_0x0086:
            r3.N = r15
        L_0x0088:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x009d
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            java.lang.Object r6 = r6.get(r7)
            com.google.android.exoplayer2.source.hls.c r6 = (com.google.android.exoplayer2.source.hls.c) r6
            boolean r6 = r6.K
            if (r6 != 0) goto L_0x009d
            goto L_0x00f5
        L_0x009d:
            com.google.android.exoplayer2.source.hls.f$d[] r4 = r3.C
            r4 = r4[r5]
            boolean r6 = r3.f5238g0
            r8 = r19
            int r2 = r4.B(r1, r2, r8, r6)
            r4 = -5
            if (r2 != r4) goto L_0x00f4
            java.util.Map<k3.c, m3.m<?>> r4 = r1.f21666b
            x4.b0 r4 = (x4.b0) r4
            r4.getClass()
            int r6 = r3.I
            if (r5 != r6) goto L_0x00f2
            com.google.android.exoplayer2.source.hls.f$d[] r6 = r3.C
            r5 = r6[r5]
            int r5 = r5.z()
        L_0x00bf:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            int r6 = r6.size()
            if (r7 >= r6) goto L_0x00d6
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r6 = r3.f5248u
            java.lang.Object r6 = r6.get(r7)
            com.google.android.exoplayer2.source.hls.c r6 = (com.google.android.exoplayer2.source.hls.c) r6
            int r6 = r6.f5187k
            if (r6 == r5) goto L_0x00d6
            int r7 = r7 + 1
            goto L_0x00bf
        L_0x00d6:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r5 = r3.f5248u
            int r5 = r5.size()
            if (r7 >= r5) goto L_0x00e9
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r3 = r3.f5248u
            java.lang.Object r3 = r3.get(r7)
            com.google.android.exoplayer2.source.hls.c r3 = (com.google.android.exoplayer2.source.hls.c) r3
            x4.b0 r3 = r3.f3592d
            goto L_0x00ee
        L_0x00e9:
            x4.b0 r3 = r3.M
            r3.getClass()
        L_0x00ee:
            x4.b0 r4 = r4.g(r3)
        L_0x00f2:
            r1.f21666b = r4
        L_0x00f4:
            r4 = r2
        L_0x00f5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.e.d(m3.t, a5.f, boolean):int");
    }

    public boolean isReady() {
        if (this.f5223c != -3) {
            if (!c()) {
                return false;
            }
            f fVar = this.f5222b;
            if (!fVar.z() && fVar.C[this.f5223c].v(fVar.f5238g0)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public int l(long j10) {
        int i10 = 0;
        if (!c()) {
            return 0;
        }
        f fVar = this.f5222b;
        int i11 = this.f5223c;
        if (fVar.z()) {
            return 0;
        }
        f.d dVar = fVar.C[i11];
        int r10 = dVar.r(j10, fVar.f5238g0);
        int p10 = dVar.p();
        while (true) {
            if (i10 >= fVar.f5248u.size()) {
                break;
            }
            c cVar = fVar.f5248u.get(i10);
            int g10 = fVar.f5248u.get(i10).g(i11);
            if (p10 + r10 <= g10) {
                break;
            } else if (!cVar.K) {
                r10 = g10 - p10;
                break;
            } else {
                i10++;
            }
        }
        dVar.H(r10);
        return r10;
    }
}
