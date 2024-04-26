package e8;

import android.os.IBinder;
import android.os.IInterface;
import c8.c;
import com.google.android.gms.internal.ads.s5;
import com.google.android.gms.internal.ads.u5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class s7 extends c<s5> {
    public s7() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof s5) {
            return (s5) queryLocalInterface;
        }
        return new u5(iBinder);
    }
}
