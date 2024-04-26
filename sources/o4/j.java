package o4;

import java.util.Set;
import l4.b;
import l4.e;
import l4.f;
import l4.g;

/* compiled from: TransportFactoryImpl */
public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f22952a;

    /* renamed from: b  reason: collision with root package name */
    public final i f22953b;

    /* renamed from: c  reason: collision with root package name */
    public final m f22954c;

    public j(Set<b> set, i iVar, m mVar) {
        this.f22952a = set;
        this.f22953b = iVar;
        this.f22954c = mVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f22952a.contains(bVar)) {
            return new l(this.f22953b, str, bVar, eVar, this.f22954c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f22952a}));
    }
}
