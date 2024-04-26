package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.a;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import z7.h;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9716a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public String f9717b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public String f9718c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public int f9719d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public int f9720e = 0;

    public b(Context context) {
        this.f9716a = context;
    }

    public static String b(a aVar) {
        aVar.a();
        String str = aVar.f9664c.f18336e;
        if (str != null) {
            return str;
        }
        aVar.a();
        String str2 = aVar.f9664c.f18333b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        if (this.f9717b == null) {
            e();
        }
        return this.f9717b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f9716a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
    }

    public boolean d() {
        int i10;
        synchronized (this) {
            i10 = this.f9720e;
            if (i10 == 0) {
                PackageManager packageManager = this.f9716a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!h.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                this.f9720e = 1;
                                i10 = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            this.f9720e = 2;
                            i10 = 2;
                        }
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (h.d()) {
                        this.f9720e = 2;
                        i10 = 2;
                    } else {
                        this.f9720e = 1;
                        i10 = 1;
                    }
                }
            }
        }
        return i10 != 0;
    }

    public final synchronized void e() {
        PackageInfo c10 = c(this.f9716a.getPackageName());
        if (c10 != null) {
            this.f9717b = Integer.toString(c10.versionCode);
            this.f9718c = c10.versionName;
        }
    }
}
