package e8;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class bo implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f14041a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f14042b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14043c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f14044d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14045e;

    /* renamed from: f  reason: collision with root package name */
    public final WindowManager f14046f;

    public bo(View view, t7 t7Var, String str, WindowManager.LayoutParams layoutParams, int i10, WindowManager windowManager) {
        this.f14041a = view;
        this.f14042b = t7Var;
        this.f14043c = str;
        this.f14044d = layoutParams;
        this.f14045e = i10;
        this.f14046f = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f14041a;
        t7 t7Var = this.f14042b;
        String str = this.f14043c;
        WindowManager.LayoutParams layoutParams = this.f14044d;
        int i10 = this.f14045e;
        WindowManager windowManager = this.f14046f;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && t7Var.getView().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i10;
            } else {
                layoutParams.y = rect.top - i10;
            }
            windowManager.updateViewLayout(t7Var.getView(), layoutParams);
        }
    }
}
