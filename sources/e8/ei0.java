package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;
import com.google.android.gms.internal.ads.by;
import com.google.android.gms.internal.ads.ey;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ei0 extends c<by> {
    public ei0() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof by) {
            return (by) queryLocalInterface;
        }
        return new ey(iBinder);
    }
}
