package t;

import java.util.ArrayList;
import n2.g;
import t.c;

/* compiled from: ArrayRow */
public class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public h f25274a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f25275b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f25276c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f25277d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25278e = false;

    /* compiled from: ArrayRow */
    public interface a {
        float a(int i10);

        float b(b bVar, boolean z10);

        float c(h hVar, boolean z10);

        void clear();

        void d(h hVar, float f10);

        float e(h hVar);

        int f();

        boolean g(h hVar);

        h h(int i10);

        void i(float f10);

        void j(h hVar, float f10, boolean z10);

        void k();
    }

    public b() {
    }

    public h a(c cVar, boolean[] zArr) {
        return i(zArr, (h) null);
    }

    public void b(h hVar) {
        float f10;
        int i10 = hVar.f25315d;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
            this.f25277d.d(hVar, f10);
        }
        f10 = 1.0f;
        this.f25277d.d(hVar, f10);
    }

    public b c(c cVar, int i10) {
        this.f25277d.d(cVar.k(i10, "ep"), 1.0f);
        this.f25277d.d(cVar.k(i10, "em"), -1.0f);
        return this;
    }

    public void clear() {
        this.f25277d.clear();
        this.f25274a = null;
        this.f25275b = 0.0f;
    }

    public b d(h hVar, h hVar2, h hVar3, h hVar4, float f10) {
        this.f25277d.d(hVar, -1.0f);
        this.f25277d.d(hVar2, 1.0f);
        this.f25277d.d(hVar3, f10);
        this.f25277d.d(hVar4, -f10);
        return this;
    }

    public b e(h hVar, h hVar2, h hVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f25275b = (float) i10;
        }
        if (!z10) {
            this.f25277d.d(hVar, -1.0f);
            this.f25277d.d(hVar2, 1.0f);
            this.f25277d.d(hVar3, 1.0f);
        } else {
            this.f25277d.d(hVar, 1.0f);
            this.f25277d.d(hVar2, -1.0f);
            this.f25277d.d(hVar3, -1.0f);
        }
        return this;
    }

    public b f(h hVar, h hVar2, h hVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f25275b = (float) i10;
        }
        if (!z10) {
            this.f25277d.d(hVar, -1.0f);
            this.f25277d.d(hVar2, 1.0f);
            this.f25277d.d(hVar3, -1.0f);
        } else {
            this.f25277d.d(hVar, 1.0f);
            this.f25277d.d(hVar2, -1.0f);
            this.f25277d.d(hVar3, 1.0f);
        }
        return this;
    }

    public b g(h hVar, h hVar2, h hVar3, h hVar4, float f10) {
        this.f25277d.d(hVar3, 0.5f);
        this.f25277d.d(hVar4, 0.5f);
        this.f25277d.d(hVar, -0.5f);
        this.f25277d.d(hVar2, -0.5f);
        this.f25275b = -f10;
        return this;
    }

    public final boolean h(h hVar) {
        return hVar.f25323t <= 1;
    }

    public final h i(boolean[] zArr, h hVar) {
        int i10;
        int f10 = this.f25277d.f();
        h hVar2 = null;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < f10; i11++) {
            float a10 = this.f25277d.a(i11);
            if (a10 < 0.0f) {
                h h10 = this.f25277d.h(i11);
                if ((zArr == null || !zArr[h10.f25313b]) && h10 != hVar && (((i10 = h10.f25320i) == 3 || i10 == 4) && a10 < f11)) {
                    f11 = a10;
                    hVar2 = h10;
                }
            }
        }
        return hVar2;
    }

    public boolean isEmpty() {
        return this.f25274a == null && this.f25275b == 0.0f && this.f25277d.f() == 0;
    }

    public void j(h hVar) {
        h hVar2 = this.f25274a;
        if (hVar2 != null) {
            this.f25277d.d(hVar2, -1.0f);
            this.f25274a.f25314c = -1;
            this.f25274a = null;
        }
        float c10 = this.f25277d.c(hVar, true) * -1.0f;
        this.f25274a = hVar;
        if (c10 != 1.0f) {
            this.f25275b /= c10;
            this.f25277d.i(c10);
        }
    }

    public void k(c cVar, h hVar, boolean z10) {
        if (hVar.f25317f) {
            float e10 = this.f25277d.e(hVar);
            this.f25275b = (hVar.f25316e * e10) + this.f25275b;
            this.f25277d.c(hVar, z10);
            if (z10) {
                hVar.b(this);
            }
            if (this.f25277d.f() == 0) {
                this.f25278e = true;
                cVar.f25282a = true;
            }
        }
    }

    public void l(c cVar, b bVar, boolean z10) {
        float b10 = this.f25277d.b(bVar, z10);
        this.f25275b = (bVar.f25275b * b10) + this.f25275b;
        if (z10) {
            bVar.f25274a.b(this);
        }
        if (this.f25274a != null && this.f25277d.f() == 0) {
            this.f25278e = true;
            cVar.f25282a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            t.h r0 = r8.f25274a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            t.h r1 = r8.f25274a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = j.f.a(r0, r1)
            float r1 = r8.f25275b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            float r1 = r8.f25275b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            t.b$a r4 = r8.f25277d
            int r4 = r4.f()
        L_0x003a:
            if (r3 >= r4) goto L_0x009c
            t.b$a r5 = r8.f25277d
            t.h r5 = r5.h(r3)
            if (r5 != 0) goto L_0x0045
            goto L_0x0099
        L_0x0045:
            t.b$a r6 = r8.f25277d
            float r6 = r6.a(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0050
            goto L_0x0099
        L_0x0050:
            java.lang.String r5 = r5.toString()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0063
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0076
            java.lang.String r1 = "- "
            java.lang.String r0 = j.f.a(r0, r1)
            goto L_0x0074
        L_0x0063:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            java.lang.String r1 = " + "
            java.lang.String r0 = j.f.a(r0, r1)
            goto L_0x0076
        L_0x006e:
            java.lang.String r1 = " - "
            java.lang.String r0 = j.f.a(r0, r1)
        L_0x0074:
            float r6 = r6 * r7
        L_0x0076:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            java.lang.String r0 = j.f.a(r0, r5)
            goto L_0x0098
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0098:
            r1 = 1
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x009c:
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = j.f.a(r0, r1)
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.toString():java.lang.String");
    }

    public b(g gVar) {
        this.f25277d = new a(this, gVar);
    }
}
