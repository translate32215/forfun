package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import e8.p9;
import e8.qf0;
import e8.rf0;
import e8.sf0;
import e8.vf0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k7 implements rf0 {

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f7192q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReference<byte[]> f7193r = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public SSLSocketFactory f7194a = new m7(this);

    /* renamed from: b  reason: collision with root package name */
    public final int f7195b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7196c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7197d;

    /* renamed from: e  reason: collision with root package name */
    public final p9 f7198e;

    /* renamed from: f  reason: collision with root package name */
    public final vf0<? super k7> f7199f;

    /* renamed from: g  reason: collision with root package name */
    public qf0 f7200g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f7201h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f7202i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7203j;

    /* renamed from: k  reason: collision with root package name */
    public long f7204k;

    /* renamed from: l  reason: collision with root package name */
    public long f7205l;

    /* renamed from: m  reason: collision with root package name */
    public long f7206m;

    /* renamed from: n  reason: collision with root package name */
    public long f7207n;

    /* renamed from: o  reason: collision with root package name */
    public int f7208o;

    /* renamed from: p  reason: collision with root package name */
    public Set<Socket> f7209p = new HashSet();

    public k7(String str, vf0<? super k7> vf0, int i10, int i11, int i12) {
        if (!TextUtils.isEmpty(str)) {
            this.f7197d = str;
            this.f7199f = vf0;
            this.f7198e = new p9(17);
            this.f7195b = i10;
            this.f7196c = i11;
            this.f7208o = i12;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Uri M() {
        HttpURLConnection httpURLConnection = this.f7201h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final Map<String, List<String>> N() {
        HttpURLConnection httpURLConnection = this.f7201h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final int a(byte[] bArr, int i10, int i11) throws sf0 {
        try {
            if (this.f7206m != this.f7204k) {
                byte[] andSet = f7193r.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f7206m;
                    long j11 = this.f7204k;
                    if (j10 == j11) {
                        f7193r.set(andSet);
                        break;
                    }
                    int read = this.f7202i.read(andSet, 0, (int) Math.min(j11 - j10, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f7206m += (long) read;
                        vf0<? super k7> vf0 = this.f7199f;
                        if (vf0 != null) {
                            vf0.i(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f7205l;
            if (j12 != -1) {
                long j13 = j12 - this.f7207n;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min((long) i11, j13);
            }
            int read2 = this.f7202i.read(bArr, i10, i11);
            if (read2 != -1) {
                this.f7207n += (long) read2;
                vf0<? super k7> vf02 = this.f7199f;
                if (vf02 != null) {
                    vf02.i(this, read2);
                }
                return read2;
            } else if (this.f7205l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e10) {
            throw new sf0(e10, this.f7200g, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        if (r3 != 0) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0120 A[EDGE_INSN: B:140:0x0120->B:50:0x0120 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cd A[Catch:{ IOException -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00db A[Catch:{ IOException -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dd A[Catch:{ IOException -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3 A[Catch:{ IOException -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116 A[Catch:{ IOException -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(e8.qf0 r22) throws e8.sf0 {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "Unable to connect to "
            r1.f7200g = r2
            r4 = 0
            r1.f7207n = r4
            r1.f7206m = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02ea }
            android.net.Uri r4 = r2.f16161a     // Catch:{ IOException -> 0x02ea }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02ea }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02ea }
            byte[] r4 = r2.f16162b     // Catch:{ IOException -> 0x02ea }
            long r5 = r2.f16164d     // Catch:{ IOException -> 0x02ea }
            long r7 = r2.f16165e     // Catch:{ IOException -> 0x02ea }
            boolean r9 = r22.a()     // Catch:{ IOException -> 0x02ea }
            r10 = 0
        L_0x0024:
            int r11 = r10 + 1
            r12 = 20
            if (r10 > r12) goto L_0x02d1
            java.net.URLConnection r10 = r0.openConnection()     // Catch:{ IOException -> 0x02ea }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x02ea }
            boolean r12 = r10 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02ea }
            if (r12 == 0) goto L_0x003c
            r12 = r10
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ IOException -> 0x02ea }
            javax.net.ssl.SSLSocketFactory r13 = r1.f7194a     // Catch:{ IOException -> 0x02ea }
            r12.setSSLSocketFactory(r13)     // Catch:{ IOException -> 0x02ea }
        L_0x003c:
            int r12 = r1.f7195b     // Catch:{ IOException -> 0x02ea }
            r10.setConnectTimeout(r12)     // Catch:{ IOException -> 0x02ea }
            int r12 = r1.f7196c     // Catch:{ IOException -> 0x02ea }
            r10.setReadTimeout(r12)     // Catch:{ IOException -> 0x02ea }
            e8.p9 r12 = r1.f7198e     // Catch:{ IOException -> 0x02ea }
            java.util.Map r12 = r12.m()     // Catch:{ IOException -> 0x02ea }
            java.util.Set r12 = r12.entrySet()     // Catch:{ IOException -> 0x02ea }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ IOException -> 0x02ea }
        L_0x0054:
            boolean r13 = r12.hasNext()     // Catch:{ IOException -> 0x02ea }
            if (r13 == 0) goto L_0x0070
            java.lang.Object r13 = r12.next()     // Catch:{ IOException -> 0x02ea }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x02ea }
            java.lang.Object r14 = r13.getKey()     // Catch:{ IOException -> 0x02ea }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x02ea }
            java.lang.Object r13 = r13.getValue()     // Catch:{ IOException -> 0x02ea }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x02ea }
            r10.setRequestProperty(r14, r13)     // Catch:{ IOException -> 0x02ea }
            goto L_0x0054
        L_0x0070:
            r12 = -1
            r14 = 27
            r17 = 0
            int r19 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x0082
            int r17 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r17 == 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r19 = r5
            goto L_0x00c4
        L_0x0082:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ea }
            r15.<init>(r14)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r14 = "bytes="
            r15.append(r14)     // Catch:{ IOException -> 0x02ea }
            r15.append(r5)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r14 = "-"
            r15.append(r14)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r14 = r15.toString()     // Catch:{ IOException -> 0x02ea }
            int r15 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x00bd
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x02ea }
            long r13 = r5 + r7
            r15 = 1
            long r13 = r13 - r15
            int r15 = r12.length()     // Catch:{ IOException -> 0x02ea }
            int r15 = r15 + 20
            r19 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ea }
            r5.<init>(r15)     // Catch:{ IOException -> 0x02ea }
            r5.append(r12)     // Catch:{ IOException -> 0x02ea }
            r5.append(r13)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r14 = r5.toString()     // Catch:{ IOException -> 0x02ea }
            goto L_0x00bf
        L_0x00bd:
            r19 = r5
        L_0x00bf:
            java.lang.String r5 = "Range"
            r10.setRequestProperty(r5, r14)     // Catch:{ IOException -> 0x02ea }
        L_0x00c4:
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = r1.f7197d     // Catch:{ IOException -> 0x02ea }
            r10.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x02ea }
            if (r9 != 0) goto L_0x00d4
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "identity"
            r10.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x02ea }
        L_0x00d4:
            r5 = 0
            r10.setInstanceFollowRedirects(r5)     // Catch:{ IOException -> 0x02ea }
            r5 = 1
            if (r4 == 0) goto L_0x00dd
            r6 = 1
            goto L_0x00de
        L_0x00dd:
            r6 = 0
        L_0x00de:
            r10.setDoOutput(r6)     // Catch:{ IOException -> 0x02ea }
            if (r4 == 0) goto L_0x00fd
            java.lang.String r6 = "POST"
            r10.setRequestMethod(r6)     // Catch:{ IOException -> 0x02ea }
            int r6 = r4.length     // Catch:{ IOException -> 0x02ea }
            if (r6 == 0) goto L_0x00fd
            int r6 = r4.length     // Catch:{ IOException -> 0x02ea }
            r10.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x02ea }
            r10.connect()     // Catch:{ IOException -> 0x02ea }
            java.io.OutputStream r6 = r10.getOutputStream()     // Catch:{ IOException -> 0x02ea }
            r6.write(r4)     // Catch:{ IOException -> 0x02ea }
            r6.close()     // Catch:{ IOException -> 0x02ea }
            goto L_0x0100
        L_0x00fd:
            r10.connect()     // Catch:{ IOException -> 0x02ea }
        L_0x0100:
            int r6 = r10.getResponseCode()     // Catch:{ IOException -> 0x02ea }
            r12 = 300(0x12c, float:4.2E-43)
            if (r6 == r12) goto L_0x0282
            r12 = 301(0x12d, float:4.22E-43)
            if (r6 == r12) goto L_0x0282
            r12 = 302(0x12e, float:4.23E-43)
            if (r6 == r12) goto L_0x0282
            r12 = 303(0x12f, float:4.25E-43)
            if (r6 == r12) goto L_0x0282
            if (r4 != 0) goto L_0x0120
            r4 = 307(0x133, float:4.3E-43)
            if (r6 == r4) goto L_0x0282
            r4 = 308(0x134, float:4.32E-43)
            if (r6 != r4) goto L_0x0120
            goto L_0x0282
        L_0x0120:
            r1.f7201h = r10     // Catch:{ IOException -> 0x02ea }
            int r0 = r10.getResponseCode()     // Catch:{ IOException -> 0x025c }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0241
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x0130
            goto L_0x0241
        L_0x0130:
            if (r0 != r3) goto L_0x013b
            long r3 = r2.f16164d
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r3 = 0
        L_0x013d:
            r1.f7204k = r3
            boolean r0 = r22.a()
            if (r0 != 0) goto L_0x021f
            long r3 = r2.f16165e
            r6 = -1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            r1.f7205l = r3
            goto L_0x0223
        L_0x0151:
            java.net.HttpURLConnection r0 = r1.f7201h
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r6 = "]"
            if (r4 != 0) goto L_0x0183
            long r7 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0166 }
            goto L_0x0185
        L_0x0166:
            r4 = 28
            int r4 = androidx.appcompat.widget.o.a(r3, r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Length ["
            r7.append(r4)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            l0.e.I(r4)
        L_0x0183:
            r7 = -1
        L_0x0185:
            java.lang.String r4 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0212
            java.util.regex.Pattern r4 = f7192q
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r9 = r4.find()
            if (r9 == 0) goto L_0x0212
            r9 = 2
            java.lang.String r9 = r4.group(r9)     // Catch:{ NumberFormatException -> 0x01f5 }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x01f5 }
            java.lang.String r4 = r4.group(r5)     // Catch:{ NumberFormatException -> 0x01f5 }
            long r11 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x01f5 }
            long r9 = r9 - r11
            r11 = 1
            long r9 = r9 + r11
            r11 = 0
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x01ba
            r7 = r9
            goto L_0x0212
        L_0x01ba:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0212
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x01f5 }
            int r4 = r4.length()     // Catch:{ NumberFormatException -> 0x01f5 }
            int r4 = r4 + 26
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01f5 }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x01f5 }
            int r4 = r4 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01f5 }
            r11.<init>(r4)     // Catch:{ NumberFormatException -> 0x01f5 }
            java.lang.String r4 = "Inconsistent headers ["
            r11.append(r4)     // Catch:{ NumberFormatException -> 0x01f5 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x01f5 }
            java.lang.String r3 = "] ["
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x01f5 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x01f5 }
            r11.append(r6)     // Catch:{ NumberFormatException -> 0x01f5 }
            java.lang.String r3 = r11.toString()     // Catch:{ NumberFormatException -> 0x01f5 }
            l0.e.K(r3)     // Catch:{ NumberFormatException -> 0x01f5 }
            long r7 = java.lang.Math.max(r7, r9)     // Catch:{ NumberFormatException -> 0x01f5 }
            goto L_0x0212
        L_0x01f5:
            r3 = 27
            int r3 = androidx.appcompat.widget.o.a(r0, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            l0.e.I(r0)
        L_0x0212:
            r3 = -1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x021c
            long r3 = r1.f7204k
            long r3 = r7 - r3
        L_0x021c:
            r1.f7205l = r3
            goto L_0x0223
        L_0x021f:
            long r3 = r2.f16165e
            r1.f7205l = r3
        L_0x0223:
            java.net.HttpURLConnection r0 = r1.f7201h     // Catch:{ IOException -> 0x0237 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0237 }
            r1.f7202i = r0     // Catch:{ IOException -> 0x0237 }
            r1.f7203j = r5
            e8.vf0<? super com.google.android.gms.internal.ads.k7> r0 = r1.f7199f
            if (r0 == 0) goto L_0x0234
            r0.g(r1, r2)
        L_0x0234:
            long r2 = r1.f7205l
            return r2
        L_0x0237:
            r0 = move-exception
            r21.c()
            e8.sf0 r3 = new e8.sf0
            r3.<init>((java.io.IOException) r0, (e8.qf0) r2, (int) r5)
            throw r3
        L_0x0241:
            java.net.HttpURLConnection r3 = r1.f7201h
            java.util.Map r3 = r3.getHeaderFields()
            r21.c()
            e8.tf0 r4 = new e8.tf0
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x025b
            k3.b r0 = new k3.b
            r0.<init>()
            r4.initCause(r0)
        L_0x025b:
            throw r4
        L_0x025c:
            r0 = move-exception
            r4 = r0
            r21.c()
            e8.sf0 r0 = new e8.sf0
            android.net.Uri r5 = r2.f16161a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0278
            java.lang.String r3 = r3.concat(r5)
            goto L_0x027e
        L_0x0278:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x027e:
            r0.<init>((java.lang.String) r3, (java.io.IOException) r4, (e8.qf0) r2)
            throw r0
        L_0x0282:
            r4 = 0
            java.lang.String r5 = "Location"
            java.lang.String r5 = r10.getHeaderField(r5)     // Catch:{ IOException -> 0x02ea }
            r10.disconnect()     // Catch:{ IOException -> 0x02ea }
            if (r5 == 0) goto L_0x02c9
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x02ea }
            r6.<init>(r0, r5)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r0 = r6.getProtocol()     // Catch:{ IOException -> 0x02ea }
            java.lang.String r5 = "https"
            boolean r5 = r5.equals(r0)     // Catch:{ IOException -> 0x02ea }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r5 = "http"
            boolean r5 = r5.equals(r0)     // Catch:{ IOException -> 0x02ea }
            if (r5 != 0) goto L_0x02c3
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02ea }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02ea }
            int r6 = r0.length()     // Catch:{ IOException -> 0x02ea }
            if (r6 == 0) goto L_0x02ba
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x02ea }
            goto L_0x02bf
        L_0x02ba:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02ea }
            r0.<init>(r5)     // Catch:{ IOException -> 0x02ea }
        L_0x02bf:
            r4.<init>(r0)     // Catch:{ IOException -> 0x02ea }
            throw r4     // Catch:{ IOException -> 0x02ea }
        L_0x02c3:
            r0 = r6
            r10 = r11
            r5 = r19
            goto L_0x0024
        L_0x02c9:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02ea }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x02ea }
            throw r0     // Catch:{ IOException -> 0x02ea }
        L_0x02d1:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02ea }
            r4 = 31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ea }
            r5.<init>(r4)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r4 = "Too many redirects: "
            r5.append(r4)     // Catch:{ IOException -> 0x02ea }
            r5.append(r11)     // Catch:{ IOException -> 0x02ea }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x02ea }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02ea }
            throw r0     // Catch:{ IOException -> 0x02ea }
        L_0x02ea:
            r0 = move-exception
            e8.sf0 r4 = new e8.sf0
            android.net.Uri r5 = r2.f16161a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0302
            java.lang.String r3 = r3.concat(r5)
            goto L_0x0308
        L_0x0302:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x0308:
            r4.<init>((java.lang.String) r3, (java.io.IOException) r0, (e8.qf0) r2)
            goto L_0x030d
        L_0x030c:
            throw r4
        L_0x030d:
            goto L_0x030c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k7.b(e8.qf0):long");
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f7201h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e.C("Unexpected error while disconnecting", e10);
            }
            this.f7201h = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r3 > 2048) goto L_0x0034;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws e8.sf0 {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f7202i     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0075
            java.net.HttpURLConnection r2 = r9.f7201h     // Catch:{ all -> 0x008d }
            long r3 = r9.f7205l     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f7207n     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = e8.eg0.f14479a     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x001e
            r8 = 20
            if (r7 != r8) goto L_0x0065
        L_0x001e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0065 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002e
            int r3 = r2.read()     // Catch:{ Exception -> 0x0065 }
            r4 = -1
            if (r3 != r4) goto L_0x0034
            goto L_0x0065
        L_0x002e:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0065
        L_0x0034:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0065 }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0065 }
            if (r3 == 0) goto L_0x0065
        L_0x004c:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0065 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0065 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0065 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0065 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            java.io.InputStream r2 = r9.f7202i     // Catch:{ IOException -> 0x006b }
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x0075
        L_0x006b:
            r2 = move-exception
            e8.sf0 r3 = new e8.sf0     // Catch:{ all -> 0x008d }
            e8.qf0 r4 = r9.f7200g     // Catch:{ all -> 0x008d }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (e8.qf0) r4, (int) r5)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0075:
            r9.f7202i = r0
            r9.c()
            boolean r0 = r9.f7203j
            if (r0 == 0) goto L_0x0087
            r9.f7203j = r1
            e8.vf0<? super com.google.android.gms.internal.ads.k7> r0 = r9.f7199f
            if (r0 == 0) goto L_0x0087
            r0.e(r9)
        L_0x0087:
            java.util.Set<java.net.Socket> r0 = r9.f7209p
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.f7202i = r0
            r9.c()
            boolean r0 = r9.f7203j
            if (r0 == 0) goto L_0x00a0
            r9.f7203j = r1
            e8.vf0<? super com.google.android.gms.internal.ads.k7> r0 = r9.f7199f
            if (r0 == 0) goto L_0x00a0
            r0.e(r9)
        L_0x00a0:
            java.util.Set<java.net.Socket> r0 = r9.f7209p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k7.close():void");
    }
}
