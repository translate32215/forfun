package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.b;
import com.google.android.gms.internal.ads.ms;
import e8.f80;
import e8.y10;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class gg {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f6639e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f6640a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f6641b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6642c;

    /* renamed from: d  reason: collision with root package name */
    public final y10 f6643d;

    public gg(Context context, js jsVar, y10 y10) {
        this.f6640a = context;
        this.f6642c = Integer.toString(jsVar.f7173a);
        this.f6641b = context.getSharedPreferences("pcvmspf", 0);
        this.f6643d = y10;
    }

    public static String g(ls lsVar) {
        ms.a J = ms.J();
        String E = lsVar.z().E();
        if (J.f5971c) {
            J.n();
            J.f5971c = false;
        }
        ms.z((ms) J.f5970b, E);
        String F = lsVar.z().F();
        if (J.f5971c) {
            J.n();
            J.f5971c = false;
        }
        ms.C((ms) J.f5970b, F);
        long H = lsVar.z().H();
        if (J.f5971c) {
            J.n();
            J.f5971c = false;
        }
        ms.B((ms) J.f5970b, H);
        long I = lsVar.z().I();
        if (J.f5971c) {
            J.n();
            J.f5971c = false;
        }
        ms.D((ms) J.f5970b, I);
        long G = lsVar.z().G();
        if (J.f5971c) {
            J.n();
            J.f5971c = false;
        }
        ms.y((ms) J.f5970b, G);
        return b.a(((ms) ((aq) J.j())).g().c());
    }

    public final void a(int i10, long j10) {
        y10 y10 = this.f6643d;
        if (y10 != null) {
            ((mf) y10.f17566a).e(i10, System.currentTimeMillis() - j10);
        }
    }

    public final void b(int i10, long j10, String str) {
        y10 y10 = this.f6643d;
        if (y10 != null) {
            ((mf) y10.f17566a).b(i10, System.currentTimeMillis() - j10, (Exception) null, (String) null, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(com.google.android.gms.internal.ads.ls r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f6639e
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ms r3 = r7.z()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.E()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.i(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.mp r3 = r7.B()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.c()     // Catch:{ all -> 0x0054 }
            boolean r3 = l0.e.x(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.a(r7, r0)     // Catch:{ all -> 0x0054 }
            r7 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0030:
            java.lang.String r7 = g(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f6641b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.f()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.a(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.a(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gg.c(com.google.android.gms.internal.ads.ls):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(com.google.android.gms.internal.ads.ls r17, e8.y10 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r4 = f6639e
            monitor-enter(r4)
            r5 = 1
            com.google.android.gms.internal.ads.ms r6 = r1.h(r5)     // Catch:{ all -> 0x018c }
            com.google.android.gms.internal.ads.ms r7 = r17.z()     // Catch:{ all -> 0x018c }
            java.lang.String r7 = r7.E()     // Catch:{ all -> 0x018c }
            r8 = 0
            if (r6 == 0) goto L_0x002c
            java.lang.String r6 = r6.E()     // Catch:{ all -> 0x018c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x002c
            r0 = 4014(0xfae, float:5.625E-42)
            r1.a(r0, r2)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x002c:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018c }
            java.io.File r6 = r1.i(r7)     // Catch:{ all -> 0x018c }
            boolean r11 = r6.exists()     // Catch:{ all -> 0x018c }
            r12 = 4015(0xfaf, float:5.626E-42)
            if (r11 == 0) goto L_0x007f
            r11 = 4023(0xfb7, float:5.637E-42)
            boolean r13 = r6.isDirectory()     // Catch:{ all -> 0x018c }
            if (r13 == 0) goto L_0x0047
            java.lang.String r13 = "1"
            goto L_0x0049
        L_0x0047:
            java.lang.String r13 = "0"
        L_0x0049:
            boolean r6 = r6.isFile()     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x0052
            java.lang.String r6 = "1"
            goto L_0x0054
        L_0x0052:
            java.lang.String r6 = "0"
        L_0x0054:
            int r14 = r13.length()     // Catch:{ all -> 0x018c }
            int r14 = r14 + 5
            int r15 = r6.length()     // Catch:{ all -> 0x018c }
            int r14 = r14 + r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r15.<init>(r14)     // Catch:{ all -> 0x018c }
            java.lang.String r14 = "d:"
            r15.append(r14)     // Catch:{ all -> 0x018c }
            r15.append(r13)     // Catch:{ all -> 0x018c }
            java.lang.String r13 = ",f:"
            r15.append(r13)     // Catch:{ all -> 0x018c }
            r15.append(r6)     // Catch:{ all -> 0x018c }
            java.lang.String r6 = r15.toString()     // Catch:{ all -> 0x018c }
            r1.b(r11, r9, r6)     // Catch:{ all -> 0x018c }
            r1.a(r12, r9)     // Catch:{ all -> 0x018c }
            goto L_0x00ac
        L_0x007f:
            boolean r11 = r6.mkdirs()     // Catch:{ all -> 0x018c }
            if (r11 != 0) goto L_0x00ac
            r11 = 4024(0xfb8, float:5.639E-42)
            java.lang.String r13 = "cw:"
            boolean r6 = r6.canWrite()     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x0092
            java.lang.String r6 = "1"
            goto L_0x0094
        L_0x0092:
            java.lang.String r6 = "0"
        L_0x0094:
            int r14 = r6.length()     // Catch:{ all -> 0x018c }
            if (r14 == 0) goto L_0x009f
            java.lang.String r6 = r13.concat(r6)     // Catch:{ all -> 0x018c }
            goto L_0x00a4
        L_0x009f:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x018c }
            r6.<init>(r13)     // Catch:{ all -> 0x018c }
        L_0x00a4:
            r1.b(r11, r9, r6)     // Catch:{ all -> 0x018c }
            r1.a(r12, r9)     // Catch:{ all -> 0x018c }
            r6 = 0
            goto L_0x00ad
        L_0x00ac:
            r6 = 1
        L_0x00ad:
            if (r6 != 0) goto L_0x00b1
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x00b1:
            java.io.File r6 = r1.i(r7)     // Catch:{ all -> 0x018c }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x018c }
            java.lang.String r9 = "pcam.jar"
            r7.<init>(r6, r9)     // Catch:{ all -> 0x018c }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "pcbc"
            r9.<init>(r6, r10)     // Catch:{ all -> 0x018c }
            com.google.android.gms.internal.ads.mp r10 = r17.A()     // Catch:{ all -> 0x018c }
            byte[] r10 = r10.c()     // Catch:{ all -> 0x018c }
            boolean r10 = l0.e.x(r7, r10)     // Catch:{ all -> 0x018c }
            if (r10 != 0) goto L_0x00d8
            r0 = 4016(0xfb0, float:5.628E-42)
            r1.a(r0, r2)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x00d8:
            com.google.android.gms.internal.ads.mp r10 = r17.B()     // Catch:{ all -> 0x018c }
            byte[] r10 = r10.c()     // Catch:{ all -> 0x018c }
            boolean r9 = l0.e.x(r9, r10)     // Catch:{ all -> 0x018c }
            if (r9 != 0) goto L_0x00ed
            r0 = 4017(0xfb1, float:5.629E-42)
            r1.a(r0, r2)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x00ed:
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r0.f17566a     // Catch:{ GeneralSecurityException -> 0x00f8 }
            com.google.android.gms.internal.ads.lf r0 = (com.google.android.gms.internal.ads.lf) r0     // Catch:{ GeneralSecurityException -> 0x00f8 }
            boolean r0 = r0.a(r7)     // Catch:{ GeneralSecurityException -> 0x00f8 }
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r0 != 0) goto L_0x0105
            r0 = 4018(0xfb2, float:5.63E-42)
            r1.a(r0, r2)     // Catch:{ all -> 0x018c }
            l0.e.G(r6)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x0105:
            java.lang.String r0 = g(r17)     // Catch:{ all -> 0x018c }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018c }
            android.content.SharedPreferences r9 = r1.f6641b     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r16.f()     // Catch:{ all -> 0x018c }
            r11 = 0
            java.lang.String r9 = r9.getString(r10, r11)     // Catch:{ all -> 0x018c }
            android.content.SharedPreferences r10 = r1.f6641b     // Catch:{ all -> 0x018c }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r16.f()     // Catch:{ all -> 0x018c }
            r10.putString(r11, r0)     // Catch:{ all -> 0x018c }
            if (r9 == 0) goto L_0x012e
            java.lang.String r0 = r16.e()     // Catch:{ all -> 0x018c }
            r10.putString(r0, r9)     // Catch:{ all -> 0x018c }
        L_0x012e:
            boolean r0 = r10.commit()     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0139
            r9 = 4019(0xfb3, float:5.632E-42)
            r1.a(r9, r6)     // Catch:{ all -> 0x018c }
        L_0x0139:
            if (r0 != 0) goto L_0x013d
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r8
        L_0x013d:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x018c }
            r0.<init>()     // Catch:{ all -> 0x018c }
            com.google.android.gms.internal.ads.ms r6 = r1.h(r5)     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x014f
            java.lang.String r6 = r6.E()     // Catch:{ all -> 0x018c }
            r0.add(r6)     // Catch:{ all -> 0x018c }
        L_0x014f:
            r6 = 2
            com.google.android.gms.internal.ads.ms r6 = r1.h(r6)     // Catch:{ all -> 0x018c }
            if (r6 == 0) goto L_0x015d
            java.lang.String r6 = r6.E()     // Catch:{ all -> 0x018c }
            r0.add(r6)     // Catch:{ all -> 0x018c }
        L_0x015d:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x018c }
            android.content.Context r7 = r1.f6640a     // Catch:{ all -> 0x018c }
            java.lang.String r9 = "pccache"
            java.io.File r7 = r7.getDir(r9, r8)     // Catch:{ all -> 0x018c }
            java.lang.String r9 = r1.f6642c     // Catch:{ all -> 0x018c }
            r6.<init>(r7, r9)     // Catch:{ all -> 0x018c }
            java.io.File[] r6 = r6.listFiles()     // Catch:{ all -> 0x018c }
            int r7 = r6.length     // Catch:{ all -> 0x018c }
        L_0x0171:
            if (r8 >= r7) goto L_0x0185
            r9 = r6[r8]     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r9.getName()     // Catch:{ all -> 0x018c }
            boolean r10 = r0.contains(r10)     // Catch:{ all -> 0x018c }
            if (r10 != 0) goto L_0x0182
            l0.e.G(r9)     // Catch:{ all -> 0x018c }
        L_0x0182:
            int r8 = r8 + 1
            goto L_0x0171
        L_0x0185:
            r0 = 5014(0x1396, float:7.026E-42)
            r1.a(r0, r2)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            return r5
        L_0x018c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018c }
            goto L_0x0190
        L_0x018f:
            throw r0
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gg.d(com.google.android.gms.internal.ads.ls, e8.y10):boolean");
    }

    public final String e() {
        String valueOf = String.valueOf(this.f6642c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    public final String f() {
        String valueOf = String.valueOf(this.f6642c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    public final ms h(int i10) {
        String str;
        if (i10 == 1) {
            str = this.f6641b.getString(f(), (String) null);
        } else {
            str = i10 == 2 ? this.f6641b.getString(e(), (String) null) : null;
        }
        if (str == null) {
            return null;
        }
        try {
            byte[] c10 = b.c(str);
            mp mpVar = mp.f7494b;
            return ms.A(mp.I(c10, 0, c10.length), up.b());
        } catch (f80 unused) {
            return null;
        }
    }

    public final File i(String str) {
        return new File(new File(this.f6640a.getDir("pccache", 0), this.f6642c), str);
    }
}
