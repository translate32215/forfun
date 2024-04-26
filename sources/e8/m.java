package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m extends l<Long> {
    public m(String str, Long l10) {
        super(1, str, l10, (k) null);
    }

    public final Object d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f15346b, ((Long) this.f15347c).longValue()));
    }

    public final Object e(Bundle bundle) {
        String valueOf = String.valueOf(this.f15346b);
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) this.f15347c;
        }
        String valueOf2 = String.valueOf(this.f15346b);
        return Long.valueOf(bundle.getLong(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    public final void f(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.f15346b, ((Long) obj).longValue());
    }

    public final Object i(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f15346b, ((Long) this.f15347c).longValue()));
    }
}
