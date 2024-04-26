package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.uf;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final /* synthetic */ class l30 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15355a;

    /* renamed from: b  reason: collision with root package name */
    public final m30 f15356b;

    public l30(m30 m30, int i10) {
        this.f15355a = i10;
        if (i10 != 1) {
            this.f15356b = m30;
        } else {
            this.f15356b = m30;
        }
    }

    public final Object call() {
        switch (this.f15355a) {
            case 0:
                m30 m30 = this.f15356b;
                return ((uf) m30.f15455e).b((Context) m30.f15451a);
            default:
                m30 m302 = this.f15356b;
                return ((uf) m302.f15456f).b((Context) m302.f15451a);
        }
    }
}
