package com.google.firebase.messaging;

import ab.l;
import ab.m;
import ab.n;
import ab.q;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import cb.h;
import com.google.firebase.messaging.e;
import e8.ku;
import e8.qz;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import l4.g;
import ra.b;
import ra.d;
import s8.i;
import s8.v;
import s8.z;
import sa.e;
import va.c;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class FirebaseMessaging {

    /* renamed from: l  reason: collision with root package name */
    public static final long f9691l = TimeUnit.HOURS.toSeconds(8);
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: m  reason: collision with root package name */
    public static e f9692m;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: n  reason: collision with root package name */
    public static g f9693n;
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: o  reason: collision with root package name */
    public static ScheduledExecutorService f9694o;

    /* renamed from: a  reason: collision with root package name */
    public final com.google.firebase.a f9695a;

    /* renamed from: b  reason: collision with root package name */
    public final ta.a f9696b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9697c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f9698d;

    /* renamed from: e  reason: collision with root package name */
    public final q f9699e;

    /* renamed from: f  reason: collision with root package name */
    public final c f9700f;

    /* renamed from: g  reason: collision with root package name */
    public final a f9701g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f9702h;

    /* renamed from: i  reason: collision with root package name */
    public final i<g> f9703i;

    /* renamed from: j  reason: collision with root package name */
    public final b f9704j;
    @GuardedBy("this")

    /* renamed from: k  reason: collision with root package name */
    public boolean f9705k = false;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f9706a;
        @GuardedBy("this")

        /* renamed from: b  reason: collision with root package name */
        public boolean f9707b;
        @GuardedBy("this")

        /* renamed from: c  reason: collision with root package name */
        public b<fa.a> f9708c;
        @GuardedBy("this")

        /* renamed from: d  reason: collision with root package name */
        public Boolean f9709d;

        public a(d dVar) {
            this.f9706a = dVar;
        }

        public synchronized void a() {
            if (!this.f9707b) {
                Boolean c10 = c();
                this.f9709d = c10;
                if (c10 == null) {
                    n nVar = new n(this);
                    this.f9708c = nVar;
                    this.f9706a.a(fa.a.class, nVar);
                }
                this.f9707b = true;
            }
        }

        public synchronized boolean b() {
            boolean z10;
            a();
            Boolean bool = this.f9709d;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = FirebaseMessaging.this.f9695a.f();
            }
            return z10;
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            com.google.firebase.a aVar = FirebaseMessaging.this.f9695a;
            aVar.a();
            Context context = aVar.f9662a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(com.google.firebase.a aVar, ta.a aVar2, ua.a<h> aVar3, ua.a<e> aVar4, c cVar, g gVar, d dVar) {
        com.google.firebase.a aVar5 = aVar;
        ta.a aVar6 = aVar2;
        aVar.a();
        b bVar = new b(aVar5.f9662a);
        q qVar = new q(aVar, bVar, aVar3, aVar4, cVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a8.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a8.a("Firebase-Messaging-Init"));
        f9693n = gVar;
        this.f9695a = aVar5;
        this.f9696b = aVar6;
        this.f9697c = cVar;
        this.f9701g = new a(dVar);
        aVar.a();
        Context context = aVar5.f9662a;
        this.f9698d = context;
        l lVar = new l();
        this.f9704j = bVar;
        this.f9702h = newSingleThreadExecutor;
        this.f9699e = qVar;
        this.f9700f = new c(newSingleThreadExecutor);
        aVar.a();
        Context context2 = aVar5.f9662a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(lVar);
        } else {
            String valueOf = String.valueOf(context2);
            ab.a.a(new StringBuilder(valueOf.length() + 125), "Context ", valueOf, " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.", "FirebaseMessaging");
        }
        if (aVar6 != null) {
            aVar6.c(new m(this, 0));
        }
        synchronized (FirebaseMessaging.class) {
            if (f9692m == null) {
                f9692m = new e(context);
            }
        }
        scheduledThreadPoolExecutor.execute(new qz(this));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a8.a("Firebase-Messaging-Topics-Io"));
        int i10 = g.f9739k;
        i<g> c10 = s8.l.c(scheduledThreadPoolExecutor2, new ku(context, (ScheduledExecutorService) scheduledThreadPoolExecutor2, this, cVar, bVar, qVar));
        this.f9703i = c10;
        z zVar = (z) c10;
        zVar.f25071b.a(new v(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a8.a("Firebase-Messaging-Trigger-Topics-Io")), new m(this, 1)));
        zVar.s();
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(com.google.firebase.a aVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            aVar.a();
            firebaseMessaging = (FirebaseMessaging) aVar.f9665d.a(cls);
            com.google.android.gms.common.internal.i.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public String a() throws IOException {
        ta.a aVar = this.f9696b;
        if (aVar != null) {
            try {
                return (String) s8.l.a(aVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            e.a d10 = d();
            if (!i(d10)) {
                return d10.f9731a;
            }
            String b10 = b.b(this.f9695a);
            try {
                String str = (String) s8.l.a(this.f9697c.getId().f(Executors.newSingleThreadExecutor(new a8.a("Firebase-Messaging-Network-Io")), new androidx.appcompat.widget.m(this, b10)));
                f9692m.b(c(), b10, str, this.f9704j.a());
                if (d10 == null || !str.equals(d10.f9731a)) {
                    e(str);
                }
                return str;
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f9694o == null) {
                f9694o = new ScheduledThreadPoolExecutor(1, new a8.a("TAG"));
            }
            f9694o.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public final String c() {
        com.google.firebase.a aVar = this.f9695a;
        aVar.a();
        if ("[DEFAULT]".equals(aVar.f9663b)) {
            return "";
        }
        return this.f9695a.c();
    }

    public e.a d() {
        e.a b10;
        e eVar = f9692m;
        String c10 = c();
        String b11 = b.b(this.f9695a);
        synchronized (eVar) {
            b10 = e.a.b(eVar.f9728a.getString(eVar.a(c10, b11), (String) null));
        }
        return b10;
    }

    public final void e(String str) {
        String str2;
        com.google.firebase.a aVar = this.f9695a;
        aVar.a();
        if ("[DEFAULT]".equals(aVar.f9663b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                com.google.firebase.a aVar2 = this.f9695a;
                aVar2.a();
                String valueOf = String.valueOf(aVar2.f9663b);
                if (valueOf.length() != 0) {
                    str2 = "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    str2 = new String("Invoking onNewToken for app: ");
                }
                Log.d("FirebaseMessaging", str2);
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new a(this.f9698d).b(intent);
        }
    }

    public synchronized void f(boolean z10) {
        this.f9705k = z10;
    }

    public final void g() {
        ta.a aVar = this.f9696b;
        if (aVar != null) {
            aVar.b();
        } else if (i(d())) {
            synchronized (this) {
                if (!this.f9705k) {
                    h(0);
                }
            }
        }
    }

    public synchronized void h(long j10) {
        b(new f(this, Math.min(Math.max(30, j10 + j10), f9691l)), j10);
        this.f9705k = true;
    }

    public boolean i(e.a aVar) {
        if (aVar != null) {
            if (System.currentTimeMillis() > aVar.f9733c + e.a.f9730d || !this.f9704j.a().equals(aVar.f9732b)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
