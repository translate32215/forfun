package e8;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.re;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tr implements ek {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16807a;

    /* renamed from: b  reason: collision with root package name */
    public final p6 f16808b;

    public tr(Context context, p6 p6Var) {
        this.f16807a = context;
        this.f16808b = p6Var;
    }

    public final void C0(t00 t00) {
        if (!TextUtils.isEmpty(((re) t00.f16701b.f7135c).f8032d)) {
            p6 p6Var = this.f16808b;
            Context context = this.f16807a;
            fi0 fi0 = ((w00) t00.f16700a.f8042b).f17190d;
            p6Var.getClass();
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16561d0)).booleanValue() && p6Var.p(context) && p6.g(context)) {
                synchronized (p6Var.f7821l) {
                }
            }
            this.f16808b.c(this.f16807a, "_aq", ((re) t00.f16701b.f7135c).f8032d, (Bundle) null);
        }
    }

    public final void k0(l5 l5Var) {
    }
}
