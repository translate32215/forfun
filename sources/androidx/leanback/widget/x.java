package androidx.leanback.widget;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.leanback.widget.y0;

/* compiled from: InvisibleRowPresenter */
public class x extends y0 {
    public x() {
        this.f2565a = null;
    }

    public y0.b h(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        return new y0.b(relativeLayout);
    }
}
