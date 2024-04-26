package e8;

import com.google.android.gms.internal.ads.qe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qt {

    /* renamed from: a  reason: collision with root package name */
    public final List<oi0> f16201a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, oi0> f16202b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c  reason: collision with root package name */
    public qe f16203c = null;

    public final void a(qe qeVar, long j10, zh0 zh0) {
        String str = qeVar.f7969v;
        if (this.f16202b.containsKey(str)) {
            if (this.f16203c == null) {
                this.f16203c = qeVar;
            }
            oi0 oi0 = this.f16202b.get(str);
            oi0.f15799b = j10;
            oi0.f15800c = zh0;
        }
    }
}
