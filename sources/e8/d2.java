package e8;

import a7.d;
import a7.l;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.k1;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zy;
import java.util.ArrayList;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class d2 extends l {

    /* renamed from: a  reason: collision with root package name */
    public final k1 f14203a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d.b> f14204b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final s1 f14205c;

    /* renamed from: d  reason: collision with root package name */
    public final f f14206d = new f();

    /* renamed from: e  reason: collision with root package name */
    public final List<Object> f14207e = new ArrayList();

    public d2(k1 k1Var) {
        z zVar;
        IBinder iBinder;
        this.f14203a = k1Var;
        s1 s1Var = null;
        try {
            List i10 = k1Var.i();
            if (i10 != null) {
                for (Object next : i10) {
                    if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zVar = queryLocalInterface instanceof z ? (z) queryLocalInterface : new b0(iBinder);
                    }
                    if (zVar != null) {
                        this.f14204b.add(new s1(zVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            e.C("", e10);
        }
        try {
            List T1 = this.f14203a.T1();
            if (T1 != null) {
                for (Object next2 : T1) {
                    zy s62 = next2 instanceof IBinder ? pz.s6((IBinder) next2) : null;
                    if (s62 != null) {
                        this.f14207e.add(new gf0(s62));
                    }
                }
            }
        } catch (RemoteException e11) {
            e.C("", e11);
        }
        try {
            z w10 = this.f14203a.w();
            if (w10 != null) {
                s1Var = new s1(w10);
            }
        } catch (RemoteException e12) {
            e.C("", e12);
        }
        this.f14205c = s1Var;
        try {
            if (this.f14203a.h() != null) {
                new r1(this.f14203a.h());
            }
        } catch (RemoteException e13) {
            e.C("", e13);
        }
    }
}
