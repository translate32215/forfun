package e7;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.activity.j;
import androidx.appcompat.widget.m;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.y6;
import d7.g;
import d7.l;
import e8.w;
import f7.a;
import f7.m0;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13640b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13641c;

    public h(y6 y6Var) {
        this.f13640b = 1;
        this.f13641c = y6Var;
    }

    public final void a() {
        switch (this.f13640b) {
            case 0:
                m mVar = l.B.f13204u;
                Bitmap bitmap = (Bitmap) ((Map) mVar.f1021b).get(Integer.valueOf(((com.google.android.gms.ads.internal.overlay.a) this.f13641c).f5626c.f5621w.f13177f));
                if (bitmap != null) {
                    m0 m0Var = l.B.f13188e;
                    com.google.android.gms.ads.internal.overlay.a aVar = (com.google.android.gms.ads.internal.overlay.a) this.f13641c;
                    Activity activity = aVar.f5625b;
                    g gVar = aVar.f5626c.f5621w;
                    p.f5702i.post(new i(this, m0Var.d(activity, bitmap, gVar.f13175d, gVar.f13176e)));
                    return;
                }
                return;
            default:
                y6 y6Var = (y6) this.f13641c;
                w wVar = new w(y6Var.f8584e, y6Var.f8585f.f14544a);
                synchronized (((y6) this.f13641c).f8580a) {
                    try {
                        com.google.android.gms.internal.ads.h hVar = l.B.f13195l;
                        com.google.android.gms.internal.ads.h.a(((y6) this.f13641c).f8586g, wVar);
                    } catch (IllegalArgumentException e10) {
                        e.D("Cannot config CSI reporter.", e10);
                    }
                }
                return;
        }
    }

    public h(com.google.android.gms.ads.internal.overlay.a aVar, j jVar) {
        this.f13640b = 0;
        this.f13640b = 0;
        this.f13641c = aVar;
    }
}
