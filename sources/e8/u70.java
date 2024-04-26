package e8;

import com.google.android.gms.internal.ads.aq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class u70 implements a90 {

    /* renamed from: a  reason: collision with root package name */
    public static final u70 f16854a = new u70();

    public final boolean a(Class<?> cls) {
        return aq.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.b90 b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.ads.aq> r0 = com.google.android.gms.internal.ads.aq.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.ads.aq r0 = com.google.android.gms.internal.ads.aq.x(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.q(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            e8.b90 r0 = (e8.b90) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.u70.b(java.lang.Class):e8.b90");
    }
}
