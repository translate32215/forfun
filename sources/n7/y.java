package n7;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f22397a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22398b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f22399c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f22400d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f22401e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f22402f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f22403g;

    public y(h hVar, Map map, boolean z10, String str, long j10, boolean z11, boolean z12, String str2) {
        this.f22403g = hVar;
        this.f22397a = map;
        this.f22398b = str;
        this.f22399c = j10;
        this.f22400d = z11;
        this.f22401e = z12;
        this.f22402f = str2;
    }

    public final void run() {
        boolean z10;
        double d10;
        z zVar = this.f22403g.f22362d;
        synchronized (zVar) {
            z10 = zVar.f22407d;
            zVar.f22407d = false;
        }
        if (z10) {
            this.f22397a.put("sc", "start");
        }
        Map map = this.f22397a;
        c zzp = this.f22403g.zzp();
        i.g("getClientId can not be called from the main thread");
        String zzb = zzp.f22368d.zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str = (String) this.f22397a.get("sf");
        if (str != null) {
            try {
                d10 = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d10 = 100.0d;
            }
            if (zzfu.zzj(d10, (String) this.f22397a.get("cid"))) {
                this.f22403g.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d10));
                return;
            }
        }
        this.f22403g.zzr();
        this.f22397a.remove("ate");
        this.f22397a.remove("adid");
        zzax zza = this.f22403g.zzu().zza();
        zzfu.zzg(this.f22397a, "an", zza.zzf());
        zzfu.zzg(this.f22397a, "av", zza.zzg());
        zzfu.zzg(this.f22397a, "aid", zza.zzd());
        zzfu.zzg(this.f22397a, "aiid", zza.zze());
        this.f22397a.put("v", "1");
        this.f22397a.put("_v", zzbv.zzb);
        zzfu.zzg(this.f22397a, "ul", this.f22403g.zzx().zza().zzd());
        zzfu.zzg(this.f22397a, "sr", this.f22403g.zzx().zzb());
        if (this.f22398b.equals("transaction") || this.f22398b.equals("item") || this.f22403g.f22361c.zza()) {
            long zza2 = zzfu.zza((String) this.f22397a.get("ht"));
            if (zza2 == 0) {
                zza2 = this.f22399c;
            }
            long j10 = zza2;
            if (this.f22400d) {
                this.f22403g.zzz().zzM("Dry run enabled. Would have sent hit", new zzez(this.f22403g, this.f22397a, j10, this.f22401e));
                return;
            }
            String str2 = (String) this.f22397a.get("cid");
            HashMap hashMap = new HashMap();
            zzfu.zzh(hashMap, "uid", this.f22397a);
            zzfu.zzh(hashMap, "an", this.f22397a);
            zzfu.zzh(hashMap, "aid", this.f22397a);
            zzfu.zzh(hashMap, "av", this.f22397a);
            zzfu.zzh(hashMap, "aiid", this.f22397a);
            i.h(str2);
            this.f22397a.put("_s", String.valueOf(this.f22403g.zzs().zza(new zzbz(0, str2, this.f22402f, !TextUtils.isEmpty((CharSequence) this.f22397a.get("adid")), 0, hashMap))));
            this.f22403g.zzs().zzh(new zzez(this.f22403g, this.f22397a, j10, this.f22401e));
            return;
        }
        this.f22403g.zzz().zzc(this.f22397a, "Too many hits sent too quickly, rate limiting invoked");
    }
}
