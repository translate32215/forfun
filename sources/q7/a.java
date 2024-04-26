package q7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f24215c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d  reason: collision with root package name */
    public static a f24216d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f24217a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f24218b;

    public a(Context context) {
        this.f24218b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        if (context != null) {
            Lock lock = f24215c;
            ((ReentrantLock) lock).lock();
            try {
                if (f24216d == null) {
                    f24216d = new a(context.getApplicationContext());
                }
                a aVar = f24216d;
                ((ReentrantLock) lock).unlock();
                return aVar;
            } catch (Throwable th) {
                ((ReentrantLock) f24215c).unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public GoogleSignInAccount b() {
        String c10 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c10)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 20);
        sb2.append("googleSignInAccount");
        sb2.append(":");
        sb2.append(c10);
        String c11 = c(sb2.toString());
        if (c11 == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.j(c11);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f24217a.lock();
        try {
            return this.f24218b.getString(str, (String) null);
        } finally {
            this.f24217a.unlock();
        }
    }
}
