package u7;

import com.google.android.gms.common.internal.h;
import java.util.Arrays;
import t7.a;
import t7.a.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f26090a;

    /* renamed from: b  reason: collision with root package name */
    public final t7.a<O> f26091b;

    /* renamed from: c  reason: collision with root package name */
    public final O f26092c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26093d;

    public a(t7.a<O> aVar, O o10, String str) {
        this.f26091b = aVar;
        this.f26092c = o10;
        this.f26093d = str;
        this.f26090a = Arrays.hashCode(new Object[]{aVar, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.f26091b, aVar.f26091b) && h.a(this.f26092c, aVar.f26092c) && h.a(this.f26093d, aVar.f26093d);
    }

    public final int hashCode() {
        return this.f26090a;
    }
}
