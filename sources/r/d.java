package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import r.a;

/* compiled from: CardViewBaseImpl */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f24447a = new RectF();

    public void a(e eVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        h hVar = new h(context.getResources(), colorStateList, f10, f11, f12);
        a.C0230a aVar = (a.C0230a) eVar;
        hVar.f24475o = aVar.a();
        hVar.invalidateSelf();
        aVar.f24445a = hVar;
        a.this.setBackgroundDrawable(hVar);
        j(aVar);
    }

    public float b(e eVar) {
        h p10 = p(eVar);
        float f10 = p10.f24468h;
        float f11 = f10 / 2.0f;
        return ((p10.f24468h + ((float) p10.f24461a)) * 2.0f) + (Math.max(f10, f11 + p10.f24466f + ((float) p10.f24461a)) * 2.0f);
    }

    public float c(e eVar) {
        h p10 = p(eVar);
        float f10 = p10.f24468h;
        float f11 = (f10 * 1.5f) / 2.0f;
        return (((p10.f24468h * 1.5f) + ((float) p10.f24461a)) * 2.0f) + (Math.max(f10, f11 + p10.f24466f + ((float) p10.f24461a)) * 2.0f);
    }

    public void d(e eVar) {
    }

    public ColorStateList e(e eVar) {
        return p(eVar).f24471k;
    }

    public void f(e eVar, float f10) {
        h p10 = p(eVar);
        p10.getClass();
        if (f10 >= 0.0f) {
            float f11 = (float) ((int) (f10 + 0.5f));
            if (p10.f24466f != f11) {
                p10.f24466f = f11;
                p10.f24472l = true;
                p10.invalidateSelf();
            }
            j(eVar);
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    public float g(e eVar) {
        return p(eVar).f24470j;
    }

    public float h(e eVar) {
        return p(eVar).f24466f;
    }

    public void j(e eVar) {
        Rect rect = new Rect();
        p(eVar).getPadding(rect);
        int ceil = (int) Math.ceil((double) b(eVar));
        int ceil2 = (int) Math.ceil((double) c(eVar));
        a.C0230a aVar = (a.C0230a) eVar;
        a aVar2 = a.this;
        if (ceil > aVar2.f24440c) {
            d.super.setMinimumWidth(ceil);
        }
        a aVar3 = a.this;
        if (ceil2 > aVar3.f24441d) {
            d.super.setMinimumHeight(ceil2);
        }
        ((a.C0230a) eVar).b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void k(e eVar, float f10) {
        h p10 = p(eVar);
        p10.d(f10, p10.f24468h);
    }

    public void l(e eVar) {
        h p10 = p(eVar);
        a.C0230a aVar = (a.C0230a) eVar;
        p10.f24475o = aVar.a();
        p10.invalidateSelf();
        j(aVar);
    }

    public void m(e eVar, float f10) {
        h p10 = p(eVar);
        p10.d(p10.f24470j, f10);
        j(eVar);
    }

    public float n(e eVar) {
        return p(eVar).f24468h;
    }

    public void o(e eVar, ColorStateList colorStateList) {
        h p10 = p(eVar);
        p10.c(colorStateList);
        p10.invalidateSelf();
    }

    public final h p(e eVar) {
        return (h) ((a.C0230a) eVar).f24445a;
    }
}
