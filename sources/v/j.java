package v;

import java.util.ArrayList;
import w.i;
import w.o;

/* compiled from: HelperWidget */
public class j extends f implements i {

    /* renamed from: r0  reason: collision with root package name */
    public f[] f26304r0 = new f[4];

    /* renamed from: s0  reason: collision with root package name */
    public int f26305s0 = 0;

    public void V(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f26305s0; i11++) {
            oVar.a(this.f26304r0[i11]);
        }
        for (int i12 = 0; i12 < this.f26305s0; i12++) {
            i.a(this.f26304r0[i12], i10, arrayList, oVar);
        }
    }

    public void a(g gVar) {
    }
}
