package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;
import com.google.android.gms.internal.ads.vy;
import com.google.android.gms.internal.ads.wy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class gj0 extends c<wy> {
    public gj0() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof wy) {
            return (wy) queryLocalInterface;
        }
        return new vy(iBinder);
    }
}
