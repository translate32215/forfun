package b3;

import a3.b;
import a3.j;
import a3.k;
import android.graphics.PointF;
import u2.e;
import w2.n;
import w2.o;

/* compiled from: RectangleShape */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3511a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final String f3512b;

    /* renamed from: c  reason: collision with root package name */
    public final k<PointF, PointF> f3513c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3514d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3515e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3516f;

    public i(String str, b bVar, b bVar2, j jVar, boolean z10) {
        this.f3512b = str;
        this.f3515e = bVar;
        this.f3513c = bVar2;
        this.f3514d = jVar;
        this.f3516f = z10;
    }

    public w2.b a(e eVar, c3.b bVar) {
        switch (this.f3511a) {
            case 0:
                return new n(eVar, bVar, this);
            default:
                return new o(eVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f3511a) {
            case 0:
                return "RectangleShape{position=" + this.f3513c + ", size=" + ((a3.e) this.f3514d) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, k kVar, a3.e eVar, b bVar, boolean z10) {
        this.f3512b = str;
        this.f3513c = kVar;
        this.f3514d = eVar;
        this.f3515e = bVar;
        this.f3516f = z10;
    }
}
