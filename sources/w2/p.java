package w2;

import android.graphics.Path;
import b3.j;
import b3.m;
import c3.b;
import java.util.List;
import k1.c;
import u2.e;
import x2.a;

/* compiled from: ShapeContent */
public class p implements l, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final Path f26982a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26983b;

    /* renamed from: c  reason: collision with root package name */
    public final e f26984c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Path> f26985d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26986e;

    /* renamed from: f  reason: collision with root package name */
    public c f26987f = new c(1);

    public p(e eVar, b bVar, m mVar) {
        this.f26983b = mVar.f3532d;
        this.f26984c = eVar;
        a<j, Path> a10 = mVar.f3531c.a();
        this.f26985d = a10;
        bVar.g(a10);
        a10.f27249a.add(this);
    }

    public void d() {
        this.f26986e = false;
        this.f26984c.invalidateSelf();
    }

    public void f(List<b> list, List<b> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = list.get(i10);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f26995c == 1) {
                    this.f26987f.f19876a.add(rVar);
                    rVar.f26994b.add(this);
                }
            }
        }
    }

    public Path i() {
        if (this.f26986e) {
            return this.f26982a;
        }
        this.f26982a.reset();
        if (this.f26983b) {
            this.f26986e = true;
            return this.f26982a;
        }
        this.f26982a.set(this.f26985d.e());
        this.f26982a.setFillType(Path.FillType.EVEN_ODD);
        this.f26987f.d(this.f26982a);
        this.f26986e = true;
        return this.f26982a;
    }
}
