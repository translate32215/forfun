package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.b;
import e8.f80;
import java.io.File;
import l0.d;
import l0.e;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class fg {

    /* renamed from: a  reason: collision with root package name */
    public final File f6462a;

    /* renamed from: b  reason: collision with root package name */
    public final File f6463b;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f6464c;

    /* renamed from: d  reason: collision with root package name */
    public final js f6465d;

    public fg(Context context, js jsVar) {
        this.f6464c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        e.r(dir, false);
        this.f6462a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        e.r(dir2, true);
        this.f6463b = dir2;
        this.f6465d = jsVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.ls r9, e8.y10 r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            java.lang.String r0 = r0.E()
            com.google.android.gms.internal.ads.mp r1 = r9.A()
            byte[] r1 = r1.c()
            com.google.android.gms.internal.ads.mp r2 = r9.B()
            byte[] r2 = r2.c()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            java.lang.String r5 = "pcbc"
            java.lang.String r6 = "pcam.jar"
            if (r3 != 0) goto L_0x0059
            if (r2 == 0) goto L_0x0059
            int r3 = r2.length
            if (r3 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            java.io.File r3 = r8.f6463b
            l0.e.G(r3)
            java.io.File r3 = r8.f6463b
            r3.mkdirs()
            java.io.File r3 = r8.f6463b
            java.io.File r3 = l0.e.s(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r8.f6463b
            java.io.File r3 = l0.e.t(r0, r6, r3)
            if (r1 == 0) goto L_0x004e
            int r7 = r1.length
            if (r7 <= 0) goto L_0x004e
            boolean r1 = l0.e.x(r3, r1)
            if (r1 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.io.File r1 = r8.f6463b
            java.io.File r0 = l0.e.t(r0, r5, r1)
            boolean r0 = l0.e.x(r0, r2)
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            return r4
        L_0x005d:
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            java.lang.String r0 = r0.E()
            java.io.File r1 = r8.f6463b
            java.io.File r0 = l0.e.t(r0, r6, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0080
            if (r10 == 0) goto L_0x0080
            java.lang.Object r10 = r10.f17566a     // Catch:{ GeneralSecurityException -> 0x007c }
            com.google.android.gms.internal.ads.lf r10 = (com.google.android.gms.internal.ads.lf) r10     // Catch:{ GeneralSecurityException -> 0x007c }
            boolean r10 = r10.a(r0)     // Catch:{ GeneralSecurityException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r10 = 0
        L_0x007d:
            if (r10 != 0) goto L_0x0080
            return r4
        L_0x0080:
            com.google.android.gms.internal.ads.ms r10 = r9.z()
            java.lang.String r10 = r10.E()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            if (r0 != 0) goto L_0x00c5
            java.io.File r0 = r8.f6463b
            java.io.File r0 = l0.e.t(r10, r6, r0)
            java.io.File r2 = r8.f6463b
            java.io.File r2 = l0.e.t(r10, r5, r2)
            java.io.File r3 = r8.b()
            java.io.File r3 = l0.e.t(r10, r6, r3)
            java.io.File r6 = r8.b()
            java.io.File r10 = l0.e.t(r10, r5, r6)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x00b7
            boolean r0 = r0.renameTo(r3)
            if (r0 == 0) goto L_0x00c5
        L_0x00b7:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00c5
            boolean r10 = r2.renameTo(r10)
            if (r10 == 0) goto L_0x00c5
            r10 = 1
            goto L_0x00c6
        L_0x00c5:
            r10 = 0
        L_0x00c6:
            if (r10 == 0) goto L_0x0194
            com.google.android.gms.internal.ads.ms$a r10 = com.google.android.gms.internal.ads.ms.J()
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            java.lang.String r0 = r0.E()
            boolean r2 = r10.f5971c
            if (r2 == 0) goto L_0x00dd
            r10.n()
            r10.f5971c = r4
        L_0x00dd:
            MessageType r2 = r10.f5970b
            com.google.android.gms.internal.ads.ms r2 = (com.google.android.gms.internal.ads.ms) r2
            com.google.android.gms.internal.ads.ms.z(r2, r0)
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            java.lang.String r0 = r0.F()
            boolean r2 = r10.f5971c
            if (r2 == 0) goto L_0x00f5
            r10.n()
            r10.f5971c = r4
        L_0x00f5:
            MessageType r2 = r10.f5970b
            com.google.android.gms.internal.ads.ms r2 = (com.google.android.gms.internal.ads.ms) r2
            com.google.android.gms.internal.ads.ms.C(r2, r0)
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            long r2 = r0.H()
            boolean r0 = r10.f5971c
            if (r0 == 0) goto L_0x010d
            r10.n()
            r10.f5971c = r4
        L_0x010d:
            MessageType r0 = r10.f5970b
            com.google.android.gms.internal.ads.ms r0 = (com.google.android.gms.internal.ads.ms) r0
            com.google.android.gms.internal.ads.ms.B(r0, r2)
            com.google.android.gms.internal.ads.ms r0 = r9.z()
            long r2 = r0.I()
            boolean r0 = r10.f5971c
            if (r0 == 0) goto L_0x0125
            r10.n()
            r10.f5971c = r4
        L_0x0125:
            MessageType r0 = r10.f5970b
            com.google.android.gms.internal.ads.ms r0 = (com.google.android.gms.internal.ads.ms) r0
            com.google.android.gms.internal.ads.ms.D(r0, r2)
            com.google.android.gms.internal.ads.ms r9 = r9.z()
            long r2 = r9.G()
            boolean r9 = r10.f5971c
            if (r9 == 0) goto L_0x013d
            r10.n()
            r10.f5971c = r4
        L_0x013d:
            MessageType r9 = r10.f5970b
            com.google.android.gms.internal.ads.ms r9 = (com.google.android.gms.internal.ads.ms) r9
            com.google.android.gms.internal.ads.ms.y(r9, r2)
            com.google.android.gms.internal.ads.cq r9 = r10.j()
            com.google.android.gms.internal.ads.aq r9 = (com.google.android.gms.internal.ads.aq) r9
            com.google.android.gms.internal.ads.ms r9 = (com.google.android.gms.internal.ads.ms) r9
            com.google.android.gms.internal.ads.ms r10 = r8.e(r1)
            android.content.SharedPreferences r0 = r8.f6464c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x0179
            java.lang.String r2 = r9.E()
            java.lang.String r3 = r10.E()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0179
            java.lang.String r2 = r8.c()
            com.google.android.gms.internal.ads.mp r10 = r10.g()
            byte[] r10 = r10.c()
            java.lang.String r10 = com.google.android.gms.common.util.b.a(r10)
            r0.putString(r2, r10)
        L_0x0179:
            java.lang.String r10 = r8.d()
            com.google.android.gms.internal.ads.mp r9 = r9.g()
            byte[] r9 = r9.c()
            java.lang.String r9 = com.google.android.gms.common.util.b.a(r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x0194
            r9 = 1
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            com.google.android.gms.internal.ads.ms r0 = r8.e(r1)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r0.E()
            r10.add(r0)
        L_0x01a7:
            r0 = 2
            com.google.android.gms.internal.ads.ms r0 = r8.e(r0)
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = r0.E()
            r10.add(r0)
        L_0x01b5:
            java.io.File r0 = r8.b()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x01be:
            if (r4 >= r1) goto L_0x01da
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r10.contains(r2)
            if (r3 != 0) goto L_0x01d7
            java.io.File r3 = r8.b()
            java.io.File r2 = l0.e.s(r2, r3)
            l0.e.G(r2)
        L_0x01d7:
            int r4 = r4 + 1
            goto L_0x01be
        L_0x01da:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fg.a(com.google.android.gms.internal.ads.ls, e8.y10):boolean");
    }

    public final File b() {
        File file = new File(this.f6462a, Integer.toString(this.f6465d.f7173a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String c() {
        return d.a(17, "FBAMTD", this.f6465d.f7173a);
    }

    public final String d() {
        return d.a(17, "LATMTD", this.f6465d.f7173a);
    }

    public final ms e(int i10) {
        String str;
        boolean z10 = true;
        if (i10 == 1) {
            str = this.f6464c.getString(d(), (String) null);
        } else {
            str = i10 == 2 ? this.f6464c.getString(c(), (String) null) : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] c10 = b.c(str);
            mp mpVar = mp.f7494b;
            ms M = ms.M(mp.I(c10, 0, c10.length));
            String E = M.E();
            File t10 = e.t(E, "pcam.jar", b());
            if (!t10.exists()) {
                t10 = e.t(E, "pcam", b());
            }
            File t11 = e.t(E, "pcbc", b());
            if (!t10.exists() || !t11.exists()) {
                z10 = false;
            }
            if (z10) {
                return M;
            }
            return null;
        } catch (f80 unused) {
        }
    }
}
