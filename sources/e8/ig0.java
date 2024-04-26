package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import o.a;
import q.h;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ig0 extends Surface {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15040c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f15041d;

    /* renamed from: a  reason: collision with root package name */
    public final kg0 f15042a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15043b;

    public ig0(kg0 kg0, SurfaceTexture surfaceTexture, boolean z10, h hVar) {
        super(surfaceTexture);
        this.f15042a = kg0;
    }

    public static ig0 a(Context context, boolean z10) {
        if (eg0.f14479a >= 17) {
            boolean z11 = false;
            a.c(!z10 || b(context));
            kg0 kg0 = new kg0();
            kg0.start();
            kg0.f15282b = new Handler(kg0.getLooper(), kg0);
            synchronized (kg0) {
                kg0.f15282b.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
                while (kg0.f15286f == null && kg0.f15285e == null && kg0.f15284d == null) {
                    try {
                        kg0.wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = kg0.f15285e;
            if (runtimeException == null) {
                Error error = kg0.f15284d;
                if (error == null) {
                    return kg0.f15286f;
                }
                throw error;
            }
            throw runtimeException;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean b(android.content.Context r6) {
        /*
            java.lang.Class<e8.ig0> r0 = e8.ig0.class
            monitor-enter(r0)
            boolean r1 = f15041d     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x004f
            int r1 = e8.eg0.f14479a     // Catch:{ all -> 0x0053 }
            r2 = 17
            r3 = 1
            if (r1 < r2) goto L_0x004d
            r2 = 0
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x0053 }
            r5 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r5)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004b
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004b
            r4 = 24
            if (r1 != r4) goto L_0x0047
            java.lang.String r1 = e8.eg0.f14482d     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "SM-G950"
            boolean r4 = r1.startsWith(r4)     // Catch:{ all -> 0x0053 }
            if (r4 != 0) goto L_0x0039
            java.lang.String r4 = "SM-G955"
            boolean r1 = r1.startsWith(r4)     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0047
        L_0x0039:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r6 = r6.hasSystemFeature(r1)     // Catch:{ all -> 0x0053 }
            if (r6 != 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 != 0) goto L_0x004b
            r2 = 1
        L_0x004b:
            f15040c = r2     // Catch:{ all -> 0x0053 }
        L_0x004d:
            f15041d = r3     // Catch:{ all -> 0x0053 }
        L_0x004f:
            boolean r6 = f15040c     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)
            return r6
        L_0x0053:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ig0.b(android.content.Context):boolean");
    }

    public final void release() {
        super.release();
        synchronized (this.f15042a) {
            if (!this.f15043b) {
                this.f15042a.f15282b.sendEmptyMessage(3);
                this.f15043b = true;
            }
        }
    }
}
