package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.internal.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import k0.l;
import la.j;
import la.r;
import s.i;

/* compiled from: FirebaseApp */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f9659i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f9660j = new d((C0106a) null);
    @GuardedBy("LOCK")

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, a> f9661k = new s.a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9662a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9663b;

    /* renamed from: c  reason: collision with root package name */
    public final fa.d f9664c;

    /* renamed from: d  reason: collision with root package name */
    public final j f9665d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f9666e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f9667f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final r<za.a> f9668g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f9669h = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp */
    public interface b {
        void a(boolean z10);
    }

    @TargetApi(14)
    /* compiled from: FirebaseApp */
    public static class c implements a.C0082a {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<c> f9670a = new AtomicReference<>();

        public void a(boolean z10) {
            Object obj = a.f9659i;
            synchronized (a.f9659i) {
                Iterator it = new ArrayList(((s.a) a.f9661k).values()).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.f9666e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b a10 : aVar.f9669h) {
                            a10.a(z10);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp */
    public static class d implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f9671a = new Handler(Looper.getMainLooper());

        public d(C0106a aVar) {
        }

        public void execute(Runnable runnable) {
            f9671a.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: FirebaseApp */
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<e> f9672b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f9673a;

        public e(Context context) {
            this.f9673a = context;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = a.f9659i;
            synchronized (a.f9659i) {
                for (a d10 : ((s.a) a.f9661k).values()) {
                    d10.d();
                }
            }
            this.f9673a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[LOOP:1: B:26:0x00b2->B:28:0x00b8, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r9, java.lang.String r10, fa.d r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f9666e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f9667f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f9669h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f9662a = r9
            com.google.android.gms.common.internal.i.e(r10)
            r8.f9663b = r10
            if (r11 == 0) goto L_0x011a
            r8.f9664c = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r10 = "Context has no PackageManager."
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x0069
        L_0x003f:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0064 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0064 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r4 != 0) goto L_0x0061
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0064 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0064 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0064 }
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x0069
        L_0x0061:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x0069:
            r10 = r3
        L_0x006a:
            if (r10 != 0) goto L_0x0076
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00ae
        L_0x0076:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0083:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0083
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0083
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0083
        L_0x00ad:
            r10 = r2
        L_0x00ae:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b2:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            la.e r4 = new la.e
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00b2
        L_0x00c7:
            java.util.concurrent.Executor r10 = f9660j
            int r2 = la.j.f21203g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            la.k r5 = new la.k
            r5.<init>((la.g) r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            la.c r0 = la.c.c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<com.google.firebase.a> r0 = com.google.firebase.a.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            la.c r0 = la.c.c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<fa.d> r0 = fa.d.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            la.c r11 = la.c.c(r11, r0, r1)
            r4.add(r11)
            la.j r11 = new la.j
            r11.<init>(r10, r2, r4, r3)
            r8.f9665d = r11
            la.r r10 = new la.r
            fa.b r11 = new fa.b
            r11.<init>(r8, r9)
            r10.<init>(r11)
            r8.f9668g = r10
            return
        L_0x011a:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null reference"
            r9.<init>(r10)
            goto L_0x0123
        L_0x0122:
            throw r9
        L_0x0123:
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.a.<init>(android.content.Context, java.lang.String, fa.d):void");
    }

    public static a b() {
        a aVar;
        synchronized (f9659i) {
            aVar = (a) ((i) f9661k).get("[DEFAULT]");
            if (aVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return aVar;
    }

    public static a e(Context context, fa.d dVar) {
        a aVar;
        AtomicReference<c> atomicReference = c.f9670a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (c.f9670a.get() == null) {
                c cVar = new c();
                if (c.f9670a.compareAndSet((Object) null, cVar)) {
                    com.google.android.gms.common.api.internal.a.a(application);
                    com.google.android.gms.common.api.internal.a aVar2 = com.google.android.gms.common.api.internal.a.f5749e;
                    aVar2.getClass();
                    synchronized (aVar2) {
                        aVar2.f5752c.add(cVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9659i) {
            Map<String, a> map = f9661k;
            boolean z10 = true;
            if (((i) map).e("[DEFAULT]") >= 0) {
                z10 = false;
            }
            com.google.android.gms.common.internal.i.k(z10, "FirebaseApp name [DEFAULT] already exists!");
            com.google.android.gms.common.internal.i.i(context, "Application context cannot be null.");
            aVar = new a(context, "[DEFAULT]", dVar);
            ((i) map).put("[DEFAULT]", aVar);
        }
        aVar.d();
        return aVar;
    }

    public final void a() {
        com.google.android.gms.common.internal.i.k(!this.f9667f.get(), "FirebaseApp was deleted");
    }

    public String c() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f9663b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb2.append(str);
        sb2.append("+");
        a();
        byte[] bytes2 = this.f9664c.f18333b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!(Build.VERSION.SDK_INT >= 24 ? l.a(this.f9662a) : true)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f9663b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f9662a;
            if (e.f9672b.get() == null) {
                e eVar = new e(context);
                if (e.f9672b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f9663b);
        Log.i("FirebaseApp", sb3.toString());
        j jVar = this.f9665d;
        boolean g10 = g();
        if (jVar.f21209f.compareAndSet((Object) null, Boolean.valueOf(g10))) {
            synchronized (jVar) {
                hashMap = new HashMap(jVar.f21204a);
            }
            jVar.e(hashMap, g10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        String str = this.f9663b;
        a aVar = (a) obj;
        aVar.a();
        return str.equals(aVar.f9663b);
    }

    public boolean f() {
        boolean z10;
        a();
        za.a aVar = this.f9668g.get();
        synchronized (aVar) {
            z10 = aVar.f28778d;
        }
        return z10;
    }

    public boolean g() {
        a();
        return "[DEFAULT]".equals(this.f9663b);
    }

    public int hashCode() {
        return this.f9663b.hashCode();
    }

    public String toString() {
        h.a aVar = new h.a(this);
        aVar.a("name", this.f9663b);
        aVar.a("options", this.f9664c);
        return aVar.toString();
    }
}
