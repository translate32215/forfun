package com.google.android.gms.internal.ads;

import android.os.Bundle;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qb implements zh<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f7937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ rb f7938b;

    public qb(rb rbVar, boolean z10) {
        this.f7938b = rbVar;
        this.f7937a = z10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r1.equals("native") == false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r10) {
        /*
            r9 = this;
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r10.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x000f
            java.util.List r0 = (java.util.List) r0
            goto L_0x0019
        L_0x000f:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x003f
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0019:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0026
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L_0x0026
        L_0x003a:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0043
        L_0x003f:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0043:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r5 = -1
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r6 = r1.hashCode()
            switch(r6) {
                case -1396342996: goto L_0x0086;
                case -1052618729: goto L_0x007d;
                case -239580146: goto L_0x0072;
                case 604727084: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            r2 = -1
            goto L_0x0090
        L_0x0067:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0070
            goto L_0x0065
        L_0x0070:
            r2 = 3
            goto L_0x0090
        L_0x0072:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007b
            goto L_0x0065
        L_0x007b:
            r2 = 2
            goto L_0x0090
        L_0x007d:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0090
            goto L_0x0065
        L_0x0086:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x008f
            goto L_0x0065
        L_0x008f:
            r2 = 0
        L_0x0090:
            switch(r2) {
                case 0: goto L_0x009f;
                case 1: goto L_0x009c;
                case 2: goto L_0x0099;
                case 3: goto L_0x0096;
                default: goto L_0x0093;
            }
        L_0x0093:
            com.google.android.gms.internal.ads.wv$a r1 = com.google.android.gms.internal.ads.wv.a.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00a1
        L_0x0096:
            com.google.android.gms.internal.ads.wv$a r1 = com.google.android.gms.internal.ads.wv.a.INTERSTITIAL
            goto L_0x00a1
        L_0x0099:
            com.google.android.gms.internal.ads.wv$a r1 = com.google.android.gms.internal.ads.wv.a.REWARD_BASED_VIDEO_AD
            goto L_0x00a1
        L_0x009c:
            com.google.android.gms.internal.ads.wv$a r1 = com.google.android.gms.internal.ads.wv.a.NATIVE_APP_INSTALL
            goto L_0x00a1
        L_0x009f:
            com.google.android.gms.internal.ads.wv$a r1 = com.google.android.gms.internal.ads.wv.a.BANNER
        L_0x00a1:
            r4.add(r1)
            goto L_0x004c
        L_0x00a5:
            java.lang.String r0 = "device"
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 != 0) goto L_0x00b2
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x00b2:
            java.lang.String r1 = "network"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L_0x00bf
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x00bf:
            java.lang.String r1 = "active_network_state"
            int r0 = r0.getInt(r1, r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.iw$b> r1 = com.google.android.gms.internal.ads.rb.f8020g
            com.google.android.gms.internal.ads.iw$b r6 = com.google.android.gms.internal.ads.iw.b.UNSPECIFIED
            java.lang.Object r0 = r1.get(r0, r6)
            r6 = r0
            com.google.android.gms.internal.ads.iw$b r6 = (com.google.android.gms.internal.ads.iw.b) r6
            com.google.android.gms.internal.ads.rb r0 = r9.f7938b
            r0.getClass()
            com.google.android.gms.internal.ads.gw$a r1 = com.google.android.gms.internal.ads.gw.E()
            r7 = -2
            java.lang.String r8 = "cnt"
            int r7 = r10.getInt(r8, r7)
            java.lang.String r8 = "gnt"
            int r10 = r10.getInt(r8, r3)
            if (r7 != r5) goto L_0x00ed
            com.google.android.gms.internal.ads.yw r10 = com.google.android.gms.internal.ads.yw.ENUM_TRUE
            r0.f8026f = r10
            goto L_0x0124
        L_0x00ed:
            com.google.android.gms.internal.ads.yw r5 = com.google.android.gms.internal.ads.yw.ENUM_FALSE
            r0.f8026f = r5
            if (r7 == 0) goto L_0x0101
            if (r7 == r2) goto L_0x00fb
            com.google.android.gms.internal.ads.gw$c r0 = com.google.android.gms.internal.ads.gw.c.NETWORKTYPE_UNSPECIFIED
            r1.o(r0)
            goto L_0x0106
        L_0x00fb:
            com.google.android.gms.internal.ads.gw$c r0 = com.google.android.gms.internal.ads.gw.c.WIFI
            r1.o(r0)
            goto L_0x0106
        L_0x0101:
            com.google.android.gms.internal.ads.gw$c r0 = com.google.android.gms.internal.ads.gw.c.CELL
            r1.o(r0)
        L_0x0106:
            switch(r10) {
                case 1: goto L_0x0112;
                case 2: goto L_0x0112;
                case 3: goto L_0x010f;
                case 4: goto L_0x0112;
                case 5: goto L_0x010f;
                case 6: goto L_0x010f;
                case 7: goto L_0x0112;
                case 8: goto L_0x010f;
                case 9: goto L_0x010f;
                case 10: goto L_0x010f;
                case 11: goto L_0x0112;
                case 12: goto L_0x010f;
                case 13: goto L_0x010c;
                case 14: goto L_0x010f;
                case 15: goto L_0x010f;
                case 16: goto L_0x0112;
                case 17: goto L_0x010f;
                default: goto L_0x0109;
            }
        L_0x0109:
            com.google.android.gms.internal.ads.gw$b r10 = com.google.android.gms.internal.ads.gw.b.CELLULAR_NETWORK_TYPE_UNSPECIFIED
            goto L_0x0114
        L_0x010c:
            com.google.android.gms.internal.ads.gw$b r10 = com.google.android.gms.internal.ads.gw.b.LTE
            goto L_0x0114
        L_0x010f:
            com.google.android.gms.internal.ads.gw$b r10 = com.google.android.gms.internal.ads.gw.b.THREE_G
            goto L_0x0114
        L_0x0112:
            com.google.android.gms.internal.ads.gw$b r10 = com.google.android.gms.internal.ads.gw.b.TWO_G
        L_0x0114:
            boolean r0 = r1.f5971c
            if (r0 == 0) goto L_0x011d
            r1.n()
            r1.f5971c = r3
        L_0x011d:
            MessageType r0 = r1.f5970b
            com.google.android.gms.internal.ads.gw r0 = (com.google.android.gms.internal.ads.gw) r0
            com.google.android.gms.internal.ads.gw.y(r0, r10)
        L_0x0124:
            com.google.android.gms.internal.ads.cq r10 = r1.j()
            com.google.android.gms.internal.ads.aq r10 = (com.google.android.gms.internal.ads.aq) r10
            r5 = r10
            com.google.android.gms.internal.ads.gw r5 = (com.google.android.gms.internal.ads.gw) r5
            com.google.android.gms.internal.ads.rb r10 = r9.f7938b
            e8.vs r10 = r10.f8025e
            e8.bt r0 = new e8.bt
            boolean r3 = r9.f7937a
            r1 = r0
            r2 = r9
            r1.<init>((com.google.android.gms.internal.ads.qb) r2, (boolean) r3, (java.util.ArrayList) r4, (com.google.android.gms.internal.ads.gw) r5, (com.google.android.gms.internal.ads.iw.b) r6)
            r10.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qb.a(java.lang.Object):void");
    }

    public final void n(Throwable th) {
        e.I("Failed to get signals bundle");
    }
}
