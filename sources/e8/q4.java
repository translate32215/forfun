package e8;

import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q4 implements o9<u4>, n9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p4 f16081a;

    public q4(p4 p4Var, int i10) {
        if (i10 != 1) {
            this.f16081a = p4Var;
        } else {
            this.f16081a = p4Var;
        }
    }

    public /* synthetic */ void m(Object obj) {
        u4 u4Var = (u4) obj;
        e.H("Releasing engine reference.");
        this.f16081a.f15869e.q();
    }

    public void run() {
        e.H("Rejecting reference for JS Engine.");
        this.f16081a.g();
    }
}
