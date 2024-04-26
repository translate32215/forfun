package e8;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import com.startapp.startappsdk.R;
import d7.l;
import java.util.HashMap;
import java.util.Timer;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ht implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final oq f14934a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f14935b;

    /* renamed from: c  reason: collision with root package name */
    public final t20 f14936c;

    /* renamed from: d  reason: collision with root package name */
    public final dt f14937d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14938e;

    /* renamed from: f  reason: collision with root package name */
    public final f f14939f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14940g;

    /* renamed from: h  reason: collision with root package name */
    public final Resources f14941h;

    /* renamed from: i  reason: collision with root package name */
    public final a f14942i;

    public ht(oq oqVar, Activity activity, t20 t20, dt dtVar, String str, f fVar, String str2, Resources resources, a aVar) {
        this.f14934a = oqVar;
        this.f14935b = activity;
        this.f14936c = t20;
        this.f14937d = dtVar;
        this.f14938e = str;
        this.f14939f = fVar;
        this.f14940g = str2;
        this.f14941h = resources;
        this.f14942i = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        a aVar;
        String str;
        oq oqVar = this.f14934a;
        Activity activity = this.f14935b;
        t20 t20 = this.f14936c;
        dt dtVar = this.f14937d;
        String str2 = this.f14938e;
        f fVar = this.f14939f;
        String str3 = this.f14940g;
        Resources resources = this.f14941h;
        a aVar2 = this.f14942i;
        if (oqVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "confirm");
            aVar = aVar2;
            et.u6(activity, oqVar, t20, dtVar, str2, "dialog_click", hashMap);
        } else {
            aVar = aVar2;
        }
        boolean z10 = false;
        try {
            z10 = fVar.zzd(new b(activity), str3, str2);
        } catch (RemoteException e10) {
            e.C("Failed to schedule offline notification poster.", e10);
        }
        if (!z10) {
            dtVar.o(str2);
            if (oqVar != null) {
                et.t6(activity, oqVar, t20, dtVar, str2, "offline_notification_worker_not_scheduled");
            }
        }
        l lVar = l.B;
        p pVar = lVar.f13186c;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, lVar.f13188e.q());
        if (resources == null) {
            str = "You'll get a notification with the link when you're back online";
        } else {
            str = resources.getString(R.string.offline_opt_in_confirmation);
        }
        builder.setMessage(str).setOnCancelListener(new it(aVar));
        AlertDialog create = builder.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new kt(create, timer, aVar), 3000);
    }
}
