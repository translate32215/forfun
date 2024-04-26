package l9;

import android.view.View;
import o0.c0;

/* compiled from: ViewUtils */
public class v implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        c0.A(view);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
