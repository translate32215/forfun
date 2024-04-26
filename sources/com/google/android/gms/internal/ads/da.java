package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import c8.a;
import c8.b;
import e8.jn;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class da extends x {

    /* renamed from: a  reason: collision with root package name */
    public final jn f6196a;

    /* renamed from: b  reason: collision with root package name */
    public a f6197b;

    public da(jn jnVar) {
        this.f6196a = jnVar;
    }

    public static float s6(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.z0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final a b3() throws RemoteException {
        a aVar = this.f6197b;
        if (aVar != null) {
            return aVar;
        }
        z l10 = this.f6196a.l();
        if (l10 == null) {
            return null;
        }
        return l10.y3();
    }
}
