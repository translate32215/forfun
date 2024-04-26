package e8;

import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.mg;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class dw implements mg {

    /* renamed from: a  reason: collision with root package name */
    public static final mg f14339a = new dw();

    public final Object apply(Object obj) {
        List<String> list = ld.f7364s;
        return ((JSONObject) obj).optString("nas");
    }
}
