package e8;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.q9;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.yc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hv implements ev<q9> {

    /* renamed from: a  reason: collision with root package name */
    public final rm f14947a;

    public hv(Context context, rm rmVar) {
        this.f14947a = rmVar;
    }

    public final Object a(t00 t00, qe qeVar, View view, yc ycVar) {
        jm a10 = this.f14947a.a(new j8(t00, qeVar, (String) null), new iv(gv.f14826a));
        ri riVar = new ri(a10);
        synchronized (ycVar) {
            ycVar.f8598a = riVar;
        }
        return a10.j();
    }
}
