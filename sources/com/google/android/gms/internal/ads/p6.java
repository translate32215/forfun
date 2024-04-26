package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.gf0;
import e8.l;
import e8.m8;
import e8.t;
import e8.ti0;
import e8.wy;
import e8.y8;
import f7.f0;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p6 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<ExecutorService> f7810a = new AtomicReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final Object f7811b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c  reason: collision with root package name */
    public String f7812c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d  reason: collision with root package name */
    public String f7813d = null;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f7814e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f7815f = new AtomicInteger(-1);

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<Object> f7816g = new AtomicReference<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Object> f7817h = new AtomicReference<>((Object) null);

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentMap<String, Method> f7818i = new ConcurrentHashMap(9);

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReference<y7> f7819j = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")

    /* renamed from: k  reason: collision with root package name */
    public final BlockingQueue<FutureTask<?>> f7820k = new ArrayBlockingQueue(20);

    /* renamed from: l  reason: collision with root package name */
    public final Object f7821l = new Object();

    public static boolean g(Context context) {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.Y)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) ti0.f16763j.f16769f.a(t.Z)).intValue()) {
            return false;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16543a0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final Object a(String str, Context context) {
        if (!f(context, "com.google.android.gms.measurement.AppMeasurement", this.f7816g, true)) {
            return null;
        }
        try {
            return n(context, str).invoke(this.f7816g.get(), new Object[0]);
        } catch (Exception unused) {
            m(str, true);
            return null;
        }
    }

    public final void b(Context context, String str, String str2) {
        if (f(context, "com.google.android.gms.measurement.AppMeasurement", this.f7816g, true)) {
            Method method = (Method) this.f7818i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f7818i.put(str2, method);
                } catch (Exception unused) {
                    m(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f7816g.get(), new Object[]{str});
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                e.H(sb2.toString());
            } catch (Exception unused2) {
                m(str2, false);
            }
        }
    }

    public final void c(Context context, String str, String str2, Bundle bundle) {
        if (p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String valueOf = String.valueOf(str2);
                e.C(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (g(context)) {
                e("logEventInternal", new gf0(str, bundle2));
            } else if (f(context, "com.google.android.gms.measurement.AppMeasurement", this.f7816g, true)) {
                Class<String> cls = String.class;
                Method method = (Method) this.f7818i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f7818i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f7816g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m("logEventInternal", true);
                }
            }
        }
    }

    public final void d(Context context, String str, String str2, String str3, int i10) {
        if (p(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            c(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(o.a(str3, 75));
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i10);
            e.H(sb2.toString());
        }
    }

    public final void e(String str, q6 q6Var) {
        synchronized (this.f7819j) {
            FutureTask futureTask = new FutureTask(new f0(this, q6Var, str), (Object) null);
            if (this.f7819j.get() != null) {
                futureTask.run();
            } else {
                this.f7820k.offer(futureTask);
            }
        }
    }

    public final boolean f(Context context, String str, AtomicReference<Object> atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final String h(Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.f7811b) {
            String str = this.f7812c;
            if (str != null) {
                return str;
            }
            if (g(context)) {
                String str2 = this.f7812c;
                synchronized (this.f7819j) {
                    if (this.f7819j.get() != null) {
                        try {
                            str2 = this.f7819j.get().y1();
                        } catch (Exception unused) {
                            m("getGmpAppId", false);
                        }
                    }
                }
                this.f7812c = str2;
            } else {
                this.f7812c = (String) a("getGmpAppId", context);
            }
            String str3 = this.f7812c;
            return str3;
        }
    }

    public final String i(Context context) {
        if (!p(context)) {
            return null;
        }
        long longValue = ((Long) ti0.f16763j.f16769f.a(t.W)).longValue();
        if (g(context)) {
            if (longValue >= 0) {
                return (String) o().submit(new wy(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                synchronized (this.f7819j) {
                    if (this.f7819j.get() != null) {
                        try {
                            String I3 = this.f7819j.get().I3();
                            return I3;
                        } catch (Exception unused) {
                            m("getAppInstanceId", false);
                            return null;
                        }
                    }
                }
            } catch (TimeoutException unused2) {
                return "TIME_OUT";
            } catch (Exception unused3) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        } else {
            try {
                return (String) o().submit(new q(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused4) {
                return "TIME_OUT";
            } catch (Exception unused5) {
                return null;
            }
        }
    }

    public final String j(Context context) {
        Long l10;
        if (!p(context)) {
            return null;
        }
        if (g(context)) {
            synchronized (this.f7819j) {
                if (this.f7819j.get() != null) {
                    try {
                        l10 = Long.valueOf(this.f7819j.get().v4());
                    } catch (Exception unused) {
                        m("getAdEventId", false);
                    }
                }
                l10 = null;
            }
            if (l10 != null) {
                return Long.toString(l10.longValue());
            }
            return null;
        }
        Object a10 = a("generateEventId", context);
        if (a10 != null) {
            return a10.toString();
        }
        return null;
    }

    public final void k(Context context, String str) {
        c(context, "_ac", str, (Bundle) null);
    }

    public final void l(Context context, String str) {
        c(context, "_ai", str, (Bundle) null);
    }

    public final void m(String str, boolean z10) {
        if (!this.f7814e.get()) {
            StringBuilder sb2 = new StringBuilder(o.a(str, 30));
            sb2.append("Invoke Firebase method ");
            sb2.append(str);
            sb2.append(" error.");
            e.K(sb2.toString());
            if (z10) {
                e.K("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f7814e.set(true);
            }
        }
    }

    public final Method n(Context context, String str) {
        Method method = (Method) this.f7818i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f7818i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m(str, false);
            return null;
        }
    }

    public final ExecutorService o() {
        if (this.f7810a.get() == null) {
            l lVar = t.X;
            this.f7810a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) ti0.f16763j.f16769f.a(lVar)).intValue(), ((Integer) ti0.f16763j.f16769f.a(lVar)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new m8(0)));
        }
        return this.f7810a.get();
    }

    public final boolean p(Context context) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.R)).booleanValue() && !this.f7814e.get()) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16549b0)).booleanValue()) {
                return true;
            }
            if (this.f7815f.get() == -1) {
                y8 y8Var = ti0.f16763j.f16764a;
                if (!y8.j(context, 12451000)) {
                    y8 y8Var2 = ti0.f16763j.f16764a;
                    if (y8.e(context)) {
                        e.K("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f7815f.set(0);
                    }
                }
                this.f7815f.set(1);
            }
            if (this.f7815f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
