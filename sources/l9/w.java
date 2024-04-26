package l9;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* compiled from: VisibilityAwareImageButton */
public class w extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f21183a;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f21183a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f21183a;
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f21183a = i10;
    }
}
