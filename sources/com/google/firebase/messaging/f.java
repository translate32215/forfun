package com.google.firebase.messaging;

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
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f9734a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f9735b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f9736c;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class a extends BroadcastReceiver {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public f f9737a;

        public a(f fVar) {
            this.f9737a = fVar;
        }

        public void a() {
            if (f.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f9737a.f9736c.f9698d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            f fVar = this.f9737a;
            if (fVar != null && fVar.b()) {
                if (f.a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                f fVar2 = this.f9737a;
                fVar2.f9736c.b(fVar2, 0);
                this.f9737a.f9736c.f9698d.unregisterReceiver(this);
                this.f9737a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public f(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a8.a("firebase-iid-executor"));
        this.f9736c = firebaseMessaging;
        this.f9734a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f9698d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9735b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9736c.f9698d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean c() throws IOException {
        boolean z10 = true;
        try {
            if (this.f9736c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                String message2 = e10.getMessage();
                ab.a.a(new StringBuilder(String.valueOf(message2).length() + 52), "Token retrieval failed: ", message2, ". Will retry token retrieval", "FirebaseMessaging");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (d.a().c(this.f9736c.f9698d)) {
            this.f9735b.acquire();
        }
        try {
            this.f9736c.f(true);
            if (!this.f9736c.f9704j.d()) {
                this.f9736c.f(false);
                if (!d.a().c(this.f9736c.f9698d)) {
                    return;
                }
            } else if (!d.a().b(this.f9736c.f9698d) || b()) {
                if (c()) {
                    this.f9736c.f(false);
                } else {
                    this.f9736c.h(this.f9734a);
                }
                if (!d.a().c(this.f9736c.f9698d)) {
                    return;
                }
            } else {
                new a(this).a();
                if (!d.a().c(this.f9736c.f9698d)) {
                    return;
                }
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
            sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb2.append(message);
            sb2.append(". Won't retry the operation.");
            Log.e("FirebaseMessaging", sb2.toString());
            this.f9736c.f(false);
            if (!d.a().c(this.f9736c.f9698d)) {
                return;
            }
        } catch (Throwable th) {
            if (d.a().c(this.f9736c.f9698d)) {
                this.f9735b.release();
            }
            throw th;
        }
        this.f9735b.release();
    }
}
