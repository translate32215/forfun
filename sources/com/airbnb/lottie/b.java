package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;
import u2.d;
import u2.k;

/* compiled from: LottieCompositionFactory */
public class b implements Callable<k<d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f4867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4868b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4869c;

    public b(Context context, String str, String str2) {
        this.f4867a = context;
        this.f4868b = str;
        this.f4869c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() throws java.lang.Exception {
        /*
            r10 = this;
            android.content.Context r0 = r10.f4867a
            java.lang.String r1 = r10.f4868b
            java.lang.String r2 = r10.f4869c
            d3.c r3 = new d3.c
            r3.<init>(r0, r1, r2)
            d3.a r0 = d3.a.ZIP
            d3.b r1 = r3.f12961b
            r2 = 0
            if (r1 != 0) goto L_0x0014
            goto L_0x008c
        L_0x0014:
            java.lang.String r4 = r3.f12960a
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0065 }
            java.io.File r6 = r1.b()     // Catch:{ FileNotFoundException -> 0x0065 }
            d3.a r7 = d3.a.JSON     // Catch:{ FileNotFoundException -> 0x0065 }
            r8 = 0
            java.lang.String r9 = d3.b.a(r4, r7, r8)     // Catch:{ FileNotFoundException -> 0x0065 }
            r5.<init>(r6, r9)     // Catch:{ FileNotFoundException -> 0x0065 }
            boolean r6 = r5.exists()     // Catch:{ FileNotFoundException -> 0x0065 }
            if (r6 == 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0065 }
            java.io.File r1 = r1.b()     // Catch:{ FileNotFoundException -> 0x0065 }
            java.lang.String r4 = d3.b.a(r4, r0, r8)     // Catch:{ FileNotFoundException -> 0x0065 }
            r5.<init>(r1, r4)     // Catch:{ FileNotFoundException -> 0x0065 }
            boolean r1 = r5.exists()     // Catch:{ FileNotFoundException -> 0x0065 }
            if (r1 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            if (r5 != 0) goto L_0x0045
            goto L_0x0065
        L_0x0045:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0065 }
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.String r6 = ".zip"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L_0x0057
            r7 = r0
        L_0x0057:
            r5.getAbsolutePath()
            u2.h r4 = g3.c.f18423a
            r4.getClass()
            n0.c r4 = new n0.c
            r4.<init>(r7, r1)
            goto L_0x0066
        L_0x0065:
            r4 = r2
        L_0x0066:
            if (r4 != 0) goto L_0x0069
            goto L_0x008c
        L_0x0069:
            F r1 = r4.f21812a
            d3.a r1 = (d3.a) r1
            S r4 = r4.f21813b
            java.io.InputStream r4 = (java.io.InputStream) r4
            if (r1 != r0) goto L_0x007f
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r4)
            java.lang.String r1 = r3.f12960a
            u2.k r0 = com.airbnb.lottie.a.d(r0, r1)
            goto L_0x0085
        L_0x007f:
            java.lang.String r0 = r3.f12960a
            u2.k r0 = com.airbnb.lottie.a.b(r4, r0)
        L_0x0085:
            V r0 = r0.f26011a
            if (r0 == 0) goto L_0x008c
            r2 = r0
            u2.d r2 = (u2.d) r2
        L_0x008c:
            if (r2 == 0) goto L_0x0094
            u2.k r0 = new u2.k
            r0.<init>(r2)
            goto L_0x00a5
        L_0x0094:
            u2.h r0 = g3.c.f18423a
            r0.getClass()
            u2.k r0 = r3.a()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            u2.k r1 = new u2.k
            r1.<init>((java.lang.Throwable) r0)
            r0 = r1
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.call():java.lang.Object");
    }
}
