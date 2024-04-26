package b3;

import android.support.v4.media.a;
import java.util.Arrays;
import java.util.List;
import u2.e;
import w2.b;
import w2.c;

/* compiled from: ShapeGroup */
public class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3526a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f3527b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3528c;

    public l(String str, List<b> list, boolean z10) {
        this.f3526a = str;
        this.f3527b = list;
        this.f3528c = z10;
    }

    public b a(e eVar, c3.b bVar) {
        return new c(eVar, bVar, this);
    }

    public String toString() {
        StringBuilder a10 = a.a("ShapeGroup{name='");
        a10.append(this.f3526a);
        a10.append("' Shapes: ");
        a10.append(Arrays.toString(this.f3527b.toArray()));
        a10.append('}');
        return a10.toString();
    }
}
