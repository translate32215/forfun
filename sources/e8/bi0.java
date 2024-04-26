package e8;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.qx;
import y6.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class bi0 extends qx {

    /* renamed from: a  reason: collision with root package name */
    public final a f14020a;

    public bi0(a aVar) {
        this.f14020a = aVar;
    }

    public final void C() {
        this.f14020a.g();
    }

    public final void F() {
        this.f14020a.y();
    }

    public final void J() {
        this.f14020a.v();
    }

    public final void O() {
        this.f14020a.t();
    }

    public final void U(zh0 zh0) {
        gz gzVar;
        a aVar = this.f14020a;
        zh0 zh02 = zh0.f17756d;
        e eVar = null;
        com.google.android.gms.ads.a aVar2 = zh02 == null ? null : new com.google.android.gms.ads.a(zh02.f17753a, zh02.f17754b, zh02.f17755c);
        int i10 = zh0.f17753a;
        String str = zh0.f17754b;
        String str2 = zh0.f17755c;
        IBinder iBinder = zh0.f17757e;
        if (iBinder == null) {
            gzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof gz) {
                gzVar = (gz) queryLocalInterface;
            } else {
                gzVar = new iz(iBinder);
            }
        }
        if (gzVar != null) {
            eVar = new e(gzVar);
        }
        aVar.m(new d(i10, str, str2, aVar2, eVar));
    }

    public final void h0(int i10) {
        this.f14020a.l(i10);
    }

    public final void n() {
        this.f14020a.n();
    }

    public final void v() {
        this.f14020a.w();
    }
}
