package v7;

import com.google.android.gms.common.internal.h;
import java.util.Arrays;
import t7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class i implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final i f26583b = new i((String) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f26584a = null;

    public /* synthetic */ i(String str) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return h.a(this.f26584a, ((i) obj).f26584a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26584a});
    }
}
