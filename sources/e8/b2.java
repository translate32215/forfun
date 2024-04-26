package e8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.i1;
import com.google.android.gms.internal.ads.os;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class b2 extends os implements g1 {
    public static g1 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof g1) {
            return (g1) queryLocalInterface;
        }
        return new i1(iBinder);
    }
}
