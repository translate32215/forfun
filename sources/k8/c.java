package k8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public b f20085a;

    /* renamed from: b  reason: collision with root package name */
    public b f20086b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f20087c;

    public c() {
        this.f20085a = new b("", 0, (Map<String, Object>) null);
        this.f20086b = new b("", 0, (Map<String, Object>) null);
        this.f20087c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        c cVar = new c(this.f20085a.clone());
        for (b a10 : this.f20087c) {
            cVar.f20087c.add(a10.clone());
        }
        return cVar;
    }

    public c(b bVar) {
        this.f20085a = bVar;
        this.f20086b = bVar.clone();
        this.f20087c = new ArrayList();
    }
}
