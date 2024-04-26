package e8;

import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ri;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zj extends h9<e9> implements zi, tj {

    /* renamed from: b  reason: collision with root package name */
    public final qe f17772b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f17773c = new AtomicBoolean();

    public zj(Set<ul<e9>> set, qe qeVar) {
        super(set);
        this.f17772b = qeVar;
    }

    public final void K0() {
        fx fxVar;
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16583g4)).booleanValue() && this.f17773c.compareAndSet(false, true) && (fxVar = this.f17772b.Z) != null && fxVar.f6504a == 3) {
            I0(new ri(this));
        }
    }

    public final void O() {
        int i10 = this.f17772b.f7944b;
        if (i10 == 2 || i10 == 5 || i10 == 4) {
            K0();
        }
    }

    public final void o4() {
        if (this.f17772b.f7944b == 1) {
            K0();
        }
    }
}
