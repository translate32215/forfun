package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import e8.m30;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class nx<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final oy f7661a;

    static {
        oy pyVar;
        oy oyVar = null;
        try {
            Object newInstance = m30.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                e.K("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof oy) {
                        pyVar = (oy) queryLocalInterface;
                    } else {
                        pyVar = new py(iBinder);
                    }
                    oyVar = pyVar;
                }
            }
        } catch (Exception unused) {
            e.K("Failed to instantiate ClientApi class.");
        }
        f7661a = oyVar;
    }

    public abstract T a(oy oyVar) throws RemoteException;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[SYNTHETIC, Splitter:B:24:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L_0x0016
            e8.ti0 r1 = e8.ti0.f16763j
            e8.y8 r1 = r1.f16764a
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = e8.y8.j(r6, r1)
            if (r1 != 0) goto L_0x0016
            java.lang.String r7 = "Google Play Services is not available."
            l0.e.E(r7)
            r7 = 1
        L_0x0016:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.a(r6, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.b(r6, r1)
            if (r2 <= r1) goto L_0x0023
            r7 = 1
        L_0x0023:
            e8.t.a(r6)
            a6.b<java.lang.Boolean> r1 = e8.s0.f16354a
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L_0x0037
            r7 = 0
            goto L_0x0048
        L_0x0037:
            a6.b<java.lang.Boolean> r1 = e8.s0.f16355b
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0048
            r7 = 1
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r3 = 0
            java.lang.String r4 = "Cannot invoke remote loader."
            if (r7 == 0) goto L_0x0060
            java.lang.Object r6 = r5.e()
            if (r6 != 0) goto L_0x00b9
            if (r1 != 0) goto L_0x00b9
            java.lang.Object r3 = r5.d()     // Catch:{ RemoteException -> 0x005b }
            goto L_0x00b8
        L_0x005b:
            r6 = move-exception
            l0.e.D(r4, r6)
            goto L_0x00b8
        L_0x0060:
            java.lang.Object r3 = r5.d()     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r7 = move-exception
            l0.e.D(r4, r7)
        L_0x0069:
            if (r3 != 0) goto L_0x006d
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r7 == 0) goto L_0x00b1
            a6.b<java.lang.Long> r1 = e8.b1.f13862a
            java.lang.Object r1 = r1.b()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            e8.ti0 r4 = e8.ti0.f16763j
            java.util.Random r4 = r4.f16771h
            int r1 = r4.nextInt(r1)
            if (r1 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00b1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r0.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r0.putInt(r1, r7)
            e8.ti0 r7 = e8.ti0.f16763j
            e8.y8 r1 = r7.f16764a
            e8.f9 r7 = r7.f16770g
            java.lang.String r7 = r7.f14544a
            r1.getClass()
            androidx.databinding.a r1 = new androidx.databinding.a
            r2 = 3
            r1.<init>(r2)
            java.lang.String r2 = "gmob-apps"
            e8.y8.b(r6, r7, r2, r0, r1)
        L_0x00b1:
            if (r3 != 0) goto L_0x00b8
            java.lang.Object r6 = r5.e()
            goto L_0x00b9
        L_0x00b8:
            r6 = r3
        L_0x00b9:
            if (r6 != 0) goto L_0x00bf
            java.lang.Object r6 = r5.c()
        L_0x00bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nx.b(android.content.Context, boolean):java.lang.Object");
    }

    public abstract T c();

    public abstract T d() throws RemoteException;

    public final T e() {
        oy oyVar = f7661a;
        if (oyVar == null) {
            e.K("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(oyVar);
        } catch (RemoteException e10) {
            e.D("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }
}
