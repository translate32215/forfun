package ne;

import java.io.IOException;
import ke.d0;
import ke.t;
import ke.w;
import ke.z;
import oe.c;
import oe.f;

/* compiled from: ConnectInterceptor */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final w f22489a;

    public a(w wVar) {
        this.f22489a = wVar;
    }

    public d0 a(t.a aVar) throws IOException {
        f fVar = (f) aVar;
        z zVar = fVar.f23704f;
        f fVar2 = fVar.f23700b;
        boolean z10 = !zVar.f20881b.equals("GET");
        w wVar = this.f22489a;
        fVar2.getClass();
        try {
            c i10 = fVar2.e(fVar.f23707i, fVar.f23708j, fVar.f23709k, wVar.I, wVar.D, z10).i(wVar, aVar, fVar2);
            synchronized (fVar2.f22522d) {
                fVar2.f22532n = i10;
            }
            return fVar.b(zVar, fVar2, i10, fVar2.b());
        } catch (IOException e10) {
            throw new d(e10);
        }
    }
}
