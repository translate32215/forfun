package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView */
public interface x {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
