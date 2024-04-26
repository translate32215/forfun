package la;

import androidx.activity.e;
import androidx.appcompat.widget.d0;

/* compiled from: Dependency */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f21217a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21218b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21219c;

    public m(Class<?> cls, int i10, int i11) {
        if (cls != null) {
            this.f21217a = cls;
            this.f21218b = i10;
            this.f21219c = i11;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }

    public boolean a() {
        return this.f21218b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f21217a == mVar.f21217a && this.f21218b == mVar.f21218b && this.f21219c == mVar.f21219c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f21217a.hashCode() ^ 1000003) * 1000003) ^ this.f21218b) * 1000003) ^ this.f21219c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f21217a);
        sb2.append(", type=");
        int i10 = this.f21218b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f21219c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else if (i11 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(d0.a("Unsupported injection: ", i11));
        }
        return e.a(sb2, str, "}");
    }
}
