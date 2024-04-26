package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class zx extends os implements ay {
    public zx() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.google.android.gms.internal.ads.rx] */
    /* JADX WARNING: type inference failed for: r7v7, types: [com.google.android.gms.internal.ads.o0] */
    /* JADX WARNING: type inference failed for: r7v12, types: [com.google.android.gms.internal.ads.s0] */
    /* JADX WARNING: type inference failed for: r7v17, types: [com.google.android.gms.internal.ads.t0] */
    /* JADX WARNING: type inference failed for: r7v22, types: [e8.ui0] */
    /* JADX WARNING: type inference failed for: r7v27, types: [com.google.android.gms.internal.ads.b1] */
    /* JADX WARNING: type inference failed for: r7v32, types: [com.google.android.gms.internal.ads.f1] */
    /* JADX WARNING: type inference failed for: r7v37, types: [com.google.android.gms.internal.ads.c2] */
    /* JADX WARNING: type inference failed for: r7v42 */
    /* JADX WARNING: type inference failed for: r7v43 */
    /* JADX WARNING: type inference failed for: r7v44 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: type inference failed for: r7v46 */
    /* JADX WARNING: type inference failed for: r7v47 */
    /* JADX WARNING: type inference failed for: r7v48 */
    /* JADX WARNING: type inference failed for: r7v49 */
    /* JADX WARNING: type inference failed for: r7v50 */
    /* JADX WARNING: type inference failed for: r7v51 */
    /* JADX WARNING: type inference failed for: r7v52 */
    /* JADX WARNING: type inference failed for: r7v53 */
    /* JADX WARNING: type inference failed for: r7v54 */
    /* JADX WARNING: type inference failed for: r7v55 */
    /* JADX WARNING: type inference failed for: r7v56 */
    /* JADX WARNING: type inference failed for: r7v57 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 0
            switch(r4) {
                case 1: goto L_0x0177;
                case 2: goto L_0x0156;
                case 3: goto L_0x0135;
                case 4: goto L_0x0114;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00a3;
                case 8: goto L_0x007a;
                case 9: goto L_0x006a;
                case 10: goto L_0x0048;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0038;
                case 14: goto L_0x0016;
                case 15: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r4 = 0
            return r4
        L_0x0006:
            android.os.Parcelable$Creator<a7.b> r4 = a7.b.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            a7.b r4 = (a7.b) r4
            r3.B2(r4)
            r6.writeNoException()
            goto L_0x0181
        L_0x0016:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof com.google.android.gms.internal.ads.c2
            if (r7 == 0) goto L_0x002b
            r7 = r5
            com.google.android.gms.internal.ads.c2 r7 = (com.google.android.gms.internal.ads.c2) r7
            goto L_0x0030
        L_0x002b:
            com.google.android.gms.internal.ads.e2 r7 = new com.google.android.gms.internal.ads.e2
            r7.<init>(r4)
        L_0x0030:
            r3.U1(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.z1> r4 = com.google.android.gms.internal.ads.z1.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            com.google.android.gms.internal.ads.z1 r4 = (com.google.android.gms.internal.ads.z1) r4
            r3.D5(r4)
            r6.writeNoException()
            goto L_0x0181
        L_0x0048:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof com.google.android.gms.internal.ads.f1
            if (r7 == 0) goto L_0x005d
            r7 = r5
            com.google.android.gms.internal.ads.f1 r7 = (com.google.android.gms.internal.ads.f1) r7
            goto L_0x0062
        L_0x005d:
            com.google.android.gms.internal.ads.h1 r7 = new com.google.android.gms.internal.ads.h1
            r7.<init>(r4)
        L_0x0062:
            r3.w5(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x006a:
            android.os.Parcelable$Creator<a7.k> r4 = a7.k.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            a7.k r4 = (a7.k) r4
            r3.w3(r4)
            r6.writeNoException()
            goto L_0x0181
        L_0x007a:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0081
            goto L_0x0093
        L_0x0081:
            java.lang.String r7 = "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener"
            android.os.IInterface r7 = r4.queryLocalInterface(r7)
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.b1
            if (r0 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.b1 r7 = (com.google.android.gms.internal.ads.b1) r7
            goto L_0x0093
        L_0x008e:
            com.google.android.gms.internal.ads.d1 r7 = new com.google.android.gms.internal.ads.d1
            r7.<init>(r4)
        L_0x0093:
            android.os.Parcelable$Creator<e8.li0> r4 = e8.li0.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            e8.li0 r4 = (e8.li0) r4
            r3.h2(r7, r4)
            r6.writeNoException()
            goto L_0x0181
        L_0x00a3:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x00aa
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof e8.ui0
            if (r7 == 0) goto L_0x00b8
            r7 = r5
            e8.ui0 r7 = (e8.ui0) r7
            goto L_0x00bd
        L_0x00b8:
            e8.vi0 r7 = new e8.vi0
            r7.<init>(r4)
        L_0x00bd:
            r3.S4(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x00c5:
            android.os.Parcelable$Creator<e8.n1> r4 = e8.n1.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            e8.n1 r4 = (e8.n1) r4
            r3.N2(r4)
            r6.writeNoException()
            goto L_0x0181
        L_0x00d5:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r0 = r5.readStrongBinder()
            if (r0 != 0) goto L_0x00e1
            r1 = r7
            goto L_0x00f3
        L_0x00e1:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.y0
            if (r2 == 0) goto L_0x00ee
            com.google.android.gms.internal.ads.y0 r1 = (com.google.android.gms.internal.ads.y0) r1
            goto L_0x00f3
        L_0x00ee:
            com.google.android.gms.internal.ads.a1 r1 = new com.google.android.gms.internal.ads.a1
            r1.<init>(r0)
        L_0x00f3:
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x00fa
            goto L_0x010c
        L_0x00fa:
            java.lang.String r7 = "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener"
            android.os.IInterface r7 = r5.queryLocalInterface(r7)
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.t0
            if (r0 == 0) goto L_0x0107
            com.google.android.gms.internal.ads.t0 r7 = (com.google.android.gms.internal.ads.t0) r7
            goto L_0x010c
        L_0x0107:
            com.google.android.gms.internal.ads.v0 r7 = new com.google.android.gms.internal.ads.v0
            r7.<init>(r5)
        L_0x010c:
            r3.R3(r4, r1, r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x0114:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x011b
            goto L_0x012e
        L_0x011b:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof com.google.android.gms.internal.ads.s0
            if (r7 == 0) goto L_0x0129
            r7 = r5
            com.google.android.gms.internal.ads.s0 r7 = (com.google.android.gms.internal.ads.s0) r7
            goto L_0x012e
        L_0x0129:
            com.google.android.gms.internal.ads.u0 r7 = new com.google.android.gms.internal.ads.u0
            r7.<init>(r4)
        L_0x012e:
            r3.c3(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x0135:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x013c
            goto L_0x014f
        L_0x013c:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof com.google.android.gms.internal.ads.o0
            if (r7 == 0) goto L_0x014a
            r7 = r5
            com.google.android.gms.internal.ads.o0 r7 = (com.google.android.gms.internal.ads.o0) r7
            goto L_0x014f
        L_0x014a:
            com.google.android.gms.internal.ads.p0 r7 = new com.google.android.gms.internal.ads.p0
            r7.<init>(r4)
        L_0x014f:
            r3.P4(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x0156:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x015d
            goto L_0x0170
        L_0x015d:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r7 = r5 instanceof com.google.android.gms.internal.ads.rx
            if (r7 == 0) goto L_0x016b
            r7 = r5
            com.google.android.gms.internal.ads.rx r7 = (com.google.android.gms.internal.ads.rx) r7
            goto L_0x0170
        L_0x016b:
            com.google.android.gms.internal.ads.tx r7 = new com.google.android.gms.internal.ads.tx
            r7.<init>(r4)
        L_0x0170:
            r3.R4(r7)
            r6.writeNoException()
            goto L_0x0181
        L_0x0177:
            com.google.android.gms.internal.ads.ux r4 = r3.K5()
            r6.writeNoException()
            e8.ob0.b(r6, r4)
        L_0x0181:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zx.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
