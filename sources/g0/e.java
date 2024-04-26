package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import f0.g;
import java.lang.reflect.Method;
import l0.p;
import s.g;

/* compiled from: TypefaceCompat */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f18362a;

    /* renamed from: b  reason: collision with root package name */
    public static final g<String, Typeface> f18363b = new g<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public g.f f18364a;

        public a(g.f fVar) {
            this.f18364a = fVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f18362a = new j();
        } else if (i10 >= 28) {
            f18362a = new i();
        } else if (i10 >= 26) {
            f18362a = new h();
        } else {
            if (i10 >= 24) {
                Method method = g.f18372d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f18362a = new g();
                }
            }
            if (i10 >= 21) {
                f18362a = new f();
            } else {
                f18362a = new k();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r6, f0.e.b r7, android.content.res.Resources r8, int r9, java.lang.String r10, int r11, int r12, f0.g.f r13, android.os.Handler r14, boolean r15) {
        /*
            boolean r0 = r7 instanceof f0.e.C0137e
            r1 = -3
            if (r0 == 0) goto L_0x0145
            f0.e$e r7 = (f0.e.C0137e) r7
            java.lang.String r0 = r7.f18043d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r13 == 0) goto L_0x002f
            r13.b(r0, r14)
        L_0x002f:
            return r0
        L_0x0030:
            if (r15 == 0) goto L_0x0037
            int r0 = r7.f18042c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r13 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r15 == 0) goto L_0x0040
            int r15 = r7.f18041b
            goto L_0x0041
        L_0x0040:
            r15 = -1
        L_0x0041:
            android.os.Handler r14 = f0.g.f.c(r14)
            g0.e$a r4 = new g0.e$a
            r4.<init>(r13)
            l0.h r7 = r7.f18040a
            l0.c r13 = new l0.c
            r13.<init>(r4, r14)
            if (r3 == 0) goto L_0x00c7
            s.g<java.lang.String, android.graphics.Typeface> r3 = l0.m.f20988a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f20977e
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            s.g<java.lang.String, android.graphics.Typeface> r5 = l0.m.f20988a
            java.lang.Object r5 = r5.b(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0080
            l0.a r6 = new l0.a
            r6.<init>(r13, r4, r5)
            r14.post(r6)
            r2 = r5
            goto L_0x0158
        L_0x0080:
            if (r15 != r0) goto L_0x008d
            l0.m$a r6 = l0.m.a(r3, r6, r7, r12)
            r13.a(r6)
            android.graphics.Typeface r2 = r6.f20992a
            goto L_0x0158
        L_0x008d:
            l0.i r14 = new l0.i
            r14.<init>(r3, r6, r7, r12)
            java.util.concurrent.ExecutorService r6 = l0.m.f20989b     // Catch:{ InterruptedException -> 0x00b9 }
            java.util.concurrent.Future r6 = r6.submit(r14)     // Catch:{ InterruptedException -> 0x00b9 }
            long r14 = (long) r15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b2, InterruptedException -> 0x00b0, TimeoutException -> 0x00a8 }
            java.lang.Object r6 = r6.get(r14, r7)     // Catch:{ ExecutionException -> 0x00b2, InterruptedException -> 0x00b0, TimeoutException -> 0x00a8 }
            l0.m$a r6 = (l0.m.a) r6     // Catch:{ InterruptedException -> 0x00b9 }
            r13.a(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            android.graphics.Typeface r2 = r6.f20992a     // Catch:{ InterruptedException -> 0x00b9 }
            goto L_0x0158
        L_0x00a8:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00b9 }
            throw r6     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b0:
            r6 = move-exception
            throw r6     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b2:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00b9 }
            r7.<init>(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            throw r7     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b9:
            l0.p r6 = r13.f20969a
            android.os.Handler r7 = r13.f20970b
            l0.b r14 = new l0.b
            r14.<init>(r13, r6, r1)
            r7.post(r14)
            goto L_0x0158
        L_0x00c7:
            s.g<java.lang.String, android.graphics.Typeface> r15 = l0.m.f20988a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r7.f20977e
            r15.append(r0)
            java.lang.String r0 = "-"
            r15.append(r0)
            r15.append(r12)
            java.lang.String r15 = r15.toString()
            s.g<java.lang.String, android.graphics.Typeface> r0 = l0.m.f20988a
            java.lang.Object r0 = r0.b(r15)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f3
            l0.a r6 = new l0.a
            r6.<init>(r13, r4, r0)
            r14.post(r6)
            r2 = r0
            goto L_0x0158
        L_0x00f3:
            l0.j r14 = new l0.j
            r14.<init>(r13)
            java.lang.Object r0 = l0.m.f20990c
            monitor-enter(r0)
            s.i<java.lang.String, java.util.ArrayList<n0.a<l0.m$a>>> r13 = l0.m.f20991d     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r13.getOrDefault(r15, r2)     // Catch:{ all -> 0x0142 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x010a
            r1.add(r14)     // Catch:{ all -> 0x0142 }
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            goto L_0x0158
        L_0x010a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            r1.add(r14)     // Catch:{ all -> 0x0142 }
            r13.put(r15, r1)     // Catch:{ all -> 0x0142 }
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            l0.k r13 = new l0.k
            r13.<init>(r15, r6, r7, r12)
            java.util.concurrent.ExecutorService r6 = l0.m.f20989b
            l0.l r7 = new l0.l
            r7.<init>(r15)
            android.os.Looper r14 = android.os.Looper.myLooper()
            if (r14 != 0) goto L_0x0132
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r15 = android.os.Looper.getMainLooper()
            r14.<init>(r15)
            goto L_0x0137
        L_0x0132:
            android.os.Handler r14 = new android.os.Handler
            r14.<init>()
        L_0x0137:
            l0.r r15 = new l0.r
            r15.<init>(r14, r13, r7)
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6
            r6.execute(r15)
            goto L_0x0158
        L_0x0142:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            throw r6
        L_0x0145:
            g0.k r15 = f18362a
            f0.e$c r7 = (f0.e.c) r7
            android.graphics.Typeface r2 = r15.a(r6, r7, r8, r12)
            if (r13 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0155
            r13.b(r2, r14)
            goto L_0x0158
        L_0x0155:
            r13.a(r1, r14)
        L_0x0158:
            if (r2 == 0) goto L_0x0163
            s.g<java.lang.String, android.graphics.Typeface> r6 = f18363b
            java.lang.String r7 = c(r8, r9, r10, r11, r12)
            r6.c(r7, r2)
        L_0x0163:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e.a(android.content.Context, f0.e$b, android.content.res.Resources, int, java.lang.String, int, int, f0.g$f, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f18362a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f18363b.c(c(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    public static String c(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
