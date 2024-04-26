package e8;

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
import android.util.Log;
import o.a;
import q.h;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kg0 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f15281a = new int[1];

    /* renamed from: b  reason: collision with root package name */
    public Handler f15282b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceTexture f15283c;

    /* renamed from: d  reason: collision with root package name */
    public Error f15284d;

    /* renamed from: e  reason: collision with root package name */
    public RuntimeException f15285e;

    /* renamed from: f  reason: collision with root package name */
    public ig0 f15286f;

    public kg0() {
        super("dummySurface");
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i10 = message2.what;
        if (i10 == 1) {
            try {
                boolean z10 = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                a.d(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                a.d(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                a.d(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z10 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                a.d(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z10 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                a.d(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                a.d(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f15281a, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15281a[0]);
                this.f15283c = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f15286f = new ig0(this, this.f15283c, z10, (h) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e10) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e10);
                this.f15285e = e10;
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f15284d = e11;
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
        } else if (i10 == 2) {
            this.f15283c.updateTexImage();
            return true;
        } else if (i10 != 3) {
            return true;
        } else {
            try {
                this.f15283c.release();
                this.f15286f = null;
                this.f15283c = null;
                GLES20.glDeleteTextures(1, this.f15281a, 0);
                quit();
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } finally {
                    quit();
                }
            }
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15282b.sendEmptyMessage(2);
    }
}
