package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class k extends l<Boolean> {
    public k(int i10, String str, Boolean bool) {
        super(i10, str, bool, (k) null);
    }

    public final Object d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f15346b, ((Boolean) this.f15347c).booleanValue()));
    }

    public final Object e(Bundle bundle) {
        String valueOf = String.valueOf(this.f15346b);
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) this.f15347c;
        }
        String valueOf2 = String.valueOf(this.f15346b);
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final void f(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.f15346b, ((Boolean) obj).booleanValue());
    }

    public final Object i(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f15346b, ((Boolean) this.f15347c).booleanValue()));
    }
}
