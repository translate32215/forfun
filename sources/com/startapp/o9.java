package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: Sta */
public class o9 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, b> f11529a = null;

    /* renamed from: b  reason: collision with root package name */
    public n9 f11530b = new n9();

    /* renamed from: c  reason: collision with root package name */
    public SensorManager f11531c;

    /* renamed from: d  reason: collision with root package name */
    public v7 f11532d;

    /* renamed from: e  reason: collision with root package name */
    public int f11533e;

    /* renamed from: f  reason: collision with root package name */
    public SensorEventListener f11534f = new a();

    /* compiled from: Sta */
    public class a implements SensorEventListener {
        public a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int size;
            JSONArray jSONArray;
            n9 n9Var = o9.this.f11530b;
            synchronized (n9Var) {
                int type = sensorEvent.sensor.getType();
                SensorEvent sensorEvent2 = n9Var.f10908a.get(Integer.valueOf(type));
                if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                    n9Var.f10908a.put(Integer.valueOf(type), sensorEvent);
                }
                size = n9Var.f10908a.size();
            }
            o9 o9Var = o9.this;
            if (size == o9Var.f11533e) {
                o9Var.f11531c.unregisterListener(o9Var.f11534f);
                o9 o9Var2 = o9.this;
                v7 v7Var = o9Var2.f11532d;
                if (v7Var != null) {
                    try {
                        jSONArray = o9Var2.f11530b.a();
                    } catch (Exception unused) {
                        jSONArray = null;
                    }
                    v7Var.a(jSONArray);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11536a;

        /* renamed from: b  reason: collision with root package name */
        public int f11537b;

        public b(o9 o9Var, int i10, int i11) {
            this.f11536a = i10;
            this.f11537b = i11;
        }
    }

    public o9(Context context, v7 v7Var) {
        this.f11531c = (SensorManager) context.getSystemService("sensor");
        this.f11532d = v7Var;
        this.f11533e = 0;
        a();
    }

    public final void a() {
        this.f11529a = new HashMap<>();
        SensorsConfig G = MetaData.f12393k.G();
        a(13, G.a());
        a(9, G.b());
        a(5, G.d());
        a(10, G.e());
        a(2, G.f());
        a(6, G.g());
        a(12, G.i());
        a(11, G.j());
        a(16, G.c());
    }

    public void b() {
        Sensor defaultSensor;
        for (Integer intValue : this.f11529a.keySet()) {
            int intValue2 = intValue.intValue();
            b bVar = this.f11529a.get(Integer.valueOf(intValue2));
            if (Build.VERSION.SDK_INT >= bVar.f11536a && (defaultSensor = this.f11531c.getDefaultSensor(intValue2)) != null) {
                this.f11531c.registerListener(this.f11534f, defaultSensor, bVar.f11537b);
                this.f11533e++;
            }
        }
    }

    public final void a(int i10, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f11529a.put(Integer.valueOf(i10), new b(this, baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
