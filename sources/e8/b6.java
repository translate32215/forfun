package e8;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.t7;
import java.util.Collections;
import java.util.Set;
import z7.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b6 extends gf0 {
    public PopupWindow A;
    public RelativeLayout B;
    public ViewGroup C;

    /* renamed from: d  reason: collision with root package name */
    public String f13880d = "top-right";

    /* renamed from: e  reason: collision with root package name */
    public boolean f13881e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f13882f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f13883g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f13884h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f13885i = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f13886r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f13887s = -1;

    /* renamed from: t  reason: collision with root package name */
    public final Object f13888t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public final t7 f13889u;

    /* renamed from: v  reason: collision with root package name */
    public final Activity f13890v;

    /* renamed from: w  reason: collision with root package name */
    public wc f13891w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f13892x;

    /* renamed from: y  reason: collision with root package name */
    public LinearLayout f13893y;

    /* renamed from: z  reason: collision with root package name */
    public g2 f13894z;

    static {
        Set a10 = c.a(7, false);
        Collections.addAll(a10, new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
        Collections.unmodifiableSet(a10);
    }

    public b6(t7 t7Var, g2 g2Var) {
        super(t7Var, "resize");
        this.f13889u = t7Var;
        this.f13890v = t7Var.b();
        this.f13894z = g2Var;
    }

    public final void u(boolean z10) {
        synchronized (this.f13888t) {
            PopupWindow popupWindow = this.A;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.B.removeView(this.f13889u.getView());
                ViewGroup viewGroup = this.C;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13892x);
                    this.C.addView(this.f13889u.getView());
                    this.f13889u.c0(this.f13891w);
                }
                if (z10) {
                    t("default");
                    g2 g2Var = this.f13894z;
                    if (g2Var != null) {
                        ((op) g2Var.f6511b).f15814b.I0(fj.f14649a);
                    }
                }
                this.A = null;
                this.B = null;
                this.C = null;
                this.f13893y = null;
            }
        }
    }
}
