package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.o;
import e.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class i4 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6915a = Log.isLoggable("Volley", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final String f6916b = i4.class.getName();

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f6917c = i4.f6915a;

        /* renamed from: a  reason: collision with root package name */
        public final List<b5> f6918a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f6919b = false;

        public final synchronized void a(String str, long j10) {
            if (!this.f6919b) {
                this.f6918a.add(new b5(str, j10, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public final synchronized void b(String str) {
            long j10;
            this.f6919b = true;
            if (this.f6918a.size() == 0) {
                j10 = 0;
            } else {
                long j11 = this.f6918a.get(0).f5990c;
                List<b5> list = this.f6918a;
                j10 = list.get(list.size() - 1).f5990c - j11;
            }
            if (j10 > 0) {
                long j12 = this.f6918a.get(0).f5990c;
                i4.a("(%-4d ms) %s", Long.valueOf(j10), str);
                for (b5 next : this.f6918a) {
                    long j13 = next.f5990c;
                    i4.a("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(next.f5989b), next.f5988a);
                    j12 = j13;
                }
            }
        }

        public final void finalize() throws Throwable {
            if (!this.f6919b) {
                b("Request on the loose");
                i4.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f6915a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i10].getClassName().equals(f6916b)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                str2 = g.a(o.a(methodName, o.a(substring2, 1)), substring2, ".", methodName);
                break;
            } else {
                i10++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
