package e8;

import com.google.android.gms.internal.ads.t7;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class y2 implements f3<t7> {
    public final /* synthetic */ void f(Object obj, Map map) {
        JSONObject Y;
        t7 t7Var = (t7) obj;
        m1 o02 = t7Var.o0();
        if (o02 == null || (Y = o02.Y()) == null) {
            t7Var.F("nativeAdViewSignalsReady", new JSONObject());
        } else {
            t7Var.F("nativeAdViewSignalsReady", Y);
        }
    }
}
