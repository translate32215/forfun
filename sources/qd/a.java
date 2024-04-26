package qd;

/* compiled from: JDK7PlatformImplementations.kt */
public class a extends pd.a {

    /* renamed from: qd.a$a  reason: collision with other inner class name */
    /* compiled from: JDK7PlatformImplementations.kt */
    public static final class C0228a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f24280a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0018 }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x0018 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0018 }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0018
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0018 }
                goto L_0x0019
            L_0x0018:
                r1 = r0
            L_0x0019:
                if (r1 == 0) goto L_0x0027
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x0023
                r2 = 1
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                if (r2 == 0) goto L_0x0027
                r0 = r1
            L_0x0027:
                f24280a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qd.a.C0228a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        Integer num = C0228a.f24280a;
        if (!(num == null || num.intValue() >= 19)) {
            super.a(th, th2);
        }
    }
}
