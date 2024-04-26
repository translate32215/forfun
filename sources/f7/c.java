package f7;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.yw;
import d7.l;

@TargetApi(26)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class c extends q0 {
    public final yw g(Context context, TelephonyManager telephonyManager) {
        yw ywVar = yw.ENUM_FALSE;
        p pVar = l.B.f13186c;
        return (!p.G(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) ? ywVar : yw.ENUM_TRUE;
    }
}
