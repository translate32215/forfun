package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
public final class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<k> f3099e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static Comparator<c> f3100f = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RecyclerView> f3101a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f3102b;

    /* renamed from: c  reason: collision with root package name */
    public long f3103c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c> f3104d = new ArrayList<>();

    /* compiled from: GapWorker */
    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.k$c r7 = (androidx.recyclerview.widget.k.c) r7
                androidx.recyclerview.widget.k$c r8 = (androidx.recyclerview.widget.k.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f3112d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f3112d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.f3109a
                boolean r3 = r8.f3109a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.f3110b
                int r1 = r7.f3110b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.f3111c
                int r8 = r8.f3111c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f3105a;

        /* renamed from: b  reason: collision with root package name */
        public int f3106b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f3107c;

        /* renamed from: d  reason: collision with root package name */
        public int f3108d;

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f3108d * 2;
                int[] iArr = this.f3107c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3107c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f3107c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3107c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f3108d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b(RecyclerView recyclerView, boolean z10) {
            this.f3108d = 0;
            int[] iArr = this.f3107c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f2828u;
            if (recyclerView.f2826t != null && mVar != null && mVar.f2883i) {
                if (z10) {
                    if (!recyclerView.f2802d.g()) {
                        mVar.l(recyclerView.f2826t.b(), this);
                    }
                } else if (!recyclerView.N()) {
                    mVar.k(this.f3105a, this.f3106b, recyclerView.f2825s0, this);
                }
                int i10 = this.f3108d;
                if (i10 > mVar.f2884j) {
                    mVar.f2884j = i10;
                    mVar.f2885k = z10;
                    recyclerView.f2798b.n();
                }
            }
        }

        public boolean c(int i10) {
            if (this.f3107c != null) {
                int i11 = this.f3108d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3107c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: GapWorker */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3109a;

        /* renamed from: b  reason: collision with root package name */
        public int f3110b;

        /* renamed from: c  reason: collision with root package name */
        public int f3111c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f3112d;

        /* renamed from: e  reason: collision with root package name */
        public int f3113e;
    }

    public void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3102b == 0) {
            this.f3102b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f2823r0;
        bVar.f3105a = i10;
        bVar.f3106b = i11;
    }

    public void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f3101a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f3101a.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f2823r0.b(recyclerView3, false);
                i10 += recyclerView3.f2823r0.f3108d;
            }
        }
        this.f3104d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f3101a.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f2823r0;
                int abs = Math.abs(bVar.f3106b) + Math.abs(bVar.f3105a);
                for (int i14 = 0; i14 < bVar.f3108d * 2; i14 += 2) {
                    if (i12 >= this.f3104d.size()) {
                        cVar2 = new c();
                        this.f3104d.add(cVar2);
                    } else {
                        cVar2 = this.f3104d.get(i12);
                    }
                    int[] iArr = bVar.f3107c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f3109a = i15 <= abs;
                    cVar2.f3110b = abs;
                    cVar2.f3111c = i15;
                    cVar2.f3112d = recyclerView4;
                    cVar2.f3113e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3104d, f3100f);
        for (int i16 = 0; i16 < this.f3104d.size() && (recyclerView = cVar.f3112d) != null; i16++) {
            RecyclerView.a0 c10 = c(recyclerView, (cVar = this.f3104d.get(i16)).f3113e, cVar.f3109a ? Long.MAX_VALUE : j10);
            if (!(c10 == null || c10.f2843b == null || !c10.l() || c10.m() || (recyclerView2 = (RecyclerView) c10.f2843b.get()) == null)) {
                if (recyclerView2.K && recyclerView2.f2804e.h() != 0) {
                    recyclerView2.a0();
                }
                b bVar2 = recyclerView2.f2823r0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f3108d != 0) {
                    try {
                        k0.k.a("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f2825s0;
                        RecyclerView.e eVar = recyclerView2.f2826t;
                        xVar.f2934d = 1;
                        xVar.f2935e = eVar.b();
                        xVar.f2937g = false;
                        xVar.f2938h = false;
                        xVar.f2939i = false;
                        for (int i17 = 0; i17 < bVar2.f3108d * 2; i17 += 2) {
                            c(recyclerView2, bVar2.f3107c[i17], j10);
                        }
                    } finally {
                        k0.k.b();
                    }
                }
            }
            cVar.f3109a = false;
            cVar.f3110b = 0;
            cVar.f3111c = 0;
            cVar.f3112d = null;
            cVar.f3113e = 0;
        }
    }

    public final RecyclerView.a0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.f2804e.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z10 = false;
                break;
            }
            RecyclerView.a0 L = RecyclerView.L(recyclerView.f2804e.g(i11));
            if (L.f2844c == i10 && !L.m()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f2798b;
        try {
            recyclerView.T();
            RecyclerView.a0 l10 = sVar.l(i10, false, j10);
            if (l10 != null) {
                if (!l10.l() || l10.m()) {
                    sVar.a(l10, false);
                } else {
                    sVar.i(l10.f2842a);
                }
            }
            return l10;
        } finally {
            recyclerView.U(false);
        }
    }

    public void run() {
        try {
            k0.k.a("RV Prefetch");
            if (!this.f3101a.isEmpty()) {
                int size = this.f3101a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f3101a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f3103c);
                    this.f3102b = 0;
                    k0.k.b();
                }
            }
        } finally {
            this.f3102b = 0;
            k0.k.b();
        }
    }
}
