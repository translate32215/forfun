package e8;

import android.view.View;
import com.google.android.gms.internal.ads.s7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yb implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h8 f17591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s7 f17592b;

    public yb(s7 s7Var, h8 h8Var) {
        this.f17592b = s7Var;
        this.f17591a = h8Var;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f17592b.l(view, this.f17591a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
