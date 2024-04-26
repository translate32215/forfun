package k8;

import androidx.appcompat.widget.m;
import java.util.Iterator;
import java.util.List;
import m3.t;
import n2.g;
import t1.c;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class a0 extends u {
    public a0() {
        this.f20482a.add(e0.FOR_IN);
        this.f20482a.add(e0.FOR_IN_CONST);
        this.f20482a.add(e0.FOR_IN_LET);
        this.f20482a.add(e0.FOR_LET);
        this.f20482a.add(e0.FOR_OF);
        this.f20482a.add(e0.FOR_OF_CONST);
        this.f20482a.add(e0.FOR_OF_LET);
        this.f20482a.add(e0.WHILE);
    }

    public static o c(z zVar, Iterator<o> it, o oVar) {
        if (it != null) {
            while (it.hasNext()) {
                o z10 = zVar.b(it.next()).z((e) oVar);
                if (z10 instanceof g) {
                    g gVar = (g) z10;
                    if ("break".equals(gVar.f20214b)) {
                        return o.f20381n;
                    }
                    if ("return".equals(gVar.f20214b)) {
                        return gVar;
                    }
                }
            }
        }
        return o.f20381n;
    }

    public static o d(z zVar, o oVar, o oVar2) {
        return c(zVar, oVar.c(), oVar2);
    }

    public static o e(z zVar, o oVar, o oVar2) {
        if (oVar instanceof Iterable) {
            return c(zVar, ((Iterable) oVar).iterator(), oVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final o a(String str, g gVar, List<o> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.k(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    e0 e0Var2 = e0.FOR_IN;
                    f.n("FOR_IN", 3, list);
                    if (list.get(0) instanceof r) {
                        String q10 = list.get(0).q();
                        return d(new c(gVar, q10), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    e0 e0Var3 = e0.FOR_IN_CONST;
                    f.n("FOR_IN_CONST", 3, list);
                    if (list.get(0) instanceof r) {
                        String q11 = list.get(0).q();
                        return d(new m(gVar, q11), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    e0 e0Var4 = e0.FOR_IN_LET;
                    f.n("FOR_IN_LET", 3, list);
                    if (list.get(0) instanceof r) {
                        String q12 = list.get(0).q();
                        return d(new t(gVar, q12), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    e0 e0Var5 = e0.FOR_LET;
                    f.n("FOR_LET", 4, list);
                    o y10 = gVar.y(list.get(0));
                    if (y10 instanceof e) {
                        e eVar = (e) y10;
                        o oVar = list.get(1);
                        o oVar2 = list.get(2);
                        o y11 = gVar.y(list.get(3));
                        g w10 = gVar.w();
                        for (int i10 = 0; i10 < eVar.x(); i10++) {
                            String q13 = eVar.y(i10).q();
                            w10.C(q13, gVar.A(q13));
                        }
                        while (gVar.y(oVar).j().booleanValue()) {
                            o z10 = gVar.z((e) y11);
                            if (z10 instanceof g) {
                                g gVar2 = (g) z10;
                                if ("break".equals(gVar2.f20214b)) {
                                    return o.f20381n;
                                }
                                if ("return".equals(gVar2.f20214b)) {
                                    return gVar2;
                                }
                            }
                            g w11 = gVar.w();
                            for (int i11 = 0; i11 < eVar.x(); i11++) {
                                String q14 = eVar.y(i11).q();
                                w11.C(q14, w10.A(q14));
                            }
                            w11.y(oVar2);
                            w10 = w11;
                        }
                        return o.f20381n;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    e0 e0Var6 = e0.FOR_OF;
                    f.n("FOR_OF", 3, list);
                    if (list.get(0) instanceof r) {
                        String q15 = list.get(0).q();
                        return e(new c(gVar, q15), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    e0 e0Var7 = e0.FOR_OF_CONST;
                    f.n("FOR_OF_CONST", 3, list);
                    if (list.get(0) instanceof r) {
                        String q16 = list.get(0).q();
                        return e(new m(gVar, q16), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    e0 e0Var8 = e0.FOR_OF_LET;
                    f.n("FOR_OF_LET", 3, list);
                    if (list.get(0) instanceof r) {
                        String q17 = list.get(0).q();
                        return e(new t(gVar, q17), gVar.y(list.get(1)), gVar.y(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    b(str);
                    throw null;
            }
        } else {
            e0 e0Var9 = e0.WHILE;
            f.n("WHILE", 4, list);
            o oVar3 = list.get(0);
            o oVar4 = list.get(1);
            o y12 = gVar.y(list.get(3));
            if (gVar.y(list.get(2)).j().booleanValue()) {
                o z11 = gVar.z((e) y12);
                if (z11 instanceof g) {
                    g gVar3 = (g) z11;
                    if ("break".equals(gVar3.f20214b)) {
                        return o.f20381n;
                    }
                    if ("return".equals(gVar3.f20214b)) {
                        return gVar3;
                    }
                }
            }
            while (gVar.y(oVar3).j().booleanValue()) {
                o z12 = gVar.z((e) y12);
                if (z12 instanceof g) {
                    g gVar4 = (g) z12;
                    if ("break".equals(gVar4.f20214b)) {
                        return o.f20381n;
                    }
                    if ("return".equals(gVar4.f20214b)) {
                        return gVar4;
                    }
                }
                gVar.y(oVar4);
            }
            return o.f20381n;
        }
    }
}
