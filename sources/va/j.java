package va;

import android.text.TextUtils;
import e8.b5;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import xa.d;

/* compiled from: Utils */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final long f26697b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f26698c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static j f26699d;

    /* renamed from: a  reason: collision with root package name */
    public final b5 f26700a;

    public j(b5 b5Var) {
        this.f26700a = b5Var;
    }

    public static j c() {
        if (b5.f13879a == null) {
            b5.f13879a = new b5(6);
        }
        b5 b5Var = b5.f13879a;
        if (f26699d == null) {
            f26699d = new j(b5Var);
        }
        return f26699d;
    }

    public long a() {
        this.f26700a.getClass();
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public boolean d(d dVar) {
        if (TextUtils.isEmpty(dVar.a())) {
            return true;
        }
        if (dVar.b() + dVar.g() < b() + f26697b) {
            return true;
        }
        return false;
    }
}
