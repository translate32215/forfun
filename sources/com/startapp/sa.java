package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Sta */
public class sa {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11705a;

    /* renamed from: b  reason: collision with root package name */
    public final r3 f11706b;

    /* renamed from: c  reason: collision with root package name */
    public final e f11707c;

    /* renamed from: d  reason: collision with root package name */
    public final e2 f11708d;

    /* renamed from: e  reason: collision with root package name */
    public final d3<TelephonyMetadata> f11709e;

    /* renamed from: f  reason: collision with root package name */
    public c f11710f;

    /* renamed from: g  reason: collision with root package name */
    public final double f11711g = Math.random();

    /* renamed from: h  reason: collision with root package name */
    public volatile String f11712h = "e106";

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            sa saVar = sa.this;
            saVar.getClass();
            try {
                if (saVar.a() != null) {
                    c a10 = saVar.a((Class<?>) SignalStrength.class);
                    if (a10 != null) {
                        a10.a();
                    }
                }
            } catch (Throwable th) {
                if (saVar.a(8)) {
                    i4.a(th);
                }
            }
        }
    }

    /* compiled from: Sta */
    public class b extends c {

        /* renamed from: d  reason: collision with root package name */
        public final TelephonyCallback f11714d = new a();

        /* compiled from: Sta */
        public class a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {
            public a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                b.this.a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                sa.this.a(signalStrength);
                b.this.a(SignalStrength.class, signalStrength);
            }
        }

        public b(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        public void a() {
            this.f11717a.registerTelephonyCallback(sa.this.f11706b, this.f11714d);
        }

        public void b() {
            this.f11717a.unregisterTelephonyCallback(this.f11714d);
        }
    }

    /* compiled from: Sta */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final TelephonyManager f11717a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f11718b;

        public c(TelephonyManager telephonyManager, Class<?> cls) {
            this.f11717a = telephonyManager;
            this.f11718b = cls;
        }

        public abstract void a();

        public <T> void a(Class<T> cls, T t10) {
            sa saVar = sa.this;
            saVar.getClass();
            try {
                TelephonyMetadata a10 = saVar.a();
                if (a10 != null) {
                    if (t10 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String simpleName = cls.getSimpleName();
                        if (a10.a(simpleName).c()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timestamp", currentTimeMillis);
                            jSONObject.put("type", simpleName);
                            jSONObject.put("data", t10.toString());
                            String c10 = wb.c(jSONObject.toString());
                            e.a a11 = saVar.f11707c.edit();
                            a11.a(simpleName, c10);
                            a11.f12335a.putString(simpleName, c10);
                            a11.apply();
                        }
                    }
                }
            } catch (Throwable th) {
                if (saVar.a(2)) {
                    i4.a(th);
                }
            }
            if (cls.equals(this.f11718b)) {
                try {
                    b();
                } catch (Throwable th2) {
                    if (sa.this.a(16)) {
                        i4.a(th2);
                    }
                }
            }
        }

        public abstract void b();
    }

    /* compiled from: Sta */
    public class d extends c {

        /* renamed from: d  reason: collision with root package name */
        public final PhoneStateListener f11720d = new a();

        /* compiled from: Sta */
        public class a extends PhoneStateListener {
            public a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                d.this.a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                sa.this.a(signalStrength);
                d.this.a(SignalStrength.class, signalStrength);
            }
        }

        public d(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        public void a() {
            this.f11717a.listen(this.f11720d, 257);
        }

        public void b() {
            this.f11717a.listen(this.f11720d, 0);
        }
    }

    public sa(Context context, r3 r3Var, e eVar, e2 e2Var, d3<TelephonyMetadata> d3Var) {
        this.f11705a = context;
        this.f11706b = r3Var;
        this.f11707c = eVar;
        this.f11708d = e2Var;
        this.f11709e = d3Var;
    }

    public final c a(Class<?> cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f11705a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return new d(telephonyManager, cls);
        }
        return new b(telephonyManager, cls);
    }

    public void b() {
        this.f11706b.execute(new a());
    }

    public final TelephonyMetadata a() {
        TelephonyMetadata call;
        if (!this.f11708d.c() || (call = this.f11709e.call()) == null || !call.c()) {
            return null;
        }
        return call;
    }

    public boolean a(int i10) {
        TelephonyMetadata a10 = a();
        if (a10 == null || this.f11711g >= a10.b() || (a10.a() & i10) != i10) {
            return false;
        }
        return true;
    }

    public void a(SignalStrength signalStrength) {
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f11712h = String.valueOf(signalStrength.getLevel());
                } else {
                    this.f11712h = String.valueOf(SignalStrength.class.getMethod("getLevel", new Class[0]).invoke(signalStrength, new Object[0]));
                }
            } catch (NoSuchMethodException unused) {
                this.f11712h = "e104";
            } catch (Throwable unused2) {
                this.f11712h = "e105";
            }
        }
    }

    public Map<String, String> a(j4 j4Var) {
        List<String> a10;
        TelephonyMetadata a11 = a();
        if (a11 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = null;
        for (Map.Entry next : this.f11707c.getAll().entrySet()) {
            Object value = next.getValue();
            if (value instanceof String) {
                String str = (String) next.getKey();
                TelephonyDataConfig a12 = a11.a(str);
                if (a12.c() && (a10 = a12.a()) != null && a10.contains(j4Var.f10602a)) {
                    String b10 = a12.b();
                    if (b10 != null) {
                        str = b10;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
