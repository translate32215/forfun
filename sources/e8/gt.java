package e8;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.a;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class gt implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final dt f14819a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14820b;

    /* renamed from: c  reason: collision with root package name */
    public final oq f14821c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f14822d;

    /* renamed from: e  reason: collision with root package name */
    public final t20 f14823e;

    /* renamed from: f  reason: collision with root package name */
    public final a f14824f;

    public gt(dt dtVar, String str, oq oqVar, Activity activity, t20 t20, a aVar) {
        this.f14819a = dtVar;
        this.f14820b = str;
        this.f14821c = oqVar;
        this.f14822d = activity;
        this.f14823e = t20;
        this.f14824f = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        dt dtVar = this.f14819a;
        String str = this.f14820b;
        oq oqVar = this.f14821c;
        Activity activity = this.f14822d;
        t20 t20 = this.f14823e;
        a aVar = this.f14824f;
        dtVar.o(str);
        if (oqVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            et.u6(activity, oqVar, t20, dtVar, str, "dialog_click", hashMap);
        }
        if (aVar != null) {
            aVar.s6();
        }
    }
}
