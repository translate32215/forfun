package sa;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: HeartBeatInfoStorage */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public static f f25187b;

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f25188c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f25189a;

    public f(Context context) {
        this.f25189a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public synchronized boolean a(String str, long j10) {
        if (this.f25189a.contains(str)) {
            Date date = new Date(this.f25189a.getLong(str, -1));
            Date date2 = new Date(j10);
            SimpleDateFormat simpleDateFormat = f25188c;
            if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
                return false;
            }
            this.f25189a.edit().putLong(str, j10).apply();
            return true;
        }
        this.f25189a.edit().putLong(str, j10).apply();
        return true;
    }
}
