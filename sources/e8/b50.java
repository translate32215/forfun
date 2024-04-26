package e8;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class b50 {
    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ((i10 + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i10;
    }
}
