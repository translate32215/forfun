package e8;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r9 extends u9 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<ViewTreeObserver.OnScrollChangedListener> f16250b;

    public r9(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f16250b = new WeakReference<>(onScrollChangedListener);
    }

    public final void d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    public final void e(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f16250b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            b();
        }
    }
}
