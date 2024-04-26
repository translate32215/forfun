package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.t2;
import e8.ti0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    public void onHandleIntent(Intent intent) {
        try {
            ti0.f16763j.f16765b.a(this, new t2()).h4(intent);
        } catch (RemoteException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
            sb2.append("RemoteException calling handleNotificationIntent: ");
            sb2.append(valueOf);
            e.I(sb2.toString());
        }
    }
}
