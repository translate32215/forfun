package e8;

import android.text.TextUtils;
import b7.a;
import com.google.android.gms.ads.internal.util.i;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ky implements by<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final a.C0050a f15342a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15343b;

    public ky(a.C0050a aVar, String str) {
        this.f15342a = aVar;
        this.f15343b = str;
    }

    public final void a(Object obj) {
        try {
            JSONObject j10 = i.j((JSONObject) obj, "pii");
            a.C0050a aVar = this.f15342a;
            if (aVar == null || TextUtils.isEmpty(aVar.f3648a)) {
                j10.put("pdid", this.f15343b);
                j10.put("pdidtype", "ssaid");
                return;
            }
            j10.put("rdid", this.f15342a.f3648a);
            j10.put("is_lat", this.f15342a.f3649b);
            j10.put("idtype", "adid");
        } catch (JSONException e10) {
            e.v("Failed putting Ad ID.", e10);
        }
    }
}
