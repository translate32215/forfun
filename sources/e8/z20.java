package e8;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z20 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17683a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17684b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17685c;

    public z20(Context context, f9 f9Var) {
        this.f17683a = context;
        this.f17684b = context.getPackageName();
        this.f17685c = f9Var.f14544a;
    }

    public final void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        p pVar = l.B.f13186c;
        map.put("device", p.L());
        map.put("app", this.f17684b);
        p pVar2 = l.B.f13186c;
        map.put("is_lite_sdk", p.m(this.f17683a) ? "1" : "0");
        map.put("e", TextUtils.join(",", t.c()));
        map.put("sdkVersion", this.f17685c);
    }
}
