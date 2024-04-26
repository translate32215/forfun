package e8;

import java.util.Arrays;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ye0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17620a;

    /* renamed from: b  reason: collision with root package name */
    public final bc0[] f17621b;

    /* renamed from: c  reason: collision with root package name */
    public int f17622c;

    public ye0(bc0... bc0Arr) {
        a.c(bc0Arr.length > 0);
        this.f17621b = bc0Arr;
        this.f17620a = bc0Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye0.class == obj.getClass()) {
            ye0 ye0 = (ye0) obj;
            return this.f17620a == ye0.f17620a && Arrays.equals(this.f17621b, ye0.f17621b);
        }
    }

    public final int hashCode() {
        if (this.f17622c == 0) {
            this.f17622c = Arrays.hashCode(this.f17621b) + 527;
        }
        return this.f17622c;
    }
}
