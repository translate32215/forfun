package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import d7.b;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class bg extends b<dg> {
    public final int G;

    public bg(Context context, Looper looper, b.a aVar, b.C0083b bVar, int i10) {
        super(context, looper, 116, aVar, bVar);
        this.G = i10;
    }

    public final dg E() throws DeadObjectException {
        return (dg) v();
    }

    public final int g() {
        return this.G;
    }

    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof dg) {
            return (dg) queryLocalInterface;
        }
        return new cg(iBinder);
    }

    public final String w() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final String x() {
        return "com.google.android.gms.gass.START";
    }
}
