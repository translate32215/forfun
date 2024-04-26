package cb;

import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f4370a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4371b;

    public c(Set<e> set, d dVar) {
        this.f4370a = b(set);
        this.f4371b = dVar;
    }

    public static String b(Set<e> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public String a() {
        if (this.f4371b.b().isEmpty()) {
            return this.f4370a;
        }
        return this.f4370a + ' ' + b(this.f4371b.b());
    }
}
