package androidx.databinding;

import android.view.Choreographer;

/* compiled from: ViewDataBinding */
public class e implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1463a;

    public e(ViewDataBinding viewDataBinding) {
        this.f1463a = viewDataBinding;
    }

    public void doFrame(long j10) {
        this.f1463a.f1449a.run();
    }
}
