package ab;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.c;
import com.google.firebase.a;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class t {
    public static String a(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void b(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String string = bundle.getString("google.c.a.c_id");
        if (string != null) {
            bundle2.putString("_nmid", string);
        }
        String string2 = bundle.getString("google.c.a.c_l");
        if (string2 != null) {
            bundle2.putString("_nmn", string2);
        }
        String string3 = bundle.getString("google.c.a.m_l");
        if (!TextUtils.isEmpty(string3)) {
            bundle2.putString("label", string3);
        }
        String string4 = bundle.getString("google.c.a.m_c");
        if (!TextUtils.isEmpty(string4)) {
            bundle2.putString("message_channel", string4);
        }
        String a10 = a(bundle);
        if (a10 != null) {
            bundle2.putString("_nt", a10);
        }
        String string5 = bundle.getString("google.c.a.ts");
        if (string5 != null) {
            try {
                bundle2.putInt("_nmt", Integer.parseInt(string5));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
            }
        }
        String string6 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
        if (string6 != null) {
            try {
                bundle2.putInt("_ndt", Integer.parseInt(string6));
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
            }
        }
        String str2 = true != u.l(bundle) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle2.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle2);
            Log.d("FirebaseMessaging", c.a(new StringBuilder(str.length() + 37 + valueOf.length()), "Logging to scion event=", str, " scionPayload=", valueOf));
        }
        a b10 = a.b();
        b10.a();
        ja.a aVar = (ja.a) b10.f9665d.a(ja.a.class);
        if (aVar != null) {
            aVar.w0("fcm", str, bundle2);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static boolean c(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
