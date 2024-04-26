package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import l9.q;
import v9.k;

/* compiled from: PasswordToggleEndIconDelegate */
public class c extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f9563e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f9564f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f9565g = new C0103c();

    /* compiled from: PasswordToggleEndIconDelegate */
    public class a extends q {
        public a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f26643c.setChecked(!c.d(cVar));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class b implements TextInputLayout.f {
        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.f26643c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f9563e);
            editText.addTextChangedListener(c.this.f9563e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    /* compiled from: PasswordToggleEndIconDelegate */
    public class C0103c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* compiled from: PasswordToggleEndIconDelegate */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f9569a;

            public a(EditText editText) {
                this.f9569a = editText;
            }

            public void run() {
                this.f9569a.removeTextChangedListener(c.this.f9563e);
            }
        }

        public C0103c() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = c.this.f26641a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (c.d(c.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                c.this.f26641a.o();
            }
        }
    }

    public c(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f26641a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public void a() {
        TextInputLayout textInputLayout = this.f26641a;
        int i10 = this.f26644d;
        if (i10 == 0) {
            i10 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f26641a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z10 = true;
        this.f26641a.setEndIconVisible(true);
        this.f26641a.setEndIconCheckable(true);
        this.f26641a.setEndIconOnClickListener(new d());
        this.f26641a.a(this.f9564f);
        TextInputLayout textInputLayout3 = this.f26641a;
        textInputLayout3.f9498r0.add(this.f9565g);
        EditText editText = this.f26641a.getEditText();
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = false;
        }
        if (z10) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
