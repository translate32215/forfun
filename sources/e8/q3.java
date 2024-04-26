package e8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.r1;
import com.google.android.gms.internal.ads.u1;
import d7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q3 extends b<r1> {
    public q3(Context context, Looper looper, b.a aVar, b.C0083b bVar) {
        super(q7.c(context), looper, 166, aVar, bVar);
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof r1) {
            return (r1) queryLocalInterface;
        }
        return new u1(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final String x() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
