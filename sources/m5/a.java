package m5;

import d5.a0;
import d5.i;
import d5.j;
import d5.k;
import d5.x;
import java.io.IOException;
import v6.v;
import x4.b0;

/* compiled from: RawCcExtractor */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f21714a;

    /* renamed from: b  reason: collision with root package name */
    public final v f21715b = new v(9);

    /* renamed from: c  reason: collision with root package name */
    public a0 f21716c;

    /* renamed from: d  reason: collision with root package name */
    public int f21717d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f21718e;

    /* renamed from: f  reason: collision with root package name */
    public long f21719f;

    /* renamed from: g  reason: collision with root package name */
    public int f21720g;

    /* renamed from: h  reason: collision with root package name */
    public int f21721h;

    public a(b0 b0Var) {
        this.f21714a = b0Var;
    }

    public void a() {
    }

    public boolean e(j jVar) throws IOException {
        this.f21715b.z(8);
        jVar.j(this.f21715b.f26518a, 0, 8);
        if (this.f21715b.f() == 1380139777) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r11, d5.w r12) throws java.io.IOException {
        /*
            r10 = this;
            d5.a0 r12 = r10.f21716c
            v6.a.f(r12)
        L_0x0005:
            int r12 = r10.f21717d
            r0 = -1
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x00b5
            r3 = 2
            if (r12 == r2) goto L_0x004b
            if (r12 != r3) goto L_0x0045
        L_0x0011:
            int r12 = r10.f21720g
            if (r12 <= 0) goto L_0x0034
            v6.v r12 = r10.f21715b
            r3 = 3
            r12.z(r3)
            v6.v r12 = r10.f21715b
            byte[] r12 = r12.f26518a
            r11.readFully(r12, r1, r3)
            d5.a0 r12 = r10.f21716c
            v6.v r4 = r10.f21715b
            r12.b(r4, r3)
            int r12 = r10.f21721h
            int r12 = r12 + r3
            r10.f21721h = r12
            int r12 = r10.f21720g
            int r12 = r12 + r0
            r10.f21720g = r12
            goto L_0x0011
        L_0x0034:
            int r7 = r10.f21721h
            if (r7 <= 0) goto L_0x0042
            d5.a0 r3 = r10.f21716c
            long r4 = r10.f21719f
            r6 = 1
            r8 = 0
            r9 = 0
            r3.d(r4, r6, r7, r8, r9)
        L_0x0042:
            r10.f21717d = r2
            return r1
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        L_0x004b:
            int r12 = r10.f21718e
            if (r12 != 0) goto L_0x0070
            v6.v r12 = r10.f21715b
            r4 = 5
            r12.z(r4)
            v6.v r12 = r10.f21715b
            byte[] r12 = r12.f26518a
            boolean r12 = r11.d(r12, r1, r4, r2)
            if (r12 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            v6.v r12 = r10.f21715b
            long r4 = r12.t()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r6 = 45
            long r4 = r4 / r6
            r10.f21719f = r4
            goto L_0x008d
        L_0x0070:
            if (r12 != r2) goto L_0x00a0
            v6.v r12 = r10.f21715b
            r4 = 9
            r12.z(r4)
            v6.v r12 = r10.f21715b
            byte[] r12 = r12.f26518a
            boolean r12 = r11.d(r12, r1, r4, r2)
            if (r12 != 0) goto L_0x0085
        L_0x0083:
            r2 = 0
            goto L_0x0097
        L_0x0085:
            v6.v r12 = r10.f21715b
            long r4 = r12.m()
            r10.f21719f = r4
        L_0x008d:
            v6.v r12 = r10.f21715b
            int r12 = r12.s()
            r10.f21720g = r12
            r10.f21721h = r1
        L_0x0097:
            if (r2 == 0) goto L_0x009d
            r10.f21717d = r3
            goto L_0x0005
        L_0x009d:
            r10.f21717d = r1
            return r0
        L_0x00a0:
            x4.m0 r11 = new x4.m0
            java.lang.String r12 = "Unsupported version number: "
            java.lang.StringBuilder r12 = android.support.v4.media.a.a(r12)
            int r0 = r10.f21718e
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>((java.lang.String) r12)
            throw r11
        L_0x00b5:
            v6.v r12 = r10.f21715b
            r3 = 8
            r12.z(r3)
            v6.v r12 = r10.f21715b
            byte[] r12 = r12.f26518a
            boolean r12 = r11.d(r12, r1, r3, r2)
            if (r12 == 0) goto L_0x00e3
            v6.v r12 = r10.f21715b
            int r12 = r12.f()
            r1 = 1380139777(0x52434301, float:2.0966069E11)
            if (r12 != r1) goto L_0x00db
            v6.v r12 = r10.f21715b
            int r12 = r12.s()
            r10.f21718e = r12
            r1 = 1
            goto L_0x00e3
        L_0x00db:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Input not RawCC"
            r11.<init>(r12)
            throw r11
        L_0x00e3:
            if (r1 == 0) goto L_0x00e9
            r10.f21717d = r2
            goto L_0x0005
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.a.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        this.f21717d = 0;
    }

    public void i(k kVar) {
        kVar.b(new x.b(-9223372036854775807L, 0));
        a0 l10 = kVar.l(0, 3);
        this.f21716c = l10;
        l10.c(this.f21714a);
        kVar.d();
    }
}
