package e8;

import android.text.TextUtils;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import d7.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u20 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f16842a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final w20 f16843b = new w20(l.B.f13193j);

    public static u20 c(String str) {
        u20 u20 = new u20();
        u20.f16842a.put("action", str);
        return u20;
    }

    public final u20 a(t00 t00, x8 x8Var) {
        j8 j8Var = t00.f16701b;
        if (j8Var == null) {
            return this;
        }
        re reVar = (re) j8Var.f7135c;
        if (reVar != null) {
            b(reVar);
        }
        if (!((List) j8Var.f7134b).isEmpty()) {
            switch (((qe) ((List) j8Var.f7134b).get(0)).f7944b) {
                case 1:
                    this.f16842a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f16842a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f16842a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f16842a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f16842a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f16842a.put("ad_format", "app_open_ad");
                    if (x8Var != null) {
                        this.f16842a.put("as", x8Var.f17450g ? "1" : "0");
                        break;
                    }
                    break;
                default:
                    this.f16842a.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final u20 b(re reVar) {
        if (!TextUtils.isEmpty(reVar.f8030b)) {
            this.f16842a.put("gqi", reVar.f8030b);
        }
        return this;
    }

    public final u20 d(String str) {
        w20 w20 = this.f16843b;
        if (w20.f17207c.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(20);
            sb2.append(w20.f17205a.a() - w20.f17207c.remove(str).longValue());
            w20.a(str, sb2.toString());
        } else {
            w20.f17207c.put(str, Long.valueOf(w20.f17205a.a()));
        }
        return this;
    }

    public final Map<String, String> e() {
        HashMap hashMap = new HashMap(this.f16842a);
        w20 w20 = this.f16843b;
        w20.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : w20.f17206b.entrySet()) {
            int i10 = 0;
            if (((List) next.getValue()).size() > 1) {
                for (String y20 : (List) next.getValue()) {
                    String str = (String) next.getKey();
                    i10++;
                    StringBuilder sb2 = new StringBuilder(o.a(str, 12));
                    sb2.append(str);
                    sb2.append(".");
                    sb2.append(i10);
                    arrayList.add(new y20(sb2.toString(), y20));
                }
            } else {
                arrayList.add(new y20((String) next.getKey(), (String) ((List) next.getValue()).get(0)));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y20 y202 = (y20) it.next();
            hashMap.put(y202.f17567a, y202.f17568b);
        }
        return hashMap;
    }

    public final u20 f(String str, String str2) {
        w20 w20 = this.f16843b;
        if (w20.f17207c.containsKey(str)) {
            long a10 = w20.f17205a.a() - w20.f17207c.remove(str).longValue();
            StringBuilder sb2 = new StringBuilder(str2.length() + 20);
            sb2.append(str2);
            sb2.append(a10);
            w20.a(str, sb2.toString());
        } else {
            w20.f17207c.put(str, Long.valueOf(w20.f17205a.a()));
        }
        return this;
    }
}
