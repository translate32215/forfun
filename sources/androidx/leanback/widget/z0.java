package androidx.leanback.widget;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: SearchBar */
public class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchBar f2586a;

    public z0(SearchBar searchBar) {
        this.f2586a = searchBar;
    }

    public void run() {
        this.f2586a.f2200b.requestFocusFromTouch();
        this.f2586a.f2200b.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) this.f2586a.f2200b.getWidth(), (float) this.f2586a.f2200b.getHeight(), 0));
        this.f2586a.f2200b.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) this.f2586a.f2200b.getWidth(), (float) this.f2586a.f2200b.getHeight(), 0));
    }
}
