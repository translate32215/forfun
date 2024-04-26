package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.c;
import w.b;
import w.e;

/* compiled from: ConstraintWidgetContainer */
public class g extends m {
    public int A0 = 0;
    public int B0 = 0;
    public c[] C0 = new c[4];
    public c[] D0 = new c[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<d> H0 = null;
    public WeakReference<d> I0 = null;
    public WeakReference<d> J0 = null;
    public WeakReference<d> K0 = null;
    public HashSet<f> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    /* renamed from: s0  reason: collision with root package name */
    public b f26290s0 = new b(this);

    /* renamed from: t0  reason: collision with root package name */
    public e f26291t0 = new e(this);

    /* renamed from: u0  reason: collision with root package name */
    public int f26292u0;

    /* renamed from: v0  reason: collision with root package name */
    public b.C0268b f26293v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f26294w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public c f26295x0 = new c();

    /* renamed from: y0  reason: collision with root package name */
    public int f26296y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f26297z0;

    public static boolean e0(f fVar, b.C0268b bVar, b.a aVar, int i10) {
        int i11;
        int i12;
        if (bVar == null) {
            return false;
        }
        if (fVar.f26264i0 == 8 || (fVar instanceof h) || (fVar instanceof a)) {
            aVar.f26796e = 0;
            aVar.f26797f = 0;
            return false;
        }
        aVar.f26792a = fVar.m();
        aVar.f26793b = fVar.t();
        aVar.f26794c = fVar.u();
        aVar.f26795d = fVar.l();
        aVar.f26800i = false;
        aVar.f26801j = i10;
        boolean z10 = aVar.f26792a == 3;
        boolean z11 = aVar.f26793b == 3;
        boolean z12 = z10 && fVar.Y > 0.0f;
        boolean z13 = z11 && fVar.Y > 0.0f;
        if (z10 && fVar.x(0) && fVar.f26281r == 0 && !z12) {
            aVar.f26792a = 2;
            if (z11 && fVar.f26282s == 0) {
                aVar.f26792a = 1;
            }
            z10 = false;
        }
        if (z11 && fVar.x(1) && fVar.f26282s == 0 && !z13) {
            aVar.f26793b = 2;
            if (z10 && fVar.f26281r == 0) {
                aVar.f26793b = 1;
            }
            z11 = false;
        }
        if (fVar.D()) {
            aVar.f26792a = 1;
            z10 = false;
        }
        if (fVar.E()) {
            aVar.f26793b = 1;
            z11 = false;
        }
        if (z12) {
            if (fVar.f26283t[0] == 4) {
                aVar.f26792a = 1;
            } else if (!z11) {
                if (aVar.f26793b == 1) {
                    i12 = aVar.f26795d;
                } else {
                    aVar.f26792a = 2;
                    ((ConstraintLayout.b) bVar).b(fVar, aVar);
                    i12 = aVar.f26797f;
                }
                aVar.f26792a = 1;
                aVar.f26794c = (int) (fVar.Y * ((float) i12));
            }
        }
        if (z13) {
            if (fVar.f26283t[1] == 4) {
                aVar.f26793b = 1;
            } else if (!z10) {
                if (aVar.f26792a == 1) {
                    i11 = aVar.f26794c;
                } else {
                    aVar.f26793b = 2;
                    ((ConstraintLayout.b) bVar).b(fVar, aVar);
                    i11 = aVar.f26796e;
                }
                aVar.f26793b = 1;
                if (fVar.Z == -1) {
                    aVar.f26795d = (int) (((float) i11) / fVar.Y);
                } else {
                    aVar.f26795d = (int) (fVar.Y * ((float) i11));
                }
            }
        }
        ((ConstraintLayout.b) bVar).b(fVar, aVar);
        fVar.S(aVar.f26796e);
        fVar.N(aVar.f26797f);
        fVar.E = aVar.f26799h;
        fVar.K(aVar.f26798g);
        aVar.f26801j = 0;
        return aVar.f26800i;
    }

    public void F() {
        this.f26295x0.u();
        this.f26296y0 = 0;
        this.f26297z0 = 0;
        super.F();
    }

    public void T(boolean z10, boolean z11) {
        super.T(z10, z11);
        int size = this.f26307r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26307r0.get(i10).T(z10, z11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05d1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x07f7 A[LOOP:32: B:455:0x07f5->B:456:0x07f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x085f  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x088b  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x08c9  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x08dc  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x08d1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            r1.f26248a0 = r2
            r1.f26250b0 = r2
            r1.F0 = r2
            r1.G0 = r2
            java.util.ArrayList<v.f> r0 = r1.f26307r0
            int r3 = r0.size()
            int r0 = r26.u()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r26.l()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.U
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f26292u0
            r9 = -1
            if (r8 != 0) goto L_0x0248
            int r8 = r1.E0
            boolean r8 = v.k.b(r8, r6)
            if (r8 == 0) goto L_0x0248
            w.b$b r8 = r1.f26293v0
            int r11 = r26.m()
            int r12 = r26.t()
            w.h.f26835b = r2
            w.h.f26836c = r2
            r26.G()
            java.util.ArrayList<v.f> r13 = r1.f26307r0
            int r14 = r13.size()
            r15 = 0
        L_0x004d:
            if (r15 >= r14) goto L_0x005b
            java.lang.Object r16 = r13.get(r15)
            v.f r16 = (v.f) r16
            r16.G()
            int r15 = r15 + 1
            goto L_0x004d
        L_0x005b:
            boolean r15 = r1.f26294w0
            if (r11 != r6) goto L_0x0067
            int r11 = r26.u()
            r1.L(r2, r11)
            goto L_0x006f
        L_0x0067:
            v.d r11 = r1.J
            r11.f26230b = r2
            r11.f26231c = r6
            r1.f26248a0 = r2
        L_0x006f:
            r11 = 0
            r16 = 0
            r17 = 0
        L_0x0074:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r11 >= r14) goto L_0x00d2
            java.lang.Object r19 = r13.get(r11)
            r10 = r19
            v.f r10 = (v.f) r10
            boolean r2 = r10 instanceof v.h
            if (r2 == 0) goto L_0x00bf
            v.h r10 = (v.h) r10
            int r2 = r10.f26302v0
            if (r2 != r6) goto L_0x00cd
            int r2 = r10.f26299s0
            if (r2 == r9) goto L_0x0092
            r10.V(r2)
            goto L_0x00bc
        L_0x0092:
            int r2 = r10.f26300t0
            if (r2 == r9) goto L_0x00a7
            boolean r2 = r26.D()
            if (r2 == 0) goto L_0x00a7
            int r2 = r26.u()
            int r9 = r10.f26300t0
            int r2 = r2 - r9
            r10.V(r2)
            goto L_0x00bc
        L_0x00a7:
            boolean r2 = r26.D()
            if (r2 == 0) goto L_0x00bc
            float r2 = r10.f26298r0
            int r9 = r26.u()
            float r9 = (float) r9
            float r2 = r2 * r9
            float r2 = r2 + r18
            int r2 = (int) r2
            r10.V(r2)
        L_0x00bc:
            r16 = 1
            goto L_0x00cd
        L_0x00bf:
            boolean r2 = r10 instanceof v.a
            if (r2 == 0) goto L_0x00cd
            v.a r10 = (v.a) r10
            int r2 = r10.X()
            if (r2 != 0) goto L_0x00cd
            r17 = 1
        L_0x00cd:
            int r11 = r11 + 1
            r2 = 0
            r9 = -1
            goto L_0x0074
        L_0x00d2:
            if (r16 == 0) goto L_0x00f0
            r2 = 0
        L_0x00d5:
            if (r2 >= r14) goto L_0x00f0
            java.lang.Object r9 = r13.get(r2)
            v.f r9 = (v.f) r9
            boolean r10 = r9 instanceof v.h
            if (r10 == 0) goto L_0x00ec
            v.h r9 = (v.h) r9
            int r10 = r9.f26302v0
            if (r10 != r6) goto L_0x00ec
            r10 = 0
            w.h.b(r10, r9, r8, r15)
            goto L_0x00ed
        L_0x00ec:
            r10 = 0
        L_0x00ed:
            int r2 = r2 + 1
            goto L_0x00d5
        L_0x00f0:
            r10 = 0
            w.h.b(r10, r1, r8, r15)
            if (r17 == 0) goto L_0x0117
            r2 = 0
        L_0x00f7:
            if (r2 >= r14) goto L_0x0117
            java.lang.Object r9 = r13.get(r2)
            v.f r9 = (v.f) r9
            boolean r10 = r9 instanceof v.a
            if (r10 == 0) goto L_0x0114
            v.a r9 = (v.a) r9
            int r10 = r9.X()
            if (r10 != 0) goto L_0x0114
            boolean r10 = r9.W()
            if (r10 == 0) goto L_0x0114
            w.h.b(r6, r9, r8, r15)
        L_0x0114:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x0117:
            if (r12 != r6) goto L_0x0122
            int r2 = r26.l()
            r9 = 0
            r1.M(r9, r2)
            goto L_0x012b
        L_0x0122:
            r9 = 0
            v.d r2 = r1.K
            r2.f26230b = r9
            r2.f26231c = r6
            r1.f26250b0 = r9
        L_0x012b:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x012e:
            if (r2 >= r14) goto L_0x0185
            java.lang.Object r11 = r13.get(r2)
            v.f r11 = (v.f) r11
            boolean r12 = r11 instanceof v.h
            if (r12 == 0) goto L_0x0175
            v.h r11 = (v.h) r11
            int r12 = r11.f26302v0
            if (r12 != 0) goto L_0x0182
            int r9 = r11.f26299s0
            r12 = -1
            if (r9 == r12) goto L_0x0149
            r11.V(r9)
            goto L_0x0173
        L_0x0149:
            int r9 = r11.f26300t0
            if (r9 == r12) goto L_0x015e
            boolean r9 = r26.E()
            if (r9 == 0) goto L_0x015e
            int r9 = r26.l()
            int r12 = r11.f26300t0
            int r9 = r9 - r12
            r11.V(r9)
            goto L_0x0173
        L_0x015e:
            boolean r9 = r26.E()
            if (r9 == 0) goto L_0x0173
            float r9 = r11.f26298r0
            int r12 = r26.l()
            float r12 = (float) r12
            float r9 = r9 * r12
            float r9 = r9 + r18
            int r9 = (int) r9
            r11.V(r9)
        L_0x0173:
            r9 = 1
            goto L_0x0182
        L_0x0175:
            boolean r12 = r11 instanceof v.a
            if (r12 == 0) goto L_0x0182
            v.a r11 = (v.a) r11
            int r11 = r11.X()
            if (r11 != r6) goto L_0x0182
            r10 = 1
        L_0x0182:
            int r2 = r2 + 1
            goto L_0x012e
        L_0x0185:
            if (r9 == 0) goto L_0x01a0
            r2 = 0
        L_0x0188:
            if (r2 >= r14) goto L_0x01a0
            java.lang.Object r9 = r13.get(r2)
            v.f r9 = (v.f) r9
            boolean r11 = r9 instanceof v.h
            if (r11 == 0) goto L_0x019d
            v.h r9 = (v.h) r9
            int r11 = r9.f26302v0
            if (r11 != 0) goto L_0x019d
            w.h.g(r6, r9, r8)
        L_0x019d:
            int r2 = r2 + 1
            goto L_0x0188
        L_0x01a0:
            r2 = 0
            w.h.g(r2, r1, r8)
            if (r10 == 0) goto L_0x01c7
            r2 = 0
        L_0x01a7:
            if (r2 >= r14) goto L_0x01c7
            java.lang.Object r9 = r13.get(r2)
            v.f r9 = (v.f) r9
            boolean r10 = r9 instanceof v.a
            if (r10 == 0) goto L_0x01c4
            v.a r9 = (v.a) r9
            int r10 = r9.X()
            if (r10 != r6) goto L_0x01c4
            boolean r10 = r9.W()
            if (r10 == 0) goto L_0x01c4
            w.h.g(r6, r9, r8)
        L_0x01c4:
            int r2 = r2 + 1
            goto L_0x01a7
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            if (r2 >= r14) goto L_0x01fe
            java.lang.Object r9 = r13.get(r2)
            v.f r9 = (v.f) r9
            boolean r10 = r9.C()
            if (r10 == 0) goto L_0x01fb
            boolean r10 = w.h.a(r9)
            if (r10 == 0) goto L_0x01fb
            w.b$a r10 = w.h.f26834a
            r11 = 0
            e0(r9, r8, r10, r11)
            boolean r10 = r9 instanceof v.h
            if (r10 == 0) goto L_0x01f5
            r10 = r9
            v.h r10 = (v.h) r10
            int r10 = r10.f26302v0
            if (r10 != 0) goto L_0x01f1
            w.h.g(r11, r9, r8)
            goto L_0x01fb
        L_0x01f1:
            w.h.b(r11, r9, r8, r15)
            goto L_0x01fb
        L_0x01f5:
            w.h.b(r11, r9, r8, r15)
            w.h.g(r11, r9, r8)
        L_0x01fb:
            int r2 = r2 + 1
            goto L_0x01c8
        L_0x01fe:
            r2 = 0
        L_0x01ff:
            if (r2 >= r3) goto L_0x0248
            java.util.ArrayList<v.f> r8 = r1.f26307r0
            java.lang.Object r8 = r8.get(r2)
            v.f r8 = (v.f) r8
            boolean r9 = r8.C()
            if (r9 == 0) goto L_0x0245
            boolean r9 = r8 instanceof v.h
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8 instanceof v.a
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8 instanceof v.l
            if (r9 != 0) goto L_0x0245
            boolean r9 = r8.G
            if (r9 != 0) goto L_0x0245
            r9 = 0
            int r10 = r8.k(r9)
            int r9 = r8.k(r6)
            r11 = 3
            if (r10 != r11) goto L_0x0237
            int r10 = r8.f26281r
            if (r10 == r6) goto L_0x0237
            if (r9 != r11) goto L_0x0237
            int r9 = r8.f26282s
            if (r9 == r6) goto L_0x0237
            r9 = 1
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            if (r9 != 0) goto L_0x0245
            w.b$a r9 = new w.b$a
            r9.<init>()
            w.b$b r10 = r1.f26293v0
            r11 = 0
            e0(r8, r10, r9, r11)
        L_0x0245:
            int r2 = r2 + 1
            goto L_0x01ff
        L_0x0248:
            r2 = 2
            if (r3 <= r2) goto L_0x061f
            if (r5 == r2) goto L_0x024f
            if (r7 != r2) goto L_0x061f
        L_0x024f:
            int r9 = r1.E0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = v.k.b(r9, r10)
            if (r9 == 0) goto L_0x061f
            w.b$b r9 = r1.f26293v0
            v.d$a r10 = v.d.a.CENTER
            java.util.ArrayList<v.f> r11 = r1.f26307r0
            int r12 = r11.size()
            r13 = 0
        L_0x0264:
            if (r13 >= r12) goto L_0x0292
            java.lang.Object r14 = r11.get(r13)
            v.f r14 = (v.f) r14
            int r15 = r26.m()
            int r2 = r26.t()
            int r8 = r14.m()
            int r14 = r14.t()
            boolean r2 = w.i.c(r15, r2, r8, r14)
            if (r2 != 0) goto L_0x028e
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            goto L_0x05d1
        L_0x028e:
            int r13 = r13 + 1
            r2 = 2
            goto L_0x0264
        L_0x0292:
            r2 = 0
            r6 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
        L_0x029a:
            if (r6 >= r12) goto L_0x0384
            java.lang.Object r21 = r11.get(r6)
            r22 = r3
            r3 = r21
            v.f r3 = (v.f) r3
            r21 = r4
            int r4 = r26.m()
            r23 = r7
            int r7 = r26.t()
            r24 = r0
            int r0 = r3.m()
            r25 = r5
            int r5 = r3.t()
            boolean r0 = w.i.c(r4, r7, r0, r5)
            if (r0 != 0) goto L_0x02ca
            w.b$a r0 = r1.M0
            r4 = 0
            e0(r3, r9, r0, r4)
        L_0x02ca:
            boolean r0 = r3 instanceof v.h
            if (r0 == 0) goto L_0x02ef
            r4 = r3
            v.h r4 = (v.h) r4
            int r5 = r4.f26302v0
            if (r5 != 0) goto L_0x02e0
            if (r13 != 0) goto L_0x02dd
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13 = r5
        L_0x02dd:
            r13.add(r4)
        L_0x02e0:
            int r5 = r4.f26302v0
            r7 = 1
            if (r5 != r7) goto L_0x02ef
            if (r2 != 0) goto L_0x02ec
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02ec:
            r2.add(r4)
        L_0x02ef:
            boolean r4 = r3 instanceof v.j
            if (r4 == 0) goto L_0x0334
            boolean r4 = r3 instanceof v.a
            if (r4 == 0) goto L_0x031d
            r4 = r3
            v.a r4 = (v.a) r4
            int r5 = r4.X()
            if (r5 != 0) goto L_0x030b
            if (r8 != 0) goto L_0x0308
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x0308:
            r8.add(r4)
        L_0x030b:
            int r5 = r4.X()
            r7 = 1
            if (r5 != r7) goto L_0x0334
            if (r14 != 0) goto L_0x0319
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0319:
            r14.add(r4)
            goto L_0x0334
        L_0x031d:
            r4 = r3
            v.j r4 = (v.j) r4
            if (r8 != 0) goto L_0x0327
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0327:
            r8.add(r4)
            if (r14 != 0) goto L_0x0331
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0331:
            r14.add(r4)
        L_0x0334:
            v.d r4 = r3.J
            v.d r4 = r4.f26234f
            if (r4 != 0) goto L_0x0350
            v.d r4 = r3.L
            v.d r4 = r4.f26234f
            if (r4 != 0) goto L_0x0350
            if (r0 != 0) goto L_0x0350
            boolean r4 = r3 instanceof v.a
            if (r4 != 0) goto L_0x0350
            if (r15 != 0) goto L_0x034d
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x034d:
            r15.add(r3)
        L_0x0350:
            v.d r4 = r3.K
            v.d r4 = r4.f26234f
            if (r4 != 0) goto L_0x0376
            v.d r4 = r3.M
            v.d r4 = r4.f26234f
            if (r4 != 0) goto L_0x0376
            v.d r4 = r3.N
            v.d r4 = r4.f26234f
            if (r4 != 0) goto L_0x0376
            if (r0 != 0) goto L_0x0376
            boolean r0 = r3 instanceof v.a
            if (r0 != 0) goto L_0x0376
            if (r18 != 0) goto L_0x036f
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L_0x036f:
            r0 = r18
            r0.add(r3)
            r18 = r0
        L_0x0376:
            int r6 = r6 + 1
            r4 = r21
            r3 = r22
            r7 = r23
            r0 = r24
            r5 = r25
            goto L_0x029a
        L_0x0384:
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x03ab
            java.util.Iterator r2 = r2.iterator()
        L_0x0399:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ab
            java.lang.Object r3 = r2.next()
            v.h r3 = (v.h) r3
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x0399
        L_0x03ab:
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x03cc
            java.util.Iterator r2 = r8.iterator()
        L_0x03b3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cc
            java.lang.Object r3 = r2.next()
            v.j r3 = (v.j) r3
            w.o r6 = w.i.a(r3, r5, r0, r4)
            r3.V(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03b3
        L_0x03cc:
            v.d$a r2 = v.d.a.LEFT
            v.d r2 = r1.i(r2)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x03ee
            java.util.Iterator r2 = r2.iterator()
        L_0x03da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x03da
        L_0x03ee:
            v.d$a r2 = v.d.a.RIGHT
            v.d r2 = r1.i(r2)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x0410
            java.util.Iterator r2 = r2.iterator()
        L_0x03fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0410
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x03fc
        L_0x0410:
            v.d r2 = r1.i(r10)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x0430
            java.util.Iterator r2 = r2.iterator()
        L_0x041c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0430
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 0
            w.i.a(r3, r5, r0, r4)
            goto L_0x041c
        L_0x0430:
            r4 = 0
            r5 = 0
            if (r15 == 0) goto L_0x0448
            java.util.Iterator r2 = r15.iterator()
        L_0x0438:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0448
            java.lang.Object r3 = r2.next()
            v.f r3 = (v.f) r3
            w.i.a(r3, r5, r0, r4)
            goto L_0x0438
        L_0x0448:
            if (r13 == 0) goto L_0x045f
            java.util.Iterator r2 = r13.iterator()
        L_0x044e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x045f
            java.lang.Object r3 = r2.next()
            v.h r3 = (v.h) r3
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x044e
        L_0x045f:
            r5 = 1
            if (r14 == 0) goto L_0x047f
            java.util.Iterator r2 = r14.iterator()
        L_0x0466:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x047f
            java.lang.Object r3 = r2.next()
            v.j r3 = (v.j) r3
            w.o r6 = w.i.a(r3, r5, r0, r4)
            r3.V(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0466
        L_0x047f:
            v.d$a r2 = v.d.a.TOP
            v.d r2 = r1.i(r2)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x04a1
            java.util.Iterator r2 = r2.iterator()
        L_0x048d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04a1
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x048d
        L_0x04a1:
            v.d$a r2 = v.d.a.BASELINE
            v.d r2 = r1.i(r2)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x04c3
            java.util.Iterator r2 = r2.iterator()
        L_0x04af:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c3
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04af
        L_0x04c3:
            v.d$a r2 = v.d.a.BOTTOM
            v.d r2 = r1.i(r2)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x04e5
            java.util.Iterator r2 = r2.iterator()
        L_0x04d1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04e5
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04d1
        L_0x04e5:
            v.d r2 = r1.i(r10)
            java.util.HashSet<v.d> r2 = r2.f26229a
            if (r2 == 0) goto L_0x0505
            java.util.Iterator r2 = r2.iterator()
        L_0x04f1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0505
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r3 = r3.f26232d
            r4 = 0
            r5 = 1
            w.i.a(r3, r5, r0, r4)
            goto L_0x04f1
        L_0x0505:
            r4 = 0
            r5 = 1
            if (r18 == 0) goto L_0x051d
            java.util.Iterator r2 = r18.iterator()
        L_0x050d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x051d
            java.lang.Object r3 = r2.next()
            v.f r3 = (v.f) r3
            w.i.a(r3, r5, r0, r4)
            goto L_0x050d
        L_0x051d:
            r2 = 0
        L_0x051e:
            if (r2 >= r12) goto L_0x0555
            java.lang.Object r3 = r11.get(r2)
            v.f r3 = (v.f) r3
            int[] r4 = r3.U
            r6 = 0
            r7 = r4[r6]
            r6 = 3
            if (r7 != r6) goto L_0x0534
            r4 = r4[r5]
            if (r4 != r6) goto L_0x0534
            r4 = 1
            goto L_0x0535
        L_0x0534:
            r4 = 0
        L_0x0535:
            if (r4 == 0) goto L_0x0551
            int r4 = r3.f26278p0
            w.o r4 = w.i.b(r0, r4)
            int r3 = r3.f26280q0
            w.o r3 = w.i.b(r0, r3)
            if (r4 == 0) goto L_0x0551
            if (r3 == 0) goto L_0x0551
            r5 = 0
            r4.d(r5, r3)
            r5 = 2
            r3.f26846c = r5
            r0.remove(r4)
        L_0x0551:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x051e
        L_0x0555:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x055e
            goto L_0x05d1
        L_0x055e:
            int r2 = r26.m()
            r4 = 2
            if (r2 != r4) goto L_0x0594
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
            r5 = 0
        L_0x056b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0589
            java.lang.Object r6 = r2.next()
            w.o r6 = (w.o) r6
            int r7 = r6.f26846c
            if (r7 != r3) goto L_0x057d
            r8 = 0
            goto L_0x056b
        L_0x057d:
            t.c r7 = r1.f26295x0
            r8 = 0
            int r7 = r6.c(r7, r8)
            if (r7 <= r5) goto L_0x056b
            r4 = r6
            r5 = r7
            goto L_0x056b
        L_0x0589:
            r8 = 0
            if (r4 == 0) goto L_0x0594
            int[] r2 = r1.U
            r2[r8] = r3
            r1.S(r5)
            goto L_0x0595
        L_0x0594:
            r4 = 0
        L_0x0595:
            int r2 = r26.t()
            r3 = 2
            if (r2 != r3) goto L_0x05cb
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05a2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05c0
            java.lang.Object r5 = r0.next()
            w.o r5 = (w.o) r5
            int r6 = r5.f26846c
            if (r6 != 0) goto L_0x05b4
            r7 = 1
            goto L_0x05a2
        L_0x05b4:
            t.c r6 = r1.f26295x0
            r7 = 1
            int r6 = r5.c(r6, r7)
            if (r6 <= r3) goto L_0x05a2
            r2 = r5
            r3 = r6
            goto L_0x05a2
        L_0x05c0:
            r7 = 1
            if (r2 == 0) goto L_0x05cb
            int[] r0 = r1.U
            r0[r7] = r7
            r1.N(r3)
            goto L_0x05cc
        L_0x05cb:
            r2 = 0
        L_0x05cc:
            if (r4 != 0) goto L_0x05d3
            if (r2 == 0) goto L_0x05d1
            goto L_0x05d3
        L_0x05d1:
            r0 = 0
            goto L_0x05d4
        L_0x05d3:
            r0 = 1
        L_0x05d4:
            if (r0 == 0) goto L_0x0616
            r2 = r25
            r3 = 2
            if (r2 != r3) goto L_0x05f1
            int r0 = r26.u()
            r3 = r24
            if (r3 >= r0) goto L_0x05ec
            if (r3 <= 0) goto L_0x05ec
            r1.S(r3)
            r4 = 1
            r1.F0 = r4
            goto L_0x05f3
        L_0x05ec:
            int r0 = r26.u()
            goto L_0x05f4
        L_0x05f1:
            r3 = r24
        L_0x05f3:
            r0 = r3
        L_0x05f4:
            r4 = r23
            r3 = 2
            if (r4 != r3) goto L_0x060f
            int r3 = r26.l()
            r5 = r21
            if (r5 >= r3) goto L_0x060a
            if (r5 <= 0) goto L_0x060a
            r1.N(r5)
            r3 = 1
            r1.G0 = r3
            goto L_0x0611
        L_0x060a:
            int r3 = r26.l()
            goto L_0x0612
        L_0x060f:
            r5 = r21
        L_0x0611:
            r3 = r5
        L_0x0612:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0626
        L_0x0616:
            r5 = r21
            r4 = r23
            r3 = r24
            r2 = r25
            goto L_0x0625
        L_0x061f:
            r22 = r3
            r2 = r5
            r3 = r0
            r5 = r4
            r4 = r7
        L_0x0625:
            r0 = 0
        L_0x0626:
            r6 = 64
            boolean r7 = r1.f0(r6)
            if (r7 != 0) goto L_0x0639
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.f0(r7)
            if (r7 == 0) goto L_0x0637
            goto L_0x0639
        L_0x0637:
            r7 = 0
            goto L_0x063a
        L_0x0639:
            r7 = 1
        L_0x063a:
            t.c r8 = r1.f26295x0
            r8.getClass()
            r9 = 0
            r8.f25288g = r9
            int r9 = r1.E0
            if (r9 == 0) goto L_0x064b
            if (r7 == 0) goto L_0x064b
            r7 = 1
            r8.f25288g = r7
        L_0x064b:
            java.util.ArrayList<v.f> r7 = r1.f26307r0
            int r8 = r26.m()
            r9 = 2
            if (r8 == r9) goto L_0x065e
            int r8 = r26.t()
            if (r8 != r9) goto L_0x065b
            goto L_0x065e
        L_0x065b:
            r8 = 0
            r10 = 0
            goto L_0x0660
        L_0x065e:
            r8 = 0
            r10 = 1
        L_0x0660:
            r1.A0 = r8
            r1.B0 = r8
            r9 = r22
            r8 = 0
        L_0x0667:
            if (r8 >= r9) goto L_0x067d
            java.util.ArrayList<v.f> r11 = r1.f26307r0
            java.lang.Object r11 = r11.get(r8)
            v.f r11 = (v.f) r11
            boolean r12 = r11 instanceof v.m
            if (r12 == 0) goto L_0x067a
            v.m r11 = (v.m) r11
            r11.V()
        L_0x067a:
            int r8 = r8 + 1
            goto L_0x0667
        L_0x067d:
            boolean r8 = r1.f0(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x0684:
            if (r12 == 0) goto L_0x08d8
            r13 = 1
            int r14 = r0 + 1
            t.c r0 = r1.f26295x0     // Catch:{ Exception -> 0x0766 }
            r0.u()     // Catch:{ Exception -> 0x0766 }
            r13 = 0
            r1.A0 = r13     // Catch:{ Exception -> 0x0766 }
            r1.B0 = r13     // Catch:{ Exception -> 0x0766 }
            t.c r0 = r1.f26295x0     // Catch:{ Exception -> 0x0766 }
            r1.g(r0)     // Catch:{ Exception -> 0x0766 }
            r0 = 0
        L_0x0699:
            if (r0 >= r9) goto L_0x06ab
            java.util.ArrayList<v.f> r13 = r1.f26307r0     // Catch:{ Exception -> 0x0766 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0766 }
            v.f r13 = (v.f) r13     // Catch:{ Exception -> 0x0766 }
            t.c r15 = r1.f26295x0     // Catch:{ Exception -> 0x0766 }
            r13.g(r15)     // Catch:{ Exception -> 0x0766 }
            int r0 = r0 + 1
            goto L_0x0699
        L_0x06ab:
            t.c r0 = r1.f26295x0     // Catch:{ Exception -> 0x0766 }
            r1.X(r0)     // Catch:{ Exception -> 0x0766 }
            java.lang.ref.WeakReference<v.d> r0 = r1.H0     // Catch:{ Exception -> 0x0759 }
            r12 = 5
            if (r0 == 0) goto L_0x06da
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x06da
            java.lang.ref.WeakReference<v.d> r0 = r1.H0     // Catch:{ Exception -> 0x0759 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            v.d r15 = r1.K     // Catch:{ Exception -> 0x0759 }
            t.h r13 = r13.l(r15)     // Catch:{ Exception -> 0x0759 }
            t.c r15 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            t.h r0 = r15.l(r0)     // Catch:{ Exception -> 0x0759 }
            t.c r15 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            r6 = 0
            r15.f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x0759 }
            r6 = 0
            r1.H0 = r6     // Catch:{ Exception -> 0x0759 }
        L_0x06da:
            java.lang.ref.WeakReference<v.d> r0 = r1.J0     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x0703
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x0703
            java.lang.ref.WeakReference<v.d> r0 = r1.J0     // Catch:{ Exception -> 0x0759 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x0759 }
            t.c r6 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            v.d r13 = r1.M     // Catch:{ Exception -> 0x0759 }
            t.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            t.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0759 }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x0759 }
        L_0x0703:
            java.lang.ref.WeakReference<v.d> r0 = r1.I0     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x072f
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x072f
            java.lang.ref.WeakReference<v.d> r0 = r1.I0     // Catch:{ Exception -> 0x0759 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x0759 }
            t.c r6 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            v.d r13 = r1.J     // Catch:{ Exception -> 0x0759 }
            t.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            t.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            r15 = 0
            r13.f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x0759 }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0759 }
            goto L_0x072f
        L_0x072d:
            r6 = 0
            goto L_0x0764
        L_0x072f:
            java.lang.ref.WeakReference<v.d> r0 = r1.K0     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x075b
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            if (r0 == 0) goto L_0x075b
            java.lang.ref.WeakReference<v.d> r0 = r1.K0     // Catch:{ Exception -> 0x0759 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0759 }
            v.d r0 = (v.d) r0     // Catch:{ Exception -> 0x0759 }
            t.c r6 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            v.d r13 = r1.L     // Catch:{ Exception -> 0x0759 }
            t.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            t.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0759 }
            t.c r13 = r1.f26295x0     // Catch:{ Exception -> 0x0759 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0759 }
            r6 = 0
            r1.K0 = r6     // Catch:{ Exception -> 0x0763 }
            goto L_0x075c
        L_0x0759:
            r0 = move-exception
            goto L_0x072d
        L_0x075b:
            r6 = 0
        L_0x075c:
            t.c r0 = r1.f26295x0     // Catch:{ Exception -> 0x0763 }
            r0.q()     // Catch:{ Exception -> 0x0763 }
            r12 = 1
            goto L_0x0781
        L_0x0763:
            r0 = move-exception
        L_0x0764:
            r12 = 1
            goto L_0x0768
        L_0x0766:
            r0 = move-exception
            r6 = 0
        L_0x0768:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x0781:
            if (r12 == 0) goto L_0x07ca
            t.c r0 = r1.f26295x0
            boolean[] r6 = v.k.f26306a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.f0(r6)
            r1.U(r0, r12)
            java.util.ArrayList<v.f> r13 = r1.f26307r0
            int r13 = r13.size()
            r15 = 0
            r18 = 0
        L_0x079d:
            if (r15 >= r13) goto L_0x07c8
            java.util.ArrayList<v.f> r6 = r1.f26307r0
            java.lang.Object r6 = r6.get(r15)
            v.f r6 = (v.f) r6
            r6.U(r0, r12)
            r21 = r0
            int r0 = r6.f26261h
            r22 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07ba
            int r0 = r6.f26263i
            if (r0 == r12) goto L_0x07b8
            goto L_0x07ba
        L_0x07b8:
            r0 = 0
            goto L_0x07bb
        L_0x07ba:
            r0 = 1
        L_0x07bb:
            if (r0 == 0) goto L_0x07bf
            r18 = 1
        L_0x07bf:
            int r15 = r15 + 1
            r0 = r21
            r12 = r22
            r6 = 64
            goto L_0x079d
        L_0x07c8:
            r12 = -1
            goto L_0x07e5
        L_0x07ca:
            r12 = -1
            t.c r0 = r1.f26295x0
            r1.U(r0, r8)
            r0 = 0
        L_0x07d1:
            if (r0 >= r9) goto L_0x07e3
            java.util.ArrayList<v.f> r6 = r1.f26307r0
            java.lang.Object r6 = r6.get(r0)
            v.f r6 = (v.f) r6
            t.c r13 = r1.f26295x0
            r6.U(r13, r8)
            int r0 = r0 + 1
            goto L_0x07d1
        L_0x07e3:
            r18 = 0
        L_0x07e5:
            r0 = 8
            if (r10 == 0) goto L_0x084f
            if (r14 >= r0) goto L_0x084f
            boolean[] r6 = v.k.f26306a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x084f
            r6 = 0
            r13 = 0
            r15 = 0
        L_0x07f5:
            if (r6 >= r9) goto L_0x081c
            java.util.ArrayList<v.f> r12 = r1.f26307r0
            java.lang.Object r12 = r12.get(r6)
            v.f r12 = (v.f) r12
            int r0 = r12.f26248a0
            int r22 = r12.u()
            int r0 = r22 + r0
            int r13 = java.lang.Math.max(r13, r0)
            int r0 = r12.f26250b0
            int r12 = r12.l()
            int r12 = r12 + r0
            int r15 = java.lang.Math.max(r15, r12)
            int r6 = r6 + 1
            r0 = 8
            r12 = -1
            goto L_0x07f5
        L_0x081c:
            int r0 = r1.f26254d0
            int r0 = java.lang.Math.max(r0, r13)
            int r6 = r1.f26256e0
            int r6 = java.lang.Math.max(r6, r15)
            r12 = 2
            if (r2 != r12) goto L_0x083c
            int r13 = r26.u()
            if (r13 >= r0) goto L_0x083c
            r1.S(r0)
            int[] r0 = r1.U
            r11 = 0
            r0[r11] = r12
            r11 = 1
            r18 = 1
        L_0x083c:
            if (r4 != r12) goto L_0x084f
            int r0 = r26.l()
            if (r0 >= r6) goto L_0x084f
            r1.N(r6)
            int[] r0 = r1.U
            r6 = 1
            r0[r6] = r12
            r11 = 1
            r18 = 1
        L_0x084f:
            int r0 = r1.f26254d0
            int r6 = r26.u()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.u()
            if (r0 <= r6) goto L_0x086d
            r1.S(r0)
            int[] r0 = r1.U
            r6 = 1
            r11 = 0
            r0[r11] = r6
            r18 = 1
            r20 = 1
            goto L_0x0870
        L_0x086d:
            r6 = 1
            r20 = r11
        L_0x0870:
            int r0 = r1.f26256e0
            int r11 = r26.l()
            int r0 = java.lang.Math.max(r0, r11)
            int r11 = r26.l()
            if (r0 <= r11) goto L_0x088b
            r1.N(r0)
            int[] r0 = r1.U
            r0[r6] = r6
            r0 = 1
            r18 = 1
            goto L_0x088d
        L_0x088b:
            r0 = r20
        L_0x088d:
            if (r0 != 0) goto L_0x08c9
            int[] r11 = r1.U
            r12 = 0
            r11 = r11[r12]
            r13 = 2
            if (r11 != r13) goto L_0x08ab
            if (r3 <= 0) goto L_0x08ab
            int r11 = r26.u()
            if (r11 <= r3) goto L_0x08ab
            r1.F0 = r6
            int[] r0 = r1.U
            r0[r12] = r6
            r1.S(r3)
            r0 = 1
            r18 = 1
        L_0x08ab:
            int[] r11 = r1.U
            r11 = r11[r6]
            r12 = 2
            if (r11 != r12) goto L_0x08ca
            if (r5 <= 0) goto L_0x08ca
            int r11 = r26.l()
            if (r11 <= r5) goto L_0x08ca
            r1.G0 = r6
            int[] r0 = r1.U
            r0[r6] = r6
            r1.N(r5)
            r0 = 8
            r11 = 1
            r18 = 1
            goto L_0x08cd
        L_0x08c9:
            r12 = 2
        L_0x08ca:
            r11 = r0
            r0 = 8
        L_0x08cd:
            if (r14 <= r0) goto L_0x08d1
            r18 = 0
        L_0x08d1:
            r0 = r14
            r12 = r18
            r6 = 64
            goto L_0x0684
        L_0x08d8:
            r1.f26307r0 = r7
            if (r11 == 0) goto L_0x08e4
            int[] r0 = r1.U
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r4
        L_0x08e4:
            t.c r0 = r1.f26295x0
            n2.g r0 = r0.f25293l
            r1.H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.V():void");
    }

    public void W(f fVar, int i10) {
        if (i10 == 0) {
            int i11 = this.A0 + 1;
            c[] cVarArr = this.D0;
            if (i11 >= cVarArr.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.D0;
            int i12 = this.A0;
            cVarArr2[i12] = new c(fVar, 0, this.f26294w0);
            this.A0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.B0 + 1;
            c[] cVarArr3 = this.C0;
            if (i13 >= cVarArr3.length) {
                this.C0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.C0;
            int i14 = this.B0;
            cVarArr4[i14] = new c(fVar, 1, this.f26294w0);
            this.B0 = i14 + 1;
        }
    }

    public boolean X(c cVar) {
        boolean z10;
        boolean f02 = f0(64);
        d(cVar, f02);
        int size = this.f26307r0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f26307r0.get(i10);
            boolean[] zArr = fVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (fVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = this.f26307r0.get(i11);
                if (fVar2 instanceof a) {
                    a aVar = (a) fVar2;
                    for (int i12 = 0; i12 < aVar.f26305s0; i12++) {
                        f fVar3 = aVar.f26304r0[i12];
                        if (aVar.f26206u0 || fVar3.e()) {
                            int i13 = aVar.f26205t0;
                            if (i13 == 0 || i13 == 1) {
                                fVar3.T[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                fVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i14 = 0; i14 < size; i14++) {
            f fVar4 = this.f26307r0.get(i14);
            if (fVar4.c()) {
                if (fVar4 instanceof l) {
                    this.L0.add(fVar4);
                } else {
                    fVar4.d(cVar, f02);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<f> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                HashSet<f> hashSet = this.L0;
                int i15 = 0;
                while (true) {
                    if (i15 >= lVar.f26305s0) {
                        z10 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(lVar.f26304r0[i15])) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z10) {
                    lVar.d(cVar, f02);
                    this.L0.remove(lVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<f> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().d(cVar, f02);
                }
                this.L0.clear();
            }
        }
        if (c.f25279p) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                f fVar5 = this.f26307r0.get(i16);
                if (!fVar5.c()) {
                    hashSet2.add(fVar5);
                }
            }
            b(this, cVar, hashSet2, m() == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                f fVar6 = (f) it3.next();
                k.a(this, cVar, fVar6);
                fVar6.d(cVar, f02);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                f fVar7 = this.f26307r0.get(i17);
                if (fVar7 instanceof g) {
                    int[] iArr = fVar7.U;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        iArr[0] = 1;
                    }
                    if (i19 == 2) {
                        iArr[1] = 1;
                    }
                    fVar7.d(cVar, f02);
                    if (i18 == 2) {
                        fVar7.O(i18);
                    }
                    if (i19 == 2) {
                        fVar7.R(i19);
                    }
                } else {
                    k.a(this, cVar, fVar7);
                    if (!fVar7.c()) {
                        fVar7.d(cVar, f02);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            b.a(this, cVar, (ArrayList<f>) null, 0);
        }
        if (this.B0 > 0) {
            b.a(this, cVar, (ArrayList<f>) null, 1);
        }
        return true;
    }

    public void Y(d dVar) {
        WeakReference<d> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.K0.get()).c()) {
            this.K0 = new WeakReference<>(dVar);
        }
    }

    public void Z(d dVar) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.I0.get()).c()) {
            this.I0 = new WeakReference<>(dVar);
        }
    }

    public void a0(d dVar) {
        WeakReference<d> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.J0.get()).c()) {
            this.J0 = new WeakReference<>(dVar);
        }
    }

    public void b0(d dVar) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.H0.get()).c()) {
            this.H0 = new WeakReference<>(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132 A[EDGE_INSN: B:74:0x0132->B:61:0x0132 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c0(boolean r12, int r13) {
        /*
            r11 = this;
            w.e r0 = r11.f26291t0
            r1 = 1
            r12 = r12 & r1
            v.g r2 = r0.f26804a
            r3 = 0
            int r2 = r2.k(r3)
            v.g r4 = r0.f26804a
            int r4 = r4.k(r1)
            v.g r5 = r0.f26804a
            int r5 = r5.v()
            v.g r6 = r0.f26804a
            int r6 = r6.w()
            if (r12 == 0) goto L_0x0080
            r7 = 2
            if (r2 == r7) goto L_0x0024
            if (r4 != r7) goto L_0x0080
        L_0x0024:
            java.util.ArrayList<w.p> r8 = r0.f26808e
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0041
            java.lang.Object r9 = r8.next()
            w.p r9 = (w.p) r9
            int r10 = r9.f26854f
            if (r10 != r13) goto L_0x002a
            boolean r9 = r9.k()
            if (r9 != 0) goto L_0x002a
            r12 = 0
        L_0x0041:
            if (r13 != 0) goto L_0x0062
            if (r12 == 0) goto L_0x0080
            if (r2 != r7) goto L_0x0080
            v.g r12 = r0.f26804a
            int[] r7 = r12.U
            r7[r3] = r1
            int r7 = r0.d(r12, r3)
            r12.S(r7)
            v.g r12 = r0.f26804a
            w.l r7 = r12.f26253d
            w.g r7 = r7.f26853e
            int r12 = r12.u()
            r7.c(r12)
            goto L_0x0080
        L_0x0062:
            if (r12 == 0) goto L_0x0080
            if (r4 != r7) goto L_0x0080
            v.g r12 = r0.f26804a
            int[] r7 = r12.U
            r7[r1] = r1
            int r7 = r0.d(r12, r1)
            r12.N(r7)
            v.g r12 = r0.f26804a
            w.n r7 = r12.f26255e
            w.g r7 = r7.f26853e
            int r12 = r12.l()
            r7.c(r12)
        L_0x0080:
            r12 = 4
            if (r13 != 0) goto L_0x00a8
            v.g r6 = r0.f26804a
            int[] r7 = r6.U
            r8 = r7[r3]
            if (r8 == r1) goto L_0x008f
            r7 = r7[r3]
            if (r7 != r12) goto L_0x00b5
        L_0x008f:
            int r12 = r6.u()
            int r12 = r12 + r5
            v.g r6 = r0.f26804a
            w.l r6 = r6.f26253d
            w.f r6 = r6.f26857i
            r6.c(r12)
            v.g r6 = r0.f26804a
            w.l r6 = r6.f26253d
            w.g r6 = r6.f26853e
            int r12 = r12 - r5
            r6.c(r12)
            goto L_0x00cf
        L_0x00a8:
            v.g r5 = r0.f26804a
            int[] r7 = r5.U
            r8 = r7[r1]
            if (r8 == r1) goto L_0x00b7
            r7 = r7[r1]
            if (r7 != r12) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r12 = 0
            goto L_0x00d0
        L_0x00b7:
            int r12 = r5.l()
            int r12 = r12 + r6
            v.g r5 = r0.f26804a
            w.n r5 = r5.f26255e
            w.f r5 = r5.f26857i
            r5.c(r12)
            v.g r5 = r0.f26804a
            w.n r5 = r5.f26255e
            w.g r5 = r5.f26853e
            int r12 = r12 - r6
            r5.c(r12)
        L_0x00cf:
            r12 = 1
        L_0x00d0:
            r0.g()
            java.util.ArrayList<w.p> r5 = r0.f26808e
            java.util.Iterator r5 = r5.iterator()
        L_0x00d9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r5.next()
            w.p r6 = (w.p) r6
            int r7 = r6.f26854f
            if (r7 == r13) goto L_0x00ea
            goto L_0x00d9
        L_0x00ea:
            v.f r7 = r6.f26850b
            v.g r8 = r0.f26804a
            if (r7 != r8) goto L_0x00f5
            boolean r7 = r6.f26855g
            if (r7 != 0) goto L_0x00f5
            goto L_0x00d9
        L_0x00f5:
            r6.e()
            goto L_0x00d9
        L_0x00f9:
            java.util.ArrayList<w.p> r5 = r0.f26808e
            java.util.Iterator r5 = r5.iterator()
        L_0x00ff:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0132
            java.lang.Object r6 = r5.next()
            w.p r6 = (w.p) r6
            int r7 = r6.f26854f
            if (r7 == r13) goto L_0x0110
            goto L_0x00ff
        L_0x0110:
            if (r12 != 0) goto L_0x0119
            v.f r7 = r6.f26850b
            v.g r8 = r0.f26804a
            if (r7 != r8) goto L_0x0119
            goto L_0x00ff
        L_0x0119:
            w.f r7 = r6.f26856h
            boolean r7 = r7.f26821j
            if (r7 != 0) goto L_0x0120
            goto L_0x0131
        L_0x0120:
            w.f r7 = r6.f26857i
            boolean r7 = r7.f26821j
            if (r7 != 0) goto L_0x0127
            goto L_0x0131
        L_0x0127:
            boolean r7 = r6 instanceof w.c
            if (r7 != 0) goto L_0x00ff
            w.g r6 = r6.f26853e
            boolean r6 = r6.f26821j
            if (r6 != 0) goto L_0x00ff
        L_0x0131:
            r1 = 0
        L_0x0132:
            v.g r12 = r0.f26804a
            r12.O(r2)
            v.g r12 = r0.f26804a
            r12.R(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.c0(boolean, int):boolean");
    }

    public void d0() {
        this.f26291t0.f26805b = true;
    }

    public boolean f0(int i10) {
        return (this.E0 & i10) == i10;
    }

    public void g0(int i10) {
        this.E0 = i10;
        c.f25279p = f0(512);
    }

    public void q(StringBuilder sb2) {
        sb2.append(this.f26265j + ":{\n");
        sb2.append("  actualWidth:" + this.W);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.X);
        sb2.append("\n");
        Iterator<f> it = this.f26307r0.iterator();
        while (it.hasNext()) {
            it.next().q(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
