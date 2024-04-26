package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yq;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zq implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8731a = new zq();

    public final boolean a(int i10) {
        yq.f.a aVar;
        if (i10 != 0) {
            aVar = i10 != 1 ? null : yq.f.a.TYPE_CREATIVE;
        } else {
            aVar = yq.f.a.TYPE_UNKNOWN;
        }
        if (aVar != null) {
            return true;
        }
        return false;
    }
}
