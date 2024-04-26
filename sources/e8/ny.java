package e8;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.i;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ny implements by<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15721a;

    /* renamed from: b  reason: collision with root package name */
    public String f15722b;

    public ny(String str, int i10) {
        this.f15721a = i10;
        if (i10 != 1) {
            this.f15722b = str;
        } else {
            this.f15722b = str;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.f15721a) {
            case 0:
                try {
                    ((JSONObject) obj).put("ms", this.f15722b);
                    return;
                } catch (JSONException e10) {
                    e.v("Failed putting Ad ID.", e10);
                    return;
                }
            default:
                try {
                    JSONObject j10 = i.j((JSONObject) obj, "pii");
                    if (!TextUtils.isEmpty(this.f15722b)) {
                        j10.put("attok", this.f15722b);
                        return;
                    }
                    return;
                } catch (JSONException e11) {
                    e.v("Failed putting attestation token.", e11);
                    return;
                }
        }
    }
}
