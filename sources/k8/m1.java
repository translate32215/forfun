package k8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class m1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Long f20315e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f20316f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f20317g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f20318h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f20319i;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f20320r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ s1 f20321s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(s1 s1Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(s1Var, true);
        this.f20321s = s1Var;
        this.f20315e = l10;
        this.f20316f = str;
        this.f20317g = str2;
        this.f20318h = bundle;
        this.f20319i = z10;
        this.f20320r = z11;
    }

    public final void a() throws RemoteException {
        long j10;
        Long l10 = this.f20315e;
        if (l10 == null) {
            j10 = this.f20370a;
        } else {
            j10 = l10.longValue();
        }
        long j11 = j10;
        s0 s0Var = this.f20321s.f20460f;
        i.h(s0Var);
        s0Var.logEvent(this.f20316f, this.f20317g, this.f20318h, this.f20319i, this.f20320r, j11);
    }
}
