package dd;

import dev.pankaj.ytvlib.data.model.Category;
import fb.b;
import java.util.List;
import ud.k;

/* compiled from: CategoriesResponse.kt */
public final class a {
    @b("vt")

    /* renamed from: a  reason: collision with root package name */
    private final int f13248a;
    @b("data")

    /* renamed from: b  reason: collision with root package name */
    private final List<Category> f13249b;

    public final List<Category> a() {
        return this.f13249b;
    }

    public final int b() {
        return this.f13248a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13248a == aVar.f13248a && k.a(this.f13249b, aVar.f13249b);
    }

    public int hashCode() {
        return this.f13249b.hashCode() + (this.f13248a * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("CategoriesResponse(viewType=");
        a10.append(this.f13248a);
        a10.append(", data=");
        a10.append(this.f13249b);
        a10.append(')');
        return a10.toString();
    }
}
