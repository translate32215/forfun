package w6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import v6.e0;
import v6.i;
import v6.p;

/* compiled from: DummySurface */
public final class d extends Surface {

    /* renamed from: c  reason: collision with root package name */
    public static int f27031c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27032d;

    /* renamed from: a  reason: collision with root package name */
    public final b f27033a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27034b;

    /* compiled from: DummySurface */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public i f27035a;

        /* renamed from: b  reason: collision with root package name */
        public Handler f27036b;

        /* renamed from: c  reason: collision with root package name */
        public Error f27037c;

        /* renamed from: d  reason: collision with root package name */
        public RuntimeException f27038d;

        /* renamed from: e  reason: collision with root package name */
        public d f27039e;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public final void a(int i10) {
            int[] iArr;
            EGLSurface eGLSurface;
            int[] iArr2;
            int i11 = i10;
            this.f27035a.getClass();
            i iVar = this.f27035a;
            iVar.getClass();
            boolean z10 = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                int[] iArr3 = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                    iVar.f26459c = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    int[] iArr5 = iArr4;
                    boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, i.f26456g, 0, eGLConfigArr, 0, 1, iArr4, 0);
                    if (!eglChooseConfig || iArr5[0] <= 0 || eGLConfigArr[0] == null) {
                        throw new i.b(e0.n("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr5[0]), eGLConfigArr[0]), (i.a) null);
                    }
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLDisplay eGLDisplay = iVar.f26459c;
                    if (i11 == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        iVar.f26460d = eglCreateContext;
                        EGLDisplay eGLDisplay2 = iVar.f26459c;
                        if (i11 == 1) {
                            eGLSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i11 == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurface == null) {
                                throw new i.b("eglCreatePbufferSurface failed", (i.a) null);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eglCreateContext)) {
                            iVar.f26461e = eGLSurface;
                            GLES20.glGenTextures(1, iVar.f26458b, 0);
                            e.i.c();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(iVar.f26458b[0]);
                            iVar.f26462f = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(iVar);
                            SurfaceTexture surfaceTexture2 = this.f27035a.f26462f;
                            surfaceTexture2.getClass();
                            if (i11 != 0) {
                                z10 = true;
                            }
                            this.f27039e = new d(this, surfaceTexture2, z10, (a) null);
                            return;
                        }
                        throw new i.b("eglMakeCurrent failed", (i.a) null);
                    }
                    throw new i.b("eglCreateContext failed", (i.a) null);
                }
                throw new i.b("eglInitialize failed", (i.a) null);
            }
            throw new i.b("eglGetDisplay failed", (i.a) null);
        }

        public final void b() {
            this.f27035a.getClass();
            i iVar = this.f27035a;
            iVar.f26457a.removeCallbacks(iVar);
            try {
                SurfaceTexture surfaceTexture = iVar.f26462f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, iVar.f26458b, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = iVar.f26459c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = iVar.f26459c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = iVar.f26461e;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(iVar.f26459c, iVar.f26461e);
                }
                EGLContext eGLContext = iVar.f26460d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(iVar.f26459c, eGLContext);
                }
                if (e0.f26436a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = iVar.f26459c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(iVar.f26459c);
                }
                iVar.f26459c = null;
                iVar.f26460d = null;
                iVar.f26461e = null;
                iVar.f26462f = null;
            }
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    p.b("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f27038d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    try {
                        p.b("DummySurface", "Failed to initialize dummy surface", e11);
                        this.f27037c = e11;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    public d(b bVar, SurfaceTexture surfaceTexture, boolean z10, a aVar) {
        super(surfaceTexture);
        this.f27033a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r7 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r7) {
        /*
            int r0 = v6.e0.f26436a
            r1 = 24
            r2 = 12373(0x3055, float:1.7338E-41)
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            r1 = 26
            if (r0 >= r1) goto L_0x0024
            java.lang.String r5 = v6.e0.f26438c
            java.lang.String r6 = "samsung"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = v6.e0.f26439d
            java.lang.String r6 = "XT1650"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0024
            goto L_0x0047
        L_0x0024:
            if (r0 >= r1) goto L_0x0033
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)
            if (r7 != 0) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L_0x0047
            java.lang.String r1 = "EGL_EXT_protected_content"
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x0047
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            if (r7 == 0) goto L_0x0067
            r7 = 17
            if (r0 >= r7) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L_0x0062
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x0062
            r4 = 1
        L_0x0062:
            if (r4 == 0) goto L_0x0065
            return r3
        L_0x0065:
            r7 = 2
            return r7
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.d.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (d.class) {
            z10 = true;
            if (!f27032d) {
                f27031c = a(context);
                f27032d = true;
            }
            if (f27031c == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static d d(Context context, boolean z10) {
        boolean z11 = false;
        v6.a.d(!z10 || b(context));
        b bVar = new b();
        int i10 = z10 ? f27031c : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f27036b = handler;
        bVar.f27035a = new i(handler);
        synchronized (bVar) {
            bVar.f27036b.obtainMessage(1, i10, 0).sendToTarget();
            while (bVar.f27039e == null && bVar.f27038d == null && bVar.f27037c == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f27038d;
        if (runtimeException == null) {
            Error error = bVar.f27037c;
            if (error == null) {
                d dVar = bVar.f27039e;
                dVar.getClass();
                return dVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public void release() {
        super.release();
        synchronized (this.f27033a) {
            if (!this.f27034b) {
                b bVar = this.f27033a;
                bVar.f27036b.getClass();
                bVar.f27036b.sendEmptyMessage(2);
                this.f27034b = true;
            }
        }
    }
}
