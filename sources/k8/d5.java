package k8;

import androidx.fragment.app.a;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class d5<T> implements b5<T> {
    @CheckForNull

    /* renamed from: a  reason: collision with root package name */
    public volatile b5<T> f20119a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f20120b;
    @CheckForNull

    /* renamed from: c  reason: collision with root package name */
    public T f20121c;

    public d5(b5<T> b5Var) {
        b5Var.getClass();
        this.f20119a = b5Var;
    }

    public final String toString() {
        Object obj = this.f20119a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f20121c);
            obj = a.a(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return a.a(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.f20120b) {
            synchronized (this) {
                if (!this.f20120b) {
                    b5<T> b5Var = this.f20119a;
                    b5Var.getClass();
                    T zza = b5Var.zza();
                    this.f20121c = zza;
                    this.f20120b = true;
                    this.f20119a = null;
                    return zza;
                }
            }
        }
        return this.f20121c;
    }
}
