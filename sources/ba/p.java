package ba;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Hashing */
public final class p {
    public static int a(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    public static int b(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
