package w;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.d;
import v.f;
import v.g;
import v.h;
import v.j;
import w.b;

/* compiled from: DependencyGraph */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public g f26804a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26805b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26806c = true;

    /* renamed from: d  reason: collision with root package name */
    public g f26807d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f26808e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0268b f26809f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f26810g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<m> f26811h;

    public e(g gVar) {
        new ArrayList();
        this.f26809f = null;
        this.f26810g = new b.a();
        this.f26811h = new ArrayList<>();
        this.f26804a = gVar;
        this.f26807d = gVar;
    }

    public final void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f26815d;
        if (pVar.f26851c == null) {
            g gVar = this.f26804a;
            if (pVar != gVar.f26253d && pVar != gVar.f26255e) {
                if (mVar == null) {
                    mVar = new m(pVar, i11);
                    arrayList.add(mVar);
                }
                pVar.f26851c = mVar;
                mVar.f26840b.add(pVar);
                for (d next : pVar.f26856h.f26822k) {
                    if (next instanceof f) {
                        a((f) next, i10, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d next2 : pVar.f26857i.f26822k) {
                    if (next2 instanceof f) {
                        a((f) next2, i10, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (d next3 : ((n) pVar).f26841k.f26822k) {
                        if (next3 instanceof f) {
                            a((f) next3, i10, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f a10 : pVar.f26856h.f26823l) {
                    a(a10, i10, 0, fVar2, arrayList, mVar);
                }
                for (f a11 : pVar.f26857i.f26823l) {
                    a(a11, i10, 1, fVar2, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (f a12 : ((n) pVar).f26841k.f26823l) {
                        a(a12, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final boolean b(g gVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        g gVar2 = gVar;
        Iterator<f> it = gVar2.f26307r0.iterator();
        while (it.hasNext()) {
            f next = it.next();
            int[] iArr = next.U;
            int i14 = iArr[0];
            int i15 = iArr[1];
            if (next.f26264i0 == 8) {
                next.f26247a = true;
            } else {
                float f10 = next.f26286w;
                if (f10 < 1.0f && i14 == 3) {
                    next.f26281r = 2;
                }
                float f11 = next.f26289z;
                if (f11 < 1.0f && i15 == 3) {
                    next.f26282s = 2;
                }
                if (next.Y > 0.0f) {
                    if (i14 == 3 && (i15 == 2 || i15 == 1)) {
                        next.f26281r = 3;
                    } else if (i15 == 3 && (i14 == 2 || i14 == 1)) {
                        next.f26282s = 3;
                    } else if (i14 == 3 && i15 == 3) {
                        if (next.f26281r == 0) {
                            next.f26281r = 3;
                        }
                        if (next.f26282s == 0) {
                            next.f26282s = 3;
                        }
                    }
                }
                int i16 = (i14 == 3 && next.f26281r == 1 && (next.J.f26234f == null || next.L.f26234f == null)) ? 2 : i14;
                int i17 = (i15 == 3 && next.f26282s == 1 && (next.K.f26234f == null || next.M.f26234f == null)) ? 2 : i15;
                l lVar = next.f26253d;
                lVar.f26852d = i16;
                int i18 = next.f26281r;
                lVar.f26849a = i18;
                n nVar = next.f26255e;
                nVar.f26852d = i17;
                int i19 = next.f26282s;
                nVar.f26849a = i19;
                if ((i16 == 4 || i16 == 1 || i16 == 2) && (i17 == 4 || i17 == 1 || i17 == 2)) {
                    int u10 = next.u();
                    if (i16 == 4) {
                        i10 = (gVar.u() - next.J.f26235g) - next.L.f26235g;
                        i11 = 1;
                    } else {
                        i10 = u10;
                        i11 = i16;
                    }
                    int l10 = next.l();
                    if (i17 == 4) {
                        i12 = (gVar.l() - next.K.f26235g) - next.M.f26235g;
                        i13 = 1;
                    } else {
                        i12 = l10;
                        i13 = i17;
                    }
                    f(next, i11, i10, i13, i12);
                    next.f26253d.f26853e.c(next.u());
                    next.f26255e.f26853e.c(next.l());
                    next.f26247a = true;
                } else {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        if (i18 == 3) {
                            if (i17 == 2) {
                                f(next, 2, 0, 2, 0);
                            }
                            int l11 = next.l();
                            f(next, 1, (int) ((((float) l11) * next.Y) + 0.5f), 1, l11);
                            next.f26253d.f26853e.c(next.u());
                            next.f26255e.f26853e.c(next.l());
                            next.f26247a = true;
                        } else if (i18 == 1) {
                            f(next, 2, 0, i17, 0);
                            next.f26253d.f26853e.f26833m = next.u();
                        } else if (i18 == 2) {
                            int[] iArr2 = gVar2.U;
                            if (iArr2[0] == 1 || iArr2[0] == 4) {
                                f(next, 1, (int) ((f10 * ((float) gVar.u())) + 0.5f), i17, next.l());
                                next.f26253d.f26853e.c(next.u());
                                next.f26255e.f26853e.c(next.l());
                                next.f26247a = true;
                            }
                        } else {
                            d[] dVarArr = next.R;
                            if (dVarArr[0].f26234f == null || dVarArr[1].f26234f == null) {
                                f(next, 2, 0, i17, 0);
                                next.f26253d.f26853e.c(next.u());
                                next.f26255e.f26853e.c(next.l());
                                next.f26247a = true;
                            }
                        }
                    }
                    if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        if (i19 == 3) {
                            if (i16 == 2) {
                                f(next, 2, 0, 2, 0);
                            }
                            int u11 = next.u();
                            float f12 = next.Y;
                            if (next.Z == -1) {
                                f12 = 1.0f / f12;
                            }
                            f(next, 1, u11, 1, (int) ((((float) u11) * f12) + 0.5f));
                            next.f26253d.f26853e.c(next.u());
                            next.f26255e.f26853e.c(next.l());
                            next.f26247a = true;
                        } else if (i19 == 1) {
                            f(next, i16, 0, 2, 0);
                            next.f26255e.f26853e.f26833m = next.l();
                        } else if (i19 == 2) {
                            int[] iArr3 = gVar2.U;
                            if (iArr3[1] == 1 || iArr3[1] == 4) {
                                f(next, i16, next.u(), 1, (int) ((f11 * ((float) gVar.l())) + 0.5f));
                                next.f26253d.f26853e.c(next.u());
                                next.f26255e.f26853e.c(next.l());
                                next.f26247a = true;
                            }
                        } else {
                            d[] dVarArr2 = next.R;
                            if (dVarArr2[2].f26234f == null || dVarArr2[3].f26234f == null) {
                                f(next, 2, 0, i17, 0);
                                next.f26253d.f26853e.c(next.u());
                                next.f26255e.f26853e.c(next.l());
                                next.f26247a = true;
                            }
                        }
                    }
                    if (i16 == 3 && i17 == 3) {
                        if (i18 == 1 || i19 == 1) {
                            f(next, 2, 0, 2, 0);
                            next.f26253d.f26853e.f26833m = next.u();
                            next.f26255e.f26853e.f26833m = next.l();
                        } else if (i19 == 2 && i18 == 2) {
                            int[] iArr4 = gVar2.U;
                            if (iArr4[0] == 1 && iArr4[1] == 1) {
                                f(next, 1, (int) ((f10 * ((float) gVar.u())) + 0.5f), 1, (int) ((f11 * ((float) gVar.l())) + 0.5f));
                                next.f26253d.f26853e.c(next.u());
                                next.f26255e.f26853e.c(next.l());
                                next.f26247a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList<p> arrayList = this.f26808e;
        arrayList.clear();
        this.f26807d.f26253d.f();
        this.f26807d.f26255e.f();
        arrayList.add(this.f26807d.f26253d);
        arrayList.add(this.f26807d.f26255e);
        Iterator<f> it = this.f26807d.f26307r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            f next = it.next();
            if (next instanceof h) {
                arrayList.add(new j(next));
            } else {
                if (next.A()) {
                    if (next.f26249b == null) {
                        next.f26249b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f26249b);
                } else {
                    arrayList.add(next.f26253d);
                }
                if (next.B()) {
                    if (next.f26251c == null) {
                        next.f26251c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f26251c);
                } else {
                    arrayList.add(next.f26255e);
                }
                if (next instanceof j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f26850b != this.f26807d) {
                next2.d();
            }
        }
        this.f26811h.clear();
        m.f26838c = 0;
        e(this.f26804a.f26253d, 0, this.f26811h);
        e(this.f26804a.f26255e, 1, this.f26811h);
        this.f26805b = false;
    }

    public final int d(g gVar, int i10) {
        float f10;
        e eVar = this;
        g gVar2 = gVar;
        int i11 = i10;
        int size = eVar.f26811h.size();
        long j10 = 0;
        long j11 = 0;
        int i12 = 0;
        while (i12 < size) {
            m mVar = eVar.f26811h.get(i12);
            p pVar = mVar.f26839a;
            if (pVar instanceof c) {
                if (((c) pVar).f26854f != i11) {
                    j10 = Math.max(j10, j11);
                    i12++;
                    j11 = 0;
                    eVar = this;
                    gVar2 = gVar;
                }
            } else if (i11 == 0) {
                if (!(pVar instanceof l)) {
                    j10 = Math.max(j10, j11);
                    i12++;
                    j11 = 0;
                    eVar = this;
                    gVar2 = gVar;
                }
            } else if (!(pVar instanceof n)) {
                j10 = Math.max(j10, j11);
                i12++;
                j11 = 0;
                eVar = this;
                gVar2 = gVar;
            }
            f fVar = (i11 == 0 ? gVar2.f26253d : gVar2.f26255e).f26856h;
            f fVar2 = (i11 == 0 ? gVar2.f26253d : gVar2.f26255e).f26857i;
            boolean contains = pVar.f26856h.f26823l.contains(fVar);
            boolean contains2 = mVar.f26839a.f26857i.f26823l.contains(fVar2);
            long j12 = mVar.f26839a.j();
            if (!contains || !contains2) {
                if (contains) {
                    f fVar3 = mVar.f26839a.f26856h;
                    j11 = Math.max(mVar.b(fVar3, (long) fVar3.f26817f), ((long) mVar.f26839a.f26856h.f26817f) + j12);
                } else if (contains2) {
                    f fVar4 = mVar.f26839a.f26857i;
                    j11 = Math.max(-mVar.a(fVar4, (long) fVar4.f26817f), ((long) (-mVar.f26839a.f26857i.f26817f)) + j12);
                } else {
                    p pVar2 = mVar.f26839a;
                    j11 = (pVar2.j() + ((long) pVar2.f26856h.f26817f)) - ((long) mVar.f26839a.f26857i.f26817f);
                }
                j10 = Math.max(j10, j11);
                i12++;
                j11 = 0;
                eVar = this;
                gVar2 = gVar;
            } else {
                long b10 = mVar.b(mVar.f26839a.f26856h, j11);
                long a10 = mVar.a(mVar.f26839a.f26857i, j11);
                long j13 = b10 - j12;
                p pVar3 = mVar.f26839a;
                int i13 = pVar3.f26857i.f26817f;
                if (j13 >= ((long) (-i13))) {
                    j13 += (long) i13;
                }
                long j14 = (long) pVar3.f26856h.f26817f;
                long j15 = ((-a10) - j12) - j14;
                if (j15 >= j14) {
                    j15 -= j14;
                }
                f fVar5 = pVar3.f26850b;
                fVar5.getClass();
                if (i11 == 0) {
                    f10 = fVar5.f26258f0;
                } else {
                    f10 = i11 == 1 ? fVar5.f26260g0 : -1.0f;
                }
                float f11 = (float) (f10 > 0.0f ? (long) ((((float) j13) / (1.0f - f10)) + (((float) j15) / f10)) : 0);
                long a11 = ((long) ((f11 * f10) + 0.5f)) + j12 + ((long) h.e.a(1.0f, f10, f11, 0.5f));
                p pVar4 = mVar.f26839a;
                j11 = (((long) pVar4.f26856h.f26817f) + a11) - ((long) pVar4.f26857i.f26817f);
                j10 = Math.max(j10, j11);
                i12++;
                j11 = 0;
                eVar = this;
                gVar2 = gVar;
            }
        }
        return (int) j10;
    }

    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        for (d next : pVar.f26856h.f26822k) {
            if (next instanceof f) {
                a((f) next, i10, 0, pVar.f26857i, arrayList, (m) null);
            } else if (next instanceof p) {
                a(((p) next).f26856h, i10, 0, pVar.f26857i, arrayList, (m) null);
            }
        }
        for (d next2 : pVar.f26857i.f26822k) {
            if (next2 instanceof f) {
                a((f) next2, i10, 1, pVar.f26856h, arrayList, (m) null);
            } else if (next2 instanceof p) {
                a(((p) next2).f26857i, i10, 1, pVar.f26856h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d next3 : ((n) pVar).f26841k.f26822k) {
                if (next3 instanceof f) {
                    a((f) next3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(f fVar, int i10, int i11, int i12, int i13) {
        b.a aVar = this.f26810g;
        aVar.f26792a = i10;
        aVar.f26793b = i12;
        aVar.f26794c = i11;
        aVar.f26795d = i13;
        ((ConstraintLayout.b) this.f26809f).b(fVar, aVar);
        fVar.S(this.f26810g.f26796e);
        fVar.N(this.f26810g.f26797f);
        b.a aVar2 = this.f26810g;
        fVar.E = aVar2.f26799h;
        fVar.K(aVar2.f26798g);
    }

    public void g() {
        g gVar;
        Iterator<f> it = this.f26804a.f26307r0.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!next.f26247a) {
                int[] iArr = next.U;
                boolean z10 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = next.f26281r;
                int i13 = next.f26282s;
                boolean z11 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f26253d.f26853e;
                boolean z12 = gVar2.f26821j;
                g gVar3 = next.f26255e.f26853e;
                boolean z13 = gVar3.f26821j;
                if (z12 && z13) {
                    f(next, 1, gVar2.f26818g, 1, gVar3.f26818g);
                    next.f26247a = true;
                } else if (z12 && z10) {
                    f(next, 1, gVar2.f26818g, 2, gVar3.f26818g);
                    if (i11 == 3) {
                        next.f26255e.f26853e.f26833m = next.l();
                    } else {
                        next.f26255e.f26853e.c(next.l());
                        next.f26247a = true;
                    }
                } else if (z13 && z11) {
                    f(next, 2, gVar2.f26818g, 1, gVar3.f26818g);
                    if (i10 == 3) {
                        next.f26253d.f26853e.f26833m = next.u();
                    } else {
                        next.f26253d.f26853e.c(next.u());
                        next.f26247a = true;
                    }
                }
                if (next.f26247a && (gVar = next.f26255e.f26842l) != null) {
                    gVar.c(next.f26252c0);
                }
            }
        }
    }
}
