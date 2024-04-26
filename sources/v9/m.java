package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import e.b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import p9.c;

/* compiled from: IndicatorViewController */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26645a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f26646b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f26647c;

    /* renamed from: d  reason: collision with root package name */
    public int f26648d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f26649e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f26650f;

    /* renamed from: g  reason: collision with root package name */
    public final float f26651g;

    /* renamed from: h  reason: collision with root package name */
    public int f26652h;

    /* renamed from: i  reason: collision with root package name */
    public int f26653i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f26654j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26655k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f26656l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f26657m;

    /* renamed from: n  reason: collision with root package name */
    public int f26658n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f26659o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f26660p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f26661q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f26662r;

    /* renamed from: s  reason: collision with root package name */
    public int f26663s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f26664t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f26665u;

    /* compiled from: IndicatorViewController */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26666a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f26667b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f26668c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f26669d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f26666a = i10;
            this.f26667b = textView;
            this.f26668c = i11;
            this.f26669d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            m mVar = m.this;
            mVar.f26652h = this.f26666a;
            mVar.f26650f = null;
            TextView textView2 = this.f26667b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f26668c == 1 && (textView = m.this.f26656l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f26669d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f26669d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f26669d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public m(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f26645a = context;
        this.f26646b = textInputLayout;
        this.f26651g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i10) {
        if (this.f26647c == null && this.f26649e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f26645a);
            this.f26647c = linearLayout;
            linearLayout.setOrientation(0);
            this.f26646b.addView(this.f26647c, -1, -2);
            this.f26649e = new FrameLayout(this.f26645a);
            this.f26647c.addView(this.f26649e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f26646b.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f26649e.setVisibility(0);
            this.f26649e.addView(textView);
        } else {
            this.f26647c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f26647c.setVisibility(0);
        this.f26648d++;
    }

    public void b() {
        if ((this.f26647c == null || this.f26646b.getEditText() == null) ? false : true) {
            EditText editText = this.f26646b.getEditText();
            boolean d10 = c.d(this.f26645a);
            LinearLayout linearLayout = this.f26647c;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.k(linearLayout, h(d10, R.dimen.material_helper_text_font_1_3_padding_horizontal, c0.e.f(editText)), h(d10, R.dimen.material_helper_text_font_1_3_padding_top, this.f26645a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(d10, R.dimen.material_helper_text_font_1_3_padding_horizontal, c0.e.e(editText)), 0);
        }
    }

    public void c() {
        Animator animator = this.f26650f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i12 == i10 ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(u8.a.f26148a);
                list.add(ofFloat);
                if (i12 == i10) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f26651g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(u8.a.f26151d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public boolean e() {
        if (this.f26653i != 1 || this.f26656l == null || TextUtils.isEmpty(this.f26654j)) {
            return false;
        }
        return true;
    }

    public final TextView f(int i10) {
        if (i10 == 1) {
            return this.f26656l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f26662r;
    }

    public int g() {
        TextView textView = this.f26656l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z10, int i10, int i11) {
        return z10 ? this.f26645a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void i() {
        this.f26654j = null;
        c();
        if (this.f26652h == 1) {
            if (!this.f26661q || TextUtils.isEmpty(this.f26660p)) {
                this.f26653i = 0;
            } else {
                this.f26653i = 2;
            }
        }
        l(this.f26652h, this.f26653i, k(this.f26656l, ""));
    }

    public void j(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f26647c;
        if (linearLayout != null) {
            if (!(i10 == 0 || i10 == 1) || (frameLayout = this.f26649e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i11 = this.f26648d - 1;
            this.f26648d = i11;
            LinearLayout linearLayout2 = this.f26647c;
            if (i11 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        return c0.r(this.f26646b) && this.f26646b.isEnabled() && (this.f26653i != this.f26652h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i10, int i11, boolean z10) {
        TextView f10;
        TextView f11;
        int i12 = i10;
        int i13 = i11;
        boolean z11 = z10;
        if (i12 != i13) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f26650f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                int i15 = i11;
                d(arrayList2, this.f26661q, this.f26662r, 2, i14, i15);
                d(arrayList2, this.f26655k, this.f26656l, 1, i14, i15);
                b.b(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, f(i10), i10, f(i13)));
                animatorSet.start();
            } else if (i12 != i13) {
                if (!(i13 == 0 || (f11 = f(i13)) == null)) {
                    f11.setVisibility(0);
                    f11.setAlpha(1.0f);
                }
                if (!(i12 == 0 || (f10 = f(i10)) == null)) {
                    f10.setVisibility(4);
                    if (i12 == 1) {
                        f10.setText((CharSequence) null);
                    }
                }
                this.f26652h = i13;
            }
            this.f26646b.v();
            this.f26646b.z(z11, false);
            this.f26646b.E();
        }
    }
}
