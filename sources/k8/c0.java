package k8;

import java.util.List;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class c0 extends u {
    public final o a(String str, g gVar, List<o> list) {
        if (str == null || str.isEmpty() || !gVar.D(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        o A = gVar.A(str);
        if (A instanceof i) {
            return ((i) A).b(gVar, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
