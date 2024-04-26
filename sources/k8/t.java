package k8;

import com.startapp.b4;
import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class t extends u {
    public t() {
        this.f20482a.add(e0.BITWISE_AND);
        this.f20482a.add(e0.BITWISE_LEFT_SHIFT);
        this.f20482a.add(e0.BITWISE_NOT);
        this.f20482a.add(e0.BITWISE_OR);
        this.f20482a.add(e0.BITWISE_RIGHT_SHIFT);
        this.f20482a.add(e0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f20482a.add(e0.BITWISE_XOR);
    }

    public final o a(String str, g gVar, List<o> list) {
        e0 e0Var = e0.ADD;
        switch (f.k(str).ordinal()) {
            case 4:
                e0 e0Var2 = e0.BITWISE_AND;
                f.n("BITWISE_AND", 2, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) & f.f(gVar.y(list.get(1)).a().doubleValue()))));
            case 5:
                e0 e0Var3 = e0.BITWISE_LEFT_SHIFT;
                f.n("BITWISE_LEFT_SHIFT", 2, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) << ((int) (f.j(gVar.y(list.get(1)).a().doubleValue()) & 31)))));
            case 6:
                e0 e0Var4 = e0.BITWISE_NOT;
                f.n("BITWISE_NOT", 1, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) ^ -1)));
            case 7:
                e0 e0Var5 = e0.BITWISE_OR;
                f.n("BITWISE_OR", 2, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) | f.f(gVar.y(list.get(1)).a().doubleValue()))));
            case b4.f10106f:
                e0 e0Var6 = e0.BITWISE_RIGHT_SHIFT;
                f.n("BITWISE_RIGHT_SHIFT", 2, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) >> ((int) (f.j(gVar.y(list.get(1)).a().doubleValue()) & 31)))));
            case 9:
                e0 e0Var7 = e0.BITWISE_UNSIGNED_RIGHT_SHIFT;
                f.n("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, list);
                return new h(Double.valueOf((double) (f.j(gVar.y(list.get(0)).a().doubleValue()) >>> ((int) (f.j(gVar.y(list.get(1)).a().doubleValue()) & 31)))));
            case 10:
                e0 e0Var8 = e0.BITWISE_XOR;
                f.n("BITWISE_XOR", 2, list);
                return new h(Double.valueOf((double) (f.f(gVar.y(list.get(0)).a().doubleValue()) ^ f.f(gVar.y(list.get(1)).a().doubleValue()))));
            default:
                b(str);
                throw null;
        }
    }
}
