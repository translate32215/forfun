package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import j1.a;
import k8.a1;
import o8.n3;
import o8.o3;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class AppMeasurementReceiver extends a implements n3 {

    /* renamed from: c  reason: collision with root package name */
    public o3 f8776c;

    public void onReceive(Context context, Intent intent) {
        if (this.f8776c == null) {
            this.f8776c = new o3(this);
        }
        o3 o3Var = this.f8776c;
        o3Var.getClass();
        h d10 = l.u(context, (a1) null, (Long) null).d();
        if (intent == null) {
            d10.f8800i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        d10.f8805n.b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            d10.f8805n.a("Starting wakeful intent.");
            ((AppMeasurementReceiver) o3Var.f23374a).getClass();
            SparseArray<PowerManager.WakeLock> sparseArray = a.f19480a;
            synchronized (sparseArray) {
                int i10 = a.f19481b;
                int i11 = i10 + 1;
                a.f19481b = i11;
                if (i11 <= 0) {
                    a.f19481b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName startService = context.startService(className);
                if (startService != null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000);
                    sparseArray.put(i10, newWakeLock);
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            d10.f8800i.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
