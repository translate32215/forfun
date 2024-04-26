package s4;

import o4.i;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f24922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f24923b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f24924c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f24925d;

    public /* synthetic */ d(h hVar, i iVar, int i10, Runnable runnable) {
        this.f24922a = hVar;
        this.f24923b = iVar;
        this.f24924c = i10;
        this.f24925d = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f24940d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            s4.h r0 = r8.f24922a
            o4.i r1 = r8.f24923b
            int r2 = r8.f24924c
            java.lang.Runnable r3 = r8.f24925d
            r0.getClass()
            r4 = 1
            u4.b r5 = r0.f24942f     // Catch:{ a -> 0x0047 }
            t4.c r6 = r0.f24939c     // Catch:{ a -> 0x0047 }
            r6.getClass()     // Catch:{ a -> 0x0047 }
            r0.b r7 = new r0.b     // Catch:{ a -> 0x0047 }
            r7.<init>((t4.c) r6)     // Catch:{ a -> 0x0047 }
            r5.a(r7)     // Catch:{ a -> 0x0047 }
            android.content.Context r5 = r0.f24937a     // Catch:{ a -> 0x0047 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0047 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0047 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.isConnected()     // Catch:{ a -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0041
            u4.b r5 = r0.f24942f     // Catch:{ a -> 0x0047 }
            s4.f r6 = new s4.f     // Catch:{ a -> 0x0047 }
            r6.<init>(r0, r1, r2)     // Catch:{ a -> 0x0047 }
            r5.a(r6)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0041:
            r0.a(r1, r2)     // Catch:{ a -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            s4.k r0 = r0.f24940d     // Catch:{ all -> 0x0045 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0045 }
        L_0x004d:
            r3.run()
            return
        L_0x0051:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.d.run():void");
    }
}
