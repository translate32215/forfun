package com.google.android.gms.internal.ads;

import androidx.activity.e;
import androidx.appcompat.widget.o;
import e.g;
import e8.p50;
import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class dh<V, X extends Throwable, F, T> extends vh<V> implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f6210s = 0;
    @NullableDecl

    /* renamed from: h  reason: collision with root package name */
    public p50<? extends V> f6211h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    public Class<X> f6212i;
    @NullableDecl

    /* renamed from: r  reason: collision with root package name */
    public F f6213r;

    public dh(p50<? extends V> p50, Class<X> cls, F f10) {
        p50.getClass();
        this.f6211h = p50;
        cls.getClass();
        this.f6212i = cls;
        f10.getClass();
        this.f6213r = f10;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.dh, com.google.android.gms.internal.ads.gh] */
    public final void c() {
        g(this.f6211h);
        this.f6211h = null;
        this.f6212i = null;
        this.f6213r = null;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.dh, com.google.android.gms.internal.ads.gh] */
    public final String h() {
        String str;
        p50<? extends V> p50 = this.f6211h;
        Class<X> cls = this.f6212i;
        F f10 = this.f6213r;
        String h10 = dh.super.h();
        if (p50 != null) {
            String valueOf = String.valueOf(p50);
            str = g.a(valueOf.length() + 16, "inputFuture=[", valueOf, "], ");
        } else {
            str = "";
        }
        if (cls != null && f10 != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f10);
            return e.a(j4.e.a(valueOf3.length() + valueOf2.length() + o.a(str, 29), str, "exceptionType=[", valueOf2, "], fallback=["), valueOf3, "]");
        } else if (h10 == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            return h10.length() != 0 ? valueOf4.concat(h10) : new String(valueOf4);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.dh, com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            e8.p50<? extends V> r0 = r10.f6211h
            java.lang.Class<X> r1 = r10.f6212i
            F r2 = r10.f6213r
            r3 = 1
            if (r0 != 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            if (r1 != 0) goto L_0x0010
            r5 = 1
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            r4 = r4 | r5
            if (r2 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r3 = r3 | r4
            if (r3 != 0) goto L_0x009f
            java.lang.Object r3 = r10.f6648a
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.gh.b
            if (r3 == 0) goto L_0x0021
            goto L_0x009f
        L_0x0021:
            r3 = 0
            r10.f6211h = r3
            boolean r4 = r0 instanceof e8.w50     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            if (r4 == 0) goto L_0x0030
            r4 = r0
            e8.w50 r4 = (e8.w50) r4     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            java.lang.Throwable r4 = r4.b()     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            goto L_0x0031
        L_0x0030:
            r4 = r3
        L_0x0031:
            if (r4 != 0) goto L_0x0073
            java.lang.Object r5 = com.google.android.gms.internal.ads.yh.f(r0)     // Catch:{ ExecutionException -> 0x003a, all -> 0x0038 }
            goto L_0x0074
        L_0x0038:
            r4 = move-exception
            goto L_0x0073
        L_0x003a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0072
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r8 = r8 + r7
            java.lang.String r7 = "Future type "
            java.lang.String r9 = " threw "
            java.lang.StringBuilder r4 = j4.e.a(r8, r7, r6, r9, r4)
            java.lang.String r6 = " without a cause"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
        L_0x0072:
            r4 = r5
        L_0x0073:
            r5 = r3
        L_0x0074:
            if (r4 != 0) goto L_0x007a
            r10.i(r5)
            return
        L_0x007a:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L_0x0084
            r10.k(r0)
            return
        L_0x0084:
            java.lang.Object r0 = r10.x(r2, r4)     // Catch:{ all -> 0x0090 }
            r10.f6212i = r3
            r10.f6213r = r3
            r10.w(r0)
            return
        L_0x0090:
            r0 = move-exception
            r10.j(r0)     // Catch:{ all -> 0x0099 }
            r10.f6212i = r3
            r10.f6213r = r3
            return
        L_0x0099:
            r0 = move-exception
            r10.f6212i = r3
            r10.f6213r = r3
            throw r0
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dh.run():void");
    }

    public abstract void w(@NullableDecl T t10);

    @NullableDecl
    public abstract T x(F f10, X x10) throws Exception;
}
