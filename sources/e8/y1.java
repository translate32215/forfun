package e8;

import a7.d;
import a7.i;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class y1 extends i {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f17562a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d.b> f17563b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final s1 f17564c;

    /* renamed from: d  reason: collision with root package name */
    public final f f17565d = new f();

    public y1(i0 i0Var) {
        z zVar;
        IBinder iBinder;
        this.f17562a = i0Var;
        s1 s1Var = null;
        try {
            List i10 = i0Var.i();
            if (i10 != null) {
                for (Object next : i10) {
                    if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zVar = queryLocalInterface instanceof z ? (z) queryLocalInterface : new b0(iBinder);
                    }
                    if (zVar != null) {
                        this.f17563b.add(new s1(zVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            e.C("", e10);
        }
        try {
            z R = this.f17562a.R();
            if (R != null) {
                s1Var = new s1(R);
            }
        } catch (RemoteException e11) {
            e.C("", e11);
        }
        this.f17564c = s1Var;
        try {
            if (this.f17562a.h() != null) {
                new r1(this.f17562a.h());
            }
        } catch (RemoteException e12) {
            e.C("", e12);
        }
    }

    public final Object a() {
        try {
            return this.f17562a.y();
        } catch (RemoteException e10) {
            e.C("", e10);
            return null;
        }
    }
}
