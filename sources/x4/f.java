package x4;

import java.util.UUID;

/* compiled from: C */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final UUID f27566a = new UUID(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f27567b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f27568c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f27569d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f27570e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static String a(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long b(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long c(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
