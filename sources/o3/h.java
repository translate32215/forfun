package o3;

import g4.g;
import k3.c;
import m3.l;
import m3.w;
import o3.i;

/* compiled from: LruResourceCache */
public class h extends g<c, w<?>> implements i {

    /* renamed from: d  reason: collision with root package name */
    public i.a f22909d;

    public h(long j10) {
        super(j10);
    }

    public int b(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.a();
    }

    public void c(Object obj, Object obj2) {
        c cVar = (c) obj;
        w wVar = (w) obj2;
        i.a aVar = this.f22909d;
        if (aVar != null && wVar != null) {
            ((l) aVar).f21596e.a(wVar, true);
        }
    }
}
