package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.vv;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ww implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8492a = new ww();

    public final boolean a(int i10) {
        vv.c cVar;
        if (i10 != 0) {
            cVar = i10 != 1 ? null : vv.c.IN_MEMORY;
        } else {
            cVar = vv.c.UNSPECIFIED;
        }
        if (cVar != null) {
            return true;
        }
        return false;
    }
}
