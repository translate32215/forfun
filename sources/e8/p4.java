package e8;

import com.google.android.gms.internal.ads.ob;
import s9.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p4 extends p9<u4> {

    /* renamed from: d  reason: collision with root package name */
    public final Object f15868d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final r4 f15869e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15870f;

    public p4(r4 r4Var) {
        super(0);
        this.f15869e = r4Var;
    }

    public final void p() {
        synchronized (this.f15868d) {
            if (!this.f15870f) {
                this.f15870f = true;
                j(new e(1), new ob(2));
                j(new q4(this, 0), new s4(this, 0));
            }
        }
    }
}
