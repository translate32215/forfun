package v6;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: EGLSurfaceTexture */
public final class i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f26456g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    public final Handler f26457a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f26458b = new int[1];

    /* renamed from: c  reason: collision with root package name */
    public EGLDisplay f26459c;

    /* renamed from: d  reason: collision with root package name */
    public EGLContext f26460d;

    /* renamed from: e  reason: collision with root package name */
    public EGLSurface f26461e;

    /* renamed from: f  reason: collision with root package name */
    public SurfaceTexture f26462f;

    /* compiled from: EGLSurfaceTexture */
    public static final class b extends RuntimeException {
        public b(String str, a aVar) {
            super(str);
        }
    }

    public i(Handler handler) {
        this.f26457a = handler;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f26457a.post(this);
    }

    public void run() {
        SurfaceTexture surfaceTexture = this.f26462f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
