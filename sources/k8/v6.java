package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class v6 {

    /* renamed from: a  reason: collision with root package name */
    public volatile m7 f20506a;

    /* renamed from: b  reason: collision with root package name */
    public volatile p5 f20507b;

    static {
        x5.a();
    }

    public final int a() {
        if (this.f20507b != null) {
            return ((o5) this.f20507b).f20392c.length;
        }
        if (this.f20506a != null) {
            return this.f20506a.c();
        }
        return 0;
    }

    public final p5 b() {
        if (this.f20507b != null) {
            return this.f20507b;
        }
        synchronized (this) {
            if (this.f20507b != null) {
                p5 p5Var = this.f20507b;
                return p5Var;
            }
            if (this.f20506a == null) {
                this.f20507b = p5.f20407b;
            } else {
                this.f20507b = this.f20506a.b();
            }
            p5 p5Var2 = this.f20507b;
            return p5Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(k8.m7 r2) {
        /*
            r1 = this;
            k8.m7 r0 = r1.f20506a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            k8.m7 r0 = r1.f20506a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f20506a = r2     // Catch:{ t6 -> 0x0011 }
            k8.p5 r0 = k8.p5.f20407b     // Catch:{ t6 -> 0x0011 }
            r1.f20507b = r0     // Catch:{ t6 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f20506a = r2     // Catch:{ all -> 0x001b }
            k8.p5 r2 = k8.p5.f20407b     // Catch:{ all -> 0x001b }
            r1.f20507b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.v6.c(k8.m7):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        m7 m7Var = this.f20506a;
        m7 m7Var2 = v6Var.f20506a;
        if (m7Var == null && m7Var2 == null) {
            return b().equals(v6Var.b());
        }
        if (m7Var != null && m7Var2 != null) {
            return m7Var.equals(m7Var2);
        }
        if (m7Var != null) {
            v6Var.c(m7Var.d());
            return m7Var.equals(v6Var.f20506a);
        }
        c(m7Var2.d());
        return this.f20506a.equals(m7Var2);
    }

    public int hashCode() {
        return 1;
    }
}
