package e8;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import com.startapp.startappsdk.R;
import d7.l;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class a6 extends gf0 {

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f13657d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f13658e;

    /* renamed from: f  reason: collision with root package name */
    public String f13659f = v("description");

    /* renamed from: g  reason: collision with root package name */
    public long f13660g;

    /* renamed from: h  reason: collision with root package name */
    public long f13661h;

    /* renamed from: i  reason: collision with root package name */
    public String f13662i = v("summary");

    /* renamed from: r  reason: collision with root package name */
    public String f13663r;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f A[SYNTHETIC, Splitter:B:8:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a6(com.google.android.gms.internal.ads.t7 r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "createCalendarEvent"
            r2.<init>((com.google.android.gms.internal.ads.t7) r3, (java.lang.String) r0)
            r2.f13657d = r4
            android.app.Activity r3 = r3.b()
            r2.f13658e = r3
            java.lang.String r3 = "description"
            java.lang.String r3 = r2.v(r3)
            r2.f13659f = r3
            java.lang.String r3 = "summary"
            java.lang.String r3 = r2.v(r3)
            r2.f13662i = r3
            java.lang.String r3 = "start_ticks"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0 = -1
            if (r3 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            r2.f13660g = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.f13657d
            java.lang.String r4 = "end_ticks"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            long r0 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0043 }
        L_0x0043:
            r2.f13661h = r0
            java.lang.String r3 = "location"
            java.lang.String r3 = r2.v(r3)
            r2.f13663r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a6.<init>(com.google.android.gms.internal.ads.t7, java.util.Map):void");
    }

    public final void u() {
        Context context = this.f13658e;
        if (context == null) {
            s("Activity context is not available.");
            return;
        }
        p pVar = l.B.f13186c;
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        i.i(type, "Intent can not be null");
        if (!(!context.getPackageManager().queryIntentActivities(type, 0).isEmpty())) {
            s("This feature is not available on the device.");
            return;
        }
        p pVar2 = l.B.f13186c;
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13658e);
        Resources a10 = l.B.f13190g.a();
        builder.setTitle(a10 != null ? a10.getString(R.string.f28879s5) : "Create calendar event");
        builder.setMessage(a10 != null ? a10.getString(R.string.f28880s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(a10 != null ? a10.getString(R.string.f28877s3) : "Accept", new z5(this));
        builder.setNegativeButton(a10 != null ? a10.getString(R.string.f28878s4) : "Decline", new c6(this));
        builder.create().show();
    }

    public final String v(String str) {
        return TextUtils.isEmpty(this.f13657d.get(str)) ? "" : this.f13657d.get(str);
    }
}
