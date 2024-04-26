package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import o8.a3;
import o8.b3;
import o8.c4;
import o8.z2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class h extends c4 {

    /* renamed from: c  reason: collision with root package name */
    public char f8794c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f8795d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f8796e;

    /* renamed from: f  reason: collision with root package name */
    public final a3 f8797f = new a3(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final a3 f8798g = new a3(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final a3 f8799h = new a3(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final a3 f8800i = new a3(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final a3 f8801j = new a3(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    public final a3 f8802k = new a3(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final a3 f8803l = new a3(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final a3 f8804m = new a3(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    public final a3 f8805n = new a3(this, 2, false, false);

    public h(l lVar) {
        super(lVar);
    }

    public static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new b3(str);
    }

    public static String u(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String v10 = v(z10, obj);
        String v11 = v(z10, obj2);
        String v12 = v(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v10)) {
            sb2.append(str2);
            sb2.append(v10);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(v11)) {
            sb2.append(str2);
            sb2.append(v11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(v12)) {
            sb2.append(str3);
            sb2.append(v12);
        }
        return sb2.toString();
    }

    public static String v(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb2 = new StringBuilder(str.length() + 43 + str.length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String y10 = y(l.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && y(className).equals(y10)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb3.toString();
            } else if (obj instanceof b3) {
                return ((b3) obj).f23123a;
            } else {
                if (z10) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final boolean j() {
        return false;
    }

    public final a3 o() {
        return this.f8804m;
    }

    public final a3 p() {
        return this.f8797f;
    }

    public final a3 q() {
        return this.f8805n;
    }

    public final a3 r() {
        return this.f8800i;
    }

    public final a3 s() {
        return this.f8802k;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String w() {
        String str;
        synchronized (this) {
            if (this.f8796e == null) {
                l lVar = this.f8864a;
                String str2 = lVar.f8840d;
                if (str2 != null) {
                    this.f8796e = str2;
                } else {
                    lVar.f8843g.f8864a.getClass();
                    this.f8796e = "FA";
                }
            }
            i.h(this.f8796e);
            str = this.f8796e;
        }
        return str;
    }

    public final void x(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(w(), i10)) {
            Log.println(i10, w(), u(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            if (str != null) {
                k kVar = this.f8864a.f8846j;
                if (kVar == null) {
                    Log.println(6, w(), "Scheduler not set. Not logging error/warn");
                } else if (!kVar.n()) {
                    Log.println(6, w(), "Scheduler not initialized. Not logging error/warn");
                } else {
                    kVar.r(new z2(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
                }
            } else {
                throw new NullPointerException("null reference");
            }
        }
    }
}
