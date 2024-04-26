package e8;

import android.view.View;
import android.view.ViewTreeObserver;
import d7.l;
import f7.m0;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s9 extends u9 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f16381b;

    public s9(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f16381b = new WeakReference<>(onGlobalLayoutListener);
    }

    public final void d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void e(ViewTreeObserver viewTreeObserver) {
        m0 m0Var = l.B.f13188e;
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f16381b.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
