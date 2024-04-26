package e8;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.lg;
import e.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g40 extends lg {

    /* renamed from: a  reason: collision with root package name */
    public final char f14704a;

    public g40(char c10) {
        super(0);
        this.f14704a = c10;
    }

    public final boolean d(char c10) {
        return c10 == this.f14704a;
    }

    public final String toString() {
        char c10 = this.f14704a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        return g.a(o.a(copyValueOf, 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
