package e8;

import d7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bb implements Iterable<za> {

    /* renamed from: a  reason: collision with root package name */
    public final List<za> f13912a = new ArrayList();

    public static boolean c(ia iaVar) {
        za f10 = f(iaVar);
        if (f10 == null) {
            return false;
        }
        f10.f17701c.h();
        return true;
    }

    public static za f(ia iaVar) {
        Iterator<za> it = l.B.f13209z.iterator();
        while (it.hasNext()) {
            za next = it.next();
            if (next.f17700b == iaVar) {
                return next;
            }
        }
        return null;
    }

    public final Iterator<za> iterator() {
        return this.f13912a.iterator();
    }
}
