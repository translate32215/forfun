package e8;

import f7.d0;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ve implements we {

    /* renamed from: a  reason: collision with root package name */
    public d0 f17124a;

    public ve(d0 d0Var) {
        this.f17124a = d0Var;
    }

    public final void a(Map<String, String> map) {
        this.f17124a.n(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
