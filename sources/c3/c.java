package c3;

import a3.b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o1.p;
import s.f;
import t.g;
import u2.d;
import u2.e;
import u2.j;
import x2.a;
import x2.o;

/* compiled from: CompositionLayer */
public class c extends b {
    public final RectF A = new RectF();
    public Paint B = new Paint();

    /* renamed from: x  reason: collision with root package name */
    public a<Float, Float> f4158x;

    /* renamed from: y  reason: collision with root package name */
    public final List<b> f4159y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f4160z = new RectF();

    public c(e eVar, e eVar2, List<e> list, d dVar) {
        super(eVar, eVar2);
        int i10;
        b bVar;
        b bVar2;
        b bVar3 = eVar2.f4182s;
        if (bVar3 != null) {
            a<Float, Float> a10 = bVar3.a();
            this.f4158x = a10;
            g(a10);
            this.f4158x.f27249a.add(this);
        } else {
            this.f4158x = null;
        }
        f fVar = new f(dVar.f25927i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar3 = list.get(size);
            int ordinal = eVar3.f4168e.ordinal();
            if (ordinal == 0) {
                bVar2 = new c(eVar, eVar3, dVar.f25921c.get(eVar3.f4170g), dVar);
            } else if (ordinal == 1) {
                bVar2 = new h(eVar, eVar3);
            } else if (ordinal == 2) {
                bVar2 = new d(eVar, eVar3);
            } else if (ordinal == 3) {
                bVar2 = new f(eVar, eVar3);
            } else if (ordinal == 4) {
                bVar2 = new g(eVar, eVar3);
            } else if (ordinal != 5) {
                StringBuilder a11 = android.support.v4.media.a.a("Unknown layer type ");
                a11.append(eVar3.f4168e);
                g3.c.a(a11.toString());
                bVar2 = null;
            } else {
                bVar2 = new i(eVar, eVar3);
            }
            if (bVar2 != null) {
                fVar.h(bVar2.f4149o.f4167d, bVar2);
                if (bVar4 != null) {
                    bVar4.f4152r = bVar2;
                    bVar4 = null;
                } else {
                    this.f4159y.add(0, bVar2);
                    int f10 = g.f(eVar3.f4184u);
                    if (f10 == 1 || f10 == 2) {
                        bVar4 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < fVar.j(); i10++) {
            b bVar5 = (b) fVar.e(fVar.g(i10));
            if (!(bVar5 == null || (bVar = (b) fVar.e(bVar5.f4149o.f4169f)) == null)) {
                bVar5.f4153s = bVar;
            }
        }
    }

    public <T> void b(T t10, p pVar) {
        this.f4156v.c(t10, pVar);
        if (t10 != j.A) {
            return;
        }
        if (pVar == null) {
            a<Float, Float> aVar = this.f4158x;
            if (aVar != null) {
                aVar.i((p) null);
                return;
            }
            return;
        }
        o oVar = new o(pVar, null);
        this.f4158x = oVar;
        oVar.f27249a.add(this);
        g(this.f4158x);
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        for (int size = this.f4159y.size() - 1; size >= 0; size--) {
            this.f4160z.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f4159y.get(size).c(this.f4160z, this.f4147m, true);
            rectF.union(this.f4160z);
        }
    }

    public void l(Canvas canvas, Matrix matrix, int i10) {
        RectF rectF = this.A;
        e eVar = this.f4149o;
        rectF.set(0.0f, 0.0f, (float) eVar.f4178o, (float) eVar.f4179p);
        matrix.mapRect(this.A);
        boolean z10 = this.f4148n.f25950y && this.f4159y.size() > 1 && i10 != 255;
        if (z10) {
            this.B.setAlpha(i10);
            g3.g.f(canvas, this.A, this.B, 31);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f4159y.size() - 1; size >= 0; size--) {
            if (!this.A.isEmpty() ? canvas.clipRect(this.A) : true) {
                this.f4159y.get(size).h(canvas, matrix, i10);
            }
        }
        canvas.restore();
        u2.c.a("CompositionLayer#draw");
    }

    public void p(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        for (int i11 = 0; i11 < this.f4159y.size(); i11++) {
            this.f4159y.get(i11).e(eVar, i10, list, eVar2);
        }
    }

    public void q(float f10) {
        super.q(f10);
        if (this.f4158x != null) {
            f10 = ((this.f4158x.e().floatValue() * this.f4149o.f4165b.f25931m) - this.f4149o.f4165b.f25929k) / (this.f4148n.f25935b.c() + 0.01f);
        }
        if (this.f4158x == null) {
            e eVar = this.f4149o;
            f10 -= eVar.f4177n / eVar.f4165b.c();
        }
        float f11 = this.f4149o.f4176m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        int size = this.f4159y.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.f4159y.get(size).q(f10);
            } else {
                return;
            }
        }
    }
}
