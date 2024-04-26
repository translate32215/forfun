package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class i6 {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f10546j = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10547a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10548b;

    /* renamed from: c  reason: collision with root package name */
    public final d3<MotionMetadata> f10549c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10550d;

    /* renamed from: e  reason: collision with root package name */
    public k6 f10551e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10552f;

    /* renamed from: g  reason: collision with root package name */
    public int f10553g;

    /* renamed from: h  reason: collision with root package name */
    public Sensor f10554h;

    /* renamed from: i  reason: collision with root package name */
    public final SensorEventListener f10555i = new a();

    /* compiled from: Sta */
    public class a implements SensorEventListener {
        public a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                i6 i6Var = i6.this;
                k6 k6Var = i6Var.f10551e;
                if (k6Var != null) {
                    if (!(k6Var.f10795a.offer(sensorEvent))) {
                        i6Var.a(8, (Throwable) null);
                    }
                }
            } catch (OutOfMemoryError unused) {
                i6 i6Var2 = i6.this;
                i6Var2.getClass();
                i6Var2.e();
            } catch (Throwable th) {
                i4.a(th);
            }
        }
    }

    public i6(Context context, e eVar, d3<MotionMetadata> d3Var, Handler handler) {
        this.f10547a = context;
        this.f10548b = eVar;
        this.f10549c = d3Var;
        this.f10550d = handler;
    }

    public final MotionMetadata a() {
        MotionMetadata call = this.f10549c.call();
        if (call == null || !call.u()) {
            return null;
        }
        return call;
    }

    public double b() {
        MotionMetadata a10 = a();
        if (a10 == null) {
            return -1.0d;
        }
        k6 k6Var = this.f10551e;
        if (k6Var != null) {
            return Double.longBitsToDouble(k6Var.f10797c.get());
        }
        double d10 = (double) this.f10548b.getFloat("e9142de3c7cc5952", 0.0f);
        double a11 = w.a(System.currentTimeMillis(), this.f10548b.getLong("7783513af1730383", 0), a10.b(), a10.a(), a10.c(), xb.a(0.0d, a10.a(), a10.c()));
        Double.isNaN(d10);
        return d10 * a11;
    }

    public final void c() {
        if (this.f10551e != null) {
            e.a a10 = this.f10548b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f10551e.f10798d.get());
            a10.a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            a10.f12335a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j10 = this.f10551e.f10799e.get();
            a10.a("7783513af1730383", Long.valueOf(j10));
            a10.f12335a.putLong("7783513af1730383", j10);
            a10.apply();
            if (a(4)) {
                i4 i4Var = new i4(j4.f10587d);
                i4Var.f10537d = "MP.save";
                i4Var.f10538e = String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(b())});
                i4Var.a();
            }
        }
    }

    public final void d() {
        SensorManager sensorManager;
        MotionMetadata a10 = a();
        if (a10 != null && (sensorManager = (SensorManager) this.f10547a.getSystemService("sensor")) != null && this.f10554h == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            int min = Math.min(Math.max(10000, (int) (wb.e(a10.r()) * 1000)), 100000);
            if (defaultSensor != null && sensorManager.registerListener(this.f10555i, defaultSensor, min)) {
                this.f10554h = defaultSensor;
                double d10 = (double) this.f10548b.getFloat("e9142de3c7cc5952", 0.0f);
                long j10 = this.f10548b.getLong("7783513af1730383", 0);
                k6 k6Var = this.f10551e;
                if (k6Var != null) {
                    k6Var.interrupt();
                    this.f10551e = null;
                }
                if (this.f10551e == null) {
                    StringBuilder a11 = b1.a("startapp-mp-");
                    a11.append(f10546j.incrementAndGet());
                    k6 k6Var2 = new k6(a11.toString(), this.f10547a, a10, a10.q(), d10, j10);
                    this.f10551e = k6Var2;
                    k6Var2.start();
                }
                if (a(1)) {
                    i4 i4Var = new i4(j4.f10587d);
                    i4Var.f10537d = "MP.start";
                    i4Var.f10538e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
                    i4Var.a();
                }
            }
        }
    }

    public final void e() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f10547a.getSystemService("sensor");
        if (sensorManager != null && (sensor = this.f10554h) != null) {
            sensorManager.unregisterListener(this.f10555i, sensor);
            this.f10554h = null;
            c();
            k6 k6Var = this.f10551e;
            if (k6Var != null) {
                k6Var.interrupt();
                this.f10551e = null;
            }
            if (a(2)) {
                i4 i4Var = new i4(j4.f10587d);
                i4Var.f10537d = "MP.stop";
                i4Var.a();
            }
        }
    }

    public final boolean a(int i10) {
        MotionMetadata a10;
        if (!this.f10552f || (a10 = a()) == null || (i10 & a10.j()) == 0) {
            return false;
        }
        return true;
    }

    public final void a(int i10, Throwable th) {
        if (a(i10)) {
            int i11 = this.f10553g;
            if (!((i11 & i10) != 0)) {
                this.f10553g = i11 | i10;
                if (th != null) {
                    i4.a(th);
                    return;
                }
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "MP";
                i4Var.f10538e = String.valueOf(i10);
                i4Var.a();
            }
        }
    }
}
