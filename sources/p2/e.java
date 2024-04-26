package p2;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: IdGenerator */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23785a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f23786b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23787c;

    public e(Context context) {
        this.f23785a = context;
    }

    public final void a() {
        if (!this.f23787c) {
            this.f23786b = this.f23785a.getSharedPreferences("androidx.work.util.id", 0);
            this.f23787c = true;
        }
    }

    public final int b(String str) {
        int i10 = 0;
        int i11 = this.f23786b.getInt(str, 0);
        if (i11 != Integer.MAX_VALUE) {
            i10 = i11 + 1;
        }
        this.f23786b.edit().putInt(str, i10).apply();
        return i11;
    }

    public int c(int i10, int i11) {
        synchronized (e.class) {
            a();
            int b10 = b("next_job_scheduler_id");
            if (b10 >= i10) {
                if (b10 <= i11) {
                    i10 = b10;
                }
            }
            this.f23786b.edit().putInt("next_job_scheduler_id", i10 + 1).apply();
        }
        return i10;
    }
}
