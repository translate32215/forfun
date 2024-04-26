package z5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.e;
import java.util.List;
import java.util.Map;
import u6.i;

/* compiled from: IcyDataSource */
public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f28593a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28594b;

    /* renamed from: c  reason: collision with root package name */
    public final a f28595c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f28596d;

    /* renamed from: e  reason: collision with root package name */
    public int f28597e;

    /* compiled from: IcyDataSource */
    public interface a {
    }

    public j(e eVar, int i10, a aVar) {
        v6.a.a(i10 > 0);
        this.f28593a = eVar;
        this.f28594b = i10;
        this.f28595c = aVar;
        this.f28596d = new byte[1];
        this.f28597e = i10;
    }

    public Uri M() {
        return this.f28593a.M();
    }

    public Map<String, List<String>> N() {
        return this.f28593a.N();
    }

    public long O(u6.e eVar) {
        throw new UnsupportedOperationException();
    }

    public void P(i iVar) {
        iVar.getClass();
        this.f28593a.P(iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(byte[] r17, int r18, int r19) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f28597e
            r2 = -1
            if (r1 != 0) goto L_0x0079
            com.google.android.exoplayer2.upstream.e r1 = r0.f28593a
            byte[] r3 = r0.f28596d
            r4 = 1
            r5 = 0
            int r1 = r1.a(r3, r5, r4)
            if (r1 != r2) goto L_0x0015
        L_0x0013:
            r4 = 0
            goto L_0x0071
        L_0x0015:
            byte[] r1 = r0.f28596d
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L_0x0020
            goto L_0x0071
        L_0x0020:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = 0
        L_0x0024:
            if (r6 <= 0) goto L_0x0032
            com.google.android.exoplayer2.upstream.e r8 = r0.f28593a
            int r8 = r8.a(r3, r7, r6)
            if (r8 != r2) goto L_0x002f
            goto L_0x0013
        L_0x002f:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L_0x0024
        L_0x0032:
            if (r1 <= 0) goto L_0x003c
            int r5 = r1 + -1
            byte r6 = r3[r5]
            if (r6 != 0) goto L_0x003c
            r1 = r5
            goto L_0x0032
        L_0x003c:
            if (r1 <= 0) goto L_0x0071
            z5.j$a r5 = r0.f28595c
            v6.v r6 = new v6.v
            r6.<init>(r3, r1)
            z5.x$a r5 = (z5.x.a) r5
            boolean r1 = r5.f28687n
            if (r1 != 0) goto L_0x004e
            long r7 = r5.f28683j
            goto L_0x005c
        L_0x004e:
            z5.x r1 = z5.x.this
            java.util.Map<java.lang.String, java.lang.String> r3 = z5.x.f28654a0
            long r7 = r1.s()
            long r9 = r5.f28683j
            long r7 = java.lang.Math.max(r7, r9)
        L_0x005c:
            r10 = r7
            int r13 = r6.a()
            d5.a0 r9 = r5.f28686m
            r9.getClass()
            r9.b(r6, r13)
            r12 = 1
            r14 = 0
            r15 = 0
            r9.d(r10, r12, r13, r14, r15)
            r5.f28687n = r4
        L_0x0071:
            if (r4 == 0) goto L_0x0078
            int r1 = r0.f28594b
            r0.f28597e = r1
            goto L_0x0079
        L_0x0078:
            return r2
        L_0x0079:
            com.google.android.exoplayer2.upstream.e r1 = r0.f28593a
            int r3 = r0.f28597e
            r4 = r19
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r17
            r5 = r18
            int r1 = r1.a(r4, r5, r3)
            if (r1 == r2) goto L_0x0092
            int r2 = r0.f28597e
            int r2 = r2 - r1
            r0.f28597e = r2
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.j.a(byte[], int, int):int");
    }

    public void close() {
        throw new UnsupportedOperationException();
    }
}
