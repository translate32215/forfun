package e8;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.qd;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14948a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14949b;

    public hw(uy uyVar) {
        this.f14949b = uyVar;
    }

    public final void a(Object obj) {
        boolean z10;
        boolean z11 = false;
        switch (this.f14948a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                fi0 fi0 = ((w00) this.f14949b).f17190d;
                bundle.putInt("http_timeout_millis", fi0.E);
                bundle.putString("slotname", ((w00) this.f14949b).f17192f);
                int i10 = qd.f7941a[((w00) this.f14949b).f17201o.f16946b - 1];
                if (i10 == 1) {
                    bundle.putBoolean("is_new_rewarded", true);
                } else if (i10 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
                String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(fi0.f14632b));
                if (fi0.f14632b != -1) {
                    bundle.putString("cust_age", format);
                }
                Bundle bundle2 = fi0.f14633c;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                jc0.d(bundle, "cust_gender", Integer.valueOf(fi0.f14634d), fi0.f14634d != -1);
                jc0.e(bundle, "kw", fi0.f14635e);
                jc0.d(bundle, "tag_for_child_directed_treatment", Integer.valueOf(fi0.f14637g), fi0.f14637g != -1);
                boolean z12 = fi0.f14636f;
                if (z12) {
                    bundle.putBoolean("test_request", z12);
                }
                jc0.d(bundle, "d_imp_hdr", 1, fi0.f14631a >= 2 && fi0.f14638h);
                String str = fi0.f14639i;
                if (fi0.f14631a >= 2 && !TextUtils.isEmpty(str)) {
                    bundle.putString("ppid", str);
                }
                Location location = fi0.f14641s;
                if (location != null) {
                    Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                    Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                    Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                    Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                    Bundle bundle3 = new Bundle();
                    bundle3.putFloat("radius", valueOf.floatValue());
                    bundle3.putLong("lat", valueOf3.longValue());
                    bundle3.putLong("long", valueOf4.longValue());
                    bundle3.putLong("time", valueOf2.longValue());
                    bundle.putBundle("uule", bundle3);
                }
                String str2 = fi0.f14642t;
                if (str2 != null) {
                    bundle.putString("url", str2);
                }
                jc0.e(bundle, "neighboring_content_urls", fi0.D);
                Bundle bundle4 = fi0.f14644v;
                if (bundle4 != null) {
                    bundle.putBundle("custom_targeting", bundle4);
                }
                jc0.e(bundle, "category_exclusions", fi0.f14645w);
                String str3 = fi0.f14646x;
                if (str3 != null) {
                    bundle.putString("request_agent", str3);
                }
                String str4 = fi0.f14647y;
                if (str4 != null) {
                    bundle.putString("request_pkg", str4);
                }
                jc0.c(bundle, "is_designed_for_families", Boolean.valueOf(fi0.f14648z), fi0.f14631a >= 7);
                if (fi0.f14631a >= 8) {
                    Integer valueOf5 = Integer.valueOf(fi0.B);
                    if (fi0.B != -1) {
                        z11 = true;
                    }
                    jc0.d(bundle, "tag_for_under_age_of_consent", valueOf5, z11);
                    String str5 = fi0.C;
                    if (str5 != null) {
                        bundle.putString("max_ad_content_rating", str5);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Bundle bundle5 = (Bundle) obj;
                Boolean bool = (Boolean) this.f14949b;
                if (bool != null) {
                    bundle5.putBoolean("hw_accel", bool.booleanValue());
                    return;
                }
                return;
            case 2:
                Bundle bundle6 = (Bundle) obj;
                oe oeVar = (oe) this.f14949b;
                if (oeVar != null) {
                    synchronized (oeVar.f7683b) {
                        oeVar.a();
                        z10 = oeVar.f7684c == 2;
                    }
                    bundle6.putBoolean("render_in_browser", z10);
                    oe oeVar2 = (oe) this.f14949b;
                    synchronized (oeVar2.f7683b) {
                        oeVar2.a();
                        if (oeVar2.f7684c == 3) {
                            z11 = true;
                        }
                    }
                    bundle6.putBoolean("disable_ml", z11);
                    return;
                }
                return;
            default:
                uy uyVar = (uy) this.f14949b;
                JSONObject jSONObject = (JSONObject) obj;
                uyVar.getClass();
                try {
                    jSONObject.put("gms_sdk_env", uyVar.f17005a);
                    return;
                } catch (JSONException unused) {
                    e.H("Failed putting version constants.");
                    return;
                }
        }
    }

    public hw(oe oeVar) {
        this.f14949b = oeVar;
    }

    public hw(w00 w00) {
        i.i(w00, "the targeting must not be null");
        this.f14949b = w00;
    }

    public hw(Boolean bool) {
        this.f14949b = bool;
    }
}
