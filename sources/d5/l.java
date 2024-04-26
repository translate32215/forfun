package d5;

import java.io.IOException;

/* compiled from: ExtractorUtil */
public final class l {
    public static int a(j jVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int e10 = jVar.e(bArr, i10 + i12, i11 - i12);
            if (e10 == -1) {
                break;
            }
            i12 += e10;
        }
        return i12;
    }
}
