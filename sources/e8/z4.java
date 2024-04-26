package e8;

import com.google.android.gms.internal.ads.k2;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class z4 implements k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final k2 f17688a = new z4();

    public final Object a(JSONObject jSONObject) {
        Charset charset = x4.f17437a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(x4.f17437a));
    }
}
