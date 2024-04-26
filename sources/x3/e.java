package x3;

import android.graphics.Bitmap;
import v3.b;
import x3.g;

/* compiled from: GifDrawableResource */
public class e extends b<c> {
    public e(c cVar) {
        super(cVar);
    }

    public void P() {
        ((c) this.f26373a).b().prepareToDraw();
    }

    public int a() {
        g gVar = ((c) this.f26373a).f27305a.f27315a;
        return gVar.f27317a.f() + gVar.f27331o;
    }

    public Class<c> b() {
        return c.class;
    }

    public void c() {
        ((c) this.f26373a).stop();
        c cVar = (c) this.f26373a;
        cVar.f27308d = true;
        g gVar = cVar.f27305a.f27315a;
        gVar.f27319c.clear();
        Bitmap bitmap = gVar.f27328l;
        if (bitmap != null) {
            gVar.f27321e.b(bitmap);
            gVar.f27328l = null;
        }
        gVar.f27322f = false;
        g.a aVar = gVar.f27325i;
        if (aVar != null) {
            gVar.f27320d.i(aVar);
            gVar.f27325i = null;
        }
        g.a aVar2 = gVar.f27327k;
        if (aVar2 != null) {
            gVar.f27320d.i(aVar2);
            gVar.f27327k = null;
        }
        g.a aVar3 = gVar.f27330n;
        if (aVar3 != null) {
            gVar.f27320d.i(aVar3);
            gVar.f27330n = null;
        }
        gVar.f27317a.clear();
        gVar.f27326j = true;
    }
}
