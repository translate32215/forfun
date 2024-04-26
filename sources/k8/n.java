package k8;

import java.util.ArrayList;
import java.util.List;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class n extends i {

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f20367c;

    /* renamed from: d  reason: collision with root package name */
    public final List<o> f20368d;

    /* renamed from: e  reason: collision with root package name */
    public g f20369e;

    public n(n nVar) {
        super(nVar.f20254a);
        ArrayList arrayList = new ArrayList(nVar.f20367c.size());
        this.f20367c = arrayList;
        arrayList.addAll(nVar.f20367c);
        ArrayList arrayList2 = new ArrayList(nVar.f20368d.size());
        this.f20368d = arrayList2;
        arrayList2.addAll(nVar.f20368d);
        this.f20369e = nVar.f20369e;
    }

    public final o b(g gVar, List<o> list) {
        g w10 = this.f20369e.w();
        for (int i10 = 0; i10 < this.f20367c.size(); i10++) {
            if (i10 < list.size()) {
                w10.B(this.f20367c.get(i10), gVar.y(list.get(i10)));
            } else {
                w10.B(this.f20367c.get(i10), o.f20381n);
            }
        }
        for (o next : this.f20368d) {
            o y10 = w10.y(next);
            if (y10 instanceof p) {
                y10 = w10.y(next);
            }
            if (y10 instanceof g) {
                return ((g) y10).f20213a;
            }
        }
        return o.f20381n;
    }

    public final o f() {
        return new n(this);
    }

    public n(String str, List<o> list, List<o> list2, g gVar) {
        super(str);
        this.f20367c = new ArrayList();
        this.f20369e = gVar;
        if (!list.isEmpty()) {
            for (o q10 : list) {
                this.f20367c.add(q10.q());
            }
        }
        this.f20368d = new ArrayList(list2);
    }
}
