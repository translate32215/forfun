package o3;

import android.util.Log;
import i3.a;
import java.io.File;
import java.io.IOException;
import k3.c;

/* compiled from: DiskLruCacheWrapper */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final k f22902a;

    /* renamed from: b  reason: collision with root package name */
    public final File f22903b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22904c;

    /* renamed from: d  reason: collision with root package name */
    public final c f22905d = new c();

    /* renamed from: e  reason: collision with root package name */
    public a f22906e;

    @Deprecated
    public e(File file, long j10) {
        this.f22903b = file;
        this.f22904c = j10;
        this.f22902a = new k();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(k3.c r6, o3.a.b r7) {
        /*
            r5 = this;
            o3.k r0 = r5.f22902a
            java.lang.String r0 = r0.a(r6)
            o3.c r1 = r5.f22905d
            monitor-enter(r1)
            java.util.Map<java.lang.String, o3.c$a> r2 = r1.f22895a     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00d5 }
            o3.c$a r2 = (o3.c.a) r2     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x0031
            o3.c$b r2 = r1.f22896b     // Catch:{ all -> 0x00d5 }
            java.util.Queue<o3.c$a> r3 = r2.f22899a     // Catch:{ all -> 0x00d5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d5 }
            java.util.Queue<o3.c$a> r2 = r2.f22899a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            o3.c$a r2 = (o3.c.a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            o3.c$a r2 = new o3.c$a     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
        L_0x0028:
            java.util.Map<java.lang.String, o3.c$a> r3 = r1.f22895a     // Catch:{ all -> 0x00d5 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00d5 }
        L_0x0031:
            int r3 = r2.f22898b     // Catch:{ all -> 0x00d5 }
            r4 = 1
            int r3 = r3 + r4
            r2.f22898b = r3     // Catch:{ all -> 0x00d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.locks.Lock r1 = r2.f22897a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ce }
            android.util.Log.v(r1, r6)     // Catch:{ all -> 0x00ce }
        L_0x0064:
            i3.a r6 = r5.c()     // Catch:{ IOException -> 0x00bc }
            i3.a$e r1 = r6.u(r0)     // Catch:{ IOException -> 0x00bc }
            if (r1 == 0) goto L_0x0074
        L_0x006e:
            o3.c r6 = r5.f22905d
            r6.a(r0)
            return
        L_0x0074:
            i3.a$c r6 = r6.s(r0)     // Catch:{ IOException -> 0x00bc }
            if (r6 == 0) goto L_0x00a5
            r1 = 0
            java.io.File r1 = r6.b(r1)     // Catch:{ all -> 0x009c }
            m3.f r7 = (m3.f) r7     // Catch:{ all -> 0x009c }
            k3.a<DataType> r2 = r7.f21525a     // Catch:{ all -> 0x009c }
            DataType r3 = r7.f21526b     // Catch:{ all -> 0x009c }
            k3.e r7 = r7.f21527c     // Catch:{ all -> 0x009c }
            boolean r7 = r2.k(r3, r1, r7)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x0094
            i3.a r7 = i3.a.this     // Catch:{ all -> 0x009c }
            i3.a.a(r7, r6, r4)     // Catch:{ all -> 0x009c }
            r6.f19123c = r4     // Catch:{ all -> 0x009c }
        L_0x0094:
            boolean r7 = r6.f19123c     // Catch:{ IOException -> 0x00bc }
            if (r7 != 0) goto L_0x006e
            r6.a()     // Catch:{ IOException -> 0x006e }
            goto L_0x006e
        L_0x009c:
            r7 = move-exception
            boolean r1 = r6.f19123c     // Catch:{ IOException -> 0x00bc }
            if (r1 != 0) goto L_0x00a4
            r6.a()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r7     // Catch:{ IOException -> 0x00bc }
        L_0x00a5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bc }
            r7.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00bc }
            r7.append(r0)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00bc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc }
            throw r6     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00ce }
            if (r7 == 0) goto L_0x006e
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00ce }
            goto L_0x006e
        L_0x00ce:
            r6 = move-exception
            o3.c r7 = r5.f22905d
            r7.a(r0)
            throw r6
        L_0x00d5:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d8:
            throw r6
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.a(k3.c, o3.a$b):void");
    }

    public File b(c cVar) {
        String a10 = this.f22902a.a(cVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + cVar);
        }
        try {
            a.e u10 = c().u(a10);
            if (u10 != null) {
                return u10.f19133a[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public final synchronized a c() throws IOException {
        if (this.f22906e == null) {
            this.f22906e = a.G(this.f22903b, 1, 1, this.f22904c);
        }
        return this.f22906e;
    }
}
