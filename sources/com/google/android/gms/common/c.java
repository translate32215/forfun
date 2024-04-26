package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import c8.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import s7.a0;
import s7.n;
import s7.o;
import s7.p;
import s7.q;
import s7.r;
import s7.s;
import s7.u;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final u f5803a = new q(s.Y("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b  reason: collision with root package name */
    public static final u f5804b = new r(s.Y("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c  reason: collision with root package name */
    public static volatile com.google.android.gms.common.internal.r f5805c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f5806d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static Context f5807e;

    static {
        new o(s.Y("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new p(s.Y("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    public static f a(String str, s sVar, boolean z10, boolean z11) {
        try {
            b();
            i.h(f5807e);
            try {
                return f5805c.n6(new e(str, sVar, z10, z11), new b(f5807e.getPackageManager())) ? f.f5816d : new a0(new n(z10, str, sVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return f.c("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return f.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            com.google.android.gms.common.internal.r r0 = f5805c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = f5807e
            com.google.android.gms.common.internal.i.h(r0)
            java.lang.Object r0 = f5806d
            monitor-enter(r0)
            com.google.android.gms.common.internal.r r1 = f5805c     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x003f
            android.content.Context r1 = f5807e     // Catch:{ all -> 0x0035 }
            com.google.android.gms.dynamite.DynamiteModule$b r2 = com.google.android.gms.dynamite.DynamiteModule.f5903c     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.d(r1, r2, r3)     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.c(r2)     // Catch:{ all -> 0x0035 }
            int r2 = v7.u.f26599a     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x003d
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ all -> 0x0035 }
            boolean r3 = r2 instanceof com.google.android.gms.common.internal.r     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0037
            r1 = r2
            com.google.android.gms.common.internal.r r1 = (com.google.android.gms.common.internal.r) r1     // Catch:{ all -> 0x0035 }
            goto L_0x003d
        L_0x0035:
            r1 = move-exception
            goto L_0x0041
        L_0x0037:
            com.google.android.gms.common.internal.q r2 = new com.google.android.gms.common.internal.q     // Catch:{ all -> 0x0035 }
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            r1 = r2
        L_0x003d:
            f5805c = r1     // Catch:{ all -> 0x0035 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.c.b():void");
    }
}
