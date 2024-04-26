package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;
import java.util.ArrayList;

/* compiled from: BaseCardView */
public class b extends FrameLayout {

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2285z = {16842919};

    /* renamed from: a  reason: collision with root package name */
    public int f2286a;

    /* renamed from: b  reason: collision with root package name */
    public int f2287b;

    /* renamed from: c  reason: collision with root package name */
    public int f2288c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<View> f2289d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<View> f2290e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f2291f;

    /* renamed from: g  reason: collision with root package name */
    public int f2292g;

    /* renamed from: h  reason: collision with root package name */
    public int f2293h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2294i;

    /* renamed from: r  reason: collision with root package name */
    public int f2295r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2296s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2297t;

    /* renamed from: u  reason: collision with root package name */
    public float f2298u;

    /* renamed from: v  reason: collision with root package name */
    public float f2299v;

    /* renamed from: w  reason: collision with root package name */
    public float f2300w;

    /* renamed from: x  reason: collision with root package name */
    public Animation f2301x;

    /* renamed from: y  reason: collision with root package name */
    public final Runnable f2302y = new a();

    /* compiled from: BaseCardView */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
        }
    }

    /* renamed from: androidx.leanback.widget.b$b  reason: collision with other inner class name */
    /* compiled from: BaseCardView */
    public class C0028b implements Animation.AnimationListener {
        public C0028b() {
        }

        public void onAnimationEnd(Animation animation) {
            if (b.this.f2298u == 0.0f) {
                for (int i10 = 0; i10 < b.this.f2291f.size(); i10++) {
                    b.this.f2291f.get(i10).setVisibility(8);
                }
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: BaseCardView */
    public class c extends Animation {
        public c(b bVar) {
        }
    }

    /* compiled from: BaseCardView */
    public final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public float f2305a;

        /* renamed from: b  reason: collision with root package name */
        public float f2306b;

        public d(float f10, float f11) {
            super(b.this);
            this.f2305a = f10;
            this.f2306b = f11 - f10;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            b.this.f2300w = (f10 * this.f2306b) + this.f2305a;
            for (int i10 = 0; i10 < b.this.f2290e.size(); i10++) {
                b.this.f2290e.get(i10).setAlpha(b.this.f2300w);
            }
        }
    }

    /* compiled from: BaseCardView */
    public final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public float f2308a;

        /* renamed from: b  reason: collision with root package name */
        public float f2309b;

        public e(float f10, float f11) {
            super(b.this);
            this.f2308a = f10;
            this.f2309b = f11 - f10;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            b bVar = b.this;
            bVar.f2299v = (f10 * this.f2309b) + this.f2308a;
            bVar.requestLayout();
        }
    }

    /* compiled from: BaseCardView */
    public final class f extends c {

        /* renamed from: a  reason: collision with root package name */
        public float f2311a;

        /* renamed from: b  reason: collision with root package name */
        public float f2312b;

        public f(float f10, float f11) {
            super(b.this);
            this.f2311a = f10;
            this.f2312b = f11 - f10;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            b bVar = b.this;
            bVar.f2298u = (f10 * this.f2312b) + this.f2311a;
            bVar.requestLayout();
        }
    }

    /* JADX INFO: finally extract failed */
    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13530d, i10, 0);
        try {
            this.f2286a = obtainStyledAttributes.getInteger(3, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                setForeground(drawable);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                setBackground(drawable2);
            }
            this.f2287b = obtainStyledAttributes.getInteger(5, 1);
            int integer = obtainStyledAttributes.getInteger(4, 2);
            this.f2288c = integer;
            int i11 = this.f2287b;
            if (integer < i11) {
                this.f2288c = i11;
            }
            this.f2295r = obtainStyledAttributes.getInteger(6, getResources().getInteger(R.integer.lb_card_selected_animation_delay));
            this.f2297t = obtainStyledAttributes.getInteger(7, getResources().getInteger(R.integer.lb_card_selected_animation_duration));
            this.f2296s = obtainStyledAttributes.getInteger(0, getResources().getInteger(R.integer.lb_card_activated_animation_duration));
            obtainStyledAttributes.recycle();
            this.f2294i = true;
            this.f2289d = new ArrayList<>();
            this.f2290e = new ArrayList<>();
            this.f2291f = new ArrayList<>();
            this.f2298u = 0.0f;
            this.f2299v = getFinalInfoVisFraction();
            this.f2300w = getFinalInfoAlpha();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setInfoViewVisibility(boolean z10) {
        int i10 = this.f2286a;
        float f10 = 0.0f;
        if (i10 == 3) {
            if (z10) {
                for (int i11 = 0; i11 < this.f2290e.size(); i11++) {
                    this.f2290e.get(i11).setVisibility(0);
                }
                return;
            }
            for (int i12 = 0; i12 < this.f2290e.size(); i12++) {
                this.f2290e.get(i12).setVisibility(8);
            }
            for (int i13 = 0; i13 < this.f2291f.size(); i13++) {
                this.f2291f.get(i13).setVisibility(8);
            }
            this.f2298u = 0.0f;
        } else if (i10 == 2) {
            if (this.f2287b == 2) {
                b();
                if (z10) {
                    for (int i14 = 0; i14 < this.f2290e.size(); i14++) {
                        this.f2290e.get(i14).setVisibility(0);
                    }
                }
                if (z10) {
                    f10 = 1.0f;
                }
                if (this.f2299v != f10) {
                    e eVar = new e(this.f2299v, f10);
                    this.f2301x = eVar;
                    eVar.setDuration((long) this.f2297t);
                    this.f2301x.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.f2301x.setAnimationListener(new c(this));
                    startAnimation(this.f2301x);
                    return;
                }
                return;
            }
            for (int i15 = 0; i15 < this.f2290e.size(); i15++) {
                this.f2290e.get(i15).setVisibility(z10 ? 0 : 8);
            }
        } else if (i10 == 1) {
            b();
            if (z10) {
                for (int i16 = 0; i16 < this.f2290e.size(); i16++) {
                    this.f2290e.get(i16).setVisibility(0);
                }
            }
            if ((z10 ? 1.0f : 0.0f) != this.f2300w) {
                float f11 = this.f2300w;
                if (z10) {
                    f10 = 1.0f;
                }
                d dVar = new d(f11, f10);
                this.f2301x = dVar;
                dVar.setDuration((long) this.f2296s);
                this.f2301x.setInterpolator(new DecelerateInterpolator());
                this.f2301x.setAnimationListener(new d(this));
                startAnimation(this.f2301x);
            }
        }
    }

    public void a(boolean z10) {
        b();
        int i10 = 0;
        if (z10) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2292g, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i11 = 0;
            for (int i12 = 0; i12 < this.f2291f.size(); i12++) {
                View view = this.f2291f.get(i12);
                view.setVisibility(0);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i11 = Math.max(i11, view.getMeasuredHeight());
            }
            i10 = i11;
        }
        f fVar = new f(this.f2298u, z10 ? (float) i10 : 0.0f);
        this.f2301x = fVar;
        fVar.setDuration((long) this.f2297t);
        this.f2301x.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f2301x.setAnimationListener(new C0028b());
        startAnimation(this.f2301x);
    }

    public void b() {
        Animation animation = this.f2301x;
        if (animation != null) {
            animation.cancel();
            this.f2301x = null;
            clearAnimation();
        }
    }

    public final boolean c() {
        return this.f2286a == 3;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    public final boolean d() {
        return this.f2286a != 0;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getCardType() {
        return this.f2286a;
    }

    @Deprecated
    public int getExtraVisibility() {
        return this.f2288c;
    }

    public final float getFinalInfoAlpha() {
        return (this.f2286a == 1 && this.f2287b == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public final float getFinalInfoVisFraction() {
        return (this.f2286a == 2 && this.f2287b == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public int getInfoVisibility() {
        return this.f2287b;
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10);
        int length = onCreateDrawableState.length;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            if (onCreateDrawableState[i11] == 16842919) {
                z10 = true;
            }
            if (onCreateDrawableState[i11] == 16842910) {
                z11 = true;
            }
        }
        if (z10 && z11) {
            return View.PRESSED_ENABLED_STATE_SET;
        }
        if (z10) {
            return f2285z;
        }
        if (z11) {
            return View.ENABLED_STATE_SET;
        }
        return View.EMPTY_STATE_SET;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2302y);
        b();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float paddingTop = (float) getPaddingTop();
        for (int i14 = 0; i14 < this.f2289d.size(); i14++) {
            View view = this.f2289d.get(i14);
            if (view.getVisibility() != 8) {
                view.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f2292g, (int) (((float) view.getMeasuredHeight()) + paddingTop));
                paddingTop += (float) view.getMeasuredHeight();
            }
        }
        if (d()) {
            float f10 = 0.0f;
            for (int i15 = 0; i15 < this.f2290e.size(); i15++) {
                f10 += (float) this.f2290e.get(i15).getMeasuredHeight();
            }
            int i16 = this.f2286a;
            if (i16 == 1) {
                paddingTop -= f10;
                if (paddingTop < 0.0f) {
                    paddingTop = 0.0f;
                }
            } else if (i16 != 2) {
                paddingTop -= this.f2298u;
            } else if (this.f2287b == 2) {
                f10 *= this.f2299v;
            }
            for (int i17 = 0; i17 < this.f2290e.size(); i17++) {
                View view2 = this.f2290e.get(i17);
                if (view2.getVisibility() != 8) {
                    int measuredHeight = view2.getMeasuredHeight();
                    if (((float) measuredHeight) > f10) {
                        measuredHeight = (int) f10;
                    }
                    float f11 = (float) measuredHeight;
                    paddingTop += f11;
                    view2.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f2292g, (int) paddingTop);
                    f10 -= f11;
                    if (f10 <= 0.0f) {
                        break;
                    }
                }
            }
            if (c()) {
                for (int i18 = 0; i18 < this.f2291f.size(); i18++) {
                    View view3 = this.f2291f.get(i18);
                    if (view3.getVisibility() != 8) {
                        view3.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f2292g, (int) (((float) view3.getMeasuredHeight()) + paddingTop));
                        paddingTop += (float) view3.getMeasuredHeight();
                    }
                }
            }
        }
        onSizeChanged(0, 0, i12 - i10, i13 - i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r0.f2299v > 0.0f) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0097 A[EDGE_INSN: B:84:0x0097->B:41:0x0097 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = 0
            r0.f2292g = r1
            r0.f2293h = r1
            java.util.ArrayList<android.view.View> r2 = r0.f2289d
            r2.clear()
            java.util.ArrayList<android.view.View> r2 = r0.f2290e
            r2.clear()
            java.util.ArrayList<android.view.View> r2 = r0.f2291f
            r2.clear()
            int r2 = r15.getChildCount()
            boolean r3 = r15.d()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0047
            int r3 = r0.f2287b
            if (r3 == 0) goto L_0x0042
            if (r3 == r6) goto L_0x003d
            if (r3 == r5) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            int r3 = r0.f2286a
            if (r3 != r5) goto L_0x0038
            float r3 = r0.f2299v
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
            goto L_0x0042
        L_0x0036:
            r3 = 0
            goto L_0x0043
        L_0x0038:
            boolean r3 = r15.isSelected()
            goto L_0x0043
        L_0x003d:
            boolean r3 = r15.isActivated()
            goto L_0x0043
        L_0x0042:
            r3 = 1
        L_0x0043:
            if (r3 == 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            boolean r7 = r15.c()
            if (r7 == 0) goto L_0x0056
            float r7 = r0.f2298u
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            r7 = 1
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            r8 = 0
        L_0x0058:
            r9 = 8
            if (r8 >= r2) goto L_0x0097
            android.view.View r10 = r15.getChildAt(r8)
            if (r10 != 0) goto L_0x0063
            goto L_0x0094
        L_0x0063:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.leanback.widget.b$g r11 = (androidx.leanback.widget.b.g) r11
            int r11 = r11.f2314a
            if (r11 != r6) goto L_0x007e
            float r11 = r0.f2300w
            r10.setAlpha(r11)
            java.util.ArrayList<android.view.View> r11 = r0.f2290e
            r11.add(r10)
            if (r3 == 0) goto L_0x007a
            r9 = 0
        L_0x007a:
            r10.setVisibility(r9)
            goto L_0x0094
        L_0x007e:
            if (r11 != r5) goto L_0x008c
            java.util.ArrayList<android.view.View> r11 = r0.f2291f
            r11.add(r10)
            if (r7 == 0) goto L_0x0088
            r9 = 0
        L_0x0088:
            r10.setVisibility(r9)
            goto L_0x0094
        L_0x008c:
            java.util.ArrayList<android.view.View> r9 = r0.f2289d
            r9.add(r10)
            r10.setVisibility(r1)
        L_0x0094:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x0097:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r3 = 0
            r7 = 0
            r8 = 0
        L_0x009e:
            java.util.ArrayList<android.view.View> r10 = r0.f2289d
            int r10 = r10.size()
            if (r3 >= r10) goto L_0x00d3
            java.util.ArrayList<android.view.View> r10 = r0.f2289d
            java.lang.Object r10 = r10.get(r3)
            android.view.View r10 = (android.view.View) r10
            int r11 = r10.getVisibility()
            if (r11 == r9) goto L_0x00d0
            r15.measureChild(r10, r2, r2)
            int r11 = r0.f2292g
            int r12 = r10.getMeasuredWidth()
            int r11 = java.lang.Math.max(r11, r12)
            r0.f2292g = r11
            int r11 = r10.getMeasuredHeight()
            int r7 = r7 + r11
            int r10 = r10.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r10)
        L_0x00d0:
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00d3:
            int r3 = r0.f2292g
            int r3 = r3 / r5
            float r3 = (float) r3
            r15.setPivotX(r3)
            int r3 = r7 / 2
            float r3 = (float) r3
            r15.setPivotY(r3)
            int r3 = r0.f2292g
            r10 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10)
            boolean r10 = r15.d()
            if (r10 == 0) goto L_0x014f
            r10 = 0
            r11 = 0
        L_0x00f0:
            java.util.ArrayList<android.view.View> r12 = r0.f2290e
            int r12 = r12.size()
            if (r10 >= r12) goto L_0x011e
            java.util.ArrayList<android.view.View> r12 = r0.f2290e
            java.lang.Object r12 = r12.get(r10)
            android.view.View r12 = (android.view.View) r12
            int r13 = r12.getVisibility()
            if (r13 == r9) goto L_0x011b
            r15.measureChild(r12, r3, r2)
            int r13 = r0.f2286a
            if (r13 == r6) goto L_0x0113
            int r13 = r12.getMeasuredHeight()
            int r13 = r13 + r11
            r11 = r13
        L_0x0113:
            int r12 = r12.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r12)
        L_0x011b:
            int r10 = r10 + 1
            goto L_0x00f0
        L_0x011e:
            boolean r10 = r15.c()
            if (r10 == 0) goto L_0x0150
            r10 = 0
            r12 = 0
        L_0x0126:
            java.util.ArrayList<android.view.View> r13 = r0.f2291f
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x0151
            java.util.ArrayList<android.view.View> r13 = r0.f2291f
            java.lang.Object r13 = r13.get(r10)
            android.view.View r13 = (android.view.View) r13
            int r14 = r13.getVisibility()
            if (r14 == r9) goto L_0x014c
            r15.measureChild(r13, r3, r2)
            int r14 = r13.getMeasuredHeight()
            int r12 = r12 + r14
            int r13 = r13.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r13)
        L_0x014c:
            int r10 = r10 + 1
            goto L_0x0126
        L_0x014f:
            r11 = 0
        L_0x0150:
            r12 = 0
        L_0x0151:
            boolean r2 = r15.d()
            if (r2 == 0) goto L_0x015c
            int r2 = r0.f2287b
            if (r2 != r5) goto L_0x015c
            r1 = 1
        L_0x015c:
            float r2 = (float) r7
            float r3 = (float) r11
            if (r1 == 0) goto L_0x0164
            float r5 = r0.f2299v
            float r3 = r3 * r5
        L_0x0164:
            float r2 = r2 + r3
            float r3 = (float) r12
            float r2 = r2 + r3
            if (r1 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            float r4 = r0.f2298u
        L_0x016c:
            float r2 = r2 - r4
            int r1 = (int) r2
            r0.f2293h = r1
            int r1 = r0.f2292g
            int r2 = r15.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r15.getPaddingRight()
            int r1 = r1 + r2
            r2 = r16
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r8)
            int r2 = r0.f2293h
            int r3 = r15.getPaddingTop()
            int r3 = r3 + r2
            int r2 = r15.getPaddingBottom()
            int r2 = r2 + r3
            int r3 = r8 << 16
            r4 = r17
            int r2 = android.view.View.resolveSizeAndState(r2, r4, r3)
            r15.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.b.onMeasure(int, int):void");
    }

    public void setActivated(boolean z10) {
        if (z10 != isActivated()) {
            super.setActivated(z10);
            isActivated();
            if (d()) {
                int i10 = this.f2287b;
                boolean z11 = true;
                if (i10 == 1) {
                    if (i10 != 0) {
                        z11 = i10 != 1 ? i10 != 2 ? false : isSelected() : isActivated();
                    }
                    setInfoViewVisibility(z11);
                }
            }
        }
    }

    public void setCardType(int i10) {
        if (this.f2286a != i10) {
            if (i10 < 0 || i10 >= 4) {
                Log.e("BaseCardView", "Invalid card type specified: " + i10 + ". Defaulting to type CARD_TYPE_MAIN_ONLY.");
                this.f2286a = 0;
            } else {
                this.f2286a = i10;
            }
            requestLayout();
        }
    }

    @Deprecated
    public void setExtraVisibility(int i10) {
        if (this.f2288c != i10) {
            this.f2288c = i10;
        }
    }

    public void setInfoVisibility(int i10) {
        if (this.f2287b != i10) {
            b();
            this.f2287b = i10;
            this.f2299v = getFinalInfoVisFraction();
            requestLayout();
            float finalInfoAlpha = getFinalInfoAlpha();
            if (finalInfoAlpha != this.f2300w) {
                this.f2300w = finalInfoAlpha;
                for (int i11 = 0; i11 < this.f2290e.size(); i11++) {
                    this.f2290e.get(i11).setAlpha(this.f2300w);
                }
            }
        }
    }

    public void setSelected(boolean z10) {
        if (z10 != isSelected()) {
            super.setSelected(z10);
            boolean isSelected = isSelected();
            removeCallbacks(this.f2302y);
            if (this.f2286a == 3) {
                if (!isSelected) {
                    a(false);
                } else if (!this.f2294i) {
                    post(this.f2302y);
                    this.f2294i = true;
                } else {
                    postDelayed(this.f2302y, (long) this.f2295r);
                }
            } else if (this.f2287b == 2) {
                setInfoViewVisibility(isSelected);
            }
        }
    }

    public void setSelectedAnimationDelayed(boolean z10) {
        this.f2294i = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams m13generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams m14generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        return new g(layoutParams);
    }

    /* compiled from: BaseCardView */
    public static class g extends FrameLayout.LayoutParams {
        @ViewDebug.ExportedProperty(category = "layout", mapping = {@ViewDebug.IntToString(from = 0, to = "MAIN"), @ViewDebug.IntToString(from = 1, to = "INFO"), @ViewDebug.IntToString(from = 2, to = "EXTRA")})

        /* renamed from: a  reason: collision with root package name */
        public int f2314a = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.a.f13531e);
            this.f2314a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public g(int i10, int i11) {
            super(i10, i11);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(g gVar) {
            super(gVar);
            this.f2314a = gVar.f2314a;
        }
    }
}
