package k8;

import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class b0 extends u {
    public b0() {
        this.f20482a.add(e0.ADD);
        this.f20482a.add(e0.DIVIDE);
        this.f20482a.add(e0.MODULUS);
        this.f20482a.add(e0.MULTIPLY);
        this.f20482a.add(e0.NEGATE);
        this.f20482a.add(e0.POST_DECREMENT);
        this.f20482a.add(e0.POST_INCREMENT);
        this.f20482a.add(e0.PRE_DECREMENT);
        this.f20482a.add(e0.PRE_INCREMENT);
        this.f20482a.add(e0.SUBTRACT);
    }

    public final o a(String str, g gVar, List<o> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.k(str).ordinal();
        if (ordinal == 0) {
            f.n("ADD", 2, list);
            o y10 = gVar.y(list.get(0));
            o y11 = gVar.y(list.get(1));
            if ((y10 instanceof k) || (y10 instanceof r) || (y11 instanceof k) || (y11 instanceof r)) {
                String valueOf = String.valueOf(y10.q());
                String valueOf2 = String.valueOf(y11.q());
                return new r(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new h(Double.valueOf(y11.a().doubleValue() + y10.a().doubleValue()));
        } else if (ordinal == 21) {
            e0 e0Var2 = e0.DIVIDE;
            f.n("DIVIDE", 2, list);
            return new h(Double.valueOf(gVar.y(list.get(0)).a().doubleValue() / gVar.y(list.get(1)).a().doubleValue()));
        } else if (ordinal == 59) {
            e0 e0Var3 = e0.SUBTRACT;
            f.n("SUBTRACT", 2, list);
            o y12 = gVar.y(list.get(0));
            Double valueOf3 = Double.valueOf(-gVar.y(list.get(1)).a().doubleValue());
            if (valueOf3 == null) {
                valueOf3 = Double.valueOf(Double.NaN);
            }
            return new h(Double.valueOf(valueOf3.doubleValue() + y12.a().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            f.n(str, 2, list);
            o y13 = gVar.y(list.get(0));
            gVar.y(list.get(1));
            return y13;
        } else if (ordinal == 55 || ordinal == 56) {
            f.n(str, 1, list);
            return gVar.y(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    e0 e0Var4 = e0.MODULUS;
                    f.n("MODULUS", 2, list);
                    return new h(Double.valueOf(gVar.y(list.get(0)).a().doubleValue() % gVar.y(list.get(1)).a().doubleValue()));
                case 45:
                    e0 e0Var5 = e0.MULTIPLY;
                    f.n("MULTIPLY", 2, list);
                    return new h(Double.valueOf(gVar.y(list.get(0)).a().doubleValue() * gVar.y(list.get(1)).a().doubleValue()));
                case 46:
                    e0 e0Var6 = e0.NEGATE;
                    f.n("NEGATE", 1, list);
                    return new h(Double.valueOf(-gVar.y(list.get(0)).a().doubleValue()));
                default:
                    b(str);
                    throw null;
            }
        }
    }
}
