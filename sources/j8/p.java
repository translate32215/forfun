package j8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class p extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f19673a;

    public p(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f19673a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == p.class) {
            if (this == obj) {
                return true;
            }
            p pVar = (p) obj;
            return this.f19673a == pVar.f19673a && get() == pVar.get();
        }
    }

    public final int hashCode() {
        return this.f19673a;
    }
}
