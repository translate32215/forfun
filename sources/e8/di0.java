package e8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c8.b;
import c8.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.fy;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.s2;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class di0 extends c<iy> {
    public di0() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof iy) {
            return (iy) queryLocalInterface;
        }
        return new hy(iBinder);
    }

    public final dy c(Context context, li0 li0, String str, s2 s2Var, int i10) {
        try {
            IBinder f42 = ((iy) b(context)).f4(new b(context), li0, str, s2Var, ModuleDescriptor.MODULE_VERSION, i10);
            if (f42 == null) {
                return null;
            }
            IInterface queryLocalInterface = f42.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof dy) {
                return (dy) queryLocalInterface;
            }
            return new fy(f42);
        } catch (RemoteException | c.a e10) {
            e.A("Could not create remote AdManager.", e10);
            return null;
        }
    }
}
