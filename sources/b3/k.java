package b3;

import a3.a;
import a3.d;
import android.graphics.Path;
import u2.e;
import w2.b;
import w2.f;

/* compiled from: ShapeFill */
public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3520a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f3521b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3522c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3523d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3524e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3525f;

    public k(String str, boolean z10, Path.FillType fillType, a aVar, d dVar, boolean z11) {
        this.f3522c = str;
        this.f3520a = z10;
        this.f3521b = fillType;
        this.f3523d = aVar;
        this.f3524e = dVar;
        this.f3525f = z11;
    }

    public b a(e eVar, c3.b bVar) {
        return new f(eVar, bVar, this);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ShapeFill{color=, fillEnabled=");
        a10.append(this.f3520a);
        a10.append('}');
        return a10.toString();
    }
}
