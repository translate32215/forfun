package k8;

import androidx.fragment.app.a;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class a5<T> extends z4<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f20062a;

    public a5(T t10) {
        this.f20062a = t10;
    }

    public final T a() {
        return this.f20062a;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof a5) {
            return this.f20062a.equals(((a5) obj).f20062a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20062a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20062a);
        return a.a(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }
}
