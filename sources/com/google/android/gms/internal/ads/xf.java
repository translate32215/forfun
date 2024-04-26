package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tf;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class xf implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8554a = new xf();

    public final boolean a(int i10) {
        tf.a aVar;
        if (i10 != 1) {
            aVar = i10 != 2 ? null : tf.a.BLOCKED_REASON_BACKGROUND;
        } else {
            aVar = tf.a.BLOCKED_REASON_UNKNOWN;
        }
        if (aVar != null) {
            return true;
        }
        return false;
    }
}
