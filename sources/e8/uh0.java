package e8;

import android.text.TextUtils;
import androidx.appcompat.widget.o;
import j4.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uh0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16960a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16961b;

    public uh0(String str, String str2) {
        this.f16960a = str;
        this.f16961b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uh0.class == obj.getClass()) {
            uh0 uh0 = (uh0) obj;
            return TextUtils.equals(this.f16960a, uh0.f16960a) && TextUtils.equals(this.f16961b, uh0.f16961b);
        }
    }

    public final int hashCode() {
        return this.f16961b.hashCode() + (this.f16960a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f16960a;
        String str2 = this.f16961b;
        StringBuilder a10 = e.a(o.a(str2, o.a(str, 20)), "Header[name=", str, ",value=", str2);
        a10.append("]");
        return a10.toString();
    }
}
