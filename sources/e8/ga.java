package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.internal.ads.j7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ga extends Thread implements SurfaceTexture.OnFrameAvailableListener, ha {
    public static final float[] J = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public FloatBuffer A;
    public final CountDownLatch B;
    public final Object C;
    public EGL10 D;
    public EGLDisplay E;
    public EGLContext F;
    public EGLSurface G;
    public volatile boolean H;
    public volatile boolean I;

    /* renamed from: a  reason: collision with root package name */
    public final j7 f14739a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f14740b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f14741c = new float[9];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f14742d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    public final float[] f14743e = new float[9];

    /* renamed from: f  reason: collision with root package name */
    public final float[] f14744f = new float[9];

    /* renamed from: g  reason: collision with root package name */
    public final float[] f14745g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f14746h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float f14747i = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f14748r;

    /* renamed from: s  reason: collision with root package name */
    public float f14749s;

    /* renamed from: t  reason: collision with root package name */
    public int f14750t;

    /* renamed from: u  reason: collision with root package name */
    public int f14751u;

    /* renamed from: v  reason: collision with root package name */
    public SurfaceTexture f14752v;

    /* renamed from: w  reason: collision with root package name */
    public SurfaceTexture f14753w;

    /* renamed from: x  reason: collision with root package name */
    public int f14754x;

    /* renamed from: y  reason: collision with root package name */
    public int f14755y;

    /* renamed from: z  reason: collision with root package name */
    public int f14756z;

    public ga(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = J;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.A = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        j7 j7Var = new j7(context);
        this.f14739a = j7Var;
        j7Var.f7132h = this;
        this.B = new CountDownLatch(1);
        this.C = new Object();
    }

    public static void a(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = (double) f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    public static void b(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[1] * fArr3[3];
        fArr[0] = (fArr2[2] * fArr3[6]) + f10 + (fArr2[0] * fArr3[0]);
        fArr[1] = (fArr2[2] * fArr3[7]) + (fArr2[1] * fArr3[4]) + (fArr2[0] * fArr3[1]);
        fArr[2] = (fArr2[2] * fArr3[8]) + (fArr2[1] * fArr3[5]) + (fArr2[0] * fArr3[2]);
        fArr[3] = (fArr2[5] * fArr3[6]) + (fArr2[4] * fArr3[3]) + (fArr2[3] * fArr3[0]);
        fArr[4] = (fArr2[5] * fArr3[7]) + (fArr2[4] * fArr3[4]) + (fArr2[3] * fArr3[1]);
        fArr[5] = (fArr2[5] * fArr3[8]) + (fArr2[4] * fArr3[5]) + (fArr2[3] * fArr3[2]);
        fArr[6] = (fArr2[8] * fArr3[6]) + (fArr2[7] * fArr3[3]) + (fArr2[6] * fArr3[0]);
        fArr[7] = (fArr2[8] * fArr3[7]) + (fArr2[7] * fArr3[4]) + (fArr2[6] * fArr3[1]);
        float f11 = fArr2[6] * fArr3[2];
        fArr[8] = (fArr2[8] * fArr3[8]) + (fArr2[7] * fArr3[5]) + f11;
    }

    public static void f(float[] fArr, float f10) {
        double d10 = (double) f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static int g(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        h("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        h("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        h("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        h("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Could not compile shader ");
        sb2.append(i10);
        sb2.append(":");
        Log.e("SphericalVideoRenderer", sb2.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        h("deleteShader");
        return 0;
    }

    public static void h(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 21);
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(glGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public final void c() {
        synchronized (this.C) {
            this.I = true;
            this.f14753w = null;
            this.C.notifyAll();
        }
    }

    public final boolean d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.G;
        boolean z10 = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z10 = this.D.eglDestroySurface(this.E, this.G) | this.D.eglMakeCurrent(this.E, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.G = null;
        }
        EGLContext eGLContext = this.F;
        if (eGLContext != null) {
            z10 |= this.D.eglDestroyContext(this.E, eGLContext);
            this.F = null;
        }
        EGLDisplay eGLDisplay = this.E;
        if (eGLDisplay == null) {
            return z10;
        }
        boolean eglTerminate = z10 | this.D.eglTerminate(eGLDisplay);
        this.E = null;
        return eglTerminate;
    }

    public final void e(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int i10 = this.f14751u;
        int i11 = this.f14750t;
        if (i10 > i11) {
            f13 = (f10 * 1.7453293f) / ((float) i10);
            f12 = f11 * 1.7453293f;
            f14 = (float) i10;
        } else {
            f13 = (f10 * 1.7453293f) / ((float) i11);
            f12 = f11 * 1.7453293f;
            f14 = (float) i11;
        }
        this.f14748r -= f13;
        float f15 = this.f14749s - (f12 / f14);
        this.f14749s = f15;
        if (f15 < -1.5707964f) {
            this.f14749s = -1.5707964f;
        }
        if (this.f14749s > 1.5707964f) {
            this.f14749s = 1.5707964f;
        }
    }

    public final void i(int i10, int i11) {
        synchronized (this.C) {
            this.f14751u = i10;
            this.f14750t = i11;
            this.H = true;
            this.C.notifyAll();
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14756z++;
        synchronized (this.C) {
            this.C.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cb A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f14753w
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            l0.e.I(r0)
            java.util.concurrent.CountDownLatch r0 = r15.B
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.D = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.E = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 11
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002a:
            r0 = 0
            goto L_0x0092
        L_0x002d:
            int[] r1 = new int[r4]
            javax.microedition.khronos.egl.EGL10 r8 = r15.D
            boolean r0 = r8.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x0038
            goto L_0x002a
        L_0x0038:
            int[] r0 = new int[r6]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r6]
            int[] r10 = new int[r2]
            r10 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.D
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.E
            r12 = 1
            r11 = r1
            r13 = r0
            boolean r8 = r8.eglChooseConfig(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x0055
            r0 = r0[r7]
            if (r0 <= 0) goto L_0x0055
            r0 = r1[r7]
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x002a
        L_0x0059:
            int[] r1 = new int[r3]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.D
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.E
            javax.microedition.khronos.egl.EGLContext r10 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r8.eglCreateContext(r9, r0, r10, r1)
            r15.F = r1
            if (r1 == 0) goto L_0x002a
            javax.microedition.khronos.egl.EGLContext r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r8) goto L_0x0071
            goto L_0x002a
        L_0x0071:
            javax.microedition.khronos.egl.EGL10 r1 = r15.D
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.E
            android.graphics.SurfaceTexture r9 = r15.f14753w
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r8, r0, r9, r5)
            r15.G = r0
            if (r0 == 0) goto L_0x002a
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0084
            goto L_0x002a
        L_0x0084:
            javax.microedition.khronos.egl.EGL10 r1 = r15.D
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.E
            javax.microedition.khronos.egl.EGLContext r9 = r15.F
            boolean r0 = r1.eglMakeCurrent(r8, r0, r0, r9)
            if (r0 != 0) goto L_0x0091
            goto L_0x002a
        L_0x0091:
            r0 = 1
        L_0x0092:
            r1 = 35633(0x8b31, float:4.9932E-41)
            e8.l<java.lang.String> r8 = e8.t.G0
            e8.ti0 r9 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r9 = r9.f16769f
            java.lang.Object r9 = r9.a(r8)
            java.lang.String r9 = (java.lang.String) r9
            T r10 = r8.f15347c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00b4
            e8.ti0 r9 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r9 = r9.f16769f
            java.lang.Object r8 = r9.a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r8 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00b6:
            int r1 = g(r1, r8)
            if (r1 != 0) goto L_0x00bf
        L_0x00bc:
            r9 = 0
            goto L_0x013f
        L_0x00bf:
            r8 = 35632(0x8b30, float:4.9931E-41)
            e8.l<java.lang.String> r9 = e8.t.H0
            e8.ti0 r10 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r10 = r10.f16769f
            java.lang.Object r10 = r10.a(r9)
            java.lang.String r10 = (java.lang.String) r10
            T r11 = r9.f15347c
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00e1
            e8.ti0 r10 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r10 = r10.f16769f
            java.lang.Object r9 = r10.a(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r9 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00e3:
            int r8 = g(r8, r9)
            if (r8 != 0) goto L_0x00ea
            goto L_0x00bc
        L_0x00ea:
            int r9 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r10 = "createProgram"
            h(r10)
            if (r9 == 0) goto L_0x013f
            android.opengl.GLES20.glAttachShader(r9, r1)
            java.lang.String r1 = "attachShader"
            h(r1)
            android.opengl.GLES20.glAttachShader(r9, r8)
            java.lang.String r1 = "attachShader"
            h(r1)
            android.opengl.GLES20.glLinkProgram(r9)
            java.lang.String r1 = "linkProgram"
            h(r1)
            int[] r1 = new int[r6]
            r8 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r9, r8, r1, r7)
            java.lang.String r8 = "getProgramiv"
            h(r8)
            r1 = r1[r7]
            if (r1 == r6) goto L_0x0137
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r8 = "Could not link program: "
            android.util.Log.e(r1, r8)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r8 = android.opengl.GLES20.glGetProgramInfoLog(r9)
            android.util.Log.e(r1, r8)
            android.opengl.GLES20.glDeleteProgram(r9)
            java.lang.String r1 = "deleteProgram"
            h(r1)
            goto L_0x00bc
        L_0x0137:
            android.opengl.GLES20.glValidateProgram(r9)
            java.lang.String r1 = "validateProgram"
            h(r1)
        L_0x013f:
            r15.f14754x = r9
            android.opengl.GLES20.glUseProgram(r9)
            java.lang.String r1 = "useProgram"
            h(r1)
            int r1 = r15.f14754x
            java.lang.String r8 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r8)
            r10 = 3
            r11 = 5126(0x1406, float:7.183E-42)
            r12 = 0
            r13 = 12
            java.nio.FloatBuffer r14 = r15.A
            r9 = r1
            android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = "vertexAttribPointer"
            h(r8)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            h(r1)
            int[] r1 = new int[r6]
            android.opengl.GLES20.glGenTextures(r6, r1, r7)
            java.lang.String r8 = "genTextures"
            h(r8)
            r1 = r1[r7]
            r8 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r8, r1)
            java.lang.String r9 = "bindTextures"
            h(r9)
            r9 = 10240(0x2800, float:1.4349E-41)
            r10 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            h(r9)
            r9 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            h(r9)
            r9 = 10242(0x2802, float:1.4352E-41)
            r10 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            h(r9)
            r9 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r8 = "texParameteri"
            h(r8)
            int r8 = r15.f14754x
            java.lang.String r9 = "uVMat"
            int r8 = android.opengl.GLES20.glGetUniformLocation(r8, r9)
            r15.f14755y = r8
            r9 = 9
            float[] r9 = new float[r9]
            r9 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r8, r6, r7, r9, r7)
            int r8 = r15.f14754x
            if (r8 == 0) goto L_0x01c8
            r8 = 1
            goto L_0x01c9
        L_0x01c8:
            r8 = 0
        L_0x01c9:
            if (r0 == 0) goto L_0x03c1
            if (r8 != 0) goto L_0x01cf
            goto L_0x03c1
        L_0x01cf:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f14752v = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.B
            r0.countDown()
            com.google.android.gms.internal.ads.j7 r0 = r15.f14739a
            android.os.Handler r1 = r0.f7131g
            if (r1 == 0) goto L_0x01e5
            goto L_0x0218
        L_0x01e5:
            android.hardware.SensorManager r1 = r0.f7125a
            android.hardware.Sensor r1 = r1.getDefaultSensor(r2)
            if (r1 != 0) goto L_0x01f3
            java.lang.String r0 = "No Sensor of TYPE_ROTATION_VECTOR"
            l0.e.I(r0)
            goto L_0x0218
        L_0x01f3:
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r8 = "OrientationMonitor"
            r2.<init>(r8)
            r2.start()
            e8.d40 r8 = new e8.d40
            android.os.Looper r2 = r2.getLooper()
            r8.<init>(r2)
            r0.f7131g = r8
            android.hardware.SensorManager r2 = r0.f7125a
            boolean r1 = r2.registerListener(r0, r1, r7, r8)
            if (r1 != 0) goto L_0x0218
            java.lang.String r1 = "SensorManager.registerListener failed."
            l0.e.I(r1)
            r0.a()
        L_0x0218:
            r15.H = r6     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
        L_0x021a:
            boolean r0 = r15.I     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            if (r0 != 0) goto L_0x0364
        L_0x021e:
            int r0 = r15.f14756z     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            if (r0 <= 0) goto L_0x022d
            android.graphics.SurfaceTexture r0 = r15.f14752v     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r0 = r15.f14756z     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r0 = r0 - r6
            r15.f14756z = r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            goto L_0x021e
        L_0x022d:
            com.google.android.gms.internal.ads.j7 r0 = r15.f14739a     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r1 = r15.f14740b     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            boolean r0 = r0.b(r1)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r1 = 5
            r2 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x02b3
            float r0 = r15.f14747i     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            if (r0 == 0) goto L_0x02a8
            float[] r0 = r15.f14740b     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r9 = new float[r3]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r10 = 0
            r9[r7] = r10     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r6] = r11     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r9[r4] = r10     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r10 = new float[r3]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r11 = r0[r7]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r11 = r11 * r12
            r12 = r0[r6]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r12 = r12 * r13
            float r12 = r12 + r11
            r11 = r0[r4]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r11 = r11 * r13
            float r11 = r11 + r12
            r10[r7] = r11     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r11 = r0[r3]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r11 = r11 * r12
            r12 = r0[r2]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r12 = r12 * r13
            float r12 = r12 + r11
            r11 = r0[r1]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r11 = r11 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r12 = r12 * r13
            float r12 = r12 + r11
            r11 = 8
            r0 = r0[r11]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r9 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = r0 * r9
            float r0 = r0 + r12
            r10[r4] = r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r0 = r10[r7]     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = r0 - r8
            float r0 = -r0
            r15.f14747i = r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
        L_0x02a8:
            float[] r0 = r15.f14745g     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r9 = r15.f14747i     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r10 = r15.f14748r     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r9 = r9 + r10
            f(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            goto L_0x02c2
        L_0x02b3:
            float[] r0 = r15.f14740b     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            a(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r0 = r15.f14745g     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r9 = r15.f14748r     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            f(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
        L_0x02c2:
            float[] r0 = r15.f14741c     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            a(r0, r8)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r0 = r15.f14742d     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r8 = r15.f14745g     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r9 = r15.f14741c     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            b(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r0 = r15.f14743e     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r8 = r15.f14740b     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r9 = r15.f14742d     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            b(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r0 = r15.f14744f     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r8 = r15.f14749s     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            a(r0, r8)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r0 = r15.f14746h     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r8 = r15.f14744f     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r9 = r15.f14743e     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            b(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r0 = r15.f14755y     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float[] r8 = r15.f14746h     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r6, r7, r8, r7)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            android.opengl.GLES20.glDrawArrays(r1, r7, r2)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            java.lang.String r0 = "drawArrays"
            h(r0)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            javax.microedition.khronos.egl.EGL10 r0 = r15.D     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.E     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            javax.microedition.khronos.egl.EGLSurface r2 = r15.G     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r0.eglSwapBuffers(r1, r2)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            boolean r0 = r15.H     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            if (r0 == 0) goto L_0x034a
            int r0 = r15.f14751u     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r1 = r15.f14750t     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            android.opengl.GLES20.glViewport(r7, r7, r0, r1)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            java.lang.String r0 = "viewport"
            h(r0)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r0 = r15.f14754x     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r1 = r15.f14754x     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            java.lang.String r2 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r2 = r15.f14751u     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r8 = r15.f14750t     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r2 <= r8) goto L_0x033d
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            int r0 = r15.f14750t     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = r0 * r9
            int r2 = r15.f14751u     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r2 = (float) r2     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r0 = r0 / r2
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            goto L_0x0348
        L_0x033d:
            float r2 = (float) r2     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r2 = r2 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            float r2 = r2 / r8
            android.opengl.GLES20.glUniform1f(r0, r2)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
        L_0x0348:
            r15.H = r7     // Catch:{ IllegalStateException -> 0x039b, all -> 0x0374 }
        L_0x034a:
            java.lang.Object r0 = r15.C     // Catch:{ InterruptedException -> 0x021a }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x021a }
            boolean r1 = r15.I     // Catch:{ all -> 0x0361 }
            if (r1 != 0) goto L_0x035e
            boolean r1 = r15.H     // Catch:{ all -> 0x0361 }
            if (r1 != 0) goto L_0x035e
            int r1 = r15.f14756z     // Catch:{ all -> 0x0361 }
            if (r1 != 0) goto L_0x035e
            java.lang.Object r1 = r15.C     // Catch:{ all -> 0x0361 }
            r1.wait()     // Catch:{ all -> 0x0361 }
        L_0x035e:
            monitor-exit(r0)     // Catch:{ all -> 0x0361 }
            goto L_0x021a
        L_0x0361:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0361 }
            throw r1     // Catch:{ InterruptedException -> 0x021a }
        L_0x0364:
            com.google.android.gms.internal.ads.j7 r0 = r15.f14739a
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.f14752v
            r0.setOnFrameAvailableListener(r5)
            r15.f14752v = r5
            r15.d()
            return
        L_0x0374:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            l0.e.C(r1, r0)     // Catch:{ all -> 0x03b0 }
            d7.l r1 = d7.l.B     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.ads.y6 r1 = r1.f13190g     // Catch:{ all -> 0x03b0 }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            android.content.Context r3 = r1.f8584e     // Catch:{ all -> 0x03b0 }
            e8.f9 r1 = r1.f8585f     // Catch:{ all -> 0x03b0 }
            e8.v6 r1 = com.google.android.gms.internal.ads.a5.d(r3, r1)     // Catch:{ all -> 0x03b0 }
            r1.c(r0, r2)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.ads.j7 r0 = r15.f14739a
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.f14752v
            r0.setOnFrameAvailableListener(r5)
            r15.f14752v = r5
            r15.d()
            return
        L_0x039b:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            l0.e.K(r0)     // Catch:{ all -> 0x03b0 }
            com.google.android.gms.internal.ads.j7 r0 = r15.f14739a
            r0.a()
            android.graphics.SurfaceTexture r0 = r15.f14752v
            r0.setOnFrameAvailableListener(r5)
            r15.f14752v = r5
            r15.d()
            return
        L_0x03b0:
            r0 = move-exception
            com.google.android.gms.internal.ads.j7 r1 = r15.f14739a
            r1.a()
            android.graphics.SurfaceTexture r1 = r15.f14752v
            r1.setOnFrameAvailableListener(r5)
            r15.f14752v = r5
            r15.d()
            throw r0
        L_0x03c1:
            javax.microedition.khronos.egl.EGL10 r0 = r15.D
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03dc
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03e1
        L_0x03dc:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03e1:
            l0.e.I(r0)
            d7.l r1 = d7.l.B
            com.google.android.gms.internal.ads.y6 r1 = r1.f13190g
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            android.content.Context r3 = r1.f8584e
            e8.f9 r1 = r1.f8585f
            e8.v6 r1 = com.google.android.gms.internal.ads.a5.d(r3, r1)
            r1.c(r2, r0)
            r15.d()
            java.util.concurrent.CountDownLatch r0 = r15.B
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ga.run():void");
    }
}
