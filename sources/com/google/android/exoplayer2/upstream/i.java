package com.google.android.exoplayer2.upstream;

import aa.h;
import android.net.Uri;
import androidx.appcompat.widget.d0;
import com.google.android.exoplayer2.upstream.m;
import j.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import u6.c;
import u6.e;
import v6.e0;
import v6.p;

/* compiled from: DefaultHttpDataSource */
public class i extends c implements m {

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f5494v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5495e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5496f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5497g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5498h;

    /* renamed from: i  reason: collision with root package name */
    public final m.g f5499i;

    /* renamed from: j  reason: collision with root package name */
    public final m.g f5500j = new m.g();

    /* renamed from: k  reason: collision with root package name */
    public h<String> f5501k;

    /* renamed from: l  reason: collision with root package name */
    public e f5502l;

    /* renamed from: m  reason: collision with root package name */
    public HttpURLConnection f5503m;

    /* renamed from: n  reason: collision with root package name */
    public InputStream f5504n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f5505o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5506p;

    /* renamed from: q  reason: collision with root package name */
    public int f5507q;

    /* renamed from: r  reason: collision with root package name */
    public long f5508r;

    /* renamed from: s  reason: collision with root package name */
    public long f5509s;

    /* renamed from: t  reason: collision with root package name */
    public long f5510t;

    /* renamed from: u  reason: collision with root package name */
    public long f5511u;

    public i(String str, int i10, int i11, boolean z10, m.g gVar, h<String> hVar) {
        super(true);
        this.f5498h = str;
        this.f5496f = i10;
        this.f5497g = i11;
        this.f5495e = z10;
        this.f5499i = gVar;
        this.f5501k = hVar;
    }

    public static URL r(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException(f.a("Unsupported protocol redirect: ", protocol));
        }
        throw new ProtocolException("Null location redirect");
    }

    public static void u(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = e0.f26436a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public Uri M() {
        HttpURLConnection httpURLConnection = this.f5503m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public Map<String, List<String>> N() {
        HttpURLConnection httpURLConnection = this.f5503m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r9 != 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long O(u6.e r20) throws com.google.android.exoplayer2.upstream.m.d {
        /*
            r19 = this;
            r1 = r19
            r6 = r20
            java.lang.String r2 = "Unable to connect"
            r1.f5502l = r6
            r3 = 0
            r1.f5511u = r3
            r1.f5510t = r3
            r19.o(r20)
            r8 = 1
            java.net.HttpURLConnection r0 = r19.t(r20)     // Catch:{ IOException -> 0x0195 }
            r1.f5503m = r0     // Catch:{ IOException -> 0x0195 }
            int r5 = r0.getResponseCode()     // Catch:{ IOException -> 0x018b }
            r1.f5507q = r5     // Catch:{ IOException -> 0x018b }
            java.lang.String r5 = r0.getResponseMessage()     // Catch:{ IOException -> 0x018b }
            int r2 = r1.f5507q
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 < r7) goto L_0x0157
            r9 = 299(0x12b, float:4.19E-43)
            if (r2 <= r9) goto L_0x002e
            goto L_0x0157
        L_0x002e:
            java.lang.String r2 = r0.getContentType()
            aa.h<java.lang.String> r5 = r1.f5501k
            if (r5 == 0) goto L_0x0052
            aa.b$a r5 = (aa.b.a) r5
            r5.getClass()
            r9 = r2
            java.lang.Character r9 = (java.lang.Character) r9
            char r9 = r9.charValue()
            boolean r5 = r5.b(r9)
            if (r5 == 0) goto L_0x0049
            goto L_0x0052
        L_0x0049:
            r19.q()
            com.google.android.exoplayer2.upstream.m$e r0 = new com.google.android.exoplayer2.upstream.m$e
            r0.<init>(r2, r6)
            throw r0
        L_0x0052:
            int r2 = r1.f5507q
            if (r2 != r7) goto L_0x005d
            long r9 = r6.f26053f
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r9 = r3
        L_0x005e:
            r1.f5508r = r9
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r2 = r0.getHeaderField(r2)
            java.lang.String r5 = "gzip"
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0130
            long r9 = r6.f26054g
            r11 = -1
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x007a
            r1.f5509s = r9
            goto L_0x0134
        L_0x007a:
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r0.getHeaderField(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r9 = "]"
            java.lang.String r10 = "DefaultHttpDataSource"
            if (r7 != 0) goto L_0x00a6
            long r13 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x008f }
            goto L_0x00a7
        L_0x008f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "Unexpected Content-Length ["
            r7.append(r13)
            r7.append(r5)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r10, r7)
        L_0x00a6:
            r13 = r11
        L_0x00a7:
            java.lang.String r7 = "Content-Range"
            java.lang.String r7 = r0.getHeaderField(r7)
            boolean r15 = android.text.TextUtils.isEmpty(r7)
            if (r15 != 0) goto L_0x0121
            java.util.regex.Pattern r15 = f5494v
            java.util.regex.Matcher r15 = r15.matcher(r7)
            boolean r16 = r15.find()
            if (r16 == 0) goto L_0x0121
            r11 = 2
            java.lang.String r11 = r15.group(r11)     // Catch:{ NumberFormatException -> 0x010a }
            r11.getClass()     // Catch:{ NumberFormatException -> 0x010a }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x010a }
            java.lang.String r15 = r15.group(r8)     // Catch:{ NumberFormatException -> 0x010a }
            r15.getClass()     // Catch:{ NumberFormatException -> 0x010a }
            long r17 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x010a }
            long r11 = r11 - r17
            r17 = 1
            long r11 = r11 + r17
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x00e2
            r13 = r11
            goto L_0x0121
        L_0x00e2:
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0121
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x010a }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x010a }
            java.lang.String r4 = "Inconsistent headers ["
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x010a }
            r3.append(r5)     // Catch:{ NumberFormatException -> 0x010a }
            java.lang.String r4 = "] ["
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x010a }
            r3.append(r7)     // Catch:{ NumberFormatException -> 0x010a }
            r3.append(r9)     // Catch:{ NumberFormatException -> 0x010a }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x010a }
            android.util.Log.w(r10, r3)     // Catch:{ NumberFormatException -> 0x010a }
            long r13 = java.lang.Math.max(r13, r11)     // Catch:{ NumberFormatException -> 0x010a }
            goto L_0x0121
        L_0x010a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r7)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r10, r3)
        L_0x0121:
            r3 = -1
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x012c
            long r3 = r1.f5508r
            long r11 = r13 - r3
            goto L_0x012d
        L_0x012c:
            r11 = r3
        L_0x012d:
            r1.f5509s = r11
            goto L_0x0134
        L_0x0130:
            long r3 = r6.f26054g
            r1.f5509s = r3
        L_0x0134:
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x014d }
            r1.f5504n = r0     // Catch:{ IOException -> 0x014d }
            if (r2 == 0) goto L_0x0145
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x014d }
            java.io.InputStream r2 = r1.f5504n     // Catch:{ IOException -> 0x014d }
            r0.<init>(r2)     // Catch:{ IOException -> 0x014d }
            r1.f5504n = r0     // Catch:{ IOException -> 0x014d }
        L_0x0145:
            r1.f5506p = r8
            r19.p(r20)
            long r2 = r1.f5509s
            return r2
        L_0x014d:
            r0 = move-exception
            r19.q()
            com.google.android.exoplayer2.upstream.m$d r2 = new com.google.android.exoplayer2.upstream.m$d
            r2.<init>((java.io.IOException) r0, (u6.e) r6, (int) r8)
            throw r2
        L_0x0157:
            java.util.Map r7 = r0.getHeaderFields()
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0166
            byte[] r0 = v6.e0.U(r0)     // Catch:{ IOException -> 0x0169 }
            goto L_0x016b
        L_0x0166:
            byte[] r0 = v6.e0.f26441f     // Catch:{ IOException -> 0x0169 }
            goto L_0x016b
        L_0x0169:
            byte[] r0 = v6.e0.f26441f
        L_0x016b:
            r19.q()
            com.google.android.exoplayer2.upstream.m$f r9 = new com.google.android.exoplayer2.upstream.m$f
            int r3 = r1.f5507q
            r2 = r9
            r4 = r5
            r5 = r7
            r6 = r20
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            int r0 = r1.f5507q
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x018a
            k3.b r0 = new k3.b
            r2 = 0
            r0.<init>(r2, r8)
            r9.initCause(r0)
        L_0x018a:
            throw r9
        L_0x018b:
            r0 = move-exception
            r19.q()
            com.google.android.exoplayer2.upstream.m$d r3 = new com.google.android.exoplayer2.upstream.m$d
            r3.<init>(r2, r0, r6, r8)
            throw r3
        L_0x0195:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01ae
            java.lang.String r3 = v6.e0.V(r3)
            java.lang.String r4 = "cleartext http traffic.*not permitted.*"
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L_0x01ae
            com.google.android.exoplayer2.upstream.m$b r2 = new com.google.android.exoplayer2.upstream.m$b
            r2.<init>(r0, r6)
            throw r2
        L_0x01ae:
            com.google.android.exoplayer2.upstream.m$d r3 = new com.google.android.exoplayer2.upstream.m$d
            r3.<init>(r2, r0, r6, r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.i.O(u6.e):long");
    }

    public int a(byte[] bArr, int i10, int i11) throws m.d {
        try {
            v();
            if (i11 == 0) {
                return 0;
            }
            long j10 = this.f5509s;
            if (j10 != -1) {
                long j11 = j10 - this.f5511u;
                if (j11 != 0) {
                    i11 = (int) Math.min((long) i11, j11);
                }
                return -1;
            }
            InputStream inputStream = this.f5504n;
            int i12 = e0.f26436a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f5511u += (long) read;
                m(read);
                return read;
            } else if (this.f5509s == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e10) {
            e eVar = this.f5502l;
            int i13 = e0.f26436a;
            throw new m.d(e10, eVar, 2);
        }
    }

    public void close() throws m.d {
        try {
            InputStream inputStream = this.f5504n;
            if (inputStream != null) {
                HttpURLConnection httpURLConnection = this.f5503m;
                long j10 = this.f5509s;
                if (j10 != -1) {
                    j10 -= this.f5511u;
                }
                u(httpURLConnection, j10);
                inputStream.close();
            }
            this.f5504n = null;
            q();
            if (this.f5506p) {
                this.f5506p = false;
                n();
            }
        } catch (IOException e10) {
            e eVar = this.f5502l;
            int i10 = e0.f26436a;
            throw new m.d(e10, eVar, 3);
        } catch (Throwable th) {
            this.f5504n = null;
            q();
            if (this.f5506p) {
                this.f5506p = false;
                n();
            }
            throw th;
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.f5503m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f5503m = null;
        }
    }

    public final HttpURLConnection s(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f5496f);
        httpURLConnection.setReadTimeout(this.f5497g);
        HashMap hashMap = new HashMap();
        m.g gVar = this.f5499i;
        if (gVar != null) {
            hashMap.putAll(gVar.a());
        }
        hashMap.putAll(this.f5500j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j10 == 0 && j11 == -1)) {
            String a10 = q2.a.a("bytes=", j10, "-");
            if (j11 != -1) {
                StringBuilder a11 = android.support.v4.media.a.a(a10);
                a11.append((j10 + j11) - 1);
                a10 = a11.toString();
            }
            httpURLConnection.setRequestProperty("Range", a10);
        }
        String str = this.f5498h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(e.a(i10));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection t(e eVar) throws IOException {
        HttpURLConnection s10;
        e eVar2 = eVar;
        URL url = new URL(eVar2.f26048a.toString());
        int i10 = eVar2.f26050c;
        byte[] bArr = eVar2.f26051d;
        long j10 = eVar2.f26053f;
        long j11 = eVar2.f26054g;
        int i11 = 0;
        boolean z10 = (eVar2.f26056i & 1) == 1;
        if (!this.f5495e) {
            return s(url, i10, bArr, j10, j11, z10, true, eVar2.f26052e);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 <= 20) {
                int i13 = i12;
                long j12 = j11;
                long j13 = j10;
                s10 = s(url, i10, bArr, j10, j11, z10, false, eVar2.f26052e);
                int responseCode = s10.getResponseCode();
                String headerField = s10.getHeaderField("Location");
                if ((i10 == 1 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    s10.disconnect();
                    url = r(url, headerField);
                } else if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return s10;
                } else {
                    s10.disconnect();
                    url = r(url, headerField);
                    i10 = 1;
                    bArr = null;
                }
                eVar2 = eVar;
                i11 = i13;
                j11 = j12;
                j10 = j13;
            } else {
                throw new NoRouteToHostException(d0.a("Too many redirects: ", i12));
            }
        }
        return s10;
    }

    public final void v() throws IOException {
        if (this.f5510t != this.f5508r) {
            if (this.f5505o == null) {
                this.f5505o = new byte[4096];
            }
            while (true) {
                long j10 = this.f5510t;
                long j11 = this.f5508r;
                if (j10 != j11) {
                    int min = (int) Math.min(j11 - j10, (long) this.f5505o.length);
                    InputStream inputStream = this.f5504n;
                    int i10 = e0.f26436a;
                    int read = inputStream.read(this.f5505o, 0, min);
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f5510t += (long) read;
                        m(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultHttpDataSource */
    public static final class a implements m.c {

        /* renamed from: a  reason: collision with root package name */
        public final m.g f5512a = new m.g();

        /* renamed from: b  reason: collision with root package name */
        public String f5513b;

        /* renamed from: c  reason: collision with root package name */
        public int f5514c = 8000;

        /* renamed from: d  reason: collision with root package name */
        public int f5515d = 8000;

        public e a() {
            return new i(this.f5513b, this.f5514c, this.f5515d, false, this.f5512a, (h<String>) null);
        }

        /* renamed from: a  reason: collision with other method in class */
        public m m15a() {
            return new i(this.f5513b, this.f5514c, this.f5515d, false, this.f5512a, (h<String>) null);
        }
    }
}
