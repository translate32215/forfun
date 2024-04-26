package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.k9;
import e8.z70;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class r9 implements z70 {

    /* renamed from: a  reason: collision with root package name */
    public static final z70 f8019a = new r9();

    public final boolean a(int i10) {
        k9.c cVar;
        if (i10 == 0) {
            cVar = k9.c.UNKNOWN;
        } else if (i10 != 1) {
            cVar = i10 != 2 ? null : k9.c.DISABLED;
        } else {
            cVar = k9.c.ENABLED;
        }
        if (cVar != null) {
            return true;
        }
        return false;
    }
}
