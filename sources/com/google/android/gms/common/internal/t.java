package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;
import i8.e;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class t extends e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(b bVar, Looper looper) {
        super(looper);
        this.f5886a = bVar;
    }

    public static final boolean a(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r0 == 5) goto L_0x0031;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.E
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x001d
            boolean r0 = a(r8)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r8 = r8.obj
            v7.w r8 = (v7.w) r8
            r8.b()
            r8.c()
        L_0x001c:
            return
        L_0x001d:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x0031
            r4 = 7
            if (r0 == r4) goto L_0x0031
            if (r0 != r1) goto L_0x002f
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            r0.getClass()
            goto L_0x0031
        L_0x002f:
            if (r0 != r3) goto L_0x0039
        L_0x0031:
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0159
        L_0x0039:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007b
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            s7.a r1 = new s7.a
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.B = r1
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            boolean r8 = com.google.android.gms.common.internal.b.C(r8)
            if (r8 == 0) goto L_0x005f
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            boolean r0 = r8.C
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.D(r5, r6)
            return
        L_0x005f:
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            s7.a r8 = r8.B
            if (r8 == 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            s7.a r8 = new s7.a
            r8.<init>(r4)
        L_0x006b:
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            com.google.android.gms.common.internal.b$c r0 = r0.f5831r
            r0.a(r8)
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            r8.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x007b:
            if (r0 != r3) goto L_0x0099
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            s7.a r8 = r8.B
            if (r8 == 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            s7.a r8 = new s7.a
            r8.<init>(r4)
        L_0x0089:
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            com.google.android.gms.common.internal.b$c r0 = r0.f5831r
            r0.a(r8)
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            r8.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x0099:
            if (r0 != r5) goto L_0x00bb
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00a4
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00a4:
            s7.a r0 = new s7.a
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            com.google.android.gms.common.internal.b$c r8 = r8.f5831r
            r8.a(r0)
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            r8.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00bb:
            r1 = 6
            if (r0 != r1) goto L_0x00dc
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            r0.D(r3, r6)
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            com.google.android.gms.common.internal.b$a r0 = r0.f5836w
            if (r0 == 0) goto L_0x00ce
            int r8 = r8.arg2
            r0.Y(r8)
        L_0x00ce:
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            r8.getClass()
            java.lang.System.currentTimeMillis()
            com.google.android.gms.common.internal.b r8 = r7.f5886a
            com.google.android.gms.common.internal.b.B(r8, r3, r2, r6)
            return
        L_0x00dc:
            r1 = 2
            if (r0 != r1) goto L_0x00f3
            com.google.android.gms.common.internal.b r0 = r7.f5886a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x00e8
            goto L_0x00f3
        L_0x00e8:
            java.lang.Object r8 = r8.obj
            v7.w r8 = (v7.w) r8
            r8.b()
            r8.c()
            return
        L_0x00f3:
            boolean r0 = a(r8)
            if (r0 == 0) goto L_0x013b
            java.lang.Object r8 = r8.obj
            r0 = r8
            v7.w r0 = (v7.w) r0
            monitor-enter(r0)
            java.lang.Object r8 = r0.f26600a     // Catch:{ all -> 0x0138 }
            boolean r1 = r0.f26601b     // Catch:{ all -> 0x0138 }
            if (r1 == 0) goto L_0x0124
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r3.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r4 = "Callback proxy "
            r3.append(r4)     // Catch:{ all -> 0x0138 }
            r3.append(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = " being reused. This is not safe."
            r3.append(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "GmsClient"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0138 }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0138 }
        L_0x0124:
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            if (r8 == 0) goto L_0x012d
            r0.a(r8)     // Catch:{ RuntimeException -> 0x012b }
            goto L_0x012d
        L_0x012b:
            r8 = move-exception
            throw r8
        L_0x012d:
            monitor-enter(r0)
            r0.f26601b = r2     // Catch:{ all -> 0x0135 }
            monitor-exit(r0)     // Catch:{ all -> 0x0135 }
            r0.c()
            return
        L_0x0135:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0135 }
            throw r8
        L_0x0138:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            throw r8
        L_0x013b:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = r0.toString()
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0159:
            java.lang.Object r8 = r8.obj
            v7.w r8 = (v7.w) r8
            r8.b()
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.t.handleMessage(android.os.Message):void");
    }
}
