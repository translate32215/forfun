package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e8.gd0;
import e8.l9;
import e8.qe0;
import e8.uh0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h6 implements gd0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, r6> f6736a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f6737b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final l9 f6738c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6739d;

    public h6(File file) {
        this.f6738c = new ri(file);
        this.f6739d = 20971520;
    }

    public static int c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static String d(h7 h7Var) throws IOException {
        return new String(j(h7Var, m(h7Var)), "UTF-8");
    }

    public static void e(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write(i10 >>> 24);
    }

    public static void f(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) ((int) j10));
        outputStream.write((byte) ((int) (j10 >>> 8)));
        outputStream.write((byte) ((int) (j10 >>> 16)));
        outputStream.write((byte) ((int) (j10 >>> 24)));
        outputStream.write((byte) ((int) (j10 >>> 32)));
        outputStream.write((byte) ((int) (j10 >>> 40)));
        outputStream.write((byte) ((int) (j10 >>> 48)));
        outputStream.write((byte) ((int) (j10 >>> 56)));
    }

    public static void g(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        f(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    public static byte[] j(h7 h7Var, long j10) throws IOException {
        long j11 = h7Var.f6740a - h7Var.f6741b;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (((long) i10) == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(h7Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("streamToBytes length=");
        sb2.append(j10);
        sb2.append(", maxLength=");
        sb2.append(j11);
        throw new IOException(sb2.toString());
    }

    public static int k(InputStream inputStream) throws IOException {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    public static long m(InputStream inputStream) throws IOException {
        return (((long) c(inputStream)) & 255) | 0 | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    public static String n(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            e8.l9 r0 = r9.f6738c     // Catch:{ all -> 0x0060 }
            java.io.File r0 = r0.l()     // Catch:{ all -> 0x0060 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0060 }
            r3[r2] = r0     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.i4.b(r1, r3)     // Catch:{ all -> 0x0060 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
        L_0x002d:
            if (r2 >= r1) goto L_0x005e
            r3 = r0[r2]     // Catch:{ all -> 0x0060 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0058 }
            com.google.android.gms.internal.ads.h7 r6 = new com.google.android.gms.internal.ads.h7     // Catch:{ IOException -> 0x0058 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0058 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0058 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0058 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0058 }
            com.google.android.gms.internal.ads.r6 r7 = com.google.android.gms.internal.ads.r6.b(r6)     // Catch:{ all -> 0x0053 }
            r7.f8010a = r4     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = r7.f8011b     // Catch:{ all -> 0x0053 }
            r9.h(r4, r7)     // Catch:{ all -> 0x0053 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005b
        L_0x0053:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0058 }
            throw r4     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            r3.delete()     // Catch:{ all -> 0x0060 }
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005e:
            monitor-exit(r9)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h6.a():void");
    }

    public final synchronized void b(String str) {
        boolean delete = o(str).delete();
        r6 remove = this.f6736a.remove(str);
        if (remove != null) {
            this.f6737b -= remove.f8010a;
        }
        if (!delete) {
            i4.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
        }
    }

    public final void h(String str, r6 r6Var) {
        if (!this.f6736a.containsKey(str)) {
            this.f6737b += r6Var.f8010a;
        } else {
            this.f6737b = (r6Var.f8010a - this.f6736a.get(str).f8010a) + this.f6737b;
        }
        this.f6736a.put(str, r6Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        if (r3.delete() == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        com.google.android.gms.internal.ads.i4.a("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
        if (r1.f6738c.l().exists() == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        com.google.android.gms.internal.ads.i4.a("Re-initializing cache after external clearing.", new java.lang.Object[0]);
        r1.f6736a.clear();
        r1.f6737b = 0;
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x010c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void i(java.lang.String r16, e8.qe0 r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f6737b     // Catch:{ all -> 0x0140 }
            byte[] r5 = r2.f16146a     // Catch:{ all -> 0x0140 }
            int r6 = r5.length     // Catch:{ all -> 0x0140 }
            long r6 = (long) r6     // Catch:{ all -> 0x0140 }
            long r3 = r3 + r6
            int r6 = r1.f6739d     // Catch:{ all -> 0x0140 }
            long r7 = (long) r6     // Catch:{ all -> 0x0140 }
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
            int r3 = r5.length     // Catch:{ all -> 0x0140 }
            float r3 = (float) r3
            float r4 = (float) r6
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            monitor-exit(r15)
            return
        L_0x0022:
            java.io.File r3 = r15.o(r16)     // Catch:{ all -> 0x0140 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x010c }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x010c }
            r7.<init>(r3)     // Catch:{ IOException -> 0x010c }
            r6.<init>(r7)     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.r6 r7 = new com.google.android.gms.internal.ads.r6     // Catch:{ IOException -> 0x010c }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x010c }
            boolean r8 = r7.a(r6)     // Catch:{ IOException -> 0x010c }
            if (r8 == 0) goto L_0x00f6
            byte[] r2 = r2.f16146a     // Catch:{ IOException -> 0x010c }
            r6.write(r2)     // Catch:{ IOException -> 0x010c }
            r6.close()     // Catch:{ IOException -> 0x010c }
            long r10 = r3.length()     // Catch:{ IOException -> 0x010c }
            r7.f8010a = r10     // Catch:{ IOException -> 0x010c }
            r15.h(r0, r7)     // Catch:{ IOException -> 0x010c }
            long r6 = r1.f6737b     // Catch:{ IOException -> 0x010c }
            int r0 = r1.f6739d     // Catch:{ IOException -> 0x010c }
            long r10 = (long) r0     // Catch:{ IOException -> 0x010c }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f4
            boolean r0 = com.google.android.gms.internal.ads.i4.f6915a     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.i4.c(r0, r2)     // Catch:{ IOException -> 0x010c }
        L_0x0062:
            long r6 = r1.f6737b     // Catch:{ IOException -> 0x010c }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x010c }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.r6> r0 = r1.f6736a     // Catch:{ IOException -> 0x010c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x010c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x010c }
            r2 = 0
        L_0x0073:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x010c }
            r12 = 2
            if (r8 == 0) goto L_0x00ca
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x010c }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x010c }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.r6 r8 = (com.google.android.gms.internal.ads.r6) r8     // Catch:{ IOException -> 0x010c }
            java.lang.String r13 = r8.f8011b     // Catch:{ IOException -> 0x010c }
            java.io.File r13 = r15.o(r13)     // Catch:{ IOException -> 0x010c }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x010c }
            if (r13 == 0) goto L_0x009c
            long r13 = r1.f6737b     // Catch:{ IOException -> 0x010c }
            r16 = r10
            long r9 = r8.f8010a     // Catch:{ IOException -> 0x010c }
            long r13 = r13 - r9
            r1.f6737b = r13     // Catch:{ IOException -> 0x010c }
            goto L_0x00af
        L_0x009c:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x010c }
            java.lang.String r8 = r8.f8011b     // Catch:{ IOException -> 0x010c }
            r10[r5] = r8     // Catch:{ IOException -> 0x010c }
            java.lang.String r8 = n(r8)     // Catch:{ IOException -> 0x010c }
            r10[r4] = r8     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.i4.a(r9, r10)     // Catch:{ IOException -> 0x010c }
        L_0x00af:
            r0.remove()     // Catch:{ IOException -> 0x010c }
            int r2 = r2 + 1
            long r8 = r1.f6737b     // Catch:{ IOException -> 0x010c }
            float r8 = (float) r8     // Catch:{ IOException -> 0x010c }
            int r9 = r1.f6739d     // Catch:{ IOException -> 0x010c }
            float r9 = (float) r9     // Catch:{ IOException -> 0x010c }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0073
        L_0x00ca:
            r16 = r10
        L_0x00cc:
            boolean r0 = com.google.android.gms.internal.ads.i4.f6915a     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x010c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x010c }
            r8[r5] = r2     // Catch:{ IOException -> 0x010c }
            long r9 = r1.f6737b     // Catch:{ IOException -> 0x010c }
            long r9 = r9 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x010c }
            r8[r4] = r2     // Catch:{ IOException -> 0x010c }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x010c }
            r9 = r16
            long r6 = r6 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x010c }
            r8[r12] = r2     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.i4.c(r0, r8)     // Catch:{ IOException -> 0x010c }
        L_0x00f4:
            monitor-exit(r15)
            return
        L_0x00f6:
            r6.close()     // Catch:{ IOException -> 0x010c }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x010c }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x010c }
            r2[r5] = r6     // Catch:{ IOException -> 0x010c }
            com.google.android.gms.internal.ads.i4.a(r0, r2)     // Catch:{ IOException -> 0x010c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x010c }
            r0.<init>()     // Catch:{ IOException -> 0x010c }
            throw r0     // Catch:{ IOException -> 0x010c }
        L_0x010c:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "Could not clean up file %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0140 }
            r2[r5] = r3     // Catch:{ all -> 0x0140 }
            com.google.android.gms.internal.ads.i4.a(r0, r2)     // Catch:{ all -> 0x0140 }
        L_0x011f:
            e8.l9 r0 = r1.f6738c     // Catch:{ all -> 0x0140 }
            java.io.File r0 = r0.l()     // Catch:{ all -> 0x0140 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0140 }
            com.google.android.gms.internal.ads.i4.a(r0, r2)     // Catch:{ all -> 0x0140 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.r6> r0 = r1.f6736a     // Catch:{ all -> 0x0140 }
            r0.clear()     // Catch:{ all -> 0x0140 }
            r2 = 0
            r1.f6737b = r2     // Catch:{ all -> 0x0140 }
            r15.a()     // Catch:{ all -> 0x0140 }
        L_0x013e:
            monitor-exit(r15)
            return
        L_0x0140:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x0144
        L_0x0143:
            throw r0
        L_0x0144:
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h6.i(java.lang.String, e8.qe0):void");
    }

    public final synchronized qe0 l(String str) {
        h7 h7Var;
        r6 r6Var = this.f6736a.get(str);
        if (r6Var == null) {
            return null;
        }
        File o10 = o(str);
        try {
            h7Var = new h7(new BufferedInputStream(new FileInputStream(o10)), o10.length());
            r6 b10 = r6.b(h7Var);
            if (!TextUtils.equals(str, b10.f8011b)) {
                i4.a("%s: key=%s, found=%s", o10.getAbsolutePath(), str, b10.f8011b);
                r6 remove = this.f6736a.remove(str);
                if (remove != null) {
                    this.f6737b -= remove.f8010a;
                }
                h7Var.close();
                return null;
            }
            byte[] j10 = j(h7Var, h7Var.f6740a - h7Var.f6741b);
            qe0 qe0 = new qe0();
            qe0.f16146a = j10;
            qe0.f16147b = r6Var.f8012c;
            qe0.f16148c = r6Var.f8013d;
            qe0.f16149d = r6Var.f8014e;
            qe0.f16150e = r6Var.f8015f;
            qe0.f16151f = r6Var.f8016g;
            List<uh0> list = r6Var.f8017h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (uh0 next : list) {
                treeMap.put(next.f16960a, next.f16961b);
            }
            qe0.f16152g = treeMap;
            qe0.f16153h = Collections.unmodifiableList(r6Var.f8017h);
            h7Var.close();
            return qe0;
        } catch (IOException e10) {
            i4.a("%s: %s", o10.getAbsolutePath(), e10.toString());
            b(str);
            return null;
        } catch (Throwable th) {
            h7Var.close();
            throw th;
        }
    }

    public final File o(String str) {
        return new File(this.f6738c.l(), n(str));
    }

    public h6(l9 l9Var) {
        this.f6738c = l9Var;
        this.f6739d = 5242880;
    }
}
