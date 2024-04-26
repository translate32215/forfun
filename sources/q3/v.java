package q3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k3.e;
import q3.m;

/* compiled from: UrlUriLoader */
public class v<Data> implements m<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f24144b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final m<f, Data> f24145a;

    /* compiled from: UrlUriLoader */
    public static class a implements n<Uri, InputStream> {
        public m<Uri, InputStream> a(q qVar) {
            return new v(qVar.b(f.class, InputStream.class));
        }
    }

    public v(m<f, Data> mVar) {
        this.f24145a = mVar;
    }

    public m.a a(Object obj, int i10, int i11, e eVar) {
        return this.f24145a.a(new f(((Uri) obj).toString()), i10, i11, eVar);
    }

    public boolean b(Object obj) {
        return f24144b.contains(((Uri) obj).getScheme());
    }
}
