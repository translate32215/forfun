package e8;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.yh;
import d7.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class no {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15698a;

    /* renamed from: b  reason: collision with root package name */
    public final jo f15699b;

    /* renamed from: c  reason: collision with root package name */
    public final tm f15700c;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f15701d;

    /* renamed from: e  reason: collision with root package name */
    public final a f15702e;

    /* renamed from: f  reason: collision with root package name */
    public final nv f15703f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f15704g;

    /* renamed from: h  reason: collision with root package name */
    public final n1 f15705h;

    /* renamed from: i  reason: collision with root package name */
    public final uo f15706i;

    /* renamed from: j  reason: collision with root package name */
    public final ScheduledExecutorService f15707j;

    public no(Context context, jo joVar, tm tmVar, f9 f9Var, a aVar, nv nvVar, Executor executor, w00 w00, uo uoVar, ScheduledExecutorService scheduledExecutorService) {
        this.f15698a = context;
        this.f15699b = joVar;
        this.f15700c = tmVar;
        this.f15701d = f9Var;
        this.f15702e = aVar;
        this.f15703f = nvVar;
        this.f15704g = executor;
        this.f15705h = w00.f17195i;
        this.f15706i = uoVar;
        this.f15707j = scheduledExecutorService;
    }

    public static <T> p50 c(boolean z10, p50 p50) {
        if (z10) {
            return yh.j(p50, new qo(p50, 1), h9.f14886f);
        }
        return yh.k(p50, Exception.class, new w3(), h9.f14886f);
    }

    public static Integer d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static pz e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new pz(optString, optString2);
    }

    public final p50<List<t>> a(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return yh.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(b(jSONArray.optJSONObject(i10), z10));
        }
        return yh.i(new j50(ug.A(arrayList)), po.f16011a, this.f15704g);
    }

    public final p50<t> b(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return yh.h(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return yh.h(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return yh.h(new t((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        jo joVar = this.f15699b;
        joVar.getClass();
        o1 o1Var = d.f5662a;
        d7 d7Var = new d7();
        d.f5662a.c(new f7.t(optString, d7Var));
        return c(jSONObject.optBoolean("require"), yh.i(yh.i(d7Var, new io(joVar, optDouble, optBoolean), joVar.f15178b), new oo(optString, optDouble, optInt, optInt2), this.f15704g));
    }
}
