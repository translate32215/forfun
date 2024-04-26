package e8;

import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.gv;
import s7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hh0 implements b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gv f14916a;

    public hh0(gv gvVar) {
        this.f14916a = gvVar;
    }

    public final void m(a aVar) {
        synchronized (this.f14916a.f6705b) {
            gv gvVar = this.f14916a;
            gvVar.f6708e = null;
            if (gvVar.f6706c != null) {
                gvVar.f6706c = null;
            }
            gvVar.f6705b.notifyAll();
        }
    }
}
