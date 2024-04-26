package e8;

import android.os.Bundle;
import androidx.appcompat.widget.p;
import com.google.android.gms.ads.internal.util.i;
import d7.l;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15717a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f15718b;

    public nw(Bundle bundle, int i10) {
        this.f15717a = i10;
        if (i10 == 1) {
            this.f15718b = bundle;
        } else if (i10 == 2) {
            this.f15718b = bundle;
        } else if (i10 == 3) {
            this.f15718b = bundle;
        } else if (i10 != 4) {
            this.f15718b = bundle;
        } else {
            this.f15718b = bundle;
        }
    }

    public final void a(Object obj) {
        switch (this.f15717a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (!this.f15718b.isEmpty()) {
                    bundle.putBundle("installed_adapter_data", this.f15718b);
                    return;
                }
                return;
            case 1:
                ((Bundle) obj).putBundle("content_info", this.f15718b);
                return;
            case 2:
                Bundle bundle2 = (Bundle) obj;
                Bundle a10 = jc0.a(bundle2, "device");
                a10.putBundle("android_mem_info", this.f15718b);
                bundle2.putBundle("device", a10);
                return;
            case 3:
                Bundle bundle3 = (Bundle) obj;
                Bundle bundle4 = this.f15718b;
                if (bundle4 != null) {
                    bundle3.putAll(bundle4);
                    return;
                }
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (this.f15718b != null) {
                    try {
                        i.j(i.j(jSONObject, "device"), "play_store").put("parental_controls", l.B.f13186c.v(this.f15718b));
                        return;
                    } catch (JSONException unused) {
                        e.H("Failed putting parental controls bundle.");
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw(Bundle bundle, p pVar) {
        this(bundle, 0);
        this.f15717a = 0;
    }
}
