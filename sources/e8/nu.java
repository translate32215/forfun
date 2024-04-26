package e8;

import a7.b;
import a7.k;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class nu<AdT> implements lt<AdT> {
    public final boolean a(t00 t00, qe qeVar) {
        return !TextUtils.isEmpty(qeVar.f7968u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public final p50<AdT> b(t00 t00, qe qeVar) {
        t00 t002 = t00;
        qe qeVar2 = qeVar;
        String optString = qeVar2.f7968u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        w00 w00 = (w00) t002.f16700a.f8042b;
        y00 y00 = new y00();
        uf ufVar = y00.f17560p;
        uf ufVar2 = w00.f17201o;
        ufVar.getClass();
        ufVar.f16946b = ufVar2.f16946b;
        fi0 fi0 = w00.f17190d;
        y00.f17545a = fi0;
        y00.f17546b = w00.f17191e;
        y00.f17547c = w00.f17187a;
        y00.f17548d = w00.f17192f;
        y00.f17549e = w00.f17188b;
        y00.f17551g = w00.f17193g;
        y00.f17552h = w00.f17194h;
        y00.f17553i = w00.f17195i;
        y00.f17554j = w00.f17196j;
        b bVar = w00.f17198l;
        y00.f17555k = bVar;
        if (bVar != null) {
            y00.f17550f = bVar.f126a;
        }
        k kVar = w00.f17199m;
        y00.f17556l = kVar;
        if (kVar != null) {
            y00.f17550f = kVar.f145a;
            y00.f17557m = kVar.f146b;
        }
        y00.f17561q = w00.f17202p;
        y00.f17548d = optString;
        Bundle bundle = fi0.f14643u;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = qeVar2.f7968u.optString("mad_hac", (String) null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = qeVar2.f7968u.optString("adJson", (String) null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> keys = qeVar2.C.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = qeVar2.C.optString(next, (String) null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        fi0 fi02 = w00.f17190d;
        y00.f17545a = new fi0(fi02.f14631a, fi02.f14632b, bundle4, fi02.f14634d, fi02.f14635e, fi02.f14636f, fi02.f14637g, fi02.f14638h, fi02.f14639i, fi02.f14640r, fi02.f14641s, fi02.f14642t, bundle2, fi02.f14644v, fi02.f14645w, fi02.f14646x, fi02.f14647y, fi02.f14648z, fi02.A, fi02.B, fi02.C, fi02.D, fi02.E);
        w00 a10 = y00.a();
        Bundle bundle5 = new Bundle();
        re reVar = (re) t002.f16701b.f7135c;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList(reVar.f8029a));
        bundle6.putInt("refresh_interval", reVar.f8031c);
        bundle6.putString("gws_query_id", reVar.f8030b);
        bundle5.putBundle("parent_common_config", bundle6);
        String str = ((w00) t002.f16700a.f8042b).f17192f;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        qe qeVar3 = qeVar;
        bundle7.putString("allocation_id", qeVar3.f7969v);
        bundle7.putStringArrayList("click_urls", new ArrayList(qeVar3.f7946c));
        bundle7.putStringArrayList("imp_urls", new ArrayList(qeVar3.f7948d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList(qeVar3.f7962o));
        bundle7.putStringArrayList("fill_urls", new ArrayList(qeVar3.f7960m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList(qeVar3.f7954g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList(qeVar3.f7955h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList(qeVar3.f7956i));
        bundle7.putString("transaction_id", qeVar3.f7957j);
        bundle7.putString("valid_from_timestamp", qeVar3.f7958k);
        bundle7.putBoolean("is_closable_area_disabled", qeVar3.K);
        if (qeVar3.f7959l != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", qeVar3.f7959l.f5942b);
            bundle8.putString("rb_type", qeVar3.f7959l.f5941a);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a10, bundle5);
    }

    public abstract p50<AdT> c(w00 w00, Bundle bundle);
}
