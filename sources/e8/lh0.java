package e8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.iv;
import com.google.android.gms.internal.ads.jv;
import d7.b;
import e.e;
import s7.c;
import v7.y;
import y6.n;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lh0 extends b<jv> {
    public lh0(Context context, Looper looper, b.a aVar, b.C0083b bVar) {
        super(q7.c(context), looper, 123, aVar, bVar);
    }

    public final boolean E() {
        y yVar = this.D;
        return ((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue() && e.d(yVar == null ? null : yVar.f26606b, n.f28132a);
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof jv) {
            return (jv) queryLocalInterface;
        }
        return new iv(iBinder);
    }

    public final c[] r() {
        return n.f28133b;
    }

    public final String w() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final String x() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
