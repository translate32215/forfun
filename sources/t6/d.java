package t6;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.text.TextUtils;
import e.i;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.a0;
import w6.m;
import x6.a;
import x6.c;

/* compiled from: SceneRenderer */
public final class d implements m, a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f25777a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f25778b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    public final b f25779c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final c f25780d = new c();

    /* renamed from: e  reason: collision with root package name */
    public final a0<Long> f25781e = new a0<>();

    /* renamed from: f  reason: collision with root package name */
    public final a0<x6.d> f25782f = new a0<>();

    /* renamed from: g  reason: collision with root package name */
    public final float[] f25783g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f25784h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    public int f25785i;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f25786j;

    /* renamed from: k  reason: collision with root package name */
    public volatile int f25787k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f25788l = -1;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f25789m;

    public void a(long j10, float[] fArr) {
        this.f25780d.f27858c.a(j10, fArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(long r33, long r35, x4.b0 r37, android.media.MediaFormat r38) {
        /*
            r32 = this;
            r0 = r32
            r1 = r35
            r3 = r37
            v6.a0<java.lang.Long> r4 = r0.f25781e
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r4.a(r1, r5)
            byte[] r4 = r3.D
            int r3 = r3.E
            byte[] r5 = r0.f25789m
            int r6 = r0.f25788l
            r0.f25789m = r4
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r0.f25787k
        L_0x001e:
            r0.f25788l = r3
            if (r6 != r3) goto L_0x002c
            byte[] r3 = r0.f25789m
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L_0x002c
            goto L_0x0226
        L_0x002c:
            byte[] r3 = r0.f25789m
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00b0
            int r8 = r0.f25788l
            v6.v r9 = new v6.v
            r9.<init>((byte[]) r3)
            r3 = 4
            r9.E(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r9.D(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r10) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0081
            r3 = 8
            r9.E(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.f26519b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r10 = r9.f26520c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
        L_0x0059:
            if (r3 >= r10) goto L_0x0086
            int r11 = r9.f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r11 = r11 + r3
            if (r11 <= r3) goto L_0x0086
            if (r11 <= r10) goto L_0x0065
            goto L_0x0086
        L_0x0065:
            int r3 = r9.f()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r12 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r12) goto L_0x0079
            r12 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r12) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r9.D(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r3 = r11
            goto L_0x0059
        L_0x0079:
            r9.C(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            java.util.ArrayList r3 = x6.e.a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0087
        L_0x0081:
            java.util.ArrayList r3 = x6.e.a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r3 = r4
        L_0x0087:
            if (r3 != 0) goto L_0x008a
            goto L_0x00b0
        L_0x008a:
            int r9 = r3.size()
            if (r9 == r7) goto L_0x00a5
            if (r9 == r5) goto L_0x0093
            goto L_0x00b0
        L_0x0093:
            x6.d r4 = new x6.d
            java.lang.Object r9 = r3.get(r6)
            x6.d$a r9 = (x6.d.a) r9
            java.lang.Object r3 = r3.get(r7)
            x6.d$a r3 = (x6.d.a) r3
            r4.<init>(r9, r3, r8)
            goto L_0x00b0
        L_0x00a5:
            x6.d r4 = new x6.d
            java.lang.Object r3 = r3.get(r6)
            x6.d$a r3 = (x6.d.a) r3
            r4.<init>(r3, r8)
        L_0x00b0:
            if (r4 == 0) goto L_0x00ba
            boolean r3 = t6.b.a(r4)
            if (r3 == 0) goto L_0x00ba
            goto L_0x021f
        L_0x00ba:
            int r3 = r0.f25788l
            v6.a.a(r7)
            v6.a.a(r7)
            v6.a.a(r7)
            v6.a.a(r7)
            v6.a.a(r7)
            r4 = 1127481344(0x43340000, float:180.0)
            double r8 = (double) r4
            double r8 = java.lang.Math.toRadians(r8)
            float r4 = (float) r8
            r8 = 1135869952(0x43b40000, float:360.0)
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            r9 = 36
            float r10 = (float) r9
            float r10 = r4 / r10
            r11 = 72
            float r12 = (float) r11
            float r12 = r8 / r12
            r13 = 15984(0x3e70, float:2.2398E-41)
            float[] r13 = new float[r13]
            r14 = 10656(0x29a0, float:1.4932E-41)
            float[] r14 = new float[r14]
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x00f2:
            if (r15 >= r9) goto L_0x0206
            float r9 = (float) r15
            float r9 = r9 * r10
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r4 / r18
            float r9 = r9 - r19
            int r6 = r15 + 1
            float r7 = (float) r6
            float r7 = r7 * r10
            float r7 = r7 - r19
            r11 = 0
        L_0x0105:
            r5 = 73
            if (r11 >= r5) goto L_0x01f5
            r20 = r6
            r5 = 0
            r6 = 2
        L_0x010d:
            if (r5 >= r6) goto L_0x01d9
            if (r5 != 0) goto L_0x0115
            r21 = r7
            r6 = r9
            goto L_0x0118
        L_0x0115:
            r6 = r7
            r21 = r6
        L_0x0118:
            float r7 = (float) r11
            float r7 = r7 * r12
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r7 + r22
            float r23 = r8 / r18
            r24 = r9
            float r9 = r22 - r23
            int r22 = r16 + 1
            r23 = r12
            r12 = 1112014848(0x42480000, float:50.0)
            double r1 = (double) r12
            r25 = r11
            double r11 = (double) r9
            double r26 = java.lang.Math.sin(r11)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            double r26 = r26 * r1
            r9 = r3
            r28 = r4
            double r3 = (double) r6
            double r29 = java.lang.Math.cos(r3)
            r31 = r9
            r6 = r10
            double r9 = r29 * r26
            float r9 = (float) r9
            float r9 = -r9
            r13[r16] = r9
            int r9 = r22 + 1
            double r26 = java.lang.Math.sin(r3)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            r10 = r5
            r29 = r6
            double r5 = r26 * r1
            float r5 = (float) r5
            r13[r22] = r5
            int r5 = r9 + 1
            double r11 = java.lang.Math.cos(r11)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            double r11 = r11 * r1
            double r1 = java.lang.Math.cos(r3)
            double r1 = r1 * r11
            float r1 = (float) r1
            r13[r9] = r1
            int r1 = r17 + 1
            float r7 = r7 / r8
            r14[r17] = r7
            int r2 = r1 + 1
            int r3 = r15 + r10
            float r3 = (float) r3
            float r3 = r3 * r29
            float r3 = r3 / r28
            r14[r1] = r3
            if (r25 != 0) goto L_0x01a5
            if (r10 == 0) goto L_0x019f
            goto L_0x01a5
        L_0x019f:
            r4 = r10
            r1 = r25
            r3 = 72
            goto L_0x01af
        L_0x01a5:
            r1 = r25
            r3 = 72
            r4 = r10
            if (r1 != r3) goto L_0x01c0
            r6 = 1
            if (r4 != r6) goto L_0x01c0
        L_0x01af:
            int r6 = r5 + -3
            r7 = 3
            java.lang.System.arraycopy(r13, r6, r13, r5, r7)
            int r5 = r5 + 3
            int r6 = r2 + -2
            r7 = 2
            java.lang.System.arraycopy(r14, r6, r14, r2, r7)
            int r2 = r2 + 2
            goto L_0x01c1
        L_0x01c0:
            r7 = 2
        L_0x01c1:
            r17 = r2
            r16 = r5
            int r5 = r4 + 1
            r11 = r1
            r7 = r21
            r12 = r23
            r9 = r24
            r4 = r28
            r10 = r29
            r3 = r31
            r6 = 2
            r1 = r35
            goto L_0x010d
        L_0x01d9:
            r31 = r3
            r28 = r4
            r21 = r7
            r24 = r9
            r29 = r10
            r1 = r11
            r23 = r12
            r3 = 72
            r7 = 2
            int r11 = r1 + 1
            r1 = r35
            r6 = r20
            r7 = r21
            r3 = r31
            goto L_0x0105
        L_0x01f5:
            r31 = r3
            r20 = r6
            r1 = r35
            r15 = r20
            r5 = 2
            r6 = 0
            r7 = 1
            r9 = 36
            r11 = 72
            goto L_0x00f2
        L_0x0206:
            r31 = r3
            x6.d$b r1 = new x6.d$b
            r2 = 0
            r3 = 1
            r1.<init>(r2, r13, r14, r3)
            x6.d r4 = new x6.d
            x6.d$a r5 = new x6.d$a
            x6.d$b[] r3 = new x6.d.b[r3]
            r3[r2] = r1
            r5.<init>(r3)
            r1 = r31
            r4.<init>(r5, r1)
        L_0x021f:
            v6.a0<x6.d> r1 = r0.f25782f
            r2 = r35
            r1.a(r2, r4)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.d.b(long, long, x4.b0, android.media.MediaFormat):void");
    }

    public void c() {
        this.f25781e.b();
        c cVar = this.f25780d;
        cVar.f27858c.b();
        cVar.f27859d = false;
        this.f25778b.set(true);
    }

    public SurfaceTexture d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        i.c();
        b bVar = this.f25779c;
        bVar.getClass();
        int e10 = i.e(TextUtils.join("\n", b.f25756j), TextUtils.join("\n", b.f25757k));
        bVar.f25766d = e10;
        bVar.f25767e = GLES20.glGetUniformLocation(e10, "uMvpMatrix");
        bVar.f25768f = GLES20.glGetUniformLocation(bVar.f25766d, "uTexMatrix");
        bVar.f25769g = GLES20.glGetAttribLocation(bVar.f25766d, "aPosition");
        bVar.f25770h = GLES20.glGetAttribLocation(bVar.f25766d, "aTexCoords");
        bVar.f25771i = GLES20.glGetUniformLocation(bVar.f25766d, "uTexture");
        i.c();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        i.c();
        this.f25785i = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f25785i);
        this.f25786j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new c(this));
        return this.f25786j;
    }
}
