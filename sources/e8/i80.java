package e8;

import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.up;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class i80 {

    /* renamed from: a  reason: collision with root package name */
    public volatile cq f14997a;

    /* renamed from: b  reason: collision with root package name */
    public volatile mp f14998b;

    static {
        up.a();
    }

    public final mp a() {
        if (this.f14998b != null) {
            return this.f14998b;
        }
        synchronized (this) {
            if (this.f14998b != null) {
                mp mpVar = this.f14998b;
                return mpVar;
            }
            if (this.f14997a == null) {
                this.f14998b = mp.f7494b;
            } else {
                this.f14998b = this.f14997a.g();
            }
            mp mpVar2 = this.f14998b;
            return mpVar2;
        }
    }

    public final int b() {
        if (this.f14998b != null) {
            return this.f14998b.size();
        }
        if (this.f14997a != null) {
            return this.f14997a.c();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.cq c(com.google.android.gms.internal.ads.cq r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.cq r0 = r1.f14997a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.cq r0 = r1.f14997a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f14997a = r2     // Catch:{ f80 -> 0x0012 }
            com.google.android.gms.internal.ads.mp r0 = com.google.android.gms.internal.ads.mp.f7494b     // Catch:{ f80 -> 0x0012 }
            r1.f14998b = r0     // Catch:{ f80 -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f14997a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.mp r2 = com.google.android.gms.internal.ads.mp.f7494b     // Catch:{ all -> 0x001a }
            r1.f14998b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.cq r2 = r1.f14997a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i80.c(com.google.android.gms.internal.ads.cq):com.google.android.gms.internal.ads.cq");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80 = (i80) obj;
        cq cqVar = this.f14997a;
        cq cqVar2 = i80.f14997a;
        if (cqVar == null && cqVar2 == null) {
            return a().equals(i80.a());
        }
        if (cqVar != null && cqVar2 != null) {
            return cqVar.equals(cqVar2);
        }
        if (cqVar != null) {
            return cqVar.equals(i80.c(cqVar.e()));
        }
        return c(cqVar2.e()).equals(cqVar2);
    }

    public int hashCode() {
        return 1;
    }
}
