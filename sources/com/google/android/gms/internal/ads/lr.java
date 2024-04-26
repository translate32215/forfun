package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ma;
import e8.gz;
import e8.lb0;
import e8.wv;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lr extends is {

    /* renamed from: j  reason: collision with root package name */
    public static final gz<wv> f7409j = new gz(9);

    /* renamed from: h  reason: collision with root package name */
    public final Context f7410h;

    /* renamed from: i  reason: collision with root package name */
    public n9 f7411i = null;

    public lr(fr frVar, String str, String str2, ma.a aVar, int i10, Context context, n9 n9Var) {
        super(frVar, str, str2, aVar, i10, 27);
        this.f7410h = context;
        this.f7411i = n9Var;
    }

    public static String c(n9 n9Var) {
        if (n9Var == null || !n9Var.C() || lb0.b(n9Var.y().y())) {
            return null;
        }
        return n9Var.y().y();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:43|44|(1:46)|47|(1:51)|52|53|(1:55)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.ea r0 = com.google.android.gms.internal.ads.ea.ENUM_SIGNAL_SOURCE_GASS
            com.google.android.gms.internal.ads.ea r1 = com.google.android.gms.internal.ads.ea.ENUM_SIGNAL_SOURCE_ADSHIELD
            e8.gz<e8.wv> r2 = f7409j
            android.content.Context r3 = r9.f7410h
            java.lang.String r3 = r3.getPackageName()
            java.util.concurrent.atomic.AtomicReference r2 = r2.c(r3)
            monitor-enter(r2)
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x0164 }
            e8.wv r3 = (e8.wv) r3     // Catch:{ all -> 0x0164 }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            java.lang.String r6 = r3.f17404a     // Catch:{ all -> 0x0164 }
            boolean r6 = e8.lb0.b(r6)     // Catch:{ all -> 0x0164 }
            if (r6 != 0) goto L_0x003a
            java.lang.String r6 = r3.f17404a     // Catch:{ all -> 0x0164 }
            java.lang.String r7 = "E"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0164 }
            if (r6 != 0) goto L_0x003a
            java.lang.String r3 = r3.f17404a     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.n9 r3 = r9.f7411i     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = c(r3)     // Catch:{ all -> 0x0164 }
            boolean r3 = e8.lb0.b(r3)     // Catch:{ all -> 0x0164 }
            if (r3 != 0) goto L_0x004c
            com.google.android.gms.internal.ads.ea r0 = com.google.android.gms.internal.ads.ea.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x0164 }
            goto L_0x007f
        L_0x004c:
            com.google.android.gms.internal.ads.n9 r3 = r9.f7411i     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = c(r3)     // Catch:{ all -> 0x0164 }
            boolean r6 = e8.lb0.b(r6)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            boolean r6 = r3.A()     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.o9 r3 = r3.B()     // Catch:{ all -> 0x0164 }
            com.google.android.gms.internal.ads.ea r3 = r3.y()     // Catch:{ all -> 0x0164 }
            if (r3 != r0) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0164 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.fr r3 = r9.f7101a     // Catch:{ all -> 0x0164 }
            boolean r3 = r3.f6492n     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r0 = r1
        L_0x007f:
            if (r0 != r1) goto L_0x0083
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0164 }
            java.lang.reflect.Method r3 = r9.f7105e     // Catch:{ all -> 0x0164 }
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0164 }
            android.content.Context r8 = r9.f7410h     // Catch:{ all -> 0x0164 }
            r7[r4] = r8     // Catch:{ all -> 0x0164 }
            r7[r5] = r1     // Catch:{ all -> 0x0164 }
            r1 = 0
            java.lang.Object r3 = r3.invoke(r1, r7)     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0164 }
            e8.wv r7 = new e8.wv     // Catch:{ all -> 0x0164 }
            r7.<init>(r3)     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = r7.f17404a     // Catch:{ all -> 0x0164 }
            boolean r3 = e8.lb0.b(r3)     // Catch:{ all -> 0x0164 }
            if (r3 != 0) goto L_0x00b1
            java.lang.String r3 = r7.f17404a     // Catch:{ all -> 0x0164 }
            java.lang.String r8 = "E"
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x00ec
        L_0x00b1:
            int[] r3 = e8.nb0.f15606a     // Catch:{ all -> 0x0164 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0164 }
            r0 = r3[r0]     // Catch:{ all -> 0x0164 }
            if (r0 == r5) goto L_0x00e0
            if (r0 == r6) goto L_0x00be
            goto L_0x00ec
        L_0x00be:
            com.google.android.gms.internal.ads.fr r0 = r9.f7101a     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
            java.util.concurrent.Future r0 = r0.f6489k     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
            if (r0 == 0) goto L_0x00c7
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
        L_0x00c7:
            com.google.android.gms.internal.ads.fr r0 = r9.f7101a     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
            com.google.android.gms.internal.ads.ma r0 = r0.f6488j     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
            if (r0 == 0) goto L_0x00d7
            boolean r3 = r0.P()     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
            if (r3 == 0) goto L_0x00d7
            java.lang.String r1 = r0.M()     // Catch:{ InterruptedException | ExecutionException -> 0x00d7 }
        L_0x00d7:
            boolean r0 = e8.lb0.b(r1)     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x00ec
            r7.f17404a = r1     // Catch:{ all -> 0x0164 }
            goto L_0x00ec
        L_0x00e0:
            com.google.android.gms.internal.ads.n9 r0 = r9.f7411i     // Catch:{ all -> 0x0164 }
            com.google.android.gms.internal.ads.p9 r0 = r0.y()     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = r0.y()     // Catch:{ all -> 0x0164 }
            r7.f17404a = r0     // Catch:{ all -> 0x0164 }
        L_0x00ec:
            r2.set(r7)     // Catch:{ all -> 0x0164 }
        L_0x00ef:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x0164 }
            e8.wv r0 = (e8.wv) r0     // Catch:{ all -> 0x0164 }
            monitor-exit(r2)     // Catch:{ all -> 0x0164 }
            com.google.android.gms.internal.ads.ma$a r1 = r9.f7104d
            monitor-enter(r1)
            if (r0 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.ma$a r2 = r9.f7104d     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r0.f17404a     // Catch:{ all -> 0x0161 }
            boolean r5 = r2.f5971c     // Catch:{ all -> 0x0161 }
            if (r5 == 0) goto L_0x0108
            r2.n()     // Catch:{ all -> 0x0161 }
            r2.f5971c = r4     // Catch:{ all -> 0x0161 }
        L_0x0108:
            MessageType r2 = r2.f5970b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma r2 = (com.google.android.gms.internal.ads.ma) r2     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma.e0(r2, r3)     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma$a r2 = r9.f7104d     // Catch:{ all -> 0x0161 }
            long r5 = r0.f17405b     // Catch:{ all -> 0x0161 }
            boolean r3 = r2.f5971c     // Catch:{ all -> 0x0161 }
            if (r3 == 0) goto L_0x011c
            r2.n()     // Catch:{ all -> 0x0161 }
            r2.f5971c = r4     // Catch:{ all -> 0x0161 }
        L_0x011c:
            MessageType r2 = r2.f5970b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma r2 = (com.google.android.gms.internal.ads.ma) r2     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma.z0(r2, r5)     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma$a r2 = r9.f7104d     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r0.f17406c     // Catch:{ all -> 0x0161 }
            boolean r5 = r2.f5971c     // Catch:{ all -> 0x0161 }
            if (r5 == 0) goto L_0x0130
            r2.n()     // Catch:{ all -> 0x0161 }
            r2.f5971c = r4     // Catch:{ all -> 0x0161 }
        L_0x0130:
            MessageType r2 = r2.f5970b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma r2 = (com.google.android.gms.internal.ads.ma) r2     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma.k0(r2, r3)     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma$a r2 = r9.f7104d     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r0.f17407d     // Catch:{ all -> 0x0161 }
            boolean r5 = r2.f5971c     // Catch:{ all -> 0x0161 }
            if (r5 == 0) goto L_0x0144
            r2.n()     // Catch:{ all -> 0x0161 }
            r2.f5971c = r4     // Catch:{ all -> 0x0161 }
        L_0x0144:
            MessageType r2 = r2.f5970b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma r2 = (com.google.android.gms.internal.ads.ma) r2     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma.m0(r2, r3)     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma$a r2 = r9.f7104d     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = r0.f17408e     // Catch:{ all -> 0x0161 }
            boolean r3 = r2.f5971c     // Catch:{ all -> 0x0161 }
            if (r3 == 0) goto L_0x0158
            r2.n()     // Catch:{ all -> 0x0161 }
            r2.f5971c = r4     // Catch:{ all -> 0x0161 }
        L_0x0158:
            MessageType r2 = r2.f5970b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma r2 = (com.google.android.gms.internal.ads.ma) r2     // Catch:{ all -> 0x0161 }
            com.google.android.gms.internal.ads.ma.o0(r2, r0)     // Catch:{ all -> 0x0161 }
        L_0x015f:
            monitor-exit(r1)     // Catch:{ all -> 0x0161 }
            return
        L_0x0161:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0161 }
            throw r0
        L_0x0164:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0164 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lr.a():void");
    }
}
