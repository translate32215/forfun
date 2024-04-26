package r3;

import java.io.InputStream;
import java.net.URL;
import q3.f;
import q3.m;
import q3.n;
import q3.q;

/* compiled from: UrlLoader */
public class e implements m<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final m<f, InputStream> f24528a;

    /* compiled from: UrlLoader */
    public static class a implements n<URL, InputStream> {
        public m<URL, InputStream> a(q qVar) {
            return new e(qVar.b(f.class, InputStream.class));
        }
    }

    public e(m<f, InputStream> mVar) {
        this.f24528a = mVar;
    }

    public m.a a(Object obj, int i10, int i11, k3.e eVar) {
        return this.f24528a.a(new f((URL) obj), i10, i11, eVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
