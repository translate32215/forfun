package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;
import com.google.android.gms.internal.ads.u4;
import com.google.android.gms.internal.ads.v4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class j6 extends c<v4> {
    public j6() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof v4) {
            return (v4) queryLocalInterface;
        }
        return new u4(iBinder);
    }
}
