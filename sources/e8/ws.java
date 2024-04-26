package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.zh;
import f7.j0;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ws implements pi, pj {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f17390b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static int f17391c;

    /* renamed from: a  reason: collision with root package name */
    public final rb f17392a;

    public ws(rb rbVar) {
        this.f17392a = rbVar;
    }

    public final void a(boolean z10) {
        boolean z11;
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16690y3)).booleanValue()) {
            Object obj = f17390b;
            synchronized (obj) {
                z11 = f17391c < ((Integer) ti0.f16763j.f16769f.a(t.f16696z3)).intValue();
            }
            if (z11) {
                rb rbVar = this.f17392a;
                p50<Bundle> a10 = rbVar.f8022b.a();
                ((hf) a10).a(new j0((Future) a10, (zh) new qb(rbVar, z10)), h9.f14886f);
                synchronized (obj) {
                    f17391c++;
                }
            }
        }
    }

    public final void j0(zh0 zh0) {
        a(false);
    }

    public final void v() {
        a(true);
    }
}
