package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.o;
import b8.c;
import e.g;
import e8.b1;
import e8.c9;
import e8.f9;
import e8.t;
import e8.t60;
import e8.ti0;
import e8.u6;
import e8.v6;
import e8.w6;
import e8.y8;
import f7.j0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a5 implements v6 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f5933f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static v6 f5934g;

    /* renamed from: h  reason: collision with root package name */
    public static v6 f5935h;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5936a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Context f5937b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<Thread, Boolean> f5938c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f5939d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    /* renamed from: e  reason: collision with root package name */
    public final f9 f5940e;

    public a5(Context context, f9 f9Var) {
        this.f5937b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5940e = f9Var;
    }

    public static v6 d(Context context, f9 f9Var) {
        synchronized (f5933f) {
            if (f5935h == null) {
                if (((Boolean) b1.f13866e.b()).booleanValue()) {
                    if (!((Boolean) ti0.f16763j.f16769f.a(t.f16577f4)).booleanValue()) {
                        a5 a5Var = new a5(context, f9Var);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (a5Var.f5936a) {
                                a5Var.f5938c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new w6(a5Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new u6(a5Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f5935h = a5Var;
                    }
                }
                f5935h = new ap(1);
            }
        }
        return f5935h;
    }

    public final void a(Throwable th, String str, float f10) {
        Throwable th2;
        boolean z10;
        String str2;
        float f11 = f10;
        Handler handler = y8.f17578b;
        int i10 = 0;
        if (((Boolean) b1.f13867f.b()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (y8.i(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z11) {
                    if (th2 == null) {
                        th2 = new Throwable(th4.getMessage());
                    } else {
                        th2 = new Throwable(th4.getMessage(), th2);
                    }
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            t60.f16708a.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            boolean z12 = Math.random() < ((double) f11);
            int i11 = f11 > 0.0f ? (int) (1.0f / f11) : 1;
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z10 = c.a(this.f5937b).c();
                } catch (Throwable th5) {
                    e.C("Error fetching instant app info", th5);
                    z10 = false;
                }
                try {
                    str2 = this.f5937b.getPackageName();
                } catch (Throwable unused) {
                    e.K("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = g.a(str4.length() + o.a(str3, 1), str3, " ", str4);
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f5940e.f14544a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", t.b())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "341976203").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(b1.f13864c.b()));
                if (((Boolean) ti0.f16763j.f16769f.a(t.N0)).booleanValue()) {
                    appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(s7.e.f25013b.a(this.f5937b))).appendQueryParameter("lite", this.f5940e.f14548e ? "1" : "0");
                }
                arrayList2.add(appendQueryParameter2.toString());
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    this.f5939d.execute(new j0(new c9(), (String) obj));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r4 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Throwable r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x003c
            r2 = r11
            r3 = 0
            r4 = 0
        L_0x0007:
            if (r2 == 0) goto L_0x0037
            java.lang.StackTraceElement[] r5 = r2.getStackTrace()
            int r6 = r5.length
            r7 = 0
        L_0x000f:
            if (r7 >= r6) goto L_0x0032
            r8 = r5[r7]
            java.lang.String r9 = r8.getClassName()
            boolean r9 = e8.y8.i(r9)
            if (r9 == 0) goto L_0x001e
            r3 = 1
        L_0x001e:
            java.lang.Class<com.google.android.gms.internal.ads.a5> r9 = com.google.android.gms.internal.ads.a5.class
            java.lang.String r9 = r9.getName()
            java.lang.String r8 = r8.getClassName()
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x002f
            r4 = 1
        L_0x002f:
            int r7 = r7 + 1
            goto L_0x000f
        L_0x0032:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x0007
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            if (r4 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0046
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = ""
            r10.a(r11, r1, r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a5.b(java.lang.Throwable):void");
    }

    public final void c(Throwable th, String str) {
        a(th, str, 1.0f);
    }
}
