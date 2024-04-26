package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import d7.b;
import e8.q7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c5 extends b<g5> {
    public c5(Context context, Looper looper, b.a aVar, b.C0083b bVar) {
        super(q7.c(context), looper, 8, aVar, bVar);
    }

    public final g5 E() throws DeadObjectException {
        return (g5) v();
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof g5) {
            return (g5) queryLocalInterface;
        }
        return new h5(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final String x() {
        return "com.google.android.gms.ads.service.START";
    }
}
