package n7;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfu;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class a extends BroadcastReceiver {
    public static Boolean zza;

    public static boolean zzb(Context context) {
        if (context != null) {
            Boolean bool = zza;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            zza = Boolean.valueOf(zzi);
            return zzi;
        }
        throw new NullPointerException("null reference");
    }
}
