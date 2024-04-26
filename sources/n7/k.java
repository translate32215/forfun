package n7;

import androidx.appcompat.widget.d0;
import com.google.android.gms.internal.gtm.zzfc;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class k {
    public static String a(String str, int i10) {
        if (i10 > 0) {
            return d0.a(str, i10);
        }
        zzfc.zzb("index out of range for prefix", str);
        return "";
    }
}
