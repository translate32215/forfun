package v;

import java.util.ArrayList;
import n2.g;

/* compiled from: WidgetContainer */
public class m extends f {

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList<f> f26307r0 = new ArrayList<>();

    public void F() {
        this.f26307r0.clear();
        super.F();
    }

    public void H(g gVar) {
        super.H(gVar);
        int size = this.f26307r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26307r0.get(i10).H(gVar);
        }
    }

    public void V() {
        ArrayList<f> arrayList = this.f26307r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f26307r0.get(i10);
                if (fVar instanceof m) {
                    ((m) fVar).V();
                }
            }
        }
    }
}
