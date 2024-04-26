package k8;

import e8.y9;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p.a;
import s9.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class p5 implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final p5 f20407b = new o5(r6.f20451b);

    /* renamed from: a  reason: collision with root package name */
    public int f20408a = 0;

    static {
        int i10 = i5.f20259a;
    }

    public static int x(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(y9.a(66, "Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(y9.a(37, "End index: ", i11, " >= ", i12));
        }
    }

    public static p5 y(byte[] bArr, int i10, int i11) {
        x(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o5(bArr2);
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public abstract int h();

    public final int hashCode() {
        int i10 = this.f20408a;
        if (i10 == 0) {
            int h10 = h();
            i10 = i(h10, 0, h10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f20408a = i10;
        }
        return i10;
    }

    public abstract int i(int i10, int i11, int i12);

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new l5(this);
    }

    public abstract p5 j(int i10, int i11);

    public abstract String o(Charset charset);

    public abstract void q(e eVar) throws IOException;

    public abstract boolean s();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? a.d(this) : String.valueOf(a.d(j(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
