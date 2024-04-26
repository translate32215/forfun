package ab;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.c;
import androidx.leanback.widget.s;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f244a;

    public u(Bundle bundle) {
        if (bundle != null) {
            this.f244a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String j10 = j(str);
        return "1".equals(j10) || Boolean.parseBoolean(j10);
    }

    public Integer b(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(j10));
        } catch (NumberFormatException unused) {
            String n10 = n(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(n10).length() + 38 + String.valueOf(j10).length());
            s.a(sb2, "Couldn't parse value of ", n10, "(", j10);
            sb2.append(") into an int");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public JSONArray c(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return new JSONArray(j10);
        } catch (JSONException unused) {
            String n10 = n(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(n10).length() + 50 + String.valueOf(j10).length());
            s.a(sb2, "Malformed JSON for key ", n10, ": ", j10);
            sb2.append(", falling back to default");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public int[] d() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() == 3) {
                int parseColor = Color.parseColor(c10.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c10.optInt(1);
                    iArr[2] = c10.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(c10);
            a.a(new StringBuilder(valueOf.length() + 58), "LightSettings is invalid: ", valueOf, ". Skipping setting LightSettings", "NotificationParams");
            return null;
        } catch (IllegalArgumentException e10) {
            String valueOf2 = String.valueOf(c10);
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 60 + String.valueOf(message).length());
            s.a(sb2, "LightSettings is invalid: ", valueOf2, ". ", message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public Uri e() {
        String j10 = j("gcm.n.link_android");
        if (TextUtils.isEmpty(j10)) {
            j10 = j("gcm.n.link");
        }
        if (!TextUtils.isEmpty(j10)) {
            return Uri.parse(j10);
        }
        return null;
    }

    public Object[] f(String str) {
        JSONArray c10 = c(String.valueOf(str).concat("_loc_args"));
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public String g(String str) {
        return j(String.valueOf(str).concat("_loc_key"));
    }

    public Long h(String str) {
        String j10 = j(str);
        if (TextUtils.isEmpty(j10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(j10));
        } catch (NumberFormatException unused) {
            String n10 = n(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(n10).length() + 38 + String.valueOf(j10).length());
            s.a(sb2, "Couldn't parse value of ", n10, "(", j10);
            sb2.append(") into a long");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public String i(Resources resources, String str, String str2) {
        String j10 = j(str2);
        if (!TextUtils.isEmpty(j10)) {
            return j10;
        }
        String g10 = g(str2);
        if (TextUtils.isEmpty(g10)) {
            return null;
        }
        int identifier = resources.getIdentifier(g10, "string", str);
        if (identifier == 0) {
            String n10 = n(str2.concat("_loc_key"));
            Log.w("NotificationParams", c.a(new StringBuilder(String.valueOf(n10).length() + 49 + str2.length()), n10, " resource not found: ", str2, " Default value will be used."));
            return null;
        }
        Object[] f10 = f(str2);
        if (f10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f10);
        } catch (MissingFormatArgumentException e10) {
            String n11 = n(str2);
            String arrays = Arrays.toString(f10);
            StringBuilder sb2 = new StringBuilder(String.valueOf(n11).length() + 58 + String.valueOf(arrays).length());
            s.a(sb2, "Missing format argument for ", n11, ": ", arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e10);
            return null;
        }
    }

    public String j(String str) {
        String str2;
        Bundle bundle = this.f244a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.f244a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public long[] k() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() > 1) {
                int length = c10.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = c10.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(c10);
            a.a(new StringBuilder(valueOf.length() + 74), "User defined vibrateTimings is invalid: ", valueOf, ". Skipping setting vibrateTimings.", "NotificationParams");
            return null;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle(this.f244a);
        for (String str : this.f244a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
