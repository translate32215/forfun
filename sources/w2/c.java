package w2;

import a3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c3.b;
import g3.g;
import java.util.ArrayList;
import java.util.List;
import o1.p;
import u2.e;
import x2.a;
import x2.n;
import z2.f;

/* compiled from: ContentGroup */
public class c implements d, l, a.b, f {

    /* renamed from: a  reason: collision with root package name */
    public Paint f26885a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f26886b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f26887c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f26888d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f26889e;

    /* renamed from: f  reason: collision with root package name */
    public final String f26890f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f26891g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f26892h;

    /* renamed from: i  reason: collision with root package name */
    public final e f26893i;

    /* renamed from: j  reason: collision with root package name */
    public List<l> f26894j;

    /* renamed from: k  reason: collision with root package name */
    public n f26895k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(u2.e r8, c3.b r9, b3.l r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f3526a
            boolean r4 = r10.f3528c
            java.util.List<b3.b> r0 = r10.f3527b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            b3.b r6 = (b3.b) r6
            w2.b r6 = r6.a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<b3.b> r10 = r10.f3527b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            b3.b r0 = (b3.b) r0
            boolean r2 = r0 instanceof a3.j
            if (r2 == 0) goto L_0x003f
            a3.j r0 = (a3.j) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c.<init>(u2.e, c3.b, b3.l):void");
    }

    public String a() {
        return this.f26890f;
    }

    public <T> void b(T t10, p pVar) {
        n nVar = this.f26895k;
        if (nVar != null) {
            nVar.c(t10, pVar);
        }
    }

    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f26887c.set(matrix);
        n nVar = this.f26895k;
        if (nVar != null) {
            this.f26887c.preConcat(nVar.e());
        }
        this.f26889e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f26892h.size() - 1; size >= 0; size--) {
            b bVar = this.f26892h.get(size);
            if (bVar instanceof d) {
                ((d) bVar).c(this.f26889e, this.f26887c, z10);
                rectF.union(this.f26889e);
            }
        }
    }

    public void d() {
        this.f26893i.invalidateSelf();
    }

    public void e(z2.e eVar, int i10, List<z2.e> list, z2.e eVar2) {
        if (eVar.e(this.f26890f, i10)) {
            if (!"__container".equals(this.f26890f)) {
                eVar2 = eVar2.a(this.f26890f);
                if (eVar.c(this.f26890f, i10)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.f26890f, i10)) {
                int d10 = eVar.d(this.f26890f, i10) + i10;
                for (int i11 = 0; i11 < this.f26892h.size(); i11++) {
                    b bVar = this.f26892h.get(i11);
                    if (bVar instanceof f) {
                        ((f) bVar).e(eVar, d10, list, eVar2);
                    }
                }
            }
        }
    }

    public void f(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(this.f26892h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f26892h.size() - 1; size >= 0; size--) {
            b bVar = this.f26892h.get(size);
            bVar.f(arrayList, this.f26892h.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public List<l> g() {
        if (this.f26894j == null) {
            this.f26894j = new ArrayList();
            for (int i10 = 0; i10 < this.f26892h.size(); i10++) {
                b bVar = this.f26892h.get(i10);
                if (bVar instanceof l) {
                    this.f26894j.add((l) bVar);
                }
            }
        }
        return this.f26894j;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int i11;
        if (!this.f26891g) {
            this.f26887c.set(matrix);
            n nVar = this.f26895k;
            if (nVar != null) {
                this.f26887c.preConcat(nVar.e());
                a<Integer, Integer> aVar = this.f26895k.f27289j;
                if (aVar == null) {
                    i11 = 100;
                } else {
                    i11 = aVar.e().intValue();
                }
                i10 = (int) ((((((float) i11) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            boolean z11 = false;
            if (this.f26893i.f25950y) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < this.f26892h.size()) {
                        if ((this.f26892h.get(i12) instanceof d) && (i13 = i13 + 1) >= 2) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10 && i10 != 255) {
                    z11 = true;
                }
            }
            if (z11) {
                this.f26886b.set(0.0f, 0.0f, 0.0f, 0.0f);
                c(this.f26886b, this.f26887c, true);
                this.f26885a.setAlpha(i10);
                g.f(canvas, this.f26886b, this.f26885a, 31);
            }
            if (z11) {
                i10 = 255;
            }
            for (int size = this.f26892h.size() - 1; size >= 0; size--) {
                b bVar = this.f26892h.get(size);
                if (bVar instanceof d) {
                    ((d) bVar).h(canvas, this.f26887c, i10);
                }
            }
            if (z11) {
                canvas.restore();
            }
        }
    }

    public Path i() {
        this.f26887c.reset();
        n nVar = this.f26895k;
        if (nVar != null) {
            this.f26887c.set(nVar.e());
        }
        this.f26888d.reset();
        if (this.f26891g) {
            return this.f26888d;
        }
        for (int size = this.f26892h.size() - 1; size >= 0; size--) {
            b bVar = this.f26892h.get(size);
            if (bVar instanceof l) {
                this.f26888d.addPath(((l) bVar).i(), this.f26887c);
            }
        }
        return this.f26888d;
    }

    public c(e eVar, b bVar, String str, boolean z10, List<b> list, j jVar) {
        this.f26885a = new v2.a();
        this.f26886b = new RectF();
        this.f26887c = new Matrix();
        this.f26888d = new Path();
        this.f26889e = new RectF();
        this.f26890f = str;
        this.f26893i = eVar;
        this.f26891g = z10;
        this.f26892h = list;
        if (jVar != null) {
            n nVar = new n(jVar);
            this.f26895k = nVar;
            nVar.a(bVar);
            this.f26895k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar2 = list.get(size);
            if (bVar2 instanceof i) {
                arrayList.add((i) bVar2);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((i) arrayList.get(size2)).g(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
