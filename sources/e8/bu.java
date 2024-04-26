package e8;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.q9;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.yh;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bu implements lt<q9> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14058a;

    /* renamed from: b  reason: collision with root package name */
    public final rm f14059b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f14060c;

    /* renamed from: d  reason: collision with root package name */
    public final oe f14061d;

    public bu(Context context, Executor executor, rm rmVar, oe oeVar) {
        this.f14058a = context;
        this.f14059b = rmVar;
        this.f14060c = executor;
        this.f14061d = oeVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        String str;
        Context context = this.f14058a;
        if (!(context instanceof Activity) || !p.c(context)) {
            return false;
        }
        try {
            str = qeVar.f7968u.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public final p50<q9> b(t00 t00, qe qeVar) {
        String str;
        try {
            str = qeVar.f7968u.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        return yh.j(yh.h(null), new xr(this, str != null ? Uri.parse(str) : null, t00, qeVar), this.f14060c);
    }
}
