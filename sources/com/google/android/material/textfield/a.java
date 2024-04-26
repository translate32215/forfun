package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import v9.k;

/* compiled from: ClearTextEndIconDelegate */
public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f9525e = new C0099a();

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f9526f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f9527g = new c();

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f9528h = new d();

    /* renamed from: i  reason: collision with root package name */
    public AnimatorSet f9529i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f9530j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    public class C0099a implements TextWatcher {
        public C0099a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.f26641a.getSuffixText() == null) {
                a aVar = a.this;
                aVar.e(a.d(aVar));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z10) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class c implements TextInputLayout.f {
        public c() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f9526f);
            a aVar = a.this;
            aVar.f26643c.setOnFocusChangeListener(aVar.f9526f);
            editText.removeTextChangedListener(a.this.f9525e);
            editText.addTextChangedListener(a.this.f9525e);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        /* compiled from: ClearTextEndIconDelegate */
        public class C0100a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f9535a;

            public C0100a(EditText editText) {
                this.f9535a = editText;
            }

            public void run() {
                this.f9535a.removeTextChangedListener(a.this.f9525e);
                a.this.e(true);
            }
        }

        public d() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new C0100a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f9526f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                View.OnFocusChangeListener onFocusChangeListener = a.this.f26643c.getOnFocusChangeListener();
                a aVar = a.this;
                if (onFocusChangeListener == aVar.f9526f) {
                    aVar.f26643c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.f26641a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f26641a.o();
        }
    }

    public a(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f26641a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f26643c.hasFocus()) && editText.getText().length() > 0;
    }

    public void a() {
        TextInputLayout textInputLayout = this.f26641a;
        int i10 = this.f26644d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f26641a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f26641a.setEndIconCheckable(false);
        this.f26641a.setEndIconOnClickListener(new e());
        this.f26641a.a(this.f9527g);
        TextInputLayout textInputLayout3 = this.f26641a;
        textInputLayout3.f9498r0.add(this.f9528h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(u8.a.f26151d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new v9.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = u8.a.f26148a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new v9.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9529i = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f9529i.addListener(new v9.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new v9.c(this));
        this.f9530j = ofFloat3;
        ofFloat3.addListener(new v9.b(this));
    }

    public void c(boolean z10) {
        if (this.f26641a.getSuffixText() != null) {
            e(z10);
        }
    }

    public final void e(boolean z10) {
        boolean z11 = this.f26641a.j() == z10;
        if (z10 && !this.f9529i.isRunning()) {
            this.f9530j.cancel();
            this.f9529i.start();
            if (z11) {
                this.f9529i.end();
            }
        } else if (!z10) {
            this.f9529i.cancel();
            this.f9530j.start();
            if (z11) {
                this.f9530j.end();
            }
        }
    }
}
