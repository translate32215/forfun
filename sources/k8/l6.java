package k8;

import cb.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m3.t;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class l6 extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f20308c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20309d;

    public l6(d dVar) {
        super("internal.logger");
        this.f20309d = dVar;
        this.f20255b.put("log", new pc(this, false, true));
        this.f20255b.put("silent", new ya());
        ((i) this.f20255b.get("silent")).f20255b.put("log", new pc(this, true, true));
        this.f20255b.put("unmonitored", new zb());
        ((i) this.f20255b.get("unmonitored")).f20255b.put("log", new pc(this, false, false));
    }

    public final o b(g gVar, List list) {
        TreeMap treeMap;
        Map map;
        switch (this.f20308c) {
            case 0:
                f.n(this.f20254a, 3, list);
                String q10 = gVar.y((o) list.get(0)).q();
                long e10 = (long) f.e(gVar.y((o) list.get(1)).a().doubleValue());
                o y10 = gVar.y((o) list.get(2));
                if (y10 instanceof l) {
                    map = f.m((l) y10);
                } else {
                    map = new HashMap();
                }
                ((c) this.f20309d).f20087c.add(new b(q10, e10, map));
                return o.f20381n;
            case 1:
                return o.f20381n;
            default:
                f.n(this.f20254a, 3, list);
                gVar.y((o) list.get(0)).q();
                o y11 = gVar.y((o) list.get(1));
                if (y11 instanceof n) {
                    o y12 = gVar.y((o) list.get(2));
                    if (y12 instanceof l) {
                        l lVar = (l) y12;
                        if (lVar.f20299a.containsKey("type")) {
                            String q11 = lVar.i("type").q();
                            int f10 = lVar.f20299a.containsKey("priority") ? f.f(lVar.i("priority").a().doubleValue()) : 1000;
                            t tVar = (t) this.f20309d;
                            n nVar = (n) y11;
                            tVar.getClass();
                            if ("create".equals(q11)) {
                                treeMap = (TreeMap) tVar.f21666b;
                            } else if ("edit".equals(q11)) {
                                treeMap = (TreeMap) tVar.f21665a;
                            } else {
                                String valueOf = String.valueOf(q11);
                                throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
                            }
                            if (treeMap.containsKey(Integer.valueOf(f10))) {
                                f10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(f10), nVar);
                            return o.f20381n;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
        }
    }

    public l6(c cVar) {
        super("internal.eventLogger");
        this.f20309d = cVar;
    }

    public l6(t tVar) {
        super("internal.registerCallback");
        this.f20309d = tVar;
    }
}
