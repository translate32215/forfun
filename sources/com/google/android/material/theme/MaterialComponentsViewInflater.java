package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.v;
import c9.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import v9.p;

public class MaterialComponentsViewInflater extends c {
    public d a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public v d(Context context, AttributeSet attributeSet) {
        return new o9.a(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
