package androidx.leanback.widget;

import androidx.recyclerview.widget.RecyclerView;
import s.d;

/* compiled from: Grid */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f2439a = new Object[1];

    /* renamed from: b  reason: collision with root package name */
    public b f2440b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2441c;

    /* renamed from: d  reason: collision with root package name */
    public int f2442d;

    /* renamed from: e  reason: collision with root package name */
    public int f2443e;

    /* renamed from: f  reason: collision with root package name */
    public int f2444f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f2445g = -1;

    /* renamed from: h  reason: collision with root package name */
    public d[] f2446h;

    /* renamed from: i  reason: collision with root package name */
    public int f2447i = -1;

    /* compiled from: Grid */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2448a;

        public a(int i10) {
            this.f2448a = i10;
        }
    }

    /* compiled from: Grid */
    public interface b {
    }

    public boolean a() {
        return b(this.f2441c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public abstract boolean b(int i10, boolean z10);

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r5) {
        /*
            r4 = this;
            int r0 = r4.f2445g
            r1 = 0
            if (r0 >= 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r4.f2441c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r4.i(r3, r2)
            int r2 = r4.f2442d
            int r5 = r5 + r2
            if (r0 > r5) goto L_0x0020
            goto L_0x001f
        L_0x0016:
            int r0 = r4.g(r1, r2)
            int r2 = r4.f2442d
            int r5 = r5 - r2
            if (r0 < r5) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.o.c(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r5) {
        /*
            r4 = this;
            int r0 = r4.f2445g
            r1 = 0
            if (r0 >= 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r4.f2441c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r4.g(r1, r2)
            int r2 = r4.f2442d
            int r5 = r5 - r2
            if (r0 < r5) goto L_0x0020
            goto L_0x001f
        L_0x0016:
            int r0 = r4.i(r3, r2)
            int r2 = r4.f2442d
            int r5 = r5 + r2
            if (r0 > r5) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.o.d(int):boolean");
    }

    public void e(int i10, int i11, RecyclerView.m.c cVar) {
    }

    public abstract int f(boolean z10, int i10, int[] iArr);

    public final int g(boolean z10, int[] iArr) {
        return f(z10, this.f2441c ? this.f2444f : this.f2445g, iArr);
    }

    public abstract int h(boolean z10, int i10, int[] iArr);

    public final int i(boolean z10, int[] iArr) {
        return h(z10, this.f2441c ? this.f2445g : this.f2444f, iArr);
    }

    public abstract d[] j(int i10, int i11);

    public abstract a k(int i10);

    public final int l(int i10) {
        a k10 = k(i10);
        if (k10 == null) {
            return -1;
        }
        return k10.f2448a;
    }

    public void m(int i10) {
        int i11;
        if (i10 >= 0 && (i11 = this.f2445g) >= 0) {
            if (i11 >= i10) {
                this.f2445g = i10 - 1;
            }
            o();
            if (this.f2444f < 0) {
                this.f2447i = i10;
            }
        }
    }

    public abstract boolean n(int i10, boolean z10);

    public final void o() {
        if (this.f2445g < this.f2444f) {
            this.f2445g = -1;
            this.f2444f = -1;
        }
    }

    public void p(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        } else if (this.f2443e != i10) {
            this.f2443e = i10;
            this.f2446h = new d[i10];
            for (int i11 = 0; i11 < this.f2443e; i11++) {
                this.f2446h[i11] = new d();
            }
        }
    }
}
