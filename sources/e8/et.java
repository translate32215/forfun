package e8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import c0.l;
import c8.b;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.ig;
import com.google.android.gms.internal.ads.l4;
import com.google.android.gms.internal.ads.ri;
import com.startapp.startappsdk.R;
import d7.l;
import f7.f0;
import java.util.HashMap;
import java.util.Map;
import l0.e;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class et extends l4 {

    /* renamed from: b  reason: collision with root package name */
    public final Context f14509b;

    /* renamed from: c  reason: collision with root package name */
    public final oq f14510c;

    /* renamed from: d  reason: collision with root package name */
    public final c9 f14511d;

    /* renamed from: e  reason: collision with root package name */
    public final dt f14512e;

    /* renamed from: f  reason: collision with root package name */
    public final t20 f14513f;

    public et(Context context, dt dtVar, c9 c9Var, oq oqVar, t20 t20) {
        this.f14509b = context;
        this.f14510c = oqVar;
        this.f14511d = c9Var;
        this.f14512e = dtVar;
        this.f14513f = t20;
    }

    public static void s6(Activity activity, a aVar, f fVar, dt dtVar, oq oqVar, t20 t20, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        l lVar = l.B;
        p pVar = lVar.f13186c;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, lVar.f13188e.q());
        Resources a10 = l.B.f13190g.a();
        if (a10 == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = a10.getString(R.string.offline_opt_in_title);
        }
        AlertDialog.Builder title = builder.setTitle(str3);
        if (a10 == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = a10.getString(R.string.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (a10 == null) {
            str5 = "OK";
        } else {
            str5 = a10.getString(R.string.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new ht(oqVar, activity, t20, dtVar, str, fVar, str2, a10, aVar));
        if (a10 == null) {
            str6 = "No thanks";
        } else {
            str6 = a10.getString(R.string.offline_opt_in_decline);
        }
        dt dtVar2 = dtVar;
        String str7 = str;
        oq oqVar2 = oqVar;
        Activity activity2 = activity;
        t20 t202 = t20;
        a aVar2 = aVar;
        positiveButton.setNegativeButton(str6, new gt(dtVar2, str7, oqVar2, activity2, t202, aVar2)).setOnCancelListener(new jt(dtVar2, str7, oqVar2, activity2, t202, aVar2));
        builder.create().show();
    }

    public static void t6(Context context, oq oqVar, t20 t20, dt dtVar, String str, String str2) {
        u6(context, oqVar, t20, dtVar, str, str2, new HashMap());
    }

    public static void u6(Context context, oq oqVar, t20 t20, dt dtVar, String str, String str2, Map<String, String> map) {
        String str3;
        String str4 = "online";
        if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
            u20 c10 = u20.c(str2);
            c10.f16842a.put("gqi", str);
            p pVar = l.B.f13186c;
            if (!p.t(context)) {
                str4 = "offline";
            }
            c10.f16842a.put("device_connectivity", str4);
            c10.f16842a.put("event_timestamp", String.valueOf(l.B.f13193j.b()));
            for (Map.Entry next : map.entrySet()) {
                c10.f16842a.put((String) next.getKey(), (String) next.getValue());
            }
            str3 = t20.b(c10);
        } else {
            p9 a10 = oqVar.a();
            ((Map) a10.f15880b).put("gqi", str);
            ((Map) a10.f15880b).put("action", str2);
            p pVar2 = l.B.f13186c;
            if (!p.t(context)) {
                str4 = "offline";
            }
            ((Map) a10.f15880b).put("device_connectivity", str4);
            ((Map) a10.f15880b).put("event_timestamp", String.valueOf(l.B.f13193j.b()));
            for (Map.Entry next2 : map.entrySet()) {
                a10.o((String) next2.getKey(), (String) next2.getValue());
            }
            str3 = ((oq) a10.f15881c).f15830a.f16512e.a((Map) a10.f15880b);
        }
        dtVar.i(new c(dtVar, new ft(l.B.f13193j.b(), str, str3, 2)));
    }

    public final void E5(c8.a aVar, String str, String str2) {
        String str3;
        String str4;
        Context context = (Context) b.z0(aVar);
        int i10 = Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        PendingIntent a10 = ig.a(context, intent, i10);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a11 = ig.a(context, intent2, i10);
        Resources a12 = l.B.f13190g.a();
        l.d dVar = new l.d(context, "offline_notification_channel");
        if (a12 == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = a12.getString(R.string.offline_notification_title);
        }
        dVar.e(str3);
        if (a12 == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = a12.getString(R.string.offline_notification_text);
        }
        dVar.d(str4);
        dVar.c(true);
        dVar.f3988t.deleteIntent = a11;
        dVar.f3975g = a10;
        dVar.f3988t.icon = context.getApplicationInfo().icon;
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, dVar.a());
        u6(this.f14509b, this.f14510c, this.f14513f, this.f14512e, str2, "offline_notification_impression", new HashMap());
    }

    public final void h4(Intent intent) {
        char c10;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            p pVar = d7.l.B.f13186c;
            boolean t10 = p.t(this.f14509b);
            HashMap hashMap = new HashMap();
            char c11 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (t10) {
                    c11 = 1;
                }
                Context context = this.f14509b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
                c10 = c11;
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
                c10 = 2;
            }
            u6(this.f14509b, this.f14510c, this.f14513f, this.f14512e, stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f14512e.getWritableDatabase();
                if (c10 == 1) {
                    this.f14512e.f14330b.execute(new f0(writableDatabase, stringExtra2, this.f14511d));
                    return;
                }
                dt.d(writableDatabase, stringExtra2);
            } catch (SQLiteException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 51);
                sb2.append("Failed to get writable offline buffering database: ");
                sb2.append(valueOf);
                e.I(sb2.toString());
            }
        }
    }

    public final void s4() {
        this.f14512e.i(new ri(this.f14511d));
    }
}
