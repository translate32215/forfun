package k8;

import android.util.Log;
import androidx.fragment.app.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s4 extends w4<Double> {
    public s4(u4 u4Var, Double d10) {
        super(u4Var, "measurement.test.double_flag", d10);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            Log.e("PhenotypeFlag", c.a(new StringBuilder(String.valueOf(c10).length() + 27 + str.length()), "Invalid double value for ", c10, ": ", str));
            return null;
        }
    }
}
