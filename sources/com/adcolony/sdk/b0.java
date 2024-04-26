package com.adcolony.sdk;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p.f;

public class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f4444a;

    /* renamed from: b  reason: collision with root package name */
    public InputStream f4445b;

    /* renamed from: c  reason: collision with root package name */
    public g f4446c;

    /* renamed from: d  reason: collision with root package name */
    public a f4447d;

    /* renamed from: e  reason: collision with root package name */
    public String f4448e;

    /* renamed from: f  reason: collision with root package name */
    public int f4449f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4450g = false;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, List<String>> f4451h;

    /* renamed from: i  reason: collision with root package name */
    public String f4452i = "";

    /* renamed from: r  reason: collision with root package name */
    public String f4453r = "";

    /* renamed from: s  reason: collision with root package name */
    public String f4454s = "";

    /* renamed from: t  reason: collision with root package name */
    public String f4455t = "";

    /* renamed from: u  reason: collision with root package name */
    public boolean f4456u;

    /* renamed from: v  reason: collision with root package name */
    public int f4457v;

    /* renamed from: w  reason: collision with root package name */
    public int f4458w;

    public interface a {
        void a(b0 b0Var, g gVar, Map<String, List<String>> map);
    }

    public b0(g gVar, a aVar) {
        this.f4446c = gVar;
        this.f4447d = aVar;
    }

    public final boolean a() throws IOException {
        JSONObject jSONObject = this.f4446c.f4485b;
        String optString = jSONObject.optString("content_type");
        String optString2 = jSONObject.optString("content");
        int optInt = jSONObject.optInt("read_timeout", 60000);
        int optInt2 = jSONObject.optInt("connect_timeout", 60000);
        boolean optBoolean = jSONObject.optBoolean("no_redirect");
        this.f4454s = jSONObject.optString("url");
        this.f4452i = jSONObject.optString("filepath");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.d().q().f4421d);
        String str = this.f4452i;
        sb2.append(str.substring(str.lastIndexOf("/") + 1));
        this.f4453r = sb2.toString();
        this.f4448e = jSONObject.optString("encoding");
        int optInt3 = jSONObject.optInt("max_size", 0);
        this.f4449f = optInt3;
        this.f4450g = optInt3 != 0;
        this.f4457v = 0;
        this.f4445b = null;
        this.f4444a = null;
        this.f4451h = null;
        if (!this.f4454s.startsWith("file://")) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f4454s).openConnection();
            this.f4444a = httpURLConnection;
            httpURLConnection.setReadTimeout(optInt);
            this.f4444a.setConnectTimeout(optInt2);
            this.f4444a.setInstanceFollowRedirects(!optBoolean);
            this.f4444a.setRequestProperty("Accept-Charset", "UTF-8");
            String str2 = f.d().i().f4796b;
            if (str2 != null && !str2.equals("")) {
                this.f4444a.setRequestProperty("User-Agent", str2);
            }
            if (!optString.equals("")) {
                this.f4444a.setRequestProperty("Content-Type", optString);
            }
            if (this.f4446c.f4484a.equals("WebServices.post")) {
                this.f4444a.setDoOutput(true);
                this.f4444a.setFixedLengthStreamingMode(optString2.getBytes("UTF-8").length);
                new PrintStream(this.f4444a.getOutputStream()).print(optString2);
            }
        } else if (this.f4454s.startsWith("file:///android_asset/")) {
            Context context = f.f4478a;
            if (context != null) {
                this.f4445b = context.getAssets().open(this.f4454s.substring(22));
            }
        } else {
            this.f4445b = new FileInputStream(this.f4454s.substring(7));
        }
        if (this.f4444a == null && this.f4445b == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r2 = r9.f4448e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        if (r2 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        if (r2.isEmpty() != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        r2 = r9.f4448e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r2 = "UTF-8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        if ((r0 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r9.f4455t = ((java.io.ByteArrayOutputStream) r0).toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (r0 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (r1 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() throws java.lang.Exception {
        /*
            r9 = this;
            com.adcolony.sdk.g r0 = r9.f4446c
            java.lang.String r0 = r0.f4484a
            java.io.InputStream r1 = r9.f4445b
            r2 = 0
            r3 = 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = r9.f4452i
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001a
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            goto L_0x0091
        L_0x001a:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r9.f4452i
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            java.lang.String r0 = r0.getAbsolutePath()
            r1.<init>(r0)
            r0 = r1
            goto L_0x0091
        L_0x002c:
            java.lang.String r1 = "WebServices.download"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0044
            java.net.HttpURLConnection r0 = r9.f4444a
            java.io.InputStream r0 = r0.getInputStream()
            r9.f4445b = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r1 = r9.f4453r
            r0.<init>(r1)
            goto L_0x0091
        L_0x0044:
            java.lang.String r1 = "WebServices.get"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005a
            java.net.HttpURLConnection r0 = r9.f4444a
            java.io.InputStream r0 = r0.getInputStream()
            r9.f4445b = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            goto L_0x0091
        L_0x005a:
            java.lang.String r1 = "WebServices.post"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0090
            java.net.HttpURLConnection r0 = r9.f4444a
            r0.connect()
            java.net.HttpURLConnection r0 = r9.f4444a
            int r0 = r0.getResponseCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x0082
            java.net.HttpURLConnection r0 = r9.f4444a
            int r0 = r0.getResponseCode()
            r1 = 299(0x12b, float:4.19E-43)
            if (r0 > r1) goto L_0x0082
            java.net.HttpURLConnection r0 = r9.f4444a
            java.io.InputStream r0 = r0.getInputStream()
            goto L_0x0088
        L_0x0082:
            java.net.HttpURLConnection r0 = r9.f4444a
            java.io.InputStream r0 = r0.getErrorStream()
        L_0x0088:
            r9.f4445b = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            goto L_0x0091
        L_0x0090:
            r0 = r2
        L_0x0091:
            java.net.HttpURLConnection r1 = r9.f4444a
            if (r1 == 0) goto L_0x00a3
            int r1 = r1.getResponseCode()
            r9.f4458w = r1
            java.net.HttpURLConnection r1 = r9.f4444a
            java.util.Map r1 = r1.getHeaderFields()
            r9.f4451h = r1
        L_0x00a3:
            java.io.InputStream r1 = r9.f4445b
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            byte[] r2 = new byte[r3]     // Catch:{ Exception -> 0x0126 }
        L_0x00ac:
            r5 = 0
            int r6 = r4.read(r2, r5, r3)     // Catch:{ Exception -> 0x0126 }
            r7 = -1
            if (r6 == r7) goto L_0x00fb
            int r7 = r9.f4457v     // Catch:{ Exception -> 0x0126 }
            int r7 = r7 + r6
            r9.f4457v = r7     // Catch:{ Exception -> 0x0126 }
            boolean r8 = r9.f4450g     // Catch:{ Exception -> 0x0126 }
            if (r8 == 0) goto L_0x00f7
            int r8 = r9.f4449f     // Catch:{ Exception -> 0x0126 }
            if (r7 > r8) goto L_0x00c2
            goto L_0x00f7
        L_0x00c2:
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0126 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0126 }
            r3.<init>()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r5 = "Data exceeds expected maximum ("
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            int r5 = r9.f4457v     // Catch:{ Exception -> 0x0126 }
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r5 = "/"
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            int r5 = r9.f4449f     // Catch:{ Exception -> 0x0126 }
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r5 = "): "
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            java.net.HttpURLConnection r5 = r9.f4444a     // Catch:{ Exception -> 0x0126 }
            java.net.URL r5 = r5.getURL()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0126 }
            r3.append(r5)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0126 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0126 }
            throw r2     // Catch:{ Exception -> 0x0126 }
        L_0x00f7:
            r0.write(r2, r5, r6)     // Catch:{ Exception -> 0x0126 }
            goto L_0x00ac
        L_0x00fb:
            java.lang.String r2 = r9.f4448e     // Catch:{ Exception -> 0x0126 }
            if (r2 == 0) goto L_0x0108
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0126 }
            if (r2 != 0) goto L_0x0108
            java.lang.String r2 = r9.f4448e     // Catch:{ Exception -> 0x0126 }
            goto L_0x010a
        L_0x0108:
            java.lang.String r2 = "UTF-8"
        L_0x010a:
            boolean r3 = r0 instanceof java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0126 }
            if (r3 == 0) goto L_0x0117
            r3 = r0
            java.io.ByteArrayOutputStream r3 = (java.io.ByteArrayOutputStream) r3     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = r3.toString(r2)     // Catch:{ Exception -> 0x0126 }
            r9.f4455t = r2     // Catch:{ Exception -> 0x0126 }
        L_0x0117:
            if (r0 == 0) goto L_0x011c
            r0.close()
        L_0x011c:
            if (r1 == 0) goto L_0x0121
            r1.close()
        L_0x0121:
            r4.close()
            r0 = 1
            return r0
        L_0x0126:
            r2 = move-exception
            goto L_0x012d
        L_0x0128:
            r3 = move-exception
            goto L_0x0131
        L_0x012a:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x012d:
            throw r2     // Catch:{ all -> 0x012e }
        L_0x012e:
            r2 = move-exception
            r3 = r2
            r2 = r4
        L_0x0131:
            if (r0 == 0) goto L_0x0136
            r0.close()
        L_0x0136:
            if (r1 == 0) goto L_0x013b
            r1.close()
        L_0x013b:
            if (r2 == 0) goto L_0x0140
            r2.close()
        L_0x0140:
            goto L_0x0142
        L_0x0141:
            throw r3
        L_0x0142:
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.b0.b():boolean");
    }

    public void run() {
        boolean z10;
        this.f4456u = false;
        try {
            if (a()) {
                b();
                this.f4456u = true;
                if (this.f4446c.f4484a.equals("WebServices.post") && this.f4458w != 200) {
                    this.f4456u = false;
                }
            }
        } catch (MalformedURLException e10) {
            StringBuilder a10 = android.support.v4.media.a.a("MalformedURLException: ");
            a10.append(e10.toString());
            f.a(0, 0, a10.toString(), true);
            this.f4456u = true;
        } catch (OutOfMemoryError unused) {
            StringBuilder a11 = android.support.v4.media.a.a("Out of memory error - disabling AdColony. (");
            a11.append(this.f4457v);
            a11.append("/");
            a11.append(this.f4449f);
            a11.append("): " + this.f4454s);
            f.d().l().e(0, 0, a11.toString(), false);
            f.d().B = true;
        } catch (IOException e11) {
            StringBuilder a12 = android.support.v4.media.a.a("Download of ");
            a12.append(this.f4454s);
            a12.append(" failed: ");
            a12.append(e11.toString());
            f.a(0, 1, a12.toString(), true);
            int i10 = this.f4458w;
            if (i10 == 0) {
                i10 = 504;
            }
            this.f4458w = i10;
        } catch (IllegalStateException e12) {
            StringBuilder a13 = android.support.v4.media.a.a("okhttp error: ");
            a13.append(e12.toString());
            f.d().l().e(0, 0, a13.toString(), false);
            e12.printStackTrace();
            z10 = false;
        } catch (Exception e13) {
            StringBuilder a14 = android.support.v4.media.a.a("Exception: ");
            a14.append(e13.toString());
            f.d().l().e(0, 0, a14.toString(), false);
            e13.printStackTrace();
        }
        z10 = true;
        if (z10) {
            if (this.f4446c.f4484a.equals("WebServices.download")) {
                String str = this.f4453r;
                String str2 = this.f4452i;
                try {
                    String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
                    if (!str2.equals("") && !substring.equals(f.d().q().f4421d) && !new File(str).renameTo(new File(str2))) {
                        f.d().l().e(0, 1, "Moving of " + str + " failed.", true);
                    }
                } catch (Exception e14) {
                    StringBuilder a15 = android.support.v4.media.a.a("Exception: ");
                    a15.append(e14.toString());
                    f.d().l().e(0, 0, a15.toString(), false);
                    e14.printStackTrace();
                }
            }
            this.f4447d.a(this, this.f4446c, this.f4451h);
        }
    }
}
