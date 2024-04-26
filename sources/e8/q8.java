package e8;

import android.content.Context;
import android.content.pm.PackageInfo;
import b7.a;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.yh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q8 implements r8 {
    public final p50<String> a(String str, PackageInfo packageInfo, int i10) {
        return yh.h(str);
    }

    public final p50<a.C0050a> b(Context context, int i10) {
        d7 d7Var = new d7();
        y8 y8Var = ti0.f16763j.f16764a;
        if (y8.e(context)) {
            o50 o50 = h9.f14881a;
            ((k9) o50).f15244a.execute(new s8(context, d7Var));
        }
        return d7Var;
    }

    public final p50<String> c(Context context, int i10) {
        return yh.h(null);
    }
}
