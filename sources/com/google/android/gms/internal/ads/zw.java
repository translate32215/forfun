package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bw;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zw implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8769a = new zw();

    public final boolean a(int i10) {
        bw.b bVar;
        if (i10 == 0) {
            bVar = bw.b.PLATFORM_UNSPECIFIED;
        } else if (i10 != 1) {
            bVar = i10 != 2 ? null : bw.b.ANDROID;
        } else {
            bVar = bw.b.IOS;
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }
}
