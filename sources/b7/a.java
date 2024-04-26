package b7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import f8.c;
import f8.d;
import f8.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import s7.f;
import s7.g;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class a {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public com.google.android.gms.common.a f3641a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public e f3642b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public boolean f3643c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3644d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e  reason: collision with root package name */
    public c f3645e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public final Context f3646f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3647g;

    /* renamed from: b7.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class C0050a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3648a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3649b;

        @Deprecated
        public C0050a(String str, boolean z10) {
            this.f3648a = str;
            this.f3649b = z10;
        }

        public String toString() {
            String str = this.f3648a;
            boolean z10 = this.f3649b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        if (context != null) {
            if (z10 && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            this.f3646f = context;
            this.f3643c = false;
            this.f3647g = j10;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static C0050a a(Context context) throws IOException, IllegalStateException, f, g {
        a aVar = new a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0050a f10 = aVar.f(-1);
            aVar.e(f10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            aVar.c();
            return f10;
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
    }

    public static boolean b(Context context) throws IOException, f, g {
        boolean f10;
        a aVar = new a(context, -1, false, false);
        try {
            aVar.d(false);
            i.g("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                if (!aVar.f3643c) {
                    synchronized (aVar.f3644d) {
                        c cVar = aVar.f3645e;
                        if (cVar == null || !cVar.f3654d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        aVar.d(false);
                        if (!aVar.f3643c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    } catch (Exception e11) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                    }
                }
                i.h(aVar.f3641a);
                i.h(aVar.f3642b);
                f10 = aVar.f3642b.f();
            }
            aVar.g();
            return f10;
        } finally {
            aVar.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.i.g(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f3646f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.f3641a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f3643c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            y7.a r0 = y7.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f3646f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.f3641a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f3643c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f3642b = r0     // Catch:{ all -> 0x0033 }
            r3.f3641a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a.c():void");
    }

    public final void d(boolean z10) throws IOException, IllegalStateException, f, g {
        e eVar;
        i.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3643c) {
                    c();
                }
                Context context = this.f3646f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int d10 = s7.e.f25013b.d(context, 12451000);
                if (d10 != 0) {
                    if (d10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (y7.a.b().a(context, intent, aVar, 1)) {
                    this.f3641a = aVar;
                    IBinder a10 = aVar.a(10000, TimeUnit.MILLISECONDS);
                    int i10 = d.f18329a;
                    IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (queryLocalInterface instanceof e) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        eVar = new c(a10);
                    }
                    this.f3642b = eVar;
                    this.f3643c = true;
                    if (z10) {
                        g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new f(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(C0050a aVar, boolean z10, float f10, long j10, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("app_context", str);
        if (aVar != null) {
            if (true != aVar.f3649b) {
                str = "0";
            }
            hashMap.put("limit_ad_tracking", str);
            String str2 = aVar.f3648a;
            if (str2 != null) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(hashMap).start();
        return true;
    }

    public final C0050a f(int i10) throws IOException {
        C0050a aVar;
        i.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f3643c) {
                synchronized (this.f3644d) {
                    c cVar = this.f3645e;
                    if (cVar == null || !cVar.f3654d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.f3643c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            i.h(this.f3641a);
            i.h(this.f3642b);
            aVar = new C0050a(this.f3642b.e(), this.f3642b.L2(true));
        }
        g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3644d
            monitor-enter(r0)
            b7.c r1 = r6.f3645e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f3653c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            b7.c r1 = r6.f3645e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f3647g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            b7.c r3 = new b7.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f3645e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a.g():void");
    }
}
