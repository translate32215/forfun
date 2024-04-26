package t;

import java.util.Arrays;
import n2.g;
import v.d;

/* compiled from: LinearSystem */
public class c {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f25279p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f25280q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static long f25281r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25282a;

    /* renamed from: b  reason: collision with root package name */
    public int f25283b;

    /* renamed from: c  reason: collision with root package name */
    public a f25284c;

    /* renamed from: d  reason: collision with root package name */
    public int f25285d;

    /* renamed from: e  reason: collision with root package name */
    public int f25286e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f25287f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25288g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f25289h;

    /* renamed from: i  reason: collision with root package name */
    public int f25290i;

    /* renamed from: j  reason: collision with root package name */
    public int f25291j;

    /* renamed from: k  reason: collision with root package name */
    public int f25292k;

    /* renamed from: l  reason: collision with root package name */
    public final g f25293l;

    /* renamed from: m  reason: collision with root package name */
    public h[] f25294m;

    /* renamed from: n  reason: collision with root package name */
    public int f25295n;

    /* renamed from: o  reason: collision with root package name */
    public a f25296o;

    /* compiled from: LinearSystem */
    public interface a {
        h a(c cVar, boolean[] zArr);

        void b(h hVar);

        void clear();

        boolean isEmpty();
    }

    public c() {
        this.f25282a = false;
        this.f25283b = 0;
        this.f25285d = 32;
        this.f25286e = 32;
        this.f25287f = null;
        this.f25288g = false;
        this.f25289h = new boolean[32];
        this.f25290i = 1;
        this.f25291j = 0;
        this.f25292k = 32;
        this.f25294m = new h[f25280q];
        this.f25295n = 0;
        this.f25287f = new b[32];
        t();
        g gVar = new g(1);
        this.f25293l = gVar;
        this.f25284c = new e(gVar);
        this.f25296o = new b(gVar);
    }

    public final h a(int i10, String str) {
        h hVar = (h) ((d) this.f25293l.f21852c).b();
        if (hVar == null) {
            hVar = new h(i10);
            hVar.f25320i = i10;
        } else {
            hVar.c();
            hVar.f25320i = i10;
        }
        int i11 = this.f25295n;
        int i12 = f25280q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f25280q = i13;
            this.f25294m = (h[]) Arrays.copyOf(this.f25294m, i13);
        }
        h[] hVarArr = this.f25294m;
        int i14 = this.f25295n;
        this.f25295n = i14 + 1;
        hVarArr[i14] = hVar;
        return hVar;
    }

    public void b(h hVar, h hVar2, int i10, float f10, h hVar3, h hVar4, int i11, int i12) {
        b m10 = m();
        if (hVar2 == hVar3) {
            m10.f25277d.d(hVar, 1.0f);
            m10.f25277d.d(hVar4, 1.0f);
            m10.f25277d.d(hVar2, -2.0f);
        } else if (f10 == 0.5f) {
            m10.f25277d.d(hVar, 1.0f);
            m10.f25277d.d(hVar2, -1.0f);
            m10.f25277d.d(hVar3, -1.0f);
            m10.f25277d.d(hVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                m10.f25275b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            m10.f25277d.d(hVar, -1.0f);
            m10.f25277d.d(hVar2, 1.0f);
            m10.f25275b = (float) i10;
        } else if (f10 >= 1.0f) {
            m10.f25277d.d(hVar4, -1.0f);
            m10.f25277d.d(hVar3, 1.0f);
            m10.f25275b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            m10.f25277d.d(hVar, f11 * 1.0f);
            m10.f25277d.d(hVar2, f11 * -1.0f);
            m10.f25277d.d(hVar3, -1.0f * f10);
            m10.f25277d.d(hVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                m10.f25275b = (((float) i11) * f10) + (((float) (-i10)) * f11);
            }
        }
        if (i12 != 8) {
            m10.c(this, i12);
        }
        c(m10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(t.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f25291j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f25292k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f25290i
            int r2 = r2 + r3
            int r4 = r0.f25286e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.f25278e
            if (r2 != 0) goto L_0x01bd
            t.b[] r2 = r0.f25287f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            t.b$a r6 = r1.f25277d
            int r6 = r6.f()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            t.b$a r8 = r1.f25277d
            t.h r8 = r8.h(r7)
            int r9 = r8.f25314c
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f25317f
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<t.h> r9 = r1.f25276c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<t.h> r6 = r1.f25276c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<t.h> r8 = r1.f25276c
            java.lang.Object r8 = r8.get(r7)
            t.h r8 = (t.h) r8
            boolean r9 = r8.f25317f
            if (r9 == 0) goto L_0x005f
            r1.k(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            t.b[] r9 = r0.f25287f
            int r8 = r8.f25314c
            r8 = r9[r8]
            r1.l(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<t.h> r6 = r1.f25276c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = 1
            goto L_0x0022
        L_0x0073:
            t.h r2 = r1.f25274a
            if (r2 == 0) goto L_0x0083
            t.b$a r2 = r1.f25277d
            int r2 = r2.f()
            if (r2 != 0) goto L_0x0083
            r1.f25278e = r3
            r0.f25282a = r3
        L_0x0083:
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f25275b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f25275b = r2
            t.b$a r2 = r1.f25277d
            r2.k()
        L_0x009c:
            t.b$a r2 = r1.f25277d
            int r2 = r2.f()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00aa:
            if (r8 >= r2) goto L_0x0105
            t.b$a r15 = r1.f25277d
            float r15 = r15.a(r8)
            t.b$a r4 = r1.f25277d
            t.h r4 = r4.h(r8)
            int r5 = r4.f25320i
            if (r5 != r3) goto L_0x00dc
            if (r9 != 0) goto L_0x00c4
            boolean r5 = r1.h(r4)
        L_0x00c2:
            r12 = r5
            goto L_0x00cd
        L_0x00c4:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d0
            boolean r5 = r1.h(r4)
            goto L_0x00c2
        L_0x00cd:
            r9 = r4
            r11 = r15
            goto L_0x0101
        L_0x00d0:
            if (r12 != 0) goto L_0x0101
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x0101
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x0101
        L_0x00dc:
            if (r9 != 0) goto L_0x0101
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0101
            if (r10 != 0) goto L_0x00ea
            boolean r5 = r1.h(r4)
        L_0x00e8:
            r14 = r5
            goto L_0x00f3
        L_0x00ea:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f6
            boolean r5 = r1.h(r4)
            goto L_0x00e8
        L_0x00f3:
            r10 = r4
            r13 = r15
            goto L_0x0101
        L_0x00f6:
            if (r14 != 0) goto L_0x0101
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x0101
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x0101:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00aa
        L_0x0105:
            if (r9 == 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r9 = r10
        L_0x0109:
            if (r9 != 0) goto L_0x010d
            r2 = 1
            goto L_0x0111
        L_0x010d:
            r1.j(r9)
            r2 = 0
        L_0x0111:
            t.b$a r4 = r1.f25277d
            int r4 = r4.f()
            if (r4 != 0) goto L_0x011b
            r1.f25278e = r3
        L_0x011b:
            if (r2 == 0) goto L_0x01a7
            int r2 = r0.f25290i
            int r2 = r2 + r3
            int r4 = r0.f25286e
            if (r2 < r4) goto L_0x0127
            r16.p()
        L_0x0127:
            r2 = 3
            t.h r2 = r0.a(r2, r7)
            int r4 = r0.f25283b
            int r4 = r4 + r3
            r0.f25283b = r4
            int r5 = r0.f25290i
            int r5 = r5 + r3
            r0.f25290i = r5
            r2.f25313b = r4
            n2.g r5 = r0.f25293l
            java.lang.Object r5 = r5.f21853d
            t.h[] r5 = (t.h[]) r5
            r5[r4] = r2
            r1.f25274a = r2
            int r4 = r0.f25291j
            r16.i(r17)
            int r5 = r0.f25291j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01a7
            t.c$a r4 = r0.f25296o
            t.b r4 = (t.b) r4
            r4.getClass()
            r4.f25274a = r7
            t.b$a r5 = r4.f25277d
            r5.clear()
            r5 = 0
        L_0x015b:
            t.b$a r8 = r1.f25277d
            int r8 = r8.f()
            if (r5 >= r8) goto L_0x0177
            t.b$a r8 = r1.f25277d
            t.h r8 = r8.h(r5)
            t.b$a r9 = r1.f25277d
            float r9 = r9.a(r5)
            t.b$a r10 = r4.f25277d
            r10.j(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0177:
            t.c$a r4 = r0.f25296o
            r0.s(r4)
            int r4 = r2.f25314c
            r5 = -1
            if (r4 != r5) goto L_0x01a5
            t.h r4 = r1.f25274a
            if (r4 != r2) goto L_0x018e
            t.h r2 = r1.i(r7, r2)
            if (r2 == 0) goto L_0x018e
            r1.j(r2)
        L_0x018e:
            boolean r2 = r1.f25278e
            if (r2 != 0) goto L_0x0197
            t.h r2 = r1.f25274a
            r2.i(r0, r1)
        L_0x0197:
            n2.g r2 = r0.f25293l
            java.lang.Object r2 = r2.f21851b
            t.d r2 = (t.d) r2
            r2.a(r1)
            int r2 = r0.f25291j
            int r2 = r2 - r3
            r0.f25291j = r2
        L_0x01a5:
            r2 = 1
            goto L_0x01a8
        L_0x01a7:
            r2 = 0
        L_0x01a8:
            t.h r4 = r1.f25274a
            if (r4 == 0) goto L_0x01b7
            int r4 = r4.f25320i
            if (r4 == r3) goto L_0x01b8
            float r4 = r1.f25275b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r3 = 0
        L_0x01b8:
            if (r3 != 0) goto L_0x01bb
            return
        L_0x01bb:
            r4 = r2
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            if (r4 != 0) goto L_0x01c3
            r16.i(r17)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.c(t.b):void");
    }

    public b d(h hVar, h hVar2, int i10, int i11) {
        if (i11 == 8 && hVar2.f25317f && hVar.f25314c == -1) {
            hVar.f(this, hVar2.f25316e + ((float) i10));
            return null;
        }
        b m10 = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            m10.f25275b = (float) i10;
        }
        if (!z10) {
            m10.f25277d.d(hVar, -1.0f);
            m10.f25277d.d(hVar2, 1.0f);
        } else {
            m10.f25277d.d(hVar, 1.0f);
            m10.f25277d.d(hVar2, -1.0f);
        }
        if (i11 != 8) {
            m10.c(this, i11);
        }
        c(m10);
        return m10;
    }

    public void e(h hVar, int i10) {
        int i11 = hVar.f25314c;
        if (i11 == -1) {
            hVar.f(this, (float) i10);
            for (int i12 = 0; i12 < this.f25283b + 1; i12++) {
                h hVar2 = ((h[]) this.f25293l.f21853d)[i12];
            }
        } else if (i11 != -1) {
            b bVar = this.f25287f[i11];
            if (bVar.f25278e) {
                bVar.f25275b = (float) i10;
            } else if (bVar.f25277d.f() == 0) {
                bVar.f25278e = true;
                bVar.f25275b = (float) i10;
            } else {
                b m10 = m();
                if (i10 < 0) {
                    m10.f25275b = (float) (i10 * -1);
                    m10.f25277d.d(hVar, 1.0f);
                } else {
                    m10.f25275b = (float) i10;
                    m10.f25277d.d(hVar, -1.0f);
                }
                c(m10);
            }
        } else {
            b m11 = m();
            m11.f25274a = hVar;
            float f10 = (float) i10;
            hVar.f25316e = f10;
            m11.f25275b = f10;
            m11.f25278e = true;
            c(m11);
        }
    }

    public void f(h hVar, h hVar2, int i10, int i11) {
        b m10 = m();
        h n10 = n();
        n10.f25315d = 0;
        m10.e(hVar, hVar2, n10, i10);
        if (i11 != 8) {
            m10.f25277d.d(k(i11, (String) null), (float) ((int) (m10.f25277d.e(n10) * -1.0f)));
        }
        c(m10);
    }

    public void g(h hVar, h hVar2, int i10, int i11) {
        b m10 = m();
        h n10 = n();
        n10.f25315d = 0;
        m10.f(hVar, hVar2, n10, i10);
        if (i11 != 8) {
            m10.f25277d.d(k(i11, (String) null), (float) ((int) (m10.f25277d.e(n10) * -1.0f)));
        }
        c(m10);
    }

    public void h(h hVar, h hVar2, h hVar3, h hVar4, float f10, int i10) {
        b m10 = m();
        m10.d(hVar, hVar2, hVar3, hVar4, f10);
        if (i10 != 8) {
            m10.c(this, i10);
        }
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f25278e) {
            bVar.f25274a.f(this, bVar.f25275b);
        } else {
            b[] bVarArr = this.f25287f;
            int i11 = this.f25291j;
            bVarArr[i11] = bVar;
            h hVar = bVar.f25274a;
            hVar.f25314c = i11;
            this.f25291j = i11 + 1;
            hVar.i(this, bVar);
        }
        if (this.f25282a) {
            int i12 = 0;
            while (i12 < this.f25291j) {
                if (this.f25287f[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f25287f;
                if (bVarArr2[i12] != null && bVarArr2[i12].f25278e) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f25274a.f(this, bVar2.f25275b);
                    ((d) this.f25293l.f21851b).a(bVar2);
                    this.f25287f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f25291j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f25287f;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f25274a.f25314c == i13) {
                            bVarArr3[i15].f25274a.f25314c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f25287f[i14] = null;
                    }
                    this.f25291j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f25282a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f25291j; i10++) {
            b bVar = this.f25287f[i10];
            bVar.f25274a.f25316e = bVar.f25275b;
        }
    }

    public h k(int i10, String str) {
        if (this.f25290i + 1 >= this.f25286e) {
            p();
        }
        h a10 = a(4, str);
        int i11 = this.f25283b + 1;
        this.f25283b = i11;
        this.f25290i++;
        a10.f25313b = i11;
        a10.f25315d = i10;
        ((h[]) this.f25293l.f21853d)[i11] = a10;
        this.f25284c.b(a10);
        return a10;
    }

    public h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f25290i + 1 >= this.f25286e) {
            p();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            hVar = dVar.f26237i;
            if (hVar == null) {
                dVar.i();
                hVar = dVar.f26237i;
            }
            int i10 = hVar.f25313b;
            if (i10 == -1 || i10 > this.f25283b || ((h[]) this.f25293l.f21853d)[i10] == null) {
                if (i10 != -1) {
                    hVar.c();
                }
                int i11 = this.f25283b + 1;
                this.f25283b = i11;
                this.f25290i++;
                hVar.f25313b = i11;
                hVar.f25320i = 1;
                ((h[]) this.f25293l.f21853d)[i11] = hVar;
            }
        }
        return hVar;
    }

    public b m() {
        b bVar = (b) ((d) this.f25293l.f21851b).b();
        if (bVar == null) {
            bVar = new b(this.f25293l);
            f25281r++;
        } else {
            bVar.f25274a = null;
            bVar.f25277d.clear();
            bVar.f25275b = 0.0f;
            bVar.f25278e = false;
        }
        h.f25311u++;
        return bVar;
    }

    public h n() {
        if (this.f25290i + 1 >= this.f25286e) {
            p();
        }
        h a10 = a(3, (String) null);
        int i10 = this.f25283b + 1;
        this.f25283b = i10;
        this.f25290i++;
        a10.f25313b = i10;
        ((h[]) this.f25293l.f21853d)[i10] = a10;
        return a10;
    }

    public int o(Object obj) {
        h hVar = ((d) obj).f26237i;
        if (hVar != null) {
            return (int) (hVar.f25316e + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i10 = this.f25285d * 2;
        this.f25285d = i10;
        this.f25287f = (b[]) Arrays.copyOf(this.f25287f, i10);
        g gVar = this.f25293l;
        gVar.f21853d = (h[]) Arrays.copyOf((h[]) gVar.f21853d, this.f25285d);
        int i11 = this.f25285d;
        this.f25289h = new boolean[i11];
        this.f25286e = i11;
        this.f25292k = i11;
    }

    public void q() throws Exception {
        if (this.f25284c.isEmpty()) {
            j();
        } else if (this.f25288g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f25291j) {
                    z10 = true;
                    break;
                } else if (!this.f25287f[i10].f25278e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                r(this.f25284c);
            } else {
                j();
            }
        } else {
            r(this.f25284c);
        }
    }

    public void r(a aVar) throws Exception {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f25291j) {
                z10 = false;
                break;
            }
            b[] bVarArr = this.f25287f;
            if (bVarArr[i11].f25274a.f25320i != 1 && bVarArr[i11].f25275b < 0.0f) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                while (i13 < this.f25291j) {
                    b bVar = this.f25287f[i13];
                    if (bVar.f25274a.f25320i != i10 && !bVar.f25278e && bVar.f25275b < f10) {
                        int f12 = bVar.f25277d.f();
                        int i17 = 0;
                        while (i17 < f12) {
                            h h10 = bVar.f25277d.h(i17);
                            float e10 = bVar.f25277d.e(h10);
                            if (e10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f13 = h10.f25318g[i18] / e10;
                                    if ((f13 < f11 && i18 == i16) || i18 > i16) {
                                        i15 = h10.f25313b;
                                        i16 = i18;
                                        f11 = f13;
                                        i14 = i13;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i13++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i14 != -1) {
                    b bVar2 = this.f25287f[i14];
                    bVar2.f25274a.f25314c = -1;
                    bVar2.j(((h[]) this.f25293l.f21853d)[i15]);
                    h hVar = bVar2.f25274a;
                    hVar.f25314c = i14;
                    hVar.i(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i12 > this.f25290i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i10 = 0; i10 < this.f25290i; i10++) {
            this.f25289h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f25290i * 2) {
                return i11;
            }
            h hVar = ((b) aVar).f25274a;
            if (hVar != null) {
                this.f25289h[hVar.f25313b] = true;
            }
            h a10 = aVar.a(this, this.f25289h);
            if (a10 != null) {
                boolean[] zArr = this.f25289h;
                int i12 = a10.f25313b;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f25291j; i14++) {
                    b bVar = this.f25287f[i14];
                    if (bVar.f25274a.f25320i != 1 && !bVar.f25278e && bVar.f25277d.g(a10)) {
                        float e10 = bVar.f25277d.e(a10);
                        if (e10 < 0.0f) {
                            float f11 = (-bVar.f25275b) / e10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f25287f[i13];
                    bVar2.f25274a.f25314c = -1;
                    bVar2.j(a10);
                    h hVar2 = bVar2.f25274a;
                    hVar2.f25314c = i13;
                    hVar2.i(this, bVar2);
                }
            } else {
                z10 = true;
            }
        }
        return i11;
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f25291j; i10++) {
            b bVar = this.f25287f[i10];
            if (bVar != null) {
                ((d) this.f25293l.f21851b).a(bVar);
            }
            this.f25287f[i10] = null;
        }
    }

    public void u() {
        g gVar;
        int i10 = 0;
        while (true) {
            gVar = this.f25293l;
            Object obj = gVar.f21853d;
            if (i10 >= ((h[]) obj).length) {
                break;
            }
            h hVar = ((h[]) obj)[i10];
            if (hVar != null) {
                hVar.c();
            }
            i10++;
        }
        d dVar = (d) gVar.f21852c;
        h[] hVarArr = this.f25294m;
        int i11 = this.f25295n;
        dVar.getClass();
        if (i11 > hVarArr.length) {
            i11 = hVarArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h hVar2 = hVarArr[i12];
            int i13 = dVar.f25299c;
            Object[] objArr = dVar.f25298b;
            if (i13 < objArr.length) {
                objArr[i13] = hVar2;
                dVar.f25299c = i13 + 1;
            }
        }
        this.f25295n = 0;
        Arrays.fill((h[]) this.f25293l.f21853d, (Object) null);
        this.f25283b = 0;
        this.f25284c.clear();
        this.f25290i = 1;
        for (int i14 = 0; i14 < this.f25291j; i14++) {
            b[] bVarArr = this.f25287f;
            if (bVarArr[i14] != null) {
                bVarArr[i14].getClass();
            }
        }
        t();
        this.f25291j = 0;
        this.f25296o = new b(this.f25293l);
    }
}
