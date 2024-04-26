package w8;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: BadgeDrawable */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f27134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f27135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f27136c;

    public a(b bVar, View view, FrameLayout frameLayout) {
        this.f27136c = bVar;
        this.f27134a = view;
        this.f27135b = frameLayout;
    }

    public void run() {
        this.f27136c.g(this.f27134a, this.f27135b);
    }
}
