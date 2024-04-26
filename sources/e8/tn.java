package e8;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.k;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.ja;
import f7.d0;
import java.util.concurrent.Executor;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tn {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f16775a;

    /* renamed from: b  reason: collision with root package name */
    public final w00 f16776b;

    /* renamed from: c  reason: collision with root package name */
    public final mn f16777c;

    /* renamed from: d  reason: collision with root package name */
    public final jn f16778d;

    /* renamed from: e  reason: collision with root package name */
    public final ia f16779e;

    /* renamed from: f  reason: collision with root package name */
    public final ja f16780f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f16781g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f16782h;

    /* renamed from: i  reason: collision with root package name */
    public final n1 f16783i;

    /* renamed from: j  reason: collision with root package name */
    public final in f16784j;

    public tn(d0 d0Var, w00 w00, mn mnVar, jn jnVar, ia iaVar, ja jaVar, Executor executor, Executor executor2, in inVar) {
        this.f16775a = d0Var;
        this.f16776b = w00;
        this.f16783i = w00.f17195i;
        this.f16777c = mnVar;
        this.f16778d = jnVar;
        this.f16779e = iaVar;
        this.f16780f = jaVar;
        this.f16781g = executor;
        this.f16782h = executor2;
        this.f16784j = inVar;
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final boolean b(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View n10 = this.f16778d.n();
        if (n10 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (n10.getParent() instanceof ViewGroup) {
            ((ViewGroup) n10.getParent()).removeView(n10);
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.P1)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(n10, layoutParams);
        return true;
    }

    public final void c(co coVar) {
        if (coVar != null) {
            Context context = coVar.E1().getContext();
            if (k.g(context, this.f16777c.f15529a)) {
                if (!(context instanceof Activity)) {
                    e.E("Activity context is needed for policy validator.");
                } else if (this.f16780f != null && coVar.u4() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f16780f.b(coVar.u4(), windowManager), k.n());
                    } catch (ec e10) {
                        e.v("web view can not be obtained", e10);
                    }
                }
            }
        }
    }
}
