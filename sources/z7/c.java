package z7;

import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c {
    public static Set a(int i10, boolean z10) {
        float f10 = true != z10 ? 1.0f : 0.75f;
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new s.c(i10);
        }
        return new HashSet(i10, f10);
    }
}
