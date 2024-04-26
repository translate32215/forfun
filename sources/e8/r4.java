package e8;

import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.ri;
import f7.r;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r4 extends p9<h4> {

    /* renamed from: d  reason: collision with root package name */
    public final Object f16238d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public r<h4> f16239e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16240f;

    /* renamed from: g  reason: collision with root package name */
    public int f16241g;

    public r4(r<h4> rVar) {
        super(0);
        this.f16239e = rVar;
        this.f16240f = false;
        this.f16241g = 0;
    }

    public final p4 p() {
        p4 p4Var = new p4(this);
        synchronized (this.f16238d) {
            j(new s4(p4Var, 1), new q4(p4Var, 1));
            i.j(this.f16241g >= 0);
            this.f16241g++;
        }
        return p4Var;
    }

    public final void q() {
        synchronized (this.f16238d) {
            i.j(this.f16241g > 0);
            e.H("Releasing 1 reference for JS Engine");
            this.f16241g--;
            s();
        }
    }

    public final void r() {
        synchronized (this.f16238d) {
            i.j(this.f16241g >= 0);
            e.H("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f16240f = true;
            s();
        }
    }

    public final void s() {
        synchronized (this.f16238d) {
            i.j(this.f16241g >= 0);
            if (!this.f16240f || this.f16241g != 0) {
                e.H("There are still references to the engine. Not destroying.");
            } else {
                e.H("No reference is left (including root). Cleaning up engine.");
                j(new ri(this), new ob(2));
            }
        }
    }
}
