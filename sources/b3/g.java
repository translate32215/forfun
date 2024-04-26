package b3;

import g3.c;
import u2.e;
import w2.b;
import w2.k;

/* compiled from: MergePaths */
public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3492a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3493b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3494c;

    /* compiled from: MergePaths */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public g(String str, a aVar, boolean z10) {
        this.f3492a = str;
        this.f3493b = aVar;
        this.f3494c = z10;
    }

    public b a(e eVar, c3.b bVar) {
        if (eVar.f25946u) {
            return new k(this);
        }
        c.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("MergePaths{mode=");
        a10.append(this.f3493b);
        a10.append('}');
        return a10.toString();
    }
}
