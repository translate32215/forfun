package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.j4;
import com.google.android.gms.internal.ads.t2;
import e8.ti0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: f  reason: collision with root package name */
    public final j4 f5606f;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5606f = ti0.f16763j.f16765b.a(context, new t2());
    }

    public ListenableWorker.a doWork() {
        try {
            this.f5606f.s4();
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0040a();
        }
    }
}
