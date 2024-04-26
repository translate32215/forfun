package s4;

import com.google.android.datatransport.runtime.backends.c;
import o4.i;
import u4.b;

public final /* synthetic */ class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f24926a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f24927b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterable f24928c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f24929d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f24930e;

    public /* synthetic */ e(h hVar, c cVar, Iterable iterable, i iVar, int i10) {
        this.f24926a = hVar;
        this.f24927b = cVar;
        this.f24928c = iterable;
        this.f24929d = iVar;
        this.f24930e = i10;
    }

    public final Object a() {
        h hVar = this.f24926a;
        c cVar = this.f24927b;
        Iterable iterable = this.f24928c;
        i iVar = this.f24929d;
        int i10 = this.f24930e;
        hVar.getClass();
        if (cVar.c() == c.a.TRANSIENT_ERROR) {
            hVar.f24939c.W(iterable);
            hVar.f24940d.a(iVar, i10 + 1);
            return null;
        }
        hVar.f24939c.j(iterable);
        if (cVar.c() == c.a.OK) {
            hVar.f24939c.Q(iVar, cVar.b() + hVar.f24943g.a());
        }
        if (!hVar.f24939c.P(iVar)) {
            return null;
        }
        hVar.f24940d.b(iVar, 1, true);
        return null;
    }
}
