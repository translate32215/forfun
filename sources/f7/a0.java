package f7;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import d7.l;
import e8.q9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final View f18250a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f18251b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18252c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18253d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18254e;

    /* renamed from: f  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f18255f;

    public a0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f18251b = activity;
        this.f18250a = view;
        this.f18255f = onGlobalLayoutListener;
    }

    public static ViewTreeObserver a(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void b() {
        ViewTreeObserver a10;
        if (!this.f18252c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f18255f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f18251b;
                if (!(activity == null || (a10 = a(activity)) == null)) {
                    a10.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                q9 q9Var = l.B.A;
                q9.a(this.f18250a, this.f18255f);
            }
            this.f18252c = true;
        }
    }

    public final void c() {
        ViewTreeObserver a10;
        Activity activity = this.f18251b;
        if (activity != null && this.f18252c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f18255f;
            if (!(onGlobalLayoutListener == null || (a10 = a(activity)) == null)) {
                m0 m0Var = l.B.f13188e;
                a10.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f18252c = false;
        }
    }
}
