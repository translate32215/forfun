package com.adcolony.sdk;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.CountDownLatch;
import t2.o0;

public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f4774a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f4775b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o0 f4776c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f4777d;

    public t(n nVar, SQLiteDatabase sQLiteDatabase, o0 o0Var, CountDownLatch countDownLatch) {
        this.f4774a = nVar;
        this.f4775b = sQLiteDatabase;
        this.f4776c = o0Var;
        this.f4777d = countDownLatch;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ all -> 0x0070, all -> 0x0074, SQLException -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x001e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            com.adcolony.sdk.n r0 = r12.f4774a
            java.util.List<com.adcolony.sdk.n$a> r0 = r0.f4611b
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r1 = r0.next()
            com.adcolony.sdk.n$a r1 = (com.adcolony.sdk.n.a) r1
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f4620i
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0008
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = (java.lang.String) r4
            android.database.sqlite.SQLiteDatabase r5 = r12.f4775b
            r6 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r6)     // Catch:{ SQLException -> 0x007e }
            if (r4 == 0) goto L_0x0075
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0075
            t2.p0 r5 = new t2.p0     // Catch:{ all -> 0x006c }
            r5.<init>()     // Catch:{ all -> 0x006c }
            r7 = 0
        L_0x0045:
            int r8 = r4.getColumnCount()     // Catch:{ all -> 0x006a }
            if (r7 >= r8) goto L_0x0060
            java.lang.String r8 = r4.getColumnName(r7)     // Catch:{ all -> 0x006a }
            int r9 = r4.getType(r7)     // Catch:{ all -> 0x006a }
            java.util.List<t2.p0$a> r10 = r5.f25547a     // Catch:{ all -> 0x006a }
            t2.p0$a r11 = new t2.p0$a     // Catch:{ all -> 0x006a }
            r11.<init>(r7, r8, r9, r6)     // Catch:{ all -> 0x006a }
            r10.add(r11)     // Catch:{ all -> 0x006a }
            int r7 = r7 + 1
            goto L_0x0045
        L_0x0060:
            t2.p0.b(r5, r4)     // Catch:{ all -> 0x006a }
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x006a }
            if (r7 != 0) goto L_0x0060
            goto L_0x0076
        L_0x006a:
            r7 = move-exception
            goto L_0x006f
        L_0x006c:
            r5 = move-exception
            r7 = r5
            r5 = r6
        L_0x006f:
            throw r7     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r7 = move-exception
            r4.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r7     // Catch:{ SQLException -> 0x007c }
        L_0x0075:
            r5 = r6
        L_0x0076:
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch:{ SQLException -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r4 = move-exception
            goto L_0x0080
        L_0x007e:
            r4 = move-exception
            r5 = r6
        L_0x0080:
            r4.printStackTrace()
        L_0x0083:
            if (r5 == 0) goto L_0x001e
            t2.o0 r4 = r12.f4776c
            java.lang.String r7 = r1.f4612a
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            t2.o0$a r8 = new t2.o0$a
            r8.<init>(r3, r5, r6)
            java.util.Map<java.lang.String, java.util.ArrayList<t2.o0$a>> r3 = r4.f25542b
            boolean r3 = r3.containsKey(r7)
            if (r3 == 0) goto L_0x00ab
            java.util.Map<java.lang.String, java.util.ArrayList<t2.o0$a>> r3 = r4.f25542b
            java.lang.Object r3 = r3.get(r7)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x00ab
            r3.add(r8)
            goto L_0x001e
        L_0x00ab:
            java.util.Map<java.lang.String, java.util.ArrayList<t2.o0$a>> r3 = r4.f25542b
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = java.util.Collections.singletonList(r8)
            r4.<init>(r5)
            r3.put(r7, r4)
            goto L_0x001e
        L_0x00bb:
            com.adcolony.sdk.q r0 = com.adcolony.sdk.q.c()
            t2.o0 r1 = r12.f4776c
            r0.f4709c = r1
            r1 = 1
            r0.f4710d = r1
            java.util.concurrent.CountDownLatch r0 = r12.f4777d
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.t.run():void");
    }
}
