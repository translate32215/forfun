package e8;

import com.google.android.gms.internal.ads.gf;
import l0.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class gs implements gf {

    /* renamed from: a  reason: collision with root package name */
    public static final gf f14818a = new gs();

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        e.H("Ad request signals:");
        e.H(jSONObject.toString(2));
        return jSONObject;
    }
}
