package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import e8.p9;
import e8.qf0;
import e8.rf0;
import e8.sf0;
import e8.vf0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lu implements rf0 {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f7416o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReference<byte[]> f7417p = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7420c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7421d;

    /* renamed from: e  reason: collision with root package name */
    public final p9 f7422e;

    /* renamed from: f  reason: collision with root package name */
    public final vf0<? super lu> f7423f;

    /* renamed from: g  reason: collision with root package name */
    public qf0 f7424g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f7425h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f7426i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7427j;

    /* renamed from: k  reason: collision with root package name */
    public long f7428k;

    /* renamed from: l  reason: collision with root package name */
    public long f7429l;

    /* renamed from: m  reason: collision with root package name */
    public long f7430m;

    /* renamed from: n  reason: collision with root package name */
    public long f7431n;

    public lu(String str, vf0 vf0, int i10, int i11) {
        if (!TextUtils.isEmpty(str)) {
            this.f7421d = str;
            this.f7423f = vf0;
            this.f7422e = new p9(17);
            this.f7419b = i10;
            this.f7420c = i11;
            this.f7418a = true;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Uri M() {
        HttpURLConnection httpURLConnection = this.f7425h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final Map<String, List<String>> N() {
        HttpURLConnection httpURLConnection = this.f7425h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final int a(byte[] bArr, int i10, int i11) throws sf0 {
        try {
            if (this.f7430m != this.f7428k) {
                byte[] andSet = f7417p.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j10 = this.f7430m;
                    long j11 = this.f7428k;
                    if (j10 == j11) {
                        f7417p.set(andSet);
                        break;
                    }
                    int read = this.f7426i.read(andSet, 0, (int) Math.min(j11 - j10, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f7430m += (long) read;
                        vf0<? super lu> vf0 = this.f7423f;
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
            long j12 = this.f7429l;
            if (j12 != -1) {
                long j13 = j12 - this.f7431n;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min((long) i11, j13);
            }
            int read2 = this.f7426i.read(bArr, i10, i11);
            if (read2 != -1) {
                this.f7431n += (long) read2;
                vf0<? super lu> vf02 = this.f7423f;
                if (vf02 != null) {
                    vf02.i(this, read2);
                }
                return read2;
            } else if (this.f7429l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e10) {
            throw new sf0(e10, this.f7424g, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r0 != 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(e8.qf0 r24) throws e8.sf0 {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            java.lang.String r12 = "Unable to connect to "
            r10.f7424g = r11
            r13 = 0
            r10.f7431n = r13
            r10.f7430m = r13
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0245 }
            android.net.Uri r0 = r11.f16161a     // Catch:{ IOException -> 0x0245 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0245 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0245 }
            byte[] r3 = r11.f16162b     // Catch:{ IOException -> 0x0245 }
            long r8 = r11.f16164d     // Catch:{ IOException -> 0x0245 }
            long r6 = r11.f16165e     // Catch:{ IOException -> 0x0245 }
            boolean r0 = r24.a()     // Catch:{ IOException -> 0x0245 }
            boolean r1 = r10.f7418a     // Catch:{ IOException -> 0x0245 }
            if (r1 != 0) goto L_0x0032
            r15 = 1
            r1 = r23
            r4 = r8
            r8 = r0
            r9 = r15
            java.net.HttpURLConnection r0 = r1.c(r2, r3, r4, r6, r8, r9)     // Catch:{ IOException -> 0x0245 }
            goto L_0x0072
        L_0x0032:
            r1 = 0
            r15 = r2
            r16 = r3
        L_0x0036:
            int r4 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x0228
            r17 = 0
            r1 = r23
            r2 = r15
            r3 = r16
            r18 = r4
            r4 = r8
            r19 = r6
            r21 = r8
            r8 = r0
            r9 = r17
            java.net.HttpURLConnection r1 = r1.c(r2, r3, r4, r6, r8, r9)     // Catch:{ IOException -> 0x0245 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0245 }
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 == r3) goto L_0x01d4
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L_0x01d4
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L_0x01d4
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 == r3) goto L_0x01d4
            if (r16 != 0) goto L_0x0071
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L_0x01d4
            r3 = 308(0x134, float:4.32E-43)
            if (r2 != r3) goto L_0x0071
            goto L_0x01d4
        L_0x0071:
            r0 = r1
        L_0x0072:
            r10.f7425h = r0     // Catch:{ IOException -> 0x0245 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x01af }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x0194
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 <= r2) goto L_0x0082
            goto L_0x0194
        L_0x0082:
            java.net.HttpURLConnection r2 = r10.f7425h
            r2.getContentType()
            if (r0 != r1) goto L_0x0090
            long r0 = r11.f16164d
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r0 = r13
        L_0x0091:
            r10.f7428k = r0
            boolean r0 = r24.a()
            r1 = 1
            if (r0 != 0) goto L_0x0172
            long r2 = r11.f16165e
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            r10.f7429l = r2
            goto L_0x0176
        L_0x00a6:
            java.net.HttpURLConnection r0 = r10.f7425h
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r6 = "]"
            java.lang.String r7 = "DefaultHttpDataSource"
            if (r3 != 0) goto L_0x00da
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x00bd }
            goto L_0x00da
        L_0x00bd:
            r3 = 28
            int r3 = androidx.appcompat.widget.o.a(r2, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Length ["
            r8.append(r3)
            r8.append(r2)
            r8.append(r6)
            java.lang.String r3 = r8.toString()
            android.util.Log.e(r7, r3)
        L_0x00da:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0165
            java.util.regex.Pattern r3 = f7416o
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x0165
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x0148 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0148 }
            java.lang.String r3 = r3.group(r1)     // Catch:{ NumberFormatException -> 0x0148 }
            long r15 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0148 }
            long r8 = r8 - r15
            r15 = 1
            long r8 = r8 + r15
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x010d
            r4 = r8
            goto L_0x0165
        L_0x010d:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0165
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0148 }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x0148 }
            int r3 = r3 + 26
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0148 }
            int r12 = r12.length()     // Catch:{ NumberFormatException -> 0x0148 }
            int r3 = r3 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0148 }
            r12.<init>(r3)     // Catch:{ NumberFormatException -> 0x0148 }
            java.lang.String r3 = "Inconsistent headers ["
            r12.append(r3)     // Catch:{ NumberFormatException -> 0x0148 }
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x0148 }
            java.lang.String r2 = "] ["
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x0148 }
            r12.append(r0)     // Catch:{ NumberFormatException -> 0x0148 }
            r12.append(r6)     // Catch:{ NumberFormatException -> 0x0148 }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x0148 }
            android.util.Log.w(r7, r2)     // Catch:{ NumberFormatException -> 0x0148 }
            long r4 = java.lang.Math.max(r4, r8)     // Catch:{ NumberFormatException -> 0x0148 }
            goto L_0x0165
        L_0x0148:
            r2 = 27
            int r2 = androidx.appcompat.widget.o.a(r0, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Range ["
            r3.append(r2)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r7, r0)
        L_0x0165:
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x016f
            long r2 = r10.f7428k
            long r2 = r4 - r2
        L_0x016f:
            r10.f7429l = r2
            goto L_0x0176
        L_0x0172:
            long r2 = r11.f16165e
            r10.f7429l = r2
        L_0x0176:
            java.net.HttpURLConnection r0 = r10.f7425h     // Catch:{ IOException -> 0x018a }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x018a }
            r10.f7426i = r0     // Catch:{ IOException -> 0x018a }
            r10.f7427j = r1
            e8.vf0<? super com.google.android.gms.internal.ads.lu> r0 = r10.f7423f
            if (r0 == 0) goto L_0x0187
            r0.g(r10, r11)
        L_0x0187:
            long r0 = r10.f7429l
            return r0
        L_0x018a:
            r0 = move-exception
            r23.d()
            e8.sf0 r2 = new e8.sf0
            r2.<init>((java.io.IOException) r0, (e8.qf0) r11, (int) r1)
            throw r2
        L_0x0194:
            java.net.HttpURLConnection r1 = r10.f7425h
            java.util.Map r1 = r1.getHeaderFields()
            r23.d()
            e8.tf0 r2 = new e8.tf0
            r2.<init>(r0, r1, r11)
            r1 = 416(0x1a0, float:5.83E-43)
            if (r0 != r1) goto L_0x01ae
            k3.b r0 = new k3.b
            r0.<init>()
            r2.initCause(r0)
        L_0x01ae:
            throw r2
        L_0x01af:
            r0 = move-exception
            r1 = r0
            r23.d()
            e8.sf0 r0 = new e8.sf0
            android.net.Uri r2 = r11.f16161a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x01cb
            java.lang.String r2 = r12.concat(r2)
            goto L_0x01d0
        L_0x01cb:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
        L_0x01d0:
            r0.<init>((java.lang.String) r2, (java.io.IOException) r1, (e8.qf0) r11)
            throw r0
        L_0x01d4:
            r16 = 0
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ IOException -> 0x0245 }
            r1.disconnect()     // Catch:{ IOException -> 0x0245 }
            if (r2 == 0) goto L_0x0220
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0245 }
            r1.<init>(r15, r2)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r2 = r1.getProtocol()     // Catch:{ IOException -> 0x0245 }
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0245 }
            if (r3 != 0) goto L_0x0217
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0245 }
            if (r3 != 0) goto L_0x0217
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0245 }
            java.lang.String r1 = "Unsupported protocol redirect: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0245 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x0245 }
            if (r3 == 0) goto L_0x020d
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x0245 }
            goto L_0x0213
        L_0x020d:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0245 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0245 }
            r1 = r2
        L_0x0213:
            r0.<init>(r1)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x0217:
            r15 = r1
            r1 = r18
            r6 = r19
            r8 = r21
            goto L_0x0036
        L_0x0220:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0245 }
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x0228:
            r18 = r4
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0245 }
            r1 = 31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0245 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r1 = "Too many redirects: "
            r2.append(r1)     // Catch:{ IOException -> 0x0245 }
            r1 = r18
            r2.append(r1)     // Catch:{ IOException -> 0x0245 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0245 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0245 }
            throw r0     // Catch:{ IOException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            e8.sf0 r1 = new e8.sf0
            android.net.Uri r2 = r11.f16161a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x025d
            java.lang.String r2 = r12.concat(r2)
            goto L_0x0262
        L_0x025d:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
        L_0x0262:
            r1.<init>((java.lang.String) r2, (java.io.IOException) r0, (e8.qf0) r11)
            goto L_0x0267
        L_0x0266:
            throw r1
        L_0x0267:
            goto L_0x0266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lu.b(e8.qf0):long");
    }

    public final HttpURLConnection c(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f7419b);
        httpURLConnection.setReadTimeout(this.f7420c);
        for (Map.Entry next : this.f7422e.m().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j10 == 0 && j11 == -1)) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            String sb3 = sb2.toString();
            if (j11 != -1) {
                String valueOf = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 20);
                sb4.append(valueOf);
                sb4.append((j10 + j11) - 1);
                sb3 = sb4.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb3);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f7421d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
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
            java.io.InputStream r2 = r9.f7426i     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0075
            java.net.HttpURLConnection r2 = r9.f7425h     // Catch:{ all -> 0x0088 }
            long r3 = r9.f7429l     // Catch:{ all -> 0x0088 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f7431n     // Catch:{ all -> 0x0088 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = e8.eg0.f14479a     // Catch:{ all -> 0x0088 }
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
            java.io.InputStream r2 = r9.f7426i     // Catch:{ IOException -> 0x006b }
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x0075
        L_0x006b:
            r2 = move-exception
            e8.sf0 r3 = new e8.sf0     // Catch:{ all -> 0x0088 }
            e8.qf0 r4 = r9.f7424g     // Catch:{ all -> 0x0088 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (e8.qf0) r4, (int) r5)     // Catch:{ all -> 0x0088 }
            throw r3     // Catch:{ all -> 0x0088 }
        L_0x0075:
            r9.f7426i = r0
            r9.d()
            boolean r0 = r9.f7427j
            if (r0 == 0) goto L_0x0087
            r9.f7427j = r1
            e8.vf0<? super com.google.android.gms.internal.ads.lu> r0 = r9.f7423f
            if (r0 == 0) goto L_0x0087
            r0.e(r9)
        L_0x0087:
            return
        L_0x0088:
            r2 = move-exception
            r9.f7426i = r0
            r9.d()
            boolean r0 = r9.f7427j
            if (r0 == 0) goto L_0x009b
            r9.f7427j = r1
            e8.vf0<? super com.google.android.gms.internal.ads.lu> r0 = r9.f7423f
            if (r0 == 0) goto L_0x009b
            r0.e(r9)
        L_0x009b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lu.close():void");
    }

    public final void d() {
        HttpURLConnection httpURLConnection = this.f7425h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f7425h = null;
        }
    }
}
