package n9;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j1;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;
import o0.w;
import p0.c;

/* compiled from: NavigationBarItemView */
public abstract class a extends FrameLayout implements j.a {
    public static final int[] K = {16842912};
    public static final c L = new c((C0196a) null);
    public static final c M = new d((C0196a) null);
    public Drawable A;
    public ValueAnimator B;
    public c C = L;
    public float D = 0.0f;
    public boolean E = false;
    public int F = 0;
    public int G = 0;
    public boolean H = false;
    public int I = 0;
    public w8.b J;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22413a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f22414b;

    /* renamed from: c  reason: collision with root package name */
    public int f22415c;

    /* renamed from: d  reason: collision with root package name */
    public float f22416d;

    /* renamed from: e  reason: collision with root package name */
    public float f22417e;

    /* renamed from: f  reason: collision with root package name */
    public float f22418f;

    /* renamed from: g  reason: collision with root package name */
    public int f22419g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22420h;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f22421i;

    /* renamed from: r  reason: collision with root package name */
    public final View f22422r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f22423s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f22424t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f22425u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f22426v;

    /* renamed from: w  reason: collision with root package name */
    public int f22427w = -1;

    /* renamed from: x  reason: collision with root package name */
    public g f22428x;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f22429y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f22430z;

    /* renamed from: n9.a$a  reason: collision with other inner class name */
    /* compiled from: NavigationBarItemView */
    public class C0196a implements View.OnLayoutChangeListener {
        public C0196a() {
        }

        /* JADX WARNING: type inference failed for: r1v6, types: [android.view.ViewParent] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            /*
                r0 = this;
                n9.a r1 = n9.a.this
                android.widget.ImageView r1 = r1.f22423s
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L_0x002a
                n9.a r1 = n9.a.this
                android.widget.ImageView r2 = r1.f22423s
                boolean r3 = r1.b()
                if (r3 != 0) goto L_0x0015
                goto L_0x002a
            L_0x0015:
                w8.b r3 = r1.J
                android.widget.ImageView r1 = r1.f22423s
                r4 = 0
                if (r2 != r1) goto L_0x0027
                boolean r5 = w8.d.f27173a
                if (r5 == 0) goto L_0x0027
                android.view.ViewParent r1 = r1.getParent()
                r4 = r1
                android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            L_0x0027:
                w8.d.c(r3, r2, r4)
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n9.a.C0196a.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    }

    /* compiled from: NavigationBarItemView */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22432a;

        public b(int i10) {
            this.f22432a = i10;
        }

        public void run() {
            a.this.j(this.f22432a);
        }
    }

    /* compiled from: NavigationBarItemView */
    public static class c {
        public c(C0196a aVar) {
        }

        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    /* compiled from: NavigationBarItemView */
    public static class d extends c {
        public d(C0196a aVar) {
            super((C0196a) null);
        }

        public float a(float f10, float f11) {
            return u8.a.a(0.4f, 1.0f, f10);
        }
    }

    public a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f22421i = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f22422r = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f22423s = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f22424t = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f22425u = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f22426v = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f22414b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f22415c = viewGroup.getPaddingBottom();
        c0.I(textView, 2);
        c0.I(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C0196a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            s0.i.h(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = 0
            goto L_0x0059
        L_0x000c:
            int[] r2 = t8.a.K
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L_0x002c
            int r5 = r2.getComplexUnit()
            goto L_0x0031
        L_0x002c:
            int r5 = r2.data
            int r5 = r5 >> r1
            r5 = r5 & 15
        L_0x0031:
            r3 = 2
            if (r5 != r3) goto L_0x004b
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x0059
        L_0x004b:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x0059:
            if (r5 == 0) goto L_0x005f
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.a.f(android.widget.TextView, int):void");
    }

    public static void g(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f22421i;
        return frameLayout != null ? frameLayout : this.f22423s;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        w8.b bVar = this.J;
        int minimumHeight = bVar != null ? bVar.getMinimumHeight() / 2 : 0;
        return this.f22423s.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int i10;
        w8.b bVar = this.J;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.getMinimumWidth() - this.J.f27141e.f27151b.f27167u.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(i10, layoutParams.leftMargin);
        return Math.max(i10, layoutParams.rightMargin) + this.f22423s.getMeasuredWidth() + max;
    }

    public static void h(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void k(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void a(float f10, float f11) {
        this.f22416d = f10 - f11;
        this.f22417e = (f11 * 1.0f) / f10;
        this.f22418f = (f10 * 1.0f) / f11;
    }

    public final boolean b() {
        return this.J != null;
    }

    public final void c() {
        g gVar = this.f22428x;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    public void d(g gVar, int i10) {
        CharSequence charSequence;
        this.f22428x = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.f568e);
        setId(gVar.f564a);
        if (!TextUtils.isEmpty(gVar.f580q)) {
            setContentDescription(gVar.f580q);
        }
        if (!TextUtils.isEmpty(gVar.f581r)) {
            charSequence = gVar.f581r;
        } else {
            charSequence = gVar.f568e;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 21 || i11 > 23) {
            j1.a(this, charSequence);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f22413a = true;
    }

    public final void e(float f10, float f11) {
        View view = this.f22422r;
        if (view != null) {
            c cVar = this.C;
            cVar.getClass();
            view.setScaleX(u8.a.a(0.4f, 1.0f, f10));
            view.setScaleY(cVar.a(f10, f11));
            view.setAlpha(u8.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10));
        }
        this.D = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f22422r;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public w8.b getBadge() {
        return this.J;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    public g getItemData() {
        return this.f22428x;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f22427w;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22424t.getLayoutParams();
        return this.f22424t.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22424t.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f22424t.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(View view) {
        if (b()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                w8.d.b(this.J, view);
            }
            this.J = null;
        }
    }

    public final void j(int i10) {
        int i11;
        if (this.f22422r != null) {
            int min = Math.min(this.F, i10 - (this.I * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22422r.getLayoutParams();
            if (this.H && this.f22419g == 2) {
                i11 = min;
            } else {
                i11 = this.G;
            }
            layoutParams.height = i11;
            layoutParams.width = min;
            this.f22422r.setLayoutParams(layoutParams);
        }
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f22428x;
        if (gVar != null && gVar.isCheckable() && this.f22428x.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w8.b bVar = this.J;
        if (bVar != null && bVar.isVisible()) {
            g gVar = this.f22428x;
            CharSequence charSequence = gVar.f568e;
            if (!TextUtils.isEmpty(gVar.f580q)) {
                charSequence = this.f22428x.f580q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.J.c());
        }
        c.C0207c a10 = c.C0207c.a(0, 1, getItemVisiblePosition(), 1, false, isSelected());
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

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f22422r;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.E = z10;
        View view = this.f22422r;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.G = i10;
        j(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.I = i10;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.H = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.F = i10;
        j(getWidth());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBadge(w8.b r5) {
        /*
            r4 = this;
            w8.b r0 = r4.J
            if (r0 != r5) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x001b
            android.widget.ImageView r0 = r4.f22423s
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "NavigationBar"
            java.lang.String r1 = "Multiple badges shouldn't be attached to one item."
            android.util.Log.w(r0, r1)
            android.widget.ImageView r0 = r4.f22423s
            r4.i(r0)
        L_0x001b:
            r4.J = r5
            android.widget.ImageView r5 = r4.f22423s
            if (r5 == 0) goto L_0x0046
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            if (r5 == 0) goto L_0x0046
            r0 = 0
            r4.setClipChildren(r0)
            r4.setClipToPadding(r0)
            w8.b r0 = r4.J
            android.widget.ImageView r1 = r4.f22423s
            r2 = 0
            if (r5 != r1) goto L_0x0043
            boolean r3 = w8.d.f27173a
            if (r3 == 0) goto L_0x0043
            android.view.ViewParent r1 = r1.getParent()
            r2 = r1
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L_0x0043:
            w8.d.a(r0, r5, r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.a.setBadge(w8.b):void");
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f22426v;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f22426v;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f22425u;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f22425u;
        textView4.setPivotY((float) textView4.getBaseline());
        float f10 = z10 ? 1.0f : 0.0f;
        if (!this.E || !this.f22413a || !c0.q(this)) {
            e(f10, f10);
        } else {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.D, f10});
            this.B = ofFloat;
            ofFloat.addUpdateListener(new b(this, f10));
            this.B.setInterpolator(m9.a.d(getContext(), R.attr.motionEasingStandard, u8.a.f26149b));
            this.B.setDuration((long) m9.a.c(getContext(), R.attr.motionDurationLong1, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            this.B.start();
        }
        int i10 = this.f22419g;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    h(getIconOrContainer(), this.f22414b, 49);
                    k(this.f22424t, this.f22415c);
                    this.f22426v.setVisibility(0);
                } else {
                    h(getIconOrContainer(), this.f22414b, 17);
                    k(this.f22424t, 0);
                    this.f22426v.setVisibility(4);
                }
                this.f22425u.setVisibility(4);
            } else if (i10 == 1) {
                k(this.f22424t, this.f22415c);
                if (z10) {
                    h(getIconOrContainer(), (int) (((float) this.f22414b) + this.f22416d), 49);
                    g(this.f22426v, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f22425u;
                    float f11 = this.f22417e;
                    g(textView5, f11, f11, 4);
                } else {
                    h(getIconOrContainer(), this.f22414b, 49);
                    TextView textView6 = this.f22426v;
                    float f12 = this.f22418f;
                    g(textView6, f12, f12, 4);
                    g(this.f22425u, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                h(getIconOrContainer(), this.f22414b, 17);
                this.f22426v.setVisibility(8);
                this.f22425u.setVisibility(8);
            }
        } else if (this.f22420h) {
            if (z10) {
                h(getIconOrContainer(), this.f22414b, 49);
                k(this.f22424t, this.f22415c);
                this.f22426v.setVisibility(0);
            } else {
                h(getIconOrContainer(), this.f22414b, 17);
                k(this.f22424t, 0);
                this.f22426v.setVisibility(4);
            }
            this.f22425u.setVisibility(4);
        } else {
            k(this.f22424t, this.f22415c);
            if (z10) {
                h(getIconOrContainer(), (int) (((float) this.f22414b) + this.f22416d), 49);
                g(this.f22426v, 1.0f, 1.0f, 0);
                TextView textView7 = this.f22425u;
                float f13 = this.f22417e;
                g(textView7, f13, f13, 4);
            } else {
                h(getIconOrContainer(), this.f22414b, 49);
                TextView textView8 = this.f22426v;
                float f14 = this.f22418f;
                g(textView8, f14, f14, 4);
                g(this.f22425u, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f22425u.setEnabled(z10);
        this.f22426v.setEnabled(z10);
        this.f22423s.setEnabled(z10);
        if (z10) {
            c0.K(this, w.a(getContext(), 1002));
        } else {
            c0.K(this, (w) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f22430z) {
            this.f22430z = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.n(drawable).mutate();
                this.A = drawable;
                ColorStateList colorStateList = this.f22429y;
                if (colorStateList != null) {
                    androidx.core.graphics.drawable.a.l(drawable, colorStateList);
                }
            }
            this.f22423s.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22423s.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f22423s.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f22429y = colorStateList;
        if (this.f22428x != null && (drawable = this.A) != null) {
            androidx.core.graphics.drawable.a.l(drawable, colorStateList);
            this.A.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : d0.a.c(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f22415c != i10) {
            this.f22415c = i10;
            c();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f22414b != i10) {
            this.f22414b = i10;
            c();
        }
    }

    public void setItemPosition(int i10) {
        this.f22427w = i10;
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f22419g != i10) {
            this.f22419g = i10;
            if (this.H && i10 == 2) {
                this.C = M;
            } else {
                this.C = L;
            }
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f22420h != z10) {
            this.f22420h = z10;
            c();
        }
    }

    public void setTextAppearanceActive(int i10) {
        f(this.f22426v, i10);
        a(this.f22425u.getTextSize(), this.f22426v.getTextSize());
    }

    public void setTextAppearanceInactive(int i10) {
        f(this.f22425u, i10);
        a(this.f22425u.getTextSize(), this.f22426v.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f22425u.setTextColor(colorStateList);
            this.f22426v.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f22425u.setText(charSequence);
        this.f22426v.setText(charSequence);
        g gVar = this.f22428x;
        if (gVar == null || TextUtils.isEmpty(gVar.f580q)) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.f22428x;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.f581r)) {
            charSequence = this.f22428x.f581r;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21 || i10 > 23) {
            j1.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, drawable);
    }
}
