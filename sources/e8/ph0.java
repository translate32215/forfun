package e8;

import android.os.Bundle;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.kv;
import f7.j0;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ph0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kh0 f16004a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d7 f16005b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kv f16006c;

    public ph0(kv kvVar, kh0 kh0, d7 d7Var) {
        this.f16006c = kvVar;
        this.f16004a = kh0;
        this.f16005b = d7Var;
    }

    public final void Y(int i10) {
    }

    public final void z0(Bundle bundle) {
        synchronized (this.f16006c.f7305d) {
            kv kvVar = this.f16006c;
            if (!kvVar.f7303b) {
                kvVar.f7303b = true;
                lh0 lh0 = kvVar.f7302a;
                if (lh0 != null) {
                    p50<?> b10 = ((ih) h9.f14881a).b(new wu(this, lh0, this.f16004a, this.f16005b));
                    d7 d7Var = this.f16005b;
                    d7Var.f6188a.a(new j0(d7Var, (Future) b10), h9.f14886f);
                }
            }
        }
    }
}
