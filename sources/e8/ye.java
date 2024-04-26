package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.g2;
import d7.l;
import f7.d0;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ye implements we {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f17619a = l.B.f13190g.f();

    public final void a(Map<String, String> map) {
        if (!map.isEmpty()) {
            String str = map.get("gad_idless");
            if (str != null) {
                map.remove("gad_idless");
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16579g0)).booleanValue()) {
                    this.f17619a.h(Boolean.parseBoolean(str));
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16573f0)).booleanValue()) {
                l.B.f13207x.e("setConsent", new g2(bundle));
            }
        }
    }
}
