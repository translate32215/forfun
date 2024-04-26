package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.startapp.startappsdk.R;
import l9.q;
import l9.t;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f9572a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f9573b;

    public class b extends q {
        public b(a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f9572a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f9572a.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f9572a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f9573b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new b((a) null));
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9573b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f9572a.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void setChecked(boolean z10) {
        this.f9572a.setChecked(z10);
        int i10 = 0;
        this.f9573b.setVisibility(z10 ? 0 : 4);
        Chip chip = this.f9572a;
        if (z10) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            EditText editText = this.f9573b;
            editText.requestFocus();
            editText.post(new t(editText));
            if (!TextUtils.isEmpty(this.f9573b.getText())) {
                EditText editText2 = this.f9573b;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9572a.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.f9572a.setTag(i10, obj);
    }

    public void toggle() {
        this.f9572a.toggle();
    }
}
