package com.google.android.gms.internal.ads;

import e8.b70;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class oq {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7701a = Logger.getLogger(oq.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f7702b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f7703c = b70.f13900a;

    /* renamed from: d  reason: collision with root package name */
    public static final d f7704d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7705e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f7706f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f7707g = ((long) m(byte[].class));

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f7708h;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j10, double d10) {
            c(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void b(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void d(Object obj, long j10, boolean z10) {
            if (oq.f7708h) {
                oq.b(obj, j10, z10 ? (byte) 1 : 0);
            } else {
                oq.h(obj, j10, z10 ? (byte) 1 : 0);
            }
        }

        public final void f(Object obj, long j10, byte b10) {
            if (oq.f7708h) {
                oq.b(obj, j10, b10);
            } else {
                oq.h(obj, j10, b10);
            }
        }

        public final boolean i(Object obj, long j10) {
            if (oq.f7708h) {
                if (oq.v(obj, j10) != 0) {
                    return true;
                }
                return false;
            } else if (oq.w(obj, j10) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float j(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final double k(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final byte l(Object obj, long j10) {
            if (oq.f7708h) {
                return oq.v(obj, j10);
            }
            return oq.w(obj, j10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j10, double d10) {
            this.f7709a.putDouble(obj, j10, d10);
        }

        public final void b(Object obj, long j10, float f10) {
            this.f7709a.putFloat(obj, j10, f10);
        }

        public final void d(Object obj, long j10, boolean z10) {
            this.f7709a.putBoolean(obj, j10, z10);
        }

        public final void f(Object obj, long j10, byte b10) {
            this.f7709a.putByte(obj, j10, b10);
        }

        public final boolean i(Object obj, long j10) {
            return this.f7709a.getBoolean(obj, j10);
        }

        public final float j(Object obj, long j10) {
            return this.f7709a.getFloat(obj, j10);
        }

        public final double k(Object obj, long j10) {
            return this.f7709a.getDouble(obj, j10);
        }

        public final byte l(Object obj, long j10) {
            return this.f7709a.getByte(obj, j10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j10, double d10) {
            c(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void b(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void d(Object obj, long j10, boolean z10) {
            if (oq.f7708h) {
                oq.b(obj, j10, z10 ? (byte) 1 : 0);
            } else {
                oq.h(obj, j10, z10 ? (byte) 1 : 0);
            }
        }

        public final void f(Object obj, long j10, byte b10) {
            if (oq.f7708h) {
                oq.b(obj, j10, b10);
            } else {
                oq.h(obj, j10, b10);
            }
        }

        public final boolean i(Object obj, long j10) {
            if (oq.f7708h) {
                if (oq.v(obj, j10) != 0) {
                    return true;
                }
                return false;
            } else if (oq.w(obj, j10) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float j(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final double k(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final byte l(Object obj, long j10) {
            if (oq.f7708h) {
                return oq.v(obj, j10);
            }
            return oq.w(obj, j10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f7709a;

        public d(Unsafe unsafe) {
            this.f7709a = unsafe;
        }

        public abstract void a(Object obj, long j10, double d10);

        public abstract void b(Object obj, long j10, float f10);

        public final void c(Object obj, long j10, long j11) {
            this.f7709a.putLong(obj, j10, j11);
        }

        public abstract void d(Object obj, long j10, boolean z10);

        public final void e(Object obj, long j10, int i10) {
            this.f7709a.putInt(obj, j10, i10);
        }

        public abstract void f(Object obj, long j10, byte b10);

        public final int g(Object obj, long j10) {
            return this.f7709a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f7709a.getLong(obj, j10);
        }

        public abstract boolean i(Object obj, long j10);

        public abstract float j(Object obj, long j10);

        public abstract double k(Object obj, long j10);

        public abstract byte l(Object obj, long j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076 A[SYNTHETIC, Splitter:B:12:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0123 A[SYNTHETIC, Splitter:B:31:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026e  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<com.google.android.gms.internal.ads.oq> r0 = com.google.android.gms.internal.ads.oq.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f7701a = r0
            sun.misc.Unsafe r0 = j()
            f7702b = r0
            java.lang.Class<?> r8 = e8.b70.f13900a
            f7703c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = q(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = q(r10)
            if (r0 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r12 = e8.b70.a()
            if (r12 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.oq$c r9 = new com.google.android.gms.internal.ads.oq$c
            r9.<init>(r0)
            goto L_0x0050
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.oq$a r9 = new com.google.android.gms.internal.ads.oq$a
            r9.<init>(r0)
            goto L_0x0050
        L_0x0049:
            r9 = 0
            goto L_0x0050
        L_0x004b:
            com.google.android.gms.internal.ads.oq$b r9 = new com.google.android.gms.internal.ads.oq$b
            r9.<init>(r0)
        L_0x0050:
            f7704d = r9
            java.lang.String r9 = "copyMemory"
            java.lang.String r11 = "putLong"
            java.lang.String r12 = "putInt"
            java.lang.String r13 = "getInt"
            java.lang.String r14 = "putByte"
            java.lang.String r15 = "getByte"
            r16 = r1
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            r17 = r2
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            r18 = r3
            java.lang.String r3 = "objectFieldOffset"
            r19 = r4
            java.lang.String r4 = "getLong"
            r20 = 0
            r21 = r5
            r5 = 1
            if (r0 != 0) goto L_0x0076
            goto L_0x0095
        L_0x0076:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0100 }
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0100 }
            java.lang.Class<java.lang.reflect.Field> r22 = java.lang.reflect.Field.class
            r5[r20] = r22     // Catch:{ all -> 0x0100 }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x0100 }
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0100 }
            r5[r20] = r7     // Catch:{ all -> 0x0100 }
            r22 = 1
            r5[r22] = r8     // Catch:{ all -> 0x0100 }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Field r5 = k()     // Catch:{ all -> 0x0100 }
            if (r5 != 0) goto L_0x0099
        L_0x0095:
            r23 = r6
            goto L_0x011a
        L_0x0099:
            boolean r5 = e8.b70.a()     // Catch:{ all -> 0x0100 }
            if (r5 == 0) goto L_0x00a2
            r23 = r6
            goto L_0x00fc
        L_0x00a2:
            r5 = 1
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0100 }
            r5[r20] = r8     // Catch:{ all -> 0x0100 }
            r0.getMethod(r15, r5)     // Catch:{ all -> 0x0100 }
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x0100 }
            r5[r20] = r8     // Catch:{ all -> 0x0100 }
            java.lang.Class r22 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0100 }
            r23 = r6
            r6 = 1
            r5[r6] = r22     // Catch:{ all -> 0x00fe }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x00fe }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fe }
            r5[r20] = r8     // Catch:{ all -> 0x00fe }
            r0.getMethod(r13, r5)     // Catch:{ all -> 0x00fe }
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fe }
            r5[r20] = r8     // Catch:{ all -> 0x00fe }
            r5[r6] = r10     // Catch:{ all -> 0x00fe }
            r0.getMethod(r12, r5)     // Catch:{ all -> 0x00fe }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fe }
            r5[r20] = r8     // Catch:{ all -> 0x00fe }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x00fe }
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fe }
            r5[r20] = r8     // Catch:{ all -> 0x00fe }
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r0.getMethod(r11, r5)     // Catch:{ all -> 0x00fe }
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fe }
            r5[r20] = r8     // Catch:{ all -> 0x00fe }
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r6 = 2
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x00fe }
            r5 = 5
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x00fe }
            r5[r20] = r7     // Catch:{ all -> 0x00fe }
            r6 = 1
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r6 = 2
            r5[r6] = r7     // Catch:{ all -> 0x00fe }
            r6 = 3
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r6 = 4
            r5[r6] = r8     // Catch:{ all -> 0x00fe }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            r0 = 1
            goto L_0x011b
        L_0x00fe:
            r0 = move-exception
            goto L_0x0103
        L_0x0100:
            r0 = move-exception
            r23 = r6
        L_0x0103:
            java.util.logging.Logger r5 = f7701a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r8 = r0.length()
            int r8 = r8 + 71
            java.lang.String r0 = e.f.a(r8, r2, r0)
            java.lang.String r8 = "supportsUnsafeByteBufferOperations"
            r5.logp(r6, r1, r8, r0)
        L_0x011a:
            r0 = 0
        L_0x011b:
            f7705e = r0
            sun.misc.Unsafe r0 = f7702b
            if (r0 != 0) goto L_0x0123
            goto L_0x0226
        L_0x0123:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x020e }
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x020e }
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r6[r20] = r8     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x020e }
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            r6[r20] = r8     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ all -> 0x020e }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r20] = r6     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x020e }
            r3 = 2
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ all -> 0x020e }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r13, r3)     // Catch:{ all -> 0x020e }
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            r3[r6] = r5     // Catch:{ all -> 0x020e }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x020e }
            r8 = 2
            r3[r8] = r6     // Catch:{ all -> 0x020e }
            r0.getMethod(r12, r3)     // Catch:{ all -> 0x020e }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r4, r3)     // Catch:{ all -> 0x020e }
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            r3[r6] = r5     // Catch:{ all -> 0x020e }
            r4 = 2
            r3[r4] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r11, r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "getObject"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "putObject"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r6 = 2
            r4[r6] = r7     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            boolean r3 = e8.b70.a()     // Catch:{ all -> 0x020e }
            if (r3 == 0) goto L_0x019c
            goto L_0x020c
        L_0x019c:
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            r4 = 1
            r3[r4] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r15, r3)     // Catch:{ all -> 0x020e }
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x020e }
            r3[r20] = r7     // Catch:{ all -> 0x020e }
            r3[r4] = r5     // Catch:{ all -> 0x020e }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x020e }
            r6 = 2
            r3[r6] = r4     // Catch:{ all -> 0x020e }
            r0.getMethod(r14, r3)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "putBoolean"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x020e }
            r8 = 2
            r4[r8] = r6     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ all -> 0x020e }
            r8 = 2
            r4[r8] = r6     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x020e }
            r4[r20] = r7     // Catch:{ all -> 0x020e }
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            java.lang.Class r5 = java.lang.Double.TYPE     // Catch:{ all -> 0x020e }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x020e }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x020e }
        L_0x020c:
            r0 = 1
            goto L_0x0227
        L_0x020e:
            r0 = move-exception
            java.util.logging.Logger r3 = f7701a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            int r5 = r5 + 71
            java.lang.String r0 = e.f.a(r5, r2, r0)
            java.lang.String r2 = "supportsUnsafeArrayOperations"
            r3.logp(r4, r1, r2, r0)
        L_0x0226:
            r0 = 0
        L_0x0227:
            f7706f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m(r0)
            long r0 = (long) r0
            f7707g = r0
            m(r23)
            o(r23)
            m(r21)
            o(r21)
            m(r19)
            o(r19)
            m(r18)
            o(r18)
            m(r17)
            o(r17)
            m(r16)
            o(r16)
            java.lang.reflect.Field r0 = k()
            if (r0 == 0) goto L_0x0266
            com.google.android.gms.internal.ads.oq$d r1 = f7704d
            if (r1 != 0) goto L_0x0261
            goto L_0x0266
        L_0x0261:
            sun.misc.Unsafe r1 = r1.f7709a
            r1.objectFieldOffset(r0)
        L_0x0266:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0270
            r20 = 1
        L_0x0270:
            f7708h = r20
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oq.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j10) {
        return f7704d.l(bArr, f7707g + j10);
    }

    public static void b(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = ((((int) j10) ^ -1) & 3) << 3;
        d dVar = f7704d;
        dVar.e(obj, j11, ((255 & b10) << i10) | (n(obj, j11) & ((255 << i10) ^ -1)));
    }

    public static void c(Object obj, long j10, double d10) {
        f7704d.a(obj, j10, d10);
    }

    public static void d(Object obj, long j10, long j11) {
        f7704d.c(obj, j10, j11);
    }

    public static void e(Object obj, long j10, Object obj2) {
        f7704d.f7709a.putObject(obj, j10, obj2);
    }

    public static void f(Object obj, long j10, boolean z10) {
        f7704d.d(obj, j10, z10);
    }

    public static void g(byte[] bArr, long j10, byte b10) {
        f7704d.f(bArr, f7707g + j10, b10);
    }

    public static void h(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        d dVar = f7704d;
        dVar.e(obj, j11, ((255 & b10) << i10) | (n(obj, j11) & ((255 << i10) ^ -1)));
    }

    public static void i(Object obj, long j10, int i10) {
        f7704d.e(obj, j10, i10);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new pq());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field k() {
        Field field;
        Field field2;
        if (b70.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static <T> T l(Class<T> cls) {
        try {
            return f7702b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int m(Class<?> cls) {
        if (f7706f) {
            return f7704d.f7709a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int n(Object obj, long j10) {
        return f7704d.g(obj, j10);
    }

    public static int o(Class<?> cls) {
        if (f7706f) {
            return f7704d.f7709a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long p(Object obj, long j10) {
        return f7704d.h(obj, j10);
    }

    public static boolean q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!b70.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f7703c;
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
        return f7704d.i(obj, j10);
    }

    public static float s(Object obj, long j10) {
        return f7704d.j(obj, j10);
    }

    public static double t(Object obj, long j10) {
        return f7704d.k(obj, j10);
    }

    public static Object u(Object obj, long j10) {
        return f7704d.f7709a.getObject(obj, j10);
    }

    public static byte v(Object obj, long j10) {
        return (byte) (n(obj, -4 & j10) >>> ((int) (((j10 ^ -1) & 3) << 3)));
    }

    public static byte w(Object obj, long j10) {
        return (byte) (n(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)));
    }
}
