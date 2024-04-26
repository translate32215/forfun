package u7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import s8.j;
import t7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f26104a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<j<?>, Boolean> f26105b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f26104a) {
            hashMap = new HashMap(this.f26104a);
        }
        synchronized (this.f26105b) {
            hashMap2 = new HashMap(this.f26105b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).a(new b(status));
            }
        }
    }
}
