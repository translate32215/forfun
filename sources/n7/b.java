package n7;

import android.content.Context;
import b2.t;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfu;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f22345a;

    /* renamed from: b  reason: collision with root package name */
    public final h f22346b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f22347c;

    /* renamed from: d  reason: collision with root package name */
    public t f22348d;

    /* renamed from: e  reason: collision with root package name */
    public c f22349e;

    public b(h hVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        String str;
        if (context != null) {
            this.f22345a = uncaughtExceptionHandler;
            this.f22346b = hVar;
            this.f22348d = new t(context, new ArrayList());
            this.f22347c = context.getApplicationContext();
            if (uncaughtExceptionHandler == null) {
                str = "null";
            } else {
                str = uncaughtExceptionHandler.getClass().getName();
            }
            zzfc.zzd("ExceptionReporter created, original handler is ".concat(str));
            return;
        }
        throw new NullPointerException("context cannot be null");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        int length;
        int length2;
        if (this.f22348d != null) {
            StackTraceElement stackTraceElement = null;
            String name = thread != null ? thread.getName() : null;
            t tVar = this.f22348d;
            tVar.getClass();
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            Throwable th3 = th;
            while (th3.getCause() != null) {
                th3 = th3.getCause();
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            if (stackTrace != null && (length2 = stackTrace.length) != 0) {
                int i10 = 0;
                loop2:
                while (true) {
                    if (i10 >= length2) {
                        stackTraceElement = stackTrace[0];
                        break;
                    }
                    StackTraceElement stackTraceElement2 = stackTrace[i10];
                    String className = stackTraceElement2.getClassName();
                    Iterator it = ((TreeSet) tVar.f3445b).iterator();
                    while (it.hasNext()) {
                        if (className.startsWith((String) it.next())) {
                            stackTraceElement = stackTraceElement2;
                            break loop2;
                        }
                    }
                    i10++;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.getClass().getSimpleName());
            if (stackTraceElement != null) {
                String[] split = stackTraceElement.getClassName().split("\\.");
                sb2.append(String.format(" (@%s:%s:%s)", new Object[]{(split == null || (length = split.length) <= 0) ? "unknown" : split[length - 1], stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
            }
            if (name != null) {
                sb2.append(String.format(" {%s}", new Object[]{name}));
            }
            str = sb2.toString();
        } else {
            str = "UncaughtException";
        }
        zzfc.zzd("Reporting uncaught exception: ".concat(String.valueOf(str)));
        h hVar = this.f22346b;
        d dVar = new d();
        dVar.f22355a.put("&exd", str);
        dVar.f22355a.put("&exf", zzfu.zzc(true));
        hVar.i(dVar.a());
        if (this.f22349e == null) {
            this.f22349e = zzbx.zzg(this.f22347c).zzc();
        }
        c cVar = this.f22349e;
        cVar.f22368d.zzf().zzc();
        cVar.f22368d.zzf().zzn();
        if (this.f22345a != null) {
            zzfc.zzd("Passing exception to the original handler");
            this.f22345a.uncaughtException(thread, th);
        }
    }
}
