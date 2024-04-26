package f6;

import com.google.android.exoplayer2.upstream.p;
import java.util.List;
import y5.b;

/* compiled from: FilteringHlsPlaylistParserFactory */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final h f18155a;

    /* renamed from: b  reason: collision with root package name */
    public final List<y5.c> f18156b;

    public c(h hVar, List<y5.c> list) {
        this.f18155a = hVar;
        this.f18156b = list;
    }

    public p.a<f> a() {
        return new b(this.f18155a.a(), this.f18156b);
    }

    public p.a<f> b(d dVar, e eVar) {
        return new b(this.f18155a.b(dVar, eVar), this.f18156b);
    }
}
