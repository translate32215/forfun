package o0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f22634a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f22635b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f22636c;

    public v(View view, Runnable runnable) {
        this.f22634a = view;
        this.f22635b = view.getViewTreeObserver();
        this.f22636c = runnable;
    }

    public static v a(View view, Runnable runnable) {
        if (view != null) {
            v vVar = new v(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(vVar);
            view.addOnAttachStateChangeListener(vVar);
            return vVar;
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.f22635b.isAlive()) {
            this.f22635b.removeOnPreDrawListener(this);
        } else {
            this.f22634a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f22634a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f22636c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f22635b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
