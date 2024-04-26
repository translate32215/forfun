package aa;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Objects */
public final class f extends d {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
