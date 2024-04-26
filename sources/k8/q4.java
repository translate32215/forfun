package k8;

import android.util.Log;
import androidx.fragment.app.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class q4 extends w4<Long> {
    public q4(u4 u4Var, String str, Long l10) {
        super(u4Var, str, l10);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            Log.e("PhenotypeFlag", c.a(new StringBuilder(String.valueOf(c10).length() + 25 + str.length()), "Invalid long value for ", c10, ": ", str));
            return null;
        }
    }
}
