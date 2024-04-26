package e8;

import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.zo;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p60 extends ThreadLocal<Mac> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fp f15872a;

    public p60(fp fpVar) {
        this.f15872a = fpVar;
    }

    public final Object initialValue() {
        try {
            Mac a10 = zo.f8720f.a(this.f15872a.f6471b);
            a10.init(this.f15872a.f6472c);
            return a10;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
