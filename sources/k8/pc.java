package k8;

import cb.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class pc extends i {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20426c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20427d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l6 f20428e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pc(l6 l6Var, boolean z10, boolean z11) {
        super("log");
        this.f20428e = l6Var;
        this.f20426c = z10;
        this.f20427d = z11;
    }

    public final o b(g gVar, List<o> list) {
        f.o("log", 1, list);
        if (list.size() == 1) {
            ((d) this.f20428e.f20309d).i(3, gVar.y(list.get(0)).q(), Collections.emptyList(), this.f20426c, this.f20427d);
            return o.f20381n;
        }
        int f10 = f.f(gVar.y(list.get(0)).a().doubleValue());
        int i10 = f10 != 2 ? f10 != 3 ? f10 != 5 ? f10 != 6 ? 3 : 2 : 5 : 1 : 4;
        String q10 = gVar.y(list.get(1)).q();
        if (list.size() == 2) {
            ((d) this.f20428e.f20309d).i(i10, q10, Collections.emptyList(), this.f20426c, this.f20427d);
            return o.f20381n;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(gVar.y(list.get(i11)).q());
        }
        ((d) this.f20428e.f20309d).i(i10, q10, arrayList, this.f20426c, this.f20427d);
        return o.f20381n;
    }
}
