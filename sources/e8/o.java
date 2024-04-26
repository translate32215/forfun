package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o extends l<String> {
    public o(String str, String str2) {
        super(1, str, str2, (k) null);
    }

    public final Object d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f15346b, (String) this.f15347c);
    }

    public final Object e(Bundle bundle) {
        String valueOf = String.valueOf(this.f15346b);
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (String) this.f15347c;
        }
        String valueOf2 = String.valueOf(this.f15346b);
        return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    public final void f(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.f15346b, (String) obj);
    }

    public final Object i(JSONObject jSONObject) {
        return jSONObject.optString(this.f15346b, (String) this.f15347c);
    }
}
