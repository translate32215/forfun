package e8;

import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class f50 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14535a = 0;

    static {
        new h50();
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
