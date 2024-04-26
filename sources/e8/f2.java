package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class f2 extends c<v1> {
    public f2() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof v1) {
            return (v1) queryLocalInterface;
        }
        return new w1(iBinder);
    }
}
