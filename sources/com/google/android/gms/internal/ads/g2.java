package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.ads.mediation.rtb.a;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.cw;
import d7.l;
import e.g;
import e8.ah;
import e8.aw;
import e8.bj;
import e8.c10;
import e8.cc0;
import e8.cs;
import e8.cu;
import e8.d30;
import e8.dg;
import e8.ds;
import e8.ek;
import e8.fi;
import e8.fk;
import e8.h4;
import e8.i8;
import e8.j40;
import e8.jn;
import e8.kd0;
import e8.kr;
import e8.m4;
import e8.mi;
import e8.nd0;
import e8.o9;
import e8.oi;
import e8.op;
import e8.p50;
import e8.p9;
import e8.pa0;
import e8.r4;
import e8.s10;
import e8.t;
import e8.t00;
import e8.ti0;
import e8.um;
import e8.ur;
import e8.v5;
import e8.vc;
import e8.xs;
import e8.yz;
import e8.zh0;
import f7.n;
import g7.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.interfaces.ECPublicKey;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class g2 implements vc, y9, zh, o9, b, a, l7.a, q6, j9, ds, mv, aw, ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6510a;

    /* renamed from: b  reason: collision with root package name */
    public Object f6511b;

    public g2(Context context) {
        this.f6510a = 15;
        this.f6511b = context;
    }

    private final void f(Object obj) {
        ah ahVar = (ah) obj;
        synchronized (((id) this.f6511b)) {
            ((id) this.f6511b).getClass();
            ((id) this.f6511b).f7073c = ahVar.f13729f;
            ahVar.b();
        }
    }

    public void F(Object obj) {
        switch (this.f6510a) {
            case 14:
                ((oi) obj).B((um) this.f6511b);
                return;
            case 15:
                ((bj) obj).l((Context) this.f6511b);
                return;
            default:
                ((ek) obj).k0((l5) this.f6511b);
                return;
        }
    }

    public void a(Object obj) {
        int i10 = 1;
        switch (this.f6510a) {
            case 2:
                s10 s10 = (s10) obj;
                synchronized (((df) this.f6511b)) {
                    s10.f16364a = ((fi) ((yz) ((df) this.f6511b).f6207f.f14835b).b()).a();
                    Object obj2 = this.f6511b;
                    if (((df) obj2).f6205d != 2) {
                        ((ye) ((df) obj2).f6206e).c(((df) obj2).f6202a.a(), s10);
                    }
                    Object obj3 = this.f6511b;
                    if (((df) obj3).f6205d == 1) {
                        ((df) obj3).a(((df) obj3).f6202a);
                    }
                    Object obj4 = this.f6511b;
                    ((df) obj4).f6205d = 1;
                    ((df) obj4).f6203b.i(s10);
                }
                return;
            case 12:
                ((AtomicInteger) ((p9) this.f6511b).f15881c).set(1);
                return;
            case 13:
                n8 n8Var = (n8) this.f6511b;
                c10 c10 = n8Var.f7556g;
                d30 d30 = n8Var.f7555f;
                t00 t00 = n8Var.f7553d;
                qe qeVar = n8Var.f7554e;
                List<String> b10 = d30.b(t00, qeVar, false, "", (String) obj, qeVar.f7946c);
                p pVar = l.B.f13186c;
                if (p.t(((n8) this.f6511b).f7550a)) {
                    i10 = 2;
                }
                c10.a(b10, i10);
                return;
            case 19:
                t00 t002 = (t00) obj;
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue()) {
                    xs xsVar = ((kr) this.f6511b).f15325e;
                    int i11 = ((re) t002.f16701b.f7135c).f8033e;
                    synchronized (xsVar.f17516e) {
                        xsVar.f17512a = i11;
                    }
                    xs xsVar2 = ((kr) this.f6511b).f15325e;
                    long j10 = ((re) t002.f16701b.f7135c).f8034f;
                    synchronized (xsVar2.f17517f) {
                        xsVar2.f17513b = j10;
                    }
                    return;
                }
                return;
            case 20:
                ((ur) this.f6511b).f16989c.I0(new fk((t00) obj, 0));
                return;
            case 22:
                try {
                    ((i5) this.f6511b).f1((ParcelFileDescriptor) obj);
                    return;
                } catch (RemoteException e10) {
                    e.v("Service can't call client", e10);
                    return;
                }
            case 23:
                try {
                    ((gf) this.f6511b).apply((SQLiteDatabase) obj);
                    return;
                } catch (Exception e11) {
                    String valueOf = String.valueOf(e11.getMessage());
                    e.I(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
                    return;
                }
            case 26:
                ((dg) obj).b();
                return;
            case 27:
                dg dgVar = (dg) obj;
                synchronized (((ed) this.f6511b)) {
                    Object obj5 = this.f6511b;
                    if (((ed) obj5).f6280g != null) {
                        ((ed) obj5).f6280g.a();
                    }
                    Object obj6 = this.f6511b;
                    ((ed) obj6).f6280g = dgVar;
                    ((ed) obj6).f6280g.b();
                }
                return;
            default:
                f(obj);
                return;
        }
    }

    public void b(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.f6511b)) {
            int i11 = (int) j10;
            ((ByteBuffer) this.f6511b).position(i11);
            ((ByteBuffer) this.f6511b).limit(i11 + i10);
            slice = ((ByteBuffer) this.f6511b).slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public void c() {
        j8 j8Var = (j8) this.f6511b;
        p.f5702i.postDelayed(new m4((h2) j8Var.f7134b, (r4) j8Var.f7135c, (h4) j8Var.f7136d, 0), (long) 10000);
    }

    public void d(cw.a aVar) {
        switch (this.f6510a) {
            case 24:
                iw iwVar = (iw) this.f6511b;
                if (aVar.f5971c) {
                    aVar.n();
                    aVar.f5971c = false;
                }
                cw.D((cw) aVar.f5970b, iwVar);
                return;
            default:
                ow owVar = (ow) this.f6511b;
                aw.a aVar2 = (aw.a) ((cw) aVar.f5970b).H().w();
                if (aVar2.f5971c) {
                    aVar2.n();
                    aVar2.f5971c = false;
                }
                aw.y((aw) aVar2.f5970b, owVar);
                aVar.q(aVar2);
                return;
        }
    }

    public void e(y7 y7Var) {
        y7Var.l5((Bundle) this.f6511b);
    }

    public void g(Object obj) {
        Pair pair = (Pair) this.f6511b;
        ((ky) obj).a((String) pair.first, (String) pair.second);
    }

    public void h(int i10, double d10) throws cc0 {
        kt ktVar = (kt) this.f6511b;
        ktVar.getClass();
        if (i10 == 181) {
            ktVar.f7291t.I = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    ktVar.f7291t.f15670w = (float) d10;
                    return;
                case 21970:
                    ktVar.f7291t.f15671x = (float) d10;
                    return;
                case 21971:
                    ktVar.f7291t.f15672y = (float) d10;
                    return;
                case 21972:
                    ktVar.f7291t.f15673z = (float) d10;
                    return;
                case 21973:
                    ktVar.f7291t.A = (float) d10;
                    return;
                case 21974:
                    ktVar.f7291t.B = (float) d10;
                    return;
                case 21975:
                    ktVar.f7291t.C = (float) d10;
                    return;
                case 21976:
                    ktVar.f7291t.D = (float) d10;
                    return;
                case 21977:
                    ktVar.f7291t.E = (float) d10;
                    return;
                case 21978:
                    ktVar.f7291t.F = (float) d10;
                    return;
                default:
                    return;
            }
        } else {
            ktVar.f7289r = (long) d10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f8, code lost:
        throw new e8.cc0("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(int r22, int r23, e8.fd0 r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r21
            r3 = r24
            java.lang.Object r4 = r2.f6511b
            com.google.android.gms.internal.ads.kt r4 = (com.google.android.gms.internal.ads.kt) r4
            r4.getClass()
            r5 = 161(0xa1, float:2.26E-43)
            r6 = 163(0xa3, float:2.28E-43)
            r7 = 0
            if (r0 == r5) goto L_0x0098
            if (r0 == r6) goto L_0x0098
            r5 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r5) goto L_0x008a
            r5 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r5) goto L_0x0078
            r5 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r5) goto L_0x0056
            r5 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r5) goto L_0x0048
            r5 = 30322(0x7672, float:4.249E-41)
            if (r0 != r5) goto L_0x003a
            e8.nd0 r0 = r4.f7291t
            byte[] r4 = new byte[r1]
            r0.f15662o = r4
            r0 = r3
            com.google.android.gms.internal.ads.gt r0 = (com.google.android.gms.internal.ads.gt) r0
            r0.c(r4, r7, r1, r7)
            goto L_0x029b
        L_0x003a:
            e8.cc0 r1 = new e8.cc0
            r3 = 26
            java.lang.String r4 = "Unexpected id: "
            java.lang.String r0 = l0.d.a(r3, r4, r0)
            r1.<init>(r0)
            throw r1
        L_0x0048:
            e8.nd0 r0 = r4.f7291t
            byte[] r4 = new byte[r1]
            r0.f15655h = r4
            r0 = r3
            com.google.android.gms.internal.ads.gt r0 = (com.google.android.gms.internal.ads.gt) r0
            r0.c(r4, r7, r1, r7)
            goto L_0x029b
        L_0x0056:
            e8.w60 r0 = r4.f7280i
            byte[] r0 = r0.f17220a
            java.util.Arrays.fill(r0, r7)
            e8.w60 r0 = r4.f7280i
            byte[] r0 = r0.f17220a
            int r5 = 4 - r1
            com.google.android.gms.internal.ads.gt r3 = (com.google.android.gms.internal.ads.gt) r3
            r3.c(r0, r5, r1, r7)
            e8.w60 r0 = r4.f7280i
            r0.h(r7)
            e8.w60 r0 = r4.f7280i
            long r0 = r0.n()
            int r1 = (int) r0
            r4.f7293v = r1
            goto L_0x029b
        L_0x0078:
            byte[] r0 = new byte[r1]
            com.google.android.gms.internal.ads.gt r3 = (com.google.android.gms.internal.ads.gt) r3
            r3.c(r0, r7, r1, r7)
            e8.nd0 r1 = r4.f7291t
            e8.ld0 r3 = new e8.ld0
            r3.<init>(r0)
            r1.f15654g = r3
            goto L_0x029b
        L_0x008a:
            e8.nd0 r0 = r4.f7291t
            byte[] r4 = new byte[r1]
            r0.f15653f = r4
            r0 = r3
            com.google.android.gms.internal.ads.gt r0 = (com.google.android.gms.internal.ads.gt) r0
            r0.c(r4, r7, r1, r7)
            goto L_0x029b
        L_0x0098:
            int r5 = r4.E
            r8 = 8
            r9 = 1
            if (r5 != 0) goto L_0x00bd
            com.google.android.gms.internal.ads.lt r5 = r4.f7273b
            long r10 = r5.a(r3, r7, r9, r8)
            int r5 = (int) r10
            r4.K = r5
            com.google.android.gms.internal.ads.lt r5 = r4.f7273b
            int r5 = r5.f7415c
            r4.L = r5
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.G = r10
            r4.E = r9
            e8.w60 r5 = r4.f7278g
            r5.f17221b = r7
            r5.f17222c = r7
        L_0x00bd:
            android.util.SparseArray<e8.nd0> r5 = r4.f7274c
            int r10 = r4.K
            java.lang.Object r5 = r5.get(r10)
            e8.nd0 r5 = (e8.nd0) r5
            if (r5 != 0) goto L_0x00d7
            int r0 = r4.L
            int r0 = r1 - r0
            r1 = r3
            com.google.android.gms.internal.ads.gt r1 = (com.google.android.gms.internal.ads.gt) r1
            r1.d(r0)
            r4.E = r7
            goto L_0x029b
        L_0x00d7:
            int r10 = r4.E
            if (r10 != r9) goto L_0x026a
            r10 = 3
            r4.j(r3, r10)
            e8.w60 r11 = r4.f7278g
            byte[] r11 = r11.f17220a
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r9
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00ff
            r4.I = r9
            int[] r6 = r4.J
            int[] r6 = com.google.android.gms.internal.ads.kt.i(r6, r9)
            r4.J = r6
            int r11 = r4.L
            int r1 = r1 - r11
            int r1 = r1 - r10
            r6[r7] = r1
            goto L_0x020c
        L_0x00ff:
            if (r0 != r6) goto L_0x0262
            r6 = 4
            r4.j(r3, r6)
            e8.w60 r14 = r4.f7278g
            byte[] r14 = r14.f17220a
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r9
            r4.I = r14
            int[] r15 = r4.J
            int[] r14 = com.google.android.gms.internal.ads.kt.i(r15, r14)
            r4.J = r14
            if (r11 != r12) goto L_0x0125
            int r10 = r4.L
            int r1 = r1 - r10
            int r1 = r1 - r6
            int r6 = r4.I
            int r1 = r1 / r6
            java.util.Arrays.fill(r14, r7, r6, r1)
            goto L_0x020c
        L_0x0125:
            if (r11 != r9) goto L_0x015b
            r10 = 0
            r11 = 0
        L_0x0129:
            int r12 = r4.I
            int r14 = r12 + -1
            if (r10 >= r14) goto L_0x014f
            int[] r12 = r4.J
            r12[r10] = r7
        L_0x0133:
            int r6 = r6 + r9
            r4.j(r3, r6)
            e8.w60 r12 = r4.f7278g
            byte[] r12 = r12.f17220a
            int r14 = r6 + -1
            byte r12 = r12[r14]
            r12 = r12 & r13
            int[] r14 = r4.J
            r15 = r14[r10]
            int r15 = r15 + r12
            r14[r10] = r15
            if (r12 == r13) goto L_0x0133
            r12 = r14[r10]
            int r11 = r11 + r12
            int r10 = r10 + 1
            goto L_0x0129
        L_0x014f:
            int[] r10 = r4.J
            int r12 = r12 - r9
            int r14 = r4.L
            int r1 = r1 - r14
            int r1 = r1 - r6
            int r1 = r1 - r11
            r10[r12] = r1
            goto L_0x020c
        L_0x015b:
            if (r11 != r10) goto L_0x0254
            r10 = 0
            r11 = 0
        L_0x015f:
            int r12 = r4.I
            int r14 = r12 + -1
            if (r10 >= r14) goto L_0x0201
            int[] r12 = r4.J
            r12[r10] = r7
            int r6 = r6 + 1
            r4.j(r3, r6)
            e8.w60 r12 = r4.f7278g
            byte[] r12 = r12.f17220a
            int r14 = r6 + -1
            byte r12 = r12[r14]
            if (r12 == 0) goto L_0x01f9
            r12 = 0
        L_0x0179:
            if (r12 >= r8) goto L_0x01ca
            int r17 = 7 - r12
            int r9 = r9 << r17
            e8.w60 r15 = r4.f7278g
            byte[] r15 = r15.f17220a
            byte r15 = r15[r14]
            r15 = r15 & r9
            if (r15 == 0) goto L_0x01c4
            int r6 = r6 + r12
            r4.j(r3, r6)
            e8.w60 r15 = r4.f7278g
            byte[] r15 = r15.f17220a
            int r16 = r14 + 1
            byte r14 = r15[r14]
            r14 = r14 & r13
            r9 = r9 ^ -1
            r9 = r9 & r14
            long r14 = (long) r9
            r9 = r16
            r15 = r14
        L_0x019c:
            if (r9 >= r6) goto L_0x01b4
            long r14 = r15 << r8
            e8.w60 r8 = r4.f7278g
            byte[] r8 = r8.f17220a
            int r16 = r9 + 1
            byte r8 = r8[r9]
            r8 = r8 & r13
            long r8 = (long) r8
            long r8 = r8 | r14
            r19 = r8
            r9 = r16
            r15 = r19
            r8 = 8
            goto L_0x019c
        L_0x01b4:
            if (r10 <= 0) goto L_0x01c2
            int r12 = r12 * 7
            int r12 = r12 + 6
            r8 = 1
            long r17 = r8 << r12
            long r17 = r17 - r8
            long r15 = r15 - r17
        L_0x01c2:
            r8 = r15
            goto L_0x01cc
        L_0x01c4:
            int r12 = r12 + 1
            r9 = 1
            r8 = 8
            goto L_0x0179
        L_0x01ca:
            r8 = 0
        L_0x01cc:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 < 0) goto L_0x01f1
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x01f1
            int r9 = (int) r8
            int[] r8 = r4.J
            if (r10 != 0) goto L_0x01e0
            goto L_0x01e5
        L_0x01e0:
            int r12 = r10 + -1
            r12 = r8[r12]
            int r9 = r9 + r12
        L_0x01e5:
            r8[r10] = r9
            r8 = r8[r10]
            int r11 = r11 + r8
            int r10 = r10 + 1
            r9 = 1
            r8 = 8
            goto L_0x015f
        L_0x01f1:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>(r1)
            throw r0
        L_0x01f9:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>(r1)
            throw r0
        L_0x0201:
            int[] r8 = r4.J
            r9 = 1
            int r12 = r12 - r9
            int r10 = r4.L
            int r1 = r1 - r10
            int r1 = r1 - r6
            int r1 = r1 - r11
            r8[r12] = r1
        L_0x020c:
            e8.w60 r1 = r4.f7278g
            byte[] r1 = r1.f17220a
            byte r6 = r1[r7]
            r8 = 8
            int r6 = r6 << r8
            byte r1 = r1[r9]
            r1 = r1 & r13
            r1 = r1 | r6
            long r8 = r4.A
            long r10 = (long) r1
            long r10 = r4.k(r10)
            long r10 = r10 + r8
            r4.F = r10
            e8.w60 r1 = r4.f7278g
            byte[] r1 = r1.f17220a
            r6 = 2
            byte r8 = r1[r6]
            r9 = 8
            r8 = r8 & r9
            if (r8 != r9) goto L_0x0231
            r8 = 1
            goto L_0x0232
        L_0x0231:
            r8 = 0
        L_0x0232:
            int r9 = r5.f15650c
            if (r9 == r6) goto L_0x0244
            r9 = 163(0xa3, float:2.28E-43)
            if (r0 != r9) goto L_0x0242
            byte r1 = r1[r6]
            r6 = 128(0x80, float:1.794E-43)
            r1 = r1 & r6
            if (r1 != r6) goto L_0x0242
            goto L_0x0244
        L_0x0242:
            r1 = 0
            goto L_0x0245
        L_0x0244:
            r1 = 1
        L_0x0245:
            if (r8 == 0) goto L_0x024a
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x024b
        L_0x024a:
            r6 = 0
        L_0x024b:
            r1 = r1 | r6
            r4.M = r1
            r1 = 2
            r4.E = r1
            r4.H = r7
            goto L_0x026a
        L_0x0254:
            e8.cc0 r0 = new e8.cc0
            r1 = 36
            java.lang.String r3 = "Unexpected lacing value: "
            java.lang.String r1 = l0.d.a(r1, r3, r11)
            r0.<init>(r1)
            throw r0
        L_0x0262:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Lacing only supported in SimpleBlocks."
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0294
        L_0x026e:
            int r0 = r4.H
            int r1 = r4.I
            if (r0 >= r1) goto L_0x0291
            int[] r1 = r4.J
            r0 = r1[r0]
            r4.c(r3, r5, r0)
            long r0 = r4.F
            int r6 = r4.H
            int r8 = r5.f15651d
            int r6 = r6 * r8
            int r6 = r6 / 1000
            long r8 = (long) r6
            long r0 = r0 + r8
            r4.d(r5, r0)
            int r0 = r4.H
            int r0 = r0 + 1
            r4.H = r0
            goto L_0x026e
        L_0x0291:
            r4.E = r7
            goto L_0x029b
        L_0x0294:
            int[] r0 = r4.J
            r0 = r0[r7]
            r4.c(r3, r5, r0)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g2.i(int, int, e8.fd0):void");
    }

    public void j(int i10, String str) throws cc0 {
        kt ktVar = (kt) this.f6511b;
        ktVar.getClass();
        if (i10 == 134) {
            ktVar.f7291t.f15648a = str;
        } else if (i10 != 17026) {
            if (i10 == 2274716) {
                ktVar.f7291t.N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new cc0(g.a(str.length() + 22, "DocType ", str, " not supported"));
        }
    }

    public void k(int i10, long j10) throws cc0 {
        kt ktVar = (kt) this.f6511b;
        ktVar.getClass();
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        ktVar.f7291t.f15650c = (int) j10;
                        return;
                    case 136:
                        nd0 nd0 = ktVar.f7291t;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        nd0.L = z10;
                        return;
                    case 155:
                        ktVar.G = ktVar.k(j10);
                        return;
                    case 159:
                        ktVar.f7291t.G = (int) j10;
                        return;
                    case 176:
                        ktVar.f7291t.f15657j = (int) j10;
                        return;
                    case 179:
                        ktVar.B.a(ktVar.k(j10));
                        return;
                    case 186:
                        ktVar.f7291t.f15658k = (int) j10;
                        return;
                    case 215:
                        ktVar.f7291t.f15649b = (int) j10;
                        return;
                    case 231:
                        ktVar.A = ktVar.k(j10);
                        return;
                    case 241:
                        if (!ktVar.D) {
                            ktVar.C.a(j10);
                            ktVar.D = true;
                            return;
                        }
                        return;
                    case 251:
                        ktVar.X = true;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("ContentCompAlgo ");
                            sb2.append(j10);
                            sb2.append(" not supported");
                            throw new cc0(sb2.toString());
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            StringBuilder sb3 = new StringBuilder(53);
                            sb3.append("DocTypeReadVersion ");
                            sb3.append(j10);
                            sb3.append(" not supported");
                            throw new cc0(sb3.toString());
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            StringBuilder sb4 = new StringBuilder(50);
                            sb4.append("EBMLReadVersion ");
                            sb4.append(j10);
                            sb4.append(" not supported");
                            throw new cc0(sb4.toString());
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            StringBuilder sb5 = new StringBuilder(49);
                            sb5.append("ContentEncAlgo ");
                            sb5.append(j10);
                            sb5.append(" not supported");
                            throw new cc0(sb5.toString());
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            StringBuilder sb6 = new StringBuilder(56);
                            sb6.append("AESSettingsCipherMode ");
                            sb6.append(j10);
                            sb6.append(" not supported");
                            throw new cc0(sb6.toString());
                        }
                        return;
                    case 21420:
                        ktVar.f7294w = j10 + ktVar.f7287p;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        if (i11 == 0) {
                            ktVar.f7291t.f15663p = 0;
                            return;
                        } else if (i11 == 1) {
                            ktVar.f7291t.f15663p = 2;
                            return;
                        } else if (i11 == 3) {
                            ktVar.f7291t.f15663p = 1;
                            return;
                        } else if (i11 == 15) {
                            ktVar.f7291t.f15663p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        ktVar.f7291t.f15659l = (int) j10;
                        return;
                    case 21682:
                        ktVar.f7291t.f15661n = (int) j10;
                        return;
                    case 21690:
                        ktVar.f7291t.f15660m = (int) j10;
                        return;
                    case 21930:
                        nd0 nd02 = ktVar.f7291t;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        nd02.M = z10;
                        return;
                    case 22186:
                        ktVar.f7291t.J = j10;
                        return;
                    case 22203:
                        ktVar.f7291t.K = j10;
                        return;
                    case 25188:
                        ktVar.f7291t.H = (int) j10;
                        return;
                    case 2352003:
                        ktVar.f7291t.f15651d = (int) j10;
                        return;
                    case 2807729:
                        ktVar.f7288q = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                int i12 = (int) j10;
                                if (i12 == 1) {
                                    ktVar.f7291t.f15667t = 2;
                                    return;
                                } else if (i12 == 2) {
                                    ktVar.f7291t.f15667t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 16) {
                                        ktVar.f7291t.f15666s = 6;
                                        return;
                                    } else if (i13 == 18) {
                                        ktVar.f7291t.f15666s = 7;
                                        return;
                                    } else if (!(i13 == 6 || i13 == 7)) {
                                        return;
                                    }
                                }
                                ktVar.f7291t.f15666s = 3;
                                return;
                            case 21947:
                                nd0 nd03 = ktVar.f7291t;
                                nd03.f15664q = true;
                                int i14 = (int) j10;
                                if (i14 == 1) {
                                    nd03.f15665r = 1;
                                    return;
                                } else if (i14 == 9) {
                                    nd03.f15665r = 6;
                                    return;
                                } else if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                    nd03.f15665r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                ktVar.f7291t.f15668u = (int) j10;
                                return;
                            case 21949:
                                ktVar.f7291t.f15669v = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                StringBuilder sb7 = new StringBuilder(55);
                sb7.append("ContentEncodingScope ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw new cc0(sb7.toString());
            }
        } else if (j10 != 0) {
            StringBuilder sb8 = new StringBuilder(55);
            sb8.append("ContentEncodingOrder ");
            sb8.append(j10);
            sb8.append(" not supported");
            throw new cc0(sb8.toString());
        }
    }

    public void l(int i10, long j10, long j11) throws cc0 {
        kt ktVar = (kt) this.f6511b;
        ktVar.getClass();
        if (i10 == 160) {
            ktVar.X = false;
        } else if (i10 == 174) {
            ktVar.f7291t = new nd0((androidx.databinding.a) null);
        } else if (i10 == 187) {
            ktVar.D = false;
        } else if (i10 == 19899) {
            ktVar.f7293v = -1;
            ktVar.f7294w = -1;
        } else if (i10 == 20533) {
            ktVar.f7291t.f15652e = true;
        } else if (i10 == 21968) {
            ktVar.f7291t.f15664q = true;
        } else if (i10 == 408125543) {
            long j12 = ktVar.f7287p;
            if (j12 == -1 || j12 == j10) {
                ktVar.f7287p = j10;
                ktVar.f7286o = j11;
                return;
            }
            throw new cc0("Multiple Segment elements not supported");
        } else if (i10 == 475249515) {
            ktVar.B = new se(7, (q.e) null);
            ktVar.C = new se(7, (q.e) null);
        } else if (i10 != 524531317 || ktVar.f7292u) {
        } else {
            if (!ktVar.f7275d || ktVar.f7296y == -1) {
                yt ytVar = (yt) ktVar.Y;
                ytVar.f8658y = new kd0(ktVar.f7290s);
                ytVar.f8655v.post(ytVar.f8653t);
                ktVar.f7292u = true;
                return;
            }
            ktVar.f7295x = true;
        }
    }

    public void m(Object obj) {
        h2 h2Var = (h2) this.f6511b;
        h2Var.getClass();
        if (((h4) obj).f()) {
            h2Var.f6732h = 1;
        }
    }

    public void n(Throwable th) {
        String str;
        int i10 = 1;
        switch (this.f6510a) {
            case 2:
                synchronized (((df) this.f6511b)) {
                    ((df) this.f6511b).f6207f.getClass();
                    ((df) this.f6511b).f6203b.j(th);
                }
                return;
            case 12:
                ((AtomicInteger) ((p9) this.f6511b).f15881c).set(-1);
                return;
            case 13:
                n8 n8Var = (n8) this.f6511b;
                c10 c10 = n8Var.f7556g;
                d30 d30 = n8Var.f7555f;
                t00 t00 = n8Var.f7553d;
                qe qeVar = n8Var.f7554e;
                List<String> b10 = d30.b(t00, qeVar, false, "", "failure_click_attok", qeVar.f7946c);
                p pVar = l.B.f13186c;
                if (p.t(((n8) this.f6511b).f7550a)) {
                    i10 = 2;
                }
                c10.a(b10, i10);
                return;
            case 19:
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue()) {
                    Matcher matcher = kr.f15320f.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        xs xsVar = ((kr) this.f6511b).f15325e;
                        int parseInt = Integer.parseInt(group);
                        synchronized (xsVar.f17516e) {
                            xsVar.f17512a = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                return;
            case 22:
                try {
                    i5 i5Var = (i5) this.f6511b;
                    zh0 N = e.N(th);
                    String message = th.getMessage();
                    int i11 = j40.f15091a;
                    if (message != null) {
                        if (!message.isEmpty()) {
                            i10 = 0;
                        }
                    }
                    if (i10 != 0) {
                        str = N.f17754b;
                    } else {
                        str = th.getMessage();
                    }
                    i5Var.d6(new n(str, N.f17753a));
                    return;
                } catch (RemoteException e10) {
                    e.v("Service can't call client", e10);
                    return;
                }
            case 23:
                String valueOf = String.valueOf(th.getMessage());
                e.I(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
                return;
            default:
                zh0 q10 = e.q(th, ((cu) this.f6511b).f14190a.c().f15523l);
                ((cu) this.f6511b).f14193d.I0(new mi(q10, 0));
                androidx.appcompat.widget.p.q(q10.f17753a, th, "DelayedBannerAd.onFailure");
                return;
        }
    }

    public long size() {
        return (long) ((ByteBuffer) this.f6511b).capacity();
    }

    public void w() {
        switch (this.f6510a) {
            case 27:
                synchronized (((ed) this.f6511b)) {
                    ((ed) this.f6511b).f6280g = null;
                }
                return;
            default:
                synchronized (((id) this.f6511b)) {
                    ((id) this.f6511b).getClass();
                }
                return;
        }
    }

    public p50 y(l5 l5Var) {
        return ((cs) ((pa0) ((j8) this.f6511b).f7136d).get()).y6(l5Var.f7323r);
    }

    public g2(Bundle bundle) {
        this.f6510a = 11;
        this.f6511b = bundle;
    }

    public g2(Pair pair) {
        this.f6510a = 28;
        this.f6511b = pair;
    }

    public g2(h2 h2Var) {
        this.f6510a = 5;
        this.f6511b = h2Var;
    }

    public g2(l5 l5Var) {
        this.f6510a = 16;
        this.f6511b = l5Var;
    }

    public g2(j8 j8Var) {
        this.f6510a = 0;
        this.f6511b = j8Var;
    }

    public g2(j8 j8Var, q.e eVar) {
        this.f6510a = 21;
        this.f6511b = j8Var;
    }

    public g2(iw iwVar) {
        this.f6510a = 24;
        this.f6511b = iwVar;
    }

    public g2(ow owVar) {
        this.f6510a = 25;
        this.f6511b = owVar;
    }

    public g2(um umVar) {
        this.f6510a = 14;
        this.f6511b = umVar;
    }

    public g2() {
        this.f6510a = 8;
        this.f6511b = new WeakHashMap();
    }

    public g2(v1 v1Var) {
        this.f6510a = 6;
        this.f6511b = v1Var;
    }

    public g2(i5 i5Var) {
        this.f6510a = 22;
        this.f6511b = i5Var;
    }

    public g2(y5 y5Var) {
        this.f6510a = 9;
        this.f6511b = y5Var;
    }

    public g2(n8 n8Var) {
        this.f6510a = 13;
        this.f6511b = n8Var;
    }

    public g2(ed edVar) {
        this.f6510a = 27;
        this.f6511b = edVar;
    }

    public g2(id idVar) {
        this.f6510a = 29;
        this.f6511b = idVar;
    }

    public g2(df dfVar) {
        this.f6510a = 2;
        this.f6511b = dfVar;
    }

    public g2(gf gfVar) {
        this.f6510a = 23;
        this.f6511b = gfVar;
    }

    public g2(v5 v5Var) {
        this.f6510a = 7;
        this.f6511b = v5Var;
    }

    public g2(i8 i8Var) {
        this.f6510a = 10;
        this.f6511b = i8Var;
    }

    public g2(p9 p9Var) {
        this.f6510a = 12;
        this.f6511b = p9Var;
    }

    public g2(jn jnVar) {
        this.f6510a = 17;
        this.f6511b = jnVar;
    }

    public g2(op opVar) {
        this.f6510a = 18;
        this.f6511b = opVar;
    }

    public g2(kr krVar) {
        this.f6510a = 19;
        this.f6511b = krVar;
    }

    public g2(ur urVar) {
        this.f6510a = 20;
        this.f6511b = urVar;
    }

    public g2(cu cuVar) {
        this.f6510a = 26;
        this.f6511b = cuVar;
    }

    public g2(ByteBuffer byteBuffer) {
        this.f6510a = 1;
        this.f6511b = byteBuffer.slice();
    }

    public g2(ECPublicKey eCPublicKey) {
        this.f6510a = 3;
        this.f6511b = eCPublicKey;
    }

    public g2(kt ktVar, androidx.databinding.a aVar) {
        this.f6510a = 4;
        this.f6510a = 4;
        this.f6511b = ktVar;
    }
}
