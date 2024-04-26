package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hr {

    /* renamed from: a  reason: collision with root package name */
    public static oi f6893a;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.internal.ads.fr r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.android.gms.internal.ads.oi r0 = f6893a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            e8.l<java.lang.String> r0 = e8.t.f16658t1
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0036
        L_0x001b:
            r0 = 0
            if (r8 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r3 = "LSN2SsuAiZt66Ly6gZRukDC2DTjf04tC/Nsuivd3hcf60QwmLtKfA3vzupcozm4l"
            java.lang.String r4 = "5ygsPobYt1X5WrczOXkjmvRKWvB07MQMJHpWX2yDXBY="
            java.lang.reflect.Method r8 = r8.b(r3, r4)
            if (r8 != 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r8 = r8.invoke(r0, r3)
            java.lang.String r8 = (java.lang.String) r8
            r0 = r8
        L_0x0033:
            if (r0 != 0) goto L_0x0036
            return r2
        L_0x0036:
            byte[] r8 = com.google.android.gms.internal.ads.uc.b(r0, r1)     // Catch:{ IllegalArgumentException -> 0x011d }
            com.google.android.gms.internal.ads.vi r8 = com.google.android.gms.internal.ads.zi.a(r8)     // Catch:{  }
            com.google.android.gms.internal.ads.eo r0 = e8.d60.f14221a     // Catch:{  }
            java.util.List r0 = r0.y()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0048:
            boolean r3 = r0.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x0114
            java.lang.Object r3 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.pn r3 = (com.google.android.gms.internal.ads.pn) r3     // Catch:{  }
            java.lang.String r4 = r3.y()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x010c
            java.lang.String r4 = r3.z()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0104
            java.lang.String r4 = r3.C()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkMac"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkHybridDecrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkHybridEncrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeySign"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeyVerify"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkStreamingAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = r3.C()     // Catch:{  }
            java.lang.String r5 = "TinkDeterministicAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 == 0) goto L_0x00d4
            goto L_0x0048
        L_0x00d4:
            java.lang.String r4 = r3.C()     // Catch:{  }
            com.google.android.gms.internal.ads.li r4 = com.google.android.gms.internal.ads.dj.k(r4)     // Catch:{  }
            com.google.android.gms.internal.ads.aj r5 = r4.a()     // Catch:{  }
            com.google.android.gms.internal.ads.dj.e(r5)     // Catch:{  }
            java.lang.String r5 = r3.y()     // Catch:{  }
            java.lang.String r6 = r3.z()     // Catch:{  }
            int r7 = r3.A()     // Catch:{  }
            e8.z50 r4 = r4.b(r5, r6, r7)     // Catch:{  }
            boolean r3 = r3.B()     // Catch:{  }
            com.google.android.gms.internal.ads.dj.f(r4, r3)     // Catch:{  }
            goto L_0x0048
        L_0x00fc:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r8.<init>(r0)     // Catch:{  }
            throw r8     // Catch:{  }
        L_0x0104:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r8.<init>(r0)     // Catch:{  }
            throw r8     // Catch:{  }
        L_0x010c:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r8.<init>(r0)     // Catch:{  }
            throw r8     // Catch:{  }
        L_0x0114:
            com.google.android.gms.internal.ads.oi r8 = com.google.android.gms.internal.ads.uk.a(r8)     // Catch:{  }
            f6893a = r8     // Catch:{  }
            if (r8 == 0) goto L_0x011d
            return r1
        L_0x011d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hr.a(com.google.android.gms.internal.ads.fr):boolean");
    }
}
