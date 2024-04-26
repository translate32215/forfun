package e8;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.ev;
import e7.k;
import java.util.concurrent.atomic.AtomicReference;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hz implements k, pi, tj, zz {

    /* renamed from: a  reason: collision with root package name */
    public final i10 f14957a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<av> f14958b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<bv> f14959c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<ev> f14960d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<tj> f14961e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<k> f14962f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    public hz f14963g = null;

    public hz(i10 i10) {
        this.f14957a = i10;
    }

    public final void G1() {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 != null) {
                hzVar = hzVar2;
            } else {
                androidx.activity.k.d(hzVar.f14962f, nz.f15723a);
                androidx.activity.k.d(hzVar.f14960d, mz.f15566a);
                return;
            }
        }
    }

    public final void J3(c cVar) {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 == null) {
                break;
            }
            hzVar = hzVar2;
        }
        k kVar = hzVar.f14962f.get();
        if (kVar != null) {
            try {
                kVar.J3(cVar);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void a() {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 != null) {
                hzVar = hzVar2;
            } else {
                hzVar.f14957a.a();
                androidx.activity.k.d(hzVar.f14959c, jz.f15207a);
                androidx.activity.k.d(hzVar.f14960d, lz.f15442a);
                return;
            }
        }
    }

    public final void j0(zh0 zh0) {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 == null) {
                break;
            }
            hzVar = hzVar2;
        }
        av avVar = hzVar.f14958b.get();
        if (avVar != null) {
            try {
                avVar.U4(zh0);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        av avVar2 = hzVar.f14958b.get();
        if (avVar2 != null) {
            try {
                avVar2.Y1(zh0.f17753a);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }

    public final void m(zz zzVar) {
        this.f14963g = (hz) zzVar;
    }

    public final void o4() {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 != null) {
                hzVar = hzVar2;
            } else {
                androidx.activity.k.d(hzVar.f14961e, kz.f15344a);
                return;
            }
        }
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void x0() {
        hz hzVar = this;
        while (true) {
            hz hzVar2 = hzVar.f14963g;
            if (hzVar2 != null) {
                hzVar = hzVar2;
            } else {
                androidx.activity.k.d(hzVar.f14962f, oz.f15857a);
                return;
            }
        }
    }
}
