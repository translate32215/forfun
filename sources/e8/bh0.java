package e8;

import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.vu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bh0 extends tu {

    /* renamed from: c  reason: collision with root package name */
    public MessageDigest f14013c;

    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i10 = 4;
        if (split.length == 1) {
            int a10 = vu.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a10);
            bArr = allocate.array();
        } else {
            if (split.length < 5) {
                bArr2 = new byte[(split.length << 1)];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int a11 = vu.a(split[i11]);
                    int i12 = (a11 >> 16) ^ (65535 & a11);
                    byte[] bArr3 = {(byte) i12, (byte) (i12 >> 8)};
                    int i13 = i11 << 1;
                    bArr2[i13] = bArr3[0];
                    bArr2[i13 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[split.length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    int a12 = vu.a(split[i14]);
                    bArr2[i14] = (byte) ((a12 >> 24) ^ (((a12 & 255) ^ ((a12 >> 8) & 255)) ^ ((a12 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f14013c = b();
        synchronized (this.f8220a) {
            MessageDigest messageDigest = this.f14013c;
            if (messageDigest == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            messageDigest.reset();
            this.f14013c.update(bArr);
            byte[] digest = this.f14013c.digest();
            if (digest.length <= 4) {
                i10 = digest.length;
            }
            byte[] bArr5 = new byte[i10];
            System.arraycopy(digest, 0, bArr5, 0, i10);
            return bArr5;
        }
    }
}
