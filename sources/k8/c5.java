package k8;

import androidx.fragment.app.a;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class c5<T> implements Serializable, b5 {

    /* renamed from: a  reason: collision with root package name */
    public final b5<T> f20091a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient boolean f20092b;
    @CheckForNull

    /* renamed from: c  reason: collision with root package name */
    public transient T f20093c;

    public c5(b5<T> b5Var) {
        b5Var.getClass();
        this.f20091a = b5Var;
    }

    public final String toString() {
        Object obj;
        if (this.f20092b) {
            String valueOf = String.valueOf(this.f20093c);
            obj = a.a(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f20091a;
        }
        String valueOf2 = String.valueOf(obj);
        return a.a(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.f20092b) {
            synchronized (this) {
                if (!this.f20092b) {
                    T zza = this.f20091a.zza();
                    this.f20093c = zza;
                    this.f20092b = true;
                    return zza;
                }
            }
        }
        return this.f20093c;
    }
}
