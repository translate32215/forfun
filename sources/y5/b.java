package y5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import y5.a;

/* compiled from: FilteringManifestParser */
public final class b<T extends a<T>> implements p.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final p.a<? extends T> f28101a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f28102b;

    public b(p.a<? extends T> aVar, List<c> list) {
        this.f28101a = aVar;
        this.f28102b = list;
    }

    public Object a(Uri uri, InputStream inputStream) throws IOException {
        a aVar = (a) this.f28101a.a(uri, inputStream);
        List<c> list = this.f28102b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.a(this.f28102b);
    }
}
