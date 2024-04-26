package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zf;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ag implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f5962a = new ag();

    public final boolean a(int i10) {
        zf.a aVar;
        if (i10 != 0) {
            aVar = i10 != 1 ? null : zf.a.BLOCKED_IMPRESSION;
        } else {
            aVar = zf.a.EVENT_TYPE_UNKNOWN;
        }
        if (aVar != null) {
            return true;
        }
        return false;
    }
}
