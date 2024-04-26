package r6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import ba.l0;
import ba.n;
import ba.n0;
import ba.o0;
import ba.r0;
import ba.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r6.h;
import r6.m;
import r6.n;
import v6.e0;
import x4.b0;
import x4.y;
import z5.g0;

/* compiled from: DefaultTrackSelector */
public class f extends j {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f24575f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final n0<Integer> f24576g = n0.a(e.f24572b);

    /* renamed from: h  reason: collision with root package name */
    public static final n0<Integer> f24577h = n0.a(d.f24571a);

    /* renamed from: d  reason: collision with root package name */
    public final h.b f24578d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<c> f24579e;

    /* compiled from: DefaultTrackSelector */
    public static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24580a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24581b;

        /* renamed from: c  reason: collision with root package name */
        public final c f24582c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24583d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24584e;

        /* renamed from: f  reason: collision with root package name */
        public final int f24585f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24586g;

        /* renamed from: h  reason: collision with root package name */
        public final int f24587h;

        /* renamed from: i  reason: collision with root package name */
        public final int f24588i;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f24589r;

        /* renamed from: s  reason: collision with root package name */
        public final int f24590s;

        /* renamed from: t  reason: collision with root package name */
        public final int f24591t;

        /* renamed from: u  reason: collision with root package name */
        public final int f24592u;

        /* renamed from: v  reason: collision with root package name */
        public final int f24593v;

        public a(b0 b0Var, c cVar, int i10) {
            int i11;
            int i12;
            String[] strArr;
            int i13;
            String str;
            this.f24582c = cVar;
            this.f24581b = f.h(b0Var.f27399c);
            int i14 = 0;
            this.f24583d = f.f(i10, false);
            int i15 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i15 >= cVar.f24666a.size()) {
                    i15 = Integer.MAX_VALUE;
                    i12 = 0;
                    break;
                }
                i12 = f.d(b0Var, cVar.f24666a.get(i15), false);
                if (i12 > 0) {
                    break;
                }
                i15++;
            }
            this.f24585f = i15;
            this.f24584e = i12;
            this.f24586g = Integer.bitCount(b0Var.f27401e & cVar.f24667b);
            this.f24589r = (b0Var.f27400d & 1) != 0;
            int i16 = b0Var.G;
            this.f24590s = i16;
            this.f24591t = b0Var.H;
            int i17 = b0Var.f27404h;
            this.f24592u = i17;
            this.f24580a = (i17 == -1 || i17 <= cVar.E) && (i16 == -1 || i16 <= cVar.D);
            int i18 = e0.f26436a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i19 = e0.f26436a;
            if (i19 >= 24) {
                strArr = e0.R(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr2 = new String[1];
                Locale locale = configuration.locale;
                if (i19 >= 21) {
                    str = locale.toLanguageTag();
                } else {
                    str = locale.toString();
                }
                strArr2[0] = str;
                strArr = strArr2;
            }
            for (int i20 = 0; i20 < strArr.length; i20++) {
                strArr[i20] = e0.K(strArr[i20]);
            }
            int i21 = 0;
            while (true) {
                if (i21 >= strArr.length) {
                    i21 = Integer.MAX_VALUE;
                    i13 = 0;
                    break;
                }
                i13 = f.d(b0Var, strArr[i21], false);
                if (i13 > 0) {
                    break;
                }
                i21++;
            }
            this.f24587h = i21;
            this.f24588i = i13;
            while (true) {
                if (i14 < cVar.J.size()) {
                    String str2 = b0Var.f27408t;
                    if (str2 != null && str2.equals(cVar.J.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.f24593v = i11;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            n0<Integer> n0Var;
            n0<Integer> n0Var2;
            if (!this.f24580a || !this.f24583d) {
                n0Var = f.f24576g.b();
            } else {
                n0Var = f.f24576g;
            }
            n c10 = n.f3760a.c(this.f24583d, aVar.f24583d);
            Integer valueOf = Integer.valueOf(this.f24585f);
            Integer valueOf2 = Integer.valueOf(aVar.f24585f);
            r0 r0Var = r0.f3794a;
            n b10 = c10.b(valueOf, valueOf2, r0Var).a(this.f24584e, aVar.f24584e).a(this.f24586g, aVar.f24586g).c(this.f24580a, aVar.f24580a).b(Integer.valueOf(this.f24593v), Integer.valueOf(aVar.f24593v), r0Var);
            Integer valueOf3 = Integer.valueOf(this.f24592u);
            Integer valueOf4 = Integer.valueOf(aVar.f24592u);
            if (this.f24582c.K) {
                n0Var2 = f.f24576g.b();
            } else {
                n0Var2 = f.f24577h;
            }
            n b11 = b10.b(valueOf3, valueOf4, n0Var2).c(this.f24589r, aVar.f24589r).b(Integer.valueOf(this.f24587h), Integer.valueOf(aVar.f24587h), r0Var).a(this.f24588i, aVar.f24588i).b(Integer.valueOf(this.f24590s), Integer.valueOf(aVar.f24590s), n0Var).b(Integer.valueOf(this.f24591t), Integer.valueOf(aVar.f24591t), n0Var);
            Integer valueOf5 = Integer.valueOf(this.f24592u);
            Integer valueOf6 = Integer.valueOf(aVar.f24592u);
            if (!e0.a(this.f24581b, aVar.f24581b)) {
                n0Var = f.f24577h;
            }
            return b11.b(valueOf5, valueOf6, n0Var).e();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24594a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24595b;

        public b(b0 b0Var, int i10) {
            this.f24594a = (b0Var.f27400d & 1) == 0 ? false : true;
            this.f24595b = f.f(i10, false);
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return n.f3760a.c(this.f24595b, bVar.f24595b).c(this.f24594a, bVar.f24594a).e();
        }
    }

    /* renamed from: r6.f$f  reason: collision with other inner class name */
    /* compiled from: DefaultTrackSelector */
    public static final class C0235f implements Comparable<C0235f> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24633a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24634b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f24635c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24636d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24637e;

        /* renamed from: f  reason: collision with root package name */
        public final int f24638f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24639g;

        /* renamed from: h  reason: collision with root package name */
        public final int f24640h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f24641i;

        public C0235f(b0 b0Var, c cVar, int i10, String str) {
            s<String> sVar;
            int i11;
            boolean z10 = false;
            this.f24634b = f.f(i10, false);
            int i12 = b0Var.f27400d & (cVar.f24671f ^ -1);
            this.f24635c = (i12 & 1) != 0;
            this.f24636d = (i12 & 2) != 0;
            int i13 = Integer.MAX_VALUE;
            if (cVar.f24668c.isEmpty()) {
                sVar = s.C("");
            } else {
                sVar = cVar.f24668c;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= sVar.size()) {
                    i11 = 0;
                    break;
                }
                i11 = f.d(b0Var, sVar.get(i14), cVar.f24670e);
                if (i11 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.f24637e = i13;
            this.f24638f = i11;
            int bitCount = Integer.bitCount(b0Var.f27401e & cVar.f24669d);
            this.f24639g = bitCount;
            this.f24641i = (b0Var.f27401e & 1088) != 0;
            int d10 = f.d(b0Var, str, f.h(str) == null);
            this.f24640h = d10;
            if (i11 > 0 || ((cVar.f24668c.isEmpty() && bitCount > 0) || this.f24635c || (this.f24636d && d10 > 0))) {
                z10 = true;
            }
            this.f24633a = z10;
        }

        /* renamed from: a */
        public int compareTo(C0235f fVar) {
            n c10 = n.f3760a.c(this.f24634b, fVar.f24634b);
            Integer valueOf = Integer.valueOf(this.f24637e);
            Integer valueOf2 = Integer.valueOf(fVar.f24637e);
            n0 n0Var = l0.f3758a;
            n0 n0Var2 = r0.f3794a;
            n c11 = c10.b(valueOf, valueOf2, n0Var2).a(this.f24638f, fVar.f24638f).a(this.f24639g, fVar.f24639g).c(this.f24635c, fVar.f24635c);
            Boolean valueOf3 = Boolean.valueOf(this.f24636d);
            Boolean valueOf4 = Boolean.valueOf(fVar.f24636d);
            if (this.f24638f != 0) {
                n0Var = n0Var2;
            }
            n a10 = c11.b(valueOf3, valueOf4, n0Var).a(this.f24640h, fVar.f24640h);
            if (this.f24639g == 0) {
                a10 = a10.d(this.f24641i, fVar.f24641i);
            }
            return a10.e();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class g implements Comparable<g> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f24642a;

        /* renamed from: b  reason: collision with root package name */
        public final c f24643b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f24644c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24645d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24646e;

        /* renamed from: f  reason: collision with root package name */
        public final int f24647f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24648g;

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
            if (r10 < ((float) r8.f24602u)) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
            if (r10 < r8.f24603v) goto L_0x005e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0098 A[EDGE_INSN: B:55:0x0098->B:53:0x0098 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(x4.b0 r7, r6.f.c r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f24643b = r8
                r0 = 0
                r1 = 1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3 = -1
                if (r10 == 0) goto L_0x0033
                int r4 = r7.f27413y
                if (r4 == r3) goto L_0x0014
                int r5 = r8.f24596g
                if (r4 > r5) goto L_0x0033
            L_0x0014:
                int r4 = r7.f27414z
                if (r4 == r3) goto L_0x001c
                int r5 = r8.f24597h
                if (r4 > r5) goto L_0x0033
            L_0x001c:
                float r4 = r7.A
                int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x0029
                int r5 = r8.f24598i
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L_0x0033
            L_0x0029:
                int r4 = r7.f27404h
                if (r4 == r3) goto L_0x0031
                int r5 = r8.f24599r
                if (r4 > r5) goto L_0x0033
            L_0x0031:
                r4 = 1
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                r6.f24642a = r4
                if (r10 == 0) goto L_0x005e
                int r10 = r7.f27413y
                if (r10 == r3) goto L_0x0040
                int r4 = r8.f24600s
                if (r10 < r4) goto L_0x005e
            L_0x0040:
                int r10 = r7.f27414z
                if (r10 == r3) goto L_0x0048
                int r4 = r8.f24601t
                if (r10 < r4) goto L_0x005e
            L_0x0048:
                float r10 = r7.A
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 == 0) goto L_0x0055
                int r2 = r8.f24602u
                float r2 = (float) r2
                int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r10 < 0) goto L_0x005e
            L_0x0055:
                int r10 = r7.f27404h
                if (r10 == r3) goto L_0x005f
                int r2 = r8.f24603v
                if (r10 < r2) goto L_0x005e
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                r6.f24644c = r1
                boolean r9 = r6.f.f(r9, r0)
                r6.f24645d = r9
                int r9 = r7.f27404h
                r6.f24646e = r9
                int r9 = r7.f27413y
                if (r9 == r3) goto L_0x0076
                int r10 = r7.f27414z
                if (r10 != r3) goto L_0x0074
                goto L_0x0076
            L_0x0074:
                int r3 = r9 * r10
            L_0x0076:
                r6.f24647f = r3
                r9 = 2147483647(0x7fffffff, float:NaN)
            L_0x007b:
                ba.s<java.lang.String> r10 = r8.C
                int r10 = r10.size()
                if (r0 >= r10) goto L_0x0098
                java.lang.String r10 = r7.f27408t
                if (r10 == 0) goto L_0x0095
                ba.s<java.lang.String> r1 = r8.C
                java.lang.Object r1 = r1.get(r0)
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L_0x0095
                r9 = r0
                goto L_0x0098
            L_0x0095:
                int r0 = r0 + 1
                goto L_0x007b
            L_0x0098:
                r6.f24648g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.f.g.<init>(x4.b0, r6.f$c, int, boolean):void");
        }

        /* renamed from: a */
        public int compareTo(g gVar) {
            n0<Integer> n0Var;
            n0<Integer> n0Var2;
            if (!this.f24642a || !this.f24645d) {
                n0Var = f.f24576g.b();
            } else {
                n0Var = f.f24576g;
            }
            n b10 = n.f3760a.c(this.f24645d, gVar.f24645d).c(this.f24642a, gVar.f24642a).c(this.f24644c, gVar.f24644c).b(Integer.valueOf(this.f24648g), Integer.valueOf(gVar.f24648g), r0.f3794a);
            Integer valueOf = Integer.valueOf(this.f24646e);
            Integer valueOf2 = Integer.valueOf(gVar.f24646e);
            if (this.f24643b.K) {
                n0Var2 = f.f24576g.b();
            } else {
                n0Var2 = f.f24577h;
            }
            return b10.b(valueOf, valueOf2, n0Var2).b(Integer.valueOf(this.f24647f), Integer.valueOf(gVar.f24647f), n0Var).b(Integer.valueOf(this.f24646e), Integer.valueOf(gVar.f24646e), n0Var).e();
        }
    }

    public f(Context context, h.b bVar) {
        c cVar = c.R;
        c b10 = new d(context).b();
        this.f24578d = bVar;
        this.f24579e = new AtomicReference<>(b10);
    }

    public static int d(b0 b0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(b0Var.f27399c)) {
            return 4;
        }
        String h10 = h(str);
        String h11 = h(b0Var.f27399c);
        if (h11 == null || h10 == null) {
            if (!z10 || h11 != null) {
                return 0;
            }
            return 1;
        } else if (h11.startsWith(h10) || h10.startsWith(h11)) {
            return 3;
        } else {
            int i10 = e0.f26436a;
            if (h11.split("-", 2)[0].equals(h10.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> e(z5.f0 r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f28583a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f28583a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00af
            if (r14 != r2) goto L_0x0020
            goto L_0x00af
        L_0x0020:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            int r5 = r12.f28583a
            r6 = 1
            if (r3 >= r5) goto L_0x0080
            x4.b0[] r5 = r12.f28584b
            r5 = r5[r3]
            int r7 = r5.f27413y
            if (r7 <= 0) goto L_0x007d
            int r8 = r5.f27414z
            if (r8 <= 0) goto L_0x007d
            if (r15 == 0) goto L_0x0045
            if (r7 <= r8) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r13 <= r14) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r9 == r6) goto L_0x0045
            r6 = r13
            r9 = r14
            goto L_0x0047
        L_0x0045:
            r9 = r13
            r6 = r14
        L_0x0047:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0057
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = v6.e0.g(r11, r7)
            r6.<init>(r9, r7)
            goto L_0x0061
        L_0x0057:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = v6.e0.g(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x0061:
            int r7 = r5.f27413y
            int r5 = r5.f27414z
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x007d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007d
            if (r8 >= r4) goto L_0x007d
            r4 = r8
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0080:
            if (r4 == r2) goto L_0x00af
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0087:
            if (r13 < 0) goto L_0x00af
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            x4.b0[] r15 = r12.f28584b
            r14 = r15[r14]
            int r15 = r14.f27413y
            r1 = -1
            if (r15 == r1) goto L_0x00a4
            int r14 = r14.f27414z
            if (r14 != r1) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            int r15 = r15 * r14
            goto L_0x00a5
        L_0x00a4:
            r15 = -1
        L_0x00a5:
            if (r15 == r1) goto L_0x00a9
            if (r15 <= r4) goto L_0x00ac
        L_0x00a9:
            r0.remove(r13)
        L_0x00ac:
            int r13 = r13 + -1
            goto L_0x0087
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f.e(z5.f0, int, int, boolean):java.util.List");
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean g(b0 b0Var, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if ((b0Var.f27401e & 16384) != 0 || !f(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !e0.a(b0Var.f27408t, str)) {
            return false;
        }
        int i20 = b0Var.f27413y;
        if (i20 != -1 && (i16 > i20 || i20 > i12)) {
            return false;
        }
        int i21 = b0Var.f27414z;
        if (i21 != -1 && (i17 > i21 || i21 > i13)) {
            return false;
        }
        float f10 = b0Var.A;
        if (f10 != -1.0f && (((float) i18) > f10 || f10 > ((float) i14))) {
            return false;
        }
        int i22 = b0Var.f27404h;
        if (i22 == -1 || (i19 <= i22 && i22 <= i15)) {
            return true;
        }
        return false;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:292:0x059a, code lost:
        if (r8 == 2) goto L_0x05a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0171 A[LOOP:1: B:21:0x0045->B:64:0x0171, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> c(r6.j.a r44, int[][][] r45, int[] r46, z5.r.a r47, x4.c1 r48) throws x4.m {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            java.util.concurrent.atomic.AtomicReference<r6.f$c> r2 = r0.f24579e
            java.lang.Object r2 = r2.get()
            r6.f$c r2 = (r6.f.c) r2
            int r3 = r1.f24656a
            r6.h$a[] r4 = new r6.h.a[r3]
            r8 = r1
            r10 = r2
            r6 = 0
            r7 = 0
            r9 = 0
        L_0x0015:
            r11 = 2
            if (r6 >= r3) goto L_0x0251
            int[] r15 = r8.f24658c
            r15 = r15[r6]
            if (r11 != r15) goto L_0x023b
            if (r9 != 0) goto L_0x0221
            z5.g0[] r8 = r8.f24659d
            r8 = r8[r6]
            r9 = r45[r6]
            r15 = r46[r6]
            boolean r13 = r10.L
            if (r13 != 0) goto L_0x018b
            boolean r13 = r10.K
            if (r13 != 0) goto L_0x018b
            boolean r13 = r10.f24606y
            if (r13 == 0) goto L_0x0037
            r13 = 24
            goto L_0x0039
        L_0x0037:
            r13 = 16
        L_0x0039:
            boolean r5 = r10.f24605x
            if (r5 == 0) goto L_0x0043
            r5 = r15 & r13
            if (r5 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r15 = 0
        L_0x0045:
            int r14 = r8.f28589a
            if (r15 >= r14) goto L_0x018b
            z5.f0[] r14 = r8.f28590b
            r14 = r14[r15]
            r28 = r9[r15]
            int r12 = r10.f24596g
            int r11 = r10.f24597h
            int r0 = r10.f24598i
            r29 = r3
            int r3 = r10.f24599r
            r30 = r7
            int r7 = r10.f24600s
            int r1 = r10.f24601t
            r31 = r4
            int r4 = r10.f24602u
            r32 = r6
            int r6 = r10.f24603v
            r33 = r9
            int r9 = r10.f24607z
            r34 = r2
            int r2 = r10.A
            boolean r10 = r10.B
            r35 = r8
            int r8 = r14.f28583a
            r36 = r15
            r15 = 2
            if (r8 >= r15) goto L_0x007d
            int[] r0 = f24575f
            goto L_0x008c
        L_0x007d:
            java.util.List r2 = e(r14, r9, r2, r10)
            r8 = r2
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r8.size()
            if (r9 >= r15) goto L_0x0090
            int[] r0 = f24575f
        L_0x008c:
            r37 = r5
            goto L_0x0168
        L_0x0090:
            if (r5 != 0) goto L_0x0116
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r37 = r5
            r5 = 0
            r15 = 0
            r38 = 0
        L_0x009d:
            int r10 = r8.size()
            if (r15 >= r10) goto L_0x0111
            java.lang.Object r10 = r8.get(r15)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r39 = r2
            x4.b0[] r2 = r14.f28584b
            r2 = r2[r10]
            java.lang.String r2 = r2.f27408t
            boolean r10 = r9.add(r2)
            if (r10 == 0) goto L_0x0102
            r40 = r9
            r41 = r15
            r9 = 0
            r10 = 0
        L_0x00c1:
            int r15 = r8.size()
            if (r10 >= r15) goto L_0x00fa
            java.lang.Object r15 = r8.get(r10)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r42 = r8
            x4.b0[] r8 = r14.f28584b
            r16 = r8[r15]
            r18 = r28[r15]
            r17 = r2
            r19 = r13
            r20 = r12
            r21 = r11
            r22 = r0
            r23 = r3
            r24 = r7
            r25 = r1
            r26 = r4
            r27 = r6
            boolean r8 = g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r8 == 0) goto L_0x00f5
            int r9 = r9 + 1
        L_0x00f5:
            int r10 = r10 + 1
            r8 = r42
            goto L_0x00c1
        L_0x00fa:
            r42 = r8
            if (r9 <= r5) goto L_0x0108
            r38 = r2
            r5 = r9
            goto L_0x0108
        L_0x0102:
            r42 = r8
            r40 = r9
            r41 = r15
        L_0x0108:
            int r15 = r41 + 1
            r2 = r39
            r9 = r40
            r8 = r42
            goto L_0x009d
        L_0x0111:
            r39 = r2
            r42 = r8
            goto L_0x011e
        L_0x0116:
            r39 = r2
            r37 = r5
            r42 = r8
            r38 = 0
        L_0x011e:
            int r2 = r42.size()
        L_0x0122:
            r5 = -1
            int r2 = r2 + r5
            if (r2 < 0) goto L_0x0158
            r5 = r42
            java.lang.Object r8 = r5.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            x4.b0[] r9 = r14.f28584b
            r16 = r9[r8]
            r18 = r28[r8]
            r17 = r38
            r19 = r13
            r20 = r12
            r21 = r11
            r22 = r0
            r23 = r3
            r24 = r7
            r25 = r1
            r26 = r4
            r27 = r6
            boolean r8 = g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r8 != 0) goto L_0x0155
            r5.remove(r2)
        L_0x0155:
            r42 = r5
            goto L_0x0122
        L_0x0158:
            r5 = r42
            int r0 = r5.size()
            r1 = 2
            if (r0 >= r1) goto L_0x0164
            int[] r0 = f24575f
            goto L_0x0168
        L_0x0164:
            int[] r0 = da.a.b(r39)
        L_0x0168:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0171
            r6.h$a r1 = new r6.h$a
            r1.<init>(r14, r0)
            goto L_0x019a
        L_0x0171:
            int r15 = r36 + 1
            r0 = r43
            r1 = r44
            r3 = r29
            r7 = r30
            r4 = r31
            r6 = r32
            r9 = r33
            r2 = r34
            r10 = r2
            r8 = r35
            r5 = r37
            r11 = 2
            goto L_0x0045
        L_0x018b:
            r34 = r2
            r29 = r3
            r31 = r4
            r32 = r6
            r30 = r7
            r35 = r8
            r33 = r9
            r1 = 0
        L_0x019a:
            if (r1 != 0) goto L_0x0213
            r3 = r35
            r0 = 0
            r1 = 0
            r2 = 0
            r12 = -1
        L_0x01a2:
            int r4 = r3.f28589a
            if (r2 >= r4) goto L_0x0200
            z5.f0[] r4 = r3.f28590b
            r4 = r4[r2]
            r5 = r34
            int r6 = r5.f24607z
            int r7 = r5.A
            boolean r8 = r5.B
            java.util.List r6 = e(r4, r6, r7, r8)
            r7 = r33[r2]
            r8 = 0
        L_0x01b9:
            int r9 = r4.f28583a
            if (r8 >= r9) goto L_0x01fb
            x4.b0[] r9 = r4.f28584b
            r9 = r9[r8]
            int r10 = r9.f27401e
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01c8
            goto L_0x01f8
        L_0x01c8:
            r10 = r7[r8]
            boolean r11 = r5.M
            boolean r10 = f(r10, r11)
            if (r10 == 0) goto L_0x01f8
            r6.f$g r10 = new r6.f$g
            r11 = r7[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r14 = r6
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r13 = r14.contains(r13)
            r10.<init>(r9, r5, r11, r13)
            boolean r9 = r10.f24642a
            if (r9 != 0) goto L_0x01ed
            boolean r9 = r5.f24604w
            if (r9 != 0) goto L_0x01ed
            goto L_0x01f8
        L_0x01ed:
            if (r1 == 0) goto L_0x01f5
            int r9 = r10.compareTo(r1)
            if (r9 <= 0) goto L_0x01f8
        L_0x01f5:
            r0 = r4
            r12 = r8
            r1 = r10
        L_0x01f8:
            int r8 = r8 + 1
            goto L_0x01b9
        L_0x01fb:
            int r2 = r2 + 1
            r34 = r5
            goto L_0x01a2
        L_0x0200:
            r5 = r34
            if (r0 != 0) goto L_0x0206
            r13 = 0
            goto L_0x0211
        L_0x0206:
            r6.h$a r13 = new r6.h$a
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r12
            r13.<init>(r0, r2)
        L_0x0211:
            r1 = r13
            goto L_0x0215
        L_0x0213:
            r5 = r34
        L_0x0215:
            r31[r32] = r1
            r0 = r31[r32]
            if (r0 == 0) goto L_0x021d
            r0 = 1
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            r9 = r0
            r10 = r5
            goto L_0x022a
        L_0x0221:
            r5 = r2
            r29 = r3
            r31 = r4
            r32 = r6
            r30 = r7
        L_0x022a:
            r0 = r44
            z5.g0[] r1 = r0.f24659d
            r1 = r1[r32]
            int r1 = r1.f28589a
            if (r1 <= 0) goto L_0x0236
            r14 = 1
            goto L_0x0237
        L_0x0236:
            r14 = 0
        L_0x0237:
            r7 = r30 | r14
            r8 = r0
            goto L_0x0245
        L_0x023b:
            r0 = r1
            r5 = r2
            r29 = r3
            r31 = r4
            r32 = r6
            r30 = r7
        L_0x0245:
            int r6 = r32 + 1
            r1 = r0
            r2 = r5
            r3 = r29
            r4 = r31
            r0 = r43
            goto L_0x0015
        L_0x0251:
            r0 = r1
            r5 = r2
            r31 = r4
            r30 = r7
            r4 = r3
            r1 = 0
            r2 = 0
            r3 = -1
            r6 = 0
        L_0x025c:
            if (r2 >= r4) goto L_0x03cc
            int[] r7 = r8.f24658c
            r7 = r7[r2]
            r9 = 1
            if (r9 != r7) goto L_0x03b6
            boolean r7 = r10.O
            if (r7 != 0) goto L_0x026e
            if (r30 != 0) goto L_0x026c
            goto L_0x026e
        L_0x026c:
            r7 = 0
            goto L_0x026f
        L_0x026e:
            r7 = 1
        L_0x026f:
            z5.g0[] r8 = r8.f24659d
            r8 = r8[r2]
            r9 = r45[r2]
            r11 = r46[r2]
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = -1
        L_0x027b:
            int r15 = r8.f28589a
            if (r12 >= r15) goto L_0x02d0
            z5.f0[] r15 = r8.f28590b
            r15 = r15[r12]
            r16 = r9[r12]
            r17 = r13
            r18 = r14
            r13 = 0
        L_0x028a:
            int r14 = r15.f28583a
            if (r13 >= r14) goto L_0x02c7
            r14 = r16[r13]
            r19 = r6
            boolean r6 = r10.M
            boolean r6 = f(r14, r6)
            if (r6 == 0) goto L_0x02be
            x4.b0[] r6 = r15.f28584b
            r6 = r6[r13]
            r6.f$a r14 = new r6.f$a
            r20 = r15
            r15 = r16[r13]
            r14.<init>(r6, r10, r15)
            boolean r6 = r14.f24580a
            if (r6 != 0) goto L_0x02b0
            boolean r6 = r10.F
            if (r6 != 0) goto L_0x02b0
            goto L_0x02c0
        L_0x02b0:
            if (r11 == 0) goto L_0x02b8
            int r6 = r14.compareTo(r11)
            if (r6 <= 0) goto L_0x02c0
        L_0x02b8:
            r17 = r12
            r18 = r13
            r11 = r14
            goto L_0x02c0
        L_0x02be:
            r20 = r15
        L_0x02c0:
            int r13 = r13 + 1
            r6 = r19
            r15 = r20
            goto L_0x028a
        L_0x02c7:
            r19 = r6
            int r12 = r12 + 1
            r13 = r17
            r14 = r18
            goto L_0x027b
        L_0x02d0:
            r19 = r6
            r6 = -1
            if (r13 != r6) goto L_0x02de
            r16 = r2
            r29 = r4
            r34 = r5
            r0 = 0
            goto L_0x0386
        L_0x02de:
            z5.f0[] r6 = r8.f28590b
            r6 = r6[r13]
            boolean r8 = r10.L
            if (r8 != 0) goto L_0x036b
            boolean r8 = r10.K
            if (r8 != 0) goto L_0x036b
            if (r7 == 0) goto L_0x036b
            r7 = r9[r13]
            int r8 = r10.E
            boolean r9 = r10.G
            boolean r12 = r10.H
            boolean r10 = r10.I
            x4.b0[] r13 = r6.f28584b
            r13 = r13[r14]
            int r15 = r6.f28583a
            int[] r15 = new int[r15]
            r29 = r4
            r34 = r5
            r0 = 0
            r5 = 0
        L_0x0304:
            int r4 = r6.f28583a
            if (r5 >= r4) goto L_0x035b
            if (r5 == r14) goto L_0x034b
            x4.b0[] r4 = r6.f28584b
            r4 = r4[r5]
            r16 = r2
            r2 = r7[r5]
            r17 = r7
            r7 = 0
            boolean r2 = f(r2, r7)
            if (r2 == 0) goto L_0x0347
            int r2 = r4.f27404h
            r7 = -1
            if (r2 == r7) goto L_0x0347
            if (r2 > r8) goto L_0x0347
            if (r10 != 0) goto L_0x032c
            int r2 = r4.G
            if (r2 == r7) goto L_0x0347
            int r7 = r13.G
            if (r2 != r7) goto L_0x0347
        L_0x032c:
            if (r9 != 0) goto L_0x033a
            java.lang.String r2 = r4.f27408t
            if (r2 == 0) goto L_0x0347
            java.lang.String r7 = r13.f27408t
            boolean r2 = android.text.TextUtils.equals(r2, r7)
            if (r2 == 0) goto L_0x0347
        L_0x033a:
            if (r12 != 0) goto L_0x0345
            int r2 = r4.H
            r4 = -1
            if (r2 == r4) goto L_0x0347
            int r4 = r13.H
            if (r2 != r4) goto L_0x0347
        L_0x0345:
            r2 = 1
            goto L_0x0348
        L_0x0347:
            r2 = 0
        L_0x0348:
            if (r2 == 0) goto L_0x0354
            goto L_0x034f
        L_0x034b:
            r16 = r2
            r17 = r7
        L_0x034f:
            int r2 = r0 + 1
            r15[r0] = r5
            r0 = r2
        L_0x0354:
            int r5 = r5 + 1
            r2 = r16
            r7 = r17
            goto L_0x0304
        L_0x035b:
            r16 = r2
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r2 = r0.length
            r4 = 1
            if (r2 <= r4) goto L_0x0371
            r6.h$a r2 = new r6.h$a
            r2.<init>(r6, r0)
            goto L_0x0372
        L_0x036b:
            r16 = r2
            r29 = r4
            r34 = r5
        L_0x0371:
            r2 = 0
        L_0x0372:
            if (r2 != 0) goto L_0x037f
            r6.h$a r2 = new r6.h$a
            r0 = 1
            int[] r4 = new int[r0]
            r0 = 0
            r4[r0] = r14
            r2.<init>(r6, r4)
        L_0x037f:
            r11.getClass()
            android.util.Pair r0 = android.util.Pair.create(r2, r11)
        L_0x0386:
            if (r0 == 0) goto L_0x03be
            if (r1 == 0) goto L_0x0394
            java.lang.Object r2 = r0.second
            r6.f$a r2 = (r6.f.a) r2
            int r2 = r2.compareTo(r1)
            if (r2 <= 0) goto L_0x03be
        L_0x0394:
            r1 = -1
            if (r3 == r1) goto L_0x039a
            r1 = 0
            r31[r3] = r1
        L_0x039a:
            java.lang.Object r1 = r0.first
            r6.h$a r1 = (r6.h.a) r1
            r31[r16] = r1
            z5.f0 r2 = r1.f24649a
            int[] r1 = r1.f24650b
            r3 = 0
            r1 = r1[r3]
            x4.b0[] r2 = r2.f28584b
            r1 = r2[r1]
            java.lang.String r1 = r1.f27399c
            java.lang.Object r0 = r0.second
            r6.f$a r0 = (r6.f.a) r0
            r6 = r1
            r3 = r16
            r1 = r0
            goto L_0x03c0
        L_0x03b6:
            r16 = r2
            r29 = r4
            r34 = r5
            r19 = r6
        L_0x03be:
            r6 = r19
        L_0x03c0:
            int r2 = r16 + 1
            r0 = r44
            r8 = r0
            r4 = r29
            r5 = r34
            r10 = r5
            goto L_0x025c
        L_0x03cc:
            r34 = r5
            r19 = r6
            r2 = r4
            r0 = 0
            r1 = 0
            r5 = -1
        L_0x03d4:
            if (r1 >= r2) goto L_0x04ff
            r3 = r44
            int[] r4 = r3.f24658c
            r4 = r4[r1]
            r6 = 1
            if (r4 == r6) goto L_0x04f2
            r6 = 2
            if (r4 == r6) goto L_0x04f2
            r6 = 3
            if (r4 == r6) goto L_0x0450
            z5.g0[] r4 = r3.f24659d
            r4 = r4[r1]
            r6 = r45[r1]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x03ef:
            int r11 = r4.f28589a
            if (r9 >= r11) goto L_0x0439
            z5.f0[] r11 = r4.f28590b
            r11 = r11[r9]
            r12 = r6[r9]
            r13 = 0
        L_0x03fa:
            int r14 = r11.f28583a
            if (r13 >= r14) goto L_0x0430
            r14 = r12[r13]
            r46 = r4
            r15 = r34
            boolean r4 = r15.M
            boolean r4 = f(r14, r4)
            if (r4 == 0) goto L_0x0425
            x4.b0[] r4 = r11.f28584b
            r4 = r4[r13]
            r6.f$b r14 = new r6.f$b
            r16 = r6
            r6 = r12[r13]
            r14.<init>(r4, r6)
            if (r8 == 0) goto L_0x0421
            int r4 = r14.compareTo(r8)
            if (r4 <= 0) goto L_0x0427
        L_0x0421:
            r7 = r11
            r10 = r13
            r8 = r14
            goto L_0x0427
        L_0x0425:
            r16 = r6
        L_0x0427:
            int r13 = r13 + 1
            r4 = r46
            r34 = r15
            r6 = r16
            goto L_0x03fa
        L_0x0430:
            r46 = r4
            r16 = r6
            r15 = r34
            int r9 = r9 + 1
            goto L_0x03ef
        L_0x0439:
            r15 = r34
            if (r7 != 0) goto L_0x043f
            r4 = 0
            goto L_0x044a
        L_0x043f:
            r6.h$a r4 = new r6.h$a
            r6 = 1
            int[] r8 = new int[r6]
            r6 = 0
            r8[r6] = r10
            r4.<init>(r7, r8)
        L_0x044a:
            r31[r1] = r4
            r11 = r19
            goto L_0x04f6
        L_0x0450:
            r15 = r34
            z5.g0[] r4 = r3.f24659d
            r4 = r4[r1]
            r6 = r45[r1]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = -1
        L_0x045c:
            int r11 = r4.f28589a
            if (r7 >= r11) goto L_0x04b9
            z5.f0[] r11 = r4.f28590b
            r11 = r11[r7]
            r12 = r6[r7]
            r13 = r10
            r10 = r9
            r9 = r8
            r8 = 0
        L_0x046a:
            int r14 = r11.f28583a
            if (r8 >= r14) goto L_0x04ad
            r14 = r12[r8]
            r46 = r4
            boolean r4 = r15.M
            boolean r4 = f(r14, r4)
            if (r4 == 0) goto L_0x049c
            x4.b0[] r4 = r11.f28584b
            r4 = r4[r8]
            r6.f$f r14 = new r6.f$f
            r16 = r6
            r6 = r12[r8]
            r17 = r11
            r11 = r19
            r14.<init>(r4, r15, r6, r11)
            boolean r4 = r14.f24633a
            if (r4 == 0) goto L_0x04a2
            if (r10 == 0) goto L_0x0497
            int r4 = r14.compareTo(r10)
            if (r4 <= 0) goto L_0x04a2
        L_0x0497:
            r13 = r8
            r10 = r14
            r9 = r17
            goto L_0x04a2
        L_0x049c:
            r16 = r6
            r17 = r11
            r11 = r19
        L_0x04a2:
            int r8 = r8 + 1
            r4 = r46
            r19 = r11
            r6 = r16
            r11 = r17
            goto L_0x046a
        L_0x04ad:
            r46 = r4
            r16 = r6
            r11 = r19
            int r7 = r7 + 1
            r8 = r9
            r9 = r10
            r10 = r13
            goto L_0x045c
        L_0x04b9:
            r11 = r19
            if (r8 != 0) goto L_0x04c0
            r4 = 0
            r6 = 0
            goto L_0x04d2
        L_0x04c0:
            r6.h$a r4 = new r6.h$a
            r6 = 1
            int[] r7 = new int[r6]
            r6 = 0
            r7[r6] = r10
            r4.<init>(r8, r7)
            r9.getClass()
            android.util.Pair r4 = android.util.Pair.create(r4, r9)
        L_0x04d2:
            if (r4 == 0) goto L_0x04f7
            if (r0 == 0) goto L_0x04e0
            java.lang.Object r7 = r4.second
            r6.f$f r7 = (r6.f.C0235f) r7
            int r7 = r7.compareTo(r0)
            if (r7 <= 0) goto L_0x04f7
        L_0x04e0:
            r0 = -1
            if (r5 == r0) goto L_0x04e6
            r0 = 0
            r31[r5] = r0
        L_0x04e6:
            java.lang.Object r0 = r4.first
            r6.h$a r0 = (r6.h.a) r0
            r31[r1] = r0
            java.lang.Object r0 = r4.second
            r6.f$f r0 = (r6.f.C0235f) r0
            r5 = r1
            goto L_0x04f7
        L_0x04f2:
            r11 = r19
            r15 = r34
        L_0x04f6:
            r6 = 0
        L_0x04f7:
            int r1 = r1 + 1
            r19 = r11
            r34 = r15
            goto L_0x03d4
        L_0x04ff:
            r3 = r44
            r15 = r34
            r6 = 0
            r1 = 0
        L_0x0505:
            if (r1 >= r2) goto L_0x054d
            boolean r0 = r15.a(r1)
            if (r0 == 0) goto L_0x0511
            r0 = 0
            r31[r1] = r0
            goto L_0x054a
        L_0x0511:
            r0 = 0
            z5.g0[] r4 = r3.f24659d
            r4 = r4[r1]
            android.util.SparseArray<java.util.Map<z5.g0, r6.f$e>> r5 = r15.P
            java.lang.Object r5 = r5.get(r1)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0528
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0528
            r5 = 1
            goto L_0x0529
        L_0x0528:
            r5 = 0
        L_0x0529:
            if (r5 == 0) goto L_0x054a
            r6.f$e r5 = r15.b(r1, r4)
            if (r5 != 0) goto L_0x0533
            r7 = r0
            goto L_0x0548
        L_0x0533:
            r6.h$a r7 = new r6.h$a
            int r8 = r5.f24628a
            z5.f0[] r4 = r4.f28590b
            r4 = r4[r8]
            int[] r8 = r5.f24629b
            int r9 = r5.f24631d
            int r5 = r5.f24632e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.<init>(r4, r8, r9, r5)
        L_0x0548:
            r31[r1] = r7
        L_0x054a:
            int r1 = r1 + 1
            goto L_0x0505
        L_0x054d:
            r1 = r43
            r0 = 0
            r6.h$b r4 = r1.f24578d
            u6.b r5 = r1.f24679b
            r5.getClass()
            r7 = r47
            r8 = r48
            r9 = r31
            r6.h[] r4 = r4.a(r9, r5, r7, r8)
            x4.x0[] r5 = new x4.x0[r2]
            r7 = 0
        L_0x0564:
            if (r7 >= r2) goto L_0x0585
            boolean r8 = r15.a(r7)
            if (r8 != 0) goto L_0x0579
            int[] r8 = r3.f24658c
            r8 = r8[r7]
            r9 = 7
            if (r8 == r9) goto L_0x0577
            r8 = r4[r7]
            if (r8 == 0) goto L_0x0579
        L_0x0577:
            r8 = 1
            goto L_0x057a
        L_0x0579:
            r8 = 0
        L_0x057a:
            if (r8 == 0) goto L_0x057f
            x4.x0 r8 = x4.x0.f27762b
            goto L_0x0580
        L_0x057f:
            r8 = r0
        L_0x0580:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0564
        L_0x0585:
            boolean r0 = r15.N
            if (r0 == 0) goto L_0x05f2
            r0 = 0
            r2 = -1
            r7 = -1
        L_0x058c:
            int r8 = r3.f24656a
            if (r0 >= r8) goto L_0x05de
            int[] r8 = r3.f24658c
            r8 = r8[r0]
            r9 = r4[r0]
            r10 = 1
            if (r8 == r10) goto L_0x059f
            r10 = 2
            if (r8 != r10) goto L_0x059d
            goto L_0x05a0
        L_0x059d:
            r8 = -1
            goto L_0x05db
        L_0x059f:
            r10 = 2
        L_0x05a0:
            if (r9 == 0) goto L_0x059d
            r11 = r45[r0]
            z5.g0[] r12 = r3.f24659d
            r12 = r12[r0]
            z5.f0 r13 = r9.j()
            int r12 = r12.a(r13)
            r13 = 0
        L_0x05b1:
            int r14 = r9.length()
            if (r13 >= r14) goto L_0x05c9
            r14 = r11[r12]
            int r15 = r9.f(r13)
            r14 = r14[r15]
            r15 = 32
            r14 = r14 & r15
            if (r14 == r15) goto L_0x05c6
            r9 = 0
            goto L_0x05ca
        L_0x05c6:
            int r13 = r13 + 1
            goto L_0x05b1
        L_0x05c9:
            r9 = 1
        L_0x05ca:
            if (r9 == 0) goto L_0x059d
            r9 = 1
            if (r8 != r9) goto L_0x05d5
            r8 = -1
            if (r7 == r8) goto L_0x05d3
            goto L_0x05d8
        L_0x05d3:
            r7 = r0
            goto L_0x05db
        L_0x05d5:
            r8 = -1
            if (r2 == r8) goto L_0x05da
        L_0x05d8:
            r0 = 0
            goto L_0x05e0
        L_0x05da:
            r2 = r0
        L_0x05db:
            int r0 = r0 + 1
            goto L_0x058c
        L_0x05de:
            r8 = -1
            r0 = 1
        L_0x05e0:
            if (r7 == r8) goto L_0x05e5
            if (r2 == r8) goto L_0x05e5
            r6 = 1
        L_0x05e5:
            r0 = r0 & r6
            if (r0 == 0) goto L_0x05f2
            x4.x0 r0 = new x4.x0
            r3 = 1
            r0.<init>(r3)
            r5[r7] = r0
            r5[r2] = r0
        L_0x05f2:
            android.util.Pair r0 = android.util.Pair.create(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f.c(r6.j$a, int[][][], int[], z5.r$a, x4.c1):android.util.Pair");
    }

    public void i(c cVar) {
        n.a aVar;
        if (!this.f24579e.getAndSet(cVar).equals(cVar) && (aVar = this.f24678a) != null) {
            ((y) aVar).f27772g.U(10);
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f24628a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f24629b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24630c;

        /* renamed from: d  reason: collision with root package name */
        public final int f24631d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24632e;

        /* compiled from: DefaultTrackSelector */
        public class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(int i10, int... iArr) {
            this.f24628a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f24629b = copyOf;
            this.f24630c = iArr.length;
            this.f24631d = 2;
            this.f24632e = 0;
            Arrays.sort(copyOf);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f24628a == eVar.f24628a && Arrays.equals(this.f24629b, eVar.f24629b) && this.f24631d == eVar.f24631d && this.f24632e == eVar.f24632e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f24629b) + (this.f24628a * 31)) * 31) + this.f24631d) * 31) + this.f24632e;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f24628a);
            parcel.writeInt(this.f24629b.length);
            parcel.writeIntArray(this.f24629b);
            parcel.writeInt(this.f24631d);
            parcel.writeInt(this.f24632e);
        }

        public e(Parcel parcel) {
            this.f24628a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f24630c = readByte;
            int[] iArr = new int[readByte];
            this.f24629b = iArr;
            parcel.readIntArray(iArr);
            this.f24631d = parcel.readInt();
            this.f24632e = parcel.readInt();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class c extends m {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public static final c R = new d().b();
        public final int A;
        public final boolean B;
        public final s<String> C;
        public final int D;
        public final int E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final s<String> J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final SparseArray<Map<g0, e>> P;
        public final SparseBooleanArray Q;

        /* renamed from: g  reason: collision with root package name */
        public final int f24596g;

        /* renamed from: h  reason: collision with root package name */
        public final int f24597h;

        /* renamed from: i  reason: collision with root package name */
        public final int f24598i;

        /* renamed from: r  reason: collision with root package name */
        public final int f24599r;

        /* renamed from: s  reason: collision with root package name */
        public final int f24600s;

        /* renamed from: t  reason: collision with root package name */
        public final int f24601t;

        /* renamed from: u  reason: collision with root package name */
        public final int f24602u;

        /* renamed from: v  reason: collision with root package name */
        public final int f24603v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f24604w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f24605x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f24606y;

        /* renamed from: z  reason: collision with root package name */
        public final int f24607z;

        /* compiled from: DefaultTrackSelector */
        public class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, boolean z11, boolean z12, int i18, int i19, boolean z13, s<String> sVar, s<String> sVar2, int i20, int i21, int i22, boolean z14, boolean z15, boolean z16, boolean z17, s<String> sVar3, s<String> sVar4, int i23, boolean z18, int i24, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, SparseArray<Map<g0, e>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(sVar2, i20, sVar4, i23, z18, i24);
            this.f24596g = i10;
            this.f24597h = i11;
            this.f24598i = i12;
            this.f24599r = i13;
            this.f24600s = i14;
            this.f24601t = i15;
            this.f24602u = i16;
            this.f24603v = i17;
            this.f24604w = z10;
            this.f24605x = z11;
            this.f24606y = z12;
            this.f24607z = i18;
            this.A = i19;
            this.B = z13;
            this.C = sVar;
            this.D = i21;
            this.E = i22;
            this.F = z14;
            this.G = z15;
            this.H = z16;
            this.I = z17;
            this.J = sVar3;
            this.K = z19;
            this.L = z20;
            this.M = z21;
            this.N = z22;
            this.O = z23;
            this.P = sparseArray;
            this.Q = sparseBooleanArray;
        }

        public final boolean a(int i10) {
            return this.Q.get(i10);
        }

        public final e b(int i10, g0 g0Var) {
            Map map = this.P.get(i10);
            if (map != null) {
                return (e) map.get(g0Var);
            }
            return null;
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 1
                if (r10 != r11) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r11 == 0) goto L_0x0159
                java.lang.Class<r6.f$c> r2 = r6.f.c.class
                java.lang.Class r3 = r11.getClass()
                if (r2 == r3) goto L_0x0011
                goto L_0x0159
            L_0x0011:
                r2 = r11
                r6.f$c r2 = (r6.f.c) r2
                boolean r11 = super.equals(r11)
                if (r11 == 0) goto L_0x0157
                int r11 = r10.f24596g
                int r3 = r2.f24596g
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24597h
                int r3 = r2.f24597h
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24598i
                int r3 = r2.f24598i
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24599r
                int r3 = r2.f24599r
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24600s
                int r3 = r2.f24600s
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24601t
                int r3 = r2.f24601t
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24602u
                int r3 = r2.f24602u
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24603v
                int r3 = r2.f24603v
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f24604w
                boolean r3 = r2.f24604w
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f24605x
                boolean r3 = r2.f24605x
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.f24606y
                boolean r3 = r2.f24606y
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.B
                boolean r3 = r2.B
                if (r11 != r3) goto L_0x0157
                int r11 = r10.f24607z
                int r3 = r2.f24607z
                if (r11 != r3) goto L_0x0157
                int r11 = r10.A
                int r3 = r2.A
                if (r11 != r3) goto L_0x0157
                ba.s<java.lang.String> r11 = r10.C
                ba.s<java.lang.String> r3 = r2.C
                boolean r11 = r11.equals(r3)
                if (r11 == 0) goto L_0x0157
                int r11 = r10.D
                int r3 = r2.D
                if (r11 != r3) goto L_0x0157
                int r11 = r10.E
                int r3 = r2.E
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.F
                boolean r3 = r2.F
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.G
                boolean r3 = r2.G
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.H
                boolean r3 = r2.H
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.I
                boolean r3 = r2.I
                if (r11 != r3) goto L_0x0157
                ba.s<java.lang.String> r11 = r10.J
                ba.s<java.lang.String> r3 = r2.J
                boolean r11 = r11.equals(r3)
                if (r11 == 0) goto L_0x0157
                boolean r11 = r10.K
                boolean r3 = r2.K
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.L
                boolean r3 = r2.L
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.M
                boolean r3 = r2.M
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.N
                boolean r3 = r2.N
                if (r11 != r3) goto L_0x0157
                boolean r11 = r10.O
                boolean r3 = r2.O
                if (r11 != r3) goto L_0x0157
                android.util.SparseBooleanArray r11 = r10.Q
                android.util.SparseBooleanArray r3 = r2.Q
                int r4 = r11.size()
                int r5 = r3.size()
                if (r5 == r4) goto L_0x00d4
            L_0x00d2:
                r11 = 0
                goto L_0x00e6
            L_0x00d4:
                r5 = 0
            L_0x00d5:
                if (r5 >= r4) goto L_0x00e5
                int r6 = r11.keyAt(r5)
                int r6 = r3.indexOfKey(r6)
                if (r6 >= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r5 = r5 + 1
                goto L_0x00d5
            L_0x00e5:
                r11 = 1
            L_0x00e6:
                if (r11 == 0) goto L_0x0157
                android.util.SparseArray<java.util.Map<z5.g0, r6.f$e>> r11 = r10.P
                android.util.SparseArray<java.util.Map<z5.g0, r6.f$e>> r2 = r2.P
                int r3 = r11.size()
                int r4 = r2.size()
                if (r4 == r3) goto L_0x00f8
            L_0x00f6:
                r11 = 0
                goto L_0x0154
            L_0x00f8:
                r4 = 0
            L_0x00f9:
                if (r4 >= r3) goto L_0x0153
                int r5 = r11.keyAt(r4)
                int r5 = r2.indexOfKey(r5)
                if (r5 < 0) goto L_0x00f6
                java.lang.Object r6 = r11.valueAt(r4)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.Object r5 = r2.valueAt(r5)
                java.util.Map r5 = (java.util.Map) r5
                int r7 = r6.size()
                int r8 = r5.size()
                if (r8 == r7) goto L_0x011c
                goto L_0x014a
            L_0x011c:
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x0124:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x014c
                java.lang.Object r7 = r6.next()
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                java.lang.Object r8 = r7.getKey()
                z5.g0 r8 = (z5.g0) r8
                boolean r9 = r5.containsKey(r8)
                if (r9 == 0) goto L_0x014a
                java.lang.Object r7 = r7.getValue()
                java.lang.Object r8 = r5.get(r8)
                boolean r7 = v6.e0.a(r7, r8)
                if (r7 != 0) goto L_0x0124
            L_0x014a:
                r5 = 0
                goto L_0x014d
            L_0x014c:
                r5 = 1
            L_0x014d:
                if (r5 != 0) goto L_0x0150
                goto L_0x00f6
            L_0x0150:
                int r4 = r4 + 1
                goto L_0x00f9
            L_0x0153:
                r11 = 1
            L_0x0154:
                if (r11 == 0) goto L_0x0157
                goto L_0x0158
            L_0x0157:
                r0 = 0
            L_0x0158:
                return r0
            L_0x0159:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.f.c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int hashCode = this.C.hashCode();
            return ((((((((((this.J.hashCode() + ((((((((((((((hashCode + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.f24596g) * 31) + this.f24597h) * 31) + this.f24598i) * 31) + this.f24599r) * 31) + this.f24600s) * 31) + this.f24601t) * 31) + this.f24602u) * 31) + this.f24603v) * 31) + (this.f24604w ? 1 : 0)) * 31) + (this.f24605x ? 1 : 0)) * 31) + (this.f24606y ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + this.f24607z) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.E) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f24596g);
            parcel.writeInt(this.f24597h);
            parcel.writeInt(this.f24598i);
            parcel.writeInt(this.f24599r);
            parcel.writeInt(this.f24600s);
            parcel.writeInt(this.f24601t);
            parcel.writeInt(this.f24602u);
            parcel.writeInt(this.f24603v);
            boolean z10 = this.f24604w;
            int i11 = e0.f26436a;
            parcel.writeInt(z10 ? 1 : 0);
            parcel.writeInt(this.f24605x ? 1 : 0);
            parcel.writeInt(this.f24606y ? 1 : 0);
            parcel.writeInt(this.f24607z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeList(this.C);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeInt(this.H ? 1 : 0);
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeList(this.J);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeInt(this.M ? 1 : 0);
            parcel.writeInt(this.N ? 1 : 0);
            parcel.writeInt(this.O ? 1 : 0);
            SparseArray<Map<g0, e>> sparseArray = this.P;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = sparseArray.keyAt(i12);
                Map valueAt = sparseArray.valueAt(i12);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.Q);
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f24596g = parcel.readInt();
            this.f24597h = parcel.readInt();
            this.f24598i = parcel.readInt();
            this.f24599r = parcel.readInt();
            this.f24600s = parcel.readInt();
            this.f24601t = parcel.readInt();
            this.f24602u = parcel.readInt();
            this.f24603v = parcel.readInt();
            int i10 = e0.f26436a;
            boolean z10 = true;
            this.f24604w = parcel.readInt() != 0;
            this.f24605x = parcel.readInt() != 0;
            this.f24606y = parcel.readInt() != 0;
            this.f24607z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readInt() != 0;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, (ClassLoader) null);
            this.C = s.z(arrayList);
            this.D = parcel.readInt();
            this.E = parcel.readInt();
            this.F = parcel.readInt() != 0;
            this.G = parcel.readInt() != 0;
            this.H = parcel.readInt() != 0;
            this.I = parcel.readInt() != 0;
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, (ClassLoader) null);
            this.J = s.z(arrayList2);
            this.K = parcel.readInt() != 0;
            this.L = parcel.readInt() != 0;
            this.M = parcel.readInt() != 0;
            this.N = parcel.readInt() != 0;
            this.O = parcel.readInt() == 0 ? false : z10;
            int readInt = parcel.readInt();
            SparseArray<Map<g0, e>> sparseArray = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i12 = 0; i12 < readInt3; i12++) {
                    g0 g0Var = (g0) parcel.readParcelable(g0.class.getClassLoader());
                    g0Var.getClass();
                    hashMap.put(g0Var, (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            this.P = sparseArray;
            this.Q = parcel.readSparseBooleanArray();
        }
    }

    /* compiled from: DefaultTrackSelector */
    public static final class d extends m.b {
        public boolean A;
        public s<String> B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public final SparseArray<Map<g0, e>> H = new SparseArray<>();
        public final SparseBooleanArray I = new SparseBooleanArray();

        /* renamed from: g  reason: collision with root package name */
        public int f24608g;

        /* renamed from: h  reason: collision with root package name */
        public int f24609h;

        /* renamed from: i  reason: collision with root package name */
        public int f24610i;

        /* renamed from: j  reason: collision with root package name */
        public int f24611j;

        /* renamed from: k  reason: collision with root package name */
        public int f24612k;

        /* renamed from: l  reason: collision with root package name */
        public int f24613l;

        /* renamed from: m  reason: collision with root package name */
        public int f24614m;

        /* renamed from: n  reason: collision with root package name */
        public int f24615n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f24616o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f24617p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f24618q;

        /* renamed from: r  reason: collision with root package name */
        public int f24619r;

        /* renamed from: s  reason: collision with root package name */
        public int f24620s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f24621t;

        /* renamed from: u  reason: collision with root package name */
        public s<String> f24622u;

        /* renamed from: v  reason: collision with root package name */
        public int f24623v;

        /* renamed from: w  reason: collision with root package name */
        public int f24624w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f24625x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f24626y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f24627z;

        public d(Context context) {
            Point point;
            String str;
            a(context);
            c();
            int i10 = e0.f26436a;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i11 = e0.f26436a;
            if (i11 <= 29 && defaultDisplay.getDisplayId() == 0 && e0.J(context)) {
                if (!"Sony".equals(e0.f26438c) || !e0.f26439d.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    if (i11 < 28) {
                        str = e0.C("sys.display-size");
                    } else {
                        str = e0.C("vendor.display-size");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            String[] R = e0.R(str.trim(), "x");
                            if (R.length == 2) {
                                int parseInt = Integer.parseInt(R[0]);
                                int parseInt2 = Integer.parseInt(R[1]);
                                if (parseInt > 0 && parseInt2 > 0) {
                                    point = new Point(parseInt, parseInt2);
                                    int i12 = point.x;
                                    int i13 = point.y;
                                    this.f24619r = i12;
                                    this.f24620s = i13;
                                    this.f24621t = true;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.e("Util", "Invalid display size: " + str);
                    }
                } else {
                    point = new Point(3840, 2160);
                    int i122 = point.x;
                    int i132 = point.y;
                    this.f24619r = i122;
                    this.f24620s = i132;
                    this.f24621t = true;
                }
            }
            point = new Point();
            int i14 = e0.f26436a;
            if (i14 >= 23) {
                Display.Mode mode = defaultDisplay.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i14 >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            int i1222 = point.x;
            int i1322 = point.y;
            this.f24619r = i1222;
            this.f24620s = i1322;
            this.f24621t = true;
        }

        public m.b a(Context context) {
            super.a(context);
            return this;
        }

        public c b() {
            return new c(this.f24608g, this.f24609h, this.f24610i, this.f24611j, this.f24612k, this.f24613l, this.f24614m, this.f24615n, this.f24616o, this.f24617p, this.f24618q, this.f24619r, this.f24620s, this.f24621t, this.f24622u, this.f24672a, this.f24673b, this.f24623v, this.f24624w, this.f24625x, this.f24626y, this.f24627z, this.A, this.B, this.f24674c, this.f24675d, this.f24676e, this.f24677f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        public final void c() {
            this.f24608g = Integer.MAX_VALUE;
            this.f24609h = Integer.MAX_VALUE;
            this.f24610i = Integer.MAX_VALUE;
            this.f24611j = Integer.MAX_VALUE;
            this.f24616o = true;
            this.f24617p = false;
            this.f24618q = true;
            this.f24619r = Integer.MAX_VALUE;
            this.f24620s = Integer.MAX_VALUE;
            this.f24621t = true;
            ba.a<Object> aVar = s.f3795b;
            s<Object> sVar = o0.f3765e;
            this.f24622u = sVar;
            this.f24623v = Integer.MAX_VALUE;
            this.f24624w = Integer.MAX_VALUE;
            this.f24625x = true;
            this.f24626y = false;
            this.f24627z = false;
            this.A = false;
            this.B = sVar;
            this.C = false;
            this.D = false;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        @Deprecated
        public d() {
            c();
        }
    }
}
