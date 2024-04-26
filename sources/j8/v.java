package j8;

import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class v extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f19678a = 0;

    public final void write(int i10) {
        this.f19678a++;
    }

    public final void write(byte[] bArr) {
        this.f19678a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f19678a += (long) i11;
    }
}
