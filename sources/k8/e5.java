package k8;

import androidx.fragment.app.a;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class e5<T> implements Serializable, b5 {

    /* renamed from: a  reason: collision with root package name */
    public final T f20184a;

    public e5(T t10) {
        this.f20184a = t10;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof e5)) {
            return false;
        }
        T t10 = this.f20184a;
        T t11 = ((e5) obj).f20184a;
        if (t10 == t11 || t10.equals(t11)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20184a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20184a);
        return a.a(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }

    public final T zza() {
        return this.f20184a;
    }
}
