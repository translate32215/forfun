package androidx.leanback.widget;

/* compiled from: WindowAlignment */
public class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final a f2529a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2530b;

    /* renamed from: c  reason: collision with root package name */
    public a f2531c;

    /* renamed from: d  reason: collision with root package name */
    public a f2532d;

    /* compiled from: WindowAlignment */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2533a = Integer.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        public int f2534b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2535c;

        /* renamed from: d  reason: collision with root package name */
        public int f2536d;

        /* renamed from: e  reason: collision with root package name */
        public int f2537e = 2;

        /* renamed from: f  reason: collision with root package name */
        public int f2538f = 3;

        /* renamed from: g  reason: collision with root package name */
        public int f2539g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f2540h = 50.0f;

        /* renamed from: i  reason: collision with root package name */
        public int f2541i;

        /* renamed from: j  reason: collision with root package name */
        public int f2542j;

        /* renamed from: k  reason: collision with root package name */
        public int f2543k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2544l;

        public a(String str) {
        }

        public final int a() {
            if (!this.f2544l) {
                int i10 = this.f2539g;
                if (i10 < 0) {
                    i10 += this.f2541i;
                }
                float f10 = this.f2540h;
                if (f10 != -1.0f) {
                    return i10 + ((int) ((((float) this.f2541i) * f10) / 100.0f));
                }
                return i10;
            }
            int i11 = this.f2539g;
            int i12 = i11 >= 0 ? this.f2541i - i11 : -i11;
            float f11 = this.f2540h;
            return f11 != -1.0f ? i12 - ((int) ((((float) this.f2541i) * f11) / 100.0f)) : i12;
        }

        public final int b() {
            return (this.f2541i - this.f2542j) - this.f2543k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            r9 = r8.f2535c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r9) {
            /*
                r8 = this;
                int r0 = r8.f2541i
                int r1 = r8.a()
                boolean r2 = r8.e()
                boolean r3 = r8.d()
                if (r2 != 0) goto L_0x0034
                int r4 = r8.f2542j
                int r5 = r1 - r4
                boolean r6 = r8.f2544l
                if (r6 != 0) goto L_0x001f
                int r6 = r8.f2538f
                r6 = r6 & 1
                if (r6 == 0) goto L_0x0034
                goto L_0x0025
            L_0x001f:
                int r6 = r8.f2538f
                r6 = r6 & 2
                if (r6 == 0) goto L_0x0034
            L_0x0025:
                int r6 = r8.f2534b
                int r7 = r9 - r6
                if (r7 > r5) goto L_0x0034
                int r6 = r6 - r4
                if (r3 != 0) goto L_0x0033
                int r9 = r8.f2535c
                if (r6 <= r9) goto L_0x0033
                r6 = r9
            L_0x0033:
                return r6
            L_0x0034:
                if (r3 != 0) goto L_0x005c
                int r3 = r0 - r1
                int r4 = r8.f2543k
                int r3 = r3 - r4
                boolean r5 = r8.f2544l
                if (r5 != 0) goto L_0x0046
                int r5 = r8.f2538f
                r5 = r5 & 2
                if (r5 == 0) goto L_0x005c
                goto L_0x004c
            L_0x0046:
                int r5 = r8.f2538f
                r5 = r5 & 1
                if (r5 == 0) goto L_0x005c
            L_0x004c:
                int r5 = r8.f2533a
                int r6 = r5 - r9
                if (r6 > r3) goto L_0x005c
                int r0 = r0 - r4
                int r5 = r5 - r0
                if (r2 != 0) goto L_0x005b
                int r9 = r8.f2536d
                if (r5 >= r9) goto L_0x005b
                r5 = r9
            L_0x005b:
                return r5
            L_0x005c:
                int r9 = r9 - r1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.t1.a.c(int):int");
        }

        public final boolean d() {
            return this.f2533a == Integer.MAX_VALUE;
        }

        public final boolean e() {
            return this.f2534b == Integer.MIN_VALUE;
        }

        public final void f(int i10, int i11, int i12, int i13) {
            this.f2534b = i10;
            this.f2533a = i11;
            int b10 = b();
            int a10 = a();
            boolean e10 = e();
            boolean d10 = d();
            boolean z10 = true;
            if (!e10) {
                if (this.f2544l ? (this.f2538f & 2) == 0 : (this.f2538f & 1) == 0) {
                    this.f2536d = i12 - a10;
                } else {
                    this.f2536d = this.f2534b - this.f2542j;
                }
            }
            if (!d10) {
                if (this.f2544l ? (this.f2538f & 1) == 0 : (this.f2538f & 2) == 0) {
                    this.f2535c = i13 - a10;
                } else {
                    this.f2535c = (this.f2533a - this.f2542j) - b10;
                }
            }
            if (!d10 && !e10) {
                if (!this.f2544l) {
                    int i14 = this.f2538f;
                    if ((i14 & 1) != 0) {
                        if ((this.f2537e & 1) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f2536d = Math.min(this.f2536d, i13 - a10);
                        }
                        this.f2535c = Math.max(this.f2536d, this.f2535c);
                    } else if ((i14 & 2) != 0) {
                        if ((this.f2537e & 2) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f2535c = Math.max(this.f2535c, i12 - a10);
                        }
                        this.f2536d = Math.min(this.f2536d, this.f2535c);
                    }
                } else {
                    int i15 = this.f2538f;
                    if ((i15 & 1) != 0) {
                        if ((this.f2537e & 1) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f2535c = Math.max(this.f2535c, i12 - a10);
                        }
                        this.f2536d = Math.min(this.f2536d, this.f2535c);
                    } else if ((i15 & 2) != 0) {
                        if ((this.f2537e & 2) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            this.f2536d = Math.min(this.f2536d, i13 - a10);
                        }
                        this.f2535c = Math.max(this.f2536d, this.f2535c);
                    }
                }
            }
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a(" min:");
            a10.append(this.f2534b);
            a10.append(" ");
            a10.append(this.f2536d);
            a10.append(" max:");
            a10.append(this.f2533a);
            a10.append(" ");
            a10.append(this.f2535c);
            return a10.toString();
        }
    }

    public t1() {
        a aVar = new a("vertical");
        this.f2529a = aVar;
        a aVar2 = new a("horizontal");
        this.f2530b = aVar2;
        this.f2531c = aVar2;
        this.f2532d = aVar;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("horizontal=");
        a10.append(this.f2530b);
        a10.append("; vertical=");
        a10.append(this.f2529a);
        return a10.toString();
    }
}
