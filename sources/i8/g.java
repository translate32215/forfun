package i8;

import android.support.v4.media.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class g extends f {

    /* renamed from: a  reason: collision with root package name */
    public final char f19329a;

    public g(char c10) {
        this.f19329a = c10;
    }

    public final boolean a(char c10) {
        return c10 == this.f19329a;
    }

    public final String toString() {
        StringBuilder a10 = a.a("CharMatcher.is('");
        int i10 = this.f19329a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        a10.append(String.copyValueOf(cArr));
        a10.append("')");
        return a10.toString();
    }
}
