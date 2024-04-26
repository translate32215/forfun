package t6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import e.i;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t6.a;
import t6.b;
import t6.g;
import v6.a0;
import v6.e0;
import x4.a1;
import x4.r0;
import x6.c;
import x6.d;

/* compiled from: SphericalGLSurfaceView */
public final class f extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f25790a;

    /* renamed from: b  reason: collision with root package name */
    public final Sensor f25791b;

    /* renamed from: c  reason: collision with root package name */
    public final a f25792c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f25793d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public final g f25794e;

    /* renamed from: f  reason: collision with root package name */
    public final d f25795f;

    /* renamed from: g  reason: collision with root package name */
    public SurfaceTexture f25796g;

    /* renamed from: h  reason: collision with root package name */
    public Surface f25797h;

    /* renamed from: i  reason: collision with root package name */
    public r0.d f25798i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f25799r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f25800s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f25801t;

    /* compiled from: SphericalGLSurfaceView */
    public class a implements GLSurfaceView.Renderer, g.a, a.C0248a {

        /* renamed from: a  reason: collision with root package name */
        public final d f25802a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f25803b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        public final float[] f25804c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        public final float[] f25805d;

        /* renamed from: e  reason: collision with root package name */
        public final float[] f25806e;

        /* renamed from: f  reason: collision with root package name */
        public final float[] f25807f;

        /* renamed from: g  reason: collision with root package name */
        public float f25808g;

        /* renamed from: h  reason: collision with root package name */
        public float f25809h;

        /* renamed from: i  reason: collision with root package name */
        public final float[] f25810i;

        /* renamed from: r  reason: collision with root package name */
        public final float[] f25811r;

        public a(d dVar) {
            float[] fArr = new float[16];
            this.f25805d = fArr;
            float[] fArr2 = new float[16];
            this.f25806e = fArr2;
            float[] fArr3 = new float[16];
            this.f25807f = fArr3;
            this.f25810i = new float[16];
            this.f25811r = new float[16];
            this.f25802a = dVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f25809h = 3.1415927f;
        }

        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f25805d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f25809h = -f10;
            b();
        }

        public final void b() {
            Matrix.setRotateM(this.f25806e, 0, -this.f25808g, (float) Math.cos((double) this.f25809h), (float) Math.sin((double) this.f25809h), 0.0f);
        }

        /* JADX INFO: finally extract failed */
        public void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long d10;
            float[] fArr2;
            synchronized (this) {
                Matrix.multiplyMM(this.f25811r, 0, this.f25805d, 0, this.f25807f, 0);
                Matrix.multiplyMM(this.f25810i, 0, this.f25806e, 0, this.f25811r, 0);
            }
            Matrix.multiplyMM(this.f25804c, 0, this.f25803b, 0, this.f25810i, 0);
            d dVar = this.f25802a;
            float[] fArr3 = this.f25804c;
            dVar.getClass();
            GLES20.glClear(16384);
            i.c();
            if (dVar.f25777a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = dVar.f25786j;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                i.c();
                if (dVar.f25778b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(dVar.f25783g, 0);
                }
                long timestamp = dVar.f25786j.getTimestamp();
                a0<Long> a0Var = dVar.f25781e;
                synchronized (a0Var) {
                    try {
                        d10 = a0Var.d(timestamp, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Long l10 = d10;
                if (l10 != null) {
                    c cVar = dVar.f25780d;
                    float[] fArr4 = dVar.f25783g;
                    float[] fArr5 = (float[]) cVar.f27858c.e(l10.longValue());
                    if (fArr5 != null) {
                        float[] fArr6 = (float[]) cVar.f27857b;
                        float f10 = fArr5[0];
                        float f11 = -fArr5[1];
                        float f12 = -fArr5[2];
                        float length = Matrix.length(f10, f11, f12);
                        if (length != 0.0f) {
                            fArr2 = fArr4;
                            Matrix.setRotateM(fArr6, 0, (float) Math.toDegrees((double) length), f10 / length, f11 / length, f12 / length);
                        } else {
                            fArr2 = fArr4;
                            Matrix.setIdentityM(fArr6, 0);
                        }
                        if (!cVar.f27859d) {
                            c.a((float[]) cVar.f27856a, (float[]) cVar.f27857b);
                            cVar.f27859d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, (float[]) cVar.f27856a, 0, (float[]) cVar.f27857b, 0);
                    }
                }
                d e10 = dVar.f25782f.e(timestamp);
                if (e10 != null) {
                    b bVar = dVar.f25779c;
                    bVar.getClass();
                    if (b.a(e10)) {
                        bVar.f25763a = e10.f27862c;
                        b.a aVar = new b.a(e10.f27860a.f27864a[0]);
                        bVar.f25764b = aVar;
                        if (!e10.f27863d) {
                            aVar = new b.a(e10.f27861b.f27864a[0]);
                        }
                        bVar.f25765c = aVar;
                    }
                }
            }
            Matrix.multiplyMM(dVar.f25784h, 0, fArr3, 0, dVar.f25783g, 0);
            b bVar2 = dVar.f25779c;
            int i10 = dVar.f25785i;
            float[] fArr7 = dVar.f25784h;
            b.a aVar2 = bVar2.f25764b;
            if (aVar2 != null) {
                GLES20.glUseProgram(bVar2.f25766d);
                i.c();
                GLES20.glEnableVertexAttribArray(bVar2.f25769g);
                GLES20.glEnableVertexAttribArray(bVar2.f25770h);
                i.c();
                int i11 = bVar2.f25763a;
                if (i11 == 1) {
                    fArr = b.f25759m;
                } else if (i11 == 2) {
                    fArr = b.f25761o;
                } else {
                    fArr = b.f25758l;
                }
                GLES20.glUniformMatrix3fv(bVar2.f25768f, 1, false, fArr, 0);
                GLES20.glUniformMatrix4fv(bVar2.f25767e, 1, false, fArr7, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i10);
                GLES20.glUniform1i(bVar2.f25771i, 0);
                i.c();
                GLES20.glVertexAttribPointer(bVar2.f25769g, 3, 5126, false, 12, aVar2.f25773b);
                i.c();
                GLES20.glVertexAttribPointer(bVar2.f25770h, 2, 5126, false, 8, aVar2.f25774c);
                i.c();
                GLES20.glDrawArrays(aVar2.f25775d, 0, aVar2.f25772a);
                i.c();
                GLES20.glDisableVertexAttribArray(bVar2.f25769g);
                GLES20.glDisableVertexAttribArray(bVar2.f25770h);
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            float f10;
            boolean z10 = false;
            GLES20.glViewport(0, 0, i10, i11);
            float f11 = ((float) i10) / ((float) i11);
            if (f11 > 1.0f) {
                z10 = true;
            }
            if (z10) {
                double tan = Math.tan(Math.toRadians(45.0d));
                double d10 = (double) f11;
                Double.isNaN(d10);
                Double.isNaN(d10);
                f10 = (float) (Math.toDegrees(Math.atan(tan / d10)) * 2.0d);
            } else {
                f10 = 90.0f;
            }
            Matrix.perspectiveM(this.f25803b, 0, f10, f11, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            f fVar = f.this;
            fVar.f25793d.post(new c1.b(fVar, this.f25802a.d()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, (AttributeSet) null);
        Sensor sensor = null;
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f25790a = sensorManager;
        sensor = e0.f26436a >= 18 ? sensorManager.getDefaultSensor(15) : sensor;
        this.f25791b = sensor == null ? sensorManager.getDefaultSensor(11) : sensor;
        d dVar = new d();
        this.f25795f = dVar;
        a aVar = new a(dVar);
        g gVar = new g(context, aVar, 25.0f);
        this.f25794e = gVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f25792c = new a(windowManager.getDefaultDisplay(), gVar, aVar);
        this.f25799r = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(gVar);
    }

    public final void a() {
        boolean z10 = this.f25799r && this.f25800s;
        Sensor sensor = this.f25791b;
        if (sensor != null && z10 != this.f25801t) {
            if (z10) {
                this.f25790a.registerListener(this.f25792c, sensor, 0);
            } else {
                this.f25790a.unregisterListener(this.f25792c);
            }
            this.f25801t = z10;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25793d.post(new androidx.activity.c(this));
    }

    public void onPause() {
        this.f25800s = false;
        a();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f25800s = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f25795f.f25787k = i10;
    }

    public void setSingleTapListener(e eVar) {
        this.f25794e.f25819g = eVar;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f25799r = z10;
        a();
    }

    public void setVideoComponent(r0.d dVar) {
        r0.d dVar2 = this.f25798i;
        if (dVar != dVar2) {
            if (dVar2 != null) {
                Surface surface = this.f25797h;
                if (surface != null) {
                    ((a1) dVar2).J(surface);
                }
                r0.d dVar3 = this.f25798i;
                d dVar4 = this.f25795f;
                a1 a1Var = (a1) dVar3;
                a1Var.Y();
                if (a1Var.D == dVar4) {
                    a1Var.P(2, 6, (Object) null);
                }
                r0.d dVar5 = this.f25798i;
                d dVar6 = this.f25795f;
                a1 a1Var2 = (a1) dVar5;
                a1Var2.Y();
                if (a1Var2.E == dVar6) {
                    a1Var2.P(6, 7, (Object) null);
                }
            }
            this.f25798i = dVar;
            if (dVar != null) {
                d dVar7 = this.f25795f;
                a1 a1Var3 = (a1) dVar;
                a1Var3.Y();
                a1Var3.D = dVar7;
                a1Var3.P(2, 6, dVar7);
                r0.d dVar8 = this.f25798i;
                d dVar9 = this.f25795f;
                a1 a1Var4 = (a1) dVar8;
                a1Var4.Y();
                a1Var4.E = dVar9;
                a1Var4.P(6, 7, dVar9);
                ((a1) this.f25798i).R(this.f25797h);
            }
        }
    }
}
