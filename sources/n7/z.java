package n7;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class z extends zzbu {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22404a;

    /* renamed from: b  reason: collision with root package name */
    public int f22405b;

    /* renamed from: c  reason: collision with root package name */
    public long f22406c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22407d;

    /* renamed from: e  reason: collision with root package name */
    public long f22408e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f22409f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(h hVar, zzbx zzbx) {
        super(zzbx);
        this.f22409f = hVar;
    }

    public final void i() {
        if (this.f22406c >= 0 || this.f22404a) {
            c zzp = zzp();
            zzp.f22352g.add(this.f22409f.f22362d);
            Context zza = zzp.f22368d.zza();
            if (zza instanceof Application) {
                Application application = (Application) zza;
                if (!zzp.f22353h) {
                    application.registerActivityLifecycleCallbacks(new l(zzp));
                    zzp.f22353h = true;
                    return;
                }
                return;
            }
            return;
        }
        c zzp2 = zzp();
        zzp2.f22352g.remove(this.f22409f.f22362d);
    }

    public final void zzd() {
    }
}
