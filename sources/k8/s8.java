package k8;

import androidx.activity.e;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import n3.d;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class s8 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f20463a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f20464b = i5.a();

    /* renamed from: c  reason: collision with root package name */
    public static final d f20465c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f20466d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f20467e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f20468f = ((long) s(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f20469g;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013a  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = k()
            f20463a = r7
            java.lang.Class r8 = k8.i5.a()
            f20464b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = q(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = q(r10)
            if (r7 != 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r9 == 0) goto L_0x0031
            k8.r8 r9 = new k8.r8
            r9.<init>(r7)
            goto L_0x003a
        L_0x0031:
            if (r10 == 0) goto L_0x0039
            k8.q8 r9 = new k8.q8
            r9.<init>(r7)
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            f20465c = r9
            java.lang.String r7 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 != 0) goto L_0x0046
            goto L_0x0070
        L_0x0046:
            java.util.Queue<T> r9 = r9.f21860a
            sun.misc.Unsafe r9 = (sun.misc.Unsafe) r9
            if (r9 != 0) goto L_0x004d
            goto L_0x0070
        L_0x004d:
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x006c }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006c }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006c }
            r9.getMethod(r10, r14)     // Catch:{ all -> 0x006c }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x006c }
            r14[r13] = r6     // Catch:{ all -> 0x006c }
            r14[r12] = r8     // Catch:{ all -> 0x006c }
            r9.getMethod(r7, r14)     // Catch:{ all -> 0x006c }
            java.lang.reflect.Field r8 = b()     // Catch:{ all -> 0x006c }
            if (r8 != 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            r8 = 1
            goto L_0x0071
        L_0x006c:
            r8 = move-exception
            l(r8)
        L_0x0070:
            r8 = 0
        L_0x0071:
            f20466d = r8
            n3.d r8 = f20465c
            if (r8 != 0) goto L_0x0079
            goto L_0x00f4
        L_0x0079:
            java.util.Queue<T> r8 = r8.f21860a
            sun.misc.Unsafe r8 = (sun.misc.Unsafe) r8
            if (r8 != 0) goto L_0x0080
            goto L_0x00f4
        L_0x0080:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r9[r13] = r14     // Catch:{ all -> 0x00f0 }
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r10 = "arrayBaseOffset"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f0 }
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r13] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r10 = "arrayIndexScale"
            r8.getMethod(r10, r9)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r9 = new java.lang.Class[r11]     // Catch:{ all -> 0x00f0 }
            r9[r13] = r6     // Catch:{ all -> 0x00f0 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f0 }
            r9[r12] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f0 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f0 }
            r14[r13] = r6     // Catch:{ all -> 0x00f0 }
            r14[r12] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f0 }
            r14[r11] = r15     // Catch:{ all -> 0x00f0 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x00f0 }
            r14[r13] = r6     // Catch:{ all -> 0x00f0 }
            r14[r12] = r10     // Catch:{ all -> 0x00f0 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f0 }
            r7[r13] = r6     // Catch:{ all -> 0x00f0 }
            r7[r12] = r10     // Catch:{ all -> 0x00f0 }
            r7[r11] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ all -> 0x00f0 }
            r7[r13] = r6     // Catch:{ all -> 0x00f0 }
            r7[r12] = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f0 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f0 }
            r7[r13] = r6     // Catch:{ all -> 0x00f0 }
            r7[r12] = r10     // Catch:{ all -> 0x00f0 }
            r7[r11] = r6     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f0 }
            r6 = 1
            goto L_0x00f5
        L_0x00f0:
            r6 = move-exception
            l(r6)
        L_0x00f4:
            r6 = 0
        L_0x00f5:
            f20467e = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = s(r6)
            long r6 = (long) r6
            f20468f = r6
            s(r5)
            a(r5)
            s(r4)
            a(r4)
            s(r3)
            a(r3)
            s(r2)
            a(r2)
            s(r1)
            a(r1)
            s(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0131
            n3.d r1 = f20465c
            if (r1 == 0) goto L_0x0131
            r1.o(r0)
        L_0x0131:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r12 = 0
        L_0x013b:
            f20469g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s8.<clinit>():void");
    }

    public static int a(Class<?> cls) {
        if (f20467e) {
            return f20465c.l(cls);
        }
        return -1;
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = i5.f20259a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        d dVar = f20465c;
        int i10 = ((((int) j10) ^ -1) & 3) << 3;
        dVar.q(obj, j11, ((255 & b10) << i10) | (dVar.m(obj, j11) & ((255 << i10) ^ -1)));
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        d dVar = f20465c;
        int i10 = (((int) j10) & 3) << 3;
        dVar.q(obj, j11, ((255 & b10) << i10) | (dVar.m(obj, j11) & ((255 << i10) ^ -1)));
    }

    public static double e(Object obj, long j10) {
        return f20465c.d(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f20465c.e(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f20465c.m(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f20465c.n(obj, j10);
    }

    public static <T> T i(Class<T> cls) {
        try {
            return f20463a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f20465c.p(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new p8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th) {
        Logger logger = Logger.getLogger(s8.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", e.a(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static void m(Object obj, long j10, double d10) {
        f20465c.h(obj, j10, d10);
    }

    public static void n(Object obj, long j10, long j11) {
        f20465c.r(obj, j10, j11);
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj, long j10) {
        return ((byte) ((f20465c.m(obj, -4 & j10) >>> ((int) (((j10 ^ -1) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj, long j10) {
        return ((byte) ((f20465c.m(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = i5.f20259a;
        try {
            Class<?> cls3 = f20464b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean r(Object obj, long j10) {
        return f20465c.j(obj, j10);
    }

    public static int s(Class<?> cls) {
        if (f20467e) {
            return f20465c.k(cls);
        }
        return -1;
    }
}
