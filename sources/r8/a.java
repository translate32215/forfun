package r8;

import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import e8.qz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import z7.b;
import z7.e;

@ThreadSafe
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class a {

    /* renamed from: o  reason: collision with root package name */
    public static final long f24735o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: p  reason: collision with root package name */
    public static volatile ScheduledExecutorService f24736p = null;

    /* renamed from: q  reason: collision with root package name */
    public static final Object f24737q = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f24738a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f24739b;

    /* renamed from: c  reason: collision with root package name */
    public int f24740c = 0;

    /* renamed from: d  reason: collision with root package name */
    public Future<?> f24741d;

    /* renamed from: e  reason: collision with root package name */
    public long f24742e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<c> f24743f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f24744g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f24745h;

    /* renamed from: i  reason: collision with root package name */
    public l8.a f24746i;

    /* renamed from: j  reason: collision with root package name */
    public b f24747j = e.f28726a;

    /* renamed from: k  reason: collision with root package name */
    public final String f24748k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, b> f24749l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public AtomicInteger f24750m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public final ScheduledExecutorService f24751n;

    static {
        new d2.a(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getPackageName()
            r6.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.f24738a = r1
            r1 = 0
            r6.f24740c = r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r6.f24743f = r2
            r2 = 1
            r6.f24744g = r2
            z7.e r3 = z7.e.f28726a
            r6.f24747j = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r6.f24749l = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r1)
            r6.f24750m = r3
            java.lang.String r3 = "WakeLock: wakeLockName must not be empty"
            com.google.android.gms.common.internal.i.f(r9, r3)
            r7.getApplicationContext()
            r3 = 0
            r6.f24746i = r3
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r5 = r7.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x005a
            java.lang.String r4 = "*gcore*:"
            int r5 = r9.length()
            if (r5 == 0) goto L_0x0051
            java.lang.String r4 = r4.concat(r9)
            goto L_0x0057
        L_0x0051:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0057:
            r6.f24748k = r4
            goto L_0x005c
        L_0x005a:
            r6.f24748k = r9
        L_0x005c:
            java.lang.String r4 = "power"
            java.lang.Object r4 = r7.getSystemService(r4)
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            if (r4 == 0) goto L_0x0130
            android.os.PowerManager$WakeLock r8 = r4.newWakeLock(r8, r9)
            r6.f24739b = r8
            java.lang.reflect.Method r8 = z7.j.f28732a
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            if (r8 != 0) goto L_0x0075
            goto L_0x008d
        L_0x0075:
            b8.b r8 = b8.c.a(r7)
            java.lang.String r9 = r7.getPackageName()
            android.content.Context r8 = r8.f3657a
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r4 = "android.permission.UPDATE_DEVICE_STATS"
            int r8 = r8.checkPermission(r4, r9)
            if (r8 != 0) goto L_0x008d
            r8 = 1
            goto L_0x008e
        L_0x008d:
            r8 = 0
        L_0x008e:
            if (r8 == 0) goto L_0x0111
            boolean r8 = com.google.android.gms.common.util.e.a(r0)
            if (r8 == 0) goto L_0x009a
            java.lang.String r0 = r7.getPackageName()
        L_0x009a:
            java.lang.String r8 = "WorkSourceUtil"
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            if (r9 == 0) goto L_0x00fd
            if (r0 == 0) goto L_0x00fd
            b8.b r7 = b8.c.a(r7)     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.Context r7 = r7.f3657a     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x00f4 }
            if (r7 != 0) goto L_0x00be
            java.lang.String r7 = "Could not get applicationInfo from package: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.e(r8, r7)
            goto L_0x00fd
        L_0x00be:
            int r7 = r7.uid
            android.os.WorkSource r3 = new android.os.WorkSource
            r3.<init>()
            java.lang.reflect.Method r9 = z7.j.f28733b
            java.lang.String r4 = "Unable to assign blame through WorkSource"
            if (r9 == 0) goto L_0x00df
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00da }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00da }
            r5[r1] = r7     // Catch:{ Exception -> 0x00da }
            r5[r2] = r0     // Catch:{ Exception -> 0x00da }
            r9.invoke(r3, r5)     // Catch:{ Exception -> 0x00da }
            goto L_0x00fd
        L_0x00da:
            r7 = move-exception
            android.util.Log.wtf(r8, r4, r7)
            goto L_0x00fd
        L_0x00df:
            java.lang.reflect.Method r9 = z7.j.f28732a
            if (r9 == 0) goto L_0x00fd
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ef }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00ef }
            r0[r1] = r7     // Catch:{ Exception -> 0x00ef }
            r9.invoke(r3, r0)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00fd
        L_0x00ef:
            r7 = move-exception
            android.util.Log.wtf(r8, r4, r7)
            goto L_0x00fd
        L_0x00f4:
            java.lang.String r7 = "Could not find package: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.e(r8, r7)
        L_0x00fd:
            if (r3 == 0) goto L_0x0111
            android.os.PowerManager$WakeLock r7 = r6.f24739b
            r7.setWorkSource(r3)     // Catch:{ IllegalArgumentException -> 0x0107, ArrayIndexOutOfBoundsException -> 0x0105 }
            goto L_0x0111
        L_0x0105:
            r7 = move-exception
            goto L_0x0108
        L_0x0107:
            r7 = move-exception
        L_0x0108:
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "WakeLock"
            android.util.Log.wtf(r8, r7)
        L_0x0111:
            java.util.concurrent.ScheduledExecutorService r7 = f24736p
            if (r7 != 0) goto L_0x012d
            java.lang.Object r8 = f24737q
            monitor-enter(r8)
            java.util.concurrent.ScheduledExecutorService r7 = f24736p     // Catch:{ all -> 0x012a }
            if (r7 != 0) goto L_0x0128
            d2.a r7 = l8.b.f21106a     // Catch:{ all -> 0x012a }
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.newScheduledThreadPool(r2)     // Catch:{ all -> 0x012a }
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r7)     // Catch:{ all -> 0x012a }
            f24736p = r7     // Catch:{ all -> 0x012a }
        L_0x0128:
            monitor-exit(r8)     // Catch:{ all -> 0x012a }
            goto L_0x012d
        L_0x012a:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x012a }
            throw r7
        L_0x012d:
            r6.f24751n = r7
            return
        L_0x0130:
            l8.c r7 = new l8.c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 29
            r8.<init>(r9)
            java.lang.String r0 = "expected a non-null reference"
            r8.append(r0, r1, r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.a.<init>(android.content.Context, int, java.lang.String):void");
    }

    public void a(long j10) {
        this.f24750m.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f24735o), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f24738a) {
            if (!b()) {
                this.f24746i = l8.a.f21105a;
                this.f24739b.acquire();
                this.f24747j.a();
            }
            this.f24740c++;
            this.f24745h++;
            if (this.f24744g) {
                TextUtils.isEmpty((CharSequence) null);
            }
            b bVar = this.f24749l.get((Object) null);
            if (bVar == null) {
                bVar = new b((d2.a) null);
                this.f24749l.put((Object) null, bVar);
            }
            bVar.f24752a++;
            long a10 = this.f24747j.a();
            if (Long.MAX_VALUE - a10 > max) {
                j11 = a10 + max;
            }
            if (j11 > this.f24742e) {
                this.f24742e = j11;
                Future<?> future = this.f24741d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f24741d = this.f24751n.schedule(new qz(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f24738a) {
            z10 = this.f24740c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f24750m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f24748k).concat(" release without a matched acquire!"));
        }
        synchronized (this.f24738a) {
            if (this.f24744g) {
                TextUtils.isEmpty((CharSequence) null);
            }
            if (this.f24749l.containsKey((Object) null)) {
                b bVar = this.f24749l.get((Object) null);
                if (bVar != null) {
                    int i10 = bVar.f24752a - 1;
                    bVar.f24752a = i10;
                    if (i10 == 0) {
                        this.f24749l.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f24748k).concat(" counter does not exist"));
            }
            e(0);
        }
    }

    public final void d() {
        if (!this.f24743f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f24743f);
            this.f24743f.clear();
            if (arrayList.size() > 0) {
                c cVar = (c) arrayList.get(0);
                throw null;
            }
        }
    }

    public final void e(int i10) {
        synchronized (this.f24738a) {
            if (b()) {
                if (this.f24744g) {
                    int i11 = this.f24740c - 1;
                    this.f24740c = i11;
                    if (i11 > 0) {
                        return;
                    }
                } else {
                    this.f24740c = 0;
                }
                d();
                for (b bVar : this.f24749l.values()) {
                    bVar.f24752a = 0;
                }
                this.f24749l.clear();
                Future<?> future = this.f24741d;
                if (future != null) {
                    future.cancel(false);
                    this.f24741d = null;
                    this.f24742e = 0;
                }
                this.f24745h = 0;
                if (this.f24739b.isHeld()) {
                    try {
                        this.f24739b.release();
                        if (this.f24746i != null) {
                            this.f24746i = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f24748k).concat(" failed to release!"), e10);
                            if (this.f24746i != null) {
                                this.f24746i = null;
                            }
                            return;
                        }
                        throw e10;
                    } catch (Throwable th) {
                        if (this.f24746i != null) {
                            this.f24746i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f24748k).concat(" should be held!"));
                }
            }
        }
    }
}
