package k8;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class y4<T> extends z4<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final y4<Object> f20558a = new y4<>();

    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
