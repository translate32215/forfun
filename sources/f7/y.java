package f7;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.ap;
import e8.b1;
import e8.f9;
import e8.n40;
import e8.t;
import e8.ti0;
import java.util.concurrent.Callable;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            e.C("Unexpected exception.", th);
            synchronized (a5.f5933f) {
                if (a5.f5934g == null) {
                    if (((Boolean) b1.f13866e.b()).booleanValue()) {
                        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16577f4)).booleanValue()) {
                            a5.f5934g = new a5(context, f9.i());
                        }
                    }
                    a5.f5934g = new ap(1);
                }
                a5.f5934g.c(th, "StrictModeUtil.runWithLaxStrictMode");
                return null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static <T> T b(n40<T> n40) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T t10 = n40.get();
            StrictMode.setThreadPolicy(threadPolicy);
            return t10;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
