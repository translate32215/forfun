package t;

import java.util.Arrays;
import java.util.Comparator;
import n2.g;
import t.b;

/* compiled from: PriorityGoalRow */
public class e extends b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f25300f = new h[128];

    /* renamed from: g  reason: collision with root package name */
    public h[] f25301g = new h[128];

    /* renamed from: h  reason: collision with root package name */
    public int f25302h = 0;

    /* renamed from: i  reason: collision with root package name */
    public b f25303i = new b(this);

    /* compiled from: PriorityGoalRow */
    public class a implements Comparator<h> {
        public a(e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((h) obj).f25313b - ((h) obj2).f25313b;
        }
    }

    /* compiled from: PriorityGoalRow */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public h f25304a;

        public b(e eVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.f25304a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder a10 = android.support.v4.media.a.a(str);
                    a10.append(this.f25304a.f25319h[i10]);
                    a10.append(" ");
                    str = a10.toString();
                }
            }
            StringBuilder a11 = f.a(str, "] ");
            a11.append(this.f25304a);
            return a11.toString();
        }
    }

    public e(g gVar) {
        super(gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r8 < r7) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t.h a(t.c r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L_0x0004:
            int r3 = r10.f25302h
            if (r1 >= r3) goto L_0x0057
            t.h[] r3 = r10.f25300f
            r4 = r3[r1]
            int r5 = r4.f25313b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            t.e$b r5 = r10.f25303i
            r5.f25304a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L_0x0036
        L_0x001c:
            if (r4 < 0) goto L_0x0032
            t.h r3 = r5.f25304a
            float[] r3 = r3.f25319h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0032:
            r6 = 0
        L_0x0033:
            if (r6 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r3 = r3[r2]
        L_0x0038:
            if (r4 < 0) goto L_0x0050
            float[] r7 = r3.f25319h
            r7 = r7[r4]
            t.h r8 = r5.f25304a
            float[] r8 = r8.f25319h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            int r4 = r4 + -1
            goto L_0x0038
        L_0x004b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            if (r6 == 0) goto L_0x0054
        L_0x0053:
            r2 = r1
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0057:
            if (r2 != r0) goto L_0x005b
            r11 = 0
            return r11
        L_0x005b:
            t.h[] r11 = r10.f25300f
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.a(t.c, boolean[]):t.h");
    }

    public void b(h hVar) {
        this.f25303i.f25304a = hVar;
        Arrays.fill(hVar.f25319h, 0.0f);
        hVar.f25319h[hVar.f25315d] = 1.0f;
        m(hVar);
    }

    public void clear() {
        this.f25302h = 0;
        this.f25275b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f25302h == 0;
    }

    public void l(c cVar, b bVar, boolean z10) {
        b bVar2 = bVar;
        h hVar = bVar2.f25274a;
        if (hVar != null) {
            b.a aVar = bVar2.f25277d;
            int f10 = aVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                h h10 = aVar.h(i10);
                float a10 = aVar.a(i10);
                b bVar3 = this.f25303i;
                bVar3.f25304a = h10;
                boolean z11 = true;
                if (h10.f25312a) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        float[] fArr = bVar3.f25304a.f25319h;
                        fArr[i11] = (hVar.f25319h[i11] * a10) + fArr[i11];
                        if (Math.abs(fArr[i11]) < 1.0E-4f) {
                            bVar3.f25304a.f25319h[i11] = 0.0f;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        e.this.n(bVar3.f25304a);
                    }
                    z11 = false;
                } else {
                    for (int i12 = 0; i12 < 9; i12++) {
                        float f11 = hVar.f25319h[i12];
                        if (f11 != 0.0f) {
                            float f12 = f11 * a10;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f25304a.f25319h[i12] = f12;
                        } else {
                            bVar3.f25304a.f25319h[i12] = 0.0f;
                        }
                    }
                }
                if (z11) {
                    m(h10);
                }
                this.f25275b = (bVar2.f25275b * a10) + this.f25275b;
            }
            n(hVar);
        }
    }

    public final void m(h hVar) {
        int i10;
        int i11 = this.f25302h + 1;
        h[] hVarArr = this.f25300f;
        if (i11 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f25300f = hVarArr2;
            this.f25301g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f25300f;
        int i12 = this.f25302h;
        hVarArr3[i12] = hVar;
        int i13 = i12 + 1;
        this.f25302h = i13;
        if (i13 > 1 && hVarArr3[i13 - 1].f25313b > hVar.f25313b) {
            int i14 = 0;
            while (true) {
                i10 = this.f25302h;
                if (i14 >= i10) {
                    break;
                }
                this.f25301g[i14] = this.f25300f[i14];
                i14++;
            }
            Arrays.sort(this.f25301g, 0, i10, new a(this));
            for (int i15 = 0; i15 < this.f25302h; i15++) {
                this.f25300f[i15] = this.f25301g[i15];
            }
        }
        hVar.f25312a = true;
        hVar.a(this);
    }

    public final void n(h hVar) {
        int i10 = 0;
        while (i10 < this.f25302h) {
            if (this.f25300f[i10] == hVar) {
                while (true) {
                    int i11 = this.f25302h;
                    if (i10 < i11 - 1) {
                        h[] hVarArr = this.f25300f;
                        int i12 = i10 + 1;
                        hVarArr[i10] = hVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f25302h = i11 - 1;
                        hVar.f25312a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public String toString() {
        StringBuilder a10 = f.a("", " goal -> (");
        a10.append(this.f25275b);
        a10.append(") : ");
        String sb2 = a10.toString();
        for (int i10 = 0; i10 < this.f25302h; i10++) {
            this.f25303i.f25304a = this.f25300f[i10];
            StringBuilder a11 = android.support.v4.media.a.a(sb2);
            a11.append(this.f25303i);
            a11.append(" ");
            sb2 = a11.toString();
        }
        return sb2;
    }
}
