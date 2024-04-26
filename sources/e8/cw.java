package e8;

import com.google.android.gms.internal.ads.cd;
import com.google.android.gms.internal.ads.ji;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cw implements Runnable {
    public cw(ji jiVar) {
    }

    public final void run() {
        try {
            cd.f6114b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            cd.f6117e.countDown();
        }
    }
}
