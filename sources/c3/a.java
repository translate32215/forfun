package c3;

import x2.a;

/* compiled from: BaseLayer */
public class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4134a;

    public a(b bVar) {
        this.f4134a = bVar;
    }

    public void d() {
        b bVar = this.f4134a;
        boolean z10 = bVar.f4151q.j() == 1.0f;
        if (z10 != bVar.f4157w) {
            bVar.f4157w = z10;
            bVar.f4148n.invalidateSelf();
        }
    }
}
