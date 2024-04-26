package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class m extends RecyclerView.w {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f3123i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f3124j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f3125k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f3126l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3127m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f3128n;

    /* renamed from: o  reason: collision with root package name */
    public int f3129o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f3130p = 0;

    public m(Context context) {
        this.f3126l = context.getResources().getDisplayMetrics();
    }

    public void d() {
        this.f3130p = 0;
        this.f3129o = 0;
        this.f3125k = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.view.View r11, androidx.recyclerview.widget.RecyclerView.x r12, androidx.recyclerview.widget.RecyclerView.w.a r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f3125k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L_0x0017
            float r12 = r12.x
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x0015
            r9 = 1
            goto L_0x0018
        L_0x0015:
            r9 = -1
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$m r12 = r10.f2918c
            if (r12 == 0) goto L_0x0049
            boolean r4 = r12.g()
            if (r4 != 0) goto L_0x0023
            goto L_0x0049
        L_0x0023:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.n) r4
            int r5 = r12.F(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.I(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.Q()
            int r4 = r12.f2888n
            int r12 = r12.R()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.g(r5, r6, r7, r8, r9)
            goto L_0x004a
        L_0x0049:
            r12 = 0
        L_0x004a:
            android.graphics.PointF r4 = r10.f3125k
            if (r4 == 0) goto L_0x005d
            float r4 = r4.y
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x005b
            r9 = 1
            goto L_0x005e
        L_0x005b:
            r9 = -1
            goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.f2918c
            if (r0 == 0) goto L_0x0090
            boolean r1 = r0.h()
            if (r1 != 0) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r1 = (androidx.recyclerview.widget.RecyclerView.n) r1
            int r2 = r0.J(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.D(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.S()
            int r11 = r0.f2889o
            int r0 = r0.P()
            int r8 = r11 - r0
            r4 = r10
            int r3 = r4.g(r5, r6, r7, r8, r9)
        L_0x0090:
            int r11 = r12 * r12
            int r0 = r3 * r3
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.i(r11)
            if (r11 <= 0) goto L_0x00a8
            int r12 = -r12
            int r0 = -r3
            android.view.animation.DecelerateInterpolator r1 = r10.f3124j
            r13.b(r12, r0, r11, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.e(android.view.View, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }

    public int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int i(int i10) {
        double j10 = (double) j(i10);
        Double.isNaN(j10);
        return (int) Math.ceil(j10 / 0.3356d);
    }

    public int j(int i10) {
        float abs = (float) Math.abs(i10);
        if (!this.f3127m) {
            this.f3128n = h(this.f3126l);
            this.f3127m = true;
        }
        return (int) Math.ceil((double) (abs * this.f3128n));
    }

    public void k(RecyclerView.w.a aVar) {
        PointF a10 = a(this.f2916a);
        if (a10 != null) {
            float f10 = a10.x;
            if (!(f10 == 0.0f && a10.y == 0.0f)) {
                float f11 = a10.y;
                float sqrt = (float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)));
                float f12 = a10.x / sqrt;
                a10.x = f12;
                float f13 = a10.y / sqrt;
                a10.y = f13;
                this.f3125k = a10;
                this.f3129o = (int) (f12 * 10000.0f);
                this.f3130p = (int) (f13 * 10000.0f);
                aVar.b((int) (((float) this.f3129o) * 1.2f), (int) (((float) this.f3130p) * 1.2f), (int) (((float) j(10000)) * 1.2f), this.f3123i);
                return;
            }
        }
        aVar.f2927d = this.f2916a;
        f();
    }
}
