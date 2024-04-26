package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import o4.b;
import o4.i;
import o4.n;
import s4.d;
import s4.h;
import w4.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5012a = 0;

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        n.b(context);
        i.a a10 = i.a();
        a10.a(queryParameter);
        b.C0204b bVar = (b.C0204b) a10;
        bVar.f22941c = a.b(intValue);
        if (queryParameter2 != null) {
            bVar.f22940b = Base64.decode(queryParameter2, 0);
        }
        h hVar = n.a().f22966d;
        hVar.f24941e.execute(new d(hVar, bVar.b(), i10, s4.b.f24918a));
    }
}
