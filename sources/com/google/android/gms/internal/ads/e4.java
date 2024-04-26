package com.google.android.gms.internal.ads;

import e8.v5;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class e4 extends os implements v5 {
    public e4() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x003f
            r0 = 2
            if (r3 == r0) goto L_0x0034
            r0 = 3
            if (r3 == r0) goto L_0x000b
            r3 = 0
            return r3
        L_0x000b:
            android.os.Parcelable$Creator<e8.zh0> r3 = e8.zh0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.zh0 r3 = (e8.zh0) r3
            r4 = r2
            com.google.android.gms.internal.ads.ad r4 = (com.google.android.gms.internal.ads.ad) r4
            monitor-enter(r4)
            boolean r0 = r4.f5952d     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r4)
            goto L_0x0067
        L_0x001d:
            org.json.JSONObject r0 = r4.f5951c     // Catch:{ JSONException -> 0x0026 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.f17754b     // Catch:{ JSONException -> 0x0026 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0026 }
        L_0x0026:
            com.google.android.gms.internal.ads.d7<org.json.JSONObject> r3 = r4.f5950b     // Catch:{ all -> 0x0031 }
            org.json.JSONObject r0 = r4.f5951c     // Catch:{ all -> 0x0031 }
            r3.b(r0)     // Catch:{ all -> 0x0031 }
            r4.f5952d = r6     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)
            goto L_0x0067
        L_0x0031:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0034:
            java.lang.String r3 = r4.readString()
            r4 = r2
            com.google.android.gms.internal.ads.ad r4 = (com.google.android.gms.internal.ads.ad) r4
            r4.s6(r3)
            goto L_0x0067
        L_0x003f:
            java.lang.String r3 = r4.readString()
            r4 = r2
            com.google.android.gms.internal.ads.ad r4 = (com.google.android.gms.internal.ads.ad) r4
            monitor-enter(r4)
            boolean r0 = r4.f5952d     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x004d
            monitor-exit(r4)
            goto L_0x0067
        L_0x004d:
            if (r3 != 0) goto L_0x0056
            java.lang.String r3 = "Adapter returned null signals"
            r4.s6(r3)     // Catch:{ all -> 0x006b }
            monitor-exit(r4)
            goto L_0x0067
        L_0x0056:
            org.json.JSONObject r0 = r4.f5951c     // Catch:{ JSONException -> 0x005d }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x005d }
        L_0x005d:
            com.google.android.gms.internal.ads.d7<org.json.JSONObject> r3 = r4.f5950b     // Catch:{ all -> 0x006b }
            org.json.JSONObject r0 = r4.f5951c     // Catch:{ all -> 0x006b }
            r3.b(r0)     // Catch:{ all -> 0x006b }
            r4.f5952d = r6     // Catch:{ all -> 0x006b }
            monitor-exit(r4)
        L_0x0067:
            r5.writeNoException()
            return r6
        L_0x006b:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e4.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
