package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import e8.fa;
import e8.ga;
import e8.ha;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j7 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f7125a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7126b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Display f7127c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f7128d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    public final float[] f7129e = new float[9];
    @GuardedBy("sensorThreadLock")

    /* renamed from: f  reason: collision with root package name */
    public float[] f7130f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f7131g;

    /* renamed from: h  reason: collision with root package name */
    public ha f7132h;

    public j7(Context context) {
        this.f7125a = (SensorManager) context.getSystemService("sensor");
        this.f7127c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.f7131g != null) {
            this.f7125a.unregisterListener(this);
            this.f7131g.post(new fa(0));
            this.f7131g = null;
        }
    }

    public final boolean b(float[] fArr) {
        synchronized (this.f7126b) {
            float[] fArr2 = this.f7130f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            return true;
        }
    }

    public final void c(int i10, int i11) {
        float[] fArr = this.f7129e;
        float f10 = fArr[i10];
        fArr[i10] = fArr[i11];
        fArr[i11] = f10;
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f7126b) {
                if (this.f7130f == null) {
                    this.f7130f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f7128d, fArr);
            int rotation = this.f7127c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f7128d, 2, 129, this.f7129e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f7128d, 129, 130, this.f7129e);
            } else if (rotation != 3) {
                System.arraycopy(this.f7128d, 0, this.f7129e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f7128d, 130, 1, this.f7129e);
            }
            c(1, 3);
            c(2, 6);
            c(5, 7);
            synchronized (this.f7126b) {
                System.arraycopy(this.f7129e, 0, this.f7130f, 0, 9);
            }
            ha haVar = this.f7132h;
            if (haVar != null) {
                ga gaVar = (ga) haVar;
                synchronized (gaVar.C) {
                    gaVar.C.notifyAll();
                }
            }
        }
    }
}
