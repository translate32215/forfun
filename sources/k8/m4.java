package k8;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import e.a;
import e.i;
import javax.annotation.Nullable;
import m3.t;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class m4 implements k4 {

    /* renamed from: c  reason: collision with root package name */
    public static m4 f20322c;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Context f20323a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f20324b;

    public m4() {
        this.f20323a = null;
        this.f20324b = null;
    }

    public m4(Context context) {
        this.f20323a = context;
        l4 l4Var = new l4();
        this.f20324b = l4Var;
        context.getContentResolver().registerContentObserver(d4.f20108a, true, l4Var);
    }

    public static m4 b(Context context) {
        m4 m4Var;
        m4 m4Var2;
        synchronized (m4.class) {
            if (f20322c == null) {
                if (i.d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    m4Var2 = new m4(context);
                } else {
                    m4Var2 = new m4();
                }
                f20322c = m4Var2;
            }
            m4Var = f20322c;
        }
        return m4Var;
    }

    /* renamed from: c */
    public final String a(String str) {
        if (this.f20323a == null) {
            return null;
        }
        try {
            return (String) a.g(new t(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }
}
