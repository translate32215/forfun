package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fb {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, eb> f6456a = new HashMap();

    @Nullable
    public final eb a(List<String> list) {
        eb ebVar;
        for (String next : list) {
            synchronized (this) {
                ebVar = this.f6456a.get(next);
            }
            if (ebVar != null) {
                return ebVar;
            }
        }
        return null;
    }
}
