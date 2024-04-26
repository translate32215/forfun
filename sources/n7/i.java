package n7;

import com.google.android.gms.internal.gtm.zzbx;
import java.util.ArrayList;
import java.util.List;
import z7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final v f22365a;

    /* renamed from: b  reason: collision with root package name */
    public final o f22366b;

    /* renamed from: c  reason: collision with root package name */
    public final List f22367c;

    /* renamed from: d  reason: collision with root package name */
    public final zzbx f22368d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22369e;

    public i(zzbx zzbx) {
        v zzd = zzbx.zzd();
        b zzr = zzbx.zzr();
        if (zzd != null) {
            this.f22365a = zzd;
            this.f22367c = new ArrayList();
            o oVar = new o(this, zzr);
            oVar.f22385i = true;
            this.f22366b = oVar;
            this.f22368d = zzbx;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
