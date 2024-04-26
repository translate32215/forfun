package f7;

import android.content.Context;
import b7.a;
import com.google.android.gms.internal.ads.b7;
import java.io.IOException;
import l0.e;
import s7.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public Context f18259b;

    public c0(Context context) {
        this.f18259b = context;
    }

    public final void a() {
        boolean z10;
        try {
            z10 = a.b(this.f18259b);
        } catch (IOException | IllegalStateException | f e10) {
            e.C("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        synchronized (b7.f5991b) {
            b7.f5992c = true;
            b7.f5993d = z10;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Update ad debug logging enablement as ");
        sb2.append(z10);
        e.K(sb2.toString());
    }
}
