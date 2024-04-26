package xa;

import com.google.auto.value.AutoValue;
import j.f;
import xa.c;

@AutoValue
/* compiled from: PersistedInstallationEntry */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f27915a = 0;

    @AutoValue.Builder
    /* compiled from: PersistedInstallationEntry */
    public static abstract class a {
    }

    static {
        Long l10 = 0L;
        String str = l10 == null ? " expiresInSecs" : "";
        if (l10 == null) {
            str = f.a(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            l10.longValue();
            l10.longValue();
            return;
        }
        throw new IllegalStateException(f.a("Missing required properties:", str));
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public boolean i() {
        c.a aVar = ((a) this).f27891c;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    public boolean j() {
        return f() == c.a.REGISTERED;
    }

    public abstract a k();
}
