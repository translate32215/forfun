package ab;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import e8.qz;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f251b;

    /* renamed from: c  reason: collision with root package name */
    public final String f252c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f253d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f254e;

    public x(SharedPreferences sharedPreferences, String str, Executor executor) {
        this.f250a = sharedPreferences;
        this.f251b = "topic_operation_queue";
        this.f252c = ",";
        this.f254e = executor;
    }

    public static x b(SharedPreferences sharedPreferences, String str, Executor executor) {
        x xVar = new x(sharedPreferences, "topic_operation_queue", executor);
        synchronized (xVar.f253d) {
            xVar.f253d.clear();
            String string = xVar.f250a.getString(xVar.f251b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(xVar.f252c)) {
                    if (r0 == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str2 : string.split(xVar.f252c, -1)) {
                        if (!TextUtils.isEmpty(str2)) {
                            xVar.f253d.add(str2);
                        }
                    }
                }
            }
        }
        return xVar;
    }

    public boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f252c)) {
            return false;
        }
        synchronized (this.f253d) {
            add = this.f253d.add(str);
            if (add) {
                this.f254e.execute(new qz(this));
            }
        }
        return add;
    }
}
