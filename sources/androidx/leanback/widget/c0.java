package androidx.leanback.widget;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.leanback.widget.b0;
import com.startapp.startappsdk.R;

/* compiled from: ItemBridgeAdapterShadowOverlayWrapper */
public class c0 extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    public final e1 f2331a;

    public c0(e1 e1Var) {
        this.f2331a = e1Var;
    }

    public View a(View view) {
        Context context = view.getContext();
        e1 e1Var = this.f2331a;
        if (e1Var.f2381e) {
            return new d1(context, e1Var.f2377a, e1Var.f2378b, e1Var.f2383g, e1Var.f2384h, e1Var.f2382f);
        }
        throw new IllegalArgumentException();
    }

    public void b(View view, View view2) {
        d1 d1Var = (d1) view;
        if (!d1Var.f2339a || d1Var.f2341c != null) {
            throw new IllegalStateException();
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            int i10 = -2;
            layoutParams.width = layoutParams.width == -1 ? -1 : -2;
            if (layoutParams.height == -1) {
                i10 = -1;
            }
            layoutParams.height = i10;
            d1Var.setLayoutParams(layoutParams);
            d1Var.addView(view2, layoutParams2);
        } else {
            d1Var.addView(view2);
        }
        if (d1Var.f2342d && d1Var.f2343e != 3 && Build.VERSION.SDK_INT >= 21) {
            u0.a(d1Var, true, d1Var.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
        }
        d1Var.f2341c = view2;
    }
}
