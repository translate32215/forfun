package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.k0;
import b2.n;
import com.google.android.material.internal.CheckableImageButton;
import com.startapp.startappsdk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l9.u;
import o0.c0;
import s9.i;
import v9.k;
import v9.l;
import v9.m;
import v9.r;

public class TextInputLayout extends LinearLayout {
    public boolean A;
    public ColorStateList A0;
    public TextView B;
    public PorterDuff.Mode B0;
    public ColorStateList C;
    public ColorStateList C0;
    public int D;
    public ColorStateList D0;
    public b2.d E;
    public int E0;
    public b2.d F;
    public int F0;
    public ColorStateList G;
    public int G0;
    public ColorStateList H;
    public ColorStateList H0;
    public CharSequence I;
    public int I0;
    public final TextView J;
    public int J0;
    public boolean K;
    public int K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public int M0;
    public s9.f N;
    public boolean N0;
    public s9.f O;
    public final com.google.android.material.internal.a O0;
    public s9.f P;
    public boolean P0;
    public i Q;
    public boolean Q0;
    public boolean R;
    public ValueAnimator R0;
    public final int S;
    public boolean S0;
    public boolean T0;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f9471a;

    /* renamed from: a0  reason: collision with root package name */
    public int f9472a0;

    /* renamed from: b  reason: collision with root package name */
    public final r f9473b;

    /* renamed from: b0  reason: collision with root package name */
    public int f9474b0;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f9475c;

    /* renamed from: c0  reason: collision with root package name */
    public int f9476c0;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f9477d;

    /* renamed from: d0  reason: collision with root package name */
    public int f9478d0;

    /* renamed from: e  reason: collision with root package name */
    public EditText f9479e;

    /* renamed from: e0  reason: collision with root package name */
    public int f9480e0;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f9481f;

    /* renamed from: f0  reason: collision with root package name */
    public int f9482f0;

    /* renamed from: g  reason: collision with root package name */
    public int f9483g = -1;

    /* renamed from: g0  reason: collision with root package name */
    public int f9484g0;

    /* renamed from: h  reason: collision with root package name */
    public int f9485h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f9486h0 = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public int f9487i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f9488i0 = new Rect();

    /* renamed from: j0  reason: collision with root package name */
    public final RectF f9489j0 = new RectF();

    /* renamed from: k0  reason: collision with root package name */
    public Typeface f9490k0;

    /* renamed from: l0  reason: collision with root package name */
    public Drawable f9491l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9492m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LinkedHashSet<f> f9493n0 = new LinkedHashSet<>();

    /* renamed from: o0  reason: collision with root package name */
    public int f9494o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public final SparseArray<k> f9495p0;

    /* renamed from: q0  reason: collision with root package name */
    public final CheckableImageButton f9496q0;

    /* renamed from: r  reason: collision with root package name */
    public int f9497r = -1;

    /* renamed from: r0  reason: collision with root package name */
    public final LinkedHashSet<g> f9498r0;

    /* renamed from: s  reason: collision with root package name */
    public final m f9499s = new m(this);

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f9500s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9501t;

    /* renamed from: t0  reason: collision with root package name */
    public PorterDuff.Mode f9502t0;

    /* renamed from: u  reason: collision with root package name */
    public int f9503u;

    /* renamed from: u0  reason: collision with root package name */
    public Drawable f9504u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9505v;

    /* renamed from: v0  reason: collision with root package name */
    public int f9506v0;

    /* renamed from: w  reason: collision with root package name */
    public TextView f9507w;

    /* renamed from: w0  reason: collision with root package name */
    public Drawable f9508w0;

    /* renamed from: x  reason: collision with root package name */
    public int f9509x;

    /* renamed from: x0  reason: collision with root package name */
    public View.OnLongClickListener f9510x0;

    /* renamed from: y  reason: collision with root package name */
    public int f9511y;

    /* renamed from: y0  reason: collision with root package name */
    public View.OnLongClickListener f9512y0;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f9513z;

    /* renamed from: z0  reason: collision with root package name */
    public final CheckableImageButton f9514z0;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.z(!textInputLayout.T0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f9501t) {
                textInputLayout2.s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.A) {
                textInputLayout3.A(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.f9496q0.performClick();
            TextInputLayout.this.f9496q0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.f9479e.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.O0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends o0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f9519d;

        public e(TextInputLayout textInputLayout) {
            this.f9519d = textInputLayout;
        }

        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            EditText editText = this.f9519d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f9519d.getHint();
            CharSequence error = this.f9519d.getError();
            CharSequence placeholderText = this.f9519d.getPlaceholderText();
            int counterMaxLength = this.f9519d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f9519d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f9519d.N0;
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : "";
            r rVar = this.f9519d.f9473b;
            if (rVar.f26678b.getVisibility() == 0) {
                cVar.f23748a.setLabelFor(rVar.f26678b);
                cVar.q(rVar.f26678b);
            } else {
                cVar.q(rVar.f26680d);
            }
            if (z10) {
                cVar.f23748a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.f23748a.setText(charSequence);
                if (z12 && placeholderText != null) {
                    cVar.f23748a.setText(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                cVar.f23748a.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    cVar.o(charSequence);
                } else {
                    if (z10) {
                        charSequence = text + ", " + charSequence;
                    }
                    cVar.f23748a.setText(charSequence);
                }
                boolean z15 = !z10;
                if (i10 >= 26) {
                    cVar.f23748a.setShowingHintText(z15);
                } else {
                    cVar.l(4, z15);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 21) {
                cVar.f23748a.setMaxTextLength(counterMaxLength);
            }
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                if (i11 >= 21) {
                    cVar.f23748a.setError(error);
                }
            }
            TextView textView = this.f9519d.f9499s.f26662r;
            if (textView != null) {
                cVar.f23748a.setLabelFor(textView);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    public static class h extends u0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f9520c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9521d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f9522e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f9523f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f9524g;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new h[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("TextInputLayout.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" error=");
            a10.append(this.f9520c);
            a10.append(" hint=");
            a10.append(this.f9522e);
            a10.append(" helperText=");
            a10.append(this.f9523f);
            a10.append(" placeholderText=");
            a10.append(this.f9524g);
            a10.append("}");
            return a10.toString();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            TextUtils.writeToParcel(this.f9520c, parcel, i10);
            parcel.writeInt(this.f9521d ? 1 : 0);
            TextUtils.writeToParcel(this.f9522e, parcel, i10);
            TextUtils.writeToParcel(this.f9523f, parcel, i10);
            TextUtils.writeToParcel(this.f9524g, parcel, i10);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9520c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9521d = parcel.readInt() != 1 ? false : true;
            this.f9522e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9523f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9524g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29) {
        /*
            r27 = this;
            r0 = r27
            r7 = r29
            r8 = 2130969848(0x7f0404f8, float:1.754839E38)
            r9 = 2132083563(0x7f15036b, float:1.9807272E38)
            r1 = r28
            android.content.Context r1 = w9.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f9483g = r10
            r0.f9485h = r10
            r0.f9487i = r10
            r0.f9497r = r10
            v9.m r1 = new v9.m
            r1.<init>(r0)
            r0.f9499s = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f9486h0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f9488i0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f9489j0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f9493n0 = r1
            r11 = 0
            r0.f9494o0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f9495p0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f9498r0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.O0 = r1
            android.content.Context r13 = r27.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f9471a = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f9477d = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f9475c = r5
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            r3 = 0
            r4.<init>(r13, r3)
            r0.J = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            r3 = 2131623992(0x7f0e0038, float:1.8875151E38)
            android.view.View r16 = r2.inflate(r3, r5, r11)
            r8 = r16
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r0.f9514z0 = r8
            android.view.View r2 = r2.inflate(r3, r6, r11)
            r3 = r2
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f9496q0 = r3
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r9 = 8388613(0x800005, float:1.175495E-38)
            r14 = -2
            r2.<init>(r14, r10, r9)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r14, r10)
            r6.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = u8.a.f26148a
            r1.S = r2
            r1.k(r11)
            r1.R = r2
            r1.k(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.n(r2)
            int[] r9 = t8.a.M
            r18 = 2132083563(0x7f15036b, float:1.9807272E38)
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {22, 20, 35, 40, 44} // fill-array
            r19 = 2130969848(0x7f0404f8, float:1.754839E38)
            r20 = r1
            r1 = r13
            r14 = 5
            r2 = r29
            r28 = r3
            r3 = r9
            r9 = r4
            r4 = r19
            r22 = r5
            r5 = r18
            r23 = r6
            r6 = r20
            androidx.appcompat.widget.g1 r1 = l9.r.e(r1, r2, r3, r4, r5, r6)
            v9.r r2 = new v9.r
            r2.<init>(r0, r1)
            r0.f9473b = r2
            r3 = 43
            r4 = 1
            boolean r3 = r1.a(r3, r4)
            r0.K = r3
            r3 = 4
            java.lang.CharSequence r3 = r1.o(r3)
            r0.setHint((java.lang.CharSequence) r3)
            r3 = 42
            boolean r3 = r1.a(r3, r4)
            r0.Q0 = r3
            r3 = 37
            boolean r3 = r1.a(r3, r4)
            r0.P0 = r3
            r3 = 6
            boolean r4 = r1.p(r3)
            r5 = 3
            if (r4 == 0) goto L_0x0131
            int r3 = r1.j(r3, r10)
            r0.setMinEms(r3)
            goto L_0x013e
        L_0x0131:
            boolean r3 = r1.p(r5)
            if (r3 == 0) goto L_0x013e
            int r3 = r1.f(r5, r10)
            r0.setMinWidth(r3)
        L_0x013e:
            boolean r3 = r1.p(r14)
            r4 = 2
            if (r3 == 0) goto L_0x014d
            int r3 = r1.j(r14, r10)
            r0.setMaxEms(r3)
            goto L_0x015a
        L_0x014d:
            boolean r3 = r1.p(r4)
            if (r3 == 0) goto L_0x015a
            int r3 = r1.f(r4, r10)
            r0.setMaxWidth(r3)
        L_0x015a:
            r3 = 2132083563(0x7f15036b, float:1.9807272E38)
            r6 = 2130969848(0x7f0404f8, float:1.754839E38)
            s9.i$b r3 = s9.i.c(r13, r7, r6, r3)
            s9.i r3 = r3.a()
            r0.Q = r3
            android.content.res.Resources r3 = r13.getResources()
            r6 = 2131165999(0x7f07032f, float:1.794623E38)
            int r3 = r3.getDimensionPixelOffset(r6)
            r0.S = r3
            r3 = 9
            int r3 = r1.e(r3, r11)
            r0.f9474b0 = r3
            r3 = 16
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131166000(0x7f070330, float:1.7946233E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r3 = r1.f(r3, r6)
            r0.f9478d0 = r3
            r3 = 17
            android.content.res.Resources r6 = r13.getResources()
            r7 = 2131166001(0x7f070331, float:1.7946235E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r3 = r1.f(r3, r6)
            r0.f9480e0 = r3
            int r3 = r0.f9478d0
            r0.f9476c0 = r3
            r3 = 13
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r6)
            r7 = 12
            float r7 = r1.d(r7, r6)
            r14 = 10
            float r14 = r1.d(r14, r6)
            r5 = 11
            float r5 = r1.d(r5, r6)
            s9.i r6 = r0.Q
            r6.getClass()
            s9.i$b r4 = new s9.i$b
            r4.<init>(r6)
            r6 = 0
            int r17 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r17 < 0) goto L_0x01d5
            r4.f(r3)
        L_0x01d5:
            int r3 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x01dc
            r4.g(r7)
        L_0x01dc:
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x01e3
            r4.e(r14)
        L_0x01e3:
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x01ea
            r4.d(r5)
        L_0x01ea:
            s9.i r3 = r4.a()
            r0.Q = r3
            r3 = 7
            android.content.res.ColorStateList r3 = p9.c.b(r13, r1, r3)
            if (r3 == 0) goto L_0x024f
            int r4 = r3.getDefaultColor()
            r0.I0 = r4
            r0.f9484g0 = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x022b
            r4 = 1
            int[] r6 = new int[r4]
            r6[r11] = r5
            int r4 = r3.getColorForState(r6, r10)
            r0.J0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.K0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            r0.L0 = r3
            goto L_0x0259
        L_0x022b:
            int r3 = r0.I0
            r0.K0 = r3
            r3 = 2131100269(0x7f06026d, float:1.7812915E38)
            android.content.res.ColorStateList r3 = g.a.a(r13, r3)
            r4 = 1
            int[] r6 = new int[r4]
            r6[r11] = r5
            int r5 = r3.getColorForState(r6, r10)
            r0.J0 = r5
            int[] r5 = new int[r4]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r5[r11] = r4
            int r3 = r3.getColorForState(r5, r10)
            r0.L0 = r3
            goto L_0x0259
        L_0x024f:
            r0.f9484g0 = r11
            r0.I0 = r11
            r0.J0 = r11
            r0.K0 = r11
            r0.L0 = r11
        L_0x0259:
            r3 = 1
            boolean r4 = r1.p(r3)
            if (r4 == 0) goto L_0x0268
            android.content.res.ColorStateList r4 = r1.c(r3)
            r0.D0 = r4
            r0.C0 = r4
        L_0x0268:
            r3 = 14
            android.content.res.ColorStateList r4 = p9.c.b(r13, r1, r3)
            int r3 = r1.b(r3, r11)
            r0.G0 = r3
            r3 = 2131100292(0x7f060284, float:1.7812961E38)
            int r3 = d0.a.b(r13, r3)
            r0.E0 = r3
            r3 = 2131100293(0x7f060285, float:1.7812963E38)
            int r3 = d0.a.b(r13, r3)
            r0.M0 = r3
            r3 = 2131100296(0x7f060288, float:1.781297E38)
            int r3 = d0.a.b(r13, r3)
            r0.F0 = r3
            if (r4 == 0) goto L_0x0294
            r0.setBoxStrokeColorStateList(r4)
        L_0x0294:
            r3 = 15
            boolean r4 = r1.p(r3)
            if (r4 == 0) goto L_0x02a3
            android.content.res.ColorStateList r3 = p9.c.b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x02a3:
            r3 = 44
            int r4 = r1.m(r3, r10)
            if (r4 == r10) goto L_0x02b2
            int r3 = r1.m(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x02b2:
            r3 = 35
            int r3 = r1.m(r3, r11)
            r4 = 30
            java.lang.CharSequence r4 = r1.o(r4)
            r5 = 31
            boolean r5 = r1.a(r5, r11)
            r6 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r8.setId(r6)
            boolean r6 = p9.c.d(r13)
            if (r6 == 0) goto L_0x02d9
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            o0.h.h(r6, r11)
        L_0x02d9:
            r6 = 33
            boolean r7 = r1.p(r6)
            if (r7 == 0) goto L_0x02e7
            android.content.res.ColorStateList r6 = p9.c.b(r13, r1, r6)
            r0.A0 = r6
        L_0x02e7:
            r6 = 34
            boolean r7 = r1.p(r6)
            if (r7 == 0) goto L_0x02fb
            int r6 = r1.j(r6, r10)
            r7 = 0
            android.graphics.PorterDuff$Mode r6 = l9.u.d(r6, r7)
            r0.B0 = r6
            goto L_0x02fc
        L_0x02fb:
            r7 = 0
        L_0x02fc:
            r6 = 32
            boolean r14 = r1.p(r6)
            if (r14 == 0) goto L_0x030b
            android.graphics.drawable.Drawable r6 = r1.g(r6)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x030b:
            android.content.res.Resources r6 = r27.getResources()
            r14 = 2132017222(0x7f140046, float:1.9672716E38)
            java.lang.CharSequence r6 = r6.getText(r14)
            r8.setContentDescription(r6)
            r6 = 2
            o0.c0.I(r8, r6)
            r8.setClickable(r11)
            r8.setPressable(r11)
            r8.setFocusable(r11)
            r6 = 40
            int r6 = r1.m(r6, r11)
            r14 = 39
            boolean r14 = r1.a(r14, r11)
            r7 = 38
            java.lang.CharSequence r7 = r1.o(r7)
            r10 = 52
            int r10 = r1.m(r10, r11)
            r11 = 51
            java.lang.CharSequence r11 = r1.o(r11)
            r29 = r7
            r7 = 65
            r19 = r5
            r5 = 0
            int r7 = r1.m(r7, r5)
            r5 = 64
            java.lang.CharSequence r5 = r1.o(r5)
            r20 = r5
            r5 = 18
            r24 = r14
            r14 = 0
            boolean r5 = r1.a(r5, r14)
            r14 = 19
            r25 = r5
            r5 = -1
            int r14 = r1.j(r14, r5)
            r0.setCounterMaxLength(r14)
            r5 = 22
            r14 = 0
            int r5 = r1.m(r5, r14)
            r0.f9511y = r5
            r5 = 20
            int r5 = r1.m(r5, r14)
            r0.f9509x = r5
            r5 = 8
            int r5 = r1.j(r5, r14)
            r0.setBoxBackgroundMode(r5)
            boolean r5 = p9.c.d(r13)
            if (r5 == 0) goto L_0x0395
            android.view.ViewGroup$LayoutParams r5 = r28.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            o0.h.h(r5, r14)
        L_0x0395:
            r5 = 26
            r21 = r2
            int r2 = r1.m(r5, r14)
            v9.e r5 = new v9.e
            r5.<init>(r0, r2)
            r14 = -1
            r12.append(r14, r5)
            v9.q r5 = new v9.q
            r5.<init>(r0)
            r14 = 0
            r12.append(r14, r5)
            com.google.android.material.textfield.c r5 = new com.google.android.material.textfield.c
            if (r2 != 0) goto L_0x03bc
            r26 = r15
            r15 = 47
            int r15 = r1.m(r15, r14)
            goto L_0x03bf
        L_0x03bc:
            r26 = r15
            r15 = r2
        L_0x03bf:
            r5.<init>(r0, r15)
            r14 = 1
            r12.append(r14, r5)
            com.google.android.material.textfield.a r5 = new com.google.android.material.textfield.a
            r5.<init>(r0, r2)
            r14 = 2
            r12.append(r14, r5)
            com.google.android.material.textfield.b r5 = new com.google.android.material.textfield.b
            r5.<init>(r0, r2)
            r2 = 3
            r12.append(r2, r5)
            r2 = 48
            boolean r5 = r1.p(r2)
            if (r5 != 0) goto L_0x0402
            r5 = 28
            boolean r12 = r1.p(r5)
            if (r12 == 0) goto L_0x03ee
            android.content.res.ColorStateList r5 = p9.c.b(r13, r1, r5)
            r0.f9500s0 = r5
        L_0x03ee:
            r5 = 29
            boolean r12 = r1.p(r5)
            if (r12 == 0) goto L_0x0402
            r12 = -1
            int r5 = r1.j(r5, r12)
            r12 = 0
            android.graphics.PorterDuff$Mode r5 = l9.u.d(r5, r12)
            r0.f9502t0 = r5
        L_0x0402:
            r5 = 27
            boolean r12 = r1.p(r5)
            if (r12 == 0) goto L_0x042c
            r12 = 0
            int r2 = r1.j(r5, r12)
            r0.setEndIconMode(r2)
            r2 = 25
            boolean r5 = r1.p(r2)
            if (r5 == 0) goto L_0x0421
            java.lang.CharSequence r2 = r1.o(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0421:
            r2 = 24
            r5 = 1
            boolean r2 = r1.a(r2, r5)
            r0.setEndIconCheckable(r2)
            goto L_0x0465
        L_0x042c:
            boolean r5 = r1.p(r2)
            if (r5 == 0) goto L_0x0465
            r5 = 49
            boolean r12 = r1.p(r5)
            if (r12 == 0) goto L_0x0440
            android.content.res.ColorStateList r5 = p9.c.b(r13, r1, r5)
            r0.f9500s0 = r5
        L_0x0440:
            r5 = 50
            boolean r12 = r1.p(r5)
            if (r12 == 0) goto L_0x0454
            r12 = -1
            int r5 = r1.j(r5, r12)
            r12 = 0
            android.graphics.PorterDuff$Mode r5 = l9.u.d(r5, r12)
            r0.f9502t0 = r5
        L_0x0454:
            r5 = 0
            boolean r2 = r1.a(r2, r5)
            r0.setEndIconMode(r2)
            r2 = 46
            java.lang.CharSequence r2 = r1.o(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0465:
            r2 = 2131428087(0x7f0b02f7, float:1.8477809E38)
            r9.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r5 = 80
            r12 = -2
            r2.<init>(r12, r12, r5)
            r9.setLayoutParams(r2)
            r2 = 1
            o0.c0.D(r9, r2)
            r0.setErrorContentDescription(r4)
            int r2 = r0.f9509x
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r6)
            r0.setErrorTextAppearance(r3)
            int r2 = r0.f9511y
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r11)
            r0.setPlaceholderTextAppearance(r10)
            r0.setSuffixTextAppearance(r7)
            r2 = 36
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x04a5
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x04a5:
            r2 = 41
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x04b4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x04b4:
            r2 = 45
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x04c3
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x04c3:
            r2 = 23
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x04d2
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x04d2:
            r2 = 21
            boolean r2 = r1.p(r2)
            if (r2 == 0) goto L_0x04e3
            r2 = 21
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x04e3:
            r2 = 53
            boolean r2 = r1.p(r2)
            if (r2 == 0) goto L_0x04f4
            r2 = 53
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x04f4:
            r2 = 66
            boolean r2 = r1.p(r2)
            if (r2 == 0) goto L_0x0505
            r2 = 66
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x0505:
            r2 = 1
            r3 = 0
            boolean r3 = r1.a(r3, r2)
            r0.setEnabled(r3)
            android.content.res.TypedArray r1 = r1.f924b
            r1.recycle()
            r1 = 2
            o0.c0.I(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0522
            if (r1 < r3) goto L_0x0522
            o0.c0.l.l(r0, r2)
        L_0x0522:
            r2 = r28
            r1 = r23
            r1.addView(r2)
            r2 = r22
            r2.addView(r9)
            r2.addView(r8)
            r2.addView(r1)
            r3 = r21
            r1 = r26
            r1.addView(r3)
            r1.addView(r2)
            r0.addView(r1)
            r1 = r24
            r0.setHelperTextEnabled(r1)
            r1 = r19
            r0.setErrorEnabled(r1)
            r1 = r25
            r0.setCounterEnabled(r1)
            r1 = r29
            r0.setHelperText(r1)
            r1 = r20
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private k getEndIconDelegate() {
        k kVar = this.f9495p0.get(this.f9494o0);
        return kVar != null ? kVar : this.f9495p0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f9514z0.getVisibility() == 0) {
            return this.f9514z0;
        }
        if (!h() || !j()) {
            return null;
        }
        return this.f9496q0;
    }

    public static void n(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt, z10);
            }
        }
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean a10 = c0.c.a(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (a10 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        c0.I(checkableImageButton, i10);
    }

    private void setEditText(EditText editText) {
        if (this.f9479e == null) {
            if (this.f9494o0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9479e = editText;
            int i10 = this.f9483g;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f9487i);
            }
            int i11 = this.f9485h;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f9497r);
            }
            l();
            setTextInputAccessibilityDelegate(new e(this));
            this.O0.r(this.f9479e.getTypeface());
            com.google.android.material.internal.a aVar = this.O0;
            float textSize = this.f9479e.getTextSize();
            if (aVar.f9333j != textSize) {
                aVar.f9333j = textSize;
                aVar.k(false);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                com.google.android.material.internal.a aVar2 = this.O0;
                float letterSpacing = this.f9479e.getLetterSpacing();
                if (aVar2.Y != letterSpacing) {
                    aVar2.Y = letterSpacing;
                    aVar2.k(false);
                }
            }
            int gravity = this.f9479e.getGravity();
            this.O0.n((gravity & -113) | 48);
            com.google.android.material.internal.a aVar3 = this.O0;
            if (aVar3.f9331h != gravity) {
                aVar3.f9331h = gravity;
                aVar3.k(false);
            }
            this.f9479e.addTextChangedListener(new a());
            if (this.C0 == null) {
                this.C0 = this.f9479e.getHintTextColors();
            }
            if (this.K) {
                if (TextUtils.isEmpty(this.L)) {
                    CharSequence hint = this.f9479e.getHint();
                    this.f9481f = hint;
                    setHint(hint);
                    this.f9479e.setHint((CharSequence) null);
                }
                this.M = true;
            }
            if (this.f9507w != null) {
                s(this.f9479e.getText().length());
            }
            v();
            this.f9499s.b();
            this.f9473b.bringToFront();
            this.f9475c.bringToFront();
            this.f9477d.bringToFront();
            this.f9514z0.bringToFront();
            Iterator it = this.f9493n0.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(this);
            }
            C();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            z(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.L)) {
            this.L = charSequence;
            com.google.android.material.internal.a aVar = this.O0;
            if (charSequence == null || !TextUtils.equals(aVar.B, charSequence)) {
                aVar.B = charSequence;
                aVar.C = null;
                Bitmap bitmap = aVar.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    aVar.F = null;
                }
                aVar.k(false);
            }
            if (!this.N0) {
                m();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.A != z10) {
            if (z10) {
                TextView textView = this.B;
                if (textView != null) {
                    this.f9471a.addView(textView);
                    this.B.setVisibility(0);
                }
            } else {
                TextView textView2 = this.B;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.B = null;
            }
            this.A = z10;
        }
    }

    public final void A(int i10) {
        if (i10 != 0 || this.N0) {
            i();
        } else if (this.B != null && this.A && !TextUtils.isEmpty(this.f9513z)) {
            this.B.setText(this.f9513z);
            n.a(this.f9471a, this.E);
            this.B.setVisibility(0);
            this.B.bringToFront();
            announceForAccessibility(this.f9513z);
        }
    }

    public final void B(boolean z10, boolean z11) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f9482f0 = colorForState2;
        } else if (z11) {
            this.f9482f0 = colorForState;
        } else {
            this.f9482f0 = defaultColor;
        }
    }

    public final void C() {
        int i10;
        if (this.f9479e != null) {
            if (j() || k()) {
                i10 = 0;
            } else {
                EditText editText = this.f9479e;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                i10 = c0.e.e(editText);
            }
            TextView textView = this.J;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f9479e.getPaddingTop();
            int paddingBottom = this.f9479e.getPaddingBottom();
            WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
            c0.e.k(textView, dimensionPixelSize, paddingTop, i10, paddingBottom);
        }
    }

    public final void D() {
        int visibility = this.J.getVisibility();
        boolean z10 = false;
        int i10 = (this.I == null || this.N0) ? 8 : 0;
        if (visibility != i10) {
            k endIconDelegate = getEndIconDelegate();
            if (i10 == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        w();
        this.J.setVisibility(i10);
        u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f9479e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E() {
        /*
            r6 = this;
            s9.f r0 = r6.N
            if (r0 == 0) goto L_0x0130
            int r0 = r6.f9472a0
            if (r0 != 0) goto L_0x000a
            goto L_0x0130
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f9479e
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r6.f9479e
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = r6.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r6.M0
            r6.f9482f0 = r3
            goto L_0x007e
        L_0x003c:
            v9.m r3 = r6.f9499s
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0055
            android.content.res.ColorStateList r3 = r6.H0
            if (r3 == 0) goto L_0x004c
            r6.B(r0, r1)
            goto L_0x007e
        L_0x004c:
            v9.m r3 = r6.f9499s
            int r3 = r3.g()
            r6.f9482f0 = r3
            goto L_0x007e
        L_0x0055:
            boolean r3 = r6.f9505v
            if (r3 == 0) goto L_0x006c
            android.widget.TextView r3 = r6.f9507w
            if (r3 == 0) goto L_0x006c
            android.content.res.ColorStateList r4 = r6.H0
            if (r4 == 0) goto L_0x0065
            r6.B(r0, r1)
            goto L_0x007e
        L_0x0065:
            int r3 = r3.getCurrentTextColor()
            r6.f9482f0 = r3
            goto L_0x007e
        L_0x006c:
            if (r0 == 0) goto L_0x0073
            int r3 = r6.G0
            r6.f9482f0 = r3
            goto L_0x007e
        L_0x0073:
            if (r1 == 0) goto L_0x007a
            int r3 = r6.F0
            r6.f9482f0 = r3
            goto L_0x007e
        L_0x007a:
            int r3 = r6.E0
            r6.f9482f0 = r3
        L_0x007e:
            r6.x()
            com.google.android.material.internal.CheckableImageButton r3 = r6.f9514z0
            android.content.res.ColorStateList r4 = r6.A0
            v9.l.c(r6, r3, r4)
            v9.r r3 = r6.f9473b
            com.google.android.material.textfield.TextInputLayout r4 = r3.f26677a
            com.google.android.material.internal.CheckableImageButton r5 = r3.f26680d
            android.content.res.ColorStateList r3 = r3.f26681e
            v9.l.c(r4, r5, r3)
            r6.o()
            v9.k r3 = r6.getEndIconDelegate()
            r3.getClass()
            boolean r3 = r3 instanceof com.google.android.material.textfield.b
            if (r3 == 0) goto L_0x00d3
            v9.m r3 = r6.f9499s
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x00ca
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            if (r3 == 0) goto L_0x00ca
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r3 = androidx.core.graphics.drawable.a.n(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            v9.m r4 = r6.f9499s
            int r4 = r4.g()
            androidx.core.graphics.drawable.a.k(r3, r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.f9496q0
            r4.setImageDrawable(r3)
            goto L_0x00d3
        L_0x00ca:
            com.google.android.material.internal.CheckableImageButton r3 = r6.f9496q0
            android.content.res.ColorStateList r4 = r6.f9500s0
            android.graphics.PorterDuff$Mode r5 = r6.f9502t0
            v9.l.a(r6, r3, r4, r5)
        L_0x00d3:
            int r3 = r6.f9472a0
            r4 = 2
            if (r3 != r4) goto L_0x010a
            int r3 = r6.f9476c0
            if (r0 == 0) goto L_0x00e7
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x00e7
            int r4 = r6.f9480e0
            r6.f9476c0 = r4
            goto L_0x00eb
        L_0x00e7:
            int r4 = r6.f9478d0
            r6.f9476c0 = r4
        L_0x00eb:
            int r4 = r6.f9476c0
            if (r4 == r3) goto L_0x010a
            boolean r3 = r6.e()
            if (r3 == 0) goto L_0x010a
            boolean r3 = r6.N0
            if (r3 != 0) goto L_0x010a
            boolean r3 = r6.e()
            if (r3 == 0) goto L_0x0107
            s9.f r3 = r6.N
            v9.f r3 = (v9.f) r3
            r4 = 0
            r3.A(r4, r4, r4, r4)
        L_0x0107:
            r6.m()
        L_0x010a:
            int r3 = r6.f9472a0
            if (r3 != r2) goto L_0x012d
            boolean r2 = r6.isEnabled()
            if (r2 != 0) goto L_0x0119
            int r0 = r6.J0
            r6.f9484g0 = r0
            goto L_0x012d
        L_0x0119:
            if (r1 == 0) goto L_0x0122
            if (r0 != 0) goto L_0x0122
            int r0 = r6.L0
            r6.f9484g0 = r0
            goto L_0x012d
        L_0x0122:
            if (r0 == 0) goto L_0x0129
            int r0 = r6.K0
            r6.f9484g0 = r0
            goto L_0x012d
        L_0x0129:
            int r0 = r6.I0
            r6.f9484g0 = r0
        L_0x012d:
            r6.c()
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E():void");
    }

    public void a(f fVar) {
        this.f9493n0.add(fVar);
        if (this.f9479e != null) {
            fVar.a(this);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f9471a.addView(view, layoutParams2);
            this.f9471a.setLayoutParams(layoutParams);
            y();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public void b(float f10) {
        if (this.O0.f9322c != f10) {
            if (this.R0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.R0 = valueAnimator;
                valueAnimator.setInterpolator(u8.a.f26149b);
                this.R0.setDuration(167);
                this.R0.addUpdateListener(new d());
            }
            this.R0.setFloatValues(new float[]{this.O0.f9322c, f10});
            this.R0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            s9.f r0 = r7.N
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            s9.f$b r1 = r0.f25079a
            s9.i r1 = r1.f25098a
            s9.i r2 = r7.Q
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L_0x004a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.f9494o0
            if (r0 != r3) goto L_0x004a
            int r0 = r7.f9472a0
            if (r0 != r4) goto L_0x004a
            android.util.SparseArray<v9.k> r0 = r7.f9495p0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.b r0 = (com.google.android.material.textfield.b) r0
            android.widget.EditText r1 = r7.f9479e
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            r0.getClass()
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x004a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f26641a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L_0x004a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r0.i(r1)
        L_0x004a:
            int r0 = r7.f9472a0
            r1 = -1
            if (r0 != r4) goto L_0x005e
            int r0 = r7.f9476c0
            if (r0 <= r1) goto L_0x0059
            int r0 = r7.f9482f0
            if (r0 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x006b
            s9.f r0 = r7.N
            int r2 = r7.f9476c0
            float r2 = (float) r2
            int r4 = r7.f9482f0
            r0.u(r2, r4)
        L_0x006b:
            int r0 = r7.f9484g0
            int r2 = r7.f9472a0
            if (r2 != r6) goto L_0x0082
            r0 = 2130968866(0x7f040122, float:1.7546398E38)
            android.content.Context r2 = r7.getContext()
            int r0 = e.d.f(r2, r0, r5)
            int r2 = r7.f9484g0
            int r0 = g0.a.b(r2, r0)
        L_0x0082:
            r7.f9484g0 = r0
            s9.f r2 = r7.N
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.r(r0)
            int r0 = r7.f9494o0
            if (r0 != r3) goto L_0x009a
            android.widget.EditText r0 = r7.f9479e
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x009a:
            s9.f r0 = r7.O
            if (r0 == 0) goto L_0x00d4
            s9.f r2 = r7.P
            if (r2 != 0) goto L_0x00a3
            goto L_0x00d4
        L_0x00a3:
            int r2 = r7.f9476c0
            if (r2 <= r1) goto L_0x00ac
            int r1 = r7.f9482f0
            if (r1 == 0) goto L_0x00ac
            r5 = 1
        L_0x00ac:
            if (r5 == 0) goto L_0x00d1
            android.widget.EditText r1 = r7.f9479e
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x00bd
            int r1 = r7.E0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x00c3
        L_0x00bd:
            int r1 = r7.f9482f0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00c3:
            r0.r(r1)
            s9.f r0 = r7.P
            int r1 = r7.f9482f0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.r(r1)
        L_0x00d1:
            r7.invalidate()
        L_0x00d4:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final int d() {
        float e10;
        if (!this.K) {
            return 0;
        }
        int i10 = this.f9472a0;
        if (i10 == 0) {
            e10 = this.O0.e();
        } else if (i10 != 2) {
            return 0;
        } else {
            e10 = this.O0.e() / 2.0f;
        }
        return (int) e10;
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f9479e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f9481f != null) {
            boolean z10 = this.M;
            this.M = false;
            CharSequence hint = editText.getHint();
            this.f9479e.setHint(this.f9481f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f9479e.setHint(hint);
                this.M = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f9471a.getChildCount());
            for (int i11 = 0; i11 < this.f9471a.getChildCount(); i11++) {
                View childAt = this.f9471a.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f9479e) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    public void draw(Canvas canvas) {
        s9.f fVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        if (this.K) {
            com.google.android.material.internal.a aVar = this.O0;
            aVar.getClass();
            int save = canvas.save();
            if (aVar.C != null && aVar.f9320b) {
                aVar.P.setTextSize(aVar.I);
                float f10 = aVar.f9341r;
                float f11 = aVar.f9342s;
                boolean z10 = aVar.E && aVar.F != null;
                float f12 = aVar.H;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                if (z10) {
                    canvas2.drawBitmap(aVar.F, f10, f11, aVar.G);
                    canvas2.restoreToCount(save);
                } else {
                    if (aVar.s()) {
                        float lineStart = aVar.f9341r - ((float) aVar.f9319a0.getLineStart(0));
                        int alpha = aVar.P.getAlpha();
                        canvas2.translate(lineStart, f11);
                        float f13 = (float) alpha;
                        aVar.P.setAlpha((int) (aVar.f9325d0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            TextPaint textPaint = aVar.P;
                            float f14 = aVar.J;
                            float f15 = aVar.K;
                            float f16 = aVar.L;
                            int i11 = aVar.M;
                            textPaint.setShadowLayer(f14, f15, f16, g0.a.e(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                        }
                        aVar.f9319a0.draw(canvas2);
                        aVar.P.setAlpha((int) (aVar.f9323c0 * f13));
                        if (i10 >= 31) {
                            TextPaint textPaint2 = aVar.P;
                            float f17 = aVar.J;
                            float f18 = aVar.K;
                            float f19 = aVar.L;
                            int i12 = aVar.M;
                            textPaint2.setShadowLayer(f17, f18, f19, g0.a.e(i12, (Color.alpha(i12) * textPaint2.getAlpha()) / 255));
                        }
                        int lineBaseline = aVar.f9319a0.getLineBaseline(0);
                        CharSequence charSequence = aVar.f9327e0;
                        float f20 = (float) lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, aVar.P);
                        if (i10 >= 31) {
                            aVar.P.setShadowLayer(aVar.J, aVar.K, aVar.L, aVar.M);
                        }
                        String trim = aVar.f9327e0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        aVar.P.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(aVar.f9319a0.getLineEnd(0), str.length()), 0.0f, f20, aVar.P);
                    } else {
                        canvas2.translate(f10, f11);
                        aVar.f9319a0.draw(canvas2);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.P != null && (fVar = this.O) != null) {
            fVar.draw(canvas2);
            if (this.f9479e.isFocused()) {
                Rect bounds = this.P.getBounds();
                Rect bounds2 = this.O.getBounds();
                float f21 = this.O0.f9322c;
                int centerX = bounds2.centerX();
                bounds.left = u8.a.c(centerX, bounds2.left, f21);
                bounds.right = u8.a.c(centerX, bounds2.right, f21);
                this.P.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f9335l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.S0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.S0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            com.google.android.material.internal.a r2 = r4.O0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.N = r1
            android.content.res.ColorStateList r1 = r2.f9336m
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f9335l
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.k(r3)
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.widget.EditText r2 = r4.f9479e
            if (r2 == 0) goto L_0x004d
            boolean r2 = o0.c0.r(r4)
            if (r2 == 0) goto L_0x0049
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r4.z(r0, r3)
        L_0x004d:
            r4.v()
            r4.E()
            if (r1 == 0) goto L_0x0058
            r4.invalidate()
        L_0x0058:
            r4.S0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.K && !TextUtils.isEmpty(this.L) && (this.N instanceof v9.f);
    }

    public final int f(int i10, boolean z10) {
        int compoundPaddingLeft = this.f9479e.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f9479e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public int getBaseline() {
        EditText editText = this.f9479e;
        if (editText == null) {
            return super.getBaseline();
        }
        return d() + getPaddingTop() + editText.getBaseline();
    }

    public s9.f getBoxBackground() {
        int i10 = this.f9472a0;
        if (i10 == 1 || i10 == 2) {
            return this.N;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f9484g0;
    }

    public int getBoxBackgroundMode() {
        return this.f9472a0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f9474b0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (u.c(this)) {
            return this.Q.f25128h.a(this.f9489j0);
        }
        return this.Q.f25127g.a(this.f9489j0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (u.c(this)) {
            return this.Q.f25127g.a(this.f9489j0);
        }
        return this.Q.f25128h.a(this.f9489j0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (u.c(this)) {
            return this.Q.f25125e.a(this.f9489j0);
        }
        return this.Q.f25126f.a(this.f9489j0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (u.c(this)) {
            return this.Q.f25126f.a(this.f9489j0);
        }
        return this.Q.f25125e.a(this.f9489j0);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.f9478d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f9480e0;
    }

    public int getCounterMaxLength() {
        return this.f9503u;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f9501t || !this.f9505v || (textView = this.f9507w) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.G;
    }

    public ColorStateList getCounterTextColor() {
        return this.G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.f9479e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9496q0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9496q0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f9494o0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9496q0;
    }

    public CharSequence getError() {
        m mVar = this.f9499s;
        if (mVar.f26655k) {
            return mVar.f26654j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f9499s.f26657m;
    }

    public int getErrorCurrentTextColors() {
        return this.f9499s.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f9514z0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f9499s.g();
    }

    public CharSequence getHelperText() {
        m mVar = this.f9499s;
        if (mVar.f26661q) {
            return mVar.f26660p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f9499s.f26662r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.K) {
            return this.L;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.O0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.O0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public int getMaxEms() {
        return this.f9485h;
    }

    public int getMaxWidth() {
        return this.f9497r;
    }

    public int getMinEms() {
        return this.f9483g;
    }

    public int getMinWidth() {
        return this.f9487i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9496q0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9496q0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A) {
            return this.f9513z;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.D;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.C;
    }

    public CharSequence getPrefixText() {
        return this.f9473b.f26679c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f9473b.f26678b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f9473b.f26678b;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9473b.f26680d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9473b.f26680d.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.J;
    }

    public Typeface getTypeface() {
        return this.f9490k0;
    }

    public final boolean h() {
        return this.f9494o0 != 0;
    }

    public final void i() {
        TextView textView = this.B;
        if (textView != null && this.A) {
            textView.setText((CharSequence) null);
            n.a(this.f9471a, this.F);
            this.B.setVisibility(4);
        }
    }

    public boolean j() {
        return this.f9477d.getVisibility() == 0 && this.f9496q0.getVisibility() == 0;
    }

    public final boolean k() {
        return this.f9514z0.getVisibility() == 0;
    }

    public final void l() {
        int i10 = this.f9472a0;
        if (i10 == 0) {
            this.N = null;
            this.O = null;
            this.P = null;
        } else if (i10 == 1) {
            this.N = new s9.f(this.Q);
            this.O = new s9.f();
            this.P = new s9.f();
        } else if (i10 == 2) {
            if (!this.K || (this.N instanceof v9.f)) {
                this.N = new s9.f(this.Q);
            } else {
                this.N = new v9.f(this.Q);
            }
            this.O = null;
            this.P = null;
        } else {
            throw new IllegalArgumentException(v.e.a(new StringBuilder(), this.f9472a0, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText = this.f9479e;
        if ((editText == null || this.N == null || editText.getBackground() != null || this.f9472a0 == 0) ? false : true) {
            EditText editText2 = this.f9479e;
            s9.f fVar = this.N;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.q(editText2, fVar);
        }
        E();
        if (this.f9472a0 == 1) {
            if (p9.c.e(getContext())) {
                this.f9474b0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (p9.c.d(getContext())) {
                this.f9474b0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f9479e != null && this.f9472a0 == 1) {
            if (p9.c.e(getContext())) {
                EditText editText3 = this.f9479e;
                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                c0.e.k(editText3, c0.e.f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), c0.e.e(this.f9479e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (p9.c.d(getContext())) {
                EditText editText4 = this.f9479e;
                WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                c0.e.k(editText4, c0.e.f(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), c0.e.e(this.f9479e), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f9472a0 != 0) {
            y();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r13 = this;
            boolean r0 = r13.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r13.f9489j0
            com.google.android.material.internal.a r1 = r13.O0
            android.widget.EditText r2 = r13.f9479e
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r13.f9479e
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.B
            boolean r4 = r1.b(r4)
            r1.D = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x0053
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0045
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.graphics.Rect r10 = r1.f9328f
            if (r4 == 0) goto L_0x0042
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f9321b0
            goto L_0x0058
        L_0x0042:
            int r10 = r10.left
            goto L_0x004b
        L_0x0045:
            android.graphics.Rect r10 = r1.f9328f
            if (r4 == 0) goto L_0x004d
            int r10 = r10.left
        L_0x004b:
            float r10 = (float) r10
            goto L_0x0059
        L_0x004d:
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f9321b0
            goto L_0x0058
        L_0x0053:
            float r10 = (float) r2
            float r10 = r10 / r8
            float r11 = r1.f9321b0
            float r11 = r11 / r8
        L_0x0058:
            float r10 = r10 - r11
        L_0x0059:
            r0.left = r10
            android.graphics.Rect r11 = r1.f9328f
            int r12 = r11.top
            float r12 = (float) r12
            r0.top = r12
            if (r3 == r7) goto L_0x0085
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0069
            goto L_0x0085
        L_0x0069:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x007b
            r2 = r3 & 5
            if (r2 != r9) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            int r2 = r11.right
            goto L_0x0083
        L_0x0077:
            float r2 = r1.f9321b0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x007b:
            if (r4 == 0) goto L_0x0081
            float r2 = r1.f9321b0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x0081:
            int r2 = r11.right
        L_0x0083:
            float r2 = (float) r2
            goto L_0x008b
        L_0x0085:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.f9321b0
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x008b:
            r0.right = r2
            float r1 = r1.e()
            float r1 = r1 + r12
            r0.bottom = r1
            float r1 = r0.left
            int r2 = r13.S
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r13.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r13.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r13.f9476c0
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            s9.f r1 = r13.N
            v9.f r1 = (v9.f) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.A(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():void");
    }

    public void o() {
        l.c(this, this.f9496q0, this.f9500s0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O0.i(configuration);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f9479e;
        if (editText != null) {
            Rect rect = this.f9486h0;
            l9.e.a(this, editText, rect);
            s9.f fVar = this.O;
            if (fVar != null) {
                int i16 = rect.bottom;
                fVar.setBounds(rect.left, i16 - this.f9478d0, rect.right, i16);
            }
            s9.f fVar2 = this.P;
            if (fVar2 != null) {
                int i17 = rect.bottom;
                fVar2.setBounds(rect.left, i17 - this.f9480e0, rect.right, i17);
            }
            if (this.K) {
                com.google.android.material.internal.a aVar = this.O0;
                float textSize = this.f9479e.getTextSize();
                if (aVar.f9333j != textSize) {
                    aVar.f9333j = textSize;
                    aVar.k(false);
                }
                int gravity = this.f9479e.getGravity();
                this.O0.n((gravity & -113) | 48);
                com.google.android.material.internal.a aVar2 = this.O0;
                if (aVar2.f9331h != gravity) {
                    aVar2.f9331h = gravity;
                    aVar2.k(false);
                }
                com.google.android.material.internal.a aVar3 = this.O0;
                if (this.f9479e != null) {
                    Rect rect2 = this.f9488i0;
                    boolean c10 = u.c(this);
                    rect2.bottom = rect.bottom;
                    int i18 = this.f9472a0;
                    if (i18 == 1) {
                        rect2.left = f(rect.left, c10);
                        rect2.top = rect.top + this.f9474b0;
                        rect2.right = g(rect.right, c10);
                    } else if (i18 != 2) {
                        rect2.left = f(rect.left, c10);
                        rect2.top = getPaddingTop();
                        rect2.right = g(rect.right, c10);
                    } else {
                        rect2.left = this.f9479e.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - d();
                        rect2.right = rect.right - this.f9479e.getPaddingRight();
                    }
                    aVar3.getClass();
                    int i19 = rect2.left;
                    int i20 = rect2.top;
                    int i21 = rect2.right;
                    int i22 = rect2.bottom;
                    if (!com.google.android.material.internal.a.l(aVar3.f9328f, i19, i20, i21, i22)) {
                        aVar3.f9328f.set(i19, i20, i21, i22);
                        aVar3.O = true;
                        aVar3.j();
                    }
                    com.google.android.material.internal.a aVar4 = this.O0;
                    if (this.f9479e != null) {
                        Rect rect3 = this.f9488i0;
                        TextPaint textPaint = aVar4.Q;
                        textPaint.setTextSize(aVar4.f9333j);
                        textPaint.setTypeface(aVar4.f9346w);
                        if (Build.VERSION.SDK_INT >= 21) {
                            textPaint.setLetterSpacing(aVar4.Y);
                        }
                        float f10 = -aVar4.Q.ascent();
                        rect3.left = this.f9479e.getCompoundPaddingLeft() + rect.left;
                        if (this.f9472a0 == 1 && this.f9479e.getMinLines() <= 1) {
                            i14 = (int) (((float) rect.centerY()) - (f10 / 2.0f));
                        } else {
                            i14 = rect.top + this.f9479e.getCompoundPaddingTop();
                        }
                        rect3.top = i14;
                        rect3.right = rect.right - this.f9479e.getCompoundPaddingRight();
                        if (this.f9472a0 == 1 && this.f9479e.getMinLines() <= 1) {
                            i15 = (int) (((float) rect3.top) + f10);
                        } else {
                            i15 = rect.bottom - this.f9479e.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i15;
                        int i23 = rect3.left;
                        int i24 = rect3.top;
                        int i25 = rect3.right;
                        if (!com.google.android.material.internal.a.l(aVar4.f9326e, i23, i24, i25, i15)) {
                            aVar4.f9326e.set(i23, i24, i25, i15);
                            aVar4.O = true;
                            aVar4.j();
                        }
                        this.O0.k(false);
                        if (e() && !this.N0) {
                            m();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        boolean z10 = false;
        if (this.f9479e != null && this.f9479e.getMeasuredHeight() < (max = Math.max(this.f9475c.getMeasuredHeight(), this.f9473b.getMeasuredHeight()))) {
            this.f9479e.setMinimumHeight(max);
            z10 = true;
        }
        boolean u10 = u();
        if (z10 || u10) {
            this.f9479e.post(new c());
        }
        if (!(this.B == null || (editText = this.f9479e) == null)) {
            this.B.setGravity(editText.getGravity());
            this.B.setPadding(this.f9479e.getCompoundPaddingLeft(), this.f9479e.getCompoundPaddingTop(), this.f9479e.getCompoundPaddingRight(), this.f9479e.getCompoundPaddingBottom());
        }
        C();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f25915a);
        setError(hVar.f9520c);
        if (hVar.f9521d) {
            this.f9496q0.post(new b());
        }
        setHint(hVar.f9522e);
        setHelperText(hVar.f9523f);
        setPlaceholderText(hVar.f9524g);
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.R;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float a10 = this.Q.f25125e.a(this.f9489j0);
            float a11 = this.Q.f25126f.a(this.f9489j0);
            float a12 = this.Q.f25128h.a(this.f9489j0);
            float a13 = this.Q.f25127g.a(this.f9489j0);
            float f10 = z10 ? a10 : a11;
            if (z10) {
                a10 = a11;
            }
            float f11 = z10 ? a12 : a13;
            if (z10) {
                a12 = a13;
            }
            boolean c10 = u.c(this);
            this.R = c10;
            float f12 = c10 ? a10 : f10;
            if (!c10) {
                f10 = a10;
            }
            float f13 = c10 ? a12 : f11;
            if (!c10) {
                f11 = a12;
            }
            s9.f fVar = this.N;
            if (fVar != null && fVar.m() == f12) {
                s9.f fVar2 = this.N;
                if (fVar2.f25079a.f25098a.f25126f.a(fVar2.i()) == f10) {
                    s9.f fVar3 = this.N;
                    if (fVar3.f25079a.f25098a.f25128h.a(fVar3.i()) == f13) {
                        s9.f fVar4 = this.N;
                        if (fVar4.f25079a.f25098a.f25127g.a(fVar4.i()) == f11) {
                            return;
                        }
                    }
                }
            }
            i iVar = this.Q;
            iVar.getClass();
            i.b bVar = new i.b(iVar);
            bVar.f(f12);
            bVar.g(f10);
            bVar.d(f13);
            bVar.e(f11);
            this.Q = bVar.a();
            c();
        }
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f9499s.e()) {
            hVar.f9520c = getError();
        }
        hVar.f9521d = h() && this.f9496q0.isChecked();
        hVar.f9522e = getHint();
        hVar.f9523f = getHelperText();
        hVar.f9524g = getPlaceholderText();
        return hVar;
    }

    public void q(TextView textView, int i10) {
        boolean z10 = true;
        try {
            s0.i.h(textView, i10);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            s0.i.h(textView, 2132083112);
            textView.setTextColor(d0.a.b(getContext(), R.color.design_error));
        }
    }

    public final void r() {
        if (this.f9507w != null) {
            EditText editText = this.f9479e;
            s(editText == null ? 0 : editText.getText().length());
        }
    }

    public void s(int i10) {
        boolean z10 = this.f9505v;
        int i11 = this.f9503u;
        String str = null;
        if (i11 == -1) {
            this.f9507w.setText(String.valueOf(i10));
            this.f9507w.setContentDescription((CharSequence) null);
            this.f9505v = false;
        } else {
            this.f9505v = i10 > i11;
            Context context = getContext();
            this.f9507w.setContentDescription(context.getString(this.f9505v ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f9503u)}));
            if (z10 != this.f9505v) {
                t();
            }
            m0.a c10 = m0.a.c();
            TextView textView = this.f9507w;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f9503u)});
            m0.c cVar = c10.f21471c;
            if (string != null) {
                str = c10.d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.f9479e != null && z10 != this.f9505v) {
            z(false, false);
            E();
            v();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f9484g0 != i10) {
            this.f9484g0 = i10;
            this.I0 = i10;
            this.K0 = i10;
            this.L0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(d0.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.f9484g0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.f9472a0) {
            this.f9472a0 = i10;
            if (this.f9479e != null) {
                l();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f9474b0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.G0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.G0 != colorStateList.getDefaultColor()) {
            this.G0 = colorStateList.getDefaultColor();
        }
        E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            E();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f9478d0 = i10;
        E();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f9480e0 = i10;
        E();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f9501t != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.f9507w = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f9490k0;
                if (typeface != null) {
                    this.f9507w.setTypeface(typeface);
                }
                this.f9507w.setMaxLines(1);
                this.f9499s.a(this.f9507w, 2);
                o0.h.h((ViewGroup.MarginLayoutParams) this.f9507w.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                t();
                r();
            } else {
                this.f9499s.j(this.f9507w, 2);
                this.f9507w = null;
            }
            this.f9501t = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f9503u != i10) {
            if (i10 > 0) {
                this.f9503u = i10;
            } else {
                this.f9503u = -1;
            }
            if (this.f9501t) {
                r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f9509x != i10) {
            this.f9509x = i10;
            t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            t();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f9511y != i10) {
            this.f9511y = i10;
            t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.f9479e != null) {
            z(false, false);
        }
    }

    public void setEnabled(boolean z10) {
        n(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f9496q0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f9496q0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f9494o0;
        if (i11 != i10) {
            this.f9494o0 = i10;
            Iterator it = this.f9498r0.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this, i11);
            }
            setEndIconVisible(i10 != 0);
            if (getEndIconDelegate().b(this.f9472a0)) {
                getEndIconDelegate().a();
                l.a(this, this.f9496q0, this.f9500s0, this.f9502t0);
                return;
            }
            StringBuilder a10 = android.support.v4.media.a.a("The current box background mode ");
            a10.append(this.f9472a0);
            a10.append(" is not supported by the end icon mode ");
            a10.append(i10);
            throw new IllegalStateException(a10.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f9496q0;
        View.OnLongClickListener onLongClickListener = this.f9510x0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9510x0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f9496q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f9500s0 != colorStateList) {
            this.f9500s0 = colorStateList;
            l.a(this, this.f9496q0, colorStateList, this.f9502t0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f9502t0 != mode) {
            this.f9502t0 = mode;
            l.a(this, this.f9496q0, this.f9500s0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (j() != z10) {
            this.f9496q0.setVisibility(z10 ? 0 : 8);
            w();
            C();
            u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f9499s.f26655k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            m mVar = this.f9499s;
            mVar.c();
            mVar.f26654j = charSequence;
            mVar.f26656l.setText(charSequence);
            int i10 = mVar.f26652h;
            if (i10 != 1) {
                mVar.f26653i = 1;
            }
            mVar.l(i10, mVar.f26653i, mVar.k(mVar.f26656l, charSequence));
            return;
        }
        this.f9499s.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        m mVar = this.f9499s;
        mVar.f26657m = charSequence;
        TextView textView = mVar.f26656l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        m mVar = this.f9499s;
        if (mVar.f26655k != z10) {
            mVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(mVar.f26645a, (AttributeSet) null);
                mVar.f26656l = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                mVar.f26656l.setTextAlignment(5);
                Typeface typeface = mVar.f26665u;
                if (typeface != null) {
                    mVar.f26656l.setTypeface(typeface);
                }
                int i10 = mVar.f26658n;
                mVar.f26658n = i10;
                TextView textView = mVar.f26656l;
                if (textView != null) {
                    mVar.f26646b.q(textView, i10);
                }
                ColorStateList colorStateList = mVar.f26659o;
                mVar.f26659o = colorStateList;
                TextView textView2 = mVar.f26656l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = mVar.f26657m;
                mVar.f26657m = charSequence;
                TextView textView3 = mVar.f26656l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                mVar.f26656l.setVisibility(4);
                c0.D(mVar.f26656l, 1);
                mVar.a(mVar.f26656l, 0);
            } else {
                mVar.i();
                mVar.j(mVar.f26656l, 0);
                mVar.f26656l = null;
                mVar.f26646b.v();
                mVar.f26646b.E();
            }
            mVar.f26655k = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
        l.c(this, this.f9514z0, this.A0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f9514z0;
        View.OnLongClickListener onLongClickListener = this.f9512y0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9512y0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f9514z0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            l.a(this, this.f9514z0, colorStateList, this.B0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.B0 != mode) {
            this.B0 = mode;
            l.a(this, this.f9514z0, this.A0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        m mVar = this.f9499s;
        mVar.f26658n = i10;
        TextView textView = mVar.f26656l;
        if (textView != null) {
            mVar.f26646b.q(textView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        m mVar = this.f9499s;
        mVar.f26659o = colorStateList;
        TextView textView = mVar.f26656l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f9499s.f26661q) {
                setHelperTextEnabled(true);
            }
            m mVar = this.f9499s;
            mVar.c();
            mVar.f26660p = charSequence;
            mVar.f26662r.setText(charSequence);
            int i10 = mVar.f26652h;
            if (i10 != 2) {
                mVar.f26653i = 2;
            }
            mVar.l(i10, mVar.f26653i, mVar.k(mVar.f26662r, charSequence));
        } else if (this.f9499s.f26661q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        m mVar = this.f9499s;
        mVar.f26664t = colorStateList;
        TextView textView = mVar.f26662r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        m mVar = this.f9499s;
        if (mVar.f26661q != z10) {
            mVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(mVar.f26645a, (AttributeSet) null);
                mVar.f26662r = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                mVar.f26662r.setTextAlignment(5);
                Typeface typeface = mVar.f26665u;
                if (typeface != null) {
                    mVar.f26662r.setTypeface(typeface);
                }
                mVar.f26662r.setVisibility(4);
                c0.D(mVar.f26662r, 1);
                int i10 = mVar.f26663s;
                mVar.f26663s = i10;
                TextView textView = mVar.f26662r;
                if (textView != null) {
                    s0.i.h(textView, i10);
                }
                ColorStateList colorStateList = mVar.f26664t;
                mVar.f26664t = colorStateList;
                TextView textView2 = mVar.f26662r;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                mVar.a(mVar.f26662r, 1);
                mVar.f26662r.setAccessibilityDelegate(new v9.n(mVar));
            } else {
                mVar.c();
                int i11 = mVar.f26652h;
                if (i11 == 2) {
                    mVar.f26653i = 0;
                }
                mVar.l(i11, mVar.f26653i, mVar.k(mVar.f26662r, ""));
                mVar.j(mVar.f26662r, 1);
                mVar.f26662r = null;
                mVar.f26646b.v();
                mVar.f26646b.E();
            }
            mVar.f26661q = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        m mVar = this.f9499s;
        mVar.f26663s = i10;
        TextView textView = mVar.f26662r;
        if (textView != null) {
            s0.i.h(textView, i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.K) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            if (!z10) {
                this.M = false;
                if (!TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.f9479e.getHint())) {
                    this.f9479e.setHint(this.L);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f9479e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.L)) {
                        setHint(hint);
                    }
                    this.f9479e.setHint((CharSequence) null);
                }
                this.M = true;
            }
            if (this.f9479e != null) {
                y();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        com.google.android.material.internal.a aVar = this.O0;
        p9.d dVar = new p9.d(aVar.f9318a.getContext(), i10);
        ColorStateList colorStateList = dVar.f23960j;
        if (colorStateList != null) {
            aVar.f9336m = colorStateList;
        }
        float f10 = dVar.f23961k;
        if (f10 != 0.0f) {
            aVar.f9334k = f10;
        }
        ColorStateList colorStateList2 = dVar.f23951a;
        if (colorStateList2 != null) {
            aVar.W = colorStateList2;
        }
        aVar.U = dVar.f23955e;
        aVar.V = dVar.f23956f;
        aVar.T = dVar.f23957g;
        aVar.X = dVar.f23959i;
        p9.a aVar2 = aVar.A;
        if (aVar2 != null) {
            aVar2.f23950c = true;
        }
        l9.d dVar2 = new l9.d(aVar);
        dVar.a();
        aVar.A = new p9.a(dVar2, dVar.f23964n);
        dVar.c(aVar.f9318a.getContext(), aVar.A);
        aVar.k(false);
        this.D0 = this.O0.f9336m;
        if (this.f9479e != null) {
            z(false, false);
            y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                com.google.android.material.internal.a aVar = this.O0;
                if (aVar.f9336m != colorStateList) {
                    aVar.f9336m = colorStateList;
                    aVar.k(false);
                }
            }
            this.D0 = colorStateList;
            if (this.f9479e != null) {
                z(false, false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f9485h = i10;
        EditText editText = this.f9479e;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f9497r = i10;
        EditText editText = this.f9479e;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f9483g = i10;
        EditText editText = this.f9479e;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f9487i = i10;
        EditText editText = this.f9479e;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f9494o0 != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f9500s0 = colorStateList;
        l.a(this, this.f9496q0, colorStateList, this.f9502t0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f9502t0 = mode;
        l.a(this, this.f9496q0, this.f9500s0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.B == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.B = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            c0.I(this.B, 2);
            b2.d dVar = new b2.d();
            dVar.f3404c = 87;
            TimeInterpolator timeInterpolator = u8.a.f26148a;
            dVar.f3405d = timeInterpolator;
            this.E = dVar;
            dVar.f3403b = 67;
            b2.d dVar2 = new b2.d();
            dVar2.f3404c = 87;
            dVar2.f3405d = timeInterpolator;
            this.F = dVar2;
            setPlaceholderTextAppearance(this.D);
            setPlaceholderTextColor(this.C);
        }
        int i10 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A) {
                setPlaceholderTextEnabled(true);
            }
            this.f9513z = charSequence;
        }
        EditText editText = this.f9479e;
        if (editText != null) {
            i10 = editText.getText().length();
        }
        A(i10);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.D = i10;
        TextView textView = this.B;
        if (textView != null) {
            s0.i.h(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            TextView textView = this.B;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f9473b.a(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        s0.i.h(this.f9473b.f26678b, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f9473b.f26678b.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f9473b.f26680d.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f9473b;
        CheckableImageButton checkableImageButton = rVar.f26680d;
        View.OnLongClickListener onLongClickListener = rVar.f26683g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f9473b;
        rVar.f26683g = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f26680d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        r rVar = this.f9473b;
        if (rVar.f26681e != colorStateList) {
            rVar.f26681e = colorStateList;
            l.a(rVar.f26677a, rVar.f26680d, colorStateList, rVar.f26682f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f9473b;
        if (rVar.f26682f != mode) {
            rVar.f26682f = mode;
            l.a(rVar.f26677a, rVar.f26680d, rVar.f26681e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f9473b.f(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.J.setText(charSequence);
        D();
    }

    public void setSuffixTextAppearance(int i10) {
        s0.i.h(this.J, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f9479e;
        if (editText != null) {
            c0.C(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9490k0) {
            this.f9490k0 = typeface;
            this.O0.r(typeface);
            m mVar = this.f9499s;
            if (typeface != mVar.f26665u) {
                mVar.f26665u = typeface;
                TextView textView = mVar.f26656l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = mVar.f26662r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f9507w;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f9507w;
        if (textView != null) {
            q(textView, this.f9505v ? this.f9509x : this.f9511y);
            if (!this.f9505v && (colorStateList2 = this.G) != null) {
                this.f9507w.setTextColor(colorStateList2);
            }
            if (this.f9505v && (colorStateList = this.H) != null) {
                this.f9507w.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f9479e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            v9.r r0 = r10.f9473b
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x0069
            v9.r r0 = r10.f9473b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f9479e
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f9491l0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.f9492m0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f9491l0 = r6
            r10.f9492m0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f9479e
            android.graphics.drawable.Drawable[] r0 = s0.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f9491l0
            if (r6 == r7) goto L_0x0067
            android.widget.EditText r6 = r10.f9479e
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            s0.i.c(r6, r7, r8, r9, r0)
        L_0x0065:
            r0 = 1
            goto L_0x0081
        L_0x0067:
            r0 = 0
            goto L_0x0081
        L_0x0069:
            android.graphics.drawable.Drawable r0 = r10.f9491l0
            if (r0 == 0) goto L_0x0067
            android.widget.EditText r0 = r10.f9479e
            android.graphics.drawable.Drawable[] r0 = s0.i.a(r0)
            android.widget.EditText r6 = r10.f9479e
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            s0.i.c(r6, r3, r7, r8, r0)
            r10.f9491l0 = r3
            goto L_0x0065
        L_0x0081:
            com.google.android.material.internal.CheckableImageButton r6 = r10.f9514z0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x0099
            boolean r6 = r10.h()
            if (r6 == 0) goto L_0x0095
            boolean r6 = r10.j()
            if (r6 != 0) goto L_0x0099
        L_0x0095:
            java.lang.CharSequence r6 = r10.I
            if (r6 == 0) goto L_0x00a3
        L_0x0099:
            android.widget.LinearLayout r6 = r10.f9475c
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a3
            r6 = 1
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x0110
            android.widget.TextView r3 = r10.J
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f9479e
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00c9
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = o0.h.c(r3)
            int r3 = r3 + r7
        L_0x00c9:
            android.widget.EditText r6 = r10.f9479e
            android.graphics.drawable.Drawable[] r6 = s0.i.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f9504u0
            if (r7 == 0) goto L_0x00ea
            int r8 = r10.f9506v0
            if (r8 == r3) goto L_0x00ea
            r10.f9506v0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f9479e
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.f9504u0
            r4 = r6[r4]
            s0.i.c(r0, r1, r3, r5, r4)
            goto L_0x0131
        L_0x00ea:
            if (r7 != 0) goto L_0x00f8
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f9504u0 = r7
            r10.f9506v0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00f8:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f9504u0
            if (r3 == r7) goto L_0x010e
            r0 = r6[r5]
            r10.f9508w0 = r0
            android.widget.EditText r0 = r10.f9479e
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            s0.i.c(r0, r1, r3, r7, r4)
            goto L_0x0131
        L_0x010e:
            r2 = r0
            goto L_0x0131
        L_0x0110:
            android.graphics.drawable.Drawable r6 = r10.f9504u0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.f9479e
            android.graphics.drawable.Drawable[] r6 = s0.i.a(r6)
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f9504u0
            if (r5 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.f9479e
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f9508w0
            r4 = r6[r4]
            s0.i.c(r0, r1, r5, r7, r4)
            goto L_0x012f
        L_0x012e:
            r2 = r0
        L_0x012f:
            r10.f9504u0 = r3
        L_0x0131:
            r0 = r2
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.u():boolean");
    }

    public void v() {
        Drawable background;
        TextView textView;
        EditText editText = this.f9479e;
        if (editText != null && this.f9472a0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = k0.f975a;
            Drawable mutate = background.mutate();
            if (this.f9499s.e()) {
                mutate.setColorFilter(androidx.appcompat.widget.k.c(this.f9499s.g(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f9505v || (textView = this.f9507w) == null) {
                androidx.core.graphics.drawable.a.c(mutate);
                this.f9479e.refreshDrawableState();
            } else {
                mutate.setColorFilter(androidx.appcompat.widget.k.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void w() {
        int i10 = 8;
        this.f9477d.setVisibility((this.f9496q0.getVisibility() != 0 || k()) ? 8 : 0);
        boolean z10 = j() || k() || ((this.I == null || this.N0) ? (char) 8 : 0) == 0;
        LinearLayout linearLayout = this.f9475c;
        if (z10) {
            i10 = 0;
        }
        linearLayout.setVisibility(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            v9.m r0 = r3.f9499s
            boolean r2 = r0.f26655k
            if (r2 == 0) goto L_0x0015
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.material.internal.CheckableImageButton r2 = r3.f9514z0
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r2.setVisibility(r1)
            r3.w()
            r3.C()
            boolean r0 = r3.h()
            if (r0 != 0) goto L_0x002f
            r3.u()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public final void y() {
        if (this.f9472a0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9471a.getLayoutParams();
            int d10 = d();
            if (d10 != layoutParams.topMargin) {
                layoutParams.topMargin = d10;
                this.f9471a.requestLayout();
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f9479e;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f9479e;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean e10 = this.f9499s.e();
        ColorStateList colorStateList2 = this.C0;
        if (colorStateList2 != null) {
            com.google.android.material.internal.a aVar = this.O0;
            if (aVar.f9336m != colorStateList2) {
                aVar.f9336m = colorStateList2;
                aVar.k(false);
            }
            com.google.android.material.internal.a aVar2 = this.O0;
            ColorStateList colorStateList3 = this.C0;
            if (aVar2.f9335l != colorStateList3) {
                aVar2.f9335l = colorStateList3;
                aVar2.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.C0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.M0);
            } else {
                i10 = this.M0;
            }
            this.O0.m(ColorStateList.valueOf(i10));
            com.google.android.material.internal.a aVar3 = this.O0;
            ColorStateList valueOf = ColorStateList.valueOf(i10);
            if (aVar3.f9335l != valueOf) {
                aVar3.f9335l = valueOf;
                aVar3.k(false);
            }
        } else if (e10) {
            com.google.android.material.internal.a aVar4 = this.O0;
            TextView textView2 = this.f9499s.f26656l;
            aVar4.m(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f9505v && (textView = this.f9507w) != null) {
            this.O0.m(textView.getTextColors());
        } else if (z13 && (colorStateList = this.D0) != null) {
            com.google.android.material.internal.a aVar5 = this.O0;
            if (aVar5.f9336m != colorStateList) {
                aVar5.f9336m = colorStateList;
                aVar5.k(false);
            }
        }
        if (z12 || !this.P0 || (isEnabled() && z13)) {
            if (z11 || this.N0) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.R0.cancel();
                }
                if (!z10 || !this.Q0) {
                    this.O0.p(1.0f);
                } else {
                    b(1.0f);
                }
                this.N0 = false;
                if (e()) {
                    m();
                }
                EditText editText3 = this.f9479e;
                A(editText3 == null ? 0 : editText3.getText().length());
                r rVar = this.f9473b;
                rVar.f26684h = false;
                rVar.h();
                D();
            }
        } else if (z11 || !this.N0) {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.R0.cancel();
            }
            if (!z10 || !this.Q0) {
                this.O0.p(0.0f);
            } else {
                b(0.0f);
            }
            if (e() && (!((v9.f) this.N).I.isEmpty()) && e()) {
                ((v9.f) this.N).A(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.N0 = true;
            i();
            r rVar2 = this.f9473b;
            rVar2.f26684h = true;
            rVar2.h();
            D();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f9496q0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f9496q0.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this, this.f9496q0, this.f9500s0, this.f9502t0);
            o();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        r rVar = this.f9473b;
        if (rVar.f26680d.getContentDescription() != charSequence) {
            rVar.f26680d.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9473b.c(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9514z0.setImageDrawable(drawable);
        x();
        l.a(this, this.f9514z0, this.A0, this.B0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9496q0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9496q0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
