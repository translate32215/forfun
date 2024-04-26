package s0;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {

    /* renamed from: y  reason: collision with root package name */
    public static final int f24859y = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0239a f24860a;

    /* renamed from: b  reason: collision with root package name */
    public final Interpolator f24861b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f24862c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f24863d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f24864e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    public float[] f24865f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    public int f24866g;

    /* renamed from: h  reason: collision with root package name */
    public int f24867h;

    /* renamed from: i  reason: collision with root package name */
    public float[] f24868i = {0.0f, 0.0f};

    /* renamed from: r  reason: collision with root package name */
    public float[] f24869r = {0.0f, 0.0f};

    /* renamed from: s  reason: collision with root package name */
    public float[] f24870s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: t  reason: collision with root package name */
    public boolean f24871t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f24872u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f24873v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f24874w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f24875x;

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    public static class C0239a {

        /* renamed from: a  reason: collision with root package name */
        public int f24876a;

        /* renamed from: b  reason: collision with root package name */
        public int f24877b;

        /* renamed from: c  reason: collision with root package name */
        public float f24878c;

        /* renamed from: d  reason: collision with root package name */
        public float f24879d;

        /* renamed from: e  reason: collision with root package name */
        public long f24880e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f24881f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f24882g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f24883h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f24884i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f24885j;

        /* renamed from: k  reason: collision with root package name */
        public int f24886k;

        public final float a(long j10) {
            long j11 = this.f24880e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f24884i;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / ((float) this.f24876a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f24885j;
            return (a.b(((float) (j10 - j12)) / ((float) this.f24886k), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* compiled from: AutoScrollHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            View childAt;
            a aVar = a.this;
            if (aVar.f24874w) {
                if (aVar.f24872u) {
                    aVar.f24872u = false;
                    C0239a aVar2 = aVar.f24860a;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f24880e = currentAnimationTimeMillis;
                    aVar2.f24884i = -1;
                    aVar2.f24881f = currentAnimationTimeMillis;
                    aVar2.f24885j = 0.5f;
                    aVar2.f24882g = 0;
                    aVar2.f24883h = 0;
                }
                C0239a aVar3 = a.this.f24860a;
                if ((aVar3.f24884i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f24884i + ((long) aVar3.f24886k)) || !a.this.e()) {
                    a.this.f24874w = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.f24873v) {
                    aVar4.f24873v = false;
                    aVar4.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f24862c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f24881f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f24881f = currentAnimationTimeMillis2;
                    float f10 = ((float) (currentAnimationTimeMillis2 - aVar3.f24881f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10));
                    aVar3.f24882g = (int) (aVar3.f24878c * f10);
                    int i10 = (int) (f10 * aVar3.f24879d);
                    aVar3.f24883h = i10;
                    ListView listView = ((f) a.this).f24890z;
                    if (Build.VERSION.SDK_INT >= 19) {
                        g.b(listView, i10);
                    } else {
                        int firstVisiblePosition = listView.getFirstVisiblePosition();
                        if (!(firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null)) {
                            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i10);
                        }
                    }
                    View view = a.this.f24862c;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0239a aVar = new C0239a();
        this.f24860a = aVar;
        this.f24862c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f24870s;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f24869r;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f24866g = 1;
        float[] fArr3 = this.f24865f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f24864e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f24868i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f24867h = f24859y;
        aVar.f24876a = 500;
        aVar.f24877b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f24864e
            r0 = r0[r4]
            float[] r1 = r3.f24865f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f24861b
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f24861b
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.f24868i
            r6 = r6[r4]
            float[] r0 = r3.f24869r
            r0 = r0[r4]
            float[] r1 = r3.f24870s
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f24866g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                return (!this.f24874w || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final void d() {
        int i10 = 0;
        if (this.f24872u) {
            this.f24874w = false;
            return;
        }
        C0239a aVar = this.f24860a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f24880e);
        int i12 = aVar.f24877b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f24886k = i10;
        aVar.f24885j = aVar.a(currentAnimationTimeMillis);
        aVar.f24884i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r9 = this;
            s0.a$a r0 = r9.f24860a
            float r1 = r0.f24879d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f24878c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            s0.f r4 = (s0.f) r4
            android.widget.ListView r4 = r4.f24890z
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f24875x
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.f24873v = r2
            r5.f24871t = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f24862c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f24862c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            s0.a$a r7 = r5.f24860a
            r7.f24878c = r0
            r7.f24879d = r6
            boolean r6 = r5.f24874w
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.f24863d
            if (r6 != 0) goto L_0x0061
            s0.a$b r6 = new s0.a$b
            r6.<init>()
            r5.f24863d = r6
        L_0x0061:
            r5.f24874w = r2
            r5.f24872u = r2
            boolean r6 = r5.f24871t
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f24867h
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f24862c
            java.lang.Runnable r0 = r5.f24863d
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = o0.c0.f22553a
            o0.c0.d.n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            java.lang.Runnable r6 = r5.f24863d
            r6.run()
        L_0x007d:
            r5.f24871t = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
