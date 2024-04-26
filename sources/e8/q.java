package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class q extends l<Float> {
    public q(String str, Float f10) {
        super(1, str, f10, (k) null);
    }

    public final Object d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f15346b, ((Float) this.f15347c).floatValue()));
    }

    public final Object e(Bundle bundle) {
        String valueOf = String.valueOf(this.f15346b);
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) this.f15347c;
        }
        String valueOf2 = String.valueOf(this.f15346b);
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final void f(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(this.f15346b, ((Float) obj).floatValue());
    }

    public final Object i(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f15346b, (double) ((Float) this.f15347c).floatValue()));
    }
}
