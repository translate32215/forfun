package e8;

import com.google.android.gms.internal.ads.zo;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c60 extends ThreadLocal<Cipher> {
    public final Object initialValue() {
        try {
            return zo.f8719e.a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
