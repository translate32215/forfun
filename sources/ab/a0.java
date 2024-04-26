package ab;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.b;
import com.google.firebase.messaging.g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class a0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f191f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f192g;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f193h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f194a;

    /* renamed from: b  reason: collision with root package name */
    public final b f195b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f196c;

    /* renamed from: d  reason: collision with root package name */
    public final g f197d;

    /* renamed from: e  reason: collision with root package name */
    public final long f198e;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public a0 f199a;

        public a(a0 a0Var) {
            this.f199a = a0Var;
        }

        public void a() {
            if (a0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            a0.this.f194a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            a0 a0Var = this.f199a;
            if (a0Var != null) {
                if (a0Var.e()) {
                    if (a0.a()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    a0 a0Var2 = this.f199a;
                    a0Var2.f197d.f9746g.schedule(a0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f199a = null;
                }
            }
        }
    }

    public a0(g gVar, Context context, b bVar, long j10) {
        this.f197d = gVar;
        this.f194a = context;
        this.f198e = j10;
        this.f195b = bVar;
        this.f196c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f191f) {
            Boolean bool = f193h;
            if (bool == null) {
                z10 = c(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f193h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (z10 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb2.toString());
        return false;
    }

    public static boolean d(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f191f) {
            Boolean bool = f192g;
            if (bool == null) {
                z10 = c(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f192g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f194a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        String str;
        if (d(this.f194a)) {
            this.f196c.acquire(c.f203a);
        }
        try {
            this.f197d.e(true);
            if (!this.f195b.d()) {
                this.f197d.e(false);
                if (d(this.f194a)) {
                    try {
                        this.f196c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!b(this.f194a) || e()) {
                if (this.f197d.g()) {
                    this.f197d.e(false);
                } else {
                    this.f197d.h(this.f198e);
                }
                if (d(this.f194a)) {
                    try {
                        this.f196c.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (d(this.f194a)) {
                    try {
                        this.f196c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() != 0) {
                str = "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                str = new String("Failed to sync topics. Won't retry sync. ");
            }
            Log.e("FirebaseMessaging", str);
            this.f197d.e(false);
            if (d(this.f194a)) {
                try {
                    this.f196c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (d(this.f194a)) {
                try {
                    this.f196c.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
