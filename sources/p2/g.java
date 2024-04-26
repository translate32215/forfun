package p2;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Preferences */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public Context f23789a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f23790b;

    public g(Context context) {
        this.f23789a = context;
    }

    public final SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (g.class) {
            if (this.f23790b == null) {
                this.f23790b = this.f23789a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f23790b;
        }
        return sharedPreferences;
    }
}
