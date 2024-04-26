package com.google.android.material.tabs;

import ad.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.startapp.startappsdk.R;
import e.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l9.r;
import l9.u;
import o0.c0;
import o0.w;
import p0.c;
import w8.c;

@ViewPager.d
public class TabLayout extends HorizontalScrollView {

    /* renamed from: g0  reason: collision with root package name */
    public static final n0.d<g> f9403g0 = new n0.e(16);
    public final int A;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K = -1;
    public int L;
    public boolean M;
    public a N;
    public c O;
    public final ArrayList<c> P = new ArrayList<>();
    public c Q;
    public ValueAnimator R;
    public ViewPager S;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<g> f9404a = new ArrayList<>();

    /* renamed from: a0  reason: collision with root package name */
    public f2.a f9405a0;

    /* renamed from: b  reason: collision with root package name */
    public g f9406b;

    /* renamed from: b0  reason: collision with root package name */
    public DataSetObserver f9407b0;

    /* renamed from: c  reason: collision with root package name */
    public final f f9408c;

    /* renamed from: c0  reason: collision with root package name */
    public h f9409c0;

    /* renamed from: d  reason: collision with root package name */
    public int f9410d;

    /* renamed from: d0  reason: collision with root package name */
    public b f9411d0;

    /* renamed from: e  reason: collision with root package name */
    public int f9412e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f9413e0;

    /* renamed from: f  reason: collision with root package name */
    public int f9414f;

    /* renamed from: f0  reason: collision with root package name */
    public final n0.d<i> f9415f0 = new t.d(12, 1);

    /* renamed from: g  reason: collision with root package name */
    public int f9416g;

    /* renamed from: h  reason: collision with root package name */
    public int f9417h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f9418i;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f9419r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f9420s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f9421t = new GradientDrawable();

    /* renamed from: u  reason: collision with root package name */
    public int f9422u = 0;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuff.Mode f9423v;

    /* renamed from: w  reason: collision with root package name */
    public float f9424w;

    /* renamed from: x  reason: collision with root package name */
    public float f9425x;

    /* renamed from: y  reason: collision with root package name */
    public final int f9426y;

    /* renamed from: z  reason: collision with root package name */
    public int f9427z = Integer.MAX_VALUE;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9429a;

        public b() {
        }

        public void a(ViewPager viewPager, f2.a aVar, f2.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.S == viewPager) {
                tabLayout.l(aVar2, this.f9429a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public void onChanged() {
            TabLayout.this.j();
        }

        public void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f9432f = 0;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f9433a;

        /* renamed from: b  reason: collision with root package name */
        public int f9434b = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f9435c;

        /* renamed from: d  reason: collision with root package name */
        public int f9436d = -1;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f9438a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f9439b;

            public a(View view, View view2) {
                this.f9438a = view;
                this.f9439b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.f9438a, this.f9439b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9441a;

            public b(int i10) {
                this.f9441a = i10;
            }

            public void onAnimationEnd(Animator animator) {
                f.this.f9434b = this.f9441a;
            }

            public void onAnimationStart(Animator animator) {
                f.this.f9434b = this.f9441a;
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f9434b);
            TabLayout tabLayout = TabLayout.this;
            a aVar = tabLayout.N;
            Drawable drawable = tabLayout.f9421t;
            aVar.getClass();
            RectF a10 = a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        }

        public void b(int i10) {
            Rect bounds = TabLayout.this.f9421t.getBounds();
            TabLayout.this.f9421t.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.N.b(tabLayout, view, view2, f10, tabLayout.f9421t);
            } else {
                Drawable drawable = TabLayout.this.f9421t;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f9421t.getBounds().bottom);
            }
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }

        public final void d(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f9434b);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f9433a = valueAnimator;
                valueAnimator.setInterpolator(u8.a.f26149b);
                valueAnimator.setDuration((long) i11);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i10));
                valueAnimator.start();
                return;
            }
            this.f9433a.removeAllUpdateListeners();
            this.f9433a.addUpdateListener(aVar);
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.f9421t.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f9421t.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.G;
            int i11 = 0;
            if (i10 == 0) {
                i11 = getHeight() - height;
                height = getHeight();
            } else if (i10 == 1) {
                i11 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f9421t.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f9421t.getBounds();
                TabLayout.this.f9421t.setBounds(bounds.left, i11, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f9421t;
                if (tabLayout.f9422u != 0) {
                    drawable = androidx.core.graphics.drawable.a.n(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f9422u, PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.k(drawable, TabLayout.this.f9422u);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter((ColorFilter) null);
                } else {
                    androidx.core.graphics.drawable.a.l(drawable, (ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f9433a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(false, this.f9434b, -1);
            }
        }

        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.E == 1 || tabLayout.H == 2) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() == 0) {
                            i12 = Math.max(i12, childAt.getMeasuredWidth());
                        }
                    }
                    if (i12 > 0) {
                        if (i12 * childCount <= getMeasuredWidth() - (((int) u.b(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                                if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i12;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.E = 0;
                            tabLayout2.q(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT < 23 && this.f9436d != i10) {
                requestLayout();
                this.f9436d = i10;
            }
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f9443a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f9444b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f9445c;

        /* renamed from: d  reason: collision with root package name */
        public int f9446d = -1;

        /* renamed from: e  reason: collision with root package name */
        public View f9447e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f9448f;

        /* renamed from: g  reason: collision with root package name */
        public i f9449g;

        /* renamed from: h  reason: collision with root package name */
        public int f9450h = -1;

        public g a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f9445c) && !TextUtils.isEmpty(charSequence)) {
                this.f9449g.setContentDescription(charSequence);
            }
            this.f9444b = charSequence;
            b();
            return this;
        }

        public void b() {
            i iVar = this.f9449g;
            if (iVar != null) {
                iVar.g();
            }
        }
    }

    public static class h implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f9451a;

        /* renamed from: b  reason: collision with root package name */
        public int f9452b;

        /* renamed from: c  reason: collision with root package name */
        public int f9453c;

        public h(TabLayout tabLayout) {
            this.f9451a = new WeakReference<>(tabLayout);
        }

        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f9451a.get();
            if (tabLayout != null) {
                int i12 = this.f9453c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f9452b == 1;
                if (!(i12 == 2 && this.f9452b == 0)) {
                    z10 = true;
                }
                tabLayout.m(i10, f10, z11, z10);
            }
        }

        public void b(int i10) {
            this.f9452b = this.f9453c;
            this.f9453c = i10;
        }

        public void c(int i10) {
            TabLayout tabLayout = (TabLayout) this.f9451a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f9453c;
                tabLayout.k(tabLayout.g(i10), i11 == 0 || (i11 == 2 && this.f9452b == 0));
            }
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: t  reason: collision with root package name */
        public static final /* synthetic */ int f9454t = 0;

        /* renamed from: a  reason: collision with root package name */
        public g f9455a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f9456b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f9457c;

        /* renamed from: d  reason: collision with root package name */
        public View f9458d;

        /* renamed from: e  reason: collision with root package name */
        public w8.b f9459e;

        /* renamed from: f  reason: collision with root package name */
        public View f9460f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f9461g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f9462h;

        /* renamed from: i  reason: collision with root package name */
        public Drawable f9463i;

        /* renamed from: r  reason: collision with root package name */
        public int f9464r = 2;

        public i(Context context) {
            super(context);
            h(context);
            int i10 = TabLayout.this.f9410d;
            int i11 = TabLayout.this.f9412e;
            int i12 = TabLayout.this.f9414f;
            int i13 = TabLayout.this.f9416g;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.k(this, i10, i11, i12, i13);
            setGravity(17);
            setOrientation(TabLayout.this.I ^ true ? 1 : 0);
            setClickable(true);
            c0.K(this, w.a(getContext(), 1002));
        }

        private w8.b getBadge() {
            return this.f9459e;
        }

        private w8.b getOrCreateBadge() {
            if (this.f9459e == null) {
                this.f9459e = new w8.b(getContext(), 0, R.attr.badgeStyle, 2132083788, (c.a) null);
            }
            e();
            w8.b bVar = this.f9459e;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final FrameLayout a(View view) {
            if ((view == this.f9457c || view == this.f9456b) && w8.d.f27173a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean b() {
            return this.f9459e != null;
        }

        public final void c(View view) {
            if (b() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                w8.d.a(this.f9459e, view, a(view));
                this.f9458d = view;
            }
        }

        public final void d() {
            if (b()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f9458d;
                if (view != null) {
                    w8.d.b(this.f9459e, view);
                    this.f9458d = null;
                }
            }
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f9463i;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f9463i.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            g gVar;
            g gVar2;
            if (b()) {
                if (this.f9460f != null) {
                    d();
                    return;
                }
                ImageView imageView = this.f9457c;
                if (imageView == null || (gVar2 = this.f9455a) == null || gVar2.f9443a == null) {
                    if (this.f9456b == null || (gVar = this.f9455a) == null) {
                        d();
                        return;
                    }
                    gVar.getClass();
                    View view = this.f9458d;
                    TextView textView = this.f9456b;
                    if (view != textView) {
                        d();
                        c(this.f9456b);
                        return;
                    }
                    f(textView);
                } else if (this.f9458d != imageView) {
                    d();
                    c(this.f9457c);
                } else {
                    f(imageView);
                }
            }
        }

        public final void f(View view) {
            if (b() && view == this.f9458d) {
                w8.d.c(this.f9459e, view, a(view));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.widget.FrameLayout} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.widget.FrameLayout} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: com.google.android.material.tabs.TabLayout$i} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g() {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r6.f9455a
                r1 = 0
                if (r0 == 0) goto L_0x0008
                android.view.View r2 = r0.f9447e
                goto L_0x0009
            L_0x0008:
                r2 = r1
            L_0x0009:
                if (r2 == 0) goto L_0x0051
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r6) goto L_0x001b
                if (r3 == 0) goto L_0x0018
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L_0x0018:
                r6.addView(r2)
            L_0x001b:
                r6.f9460f = r2
                android.widget.TextView r3 = r6.f9456b
                r4 = 8
                if (r3 == 0) goto L_0x0026
                r3.setVisibility(r4)
            L_0x0026:
                android.widget.ImageView r3 = r6.f9457c
                if (r3 == 0) goto L_0x0032
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r6.f9457c
                r3.setImageDrawable(r1)
            L_0x0032:
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r6.f9461g = r1
                if (r1 == 0) goto L_0x0045
                int r1 = s0.i.a.b(r1)
                r6.f9464r = r1
            L_0x0045:
                r1 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r6.f9462h = r1
                goto L_0x005e
            L_0x0051:
                android.view.View r2 = r6.f9460f
                if (r2 == 0) goto L_0x005a
                r6.removeView(r2)
                r6.f9460f = r1
            L_0x005a:
                r6.f9461g = r1
                r6.f9462h = r1
            L_0x005e:
                android.view.View r1 = r6.f9460f
                r2 = 0
                if (r1 != 0) goto L_0x010d
                android.widget.ImageView r1 = r6.f9457c
                r3 = -2
                if (r1 != 0) goto L_0x0098
                boolean r1 = w8.d.f27173a
                if (r1 == 0) goto L_0x0081
                android.widget.FrameLayout r1 = new android.widget.FrameLayout
                android.content.Context r4 = r6.getContext()
                r1.<init>(r4)
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r4.<init>(r3, r3)
                r1.setLayoutParams(r4)
                r6.addView(r1, r2)
                goto L_0x0082
            L_0x0081:
                r1 = r6
            L_0x0082:
                android.content.Context r4 = r6.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r5 = 2131623983(0x7f0e002f, float:1.8875133E38)
                android.view.View r4 = r4.inflate(r5, r1, r2)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r6.f9457c = r4
                r1.addView(r4, r2)
            L_0x0098:
                android.widget.TextView r1 = r6.f9456b
                if (r1 != 0) goto L_0x00d4
                boolean r1 = w8.d.f27173a
                if (r1 == 0) goto L_0x00b5
                android.widget.FrameLayout r1 = new android.widget.FrameLayout
                android.content.Context r4 = r6.getContext()
                r1.<init>(r4)
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r4.<init>(r3, r3)
                r1.setLayoutParams(r4)
                r6.addView(r1)
                goto L_0x00b6
            L_0x00b5:
                r1 = r6
            L_0x00b6:
                android.content.Context r3 = r6.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r4 = 2131623984(0x7f0e0030, float:1.8875135E38)
                android.view.View r3 = r3.inflate(r4, r1, r2)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r6.f9456b = r3
                r1.addView(r3)
                android.widget.TextView r1 = r6.f9456b
                int r1 = s0.i.a.b(r1)
                r6.f9464r = r1
            L_0x00d4:
                android.widget.TextView r1 = r6.f9456b
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                int r3 = r3.f9417h
                s0.i.h(r1, r3)
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r1 = r1.f9418i
                if (r1 == 0) goto L_0x00e8
                android.widget.TextView r3 = r6.f9456b
                r3.setTextColor(r1)
            L_0x00e8:
                android.widget.TextView r1 = r6.f9456b
                android.widget.ImageView r3 = r6.f9457c
                r6.i(r1, r3)
                r6.e()
                android.widget.ImageView r1 = r6.f9457c
                if (r1 != 0) goto L_0x00f7
                goto L_0x00ff
            L_0x00f7:
                com.google.android.material.tabs.b r3 = new com.google.android.material.tabs.b
                r3.<init>(r6, r1)
                r1.addOnLayoutChangeListener(r3)
            L_0x00ff:
                android.widget.TextView r1 = r6.f9456b
                if (r1 != 0) goto L_0x0104
                goto L_0x011a
            L_0x0104:
                com.google.android.material.tabs.b r3 = new com.google.android.material.tabs.b
                r3.<init>(r6, r1)
                r1.addOnLayoutChangeListener(r3)
                goto L_0x011a
            L_0x010d:
                android.widget.TextView r1 = r6.f9461g
                if (r1 != 0) goto L_0x0115
                android.widget.ImageView r3 = r6.f9462h
                if (r3 == 0) goto L_0x011a
            L_0x0115:
                android.widget.ImageView r3 = r6.f9462h
                r6.i(r1, r3)
            L_0x011a:
                if (r0 == 0) goto L_0x0129
                java.lang.CharSequence r1 = r0.f9445c
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0129
                java.lang.CharSequence r1 = r0.f9445c
                r6.setContentDescription(r1)
            L_0x0129:
                r1 = 1
                if (r0 == 0) goto L_0x014a
                com.google.android.material.tabs.TabLayout r3 = r0.f9448f
                if (r3 == 0) goto L_0x0142
                int r3 = r3.getSelectedTabPosition()
                r4 = -1
                if (r3 == r4) goto L_0x013d
                int r0 = r0.f9446d
                if (r3 != r0) goto L_0x013d
                r0 = 1
                goto L_0x013e
            L_0x013d:
                r0 = 0
            L_0x013e:
                if (r0 == 0) goto L_0x014a
                r2 = 1
                goto L_0x014a
            L_0x0142:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L_0x014a:
                r6.setSelected(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.g():void");
        }

        public int getContentHeight() {
            View[] viewArr = {this.f9456b, this.f9457c, this.f9460f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f9456b, this.f9457c, this.f9460f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f9455a;
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v4, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f9426y
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = g.a.b(r7, r0)
                r6.f9463i = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f9463i
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f9463i = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f9420s
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f9420s
                android.content.res.ColorStateList r3 = q9.b.a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.M
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                if (r4 == 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0074
            L_0x005f:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.n(r2)
                androidx.core.graphics.drawable.a.l(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0074:
                java.util.WeakHashMap<android.view.View, java.lang.String> r0 = o0.c0.f22553a
                o0.c0.d.q(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.h(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f9443a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(android.widget.TextView r7, android.widget.ImageView r8) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r6.f9455a
                r1 = 0
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = r0.f9443a
                if (r0 == 0) goto L_0x0012
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.a.n(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x0013
            L_0x0012:
                r0 = r1
            L_0x0013:
                if (r0 == 0) goto L_0x0025
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f9419r
                androidx.core.graphics.drawable.a.l(r0, r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.f9423v
                if (r2 == 0) goto L_0x0025
                androidx.core.graphics.drawable.a.m(r0, r2)
            L_0x0025:
                com.google.android.material.tabs.TabLayout$g r2 = r6.f9455a
                if (r2 == 0) goto L_0x002c
                java.lang.CharSequence r2 = r2.f9444b
                goto L_0x002d
            L_0x002c:
                r2 = r1
            L_0x002d:
                r3 = 8
                r4 = 0
                if (r8 == 0) goto L_0x0044
                if (r0 == 0) goto L_0x003e
                r8.setImageDrawable(r0)
                r8.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x0044
            L_0x003e:
                r8.setVisibility(r3)
                r8.setImageDrawable(r1)
            L_0x0044:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r0 = r0 ^ 1
                if (r7 == 0) goto L_0x0063
                if (r0 == 0) goto L_0x005d
                r7.setText(r2)
                com.google.android.material.tabs.TabLayout$g r5 = r6.f9455a
                r5.getClass()
                r7.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x0063
            L_0x005d:
                r7.setVisibility(r3)
                r7.setText(r1)
            L_0x0063:
                if (r8 == 0) goto L_0x00a5
                android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                if (r0 == 0) goto L_0x007d
                int r5 = r8.getVisibility()
                if (r5 != 0) goto L_0x007d
                android.content.Context r5 = r6.getContext()
                float r3 = l9.u.b(r5, r3)
                int r3 = (int) r3
                goto L_0x007e
            L_0x007d:
                r3 = 0
            L_0x007e:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                boolean r5 = r5.I
                if (r5 == 0) goto L_0x0096
                int r5 = o0.h.b(r7)
                if (r3 == r5) goto L_0x00a5
                o0.h.g(r7, r3)
                r7.bottomMargin = r4
                r8.setLayoutParams(r7)
                r8.requestLayout()
                goto L_0x00a5
            L_0x0096:
                int r5 = r7.bottomMargin
                if (r3 == r5) goto L_0x00a5
                r7.bottomMargin = r3
                o0.h.g(r7, r4)
                r8.setLayoutParams(r7)
                r8.requestLayout()
            L_0x00a5:
                com.google.android.material.tabs.TabLayout$g r7 = r6.f9455a
                if (r7 == 0) goto L_0x00ab
                java.lang.CharSequence r1 = r7.f9445c
            L_0x00ab:
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 21
                if (r7 < r8) goto L_0x00b5
                r8 = 23
                if (r7 <= r8) goto L_0x00bc
            L_0x00b5:
                if (r0 == 0) goto L_0x00b8
                goto L_0x00b9
            L_0x00b8:
                r2 = r1
            L_0x00b9:
                androidx.appcompat.widget.j1.a(r6, r2)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.i(android.widget.TextView, android.widget.ImageView):void");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            w8.b bVar = this.f9459e;
            if (bVar != null && bVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f9459e.c());
            }
            c.C0207c a10 = c.C0207c.a(0, 1, this.f9455a.f9446d, 1, false, isSelected());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) a10.f23768a);
            }
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                c.a aVar = c.a.f23753g;
                if (i10 >= 21) {
                    accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f23763a);
                }
            }
            String string = getResources().getString(R.string.item_view_role_description);
            if (i10 >= 19) {
                accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0098;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.f9427z
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f9456b
                if (r0 == 0) goto L_0x00a8
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f9424w
                int r1 = r7.f9464r
                android.widget.ImageView r2 = r7.f9457c
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = 1
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.f9456b
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f9425x
            L_0x0046:
                android.widget.TextView r2 = r7.f9456b
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f9456b
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f9456b
                int r5 = s0.i.a.b(r5)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a8
                if (r1 == r5) goto L_0x00a8
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.H
                r6 = 0
                if (r5 != r3) goto L_0x0099
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0099
                if (r4 != r3) goto L_0x0099
                android.widget.TextView r2 = r7.f9456b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0098
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0099
            L_0x0098:
                r3 = 0
            L_0x0099:
                if (r3 == 0) goto L_0x00a8
                android.widget.TextView r2 = r7.f9456b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f9456b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f9455a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            g gVar = this.f9455a;
            TabLayout tabLayout = gVar.f9448f;
            if (tabLayout != null) {
                tabLayout.k(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f9456b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f9457c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f9460f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f9455a) {
                this.f9455a = gVar;
                g();
            }
        }
    }

    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f9466a;

        public j(ViewPager viewPager) {
            this.f9466a = viewPager;
        }

        public void a(g gVar) {
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            this.f9466a.setCurrentItem(gVar.f9446d);
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.tabStyle, 2132083561), attributeSet, R.attr.tabStyle);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f9408c = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = r.d(context2, attributeSet, t8.a.J, R.attr.tabStyle, 2132083561, 23);
        if (getBackground() instanceof ColorDrawable) {
            s9.f fVar2 = new s9.f();
            fVar2.r(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar2.f25079a.f25099b = new i9.a(context2);
            fVar2.z();
            fVar2.q(c0.l(this));
            c0.d.q(this, fVar2);
        }
        setSelectedTabIndicator(p9.c.c(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f9416g = dimensionPixelSize;
        this.f9414f = dimensionPixelSize;
        this.f9412e = dimensionPixelSize;
        this.f9410d = dimensionPixelSize;
        this.f9410d = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9412e = d10.getDimensionPixelSize(20, this.f9412e);
        this.f9414f = d10.getDimensionPixelSize(18, this.f9414f);
        this.f9416g = d10.getDimensionPixelSize(17, this.f9416g);
        int resourceId = d10.getResourceId(23, 2132083176);
        this.f9417h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, l.f13524x);
        try {
            this.f9424w = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f9418i = p9.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(24)) {
                this.f9418i = p9.c.a(context2, d10, 24);
            }
            if (d10.hasValue(22)) {
                int color = d10.getColor(22, 0);
                int defaultColor = this.f9418i.getDefaultColor();
                this.f9418i = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f9419r = p9.c.a(context2, d10, 3);
            this.f9423v = u.d(d10.getInt(4, -1), (PorterDuff.Mode) null);
            this.f9420s = p9.c.a(context2, d10, 21);
            this.F = d10.getInt(6, 300);
            this.A = d10.getDimensionPixelSize(14, -1);
            this.B = d10.getDimensionPixelSize(13, -1);
            this.f9426y = d10.getResourceId(0, 0);
            this.D = d10.getDimensionPixelSize(1, 0);
            this.H = d10.getInt(15, 1);
            this.E = d10.getInt(2, 0);
            this.I = d10.getBoolean(12, false);
            this.M = d10.getBoolean(25, false);
            d10.recycle();
            Resources resources = getResources();
            this.f9425x = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.C = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f9404a.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f9404a.get(i10);
                if (gVar != null && gVar.f9443a != null && !TextUtils.isEmpty(gVar.f9444b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.I) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.A;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.H;
        if (i11 == 0 || i11 == 2) {
            return this.C;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9408c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f9408c.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f9408c.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    public void a(g gVar, boolean z10) {
        int size = this.f9404a.size();
        if (gVar.f9448f == this) {
            gVar.f9446d = size;
            this.f9404a.add(size, gVar);
            int size2 = this.f9404a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.f9404a.get(size).f9446d = size;
            }
            i iVar = gVar.f9449g;
            iVar.setSelected(false);
            iVar.setActivated(false);
            f fVar = this.f9408c;
            int i10 = gVar.f9446d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            p(layoutParams);
            fVar.addView(iVar, i10, layoutParams);
            if (z10) {
                TabLayout tabLayout = gVar.f9448f;
                if (tabLayout != null) {
                    tabLayout.k(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof u9.c) {
            u9.c cVar = (u9.c) view;
            g i10 = i();
            cVar.getClass();
            if (!TextUtils.isEmpty(cVar.getContentDescription())) {
                i10.f9445c = cVar.getContentDescription();
                i10.b();
            }
            a(i10, this.f9404a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i10) {
        boolean z10;
        if (i10 != -1) {
            if (getWindowToken() != null && c0.r(this)) {
                f fVar = this.f9408c;
                int childCount = fVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        z10 = false;
                        break;
                    } else if (fVar.getChildAt(i11).getWidth() <= 0) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int e10 = e(i10, 0.0f);
                    if (scrollX != e10) {
                        f();
                        this.R.setIntValues(new int[]{scrollX, e10});
                        this.R.start();
                    }
                    f fVar2 = this.f9408c;
                    int i12 = this.F;
                    ValueAnimator valueAnimator = fVar2.f9433a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar2.f9433a.cancel();
                    }
                    fVar2.d(true, i10, i12);
                    return;
                }
            }
            m(i10, 0.0f, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.H
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x0014
        L_0x000b:
            int r0 = r5.D
            int r3 = r5.f9410d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$f r3 = r5.f9408c
            java.util.WeakHashMap<android.view.View, java.lang.String> r4 = o0.c0.f22553a
            o0.c0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.H
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r3) goto L_0x0027
            if (r0 == r1) goto L_0x0027
            goto L_0x0052
        L_0x0027:
            int r0 = r5.E
            if (r0 != r1) goto L_0x0030
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0030:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f9408c
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0036:
            int r0 = r5.E
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x003f
            if (r0 == r1) goto L_0x004a
            goto L_0x0052
        L_0x003f:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f9408c
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0045:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x004a:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f9408c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0052:
            r5.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i10, float f10) {
        View childAt;
        int i11 = this.H;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f9408c.getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        View childAt2 = i13 < this.f9408c.getChildCount() ? this.f9408c.getChildAt(i13) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i12 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) (((float) (width + i12)) * 0.5f * f10);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        return c0.e.d(this) == 0 ? left + i14 : left - i14;
    }

    public final void f() {
        if (this.R == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.R = valueAnimator;
            valueAnimator.setInterpolator(u8.a.f26149b);
            this.R.setDuration((long) this.F);
            this.R.addUpdateListener(new a());
        }
    }

    public g g(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f9404a.get(i10);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f9406b;
        if (gVar != null) {
            return gVar.f9446d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9404a.size();
    }

    public int getTabGravity() {
        return this.E;
    }

    public ColorStateList getTabIconTint() {
        return this.f9419r;
    }

    public int getTabIndicatorAnimationMode() {
        return this.L;
    }

    public int getTabIndicatorGravity() {
        return this.G;
    }

    public int getTabMaxWidth() {
        return this.f9427z;
    }

    public int getTabMode() {
        return this.H;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9420s;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9421t;
    }

    public ColorStateList getTabTextColors() {
        return this.f9418i;
    }

    public final boolean h() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public g i() {
        g gVar = (g) ((n0.e) f9403g0).b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f9448f = this;
        n0.d<i> dVar = this.f9415f0;
        i b10 = dVar != null ? dVar.b() : null;
        if (b10 == null) {
            b10 = new i(getContext());
        }
        b10.setTab(gVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f9445c)) {
            b10.setContentDescription(gVar.f9444b);
        } else {
            b10.setContentDescription(gVar.f9445c);
        }
        gVar.f9449g = b10;
        int i10 = gVar.f9450h;
        if (i10 != -1) {
            b10.setId(i10);
        }
        return gVar;
    }

    public void j() {
        int currentItem;
        String str;
        for (int childCount = this.f9408c.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) this.f9408c.getChildAt(childCount);
            this.f9408c.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab((g) null);
                iVar.setSelected(false);
                this.f9415f0.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f9404a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f9448f = null;
            next.f9449g = null;
            next.f9443a = null;
            next.f9450h = -1;
            next.f9444b = null;
            next.f9445c = null;
            next.f9446d = -1;
            next.f9447e = null;
            ((n0.e) f9403g0).a(next);
        }
        this.f9406b = null;
        f2.a aVar = this.f9405a0;
        if (aVar != null) {
            int c10 = aVar.c();
            for (int i10 = 0; i10 < c10; i10++) {
                g i11 = i();
                i.a aVar2 = (i.a) this.f9405a0;
                Resources C2 = ad.i.this.C();
                int intValue = ad.i.this.E0.get(i10).intValue();
                if (intValue == 1) {
                    str = C2.getString(R.string.exo_track_selection_title_audio);
                } else if (intValue == 2) {
                    str = C2.getString(R.string.exo_track_selection_title_video);
                } else if (intValue == 3) {
                    str = C2.getString(R.string.exo_track_selection_title_text);
                } else {
                    throw new IllegalArgumentException();
                }
                i11.a(str);
                a(i11, false);
            }
            ViewPager viewPager = this.S;
            if (viewPager != null && c10 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                k(g(currentItem), true);
            }
        }
    }

    public void k(g gVar, boolean z10) {
        g gVar2 = this.f9406b;
        if (gVar2 != gVar) {
            int i10 = gVar != null ? gVar.f9446d : -1;
            if (z10) {
                if ((gVar2 == null || gVar2.f9446d == -1) && i10 != -1) {
                    m(i10, 0.0f, true, true);
                } else {
                    c(i10);
                }
                if (i10 != -1) {
                    setSelectedTabView(i10);
                }
            }
            this.f9406b = gVar;
            if (gVar2 != null) {
                for (int size = this.P.size() - 1; size >= 0; size--) {
                    this.P.get(size).b(gVar2);
                }
            }
            if (gVar != null) {
                for (int size2 = this.P.size() - 1; size2 >= 0; size2--) {
                    this.P.get(size2).c(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = this.P.size() - 1; size3 >= 0; size3--) {
                this.P.get(size3).a(gVar);
            }
            c(gVar.f9446d);
        }
    }

    public void l(f2.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        f2.a aVar2 = this.f9405a0;
        if (!(aVar2 == null || (dataSetObserver = this.f9407b0) == null)) {
            aVar2.f18077a.unregisterObserver(dataSetObserver);
        }
        this.f9405a0 = aVar;
        if (z10 && aVar != null) {
            if (this.f9407b0 == null) {
                this.f9407b0 = new e();
            }
            aVar.f18077a.registerObserver(this.f9407b0);
        }
        j();
    }

    public void m(int i10, float f10, boolean z10, boolean z11) {
        int i11;
        int round = Math.round(((float) i10) + f10);
        if (round >= 0 && round < this.f9408c.getChildCount()) {
            if (z11) {
                f fVar = this.f9408c;
                ValueAnimator valueAnimator = fVar.f9433a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f9433a.cancel();
                }
                fVar.f9434b = i10;
                fVar.f9435c = f10;
                fVar.c(fVar.getChildAt(i10), fVar.getChildAt(fVar.f9434b + 1), fVar.f9435c);
            }
            ValueAnimator valueAnimator2 = this.R;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.R.cancel();
            }
            if (i10 < 0) {
                i11 = 0;
            } else {
                i11 = e(i10, f10);
            }
            scrollTo(i11, 0);
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public final void n(ViewPager viewPager, boolean z10, boolean z11) {
        List<ViewPager.h> list;
        List<ViewPager.i> list2;
        ViewPager viewPager2 = this.S;
        if (viewPager2 != null) {
            h hVar = this.f9409c0;
            if (!(hVar == null || (list2 = viewPager2.f3183f0) == null)) {
                list2.remove(hVar);
            }
            b bVar = this.f9411d0;
            if (!(bVar == null || (list = this.S.f3187h0) == null)) {
                list.remove(bVar);
            }
        }
        c cVar = this.Q;
        if (cVar != null) {
            this.P.remove(cVar);
            this.Q = null;
        }
        if (viewPager != null) {
            this.S = viewPager;
            if (this.f9409c0 == null) {
                this.f9409c0 = new h(this);
            }
            h hVar2 = this.f9409c0;
            hVar2.f9453c = 0;
            hVar2.f9452b = 0;
            if (viewPager.f3183f0 == null) {
                viewPager.f3183f0 = new ArrayList();
            }
            viewPager.f3183f0.add(hVar2);
            j jVar = new j(viewPager);
            this.Q = jVar;
            if (!this.P.contains(jVar)) {
                this.P.add(jVar);
            }
            f2.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, z10);
            }
            if (this.f9411d0 == null) {
                this.f9411d0 = new b();
            }
            b bVar2 = this.f9411d0;
            bVar2.f9429a = z10;
            if (viewPager.f3187h0 == null) {
                viewPager.f3187h0 = new ArrayList();
            }
            viewPager.f3187h0.add(bVar2);
            m(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.S = null;
            l((f2.a) null, false);
        }
        this.f9413e0 = z11;
    }

    public final void o() {
        int size = this.f9404a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9404a.get(i10).b();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof s9.f) {
            q.d.d(this, (s9.f) background);
        }
        if (this.S == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9413e0) {
            setupWithViewPager((ViewPager) null);
            this.f9413e0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.i) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$f r1 = r7.f9408c
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$f r1 = r7.f9408c
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.i
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$i r1 = (com.google.android.material.tabs.TabLayout.i) r1
            android.graphics.drawable.Drawable r2 = r1.f9463i
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f9463i
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.b a10 = c.b.a(1, getTabCount(), false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f23767a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return h() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = l9.u.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.B
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = l9.u.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f9427z = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.H
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || h()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(LinearLayout.LayoutParams layoutParams) {
        if (this.H == 1 && this.E == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void q(boolean z10) {
        for (int i10 = 0; i10 < this.f9408c.getChildCount(); i10++) {
            View childAt = this.f9408c.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        q.d.c(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            for (int i10 = 0; i10 < this.f9408c.getChildCount(); i10++) {
                View childAt = this.f9408c.getChildAt(i10);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    iVar.setOrientation(TabLayout.this.I ^ true ? 1 : 0);
                    TextView textView = iVar.f9461g;
                    if (textView == null && iVar.f9462h == null) {
                        iVar.i(iVar.f9456b, iVar.f9457c);
                    } else {
                        iVar.i(textView, iVar.f9462h);
                    }
                }
            }
            d();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.R.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f9421t != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f9421t = drawable;
            int i10 = this.K;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f9408c.b(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f9422u = i10;
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.G != i10) {
            this.G = i10;
            f fVar = this.f9408c;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.K = i10;
        this.f9408c.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.E != i10) {
            this.E = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9419r != colorStateList) {
            this.f9419r = colorStateList;
            o();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(g.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.L = i10;
        if (i10 == 0) {
            this.N = new a();
        } else if (i10 == 1) {
            this.N = new u9.a();
        } else if (i10 == 2) {
            this.N = new u9.b();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.J = z10;
        f fVar = this.f9408c;
        int i10 = f.f9432f;
        fVar.a();
        f fVar2 = this.f9408c;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.k(fVar2);
    }

    public void setTabMode(int i10) {
        if (i10 != this.H) {
            this.H = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9420s != colorStateList) {
            this.f9420s = colorStateList;
            for (int i10 = 0; i10 < this.f9408c.getChildCount(); i10++) {
                View childAt = this.f9408c.getChildAt(i10);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i11 = i.f9454t;
                    ((i) childAt).h(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(g.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9418i != colorStateList) {
            this.f9418i = colorStateList;
            o();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(f2.a aVar) {
        l(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            for (int i10 = 0; i10 < this.f9408c.getChildCount(); i10++) {
                View childAt = this.f9408c.getChildAt(i10);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i11 = i.f9454t;
                    ((i) childAt).h(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, true, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void addView(View view, int i10) {
        b(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.O;
        if (cVar2 != null) {
            this.P.remove(cVar2);
        }
        this.O = cVar;
        if (cVar != null && !this.P.contains(cVar)) {
            this.P.add(cVar);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(g.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
