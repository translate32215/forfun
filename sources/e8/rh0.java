package e8;

import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.kv;
import s7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rh0 implements b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d7 f16328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kv f16329b;

    public rh0(kv kvVar, d7 d7Var) {
        this.f16329b = kvVar;
        this.f16328a = d7Var;
    }

    public final void m(a aVar) {
        synchronized (this.f16329b.f7305d) {
            this.f16328a.c(new RuntimeException("Connection failed."));
        }
    }
}
