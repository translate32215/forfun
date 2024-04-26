package e8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class y80 implements v80 {
    public final Map<?, ?> a(Object obj) {
        return (w80) obj;
    }

    public final t80<?, ?> b(Object obj) {
        u80 u80 = (u80) obj;
        throw new NoSuchMethodError();
    }

    public final int c(int i10, Object obj, Object obj2) {
        w80 w80 = (w80) obj;
        u80 u80 = (u80) obj2;
        if (w80.isEmpty()) {
            return 0;
        }
        Iterator it = w80.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final boolean d(Object obj) {
        return !((w80) obj).f17228a;
    }

    public final Object e(Object obj) {
        ((w80) obj).f17228a = false;
        return obj;
    }

    public final Map<?, ?> f(Object obj) {
        return (w80) obj;
    }

    public final Object g(Object obj) {
        w80 w80 = w80.f17227b;
        return w80.isEmpty() ? new w80() : new w80(w80);
    }

    public final Object h(Object obj, Object obj2) {
        w80 w80 = (w80) obj;
        w80 w802 = (w80) obj2;
        if (!w802.isEmpty()) {
            if (!w80.f17228a) {
                w80 = w80.isEmpty() ? new w80() : new w80(w80);
            }
            w80.b();
            if (!w802.isEmpty()) {
                w80.putAll(w802);
            }
        }
        return w80;
    }
}
