package s7;

import android.os.RemoteException;
import android.util.Log;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.i;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class s extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f25024b;

    public s(byte[] bArr) {
        i.a(bArr.length == 25);
        this.f25024b = Arrays.hashCode(bArr);
    }

    public static byte[] Y(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final int e() {
        return this.f25024b;
    }

    public final boolean equals(Object obj) {
        a f10;
        if (obj != null && (obj instanceof b0)) {
            try {
                b0 b0Var = (b0) obj;
                if (b0Var.e() != this.f25024b || (f10 = b0Var.f()) == null) {
                    return false;
                }
                return Arrays.equals(z0(), (byte[]) b.z0(f10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final a f() {
        return new b(z0());
    }

    public final int hashCode() {
        return this.f25024b;
    }

    public abstract byte[] z0();
}
