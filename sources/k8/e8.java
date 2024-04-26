package k8;

import androidx.fragment.app.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class e8 implements Map.Entry, Comparable<e8> {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f20189a;

    /* renamed from: b  reason: collision with root package name */
    public Object f20190b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i8 f20191c;

    public e8(i8 i8Var, Comparable comparable, Object obj) {
        this.f20191c = i8Var;
        this.f20189a = comparable;
        this.f20190b = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f20189a.compareTo(((e8) obj).f20189a);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f20189a;
        Object key = entry.getKey();
        if (comparable == null) {
            z10 = key == null;
        } else {
            z10 = comparable.equals(key);
        }
        if (z10) {
            Object obj2 = this.f20190b;
            Object value = entry.getValue();
            if (obj2 == null) {
                z11 = value == null;
            } else {
                z11 = obj2.equals(value);
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f20189a;
    }

    public final Object getValue() {
        return this.f20190b;
    }

    public final int hashCode() {
        Comparable comparable = this.f20189a;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f20190b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        i8 i8Var = this.f20191c;
        int i10 = i8.f20260g;
        i8Var.h();
        Object obj2 = this.f20190b;
        this.f20190b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20189a);
        String valueOf2 = String.valueOf(this.f20190b);
        return a.a(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
