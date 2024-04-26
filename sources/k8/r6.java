package k8;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f20450a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f20451b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f20451b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        f5 a10 = ((m7) obj).a();
        m7 m7Var = (m7) obj2;
        a10.getClass();
        h6 h6Var = (h6) a10;
        if (h6Var.f20241a.getClass().isInstance(m7Var)) {
            h6Var.k((k6) ((g5) m7Var));
            return h6Var.g();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
