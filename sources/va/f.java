package va;

import com.google.firebase.installations.b;
import s8.j;
import va.a;
import xa.d;

/* compiled from: GetAuthTokenListener */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final j f26692a;

    /* renamed from: b  reason: collision with root package name */
    public final j<b> f26693b;

    public f(j jVar, j<b> jVar2) {
        this.f26692a = jVar;
        this.f26693b = jVar2;
    }

    public boolean a(d dVar) {
        if (!dVar.j() || this.f26692a.d(dVar)) {
            return false;
        }
        j<b> jVar = this.f26693b;
        String a10 = dVar.a();
        if (a10 != null) {
            Long valueOf = Long.valueOf(dVar.b());
            Long valueOf2 = Long.valueOf(dVar.g());
            String str = "";
            if (valueOf == null) {
                str = j.f.a(str, " tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str = j.f.a(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                jVar.f25035a.p(new a(a10, valueOf.longValue(), valueOf2.longValue(), (a.C0266a) null));
                return true;
            }
            throw new IllegalStateException(j.f.a("Missing required properties:", str));
        }
        throw new NullPointerException("Null token");
    }

    public boolean b(Exception exc) {
        this.f26693b.a(exc);
        return true;
    }
}
