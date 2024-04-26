package b2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b2.y;
import o0.c0;

/* compiled from: ViewGroupOverlayApi14 */
public class s extends y implements u {
    public s(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public void b(View view) {
        y.a aVar = this.f3452a;
        if (!aVar.f3457e) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == aVar.f3453a || viewGroup.getParent() == null || !c0.q(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    aVar.f3453a.getLocationOnScreen(iArr2);
                    c0.t(view, iArr[0] - iArr2[0]);
                    c0.u(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            aVar.addView(view);
            return;
        }
        throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }

    public void z(View view) {
        y.a aVar = this.f3452a;
        aVar.removeView(view);
        aVar.a();
    }
}
