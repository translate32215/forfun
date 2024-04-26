package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.tf;
import e8.a80;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class wf implements a80<Integer, tf.a> {
    public final Object a(Object obj) {
        tf.a aVar;
        tf.a aVar2 = tf.a.BLOCKED_REASON_UNKNOWN;
        int intValue = ((Integer) obj).intValue();
        if (intValue != 1) {
            aVar = intValue != 2 ? null : tf.a.BLOCKED_REASON_BACKGROUND;
        } else {
            aVar = aVar2;
        }
        return aVar == null ? aVar2 : aVar;
    }
}
