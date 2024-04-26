package u7;

import com.google.android.gms.common.internal.h;
import java.util.Arrays;
import s7.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f26121a;

    /* renamed from: b  reason: collision with root package name */
    public final c f26122b;

    public /* synthetic */ p(a aVar, c cVar) {
        this.f26121a = aVar;
        this.f26122b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (!h.a(this.f26121a, pVar.f26121a) || !h.a(this.f26122b, pVar.f26122b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26121a, this.f26122b});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a("key", this.f26121a);
        aVar.a("feature", this.f26122b);
        return aVar.toString();
    }
}
