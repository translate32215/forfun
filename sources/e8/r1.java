package e8;

import a7.d;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class r1 extends d.a {

    /* renamed from: a  reason: collision with root package name */
    public final u f16222a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d.b> f16223b = new ArrayList();

    public r1(u uVar) {
        z zVar;
        IBinder iBinder;
        this.f16222a = uVar;
        try {
            uVar.J1();
        } catch (RemoteException e10) {
            e.C("", e10);
        }
        try {
            for (z next : uVar.Q0()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zVar = queryLocalInterface instanceof z ? (z) queryLocalInterface : new b0(iBinder);
                }
                if (zVar != null) {
                    this.f16223b.add(new s1(zVar));
                }
            }
        } catch (RemoteException e11) {
            e.C("", e11);
        }
    }
}
