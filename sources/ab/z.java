package ab;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class z {

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<z> f259d;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f260a;

    /* renamed from: b  reason: collision with root package name */
    public x f261b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f262c;

    public z(SharedPreferences sharedPreferences, Executor executor) {
        this.f262c = executor;
        this.f260a = sharedPreferences;
    }

    public synchronized y a() {
        String peek;
        y yVar;
        x xVar = this.f261b;
        synchronized (xVar.f253d) {
            peek = xVar.f253d.peek();
        }
        Pattern pattern = y.f255d;
        yVar = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                yVar = new y(split[0], split[1]);
            }
        }
        return yVar;
    }
}
