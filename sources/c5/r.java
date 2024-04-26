package c5;

import java.util.UUID;
import v6.e0;

/* compiled from: FrameworkMediaCrypto */
public final class r implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4341d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f4342a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4343b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4344c;

    static {
        boolean z10;
        if ("Amazon".equals(e0.f26438c)) {
            String str = e0.f26439d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f4341d = z10;
            }
        }
        z10 = false;
        f4341d = z10;
    }

    public r(UUID uuid, byte[] bArr, boolean z10) {
        this.f4342a = uuid;
        this.f4343b = bArr;
        this.f4344c = z10;
    }
}
