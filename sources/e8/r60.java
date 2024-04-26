package e8;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r60 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f16246a = new q60();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f16246a.get().nextBytes(bArr);
        return bArr;
    }
}
