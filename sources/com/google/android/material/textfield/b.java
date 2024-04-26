package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import l9.q;
import o0.c0;
import s9.f;
import s9.i;
import v9.h;
import v9.i;
import v9.j;
import v9.k;

/* compiled from: DropdownMenuEndIconDelegate */
public class b extends k {

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f9538r = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f9539e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f9540f = new C0102b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.e f9541g = new c(this.f26641a);

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.f f9542h = new d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout.g f9543i = new e();

    /* renamed from: j  reason: collision with root package name */
    public boolean f9544j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9545k = false;

    /* renamed from: l  reason: collision with root package name */
    public long f9546l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public StateListDrawable f9547m;

    /* renamed from: n  reason: collision with root package name */
    public s9.f f9548n;

    /* renamed from: o  reason: collision with root package name */
    public AccessibilityManager f9549o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f9550p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f9551q;

    /* compiled from: DropdownMenuEndIconDelegate */
    public class a extends q {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        /* compiled from: DropdownMenuEndIconDelegate */
        public class C0101a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f9553a;

            public C0101a(AutoCompleteTextView autoCompleteTextView) {
                this.f9553a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f9553a.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f9544j = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d10 = b.d(b.this.f26641a.getEditText());
            if (b.this.f9549o.isTouchExplorationEnabled() && b.e(d10) && !b.this.f26643c.hasFocus()) {
                d10.dismissDropDown();
            }
            d10.post(new C0101a(d10));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C0102b implements View.OnFocusChangeListener {
        public C0102b() {
        }

        public void onFocusChange(View view, boolean z10) {
            b.this.f26641a.setEndIconActivated(z10);
            if (!z10) {
                b.f(b.this, false);
                b.this.f9544j = false;
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void d(View view, p0.c cVar) {
            boolean z10;
            super.d(view, cVar);
            if (!b.e(b.this.f26641a.getEditText())) {
                cVar.f23748a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z10 = cVar.f23748a.isShowingHintText();
            } else {
                Bundle h10 = cVar.h();
                z10 = h10 != null && (h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z10) {
                cVar.o((CharSequence) null);
            }
        }

        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.f22536a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d10 = b.d(b.this.f26641a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f9549o.isEnabled() && !b.e(b.this.f26641a.getEditText())) {
                b.g(b.this, d10);
                b.h(b.this);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class d implements TextInputLayout.f {
        public d() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d10 = b.d(textInputLayout.getEditText());
            b bVar = b.this;
            bVar.getClass();
            boolean z10 = b.f9538r;
            if (z10) {
                int boxBackgroundMode = bVar.f26641a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    d10.setDropDownBackgroundDrawable(bVar.f9548n);
                } else if (boxBackgroundMode == 1) {
                    d10.setDropDownBackgroundDrawable(bVar.f9547m);
                }
            }
            b.this.i(d10);
            b bVar2 = b.this;
            bVar2.getClass();
            d10.setOnTouchListener(new i(bVar2, d10));
            d10.setOnFocusChangeListener(bVar2.f9540f);
            if (z10) {
                d10.setOnDismissListener(new j(bVar2));
            }
            boolean z11 = false;
            d10.setThreshold(0);
            d10.removeTextChangedListener(b.this.f9539e);
            d10.addTextChangedListener(b.this.f9539e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (d10.getKeyListener() != null) {
                z11 = true;
            }
            if (!z11 && b.this.f9549o.isTouchExplorationEnabled()) {
                c0.I(b.this.f26643c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f9541g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class e implements TextInputLayout.g {

        /* compiled from: DropdownMenuEndIconDelegate */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f9559a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f9559a = autoCompleteTextView;
            }

            public void run() {
                this.f9559a.removeTextChangedListener(b.this.f9539e);
            }
        }

        public e() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f9540f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (b.f9538r) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f26641a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class g implements AccessibilityManager.TouchExplorationStateChangeListener {
        public g() {
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            if (b.this.f26641a.getEditText() != null && !b.e(b.this.f26641a.getEditText())) {
                c0.I(b.this.f26643c, z10 ? 2 : 1);
            }
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z10) {
        if (bVar.f9545k != z10) {
            bVar.f9545k = z10;
            bVar.f9551q.cancel();
            bVar.f9550p.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        bVar.getClass();
        if (autoCompleteTextView != null) {
            if (bVar.k()) {
                bVar.f9544j = false;
            }
            if (!bVar.f9544j) {
                if (f9538r) {
                    boolean z10 = bVar.f9545k;
                    boolean z11 = !z10;
                    if (z10 != z11) {
                        bVar.f9545k = z11;
                        bVar.f9551q.cancel();
                        bVar.f9550p.start();
                    }
                } else {
                    bVar.f9545k = !bVar.f9545k;
                    bVar.f26643c.toggle();
                }
                if (bVar.f9545k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            bVar.f9544j = false;
        }
    }

    public static void h(b bVar) {
        bVar.f9544j = true;
        bVar.f9546l = System.currentTimeMillis();
    }

    public void a() {
        float dimensionPixelOffset = (float) this.f26642b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f26642b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f26642b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        s9.f j10 = j(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        s9.f j11 = j(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f9548n = j10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f9547m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, j10);
        this.f9547m.addState(new int[0], j11);
        int i10 = this.f26644d;
        if (i10 == 0) {
            i10 = f9538r ? R.drawable.mtrl_dropdown_arrow : R.drawable.mtrl_ic_arrow_drop_down;
        }
        this.f26641a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f26641a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f26641a.setEndIconOnClickListener(new f());
        this.f26641a.a(this.f9542h);
        this.f26641a.f9498r0.add(this.f9543i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = u8.a.f26148a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new h(this));
        this.f9551q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new h(this));
        this.f9550p = ofFloat2;
        ofFloat2.addListener(new v9.g(this));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f26642b.getSystemService("accessibility");
        this.f9549o = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityManager.addTouchExplorationStateChangeListener(new g());
        }
    }

    public boolean b(int i10) {
        return i10 != 0;
    }

    public final void i(AutoCompleteTextView autoCompleteTextView) {
        LayerDrawable layerDrawable;
        if (!(autoCompleteTextView.getKeyListener() != null)) {
            int boxBackgroundMode = this.f26641a.getBoxBackgroundMode();
            s9.f boxBackground = this.f26641a.getBoxBackground();
            int g10 = e.d.g(autoCompleteTextView, R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int g11 = e.d.g(autoCompleteTextView, R.attr.colorSurface);
                s9.f fVar = new s9.f(boxBackground.f25079a.f25098a);
                int k10 = e.d.k(g10, g11, 0.1f);
                fVar.r(new ColorStateList(iArr, new int[]{k10, 0}));
                if (f9538r) {
                    fVar.setTint(g11);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{k10, g11});
                    s9.f fVar2 = new s9.f(boxBackground.f25079a.f25098a);
                    fVar2.setTint(-1);
                    layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar, fVar2), boxBackground});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{fVar, boxBackground});
                }
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.q(autoCompleteTextView, layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f26641a.getBoxBackgroundColor();
                int[] iArr2 = {e.d.k(g10, boxBackgroundColor, 0.1f), boxBackgroundColor};
                if (f9538r) {
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                    WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                    c0.d.q(autoCompleteTextView, rippleDrawable);
                    return;
                }
                s9.f fVar3 = new s9.f(boxBackground.f25079a.f25098a);
                fVar3.r(new ColorStateList(iArr, iArr2));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, fVar3});
                WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                int f10 = c0.e.f(autoCompleteTextView);
                int paddingTop = autoCompleteTextView.getPaddingTop();
                int e10 = c0.e.e(autoCompleteTextView);
                int paddingBottom = autoCompleteTextView.getPaddingBottom();
                c0.d.q(autoCompleteTextView, layerDrawable2);
                c0.e.k(autoCompleteTextView, f10, paddingTop, e10, paddingBottom);
            }
        }
    }

    public final s9.f j(float f10, float f11, float f12, int i10) {
        i.b bVar = new i.b();
        bVar.f25137e = new s9.a(f10);
        bVar.f25138f = new s9.a(f10);
        bVar.f25140h = new s9.a(f11);
        bVar.f25139g = new s9.a(f11);
        s9.i a10 = bVar.a();
        Context context = this.f26642b;
        String str = s9.f.F;
        int c10 = p9.b.c(context, R.attr.colorSurface, s9.f.class.getSimpleName());
        s9.f fVar = new s9.f();
        fVar.f25079a.f25099b = new i9.a(context);
        fVar.z();
        fVar.r(ColorStateList.valueOf(c10));
        f.b bVar2 = fVar.f25079a;
        if (bVar2.f25112o != f12) {
            bVar2.f25112o = f12;
            fVar.z();
        }
        fVar.f25079a.f25098a = a10;
        fVar.invalidateSelf();
        f.b bVar3 = fVar.f25079a;
        if (bVar3.f25106i == null) {
            bVar3.f25106i = new Rect();
        }
        fVar.f25079a.f25106i.set(0, i10, 0, i10);
        fVar.invalidateSelf();
        return fVar;
    }

    public final boolean k() {
        long currentTimeMillis = System.currentTimeMillis() - this.f9546l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
