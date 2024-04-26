package k8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class e1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f20180e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f20181f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ o0 f20182g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ s1 f20183h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(s1 s1Var, String str, String str2, o0 o0Var) {
        super(s1Var, true);
        this.f20183h = s1Var;
        this.f20180e = str;
        this.f20181f = str2;
        this.f20182g = o0Var;
    }

    public final void a() throws RemoteException {
        s0 s0Var = this.f20183h.f20460f;
        i.h(s0Var);
        s0Var.getConditionalUserProperties(this.f20180e, this.f20181f, this.f20182g);
    }

    public final void b() {
        this.f20182g.o0((Bundle) null);
    }
}
