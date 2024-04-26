package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.startapp.startappsdk.R;
import f.s;
import o0.c0;
import o0.o0;

/* compiled from: BottomSheetDialog */
public class a extends s {

    /* renamed from: e  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f9011e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f9012f;

    /* renamed from: g  reason: collision with root package name */
    public CoordinatorLayout f9013g;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f9014h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9015i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9016r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9017s;

    /* renamed from: t  reason: collision with root package name */
    public BottomSheetBehavior.c f9018t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9019u;

    /* renamed from: v  reason: collision with root package name */
    public BottomSheetBehavior.c f9020v;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* compiled from: BottomSheetDialog */
    public class C0093a implements o0.s {
        public C0093a() {
        }

        public o0 a(View view, o0 o0Var) {
            a aVar = a.this;
            BottomSheetBehavior.c cVar = aVar.f9018t;
            if (cVar != null) {
                aVar.f9011e.T.remove(cVar);
            }
            a aVar2 = a.this;
            aVar2.f9018t = new f(aVar2.f9014h, o0Var, (C0093a) null);
            a aVar3 = a.this;
            aVar3.f9011e.s(aVar3.f9018t);
            return o0Var;
        }
    }

    /* compiled from: BottomSheetDialog */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f9015i && aVar.isShowing()) {
                a aVar2 = a.this;
                if (!aVar2.f9017s) {
                    TypedArray obtainStyledAttributes = aVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    aVar2.f9016r = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    aVar2.f9017s = true;
                }
                if (aVar2.f9016r) {
                    a.this.cancel();
                }
            }
        }
    }

    /* compiled from: BottomSheetDialog */
    public class c extends o0.a {
        public c() {
        }

        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            if (a.this.f9015i) {
                cVar.f23748a.addAction(1048576);
                if (Build.VERSION.SDK_INT >= 19) {
                    cVar.f23748a.setDismissable(true);
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                cVar.f23748a.setDismissable(false);
            }
        }

        public boolean g(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f9015i) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.g(view, i10, bundle);
        }
    }

    /* compiled from: BottomSheetDialog */
    public class d implements View.OnTouchListener {
        public d(a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog */
    public class e extends BottomSheetBehavior.c {
        public e() {
        }

        public void b(View view, float f10) {
        }

        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog */
    public static class f extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9025a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9026b;

        /* renamed from: c  reason: collision with root package name */
        public final o0 f9027c;

        public f(View view, o0 o0Var, C0093a aVar) {
            ColorStateList colorStateList;
            this.f9027c = o0Var;
            boolean z10 = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.f9026b = z10;
            s9.f fVar = BottomSheetBehavior.x(view).f8978h;
            if (fVar != null) {
                colorStateList = fVar.f25079a.f25101d;
            } else {
                colorStateList = c0.k(view);
            }
            if (colorStateList != null) {
                this.f9025a = e.d.h(colorStateList.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f9025a = e.d.h(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f9025a = z10;
            }
        }

        public void a(View view) {
            d(view);
        }

        public void b(View view, float f10) {
            d(view);
        }

        public void c(View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.f9027c.f()) {
                a.m(view, this.f9025a);
                view.setPadding(view.getPaddingLeft(), this.f9027c.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.m(view, this.f9026b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968699(0x7f04007b, float:1.754606E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2132083288(0x7f150258, float:1.9806714E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.f9015i = r0
            r3.f9016r = r0
            com.google.android.material.bottomsheet.a$e r4 = new com.google.android.material.bottomsheet.a$e
            r4.<init>()
            r3.f9020v = r4
            r3.j(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969001(0x7f0401a9, float:1.7546672E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f9019u = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.a.<init>(android.content.Context, int):void");
    }

    public static void m(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    public void cancel() {
        l();
        super.cancel();
    }

    public final FrameLayout k() {
        if (this.f9012f == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f9012f = frameLayout;
            this.f9013g = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f9012f.findViewById(R.id.design_bottom_sheet);
            this.f9014h = frameLayout2;
            BottomSheetBehavior<FrameLayout> x10 = BottomSheetBehavior.x(frameLayout2);
            this.f9011e = x10;
            x10.s(this.f9020v);
            this.f9011e.C(this.f9015i);
        }
        return this.f9012f;
    }

    public BottomSheetBehavior<FrameLayout> l() {
        if (this.f9011e == null) {
            k();
        }
        return this.f9011e;
    }

    public final View n(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9012f.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, coordinatorLayout, false);
        }
        if (this.f9019u) {
            c0.J(this.f9014h, new C0093a());
        }
        this.f9014h.removeAllViews();
        if (layoutParams == null) {
            this.f9014h.addView(view);
        } else {
            this.f9014h.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        c0.C(this.f9014h, new c());
        this.f9014h.setOnTouchListener(new d(this));
        return this.f9012f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 21) {
            boolean z10 = this.f9019u && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f9012f;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f9013g;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            if (z10) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (i10 < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9011e;
        if (bottomSheetBehavior != null && bottomSheetBehavior.J == 5) {
            bottomSheetBehavior.E(4);
        }
    }

    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f9015i != z10) {
            this.f9015i = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9011e;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z10);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f9015i) {
            this.f9015i = true;
        }
        this.f9016r = z10;
        this.f9017s = true;
    }

    public void setContentView(int i10) {
        super.setContentView(n(i10, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(n(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(n(0, view, layoutParams));
    }
}
