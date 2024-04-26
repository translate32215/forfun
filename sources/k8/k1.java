package k8;

import android.os.Bundle;
import c8.b;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public final class k1 extends n1 {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f20281e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f20282f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f20283g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f20284h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f20285i;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ s1 f20286r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(s1 s1Var, String str, String str2, Object obj, boolean z10) {
        super(s1Var, true);
        this.f20286r = s1Var;
        this.f20282f = str;
        this.f20283g = str2;
        this.f20285i = obj;
        this.f20284h = z10;
    }

    public final void a() {
        switch (this.f20281e) {
            case 0:
                s0 s0Var = this.f20286r.f20460f;
                i.h(s0Var);
                s0Var.getUserProperties(this.f20282f, this.f20283g, this.f20284h, (o0) this.f20285i);
                return;
            default:
                s0 s0Var2 = this.f20286r.f20460f;
                i.h(s0Var2);
                s0Var2.setUserProperty(this.f20282f, this.f20283g, new b(this.f20285i), this.f20284h, this.f20370a);
                return;
        }
    }

    public void b() {
        switch (this.f20281e) {
            case 0:
                ((o0) this.f20285i).o0((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(s1 s1Var, String str, String str2, boolean z10, o0 o0Var) {
        super(s1Var, true);
        this.f20286r = s1Var;
        this.f20282f = str;
        this.f20283g = str2;
        this.f20284h = z10;
        this.f20285i = o0Var;
    }
}
