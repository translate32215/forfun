package k8;

import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class y extends u {
    public y() {
        this.f20482a.add(e0.AND);
        this.f20482a.add(e0.NOT);
        this.f20482a.add(e0.OR);
    }

    public final o a(String str, g gVar, List<o> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.k(str).ordinal();
        if (ordinal == 1) {
            e0 e0Var2 = e0.AND;
            f.n("AND", 2, list);
            o y10 = gVar.y(list.get(0));
            if (!y10.j().booleanValue()) {
                return y10;
            }
            return gVar.y(list.get(1));
        } else if (ordinal == 47) {
            e0 e0Var3 = e0.NOT;
            f.n("NOT", 1, list);
            return new f(Boolean.valueOf(!gVar.y(list.get(0)).j().booleanValue()));
        } else if (ordinal == 50) {
            e0 e0Var4 = e0.OR;
            f.n("OR", 2, list);
            o y11 = gVar.y(list.get(0));
            if (y11.j().booleanValue()) {
                return y11;
            }
            return gVar.y(list.get(1));
        } else {
            b(str);
            throw null;
        }
    }
}
