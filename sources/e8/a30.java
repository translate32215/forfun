package e8;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a30 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13653a = ((String) p0.f15859b.b());

    public final String a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f13653a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }
}
