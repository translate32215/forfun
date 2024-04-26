package k8;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class g4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f20219a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var) {
        super((Handler) null);
        this.f20219a = h4Var;
    }

    public final void onChange(boolean z10) {
        h4 h4Var = this.f20219a;
        synchronized (h4Var.f20237d) {
            h4Var.f20238e = null;
            w4.f20516h.incrementAndGet();
        }
        synchronized (h4Var) {
            for (i4 zza : h4Var.f20239f) {
                zza.zza();
            }
        }
    }
}
