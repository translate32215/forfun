package v9;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.g1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import l9.u;
import o0.c0;
import o0.h;
import p9.c;
import s0.i;

@SuppressLint({"ViewConstructor"})
/* compiled from: StartCompoundLayout */
public class r extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f26677a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26678b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f26679c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f26680d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f26681e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f26682f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnLongClickListener f26683g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f26684h;

    public r(TextInputLayout textInputLayout, g1 g1Var) {
        super(textInputLayout.getContext());
        this.f26677a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f26680d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.f26678b = appCompatTextView;
        if (c.d(getContext())) {
            h.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        d((View.OnClickListener) null);
        e((View.OnLongClickListener) null);
        if (g1Var.p(62)) {
            this.f26681e = c.b(getContext(), g1Var, 62);
        }
        if (g1Var.p(63)) {
            this.f26682f = u.d(g1Var.j(63, -1), (PorterDuff.Mode) null);
        }
        if (g1Var.p(61)) {
            c(g1Var.g(61));
            if (g1Var.p(60)) {
                b(g1Var.o(60));
            }
            checkableImageButton.setCheckable(g1Var.a(59, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c0.D(appCompatTextView, 1);
        i.h(appCompatTextView, g1Var.m(55, 0));
        if (g1Var.p(56)) {
            appCompatTextView.setTextColor(g1Var.c(56));
        }
        a(g1Var.o(54));
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void a(CharSequence charSequence) {
        this.f26679c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f26678b.setText(charSequence);
        h();
    }

    public void b(CharSequence charSequence) {
        if (this.f26680d.getContentDescription() != charSequence) {
            this.f26680d.setContentDescription(charSequence);
        }
    }

    public void c(Drawable drawable) {
        this.f26680d.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this.f26677a, this.f26680d, this.f26681e, this.f26682f);
            f(true);
            l.c(this.f26677a, this.f26680d, this.f26681e);
            return;
        }
        f(false);
        d((View.OnClickListener) null);
        e((View.OnLongClickListener) null);
        b((CharSequence) null);
    }

    public void d(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f26680d;
        View.OnLongClickListener onLongClickListener = this.f26683g;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void e(View.OnLongClickListener onLongClickListener) {
        this.f26683g = null;
        CheckableImageButton checkableImageButton = this.f26680d;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        l.d(checkableImageButton, (View.OnLongClickListener) null);
    }

    public void f(boolean z10) {
        int i10 = 0;
        if ((this.f26680d.getVisibility() == 0) != z10) {
            CheckableImageButton checkableImageButton = this.f26680d;
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            g();
            h();
        }
    }

    public void g() {
        EditText editText = this.f26677a.f9479e;
        if (editText != null) {
            int i10 = 0;
            if (!(this.f26680d.getVisibility() == 0)) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                i10 = c0.e.f(editText);
            }
            TextView textView = this.f26678b;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
            c0.e.k(textView, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void h() {
        int i10 = 8;
        int i11 = (this.f26679c == null || this.f26684h) ? 8 : 0;
        if (this.f26680d.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f26678b.setVisibility(i11);
        this.f26677a.u();
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        g();
    }
}
