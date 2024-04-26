package e8;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q60 extends ThreadLocal<SecureRandom> {
    public final Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
