package z7;

import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f28732a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f28733b;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC, Splitter:B:18:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0017 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0017 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0017 }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            f28732a = r5
            boolean r5 = z7.h.a()
            r6 = 2
            if (r5 == 0) goto L_0x002f
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x002f }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002f }
            r5[r4] = r7     // Catch:{ Exception -> 0x002f }
            r5[r3] = r0     // Catch:{ Exception -> 0x002f }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r2 = r7.getMethod(r1, r5)     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            f28733b = r2
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r2 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003a }
            r1.getMethod(r2, r5)     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0048 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0048 }
            r1[r4] = r2     // Catch:{ Exception -> 0x0048 }
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            r2.getMethod(r5, r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            boolean r1 = z7.h.a()
            if (r1 == 0) goto L_0x005e
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x005d }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005d }
            r1[r4] = r2     // Catch:{ Exception -> 0x005d }
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            r2.getMethod(r5, r1)     // Catch:{ Exception -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            boolean r1 = z7.h.e()
            java.lang.String r2 = "WorkSourceUtil"
            if (r1 == 0) goto L_0x0076
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0070 }
            r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0076
        L_0x0070:
            r1 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r2, r5, r1)
        L_0x0076:
            boolean r1 = z7.h.e()
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0090 }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0090 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0090 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0090 }
            r5[r3] = r0     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "addNode"
            r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0096
        L_0x0090:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r2, r1, r0)
        L_0x0096:
            boolean r0 = z7.h.e()
            if (r0 == 0) goto L_0x00a9
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00a9 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ Exception -> 0x00a9 }
            r0.setAccessible(r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.j.<clinit>():void");
    }
}
