package e8;

import a7.d;
import a7.h;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class x1 extends h {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f17427a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d.b> f17428b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final s1 f17429c;

    /* renamed from: d  reason: collision with root package name */
    public final f f17430d = new f();

    public x1(e0 e0Var) {
        z zVar;
        IBinder iBinder;
        this.f17427a = e0Var;
        s1 s1Var = null;
        try {
            List i10 = e0Var.i();
            if (i10 != null) {
                for (Object next : i10) {
                    if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zVar = queryLocalInterface instanceof z ? (z) queryLocalInterface : new b0(iBinder);
                    }
                    if (zVar != null) {
                        this.f17428b.add(new s1(zVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            e.C("", e10);
        }
        try {
            z w10 = this.f17427a.w();
            if (w10 != null) {
                s1Var = new s1(w10);
            }
        } catch (RemoteException e11) {
            e.C("", e11);
        }
        this.f17429c = s1Var;
        try {
            if (this.f17427a.h() != null) {
                new r1(this.f17427a.h());
            }
        } catch (RemoteException e12) {
            e.C("", e12);
        }
    }

    public final Object a() {
        try {
            return this.f17427a.y();
        } catch (RemoteException e10) {
            e.C("", e10);
            return null;
        }
    }

    public final Double b() {
        try {
            double k10 = this.f17427a.k();
            if (k10 == -1.0d) {
                return null;
            }
            return Double.valueOf(k10);
        } catch (RemoteException e10) {
            e.C("", e10);
            return null;
        }
    }
}
