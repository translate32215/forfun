package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c2 extends c<u1> {
    public c2() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof u1) {
            return (u1) queryLocalInterface;
        }
        return new t1(iBinder);
    }
}
