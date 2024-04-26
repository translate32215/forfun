package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g2.e;
import r2.a;

/* compiled from: StorageNotLowTracker */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f21848i = e.e("StorageNotLowTracker");

    public f(Context context, a aVar) {
        super(context, aVar);
    }

    public Object a() {
        Context context = this.f21836b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }

    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void g(Context context, Intent intent) {
        if (intent.getAction() != null) {
            e.c().a(f21848i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c(Boolean.TRUE);
            }
        }
    }
}
