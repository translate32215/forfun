package z0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.e;

/* compiled from: EmojiTransformationMethod */
public class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f28206a;

    public h(TransformationMethod transformationMethod) {
        this.f28206a = transformationMethod;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f28206a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || e.a().b() != 1) ? charSequence : e.a().h(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f28206a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
