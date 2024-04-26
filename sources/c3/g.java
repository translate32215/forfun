package c3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import b3.l;
import java.util.Collections;
import java.util.List;
import u2.e;
import w2.c;

/* compiled from: ShapeLayer */
public class g extends b {

    /* renamed from: x  reason: collision with root package name */
    public final c f4190x;

    public g(e eVar, e eVar2) {
        super(eVar, eVar2);
        c cVar = new c(eVar, this, new l("__container", eVar2.f4164a, false));
        this.f4190x = cVar;
        cVar.f(Collections.emptyList(), Collections.emptyList());
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.f4190x.c(rectF, this.f4147m, z10);
    }

    public void l(Canvas canvas, Matrix matrix, int i10) {
        this.f4190x.h(canvas, matrix, i10);
    }

    public void p(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        this.f4190x.e(eVar, i10, list, eVar2);
    }
}
