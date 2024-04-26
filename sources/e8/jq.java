package e8;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jq implements pi, pj, ek {

    /* renamed from: a  reason: collision with root package name */
    public final mq f15179a;

    /* renamed from: b  reason: collision with root package name */
    public final tq f15180b;

    public jq(mq mqVar, tq tqVar) {
        this.f15179a = mqVar;
        this.f15180b = tqVar;
    }

    public final void C0(t00 t00) {
        mq mqVar = this.f15179a;
        mqVar.getClass();
        if (((List) t00.f16701b.f7134b).size() > 0) {
            switch (((qe) ((List) t00.f16701b.f7134b).get(0)).f7944b) {
                case 1:
                    mqVar.f15534a.put("ad_format", "banner");
                    break;
                case 2:
                    mqVar.f15534a.put("ad_format", "interstitial");
                    break;
                case 3:
                    mqVar.f15534a.put("ad_format", "native_express");
                    break;
                case 4:
                    mqVar.f15534a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    mqVar.f15534a.put("ad_format", "rewarded");
                    break;
                case 6:
                    mqVar.f15534a.put("ad_format", "app_open_ad");
                    mqVar.f15534a.put("as", mqVar.f15535b.f17450g ? "1" : "0");
                    break;
                default:
                    mqVar.f15534a.put("ad_format", "unknown");
                    break;
            }
        }
        if (!TextUtils.isEmpty(((re) t00.f16701b.f7135c).f8030b)) {
            mqVar.f15534a.put("gqi", ((re) t00.f16701b.f7135c).f8030b);
        }
    }

    public final void j0(zh0 zh0) {
        this.f15179a.f15534a.put("action", "ftl");
        this.f15179a.f15534a.put("ftl", String.valueOf(zh0.f17753a));
        this.f15179a.f15534a.put("ed", zh0.f17755c);
        this.f15180b.a(this.f15179a.f15534a);
    }

    public final void k0(l5 l5Var) {
        mq mqVar = this.f15179a;
        Bundle bundle = l5Var.f7314a;
        mqVar.getClass();
        if (bundle.containsKey("cnt")) {
            mqVar.f15534a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            mqVar.f15534a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void v() {
        this.f15179a.f15534a.put("action", "loaded");
        this.f15180b.a(this.f15179a.f15534a);
    }
}
