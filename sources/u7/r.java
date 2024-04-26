package u7;

import androidx.fragment.app.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import java.util.Set;
import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class r implements b.c, y {

    /* renamed from: a  reason: collision with root package name */
    public final a.f f26125a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f26126b;

    /* renamed from: c  reason: collision with root package name */
    public f f26127c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set<Scope> f26128d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26129e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.b f26130f;

    public r(com.google.android.gms.common.api.internal.b bVar, a.f fVar, a<?> aVar) {
        this.f26130f = bVar;
        this.f26125a = fVar;
        this.f26126b = aVar;
    }

    public final void a(s7.a aVar) {
        this.f26130f.f5770v.post(new q(this, aVar));
    }

    public final void b(s7.a aVar) {
        e eVar = this.f26130f.f5766r.get(this.f26126b);
        if (eVar != null) {
            i.c(eVar.f5791u.f5770v);
            a.f fVar = eVar.f5780b;
            String name = fVar.getClass().getName();
            String valueOf = String.valueOf(aVar);
            fVar.e(c.a(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            eVar.r(aVar, (Exception) null);
        }
    }
}
