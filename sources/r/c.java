package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import r.a;

/* compiled from: CardViewApi21Impl */
public class c implements f {
    public void a(e eVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g gVar = new g(colorStateList, f10);
        a.C0230a aVar = (a.C0230a) eVar;
        aVar.f24445a = gVar;
        a.this.setBackgroundDrawable(gVar);
        a aVar2 = a.this;
        aVar2.setClipToOutline(true);
        aVar2.setElevation(f11);
        m(eVar, f12);
    }

    public float b(e eVar) {
        return p(eVar).f24448a * 2.0f;
    }

    public float c(e eVar) {
        return p(eVar).f24448a * 2.0f;
    }

    public void d(e eVar) {
        m(eVar, p(eVar).f24452e);
    }

    public ColorStateList e(e eVar) {
        return p(eVar).f24455h;
    }

    public void f(e eVar, float f10) {
        g p10 = p(eVar);
        if (f10 != p10.f24448a) {
            p10.f24448a = f10;
            p10.c((Rect) null);
            p10.invalidateSelf();
        }
    }

    public float g(e eVar) {
        return a.this.getElevation();
    }

    public float h(e eVar) {
        return p(eVar).f24448a;
    }

    public void i() {
    }

    public void j(e eVar) {
        a.C0230a aVar = (a.C0230a) eVar;
        if (!a.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f10 = p(eVar).f24452e;
        float f11 = p(eVar).f24448a;
        int ceil = (int) Math.ceil((double) h.a(f10, f11, aVar.a()));
        int ceil2 = (int) Math.ceil((double) h.b(f10, f11, aVar.a()));
        aVar.b(ceil, ceil2, ceil, ceil2);
    }

    public void k(e eVar, float f10) {
        a.this.setElevation(f10);
    }

    public void l(e eVar) {
        m(eVar, p(eVar).f24452e);
    }

    public void m(e eVar, float f10) {
        g p10 = p(eVar);
        a.C0230a aVar = (a.C0230a) eVar;
        boolean useCompatPadding = a.this.getUseCompatPadding();
        boolean a10 = aVar.a();
        if (!(f10 == p10.f24452e && p10.f24453f == useCompatPadding && p10.f24454g == a10)) {
            p10.f24452e = f10;
            p10.f24453f = useCompatPadding;
            p10.f24454g = a10;
            p10.c((Rect) null);
            p10.invalidateSelf();
        }
        j(eVar);
    }

    public float n(e eVar) {
        return p(eVar).f24452e;
    }

    public void o(e eVar, ColorStateList colorStateList) {
        g p10 = p(eVar);
        p10.b(colorStateList);
        p10.invalidateSelf();
    }

    public final g p(e eVar) {
        return (g) ((a.C0230a) eVar).f24445a;
    }
}
