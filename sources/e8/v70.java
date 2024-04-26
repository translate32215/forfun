package e8;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.op;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class v70 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f17029a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17030b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17030b = bArr;
        ByteBuffer.wrap(bArr);
        op.d(bArr, 0, bArr.length, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static Object b(Object obj, Object obj2) {
        y60 d10 = ((cq) obj).d();
        cq cqVar = (cq) obj2;
        d10.getClass();
        aq.b bVar = (aq.b) d10;
        if (bVar.f5969a.getClass().isInstance(cqVar)) {
            bVar.m((aq) ((z60) cqVar));
            return bVar.h();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
