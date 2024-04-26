package androidx.leanback.widget;

import androidx.leanback.widget.o;
import androidx.leanback.widget.p;
import s.d;

/* compiled from: StaggeredGrid */
public abstract class i1 extends o {

    /* renamed from: j  reason: collision with root package name */
    public d<a> f2402j = new d<>(64, 0);

    /* renamed from: k  reason: collision with root package name */
    public int f2403k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Object f2404l;

    /* renamed from: m  reason: collision with root package name */
    public int f2405m;

    /* compiled from: StaggeredGrid */
    public static class a extends o.a {

        /* renamed from: b  reason: collision with root package name */
        public int f2406b;

        /* renamed from: c  reason: collision with root package name */
        public int f2407c;

        public a(int i10, int i11, int i12) {
            super(i10);
            this.f2406b = i11;
            this.f2407c = i12;
        }
    }

    public final boolean b(int i10, boolean z10) {
        boolean s10;
        if (((p.b) this.f2440b).c() == 0) {
            return false;
        }
        if (!z10 && c(i10)) {
            return false;
        }
        try {
            if (q(i10, z10)) {
                s10 = true;
                this.f2439a[0] = null;
            } else {
                s10 = s(i10, z10);
                this.f2439a[0] = null;
            }
            this.f2404l = null;
            return s10;
        } catch (Throwable th) {
            this.f2439a[0] = null;
            this.f2404l = null;
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [E[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s.d[] j(int r8, int r9) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            int r1 = r7.f2443e
            if (r0 >= r1) goto L_0x000f
            s.d[] r1 = r7.f2446h
            r1 = r1[r0]
            r1.b()
            int r0 = r0 + 1
            goto L_0x0001
        L_0x000f:
            if (r8 < 0) goto L_0x005e
        L_0x0011:
            if (r8 > r9) goto L_0x005e
            s.d[] r0 = r7.f2446h
            androidx.leanback.widget.i1$a r1 = r7.k(r8)
            int r1 = r1.f2448a
            r0 = r0[r1]
            int r1 = r0.g()
            if (r1 <= 0) goto L_0x0055
            int r1 = r0.f24811c
            int r2 = r0.f24812d
            if (r1 == r2) goto L_0x004f
            E[] r3 = r0.f24810b
            r4 = r3
            int[] r4 = (int[]) r4
            int r5 = r2 + -1
            int r6 = r0.f24813e
            r5 = r5 & r6
            r4 = r4[r5]
            int r5 = r8 + -1
            if (r4 != r5) goto L_0x0055
            if (r1 == r2) goto L_0x0049
            int r2 = r2 + -1
            r1 = r6 & r2
            int[] r3 = (int[]) r3
            r2 = r3[r1]
            r0.f24812d = r1
            r0.a(r8)
            goto L_0x005b
        L_0x0049:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            r8.<init>()
            throw r8
        L_0x004f:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            r8.<init>()
            throw r8
        L_0x0055:
            r0.a(r8)
            r0.a(r8)
        L_0x005b:
            int r8 = r8 + 1
            goto L_0x0011
        L_0x005e:
            s.d[] r8 = r7.f2446h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.i1.j(int, int):s.d[]");
    }

    public void m(int i10) {
        super.m(i10);
        this.f2402j.e((t() - i10) + 1);
        if (this.f2402j.g() == 0) {
            this.f2403k = -1;
        }
    }

    public final boolean n(int i10, boolean z10) {
        boolean x10;
        if (((p.b) this.f2440b).c() == 0) {
            return false;
        }
        if (!z10 && d(i10)) {
            return false;
        }
        try {
            if (v(i10, z10)) {
                x10 = true;
                this.f2439a[0] = null;
            } else {
                x10 = x(i10, z10);
                this.f2439a[0] = null;
            }
            this.f2404l = null;
            return x10;
        } catch (Throwable th) {
            this.f2439a[0] = null;
            this.f2404l = null;
            throw th;
        }
    }

    public final boolean q(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (this.f2402j.g() == 0) {
            return false;
        }
        int c10 = ((p.b) this.f2440b).c();
        int i14 = this.f2445g;
        if (i14 >= 0) {
            i11 = i14 + 1;
            i12 = ((p.b) this.f2440b).d(i14);
        } else {
            int i15 = this.f2447i;
            i11 = i15 != -1 ? i15 : 0;
            if (i11 > t() + 1 || i11 < this.f2403k) {
                this.f2402j.b();
                return false;
            } else if (i11 > t()) {
                return false;
            } else {
                i12 = Integer.MAX_VALUE;
            }
        }
        int t10 = t();
        int i16 = i11;
        while (i16 < c10 && i16 <= t10) {
            a u10 = k(i16);
            if (i12 != Integer.MAX_VALUE) {
                i12 += u10.f2406b;
            }
            int i17 = u10.f2448a;
            int b10 = ((p.b) this.f2440b).b(i16, true, this.f2439a, false);
            if (b10 != u10.f2407c) {
                u10.f2407c = b10;
                this.f2402j.e(t10 - i16);
                i13 = i16;
            } else {
                i13 = t10;
            }
            this.f2445g = i16;
            if (this.f2444f < 0) {
                this.f2444f = i16;
            }
            ((p.b) this.f2440b).a(this.f2439a[0], i16, b10, i17, i12);
            if (!z10 && c(i10)) {
                return true;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = ((p.b) this.f2440b).d(i16);
            }
            if (i17 == this.f2443e - 1 && z10) {
                return true;
            }
            i16++;
            t10 = i13;
        }
        return false;
    }

    public final int r(int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int i14 = this.f2445g;
        if (i14 < 0 || (i14 == t() && this.f2445g == i10 - 1)) {
            int i15 = this.f2445g;
            if (i15 >= 0) {
                i13 = i12 - ((p.b) this.f2440b).d(i15);
            } else if (this.f2402j.g() <= 0 || i10 != t() + 1) {
                i13 = 0;
            } else {
                int t10 = t();
                while (true) {
                    if (t10 < this.f2403k) {
                        z10 = false;
                        break;
                    } else if (k(t10).f2448a == i11) {
                        z10 = true;
                        break;
                    } else {
                        t10--;
                    }
                }
                if (!z10) {
                    t10 = t();
                }
                if (this.f2441c) {
                    i13 = (-k(t10).f2407c) - this.f2442d;
                } else {
                    i13 = k(t10).f2407c + this.f2442d;
                }
                for (int i16 = t10 + 1; i16 <= t(); i16++) {
                    i13 -= k(i16).f2406b;
                }
            }
            a aVar = new a(i11, i13, 0);
            d<a> dVar = this.f2402j;
            int i17 = dVar.f24812d;
            ((Object[]) dVar.f24810b)[i17] = aVar;
            int i18 = dVar.f24813e & (i17 + 1);
            dVar.f24812d = i18;
            if (i18 == dVar.f24811c) {
                dVar.c();
            }
            Object obj = this.f2404l;
            if (obj != null) {
                aVar.f2407c = this.f2405m;
                this.f2404l = null;
            } else {
                aVar.f2407c = ((p.b) this.f2440b).b(i10, true, this.f2439a, false);
                obj = this.f2439a[0];
            }
            Object obj2 = obj;
            if (this.f2402j.g() == 1) {
                this.f2445g = i10;
                this.f2444f = i10;
                this.f2403k = i10;
            } else {
                int i19 = this.f2445g;
                if (i19 < 0) {
                    this.f2445g = i10;
                    this.f2444f = i10;
                } else {
                    this.f2445g = i19 + 1;
                }
            }
            ((p.b) this.f2440b).a(obj2, i10, aVar.f2407c, i11, i12);
            return aVar.f2407c;
        }
        throw new IllegalStateException();
    }

    public abstract boolean s(int i10, boolean z10);

    public final int t() {
        return (this.f2402j.g() + this.f2403k) - 1;
    }

    /* renamed from: u */
    public final a k(int i10) {
        int i11 = i10 - this.f2403k;
        if (i11 < 0 || i11 >= this.f2402j.g()) {
            return null;
        }
        d<a> dVar = this.f2402j;
        dVar.getClass();
        if (i11 < 0 || i11 >= dVar.g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (a) ((Object[]) dVar.f24810b)[dVar.f24813e & (dVar.f24811c + i11)];
    }

    public final boolean v(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (this.f2402j.g() == 0) {
            return false;
        }
        int i14 = this.f2444f;
        if (i14 >= 0) {
            i13 = ((p.b) this.f2440b).d(i14);
            i12 = k(this.f2444f).f2406b;
            i11 = this.f2444f - 1;
        } else {
            i13 = Integer.MAX_VALUE;
            int i15 = this.f2447i;
            i11 = i15 != -1 ? i15 : 0;
            if (i11 <= t()) {
                int i16 = this.f2403k;
                if (i11 >= i16 - 1) {
                    if (i11 < i16) {
                        return false;
                    }
                    i12 = 0;
                }
            }
            this.f2402j.b();
            return false;
        }
        int max = Math.max(p.this.f2474u, this.f2403k);
        while (i11 >= max) {
            a u10 = k(i11);
            int i17 = u10.f2448a;
            int b10 = ((p.b) this.f2440b).b(i11, false, this.f2439a, false);
            if (b10 != u10.f2407c) {
                this.f2402j.f((i11 + 1) - this.f2403k);
                this.f2403k = this.f2444f;
                this.f2404l = this.f2439a[0];
                this.f2405m = b10;
                return false;
            }
            this.f2444f = i11;
            if (this.f2445g < 0) {
                this.f2445g = i11;
            }
            ((p.b) this.f2440b).a(this.f2439a[0], i11, b10, i17, i13 - i12);
            if (!z10 && d(i10)) {
                return true;
            }
            i13 = ((p.b) this.f2440b).d(i11);
            i12 = u10.f2406b;
            if (i17 == 0 && z10) {
                return true;
            }
            i11--;
        }
        return false;
    }

    public final int w(int i10, int i11, int i12) {
        int i13 = this.f2444f;
        if (i13 < 0 || (i13 == this.f2403k && i13 == i10 + 1)) {
            int i14 = this.f2403k;
            a u10 = i14 >= 0 ? k(i14) : null;
            int d10 = ((p.b) this.f2440b).d(this.f2403k);
            a aVar = new a(i11, 0, 0);
            d<a> dVar = this.f2402j;
            int i15 = (dVar.f24811c - 1) & dVar.f24813e;
            dVar.f24811c = i15;
            ((Object[]) dVar.f24810b)[i15] = aVar;
            if (i15 == dVar.f24812d) {
                dVar.c();
            }
            Object obj = this.f2404l;
            if (obj != null) {
                aVar.f2407c = this.f2405m;
                this.f2404l = null;
            } else {
                aVar.f2407c = ((p.b) this.f2440b).b(i10, false, this.f2439a, false);
                obj = this.f2439a[0];
            }
            Object obj2 = obj;
            this.f2444f = i10;
            this.f2403k = i10;
            if (this.f2445g < 0) {
                this.f2445g = i10;
            }
            int i16 = !this.f2441c ? i12 - aVar.f2407c : i12 + aVar.f2407c;
            if (u10 != null) {
                u10.f2406b = d10 - i16;
            }
            ((p.b) this.f2440b).a(obj2, i10, aVar.f2407c, i11, i16);
            return aVar.f2407c;
        }
        throw new IllegalStateException();
    }

    public abstract boolean x(int i10, boolean z10);
}
