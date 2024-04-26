package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import db.b;
import db.c;
import e0.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.cybergarage.xml.XML;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f9762h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f9763a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9764b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9765c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9766d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9767e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9768f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9769g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f9763a = context;
        this.f9764b = str;
        this.f9765c = str2;
        Matcher matcher = f9762h.matcher(str);
        this.f9766d = matcher.matches() ? matcher.group(1) : null;
        this.f9767e = str3;
        this.f9768f = j10;
        this.f9769g = j11;
    }

    public final JSONObject a(String str, String str2, Map<String, String> map) throws b {
        String str3;
        long j10;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f9764b);
            Locale locale = this.f9763a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                str3 = locale.toLanguageTag();
            } else {
                str3 = locale.toString();
            }
            hashMap.put("languageCode", str3);
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f9763a.getPackageManager().getPackageInfo(this.f9763a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j10 = a.b(packageInfo);
                    } else {
                        j10 = (long) packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j10));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f9763a.getPackageName());
            hashMap.put("sdkVersion", "21.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new b("Fetch failed: Firebase installation id is null.");
    }

    public HttpURLConnection b() throws c {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f9766d, this.f9767e})).openConnection();
        } catch (IOException e10) {
            throw new c(e10.getMessage());
        }
    }

    public final JSONObject c(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), XML.CHARSET_UTF8));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    public final void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:30|31|32|33|34|(3:38|39|40)|41|43|44|(3:48|49|50)|51|53|54|(3:57|58|59)|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0150 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4 A[LOOP:0: B:10:0x009e->B:12:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d6 A[Catch:{ IOException | JSONException -> 0x0172, all -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166 A[SYNTHETIC, Splitter:B:67:0x0166] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.c.a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) throws db.c {
        /*
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f9768f
            long r2 = r1.toMillis(r2)
            int r3 = (int) r2
            r7.setConnectTimeout(r3)
            long r2 = r6.f9769g
            long r1 = r1.toMillis(r2)
            int r2 = (int) r1
            r7.setReadTimeout(r2)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = r6.f9765c
            java.lang.String r1 = "X-Goog-Api-Key"
            r7.setRequestProperty(r1, r11)
            android.content.Context r11 = r6.f9763a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "FirebaseRemoteConfig"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.f9763a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            byte[] r3 = com.google.android.gms.common.util.a.a(r3, r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 != 0) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = "Could not get fingerprint hash for package: "
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r4 = r6.f9763a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0061 }
            android.util.Log.e(r11, r3)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0078
        L_0x005c:
            java.lang.String r11 = com.google.android.gms.common.util.b.b(r3, r1)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "No such package: "
            java.lang.StringBuilder r4 = android.support.v4.media.a.a(r4)
            android.content.Context r5 = r6.f9763a
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r11, r4, r3)
        L_0x0078:
            r11 = r2
        L_0x0079:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r11, r3)
            java.lang.String r11 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r11, r9)
            java.lang.String r11 = "application/json"
            java.lang.String r3 = "Content-Type"
            r7.setRequestProperty(r3, r11)
            java.lang.String r3 = "Accept"
            r7.setRequestProperty(r3, r11)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ba
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r3, r12)
            goto L_0x009e
        L_0x00ba:
            org.json.JSONObject r8 = r6.a(r8, r9, r10)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            r6.d(r7, r8)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            r7.connect()     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0166
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            org.json.JSONObject r9 = r6.c(r7)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00ea }
            r7.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch:{ JSONException -> 0x00f8 }
            r7 = r7 ^ r0
            goto L_0x00f9
        L_0x00f8:
            r7 = 1
        L_0x00f9:
            if (r7 != 0) goto L_0x0101
            com.google.firebase.remoteconfig.internal.c$a r7 = new com.google.firebase.remoteconfig.internal.c$a
            r7.<init>(r13, r0, r2, r2)
            return r7
        L_0x0101:
            java.util.Date r7 = com.google.firebase.remoteconfig.internal.b.f9776f     // Catch:{ JSONException -> 0x015d }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015d }
            r7.<init>()     // Catch:{ JSONException -> 0x015d }
            java.util.Date r10 = com.google.firebase.remoteconfig.internal.b.f9776f     // Catch:{ JSONException -> 0x015d }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x015d }
            r10.<init>()     // Catch:{ JSONException -> 0x015d }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015d }
            r11.<init>()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r12 = "entries"
            org.json.JSONObject r12 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x011b }
            goto L_0x011c
        L_0x011b:
            r12 = r2
        L_0x011c:
            if (r12 == 0) goto L_0x0128
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0128 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0128 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0128 }
            r7 = r0
        L_0x0128:
            java.lang.String r12 = "experimentDescriptions"
            org.json.JSONArray r12 = r9.getJSONArray(r12)     // Catch:{ JSONException -> 0x012f }
            goto L_0x0130
        L_0x012f:
            r12 = r2
        L_0x0130:
            if (r12 == 0) goto L_0x013c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013c }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x013c }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x013c }
            r10 = r0
        L_0x013c:
            java.lang.String r12 = "personalizationMetadata"
            org.json.JSONObject r2 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0143 }
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            if (r2 == 0) goto L_0x0150
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0150 }
            java.lang.String r12 = r2.toString()     // Catch:{ JSONException -> 0x0150 }
            r9.<init>(r12)     // Catch:{ JSONException -> 0x0150 }
            r11 = r9
        L_0x0150:
            com.google.firebase.remoteconfig.internal.b r9 = new com.google.firebase.remoteconfig.internal.b     // Catch:{ JSONException -> 0x015d }
            r9.<init>(r7, r13, r10, r11)     // Catch:{ JSONException -> 0x015d }
            com.google.firebase.remoteconfig.internal.c$a r7 = new com.google.firebase.remoteconfig.internal.c$a
            java.util.Date r10 = r9.f9779c
            r7.<init>(r10, r1, r9, r8)
            return r7
        L_0x015d:
            r7 = move-exception
            db.b r8 = new db.b
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L_0x0166:
            db.e r9 = new db.e     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            java.lang.String r10 = r7.getResponseMessage()     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
            throw r9     // Catch:{ IOException -> 0x0174, JSONException -> 0x0172 }
        L_0x0170:
            r8 = move-exception
            goto L_0x017d
        L_0x0172:
            r8 = move-exception
            goto L_0x0175
        L_0x0174:
            r8 = move-exception
        L_0x0175:
            db.b r9 = new db.b     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x0170 }
            throw r9     // Catch:{ all -> 0x0170 }
        L_0x017d:
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0187 }
            r7.close()     // Catch:{ IOException -> 0x0187 }
        L_0x0187:
            goto L_0x0189
        L_0x0188:
            throw r8
        L_0x0189:
            goto L_0x0188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):com.google.firebase.remoteconfig.internal.c$a");
    }
}
