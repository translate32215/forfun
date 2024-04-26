package ve;

import javax.annotation.Nullable;

/* compiled from: SegmentPool */
public final class v {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static u f26781a;

    /* renamed from: b  reason: collision with root package name */
    public static long f26782b;

    public static void a(u uVar) {
        if (uVar.f26779f != null || uVar.f26780g != null) {
            throw new IllegalArgumentException();
        } else if (!uVar.f26777d) {
            synchronized (v.class) {
                long j10 = f26782b + 8192;
                if (j10 <= 65536) {
                    f26782b = j10;
                    uVar.f26779f = f26781a;
                    uVar.f26776c = 0;
                    uVar.f26775b = 0;
                    f26781a = uVar;
                }
            }
        }
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = f26781a;
            if (uVar == null) {
                return new u();
            }
            f26781a = uVar.f26779f;
            uVar.f26779f = null;
            f26782b -= 8192;
            return uVar;
        }
    }
}
