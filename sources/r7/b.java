package r7;

import a8.a;
import ab.t;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s8.i;
import s8.l;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f24685a;

    public b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f24685a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final int a(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (!t.c(putExtras)) {
                return -1;
            }
            t.b("_nd", putExtras.getExtras());
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final int b(Context context, Intent intent) {
        i iVar;
        int i10;
        int i11 = 500;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            iVar = l.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            i a10 = i.a(context);
            synchronized (a10) {
                i10 = a10.f24709d;
                a10.f24709d = i10 + 1;
            }
            iVar = a10.b(new n(i10, bundle));
        }
        try {
            i11 = ((Integer) l.a(new com.google.firebase.messaging.a(context).b(new a(intent).f24684a))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
        }
        try {
            l.b(iVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return i11;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.f24685a.execute(new h(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
