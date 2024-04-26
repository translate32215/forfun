package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class n extends l<Integer> {
    public n(String str, Integer num) {
        super(1, str, num, (k) null);
    }

    public final Object d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f15346b, ((Integer) this.f15347c).intValue()));
    }

    public final Object e(Bundle bundle) {
        String valueOf = String.valueOf(this.f15346b);
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) this.f15347c;
        }
        String valueOf2 = String.valueOf(this.f15346b);
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final void f(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.f15346b, ((Integer) obj).intValue());
    }

    public final Object i(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f15346b, ((Integer) this.f15347c).intValue()));
    }
}
