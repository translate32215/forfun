package ya;

import com.google.auto.value.AutoValue;
import ya.b;

@AutoValue
/* compiled from: TokenResult */
public abstract class f {

    @AutoValue.Builder
    /* compiled from: TokenResult */
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j10);
    }

    /* compiled from: TokenResult */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0285b bVar = new b.C0285b();
        bVar.b(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
