package e8;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zy implements by {

    /* renamed from: a  reason: collision with root package name */
    public static final by f17803a = new zy();

    public final void a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
        } catch (JSONException unused) {
        }
    }
}
