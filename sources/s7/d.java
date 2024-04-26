package s7;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.a0;
import androidx.fragment.app.q;
import c0.l;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.k;
import com.startapp.startappsdk.R;
import v7.l;
import v7.m;
import v7.n;
import z7.f;
import z7.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f25010c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final d f25011d = new d();

    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    public int d(Context context, int i10) {
        return super.d(context, i10);
    }

    public int e(Context context) {
        return super.d(context, e.f25012a);
    }

    public boolean f(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog g10 = g(activity, i10, new l(super.b(activity, i10, "d"), activity, i11), onCancelListener);
        if (g10 == null) {
            return false;
        }
        h(activity, g10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog g(Context context, int i10, n nVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(k.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 == 1) {
            str = resources.getString(R.string.common_google_play_services_install_button);
        } else if (i10 == 2) {
            str = resources.getString(R.string.common_google_play_services_update_button);
        } else if (i10 != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(R.string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, nVar);
        }
        String c10 = k.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
        return builder.create();
    }

    public final void h(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof q) {
                a0 F = ((q) activity).F();
                j jVar = new j();
                i.i(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                jVar.D0 = dialog;
                if (onCancelListener != null) {
                    jVar.E0 = onCancelListener;
                }
                jVar.w0(F, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        i.i(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f25004a = dialog;
        if (onCancelListener != null) {
            bVar.f25005b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void i(Context context, int i10, String str, PendingIntent pendingIntent) {
        String str2;
        String str3;
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i10 == 6) {
                str2 = k.e(context, "common_google_play_services_resolution_required_title");
            } else {
                str2 = k.c(context, i10);
            }
            if (str2 == null) {
                str2 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i10 == 6 || i10 == 19) {
                str3 = k.d(context, "common_google_play_services_resolution_required_text", k.a(context));
            } else {
                str3 = k.b(context, i10);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            i.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            l.d dVar = new l.d(context, (String) null);
            dVar.f3981m = true;
            dVar.c(true);
            dVar.e(str2);
            l.c cVar = new l.c();
            cVar.d(str3);
            dVar.h(cVar);
            if (f.b(context)) {
                i.j(Build.VERSION.SDK_INT >= 20);
                dVar.f3988t.icon = context.getApplicationInfo().icon;
                dVar.f3978j = 2;
                if (f.c(context)) {
                    dVar.f3970b.add(new l.a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    dVar.f3975g = pendingIntent;
                }
            } else {
                dVar.f3988t.icon = 17301642;
                dVar.f3988t.tickerText = l.d.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                dVar.f3988t.when = System.currentTimeMillis();
                dVar.f3975g = pendingIntent;
                dVar.d(str3);
            }
            if (h.d()) {
                i.j(h.d());
                synchronized (f25010c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                s.i<String, String> iVar = k.f5873a;
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                dVar.f3986r = "com.google.android.gms.availability";
            }
            Notification a10 = dVar.a();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                i.f25015a.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, a10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean j(Activity activity, u7.d dVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog g10 = g(activity, i10, new m(super.b(activity, i10, "d"), dVar), onCancelListener);
        if (g10 == null) {
            return false;
        }
        h(activity, g10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
