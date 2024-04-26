package com.startapp;

/* compiled from: Sta */
public class ba {

    /* renamed from: b  reason: collision with root package name */
    private static final String f10194b = "ba";

    /* renamed from: c  reason: collision with root package name */
    private static final int f10195c = 32;

    /* renamed from: d  reason: collision with root package name */
    private static final int f10196d = 40;

    /* renamed from: e  reason: collision with root package name */
    private static final int f10197e = 48;

    /* renamed from: f  reason: collision with root package name */
    private static final int f10198f = 123;

    /* renamed from: g  reason: collision with root package name */
    private static final int f10199g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final int f10200h = 3;

    /* renamed from: i  reason: collision with root package name */
    private static final long f10201i = 2208988800L;

    /* renamed from: a  reason: collision with root package name */
    private long f10202a;

    private long b(byte[] bArr, int i10) {
        long a10 = a(bArr, i10);
        return ((a(bArr, i10 + 4) * 1000) / 4294967296L) + ((a10 - f10201i) * 1000);
    }

    private void c(byte[] bArr, int i10) {
        for (int i11 = i10; i11 < i10 + 8; i11++) {
            bArr[i11] = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ all -> 0x0040 }
            r2.<init>()     // Catch:{ all -> 0x0040 }
            r2.setSoTimeout(r7)     // Catch:{ all -> 0x003d }
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r6)     // Catch:{ all -> 0x003d }
            r7 = 48
            byte[] r1 = new byte[r7]     // Catch:{ all -> 0x003d }
            java.net.DatagramPacket r3 = new java.net.DatagramPacket     // Catch:{ all -> 0x003d }
            r4 = 123(0x7b, float:1.72E-43)
            r3.<init>(r1, r7, r6, r4)     // Catch:{ all -> 0x003d }
            r6 = 27
            r1[r0] = r6     // Catch:{ all -> 0x003d }
            r6 = 40
            r5.c(r1, r6)     // Catch:{ all -> 0x003d }
            r2.send(r3)     // Catch:{ all -> 0x003d }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ all -> 0x003d }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x003d }
            r2.receive(r6)     // Catch:{ all -> 0x003d }
            r2.close()     // Catch:{ all -> 0x003d }
            r6 = 32
            long r6 = r5.b(r1, r6)     // Catch:{ all -> 0x003d }
            r5.f10202a = r6     // Catch:{ all -> 0x003d }
            r2.close()
            r6 = 1
            return r6
        L_0x003d:
            r6 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r6 = move-exception
        L_0x0041:
            com.startapp.x2.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0049
            r1.close()
        L_0x0049:
            return r0
        L_0x004a:
            r6 = move-exception
            if (r1 == 0) goto L_0x0050
            r1.close()
        L_0x0050:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.ba.a(java.lang.String, int):boolean");
    }

    public long a() {
        return this.f10202a;
    }

    private long a(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte b13 = bArr[i10 + 3];
        byte b14 = b10 & true;
        int i11 = b10;
        if (b14 == true) {
            i11 = (b10 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b15 = b11 & true;
        int i12 = b11;
        if (b15 == true) {
            i12 = (b11 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b16 = b12 & true;
        int i13 = b12;
        if (b16 == true) {
            i13 = (b12 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b17 = b13 & true;
        int i14 = b13;
        if (b17 == true) {
            i14 = (b13 & Byte.MAX_VALUE) + b4.f10104d;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }
}
