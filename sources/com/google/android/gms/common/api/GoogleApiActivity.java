package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.i;
import s7.a;
import s7.d;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5736b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f5737a = 0;

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5737a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                b f10 = b.f(this);
                if (i11 == -1) {
                    Handler handler = f10.f5770v;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i11 == 0) {
                    f10.g(new a(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f5737a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5737a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5737a = bundle.getInt("resolution");
        }
        if (this.f5737a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f5737a = 1;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        b.f(this).g(new a(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String obj = pendingIntent.toString();
                        String a10 = androidx.fragment.app.a.a(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            a10 = a10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", a10, e10);
                    }
                    this.f5737a = 1;
                    finish();
                } catch (IntentSender.SendIntentException e11) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                }
            } else {
                i.h(num);
                int intValue = num.intValue();
                Object obj2 = d.f25010c;
                d.f25011d.f(this, intValue, 2, this);
                this.f5737a = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5737a);
        super.onSaveInstanceState(bundle);
    }
}
