package androidx.leanback.widget;

import androidx.leanback.widget.o;
import androidx.leanback.widget.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import s.d;

/* compiled from: SingleRow */
public class g1 extends o {

    /* renamed from: j  reason: collision with root package name */
    public final o.a f2397j = new o.a(0);

    public g1() {
        p(1);
    }

    public final boolean b(int i10, boolean z10) {
        int i11;
        if (((p.b) this.f2440b).c() == 0) {
            return false;
        }
        if (!z10 && c(i10)) {
            return false;
        }
        int q10 = q();
        boolean z11 = false;
        while (q10 < ((p.b) this.f2440b).c()) {
            int b10 = ((p.b) this.f2440b).b(q10, true, this.f2439a, false);
            if (this.f2444f < 0 || this.f2445g < 0) {
                i11 = this.f2441c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f2444f = q10;
                this.f2445g = q10;
            } else {
                if (this.f2441c) {
                    int i12 = q10 - 1;
                    i11 = (((p.b) this.f2440b).d(i12) - ((p.b) this.f2440b).e(i12)) - this.f2442d;
                } else {
                    int i13 = q10 - 1;
                    i11 = this.f2442d + ((p.b) this.f2440b).e(i13) + ((p.b) this.f2440b).d(i13);
                }
                this.f2445g = q10;
            }
            ((p.b) this.f2440b).a(this.f2439a[0], q10, b10, 0, i11);
            if (z10 || c(i10)) {
                return true;
            }
            q10++;
            z11 = true;
        }
        return z11;
    }

    public void e(int i10, int i11, RecyclerView.m.c cVar) {
        int i12;
        int i13;
        if (!this.f2441c ? i11 >= 0 : i11 <= 0) {
            if (this.f2445g != ((p.b) this.f2440b).c() - 1) {
                i12 = q();
                int e10 = ((p.b) this.f2440b).e(this.f2445g) + this.f2442d;
                int d10 = ((p.b) this.f2440b).d(this.f2445g);
                if (this.f2441c) {
                    e10 = -e10;
                }
                i13 = e10 + d10;
            } else {
                return;
            }
        } else if (this.f2444f != 0) {
            i12 = r();
            i13 = ((p.b) this.f2440b).d(this.f2444f) + (this.f2441c ? this.f2442d : -this.f2442d);
        } else {
            return;
        }
        ((k.b) cVar).a(i12, Math.abs(i13 - i10));
    }

    public final int f(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        if (this.f2441c) {
            return ((p.b) this.f2440b).d(i10);
        }
        return ((p.b) this.f2440b).d(i10) + ((p.b) this.f2440b).e(i10);
    }

    public final int h(boolean z10, int i10, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
        }
        if (this.f2441c) {
            return ((p.b) this.f2440b).d(i10) - ((p.b) this.f2440b).e(i10);
        }
        return ((p.b) this.f2440b).d(i10);
    }

    public final d[] j(int i10, int i11) {
        this.f2446h[0].b();
        this.f2446h[0].a(i10);
        this.f2446h[0].a(i11);
        return this.f2446h;
    }

    public final o.a k(int i10) {
        return this.f2397j;
    }

    public final boolean n(int i10, boolean z10) {
        int i11;
        if (((p.b) this.f2440b).c() == 0) {
            return false;
        }
        if (!z10 && d(i10)) {
            return false;
        }
        int i12 = p.this.f2474u;
        int r10 = r();
        boolean z11 = false;
        while (r10 >= i12) {
            int b10 = ((p.b) this.f2440b).b(r10, false, this.f2439a, false);
            if (this.f2444f < 0 || this.f2445g < 0) {
                i11 = this.f2441c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f2444f = r10;
                this.f2445g = r10;
            } else {
                if (this.f2441c) {
                    i11 = ((p.b) this.f2440b).d(r10 + 1) + this.f2442d + b10;
                } else {
                    i11 = (((p.b) this.f2440b).d(r10 + 1) - this.f2442d) - b10;
                }
                this.f2444f = r10;
            }
            ((p.b) this.f2440b).a(this.f2439a[0], r10, b10, 0, i11);
            if (z10 || d(i10)) {
                return true;
            }
            r10--;
            z11 = true;
        }
        return z11;
    }

    public int q() {
        int i10 = this.f2445g;
        if (i10 >= 0) {
            return i10 + 1;
        }
        int i11 = this.f2447i;
        if (i11 != -1) {
            return Math.min(i11, ((p.b) this.f2440b).c() - 1);
        }
        return 0;
    }

    public int r() {
        int i10 = this.f2444f;
        if (i10 >= 0) {
            return i10 - 1;
        }
        int i11 = this.f2447i;
        if (i11 != -1) {
            return Math.min(i11, ((p.b) this.f2440b).c() - 1);
        }
        return ((p.b) this.f2440b).c() - 1;
    }
}
