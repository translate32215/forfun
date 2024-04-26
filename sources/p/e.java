package p;

import a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import e8.bb0;
import e8.cb0;

/* compiled from: CustomTabsServiceConnection */
public abstract class e implements ServiceConnection {

    /* compiled from: CustomTabsServiceConnection */
    public class a extends c {
        public a(e eVar, b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        int i10 = b.a.f0a;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                bVar = new b.a.C0001a(iBinder);
            } else {
                bVar = (b) queryLocalInterface;
            }
        }
        a aVar = new a(this, bVar, componentName);
        bb0 bb0 = (bb0) ((cb0) this).f14103a.get();
        if (bb0 != null) {
            bb0.b(aVar);
        }
    }
}
