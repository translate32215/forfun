package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rw;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ex implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f6336a = new ex();

    public final boolean a(int i10) {
        rw.b bVar;
        if (i10 == 0) {
            bVar = rw.b.VIDEO_ERROR_CODE_UNSPECIFIED;
        } else if (i10 == 1) {
            bVar = rw.b.OPENGL_RENDERING_FAILED;
        } else if (i10 != 2) {
            bVar = i10 != 3 ? null : rw.b.ANDROID_TARGET_API_TOO_LOW;
        } else {
            bVar = rw.b.CACHE_LOAD_FAILED;
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }
}
