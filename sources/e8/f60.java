package e8;

import android.view.MotionEvent;
import com.google.android.gms.internal.ads.yg;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f60 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14539b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14540c;

    public f60(int i10, int i11, int i12) {
        this.f14538a = i10;
        this.f14539b = i11;
        this.f14540c = i12;
    }

    public final void run() {
        try {
            yg.G.f(MotionEvent.obtain(0, (long) this.f14538a, 0, (float) this.f14539b, (float) this.f14540c, 0));
        } catch (Exception e10) {
            yg.I.a(2022, -1, e10);
        }
    }
}
