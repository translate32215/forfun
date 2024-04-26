package e8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.6.0 */
public final class u60 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f16851a;

    public u60(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f16851a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == u60.class) {
            if (this == obj) {
                return true;
            }
            u60 u60 = (u60) obj;
            return this.f16851a == u60.f16851a && get() == u60.get();
        }
    }

    public final int hashCode() {
        return this.f16851a;
    }
}
