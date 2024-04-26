package dev.pankaj.ytvlib.app;

import ab.u;
import ab.v;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.app.d;
import c0.l;
import cb.d;
import ce.i;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.e;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import f0.g;
import java.util.Date;
import java.util.Map;
import r0.b;
import s.a;
import ud.k;

/* compiled from: FCM.kt */
public final class FCM extends FirebaseMessagingService {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f13481g = 0;

    public void c(v vVar) {
        if (vVar.f247c == null && u.l(vVar.f245a)) {
            vVar.f247c = new v.b(new u(vVar.f245a), (v.a) null);
        }
        v.b bVar = vVar.f247c;
        if (bVar != null) {
            e(bVar.f248a, bVar.f249b, (String) null);
            k.f(k.j("Message Notification Body: ", bVar.f249b), "msg");
        }
        if (vVar.f246b == null) {
            Bundle bundle = vVar.f245a;
            a aVar = new a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            vVar.f246b = aVar;
        }
        Map<String, String> map = vVar.f246b;
        k.e(map, "remoteMessage.data");
        if (!map.isEmpty()) {
            k.f(k.j("Message data payload: ", map), "msg");
            e(map.get("title"), map.get("message"), map.get("url"));
        }
    }

    public void d(String str) {
        FirebaseMessaging instance;
        k.f(str, "token");
        k.f(k.j("new token: ", str), "msg");
        e eVar = FirebaseMessaging.f9692m;
        synchronized (FirebaseMessaging.class) {
            instance = FirebaseMessaging.getInstance(com.google.firebase.a.b());
        }
        instance.f9703i.n(new d(getString(R.string.subscribe_topic))).b(new b(this));
    }

    public final void e(String str, String str2, String str3) {
        Intent intent;
        int i10;
        boolean z10 = true;
        if (str3 == null || i.d(str3)) {
            int i11 = MainActivity.O;
            intent = new Intent(this, MainActivity.class);
            intent.setFlags(268468224);
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str3));
            intent = intent2;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        k.e(activity, "getActivity(this, 0, intent, 0)");
        String string = getString(R.string.notification_channel_id);
        k.e(string, "getString(R.string.notification_channel_id)");
        l.d dVar = new l.d(this, string);
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f18046a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            i10 = g.c.a(resources, R.color.primaryColor, (Resources.Theme) null);
        } else {
            i10 = resources.getColor(R.color.primaryColor);
        }
        dVar.f3984p = i10;
        Notification notification = dVar.f3988t;
        notification.icon = R.drawable.ic_notifications;
        notification.vibrate = new long[]{1000, 1000};
        dVar.g(RingtoneManager.getDefaultUri(2));
        dVar.f3978j = 1;
        dVar.c(true);
        dVar.e(str);
        dVar.d(str2);
        l.c cVar = new l.c();
        cVar.d(str2);
        dVar.h(cVar);
        dVar.f3975g = activity;
        if (i12 >= 21) {
            dVar.f3982n = "msg";
        }
        androidx.core.app.d dVar2 = new androidx.core.app.d(this);
        int time = (int) ((new Date().getTime() / 1000) % ((long) Integer.MAX_VALUE));
        Notification a10 = dVar.a();
        Bundle a11 = l.a(a10);
        if (a11 == null || !a11.getBoolean("android.support.useSideChannel")) {
            z10 = false;
        }
        if (z10) {
            d.a aVar = new d.a(getPackageName(), time, (String) null, a10);
            synchronized (androidx.core.app.d.f1385f) {
                if (androidx.core.app.d.f1386g == null) {
                    androidx.core.app.d.f1386g = new d.c(getApplicationContext());
                }
                androidx.core.app.d.f1386g.f1396b.obtainMessage(0, aVar).sendToTarget();
            }
            dVar2.f1388b.cancel((String) null, time);
            return;
        }
        dVar2.f1388b.notify((String) null, time, a10);
    }
}
