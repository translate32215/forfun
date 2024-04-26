package e8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.ads.y4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class s6 extends os implements x4 {
    public static x4 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof x4) {
            return (x4) queryLocalInterface;
        }
        return new y4(iBinder);
    }
}
