package androidx.leanback.app;

import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* compiled from: ProgressBarManager */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f2036a;

    /* renamed from: b  reason: collision with root package name */
    public View f2037b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f2038c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2039d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2040e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f2041f = new a();

    /* compiled from: ProgressBarManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            n nVar = n.this;
            if (nVar.f2039d) {
                nVar.getClass();
                n nVar2 = n.this;
                if (nVar2.f2036a == null || !nVar2.f2040e) {
                    return;
                }
                if (nVar2.f2037b == null) {
                    nVar2.f2037b = new ProgressBar(n.this.f2036a.getContext(), (AttributeSet) null, 16842874);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    n nVar3 = n.this;
                    nVar3.f2036a.addView(nVar3.f2037b, layoutParams);
                    return;
                }
                nVar2.getClass();
            }
        }
    }
}
