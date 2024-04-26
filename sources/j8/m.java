package j8;

import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f19671a = 0;

    static {
        new k();
    }

    public static byte[] a(Queue<byte[]> queue, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i11, remove.length);
            System.arraycopy(remove, 0, bArr, i10 - i11, min);
            i11 -= min;
        }
        return bArr;
    }
}
