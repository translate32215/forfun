package e8;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class u9 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f16863a;

    public u9(View view) {
        this.f16863a = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f16863a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver c10 = c();
        if (c10 != null) {
            d(c10);
        }
    }

    public final void b() {
        ViewTreeObserver c10 = c();
        if (c10 != null) {
            e(c10);
        }
    }

    public abstract void d(ViewTreeObserver viewTreeObserver);

    public abstract void e(ViewTreeObserver viewTreeObserver);
}
