package e8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.qs;
import com.google.android.gms.internal.ads.rs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class pb0 extends os implements qs {
    public static qs s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof qs) {
            return (qs) queryLocalInterface;
        }
        return new rs(iBinder);
    }
}
