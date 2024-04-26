package v6;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import t.f;

/* compiled from: Log */
public final class p {
    @Pure
    public static String a(String str, Throwable th) {
        String c10 = c(th);
        if (TextUtils.isEmpty(c10)) {
            return str;
        }
        StringBuilder a10 = f.a(str, "\n  ");
        a10.append(c10.replace("\n", "\n  "));
        a10.append(10);
        return a10.toString();
    }

    @Pure
    public static void b(String str, String str2, Throwable th) {
        Log.e(str, a(str2, th));
    }

    @Pure
    public static String c(Throwable th) {
        boolean z10;
        if (th == null) {
            return null;
        }
        Throwable th2 = th;
        while (true) {
            if (th2 == null) {
                z10 = false;
                break;
            } else if (th2 instanceof UnknownHostException) {
                z10 = true;
                break;
            } else {
                th2 = th2.getCause();
            }
        }
        if (z10) {
            return "UnknownHostException (no network)";
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    public static void d(String str, String str2, Throwable th) {
        Log.w(str, a(str2, th));
    }
}
