package com.startapp;

import android.content.Context;

/* compiled from: Sta */
public class s4 extends t4 {

    /* renamed from: e  reason: collision with root package name */
    public final Context f11695e;

    public s4(Context context, i4 i4Var, k4 k4Var, n4 n4Var) {
        super(i4Var, k4Var, n4Var);
        this.f11695e = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02d0 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a() {
        /*
            r9 = this;
            com.startapp.r4 r2 = new com.startapp.r4
            com.startapp.i4 r0 = r9.f12609a
            r2.<init>(r0)
            android.content.Context r0 = r9.f11695e
            r2.c(r0)
            com.startapp.i4 r0 = r9.f12609a
            java.lang.String r0 = r0.f10536c
            if (r0 == 0) goto L_0x001a
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x001a
            r2.f12841c = r0
        L_0x001a:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 32
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x003f
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x002f }
            com.startapp.sdk.adsbase.SimpleTokenUtils.e(r0)     // Catch:{ all -> 0x002f }
            goto L_0x003f
        L_0x002f:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x003f
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x003f:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0074
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x0064 }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x0064 }
            com.startapp.pa r0 = r0.t()     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x0064 }
            com.startapp.na r0 = (com.startapp.na) r0     // Catch:{ all -> 0x0064 }
            r1 = 6
            java.lang.String r0 = r0.b(r1)     // Catch:{ all -> 0x0064 }
            r2.f11657l0 = r0     // Catch:{ all -> 0x0064 }
            goto L_0x0074
        L_0x0064:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x0074
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0074:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & r7
            if (r0 == 0) goto L_0x007d
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r8 = 0
            if (r0 == 0) goto L_0x0097
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x0087 }
            r2.b(r0, r8)     // Catch:{ all -> 0x0087 }
            goto L_0x0097
        L_0x0087:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x0097
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0097:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 == 0) goto L_0x00ba
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x00aa }
            r2.d(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x00ba
        L_0x00aa:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x00ba
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x00ba:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c4
            r0 = 1
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            if (r0 == 0) goto L_0x00dd
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x00cd }
            r2.e(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00dd
        L_0x00cd:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x00dd
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x00dd:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00e7
            r0 = 1
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            if (r0 == 0) goto L_0x0100
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x00f0 }
            r2.a((android.content.Context) r0)     // Catch:{ all -> 0x00f0 }
            goto L_0x0100
        L_0x00f0:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x0100
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0100:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x010a
            r0 = 1
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            if (r0 == 0) goto L_0x0123
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x0113 }
            r2.b(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x0123
        L_0x0113:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x0123
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0123:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 64
            if (r0 == 0) goto L_0x012d
            r0 = 1
            goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            if (r0 == 0) goto L_0x0166
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x0156 }
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.wb.f12765a     // Catch:{ all -> 0x0156 }
            android.content.res.Resources r3 = r0.getResources()     // Catch:{ all -> 0x014b }
            java.lang.String r4 = "com_startapp_sdk_aar"
            java.lang.String r5 = "integer"
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x014b }
            int r0 = r3.getIdentifier(r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x014b
            int r0 = r3.getInteger(r0)     // Catch:{ all -> 0x014b }
            goto L_0x014c
        L_0x014b:
            r0 = 0
        L_0x014c:
            if (r0 != r7) goto L_0x0151
            java.lang.String r0 = "aar"
            goto L_0x0153
        L_0x0151:
            java.lang.String r0 = "jar"
        L_0x0153:
            r2.f11660o0 = r0     // Catch:{ all -> 0x0156 }
            goto L_0x0166
        L_0x0156:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x0166
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x0166:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0170
            r0 = 1
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            if (r0 == 0) goto L_0x01aa
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x019a }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x019a }
            com.startapp.y1<com.startapp.j1> r0 = r0.f12476r     // Catch:{ all -> 0x019a }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x019a }
            com.startapp.j1 r0 = (com.startapp.j1) r0     // Catch:{ all -> 0x019a }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x019a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x01aa
            byte[] r3 = com.startapp.a.f9998a     // Catch:{ all -> 0x019a }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x019a }
            byte[] r0 = com.startapp.a.a((byte[]) r0)     // Catch:{ all -> 0x019a }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x019a }
            r2.f11659n0 = r0     // Catch:{ all -> 0x019a }
            goto L_0x01aa
        L_0x019a:
            r0 = move-exception
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10589f
            if (r3 == r4) goto L_0x01aa
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x01aa:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b4
            r0 = 1
            goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            if (r0 == 0) goto L_0x01ee
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x01de }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x01de }
            com.startapp.y1<com.startapp.p9> r0 = r0.f12477s     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x01de }
            com.startapp.p9 r0 = (com.startapp.p9) r0     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x01de }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01ee
            byte[] r3 = com.startapp.a.f9998a     // Catch:{ all -> 0x01de }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x01de }
            byte[] r0 = com.startapp.a.a((byte[]) r0)     // Catch:{ all -> 0x01de }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x01de }
            r2.f11658m0 = r0     // Catch:{ all -> 0x01de }
            goto L_0x01ee
        L_0x01de:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x01ee
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x01ee:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01f8
            r0 = 1
            goto L_0x01f9
        L_0x01f8:
            r0 = 0
        L_0x01f9:
            if (r0 == 0) goto L_0x021c
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x020c }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x020c }
            com.startapp.x r0 = r0.b()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x020c }
            r2.Y = r0     // Catch:{ all -> 0x020c }
            goto L_0x021c
        L_0x020c:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x021c
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x021c:
            com.startapp.k4 r0 = r9.f12610b
            int r0 = r0.f10782b
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0226
            r0 = 1
            goto L_0x0227
        L_0x0226:
            r0 = 0
        L_0x0227:
            if (r0 == 0) goto L_0x024e
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x023e }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x023e }
            com.startapp.sa r0 = r0.u()     // Catch:{ all -> 0x023e }
            com.startapp.i4 r1 = r9.f12609a     // Catch:{ all -> 0x023e }
            com.startapp.j4 r1 = r1.f10534a     // Catch:{ all -> 0x023e }
            java.util.Map r0 = r0.a((com.startapp.j4) r1)     // Catch:{ all -> 0x023e }
            r2.f11661p0 = r0     // Catch:{ all -> 0x023e }
            goto L_0x024e
        L_0x023e:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x024e
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x024e:
            android.content.Context r0 = r9.f11695e     // Catch:{ all -> 0x025f }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x025f }
            com.startapp.x8 r0 = r0.q()     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r0.a((java.lang.Object) r2)     // Catch:{ all -> 0x025f }
            r2.J = r0     // Catch:{ all -> 0x025f }
            goto L_0x026f
        L_0x025f:
            r0 = move-exception
            com.startapp.i4 r1 = r9.f12609a
            com.startapp.j4 r1 = r1.f10534a
            com.startapp.j4 r3 = com.startapp.j4.f10589f
            if (r1 == r3) goto L_0x026f
            java.lang.Throwable r0 = r9.a(r0)
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x026f:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
            com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r0 = r0.analytics
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12393k
            com.startapp.sdk.insight.NetworkTestsMetaData r1 = r1.z()
            com.startapp.i4 r3 = r9.f12609a
            com.startapp.j4 r3 = r3.f10534a
            com.startapp.j4 r4 = com.startapp.j4.f10599p
            if (r3 != r4) goto L_0x0288
            if (r1 == 0) goto L_0x029e
            java.lang.String r1 = r1.g()
            goto L_0x02ab
        L_0x0288:
            com.startapp.j4 r4 = com.startapp.j4.f10600q
            if (r3 != r4) goto L_0x0293
            if (r1 == 0) goto L_0x029e
            java.lang.String r1 = r1.h()
            goto L_0x02ab
        L_0x0293:
            com.startapp.j4 r4 = com.startapp.j4.f10601r
            if (r3 != r4) goto L_0x02a0
            if (r1 == 0) goto L_0x029e
            java.lang.String r1 = r1.i()
            goto L_0x02ab
        L_0x029e:
            r1 = r8
            goto L_0x02ab
        L_0x02a0:
            com.startapp.j4 r1 = com.startapp.j4.f10594k
            if (r3 != r1) goto L_0x029e
            java.lang.String r1 = r0.hostPeriodic
            if (r1 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            java.lang.String r1 = com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig.f12385a
        L_0x02ab:
            if (r1 != 0) goto L_0x02b5
            java.lang.String r0 = r0.hostSecured
            if (r0 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            java.lang.String r0 = com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig.f12385a
        L_0x02b4:
            r1 = r0
        L_0x02b5:
            android.content.Context r0 = r9.f11695e
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)
            com.startapp.y3 r0 = r0.k()
            r0.getClass()
            r5 = 0
            r4 = 0
            r3 = 0
            java.lang.String r8 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x02ca }
            goto L_0x02ce
        L_0x02ca:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x02ce:
            if (r8 == 0) goto L_0x02d1
            r6 = 1
        L_0x02d1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.s4.a():int");
    }
}
