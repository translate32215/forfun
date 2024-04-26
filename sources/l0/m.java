package l0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.g;
import s.i;

/* compiled from: FontRequestWorker */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final g<String, Typeface> f20988a = new g<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f20989b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f20990c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final i<String, ArrayList<n0.a<a>>> f20991d = new i<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new q("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20989b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static l0.m.a a(java.lang.String r7, android.content.Context r8, l0.h r9, int r10) {
        /*
            s.g<java.lang.String, android.graphics.Typeface> r0 = f20988a
            java.lang.Object r0 = r0.b(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            l0.m$a r7 = new l0.m$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            l0.n r9 = l0.g.a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.f20994a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            l0.o[] r1 = r9.f20995b
            r4 = 0
            if (r1 == 0) goto L_0x003d
            int r5 = r1.length
            if (r5 != 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            int r3 = r1.length
            r5 = 0
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.f21000e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = -3
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = 0
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            l0.m$a r7 = new l0.m$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            l0.o[] r9 = r9.f20995b
            g0.k r1 = g0.e.f18362a
            android.graphics.Typeface r8 = r1.b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            s.g<java.lang.String, android.graphics.Typeface> r9 = f20988a
            r9.c(r7, r8)
            l0.m$a r7 = new l0.m$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            l0.m$a r7 = new l0.m$a
            r7.<init>((int) r2)
            return r7
        L_0x0061:
            l0.m$a r7 = new l0.m$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.m.a(java.lang.String, android.content.Context, l0.h, int):l0.m$a");
    }

    /* compiled from: FontRequestWorker */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f20992a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20993b;

        public a(int i10) {
            this.f20992a = null;
            this.f20993b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f20992a = typeface;
            this.f20993b = 0;
        }
    }
}
