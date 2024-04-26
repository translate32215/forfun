package k8;

import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class v extends u {
    public v() {
        this.f20482a.add(e0.EQUALS);
        this.f20482a.add(e0.GREATER_THAN);
        this.f20482a.add(e0.GREATER_THAN_EQUALS);
        this.f20482a.add(e0.IDENTITY_EQUALS);
        this.f20482a.add(e0.IDENTITY_NOT_EQUALS);
        this.f20482a.add(e0.LESS_THAN);
        this.f20482a.add(e0.LESS_THAN_EQUALS);
        this.f20482a.add(e0.NOT_EQUALS);
    }

    public static boolean c(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if ((oVar instanceof s) || (oVar instanceof m)) {
                return true;
            }
            if (oVar instanceof h) {
                if (Double.isNaN(oVar.a().doubleValue()) || Double.isNaN(oVar2.a().doubleValue())) {
                    return false;
                }
                return oVar.a().equals(oVar2.a());
            } else if (oVar instanceof r) {
                return oVar.q().equals(oVar2.q());
            } else {
                if (oVar instanceof f) {
                    return oVar.j().equals(oVar2.j());
                }
                return oVar == oVar2;
            }
        } else if (((oVar instanceof s) || (oVar instanceof m)) && ((oVar2 instanceof s) || (oVar2 instanceof m))) {
            return true;
        } else {
            boolean z10 = oVar instanceof h;
            if (z10 && (oVar2 instanceof r)) {
                return c(oVar, new h(oVar2.a()));
            }
            boolean z11 = oVar instanceof r;
            if (z11 && (oVar2 instanceof h)) {
                return c(new h(oVar.a()), oVar2);
            }
            if (oVar instanceof f) {
                return c(new h(oVar.a()), oVar2);
            }
            if (oVar2 instanceof f) {
                return c(oVar, new h(oVar2.a()));
            }
            if ((z11 || z10) && (oVar2 instanceof k)) {
                return c(oVar, new r(oVar2.q()));
            }
            if (!(oVar instanceof k) || (!(oVar2 instanceof r) && !(oVar2 instanceof h))) {
                return false;
            }
            return c(new r(oVar.q()), oVar2);
        }
    }

    public static boolean d(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new r(oVar.q());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.q());
        }
        if ((oVar instanceof r) && (oVar2 instanceof r)) {
            return oVar.q().compareTo(oVar2.q()) < 0;
        }
        double doubleValue = oVar.a().doubleValue();
        double doubleValue2 = oVar2.a().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    public static boolean e(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new r(oVar.q());
        }
        if (oVar2 instanceof k) {
            oVar2 = new r(oVar2.q());
        }
        if (((!(oVar instanceof r) || !(oVar2 instanceof r)) && (Double.isNaN(oVar.a().doubleValue()) || Double.isNaN(oVar2.a().doubleValue()))) || d(oVar2, oVar)) {
            return false;
        }
        return true;
    }

    public final o a(String str, g gVar, List<o> list) {
        boolean z10;
        boolean z11;
        f.n(f.k(str).name(), 2, list);
        o y10 = gVar.y(list.get(0));
        o y11 = gVar.y(list.get(1));
        int ordinal = f.k(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z11 = c(y10, y11);
            } else if (ordinal == 42) {
                z10 = d(y10, y11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z10 = d(y11, y10);
                        break;
                    case 38:
                        z10 = e(y11, y10);
                        break;
                    case 39:
                        z10 = f.r(y10, y11);
                        break;
                    case 40:
                        z11 = f.r(y10, y11);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                z10 = e(y10, y11);
            }
            z10 = !z11;
        } else {
            z10 = c(y10, y11);
        }
        return z10 ? o.U : o.V;
    }
}
