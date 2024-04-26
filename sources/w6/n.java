package w6;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import v6.e0;
import v6.p;

/* compiled from: VideoFrameReleaseHelper */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final e f27099a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final WindowManager f27100b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27101c;

    /* renamed from: d  reason: collision with root package name */
    public final a f27102d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27103e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f27104f;

    /* renamed from: g  reason: collision with root package name */
    public float f27105g;

    /* renamed from: h  reason: collision with root package name */
    public float f27106h;

    /* renamed from: i  reason: collision with root package name */
    public float f27107i;

    /* renamed from: j  reason: collision with root package name */
    public float f27108j;

    /* renamed from: k  reason: collision with root package name */
    public long f27109k;

    /* renamed from: l  reason: collision with root package name */
    public long f27110l;

    /* renamed from: m  reason: collision with root package name */
    public long f27111m;

    /* renamed from: n  reason: collision with root package name */
    public long f27112n;

    /* renamed from: o  reason: collision with root package name */
    public long f27113o;

    /* renamed from: p  reason: collision with root package name */
    public long f27114p;

    /* renamed from: q  reason: collision with root package name */
    public long f27115q;

    /* compiled from: VideoFrameReleaseHelper */
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f27116a;

        public a(DisplayManager displayManager) {
            this.f27116a = displayManager;
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                n.this.d();
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    /* compiled from: VideoFrameReleaseHelper */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e  reason: collision with root package name */
        public static final b f27118e = new b();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f27119a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f27120b;

        /* renamed from: c  reason: collision with root package name */
        public Choreographer f27121c;

        /* renamed from: d  reason: collision with root package name */
        public int f27122d;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = e0.f26436a;
            Handler handler = new Handler(looper, this);
            this.f27120b = handler;
            handler.sendEmptyMessage(0);
        }

        public void doFrame(long j10) {
            this.f27119a = j10;
            Choreographer choreographer = this.f27121c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f27121c = Choreographer.getInstance();
                return true;
            } else if (i10 == 1) {
                int i11 = this.f27122d + 1;
                this.f27122d = i11;
                if (i11 == 1) {
                    Choreographer choreographer = this.f27121c;
                    choreographer.getClass();
                    choreographer.postFrameCallback(this);
                }
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                int i12 = this.f27122d - 1;
                this.f27122d = i12;
                if (i12 == 0) {
                    Choreographer choreographer2 = this.f27121c;
                    choreographer2.getClass();
                    choreographer2.removeFrameCallback(this);
                    this.f27119a = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    public n(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f27100b = (WindowManager) context.getSystemService("window");
        } else {
            this.f27100b = null;
        }
        if (this.f27100b != null) {
            if (e0.f26436a >= 17) {
                context.getClass();
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    aVar = new a(displayManager);
                }
            }
            this.f27102d = aVar;
            this.f27101c = b.f27118e;
        } else {
            this.f27102d = null;
            this.f27101c = null;
        }
        this.f27109k = -9223372036854775807L;
        this.f27110l = -9223372036854775807L;
        this.f27105g = -1.0f;
        this.f27108j = 1.0f;
    }

    public static void c(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            p.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    public final void a() {
        Surface surface;
        if (e0.f26436a >= 30 && (surface = this.f27104f) != null && this.f27107i != 0.0f) {
            this.f27107i = 0.0f;
            c(surface, 0.0f);
        }
    }

    public final void b() {
        this.f27111m = 0;
        this.f27114p = -1;
        this.f27112n = -1;
    }

    public final void d() {
        WindowManager windowManager = this.f27100b;
        windowManager.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j10 = (long) (1.0E9d / refreshRate);
            this.f27109k = j10;
            this.f27110l = (j10 * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f27109k = -9223372036854775807L;
        this.f27110l = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (java.lang.Math.abs(r0 - r10.f27106h) < (!r1 ? 0.02f : 1.0f)) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r10.f27099a.f27044e >= 30) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r10 = this;
            int r0 = v6.e0.f26436a
            r1 = 30
            if (r0 < r1) goto L_0x00a0
            android.view.Surface r0 = r10.f27104f
            if (r0 != 0) goto L_0x000c
            goto L_0x00a0
        L_0x000c:
            w6.e r0 = r10.f27099a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x003e
            w6.e r0 = r10.f27099a
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x003b
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            w6.e$a r0 = r0.f27040a
            long r5 = r0.f27049e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            long r7 = r0.f27050f
            long r7 = r7 / r5
        L_0x0031:
            double r5 = (double) r7
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L_0x0040
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0040
        L_0x003e:
            float r0 = r10.f27105g
        L_0x0040:
            float r3 = r10.f27106h
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0047
            return
        L_0x0047:
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x008e
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x008e
            w6.e r1 = r10.f27099a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0076
            w6.e r1 = r10.f27099a
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x0066
            w6.e$a r1 = r1.f27040a
            long r1 = r1.f27050f
            goto L_0x006b
        L_0x0066:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006b:
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 == 0) goto L_0x007d
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x007f
        L_0x007d:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x007f:
            float r2 = r10.f27106h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            goto L_0x0099
        L_0x008c:
            r5 = 0
            goto L_0x0099
        L_0x008e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            w6.e r2 = r10.f27099a
            int r2 = r2.f27044e
            if (r2 < r1) goto L_0x008c
        L_0x0099:
            if (r5 == 0) goto L_0x00a0
            r10.f27106h = r0
            r10.f(r4)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.n.e():void");
    }

    public final void f(boolean z10) {
        Surface surface;
        if (e0.f26436a >= 30 && (surface = this.f27104f) != null) {
            float f10 = 0.0f;
            if (this.f27103e) {
                float f11 = this.f27106h;
                if (f11 != -1.0f) {
                    f10 = this.f27108j * f11;
                }
            }
            if (z10 || this.f27107i != f10) {
                this.f27107i = f10;
                c(surface, f10);
            }
        }
    }
}
