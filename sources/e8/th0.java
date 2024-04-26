package e8;

import android.content.Context;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.qs;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class th0 {

    /* renamed from: a  reason: collision with root package name */
    public qs f16759a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16760b;

    public th0(Context context, String str) {
        t.a(context);
        try {
            try {
                this.f16759a = pb0.s6(DynamiteModule.d(context, DynamiteModule.f5902b, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                new b(context);
                this.f16759a.C2(new b(context), str, (String) null);
                this.f16760b = true;
            } catch (RemoteException | d9 | NullPointerException unused) {
                e.E("Cannot dynamite load clearcut");
            }
        } catch (Exception e10) {
            throw new d9(e10);
        } catch (Exception e11) {
            throw new d9(e11);
        }
    }

    public th0(Context context) {
        t.a(context);
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16695z2)).booleanValue()) {
            try {
                this.f16759a = pb0.s6(DynamiteModule.d(context, DynamiteModule.f5902b, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                new b(context);
                this.f16759a.J0(new b(context), "GMA_SDK");
                this.f16760b = true;
            } catch (Exception e10) {
                throw new d9(e10);
            } catch (Exception e11) {
                throw new d9(e11);
            } catch (RemoteException | d9 | NullPointerException unused) {
                e.E("Cannot dynamite load clearcut");
            }
        }
    }

    public th0() {
    }
}
