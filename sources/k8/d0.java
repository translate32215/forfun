package k8;

import java.util.List;
import java.util.Map;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class d0 extends u {
    public d0() {
        this.f20482a.add(e0.ASSIGN);
        this.f20482a.add(e0.CONST);
        this.f20482a.add(e0.CREATE_ARRAY);
        this.f20482a.add(e0.CREATE_OBJECT);
        this.f20482a.add(e0.EXPRESSION_LIST);
        this.f20482a.add(e0.GET);
        this.f20482a.add(e0.GET_INDEX);
        this.f20482a.add(e0.GET_PROPERTY);
        this.f20482a.add(e0.NULL);
        this.f20482a.add(e0.SET_PROPERTY);
        this.f20482a.add(e0.TYPEOF);
        this.f20482a.add(e0.UNDEFINED);
        this.f20482a.add(e0.VAR);
    }

    public final o a(String str, g gVar, List<o> list) {
        String str2;
        e0 e0Var = e0.ADD;
        int ordinal = f.k(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            e0 e0Var2 = e0.ASSIGN;
            f.n("ASSIGN", 2, list);
            o y10 = gVar.y(list.get(0));
            if (!(y10 instanceof r)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{y10.getClass().getCanonicalName()}));
            } else if (gVar.D(y10.q())) {
                o y11 = gVar.y(list.get(1));
                gVar.C(y10.q(), y11);
                return y11;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{y10.q()}));
            }
        } else if (ordinal == 14) {
            e0 e0Var3 = e0.CONST;
            f.o("CONST", 2, list);
            if (list.size() % 2 == 0) {
                int i11 = 0;
                while (i11 < list.size() - 1) {
                    o y12 = gVar.y(list.get(i11));
                    if (y12 instanceof r) {
                        String q10 = y12.q();
                        gVar.B(q10, gVar.y(list.get(i11 + 1)));
                        ((Map) gVar.f21853d).put(q10, Boolean.TRUE);
                        i11 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{y12.getClass().getCanonicalName()}));
                    }
                }
                return o.f20381n;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            e0 e0Var4 = e0.EXPRESSION_LIST;
            f.o("EXPRESSION_LIST", 1, list);
            o oVar = o.f20381n;
            while (i10 < list.size()) {
                oVar = gVar.y(list.get(i10));
                if (!(oVar instanceof g)) {
                    i10++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return oVar;
        } else if (ordinal == 33) {
            e0 e0Var5 = e0.GET;
            f.n("GET", 1, list);
            o y13 = gVar.y(list.get(0));
            if (y13 instanceof r) {
                return gVar.A(y13.q());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{y13.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            e0 e0Var6 = e0.NULL;
            f.n("NULL", 0, list);
            return o.f20382o;
        } else if (ordinal == 58) {
            e0 e0Var7 = e0.SET_PROPERTY;
            f.n("SET_PROPERTY", 3, list);
            o y14 = gVar.y(list.get(0));
            o y15 = gVar.y(list.get(1));
            o y16 = gVar.y(list.get(2));
            if (y14 == o.f20381n || y14 == o.f20382o) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{y15.q(), y14.q()}));
            }
            if ((y14 instanceof e) && (y15 instanceof h)) {
                ((e) y14).D(y15.a().intValue(), y16);
            } else if (y14 instanceof k) {
                ((k) y14).o(y15.q(), y16);
            }
            return y16;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    e0 e0Var8 = e0.GET_PROPERTY;
                    f.n("GET_PROPERTY", 2, list);
                    o y17 = gVar.y(list.get(0));
                    o y18 = gVar.y(list.get(1));
                    if ((y17 instanceof e) && f.q(y18)) {
                        return ((e) y17).y(y18.a().intValue());
                    }
                    if (y17 instanceof k) {
                        return ((k) y17).i(y18.q());
                    }
                    if (y17 instanceof r) {
                        if ("length".equals(y18.q())) {
                            return new h(Double.valueOf((double) y17.q().length()));
                        }
                        if (f.q(y18) && y18.a().doubleValue() < ((double) y17.q().length())) {
                            return new r(String.valueOf(y17.q().charAt(y18.a().intValue())));
                        }
                    }
                    return o.f20381n;
                }
                switch (ordinal) {
                    case 62:
                        e0 e0Var9 = e0.TYPEOF;
                        f.n("TYPEOF", 1, list);
                        o y19 = gVar.y(list.get(0));
                        if (y19 instanceof s) {
                            str2 = "undefined";
                        } else if (y19 instanceof f) {
                            str2 = "boolean";
                        } else if (y19 instanceof h) {
                            str2 = "number";
                        } else if (y19 instanceof r) {
                            str2 = "string";
                        } else if (y19 instanceof n) {
                            str2 = "function";
                        } else if ((y19 instanceof p) || (y19 instanceof g)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{y19}));
                        } else {
                            str2 = "object";
                        }
                        return new r(str2);
                    case 63:
                        e0 e0Var10 = e0.UNDEFINED;
                        f.n("UNDEFINED", 0, list);
                        return o.f20381n;
                    case 64:
                        e0 e0Var11 = e0.VAR;
                        f.o("VAR", 1, list);
                        for (o y20 : list) {
                            o y21 = gVar.y(y20);
                            if (y21 instanceof r) {
                                gVar.B(y21.q(), o.f20381n);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{y21.getClass().getCanonicalName()}));
                            }
                        }
                        return o.f20381n;
                    default:
                        b(str);
                        throw null;
                }
            } else if (list.isEmpty()) {
                return new l();
            } else {
                if (list.size() % 2 == 0) {
                    l lVar = new l();
                    while (i10 < list.size() - 1) {
                        o y22 = gVar.y(list.get(i10));
                        o y23 = gVar.y(list.get(i10 + 1));
                        if ((y22 instanceof g) || (y23 instanceof g)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        lVar.o(y22.q(), y23);
                        i10 += 2;
                    }
                    return lVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new e();
        } else {
            e eVar = new e();
            for (o y24 : list) {
                o y25 = gVar.y(y24);
                if (!(y25 instanceof g)) {
                    eVar.D(i10, y25);
                    i10++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return eVar;
        }
    }
}
