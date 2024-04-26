package e8;

import android.util.Log;
import androidx.appcompat.widget.o;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ka0 extends na0 {

    /* renamed from: a  reason: collision with root package name */
    public String f15266a;

    public ka0(String str) {
        this.f15266a = str;
    }

    public final void a(String str) {
        String str2 = this.f15266a;
        StringBuilder sb2 = new StringBuilder(o.a(str, o.a(str2, 1)));
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
