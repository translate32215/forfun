package o8;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final /* synthetic */ class u4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v4 f23466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f23468c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f23469d;

    public /* synthetic */ u4(v4 v4Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f23466a = v4Var;
        this.f23467b = i10;
        this.f23468c = exc;
        this.f23469d = bArr;
    }

    public final void run() {
        v4 v4Var = this.f23466a;
        int i10 = this.f23467b;
        Exception exc = this.f23468c;
        byte[] bArr = this.f23469d;
        l lVar = v4Var.f23551c.f23548a;
        if (!(i10 == 200 || i10 == 204)) {
            if (i10 == 304) {
                i10 = 304;
            }
            lVar.d().f8800i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
        }
        if (exc == null) {
            lVar.t().f8822q.a(true);
            if (bArr == null || bArr.length == 0) {
                lVar.d().f8804m.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    lVar.d().f8804m.a("Deferred Deep Link is empty.");
                    return;
                }
                r A = lVar.A();
                l lVar2 = A.f8864a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = A.f8864a.f8837a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        lVar.f8852p.o("auto", "_cmp", bundle);
                        r A2 = lVar.A();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = A2.f8864a.f8837a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    A2.f8864a.f8837a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                A2.f8864a.d().f8797f.b("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                lVar.d().f8800i.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e11) {
                lVar.d().f8797f.b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        lVar.d().f8800i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
    }
}
