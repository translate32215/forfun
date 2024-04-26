package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import e8.ae0;
import e8.bg0;
import e8.cc0;
import e8.eg0;
import e8.fd0;
import e8.id0;
import e8.od0;
import e8.pd0;
import e8.ud0;
import e8.vd0;
import e8.w60;
import e8.y9;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nt implements ht {

    /* renamed from: x  reason: collision with root package name */
    public static final int f7610x = eg0.f("seig");

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f7611y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<vd0> f7612a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final w60 f7613b = new w60(bg0.f14009a, 1);

    /* renamed from: c  reason: collision with root package name */
    public final w60 f7614c = new w60(5);

    /* renamed from: d  reason: collision with root package name */
    public final w60 f7615d = new w60();

    /* renamed from: e  reason: collision with root package name */
    public final w60 f7616e = new w60(1);

    /* renamed from: f  reason: collision with root package name */
    public final w60 f7617f = new w60(16);

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f7618g = new byte[16];

    /* renamed from: h  reason: collision with root package name */
    public final Stack<od0> f7619h = new Stack<>();

    /* renamed from: i  reason: collision with root package name */
    public final LinkedList<ud0> f7620i = new LinkedList<>();

    /* renamed from: j  reason: collision with root package name */
    public int f7621j;

    /* renamed from: k  reason: collision with root package name */
    public int f7622k;

    /* renamed from: l  reason: collision with root package name */
    public long f7623l;

    /* renamed from: m  reason: collision with root package name */
    public int f7624m;

    /* renamed from: n  reason: collision with root package name */
    public w60 f7625n;

    /* renamed from: o  reason: collision with root package name */
    public long f7626o;

    /* renamed from: p  reason: collision with root package name */
    public int f7627p;

    /* renamed from: q  reason: collision with root package name */
    public long f7628q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    public vd0 f7629r;

    /* renamed from: s  reason: collision with root package name */
    public int f7630s;

    /* renamed from: t  reason: collision with root package name */
    public int f7631t;

    /* renamed from: u  reason: collision with root package name */
    public int f7632u;

    /* renamed from: v  reason: collision with root package name */
    public id0 f7633v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7634w;

    public nt() {
        i();
    }

    public static void b(w60 w60, int i10, ae0 ae0) throws cc0 {
        w60.h(i10 + 8);
        int b10 = w60.b();
        int i11 = pd0.f15946b;
        int i12 = b10 & 16777215;
        if ((i12 & 1) == 0) {
            boolean z10 = (i12 & 2) != 0;
            int o10 = w60.o();
            if (o10 == ae0.f13699e) {
                Arrays.fill(ae0.f13707m, 0, o10, z10);
                ae0.a(w60.m());
                w60.l(ae0.f13710p.f17220a, 0, ae0.f13709o);
                ae0.f13710p.h(0);
                ae0.f13711q = false;
                return;
            }
            throw new cc0(y9.a(41, "Length mismatch: ", o10, ", ", ae0.f13699e));
        }
        throw new cc0("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.et c(java.util.List<e8.qd0> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00be
            java.lang.Object r5 = r14.get(r3)
            e8.qd0 r5 = (e8.qd0) r5
            int r6 = r5.f15996a
            int r7 = e8.pd0.V
            if (r6 != r7) goto L_0x00ba
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            e8.w60 r5 = r5.P0
            byte[] r5 = r5.f17220a
            e8.w60 r6 = new e8.w60
            r8 = 1
            r6.<init>(r5, r8)
            int r9 = r6.f17222c
            r10 = 32
            if (r9 >= r10) goto L_0x002e
            goto L_0x008a
        L_0x002e:
            r6.h(r1)
            int r9 = r6.b()
            int r10 = r6.m()
            int r10 = r10 + 4
            if (r9 == r10) goto L_0x003e
            goto L_0x008a
        L_0x003e:
            int r9 = r6.b()
            if (r9 == r7) goto L_0x0045
            goto L_0x008a
        L_0x0045:
            int r7 = r6.b()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 <= r8) goto L_0x0068
            r6 = 37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Unsupported pssh version: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x008a
        L_0x0068:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.c()
            long r12 = r6.c()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0080
            int r7 = r6.o()
            int r7 = r7 << 4
            r6.i(r7)
        L_0x0080:
            int r7 = r6.o()
            int r8 = r6.m()
            if (r7 == r8) goto L_0x008c
        L_0x008a:
            r6 = r2
            goto L_0x009e
        L_0x008c:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.f17220a
            int r11 = r6.f17221b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.f17221b
            int r10 = r10 + r7
            r6.f17221b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x009e:
            if (r6 != 0) goto L_0x00a2
            r6 = r2
            goto L_0x00a6
        L_0x00a2:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x00a6:
            if (r6 != 0) goto L_0x00b0
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00ba
        L_0x00b0:
            com.google.android.gms.internal.ads.et$a r7 = new com.google.android.gms.internal.ads.et$a
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        L_0x00ba:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00be:
            if (r4 != 0) goto L_0x00c1
            return r2
        L_0x00c1:
            com.google.android.gms.internal.ads.et r14 = new com.google.android.gms.internal.ads.et
            int r0 = r4.size()
            com.google.android.gms.internal.ads.et$a[] r0 = new com.google.android.gms.internal.ads.et.a[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.android.gms.internal.ads.et$a[] r0 = (com.google.android.gms.internal.ads.et.a[]) r0
            r14.<init>(r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt.c(java.util.List):com.google.android.gms.internal.ads.et");
    }

    public final void a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0381  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(long r50) throws e8.cc0 {
        /*
            r49 = this;
            r0 = r49
            r1 = r0
        L_0x0003:
            java.util.Stack<e8.od0> r2 = r1.f7619h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x06c4
            java.util.Stack<e8.od0> r2 = r1.f7619h
            java.lang.Object r2 = r2.peek()
            e8.od0 r2 = (e8.od0) r2
            long r2 = r2.P0
            int r4 = (r2 > r50 ? 1 : (r2 == r50 ? 0 : -1))
            if (r4 != 0) goto L_0x06c4
            java.util.Stack<e8.od0> r2 = r1.f7619h
            java.lang.Object r2 = r2.pop()
            e8.od0 r2 = (e8.od0) r2
            int r3 = r2.f15996a
            int r4 = e8.pd0.C
            r5 = 12
            r6 = 8
            r7 = 1
            if (r3 != r4) goto L_0x0180
            java.util.List<e8.qd0> r3 = r2.Q0
            com.google.android.gms.internal.ads.et r3 = c(r3)
            int r4 = e8.pd0.N
            e8.od0 r4 = r2.c(r4)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<e8.qd0> r10 = r4.Q0
            int r10 = r10.size()
            r11 = 0
            r15 = r8
        L_0x004a:
            if (r11 >= r10) goto L_0x00b4
            java.util.List<e8.qd0> r8 = r4.Q0
            java.lang.Object r8 = r8.get(r11)
            e8.qd0 r8 = (e8.qd0) r8
            int r9 = r8.f15996a
            int r12 = e8.pd0.f15994z
            if (r9 != r12) goto L_0x0091
            e8.w60 r8 = r8.P0
            r8.h(r5)
            int r5 = r8.b()
            int r9 = r8.o()
            int r9 = r9 - r7
            int r12 = r8.o()
            int r13 = r8.o()
            int r8 = r8.b()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            e8.td0 r7 = new e8.td0
            r7.<init>(r9, r12, r13, r8)
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
            java.lang.Object r7 = r5.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r5 = r5.second
            e8.td0 r5 = (e8.td0) r5
            r14.put(r7, r5)
            goto L_0x00ae
        L_0x0091:
            int r5 = e8.pd0.O
            if (r9 != r5) goto L_0x00ae
            e8.w60 r5 = r8.P0
            r5.h(r6)
            int r7 = r5.b()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L_0x00a9
            long r7 = r5.n()
            goto L_0x00ad
        L_0x00a9:
            long r7 = r5.p()
        L_0x00ad:
            r15 = r7
        L_0x00ae:
            int r11 = r11 + 1
            r5 = 12
            r7 = 1
            goto L_0x004a
        L_0x00b4:
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.List<e8.od0> r5 = r2.R0
            int r5 = r5.size()
            r6 = 0
        L_0x00c0:
            if (r6 >= r5) goto L_0x00e8
            java.util.List<e8.od0> r7 = r2.R0
            java.lang.Object r7 = r7.get(r6)
            r8 = r7
            e8.od0 r8 = (e8.od0) r8
            int r7 = r8.f15996a
            int r9 = e8.pd0.E
            if (r7 != r9) goto L_0x00e5
            int r7 = e8.pd0.D
            e8.qd0 r9 = r2.b(r7)
            r13 = 0
            r10 = r15
            r12 = r3
            e8.yd0 r7 = com.google.android.gms.internal.ads.mt.b(r8, r9, r10, r12, r13)
            if (r7 == 0) goto L_0x00e5
            int r8 = r7.f17608a
            r4.put(r8, r7)
        L_0x00e5:
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00e8:
            int r2 = r4.size()
            android.util.SparseArray<e8.vd0> r3 = r1.f7612a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0140
            r3 = 0
        L_0x00f5:
            if (r3 >= r2) goto L_0x0137
            java.lang.Object r5 = r4.valueAt(r3)
            e8.yd0 r5 = (e8.yd0) r5
            e8.vd0 r6 = new e8.vd0
            e8.id0 r7 = r1.f7633v
            int r8 = r5.f17609b
            com.google.android.gms.internal.ads.yt r7 = (com.google.android.gms.internal.ads.yt) r7
            com.google.android.gms.internal.ads.gu r7 = r7.o(r3, r8)
            r6.<init>(r7)
            int r8 = r5.f17608a
            java.lang.Object r8 = r14.get(r8)
            e8.td0 r8 = (e8.td0) r8
            r6.f17117c = r5
            r8.getClass()
            r6.f17118d = r8
            e8.bc0 r8 = r5.f17613f
            r7.g(r8)
            r6.a()
            android.util.SparseArray<e8.vd0> r7 = r1.f7612a
            int r8 = r5.f17608a
            r7.put(r8, r6)
            long r6 = r1.f7628q
            long r8 = r5.f17612e
            long r5 = java.lang.Math.max(r6, r8)
            r1.f7628q = r5
            int r3 = r3 + 1
            goto L_0x00f5
        L_0x0137:
            e8.id0 r2 = r1.f7633v
            com.google.android.gms.internal.ads.yt r2 = (com.google.android.gms.internal.ads.yt) r2
            r2.p()
            goto L_0x0003
        L_0x0140:
            android.util.SparseArray<e8.vd0> r3 = r1.f7612a
            int r3 = r3.size()
            if (r3 != r2) goto L_0x014a
            r7 = 1
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            o.a.c(r7)
            r3 = 0
        L_0x014f:
            if (r3 >= r2) goto L_0x0003
            java.lang.Object r5 = r4.valueAt(r3)
            e8.yd0 r5 = (e8.yd0) r5
            android.util.SparseArray<e8.vd0> r6 = r1.f7612a
            int r7 = r5.f17608a
            java.lang.Object r6 = r6.get(r7)
            e8.vd0 r6 = (e8.vd0) r6
            int r7 = r5.f17608a
            java.lang.Object r7 = r14.get(r7)
            e8.td0 r7 = (e8.td0) r7
            r6.getClass()
            r6.f17117c = r5
            r7.getClass()
            r6.f17118d = r7
            com.google.android.gms.internal.ads.gu r7 = r6.f17116b
            e8.bc0 r5 = r5.f17613f
            r7.g(r5)
            r6.a()
            int r3 = r3 + 1
            goto L_0x014f
        L_0x0180:
            int r4 = e8.pd0.L
            if (r3 != r4) goto L_0x06ab
            android.util.SparseArray<e8.vd0> r3 = r1.f7612a
            byte[] r1 = r1.f7618g
            java.util.List<e8.od0> r4 = r2.R0
            int r4 = r4.size()
            r5 = 0
            r7 = 1
        L_0x0190:
            if (r5 >= r4) goto L_0x0609
            java.util.List<e8.od0> r8 = r2.R0
            java.lang.Object r8 = r8.get(r5)
            e8.od0 r8 = (e8.od0) r8
            int r9 = r8.f15996a
            int r10 = e8.pd0.M
            if (r9 != r10) goto L_0x05ee
            int r9 = e8.pd0.f15992y
            e8.qd0 r9 = r8.b(r9)
            e8.w60 r9 = r9.P0
            r9.h(r6)
            int r10 = r9.b()
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r11 = r9.b()
            java.lang.Object r11 = r3.get(r11)
            e8.vd0 r11 = (e8.vd0) r11
            if (r11 != 0) goto L_0x01c1
            r11 = 0
            goto L_0x0207
        L_0x01c1:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01cf
            long r12 = r9.p()
            e8.ae0 r14 = r11.f17115a
            r14.f13696b = r12
            r14.f13697c = r12
        L_0x01cf:
            e8.td0 r12 = r11.f17118d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01db
            int r13 = r9.o()
            int r13 = r13 - r7
            goto L_0x01dd
        L_0x01db:
            int r13 = r12.f16740a
        L_0x01dd:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01e6
            int r14 = r9.o()
            goto L_0x01e8
        L_0x01e6:
            int r14 = r12.f16741b
        L_0x01e8:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01f1
            int r15 = r9.o()
            goto L_0x01f3
        L_0x01f1:
            int r15 = r12.f16742c
        L_0x01f3:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01fc
            int r9 = r9.o()
            goto L_0x01fe
        L_0x01fc:
            int r9 = r12.f16743d
        L_0x01fe:
            e8.ae0 r10 = r11.f17115a
            e8.td0 r12 = new e8.td0
            r12.<init>(r13, r14, r15, r9)
            r10.f13695a = r12
        L_0x0207:
            if (r11 == 0) goto L_0x05ee
            e8.ae0 r9 = r11.f17115a
            long r12 = r9.f13712r
            r11.a()
            int r10 = e8.pd0.f15990x
            e8.qd0 r14 = r8.b(r10)
            if (r14 == 0) goto L_0x0234
            e8.qd0 r10 = r8.b(r10)
            e8.w60 r10 = r10.P0
            r10.h(r6)
            int r6 = r10.b()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0230
            long r12 = r10.p()
            goto L_0x0234
        L_0x0230:
            long r12 = r10.n()
        L_0x0234:
            java.util.List<e8.qd0> r6 = r8.Q0
            int r7 = r6.size()
            r10 = 0
            r14 = 0
            r15 = 0
        L_0x023d:
            if (r15 >= r7) goto L_0x026c
            java.lang.Object r16 = r6.get(r15)
            r17 = r3
            r3 = r16
            e8.qd0 r3 = (e8.qd0) r3
            r16 = r4
            int r4 = r3.f15996a
            r18 = r12
            int r12 = e8.pd0.A
            if (r4 != r12) goto L_0x0263
            e8.w60 r3 = r3.P0
            r4 = 12
            r3.h(r4)
            int r3 = r3.o()
            if (r3 <= 0) goto L_0x0263
            int r10 = r10 + r3
            int r14 = r14 + 1
        L_0x0263:
            int r15 = r15 + 1
            r4 = r16
            r3 = r17
            r12 = r18
            goto L_0x023d
        L_0x026c:
            r17 = r3
            r16 = r4
            r18 = r12
            r3 = 0
            r11.f17121g = r3
            r11.f17120f = r3
            r11.f17119e = r3
            e8.ae0 r3 = r11.f17115a
            r3.f13698d = r14
            r3.f13699e = r10
            int[] r4 = r3.f13701g
            if (r4 == 0) goto L_0x0286
            int r4 = r4.length
            if (r4 >= r14) goto L_0x028e
        L_0x0286:
            long[] r4 = new long[r14]
            r3.f13700f = r4
            int[] r4 = new int[r14]
            r3.f13701g = r4
        L_0x028e:
            int[] r4 = r3.f13702h
            if (r4 == 0) goto L_0x0295
            int r4 = r4.length
            if (r4 >= r10) goto L_0x02ad
        L_0x0295:
            int r10 = r10 * 125
            int r10 = r10 / 100
            int[] r4 = new int[r10]
            r3.f13702h = r4
            int[] r4 = new int[r10]
            r3.f13703i = r4
            long[] r4 = new long[r10]
            r3.f13704j = r4
            boolean[] r4 = new boolean[r10]
            r3.f13705k = r4
            boolean[] r4 = new boolean[r10]
            r3.f13707m = r4
        L_0x02ad:
            r3 = 0
            r4 = 0
            r10 = 0
        L_0x02b0:
            if (r3 >= r7) goto L_0x0432
            java.lang.Object r12 = r6.get(r3)
            e8.qd0 r12 = (e8.qd0) r12
            int r13 = r12.f15996a
            int r14 = e8.pd0.A
            if (r13 != r14) goto L_0x040a
            int r13 = r4 + 1
            e8.w60 r12 = r12.P0
            r14 = 8
            r12.h(r14)
            int r14 = r12.b()
            r15 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r15
            e8.yd0 r15 = r11.f17117c
            r20 = r6
            e8.ae0 r6 = r11.f17115a
            r21 = r7
            e8.td0 r7 = r6.f13695a
            r22 = r13
            int[] r13 = r6.f13701g
            int r23 = r12.o()
            r13[r4] = r23
            long[] r13 = r6.f13700f
            r23 = r1
            long r0 = r6.f13696b
            r13[r4] = r0
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0300
            r0 = r13[r4]
            r24 = r2
            int r2 = r12.b()
            r25 = r8
            r26 = r9
            long r8 = (long) r2
            long r0 = r0 + r8
            r13[r4] = r0
            goto L_0x0306
        L_0x0300:
            r24 = r2
            r25 = r8
            r26 = r9
        L_0x0306:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x030c
            r0 = 1
            goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            int r1 = r7.f16743d
            if (r0 == 0) goto L_0x0315
            int r1 = r12.o()
        L_0x0315:
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x031b
            r2 = 1
            goto L_0x031c
        L_0x031b:
            r2 = 0
        L_0x031c:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0322
            r8 = 1
            goto L_0x0323
        L_0x0322:
            r8 = 0
        L_0x0323:
            r9 = r14 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0329
            r9 = 1
            goto L_0x032a
        L_0x0329:
            r9 = 0
        L_0x032a:
            r13 = r14 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0330
            r13 = 1
            goto L_0x0331
        L_0x0330:
            r13 = 0
        L_0x0331:
            long[] r14 = r15.f17616i
            if (r14 == 0) goto L_0x0356
            r27 = r1
            int r1 = r14.length
            r28 = r5
            r5 = 1
            if (r1 != r5) goto L_0x035a
            r1 = 0
            r29 = r14[r1]
            r31 = 0
            int r5 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r5 != 0) goto L_0x035a
            long[] r5 = r15.f17617j
            r29 = r5[r1]
            r31 = 1000(0x3e8, double:4.94E-321)
            r1 = r13
            long r13 = r15.f17610c
            r33 = r13
            long r13 = e8.eg0.b(r29, r31, r33)
            goto L_0x035d
        L_0x0356:
            r27 = r1
            r28 = r5
        L_0x035a:
            r1 = r13
            r13 = 0
        L_0x035d:
            int[] r5 = r6.f13702h
            r29 = r11
            int[] r11 = r6.f13703i
            r30 = r3
            long[] r3 = r6.f13704j
            r31 = r5
            boolean[] r5 = r6.f13705k
            r32 = r5
            int[] r5 = r6.f13701g
            r5 = r5[r4]
            int r5 = r5 + r10
            r39 = r13
            long r13 = r15.f17610c
            if (r4 <= 0) goto L_0x037c
            r15 = r3
            long r3 = r6.f13712r
            goto L_0x037f
        L_0x037c:
            r15 = r3
            r3 = r18
        L_0x037f:
            if (r10 >= r5) goto L_0x0401
            if (r2 == 0) goto L_0x038c
            int r33 = r12.o()
            r41 = r2
            r2 = r33
            goto L_0x0390
        L_0x038c:
            r41 = r2
            int r2 = r7.f16741b
        L_0x0390:
            if (r8 == 0) goto L_0x039b
            int r33 = r12.o()
            r42 = r5
            r5 = r33
            goto L_0x039f
        L_0x039b:
            r42 = r5
            int r5 = r7.f16742c
        L_0x039f:
            if (r10 != 0) goto L_0x03a8
            if (r0 == 0) goto L_0x03a8
            r43 = r0
            r0 = r27
            goto L_0x03b7
        L_0x03a8:
            if (r9 == 0) goto L_0x03b3
            int r33 = r12.b()
            r43 = r0
            r0 = r33
            goto L_0x03b7
        L_0x03b3:
            r43 = r0
            int r0 = r7.f16743d
        L_0x03b7:
            if (r1 == 0) goto L_0x03cb
            r44 = r1
            int r1 = r12.b()
            int r1 = r1 * 1000
            r45 = r7
            r46 = r8
            long r7 = (long) r1
            long r7 = r7 / r13
            int r1 = (int) r7
            r11[r10] = r1
            goto L_0x03d4
        L_0x03cb:
            r44 = r1
            r45 = r7
            r46 = r8
            r1 = 0
            r11[r10] = r1
        L_0x03d4:
            r35 = 1000(0x3e8, double:4.94E-321)
            r33 = r3
            r37 = r13
            long r7 = e8.eg0.b(r33, r35, r37)
            long r7 = r7 - r39
            r15[r10] = r7
            r31[r10] = r5
            int r0 = r0 >> 16
            r0 = r0 & 1
            if (r0 != 0) goto L_0x03ec
            r0 = 1
            goto L_0x03ed
        L_0x03ec:
            r0 = 0
        L_0x03ed:
            r32[r10] = r0
            long r0 = (long) r2
            long r3 = r3 + r0
            int r10 = r10 + 1
            r2 = r41
            r5 = r42
            r0 = r43
            r1 = r44
            r7 = r45
            r8 = r46
            goto L_0x037f
        L_0x0401:
            r42 = r5
            r6.f13712r = r3
            r4 = r22
            r10 = r42
            goto L_0x041c
        L_0x040a:
            r23 = r1
            r24 = r2
            r30 = r3
            r28 = r5
            r20 = r6
            r21 = r7
            r25 = r8
            r26 = r9
            r29 = r11
        L_0x041c:
            int r3 = r30 + 1
            r0 = r49
            r6 = r20
            r7 = r21
            r1 = r23
            r2 = r24
            r8 = r25
            r9 = r26
            r5 = r28
            r11 = r29
            goto L_0x02b0
        L_0x0432:
            r23 = r1
            r24 = r2
            r28 = r5
            r25 = r8
            r26 = r9
            r29 = r11
            int r0 = e8.pd0.f15951d0
            e8.qd0 r0 = r8.b(r0)
            if (r0 == 0) goto L_0x04b4
            r11 = r29
            e8.yd0 r1 = r11.f17117c
            e8.xd0[] r1 = r1.f17615h
            r2 = r26
            e8.td0 r3 = r2.f13695a
            int r3 = r3.f16740a
            r1 = r1[r3]
            e8.w60 r0 = r0.P0
            int r1 = r1.f17481a
            r3 = 8
            r0.h(r3)
            int r4 = r0.b()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r5
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x046c
            r0.i(r3)
        L_0x046c:
            int r3 = r0.d()
            int r4 = r0.o()
            int r5 = r2.f13699e
            if (r4 != r5) goto L_0x04a2
            if (r3 != 0) goto L_0x048f
            boolean[] r3 = r2.f13707m
            r5 = 0
            r6 = 0
        L_0x047e:
            if (r5 >= r4) goto L_0x049e
            int r7 = r0.d()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0489
            r7 = 1
            goto L_0x048a
        L_0x0489:
            r7 = 0
        L_0x048a:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x047e
        L_0x048f:
            if (r3 <= r1) goto L_0x0493
            r0 = 1
            goto L_0x0494
        L_0x0493:
            r0 = 0
        L_0x0494:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f13707m
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x049e:
            r2.a(r6)
            goto L_0x04b6
        L_0x04a2:
            e8.cc0 r0 = new e8.cc0
            int r1 = r2.f13699e
            r2 = 41
            java.lang.String r3 = "Length mismatch: "
            java.lang.String r5 = ", "
            java.lang.String r1 = e8.y9.a(r2, r3, r4, r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x04b4:
            r2 = r26
        L_0x04b6:
            int r0 = e8.pd0.f15953e0
            e8.qd0 r0 = r8.b(r0)
            if (r0 == 0) goto L_0x04fd
            e8.w60 r0 = r0.P0
            r1 = 8
            r0.h(r1)
            int r3 = r0.b()
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04d4
            r0.i(r1)
        L_0x04d4:
            int r1 = r0.o()
            if (r1 != r5) goto L_0x04ef
            int r1 = r3 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            long r3 = r2.f13697c
            if (r1 != 0) goto L_0x04e7
            long r0 = r0.n()
            goto L_0x04eb
        L_0x04e7:
            long r0 = r0.p()
        L_0x04eb:
            long r3 = r3 + r0
            r2.f13697c = r3
            goto L_0x04fd
        L_0x04ef:
            e8.cc0 r0 = new e8.cc0
            r2 = 40
            java.lang.String r3 = "Unexpected saio entry count: "
            java.lang.String r1 = l0.d.a(r2, r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x04fd:
            int r0 = e8.pd0.f15961i0
            e8.qd0 r0 = r8.b(r0)
            if (r0 == 0) goto L_0x050b
            e8.w60 r0 = r0.P0
            r1 = 0
            b(r0, r1, r2)
        L_0x050b:
            int r0 = e8.pd0.f15955f0
            e8.qd0 r0 = r8.b(r0)
            int r1 = e8.pd0.f15957g0
            e8.qd0 r1 = r8.b(r1)
            if (r0 == 0) goto L_0x05b2
            if (r1 == 0) goto L_0x05b2
            e8.w60 r0 = r0.P0
            e8.w60 r1 = r1.P0
            r3 = 8
            r0.h(r3)
            int r3 = r0.b()
            int r4 = r0.b()
            int r5 = f7610x
            if (r4 != r5) goto L_0x05b2
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x053b
            r0.i(r4)
        L_0x053b:
            int r0 = r0.b()
            if (r0 != r6) goto L_0x05aa
            r0 = 8
            r1.h(r0)
            int r0 = r1.b()
            int r3 = r1.b()
            if (r3 != r5) goto L_0x05b2
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 2
            if (r0 != r6) goto L_0x056a
            long r4 = r1.n()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0562
            goto L_0x056f
        L_0x0562:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x056a:
            if (r0 < r3) goto L_0x056f
            r1.i(r4)
        L_0x056f:
            long r4 = r1.n()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x05a2
            r1.i(r3)
            int r0 = r1.d()
            r3 = 1
            if (r0 != r3) goto L_0x05b2
            int r0 = r1.d()
            r4 = 16
            byte[] r5 = new byte[r4]
            byte[] r6 = r1.f17220a
            int r7 = r1.f17221b
            r9 = 0
            java.lang.System.arraycopy(r6, r7, r5, r9, r4)
            int r6 = r1.f17221b
            int r6 = r6 + r4
            r1.f17221b = r6
            r2.f13706l = r3
            e8.xd0 r1 = new e8.xd0
            r1.<init>(r3, r0, r5)
            r2.f13708n = r1
            goto L_0x05b2
        L_0x05a2:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x05aa:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x05b2:
            java.util.List<e8.qd0> r0 = r8.Q0
            int r0 = r0.size()
            r1 = 0
        L_0x05b9:
            if (r1 >= r0) goto L_0x05eb
            java.util.List<e8.qd0> r3 = r8.Q0
            java.lang.Object r3 = r3.get(r1)
            e8.qd0 r3 = (e8.qd0) r3
            int r4 = r3.f15996a
            int r5 = e8.pd0.f15959h0
            if (r4 != r5) goto L_0x05e4
            e8.w60 r3 = r3.P0
            r4 = 8
            r3.h(r4)
            r4 = 16
            r5 = 0
            r6 = r23
            r3.l(r6, r5, r4)
            byte[] r5 = f7611y
            boolean r5 = java.util.Arrays.equals(r6, r5)
            if (r5 == 0) goto L_0x05e6
            b(r3, r4, r2)
            goto L_0x05e6
        L_0x05e4:
            r6 = r23
        L_0x05e6:
            int r1 = r1 + 1
            r23 = r6
            goto L_0x05b9
        L_0x05eb:
            r6 = r23
            goto L_0x05f7
        L_0x05ee:
            r6 = r1
            r24 = r2
            r17 = r3
            r16 = r4
            r28 = r5
        L_0x05f7:
            int r5 = r28 + 1
            r0 = 8
            r7 = 1
            r0 = r49
            r1 = r6
            r4 = r16
            r3 = r17
            r2 = r24
            r6 = 8
            goto L_0x0190
        L_0x0609:
            java.util.List<e8.qd0> r0 = r2.Q0
            com.google.android.gms.internal.ads.et r0 = c(r0)
            if (r0 == 0) goto L_0x06a8
            r15 = r49
            android.util.SparseArray<e8.vd0> r1 = r15.f7612a
            int r14 = r1.size()
            r1 = 0
            r13 = 0
        L_0x061b:
            if (r13 >= r14) goto L_0x06a8
            android.util.SparseArray<e8.vd0> r1 = r15.f7612a
            java.lang.Object r1 = r1.valueAt(r13)
            e8.vd0 r1 = (e8.vd0) r1
            com.google.android.gms.internal.ads.gu r12 = r1.f17116b
            e8.yd0 r1 = r1.f17117c
            e8.bc0 r11 = r1.f17613f
            e8.bc0 r10 = new e8.bc0
            r1 = r10
            java.lang.String r2 = r11.f13915a
            java.lang.String r3 = r11.f13919e
            java.lang.String r4 = r11.f13920f
            java.lang.String r5 = r11.f13917c
            int r6 = r11.f13916b
            int r7 = r11.f13921g
            int r8 = r11.f13924r
            int r9 = r11.f13925s
            r16 = r10
            float r10 = r11.f13926t
            r47 = r16
            r16 = r12
            int r12 = r11.f13927u
            r29 = r1
            r1 = r11
            r11 = r12
            float r12 = r1.f13928v
            r48 = r16
            r16 = r13
            byte[] r13 = r1.f13930x
            r30 = r16
            r16 = r14
            int r14 = r1.f13929w
            r31 = r16
            e8.hg0 r15 = r1.f13931y
            r32 = r2
            int r2 = r1.f13932z
            r16 = r2
            int r2 = r1.A
            r17 = r2
            int r2 = r1.B
            r18 = r2
            int r2 = r1.C
            r19 = r2
            int r2 = r1.D
            r20 = r2
            int r2 = r1.F
            r21 = r2
            java.lang.String r2 = r1.G
            r22 = r2
            int r2 = r1.H
            r23 = r2
            r33 = r3
            long r2 = r1.E
            r24 = r2
            java.util.List<byte[]> r2 = r1.f13922h
            r26 = r2
            com.google.android.gms.internal.ads.wt r1 = r1.f13918d
            r28 = r1
            r27 = r0
            r1 = r29
            r2 = r32
            r3 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            r2 = r47
            r1 = r48
            r1.g(r2)
            int r13 = r30 + 1
            r15 = r49
            r14 = r31
            goto L_0x061b
        L_0x06a8:
            r1 = r49
            goto L_0x06c0
        L_0x06ab:
            java.util.Stack<e8.od0> r0 = r1.f7619h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06c0
            java.util.Stack<e8.od0> r0 = r1.f7619h
            java.lang.Object r0 = r0.peek()
            e8.od0 r0 = (e8.od0) r0
            java.util.List<e8.od0> r0 = r0.R0
            r0.add(r2)
        L_0x06c0:
            r0 = r49
            goto L_0x0003
        L_0x06c4:
            r49.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt.d(long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:237:0x04e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x01e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(e8.fd0 r24, d5.w r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
        L_0x0004:
            int r2 = r0.f7621j
            r3 = 2
            r4 = 8
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x034d
            if (r2 == r7) goto L_0x0250
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x01f6
            if (r2 != r11) goto L_0x00fa
            e8.vd0 r2 = r0.f7629r
            if (r2 != 0) goto L_0x0080
            android.util.SparseArray<e8.vd0> r2 = r0.f7612a
            int r12 = r2.size()
            r13 = 0
            r14 = 0
        L_0x0025:
            if (r13 >= r12) goto L_0x0044
            java.lang.Object r15 = r2.valueAt(r13)
            e8.vd0 r15 = (e8.vd0) r15
            int r11 = r15.f17121g
            e8.ae0 r5 = r15.f17115a
            int r8 = r5.f13698d
            if (r11 == r8) goto L_0x0040
            long[] r5 = r5.f13700f
            r17 = r5[r11]
            int r5 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            r14 = r15
            r9 = r17
        L_0x0040:
            int r13 = r13 + 1
            r11 = 3
            goto L_0x0025
        L_0x0044:
            if (r14 != 0) goto L_0x0062
            long r2 = r0.f7626o
            r4 = r1
            com.google.android.gms.internal.ads.gt r4 = (com.google.android.gms.internal.ads.gt) r4
            long r7 = r4.f6688c
            long r2 = r2 - r7
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005a
            r4.d(r3)
            r23.i()
            r7 = 0
            goto L_0x01e2
        L_0x005a:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0062:
            e8.ae0 r2 = r14.f17115a
            long[] r2 = r2.f13700f
            int r5 = r14.f17121g
            r8 = r2[r5]
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            long r10 = r2.f6688c
            long r8 = r8 - r10
            int r5 = (int) r8
            if (r5 >= 0) goto L_0x007b
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r8 = "Ignoring negative offset to sample data."
            android.util.Log.w(r5, r8)
            r5 = 0
        L_0x007b:
            r2.d(r5)
            r0.f7629r = r14
        L_0x0080:
            e8.vd0 r2 = r0.f7629r
            e8.ae0 r5 = r2.f17115a
            int[] r8 = r5.f13702h
            int r9 = r2.f17119e
            r8 = r8[r9]
            r0.f7630s = r8
            boolean r8 = r5.f13706l
            if (r8 == 0) goto L_0x00e0
            e8.w60 r8 = r5.f13710p
            e8.td0 r10 = r5.f13695a
            int r10 = r10.f16740a
            e8.xd0 r11 = r5.f13708n
            if (r11 == 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            e8.yd0 r11 = r2.f17117c
            e8.xd0[] r11 = r11.f17615h
            r11 = r11[r10]
        L_0x00a1:
            int r10 = r11.f17481a
            boolean[] r5 = r5.f13707m
            boolean r5 = r5[r9]
            e8.w60 r9 = r0.f7616e
            byte[] r11 = r9.f17220a
            if (r5 == 0) goto L_0x00b0
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x00b1
        L_0x00b0:
            r12 = 0
        L_0x00b1:
            r12 = r12 | r10
            byte r12 = (byte) r12
            r11[r6] = r12
            r9.h(r6)
            com.google.android.gms.internal.ads.gu r2 = r2.f17116b
            e8.w60 r9 = r0.f7616e
            r2.e(r9, r7)
            r2.e(r8, r10)
            if (r5 != 0) goto L_0x00c7
            int r10 = r10 + 1
            goto L_0x00d8
        L_0x00c7:
            int r5 = r8.e()
            r9 = -2
            r8.i(r9)
            int r5 = r5 * 6
            int r5 = r5 + r3
            r2.e(r8, r5)
            int r10 = r10 + 1
            int r10 = r10 + r5
        L_0x00d8:
            r0.f7631t = r10
            int r2 = r0.f7630s
            int r2 = r2 + r10
            r0.f7630s = r2
            goto L_0x00e2
        L_0x00e0:
            r0.f7631t = r6
        L_0x00e2:
            e8.vd0 r2 = r0.f7629r
            e8.yd0 r2 = r2.f17117c
            int r2 = r2.f17614g
            if (r2 != r7) goto L_0x00f5
            int r2 = r0.f7630s
            int r2 = r2 - r4
            r0.f7630s = r2
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            r2.d(r4)
        L_0x00f5:
            r2 = 4
            r0.f7621j = r2
            r0.f7632u = r6
        L_0x00fa:
            e8.vd0 r2 = r0.f7629r
            e8.ae0 r4 = r2.f17115a
            e8.yd0 r5 = r2.f17117c
            com.google.android.gms.internal.ads.gu r8 = r2.f17116b
            int r2 = r2.f17119e
            int r9 = r5.f17618k
            if (r9 == 0) goto L_0x015f
            e8.w60 r10 = r0.f7614c
            byte[] r10 = r10.f17220a
            r10[r6] = r6
            r10[r7] = r6
            r10[r3] = r6
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x0116:
            int r11 = r0.f7631t
            int r12 = r0.f7630s
            if (r11 >= r12) goto L_0x0170
            int r11 = r0.f7632u
            if (r11 != 0) goto L_0x0150
            r11 = r1
            com.google.android.gms.internal.ads.gt r11 = (com.google.android.gms.internal.ads.gt) r11
            r11.c(r10, r9, r3, r6)
            e8.w60 r11 = r0.f7614c
            r11.h(r6)
            e8.w60 r11 = r0.f7614c
            int r11 = r11.o()
            int r11 = r11 - r7
            r0.f7632u = r11
            e8.w60 r11 = r0.f7613b
            r11.h(r6)
            e8.w60 r11 = r0.f7613b
            r12 = 4
            r8.e(r11, r12)
            e8.w60 r11 = r0.f7614c
            r8.e(r11, r7)
            int r11 = r0.f7631t
            int r11 = r11 + 5
            r0.f7631t = r11
            int r11 = r0.f7630s
            int r11 = r11 + r9
            r0.f7630s = r11
            goto L_0x0116
        L_0x0150:
            int r11 = r8.b(r1, r11)
            int r12 = r0.f7631t
            int r12 = r12 + r11
            r0.f7631t = r12
            int r12 = r0.f7632u
            int r12 = r12 - r11
            r0.f7632u = r12
            goto L_0x0116
        L_0x015f:
            int r3 = r0.f7631t
            int r9 = r0.f7630s
            if (r3 >= r9) goto L_0x0170
            int r9 = r9 - r3
            int r3 = r8.b(r1, r9)
            int r9 = r0.f7631t
            int r9 = r9 + r3
            r0.f7631t = r9
            goto L_0x015f
        L_0x0170:
            long[] r3 = r4.f13704j
            r9 = r3[r2]
            int[] r3 = r4.f13703i
            r3 = r3[r2]
            long r11 = (long) r3
            long r9 = r9 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            boolean r3 = r4.f13706l
            if (r3 == 0) goto L_0x0185
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0186
        L_0x0185:
            r11 = 0
        L_0x0186:
            boolean[] r12 = r4.f13705k
            boolean r2 = r12[r2]
            r11 = r11 | r2
            if (r3 == 0) goto L_0x01ac
            e8.xd0 r2 = r4.f13708n
            if (r2 == 0) goto L_0x0192
            goto L_0x019a
        L_0x0192:
            e8.xd0[] r2 = r5.f17615h
            e8.td0 r3 = r4.f13695a
            int r3 = r3.f16740a
            r2 = r2[r3]
        L_0x019a:
            e8.vd0 r3 = r0.f7629r
            e8.xd0 r5 = r3.f17123i
            if (r2 == r5) goto L_0x01a8
            e8.ld0 r3 = new e8.ld0
            byte[] r5 = r2.f17482b
            r3.<init>(r5)
            goto L_0x01aa
        L_0x01a8:
            e8.ld0 r3 = r3.f17122h
        L_0x01aa:
            r14 = r3
            goto L_0x01ae
        L_0x01ac:
            r2 = 0
            r14 = 0
        L_0x01ae:
            e8.vd0 r3 = r0.f7629r
            r3.f17122h = r14
            r3.f17123i = r2
            int r12 = r0.f7630s
            r13 = 0
            r8.c(r9, r11, r12, r13, r14)
            java.util.LinkedList<e8.ud0> r2 = r0.f7620i
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01e5
            e8.vd0 r2 = r0.f7629r
            int r3 = r2.f17119e
            int r3 = r3 + r7
            r2.f17119e = r3
            int r3 = r2.f17120f
            int r3 = r3 + r7
            r2.f17120f = r3
            int[] r4 = r4.f13701g
            int r5 = r2.f17121g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x01df
            int r5 = r5 + 1
            r2.f17121g = r5
            r2.f17120f = r6
            r2 = 0
            r0.f7629r = r2
        L_0x01df:
            r2 = 3
            r0.f7621j = r2
        L_0x01e2:
            if (r7 == 0) goto L_0x0004
            return r6
        L_0x01e5:
            java.util.LinkedList<e8.ud0> r1 = r0.f7620i
            java.lang.Object r1 = r1.removeFirst()
            e8.ud0 r1 = (e8.ud0) r1
            int r2 = r0.f7627p
            int r1 = r1.f16927a
            int r2 = r2 - r1
            r0.f7627p = r2
            r1 = 0
            throw r1
        L_0x01f6:
            android.util.SparseArray<e8.vd0> r2 = r0.f7612a
            int r2 = r2.size()
            r3 = 0
            r5 = 0
        L_0x01fe:
            if (r3 >= r2) goto L_0x0221
            android.util.SparseArray<e8.vd0> r4 = r0.f7612a
            java.lang.Object r4 = r4.valueAt(r3)
            e8.vd0 r4 = (e8.vd0) r4
            e8.ae0 r4 = r4.f17115a
            boolean r7 = r4.f13711q
            if (r7 == 0) goto L_0x021e
            long r7 = r4.f13697c
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x021e
            android.util.SparseArray<e8.vd0> r4 = r0.f7612a
            java.lang.Object r4 = r4.valueAt(r3)
            e8.vd0 r4 = (e8.vd0) r4
            r5 = r4
            r9 = r7
        L_0x021e:
            int r3 = r3 + 1
            goto L_0x01fe
        L_0x0221:
            if (r5 != 0) goto L_0x0228
            r2 = 3
            r0.f7621j = r2
            goto L_0x0004
        L_0x0228:
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            long r3 = r2.f6688c
            long r9 = r9 - r3
            int r3 = (int) r9
            if (r3 < 0) goto L_0x0248
            r2.d(r3)
            e8.ae0 r3 = r5.f17115a
            e8.w60 r4 = r3.f13710p
            byte[] r4 = r4.f17220a
            int r5 = r3.f13709o
            r2.c(r4, r6, r5, r6)
            e8.w60 r2 = r3.f13710p
            r2.h(r6)
            r3.f13711q = r6
            goto L_0x0004
        L_0x0248:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x0250:
            long r8 = r0.f7623l
            int r2 = (int) r8
            int r5 = r0.f7624m
            int r2 = r2 - r5
            e8.w60 r5 = r0.f7625n
            if (r5 == 0) goto L_0x033d
            byte[] r5 = r5.f17220a
            r8 = r1
            com.google.android.gms.internal.ads.gt r8 = (com.google.android.gms.internal.ads.gt) r8
            r8.c(r5, r4, r2, r6)
            e8.qd0 r2 = new e8.qd0
            int r5 = r0.f7622k
            e8.w60 r9 = r0.f7625n
            r2.<init>(r5, r9)
            long r10 = r8.f6688c
            java.util.Stack<e8.od0> r8 = r0.f7619h
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0284
            java.util.Stack<e8.od0> r3 = r0.f7619h
            java.lang.Object r3 = r3.peek()
            e8.od0 r3 = (e8.od0) r3
            java.util.List<e8.qd0> r3 = r3.Q0
            r3.add(r2)
            goto L_0x0343
        L_0x0284:
            int r2 = e8.pd0.B
            if (r5 != r2) goto L_0x033a
            r9.h(r4)
            int r2 = r9.b()
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = 4
            r9.i(r4)
            long r4 = r9.n()
            if (r2 != 0) goto L_0x02a6
            long r12 = r9.n()
            long r14 = r9.n()
            goto L_0x02ae
        L_0x02a6:
            long r12 = r9.p()
            long r14 = r9.p()
        L_0x02ae:
            long r14 = r14 + r10
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r12
            r21 = r4
            long r10 = e8.eg0.b(r17, r19, r21)
            r9.i(r3)
            int r2 = r9.e()
            int[] r3 = new int[r2]
            long[] r8 = new long[r2]
            long[] r6 = new long[r2]
            long[] r7 = new long[r2]
            r17 = r10
            r15 = r14
            r13 = r12
            r12 = 0
        L_0x02ce:
            if (r12 >= r2) goto L_0x0317
            int r19 = r9.b()
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = r19 & r20
            if (r20 != 0) goto L_0x030f
            long r20 = r9.n()
            r22 = 2147483647(0x7fffffff, float:NaN)
            r19 = r19 & r22
            r3[r12] = r19
            r8[r12] = r15
            r7[r12] = r17
            long r13 = r13 + r20
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r13
            r21 = r4
            long r17 = e8.eg0.b(r17, r19, r21)
            r19 = r7[r12]
            long r19 = r17 - r19
            r6[r12] = r19
            r19 = r2
            r2 = 4
            r9.i(r2)
            r2 = r3[r12]
            r20 = r4
            long r4 = (long) r2
            long r15 = r15 + r4
            int r12 = r12 + 1
            r2 = r19
            r4 = r20
            goto L_0x02ce
        L_0x030f:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x0317:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            e8.ed0 r4 = new e8.ed0
            r4.<init>(r3, r8, r6, r7)
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            r3.longValue()
            e8.id0 r3 = r0.f7633v
            java.lang.Object r2 = r2.second
            e8.jd0 r2 = (e8.jd0) r2
            com.google.android.gms.internal.ads.yt r3 = (com.google.android.gms.internal.ads.yt) r3
            r3.n(r2)
            r2 = 1
            r0.f7634w = r2
            goto L_0x0343
        L_0x033a:
            int r2 = e8.pd0.G0
            goto L_0x0343
        L_0x033d:
            r3 = r1
            com.google.android.gms.internal.ads.gt r3 = (com.google.android.gms.internal.ads.gt) r3
            r3.d(r2)
        L_0x0343:
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            long r2 = r2.f6688c
            r0.d(r2)
            goto L_0x0004
        L_0x034d:
            int r2 = r0.f7624m
            if (r2 != 0) goto L_0x0379
            e8.w60 r2 = r0.f7617f
            byte[] r2 = r2.f17220a
            r5 = r1
            com.google.android.gms.internal.ads.gt r5 = (com.google.android.gms.internal.ads.gt) r5
            r6 = 0
            r7 = 1
            boolean r2 = r5.c(r2, r6, r4, r7)
            if (r2 != 0) goto L_0x0362
            goto L_0x04de
        L_0x0362:
            r0.f7624m = r4
            e8.w60 r2 = r0.f7617f
            r2.h(r6)
            e8.w60 r2 = r0.f7617f
            long r5 = r2.n()
            r0.f7623l = r5
            e8.w60 r2 = r0.f7617f
            int r2 = r2.b()
            r0.f7622k = r2
        L_0x0379:
            long r5 = r0.f7623l
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0399
            e8.w60 r2 = r0.f7617f
            byte[] r2 = r2.f17220a
            r5 = r1
            com.google.android.gms.internal.ads.gt r5 = (com.google.android.gms.internal.ads.gt) r5
            r6 = 0
            r5.c(r2, r4, r4, r6)
            int r2 = r0.f7624m
            int r2 = r2 + r4
            r0.f7624m = r2
            e8.w60 r2 = r0.f7617f
            long r5 = r2.p()
            r0.f7623l = r5
        L_0x0399:
            long r5 = r0.f7623l
            int r2 = r0.f7624m
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x04ea
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            long r5 = r2.f6688c
            long r5 = r5 - r7
            int r7 = r0.f7622k
            int r8 = e8.pd0.L
            if (r7 != r8) goto L_0x03cb
            android.util.SparseArray<e8.vd0> r7 = r0.f7612a
            int r7 = r7.size()
            r8 = 0
        L_0x03b5:
            if (r8 >= r7) goto L_0x03cb
            android.util.SparseArray<e8.vd0> r9 = r0.f7612a
            java.lang.Object r9 = r9.valueAt(r8)
            e8.vd0 r9 = (e8.vd0) r9
            e8.ae0 r9 = r9.f17115a
            r9.getClass()
            r9.f13697c = r5
            r9.f13696b = r5
            int r8 = r8 + 1
            goto L_0x03b5
        L_0x03cb:
            int r7 = r0.f7622k
            int r8 = e8.pd0.f15960i
            if (r7 != r8) goto L_0x03f7
            r8 = 0
            r0.f7629r = r8
            long r7 = r0.f7623l
            long r5 = r5 + r7
            r0.f7626o = r5
            boolean r2 = r0.f7634w
            if (r2 != 0) goto L_0x03f4
            e8.id0 r2 = r0.f7633v
            e8.kd0 r4 = new e8.kd0
            long r5 = r0.f7628q
            r4.<init>(r5)
            com.google.android.gms.internal.ads.yt r2 = (com.google.android.gms.internal.ads.yt) r2
            r2.f8658y = r4
            android.os.Handler r4 = r2.f8655v
            java.lang.Runnable r2 = r2.f8653t
            r4.post(r2)
            r2 = 1
            r0.f7634w = r2
        L_0x03f4:
            r0.f7621j = r3
            goto L_0x0445
        L_0x03f7:
            int r3 = e8.pd0.C
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.E
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.F
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.G
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.H
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.L
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.M
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.N
            if (r7 == r3) goto L_0x041e
            int r3 = e8.pd0.Q
            if (r7 != r3) goto L_0x041c
            goto L_0x041e
        L_0x041c:
            r3 = 0
            goto L_0x041f
        L_0x041e:
            r3 = 1
        L_0x041f:
            if (r3 == 0) goto L_0x0448
            long r2 = r2.f6688c
            long r4 = r0.f7623l
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<e8.od0> r4 = r0.f7619h
            e8.od0 r5 = new e8.od0
            int r6 = r0.f7622k
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.f7623l
            int r6 = r0.f7624m
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0442
            r0.d(r2)
            goto L_0x0445
        L_0x0442:
            r23.i()
        L_0x0445:
            r2 = 1
            goto L_0x04dd
        L_0x0448:
            int r2 = e8.pd0.T
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.S
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.D
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.B
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.U
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15990x
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15992y
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.P
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15994z
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.A
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.V
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15951d0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15953e0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15961i0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15959h0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15955f0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.f15957g0
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.R
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.O
            if (r7 == r2) goto L_0x049b
            int r2 = e8.pd0.G0
            if (r7 != r2) goto L_0x0499
            goto L_0x049b
        L_0x0499:
            r2 = 0
            goto L_0x049c
        L_0x049b:
            r2 = 1
        L_0x049c:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x04d1
            int r2 = r0.f7624m
            if (r2 != r4) goto L_0x04c9
            long r2 = r0.f7623l
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x04c1
            e8.w60 r5 = new e8.w60
            int r3 = (int) r2
            r5.<init>(r3)
            r0.f7625n = r5
            e8.w60 r2 = r0.f7617f
            byte[] r2 = r2.f17220a
            byte[] r3 = r5.f17220a
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r4)
            r2 = 1
            r0.f7621j = r2
            goto L_0x04dd
        L_0x04c1:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x04c9:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x04d1:
            long r2 = r0.f7623l
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x04e2
            r2 = 0
            r0.f7625n = r2
            r2 = 1
            r0.f7621j = r2
        L_0x04dd:
            r6 = 1
        L_0x04de:
            if (r6 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x04e2:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x04ea:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            goto L_0x04f3
        L_0x04f2:
            throw r1
        L_0x04f3:
            goto L_0x04f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt.e(e8.fd0, d5.w):int");
    }

    public final void f(id0 id0) {
        this.f7633v = id0;
    }

    public final boolean g(fd0 fd0) throws IOException, InterruptedException {
        return qt.a(fd0, true);
    }

    public final void h(long j10, long j11) {
        int size = this.f7612a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7612a.valueAt(i10).a();
        }
        this.f7620i.clear();
        this.f7627p = 0;
        this.f7619h.clear();
        i();
    }

    public final void i() {
        this.f7621j = 0;
        this.f7624m = 0;
    }
}
