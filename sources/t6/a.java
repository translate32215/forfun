package t6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import x6.c;

/* compiled from: OrientationListener */
public final class a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f25749a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f25750b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f25751c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f25752d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    public final Display f25753e;

    /* renamed from: f  reason: collision with root package name */
    public final C0248a[] f25754f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25755g;

    /* renamed from: t6.a$a  reason: collision with other inner class name */
    /* compiled from: OrientationListener */
    public interface C0248a {
        void a(float[] fArr, float f10);
    }

    public a(Display display, C0248a... aVarArr) {
        this.f25753e = display;
        this.f25754f = aVarArr;
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f25749a, sensorEvent.values);
        float[] fArr = this.f25749a;
        int rotation = this.f25753e.getRotation();
        if (rotation != 0) {
            int i10 = 129;
            int i11 = 130;
            if (rotation == 1) {
                i10 = 2;
                i11 = 129;
            } else if (rotation != 2) {
                if (rotation == 3) {
                    i10 = 130;
                    i11 = 1;
                } else {
                    throw new IllegalStateException();
                }
            }
            float[] fArr2 = this.f25750b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f25750b, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f25749a, 1, 131, this.f25750b);
        SensorManager.getOrientation(this.f25750b, this.f25752d);
        float f10 = this.f25752d[2];
        Matrix.rotateM(this.f25749a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f25749a;
        if (!this.f25755g) {
            c.a(this.f25751c, fArr3);
            this.f25755g = true;
        }
        float[] fArr4 = this.f25750b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f25750b, 0, this.f25751c, 0);
        float[] fArr5 = this.f25749a;
        for (C0248a a10 : this.f25754f) {
            a10.a(fArr5, f10);
        }
    }
}
