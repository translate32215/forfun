package b3;

import a3.g;
import android.support.v4.media.a;
import u2.e;
import w2.b;
import w2.p;

/* compiled from: ShapePath */
public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3529a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3530b;

    /* renamed from: c  reason: collision with root package name */
    public final g f3531c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3532d;

    public m(String str, int i10, g gVar, boolean z10) {
        this.f3529a = str;
        this.f3530b = i10;
        this.f3531c = gVar;
        this.f3532d = z10;
    }

    public b a(e eVar, c3.b bVar) {
        return new p(eVar, bVar, this);
    }

    public String toString() {
        StringBuilder a10 = a.a("ShapePath{name=");
        a10.append(this.f3529a);
        a10.append(", index=");
        a10.append(this.f3530b);
        a10.append('}');
        return a10.toString();
    }
}
