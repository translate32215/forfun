package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public abstract class i2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10529a;

    /* renamed from: b  reason: collision with root package name */
    public volatile T f10530b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f10531c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10532d;

    public i2(Context context) {
        this(context, 900000);
    }

    public T a() {
        return null;
    }

    public T a(boolean z10) {
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r8.f10531c + r8.f10532d < android.os.SystemClock.uptimeMillis()) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b() {
        /*
            r8 = this;
            T r0 = r8.f10530b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            long r3 = r8.f10531c
            long r5 = r8.f10532d
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0042
        L_0x0018:
            monitor-enter(r8)
            T r0 = r8.f10530b     // Catch:{ all -> 0x004a }
            long r3 = r8.f10531c     // Catch:{ all -> 0x004a }
            long r5 = r8.f10532d     // Catch:{ all -> 0x004a }
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0041
        L_0x002e:
            java.lang.Object r0 = r8.a(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r1 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x004a }
        L_0x0037:
            if (r0 == 0) goto L_0x0041
            r8.f10530b = r0     // Catch:{ all -> 0x004a }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
            r8.f10531c = r1     // Catch:{ all -> 0x004a }
        L_0x0041:
            monitor-exit(r8)     // Catch:{ all -> 0x004a }
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            java.lang.Object r0 = r8.c()
        L_0x0049:
            return r0
        L_0x004a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.i2.b():java.lang.Object");
    }

    public abstract T c();

    public i2(Context context, long j10) {
        this.f10529a = context;
        this.f10532d = j10;
    }
}
