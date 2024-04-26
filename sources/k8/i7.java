package k8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class i7 {
    public static final int a(int i10, Object obj, Object obj2) {
        h7 h7Var = (h7) obj;
        f7 f7Var = (f7) obj2;
        if (h7Var.isEmpty()) {
            return 0;
        }
        Iterator it = h7Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        h7 h7Var = (h7) obj;
        h7 h7Var2 = (h7) obj2;
        if (!h7Var2.isEmpty()) {
            if (!h7Var.f20245a) {
                h7Var = h7Var.isEmpty() ? new h7() : new h7(h7Var);
            }
            h7Var.b();
            if (!h7Var2.isEmpty()) {
                h7Var.putAll(h7Var2);
            }
        }
        return h7Var;
    }
}
