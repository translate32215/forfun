package u2;

import java.util.Arrays;

/* compiled from: LottieResult */
public final class k<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f26011a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f26012b;

    public k(V v10) {
        this.f26011a = v10;
        this.f26012b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        V v10 = this.f26011a;
        if (v10 != null && v10.equals(kVar.f26011a)) {
            return true;
        }
        Throwable th = this.f26012b;
        if (th == null || kVar.f26012b == null) {
            return false;
        }
        return th.toString().equals(this.f26012b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26011a, this.f26012b});
    }

    public k(Throwable th) {
        this.f26012b = th;
        this.f26011a = null;
    }
}
