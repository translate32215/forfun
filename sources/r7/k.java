package r7;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24716a;

    /* renamed from: b  reason: collision with root package name */
    public final j f24717b;

    public k(j jVar, int i10) {
        this.f24716a = i10;
        if (i10 != 1) {
            this.f24717b = jVar;
        } else {
            this.f24717b = jVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(r4.length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r3 = r0.f24715f.f24706a;
        r4 = r0.f24711b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f24726c;
        r5.arg1 = r1.f24724a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.d());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f24727d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1 = r0.f24712c;
        r3 = r1.f24722a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        if (r3 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r1 = r1.f24723b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r1.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f24716a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0018
        L_0x0006:
            r7.j r0 = r8.f24717b
            monitor-enter(r0)
            int r1 = r0.f24710a     // Catch:{ all -> 0x0015 }
            r2 = 1
            if (r1 != r2) goto L_0x0013
            java.lang.String r1 = "Timed out while binding"
            r0.a(r2, r1)     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)
            return
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0018:
            r7.j r0 = r8.f24717b
        L_0x001a:
            monitor-enter(r0)
            int r1 = r0.f24710a     // Catch:{ all -> 0x00d3 }
            r2 = 2
            if (r1 == r2) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x002e
        L_0x0022:
            java.util.Queue<r7.p<?>> r1 = r0.f24713d     // Catch:{ all -> 0x00d3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x002f
            r0.c()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
        L_0x002e:
            return
        L_0x002f:
            java.util.Queue<r7.p<?>> r1 = r0.f24713d     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00d3 }
            r7.p r1 = (r7.p) r1     // Catch:{ all -> 0x00d3 }
            android.util.SparseArray<r7.p<?>> r3 = r0.f24714e     // Catch:{ all -> 0x00d3 }
            int r4 = r1.f24724a     // Catch:{ all -> 0x00d3 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00d3 }
            r7.i r3 = r0.f24715f     // Catch:{ all -> 0x00d3 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f24707b     // Catch:{ all -> 0x00d3 }
            r7.m r4 = new r7.m     // Catch:{ all -> 0x00d3 }
            r4.<init>((r7.j) r0, (r7.p) r1)     // Catch:{ all -> 0x00d3 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00d3 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L_0x0078:
            r7.i r3 = r0.f24715f
            android.content.Context r3 = r3.f24706a
            android.os.Messenger r4 = r0.f24711b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f24726c
            r5.what = r6
            int r6 = r1.f24724a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.d()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f24727d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            r7.o r1 = r0.f24712c     // Catch:{ RemoteException -> 0x00c9 }
            android.os.Messenger r3 = r1.f24722a     // Catch:{ RemoteException -> 0x00c9 }
            if (r3 == 0) goto L_0x00b8
            r3.send(r5)     // Catch:{ RemoteException -> 0x00c9 }
            goto L_0x001a
        L_0x00b8:
            r7.e r1 = r1.f24723b     // Catch:{ RemoteException -> 0x00c9 }
            if (r1 == 0) goto L_0x00c1
            r1.b(r5)     // Catch:{ RemoteException -> 0x00c9 }
            goto L_0x001a
        L_0x00c1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00c9 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00c9 }
            throw r1     // Catch:{ RemoteException -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x001a
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d7
        L_0x00d6:
            throw r1
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.k.run():void");
    }
}
