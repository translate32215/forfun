package n7;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class c extends i {

    /* renamed from: j  reason: collision with root package name */
    public static List f22350j = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f22351f;

    /* renamed from: g  reason: collision with root package name */
    public Set f22352g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public boolean f22353h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22354i;

    public c(zzbx zzbx) {
        super(zzbx);
    }

    public static c a(Context context) {
        return zzbx.zzg(context).zzc();
    }

    public h b(int i10) {
        h hVar;
        zzft zzft;
        synchronized (this) {
            try {
                hVar = new h(this.f22368d, (String) null, (zzfb) null);
                if (i10 > 0 && (zzft = (zzft) new zzfs(this.f22368d).zza(i10)) != null) {
                    hVar.t(zzft);
                }
                hVar.zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public h c(String str) {
        h hVar;
        synchronized (this) {
            hVar = new h(this.f22368d, str, (zzfb) null);
            hVar.zzW();
        }
        return hVar;
    }
}
