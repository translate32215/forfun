package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import h.g;

/* compiled from: DrawableContainer */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f18714u = 0;

    /* renamed from: a  reason: collision with root package name */
    public C0153c f18715a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f18716b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f18717c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f18718d;

    /* renamed from: e  reason: collision with root package name */
    public int f18719e = 255;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18720f;

    /* renamed from: g  reason: collision with root package name */
    public int f18721g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18722h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f18723i;

    /* renamed from: r  reason: collision with root package name */
    public long f18724r;

    /* renamed from: s  reason: collision with root package name */
    public long f18725s;

    /* renamed from: t  reason: collision with root package name */
    public b f18726t;

    /* compiled from: DrawableContainer */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.a(true);
            c.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer */
    public static class b implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        public Drawable.Callback f18728a;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f18728a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f18728a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: h.c$c  reason: collision with other inner class name */
    /* compiled from: DrawableContainer */
    public static abstract class C0153c extends Drawable.ConstantState {
        public int A = 0;
        public int B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final c f18729a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f18730b;

        /* renamed from: c  reason: collision with root package name */
        public int f18731c;

        /* renamed from: d  reason: collision with root package name */
        public int f18732d;

        /* renamed from: e  reason: collision with root package name */
        public int f18733e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f18734f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f18735g;

        /* renamed from: h  reason: collision with root package name */
        public int f18736h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18737i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f18738j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f18739k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f18740l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f18741m;

        /* renamed from: n  reason: collision with root package name */
        public int f18742n;

        /* renamed from: o  reason: collision with root package name */
        public int f18743o;

        /* renamed from: p  reason: collision with root package name */
        public int f18744p;

        /* renamed from: q  reason: collision with root package name */
        public int f18745q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f18746r;

        /* renamed from: s  reason: collision with root package name */
        public int f18747s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f18748t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f18749u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f18750v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f18751w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f18752x = true;

        /* renamed from: y  reason: collision with root package name */
        public boolean f18753y;

        /* renamed from: z  reason: collision with root package name */
        public int f18754z;

        public C0153c(C0153c cVar, c cVar2, Resources resources) {
            Resources resources2;
            this.f18729a = cVar2;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f18730b : null;
            }
            this.f18730b = resources2;
            int i10 = cVar != null ? cVar.f18731c : 0;
            int i11 = c.f18714u;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f18731c = i10;
            if (cVar != null) {
                this.f18732d = cVar.f18732d;
                this.f18733e = cVar.f18733e;
                this.f18750v = true;
                this.f18751w = true;
                this.f18737i = cVar.f18737i;
                this.f18740l = cVar.f18740l;
                this.f18752x = cVar.f18752x;
                this.f18753y = cVar.f18753y;
                this.f18754z = cVar.f18754z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f18731c == i10) {
                    if (cVar.f18738j) {
                        this.f18739k = cVar.f18739k != null ? new Rect(cVar.f18739k) : rect;
                        this.f18738j = true;
                    }
                    if (cVar.f18741m) {
                        this.f18742n = cVar.f18742n;
                        this.f18743o = cVar.f18743o;
                        this.f18744p = cVar.f18744p;
                        this.f18745q = cVar.f18745q;
                        this.f18741m = true;
                    }
                }
                if (cVar.f18746r) {
                    this.f18747s = cVar.f18747s;
                    this.f18746r = true;
                }
                if (cVar.f18748t) {
                    this.f18749u = cVar.f18749u;
                    this.f18748t = true;
                }
                Drawable[] drawableArr = cVar.f18735g;
                this.f18735g = new Drawable[drawableArr.length];
                this.f18736h = cVar.f18736h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f18734f;
                if (sparseArray != null) {
                    this.f18734f = sparseArray.clone();
                } else {
                    this.f18734f = new SparseArray<>(this.f18736h);
                }
                int i12 = this.f18736h;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (drawableArr[i13] != null) {
                        Drawable.ConstantState constantState = drawableArr[i13].getConstantState();
                        if (constantState != null) {
                            this.f18734f.put(i13, constantState);
                        } else {
                            this.f18735g[i13] = drawableArr[i13];
                        }
                    }
                }
                return;
            }
            this.f18735g = new Drawable[10];
            this.f18736h = 0;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f18736h;
            if (i10 >= this.f18735g.length) {
                int i11 = i10 + 10;
                g.a aVar = (g.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f18735g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f18735g = drawableArr;
                int[][] iArr = new int[i11][];
                System.arraycopy(aVar.J, 0, iArr, 0, i10);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f18729a);
            this.f18735g[i10] = drawable;
            this.f18736h++;
            this.f18733e = drawable.getChangingConfigurations() | this.f18733e;
            this.f18746r = false;
            this.f18748t = false;
            this.f18739k = null;
            this.f18738j = false;
            this.f18741m = false;
            this.f18750v = false;
            return i10;
        }

        public void b() {
            this.f18741m = true;
            c();
            int i10 = this.f18736h;
            Drawable[] drawableArr = this.f18735g;
            this.f18743o = -1;
            this.f18742n = -1;
            this.f18745q = 0;
            this.f18744p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f18742n) {
                    this.f18742n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f18743o) {
                    this.f18743o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f18744p) {
                    this.f18744p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f18745q) {
                    this.f18745q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f18734f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f18734f.keyAt(i10);
                    Drawable[] drawableArr = this.f18735g;
                    Drawable newDrawable = this.f18734f.valueAt(i10).newDrawable(this.f18730b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        androidx.core.graphics.drawable.a.j(newDrawable, this.f18754z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f18729a);
                    drawableArr[keyAt] = mutate;
                }
                this.f18734f = null;
            }
        }

        public boolean canApplyTheme() {
            int i10 = this.f18736h;
            Drawable[] drawableArr = this.f18735g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f18734f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f18735g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f18734f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f18734f.valueAt(indexOfKey).newDrawable(this.f18730b);
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.j(newDrawable, this.f18754z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f18729a);
            this.f18735g[i10] = mutate;
            this.f18734f.removeAt(indexOfKey);
            if (this.f18734f.size() == 0) {
                this.f18734f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f18730b = resources;
                int i10 = c.f18714u;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = this.f18731c;
                this.f18731c = i11;
                if (i12 != i11) {
                    this.f18741m = false;
                    this.f18738j = false;
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f18732d | this.f18733e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f18720f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f18717c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f18724r
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f18719e
            r3.setAlpha(r9)
            r13.f18724r = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.c$c r9 = r13.f18715a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f18719e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f18724r = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f18718d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f18725s
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f18718d = r0
            r13.f18725s = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.c$c r4 = r13.f18715a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f18719e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f18725s = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f18723i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C0153c cVar = this.f18715a;
        cVar.getClass();
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f18736h;
            Drawable[] drawableArr = cVar.f18735g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null && androidx.core.graphics.drawable.a.b(drawableArr[i11])) {
                    androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                    cVar.f18733e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public C0153c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f18726t == null) {
            this.f18726t = new b();
        }
        b bVar = this.f18726t;
        bVar.f18728a = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f18715a.A <= 0 && this.f18720f) {
                drawable.setAlpha(this.f18719e);
            }
            C0153c cVar = this.f18715a;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.l(drawable, cVar.F);
                }
                C0153c cVar2 = this.f18715a;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.m(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18715a.f18752x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                androidx.core.graphics.drawable.a.j(drawable, androidx.core.graphics.drawable.a.e(this));
            }
            if (i10 >= 19) {
                androidx.core.graphics.drawable.a.g(drawable, this.f18715a.C);
            }
            Rect rect = this.f18716b;
            if (i10 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.i(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f18726t;
            Drawable.Callback callback = bVar2.f18728a;
            bVar2.f18728a = null;
            drawable.setCallback(callback);
        }
    }

    public boolean canApplyTheme() {
        return this.f18715a.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f18721g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.c$c r0 = r9.f18715a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f18718d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f18717c
            if (r0 == 0) goto L_0x0029
            r9.f18718d = r0
            h.c$c r0 = r9.f18715a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f18725s = r0
            goto L_0x0035
        L_0x0029:
            r9.f18718d = r4
            r9.f18725s = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f18717c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.c$c r0 = r9.f18715a
            int r1 = r0.f18736h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f18717c = r0
            r9.f18721g = r10
            if (r0 == 0) goto L_0x005a
            h.c$c r10 = r9.f18715a
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f18724r = r2
        L_0x0051:
            r9.c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f18717c = r4
            r10 = -1
            r9.f18721g = r10
        L_0x005a:
            long r0 = r9.f18724r
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f18725s
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f18723i
            if (r0 != 0) goto L_0x0073
            h.c$a r0 = new h.c$a
            r0.<init>()
            r9.f18723i = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18718d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(C0153c cVar) {
        throw null;
    }

    public int getAlpha() {
        return this.f18719e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18715a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        C0153c cVar = this.f18715a;
        boolean z10 = false;
        if (!cVar.f18750v) {
            cVar.c();
            cVar.f18750v = true;
            int i10 = cVar.f18736h;
            Drawable[] drawableArr = cVar.f18735g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    cVar.f18751w = true;
                    z10 = true;
                    break;
                } else if (drawableArr[i11].getConstantState() == null) {
                    cVar.f18751w = false;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            z10 = cVar.f18751w;
        }
        if (!z10) {
            return null;
        }
        this.f18715a.f18732d = getChangingConfigurations();
        return this.f18715a;
    }

    public Drawable getCurrent() {
        return this.f18717c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18716b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C0153c cVar = this.f18715a;
        if (cVar.f18740l) {
            if (!cVar.f18741m) {
                cVar.b();
            }
            return cVar.f18743o;
        }
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        C0153c cVar = this.f18715a;
        if (cVar.f18740l) {
            if (!cVar.f18741m) {
                cVar.b();
            }
            return cVar.f18742n;
        }
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        C0153c cVar = this.f18715a;
        if (cVar.f18740l) {
            if (!cVar.f18741m) {
                cVar.b();
            }
            return cVar.f18745q;
        }
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        C0153c cVar = this.f18715a;
        if (cVar.f18740l) {
            if (!cVar.f18741m) {
                cVar.b();
            }
            return cVar.f18744p;
        }
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f18717c;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0153c cVar = this.f18715a;
        if (cVar.f18746r) {
            return cVar.f18747s;
        }
        cVar.c();
        int i11 = cVar.f18736h;
        Drawable[] drawableArr = cVar.f18735g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        cVar.f18747s = i10;
        cVar.f18746r = true;
        return i10;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z10;
        C0153c cVar = this.f18715a;
        Rect rect2 = null;
        boolean z11 = true;
        if (!cVar.f18737i) {
            Rect rect3 = cVar.f18739k;
            if (rect3 != null || cVar.f18738j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f18736h;
                Drawable[] drawableArr = cVar.f18735g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f18738j = true;
                cVar.f18739k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z10 = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f18717c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (!this.f18715a.C || androidx.core.graphics.drawable.a.e(this) != 1) {
            z11 = false;
        }
        if (z11) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0153c cVar = this.f18715a;
        if (cVar != null) {
            cVar.f18746r = false;
            cVar.f18748t = false;
        }
        if (drawable == this.f18717c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f18715a.C;
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f18718d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18718d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f18717c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18720f) {
                this.f18717c.setAlpha(this.f18719e);
            }
        }
        if (this.f18725s != 0) {
            this.f18725s = 0;
            z10 = true;
        }
        if (this.f18724r != 0) {
            this.f18724r = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f18722h && super.mutate() == this) {
            C0153c b10 = b();
            b10.e();
            e(b10);
            this.f18722h = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18718d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18717c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        C0153c cVar = this.f18715a;
        int i11 = this.f18721g;
        int i12 = cVar.f18736h;
        Drawable[] drawableArr = cVar.f18735g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            if (drawableArr[i13] != null) {
                boolean j10 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.j(drawableArr[i13], i10) : false;
                if (i13 == i11) {
                    z10 = j10;
                }
            }
        }
        cVar.f18754z = i10;
        return z10;
    }

    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f18718d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f18717c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18718d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f18717c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f18717c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (!this.f18720f || this.f18719e != i10) {
            this.f18720f = true;
            this.f18719e = i10;
            Drawable drawable = this.f18717c;
            if (drawable == null) {
                return;
            }
            if (this.f18724r == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z10) {
        C0153c cVar = this.f18715a;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f18717c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.g(drawable, z10);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0153c cVar = this.f18715a;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f18717c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z10) {
        C0153c cVar = this.f18715a;
        if (cVar.f18752x != z10) {
            cVar.f18752x = z10;
            Drawable drawable = this.f18717c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.h(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f18716b;
        if (rect == null) {
            this.f18716b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f18717c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, i10, i11, i12, i13);
        }
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        C0153c cVar = this.f18715a;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.l(this.f18717c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0153c cVar = this.f18715a;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.m(this.f18717c, mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f18718d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f18717c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f18717c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
