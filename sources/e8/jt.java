package e8;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.a;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class jt implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final dt f15189a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15190b;

    /* renamed from: c  reason: collision with root package name */
    public final oq f15191c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f15192d;

    /* renamed from: e  reason: collision with root package name */
    public final t20 f15193e;

    /* renamed from: f  reason: collision with root package name */
    public final a f15194f;

    public jt(dt dtVar, String str, oq oqVar, Activity activity, t20 t20, a aVar) {
        this.f15189a = dtVar;
        this.f15190b = str;
        this.f15191c = oqVar;
        this.f15192d = activity;
        this.f15193e = t20;
        this.f15194f = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        dt dtVar = this.f15189a;
        String str = this.f15190b;
        oq oqVar = this.f15191c;
        Activity activity = this.f15192d;
        t20 t20 = this.f15193e;
        a aVar = this.f15194f;
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
