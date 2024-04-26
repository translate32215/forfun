package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import c8.a;
import c8.b;
import e8.t;
import e8.ti0;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o4 {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7665b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7666c = false;
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    public static boolean f7667d = false;

    /* renamed from: a  reason: collision with root package name */
    public jf f7668a;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (((java.lang.Boolean) e8.ti0.f16763j.f16769f.a(e8.t.H2)).booleanValue() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        l0.e.F("#007 Could not call remote method.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return b(r14, r15, r16, r17, r18, "Google");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r13.f7668a.Z3(r14, new c8.b(r15), r16, r17, r18, "Google", r19.f7917a, r20.f7809a, r21);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0040, B:18:0x0068] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c8.a a(java.lang.String r14, android.webkit.WebView r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.ads.q4 r19, com.google.android.gms.internal.ads.p4 r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r7 = "Google"
            java.lang.Object r1 = f7665b
            monitor-enter(r1)
            e8.l<java.lang.Boolean> r0 = e8.t.F2     // Catch:{ all -> 0x006a }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            r11 = 0
            if (r0 == 0) goto L_0x0067
            boolean r0 = f7666c     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x001d
            goto L_0x0067
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x006a }
            e8.l<java.lang.Boolean> r0 = e8.t.H2
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003f
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            c8.a r11 = r1.b(r2, r3, r4, r5, r6, r7)
            r12 = r13
            goto L_0x0069
        L_0x003f:
            r12 = r13
            com.google.android.gms.internal.ads.jf r1 = r12.f7668a     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            c8.b r3 = new c8.b     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            r0 = r15
            r3.<init>(r15)     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            r0 = r19
            java.lang.String r8 = r0.f7917a     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            r0 = r20
            java.lang.String r9 = r0.f7809a     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r10 = r21
            c8.a r11 = r1.Z3(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x0060, NullPointerException -> 0x005e }
            goto L_0x0069
        L_0x005e:
            r0 = move-exception
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            java.lang.String r1 = "#007 Could not call remote method."
            l0.e.F(r1, r0)
            goto L_0x0069
        L_0x0067:
            r12 = r13
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
        L_0x0069:
            return r11
        L_0x006a:
            r0 = move-exception
            r12 = r13
        L_0x006c:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x006e:
            r0 = move-exception
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o4.a(java.lang.String, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.q4, com.google.android.gms.internal.ads.p4, java.lang.String):c8.a");
    }

    public final a b(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f7665b) {
            try {
                if (((Boolean) ti0.f16763j.f16769f.a(t.F2)).booleanValue()) {
                    if (f7666c) {
                        try {
                            WebView webView2 = webView;
                            return this.f7668a.K0(str, new b(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e10) {
                            e.F("#007 Could not call remote method.", e10);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void c(a aVar, View view) {
        synchronized (f7665b) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.F2)).booleanValue()) {
                if (f7666c) {
                    try {
                        this.f7668a.U5(aVar, new b(view));
                    } catch (RemoteException | NullPointerException e10) {
                        e.F("#007 Could not call remote method.", e10);
                    }
                }
            }
        }
    }

    public final void d(a aVar) {
        synchronized (f7665b) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.F2)).booleanValue()) {
                if (f7666c) {
                    try {
                        this.f7668a.l4(aVar);
                    } catch (RemoteException | NullPointerException e10) {
                        e.F("#007 Could not call remote method.", e10);
                    }
                }
            }
        }
    }

    public final boolean e(Context context) {
        synchronized (f7665b) {
            if (!((Boolean) ti0.f16763j.f16769f.a(t.F2)).booleanValue()) {
                return false;
            }
            if (f7666c) {
                return true;
            }
            try {
                f(context);
                boolean r22 = this.f7668a.r2(new b(context));
                f7666c = r22;
                return r22;
            } catch (RemoteException e10) {
                e = e10;
                e.F("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e11) {
                e = e11;
                e.F("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = f7665b
            monitor-enter(r0)
            e8.l<java.lang.Boolean> r1 = e8.t.F2     // Catch:{ all -> 0x005e }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            boolean r1 = f7667d     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005c
            r1 = 1
            f7667d = r1     // Catch:{ d9 -> 0x0056 }
            java.lang.String r1 = "com.google.android.gms.ads.omid.DynamiteOmid"
            com.google.android.gms.dynamite.DynamiteModule$b r2 = com.google.android.gms.dynamite.DynamiteModule.f5902b     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "com.google.android.gms.ads.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.d(r5, r2, r3)     // Catch:{ Exception -> 0x0049 }
            android.os.IBinder r5 = r5.c(r1)     // Catch:{ Exception -> 0x003e }
            int r1 = e8.g30.f14703a     // Catch:{ Exception -> 0x003e }
            if (r5 != 0) goto L_0x0030
            r5 = 0
            goto L_0x0046
        L_0x0030:
            java.lang.String r1 = "com.google.android.gms.ads.omid.IOmid"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ Exception -> 0x003e }
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.jf     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0040
            r5 = r1
            com.google.android.gms.internal.ads.jf r5 = (com.google.android.gms.internal.ads.jf) r5     // Catch:{ Exception -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r5 = move-exception
            goto L_0x0050
        L_0x0040:
            com.google.android.gms.internal.ads.kf r1 = new com.google.android.gms.internal.ads.kf     // Catch:{ Exception -> 0x003e }
            r1.<init>(r5)     // Catch:{ Exception -> 0x003e }
            r5 = r1
        L_0x0046:
            r4.f7668a = r5     // Catch:{ d9 -> 0x0056 }
            goto L_0x005c
        L_0x0049:
            r5 = move-exception
            e8.d9 r1 = new e8.d9     // Catch:{ Exception -> 0x003e }
            r1.<init>(r5)     // Catch:{ Exception -> 0x003e }
            throw r1     // Catch:{ Exception -> 0x003e }
        L_0x0050:
            e8.d9 r1 = new e8.d9     // Catch:{ d9 -> 0x0056 }
            r1.<init>(r5)     // Catch:{ d9 -> 0x0056 }
            throw r1     // Catch:{ d9 -> 0x0056 }
        L_0x0056:
            r5 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            l0.e.F(r1, r5)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o4.f(android.content.Context):void");
    }
}
