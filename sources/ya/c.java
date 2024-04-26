package ya;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import cb.h;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sa.e;
import t.g;
import ua.a;
import va.d;
import ya.a;
import ya.b;
import ya.d;
import ya.f;

/* compiled from: FirebaseInstallationServiceClient */
public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f28149e = Pattern.compile("[0-9]+s");

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f28150f = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f28151a;

    /* renamed from: b  reason: collision with root package name */
    public final a<h> f28152b;

    /* renamed from: c  reason: collision with root package name */
    public final a<e> f28153c;

    /* renamed from: d  reason: collision with root package name */
    public final e f28154d = new e();

    public c(Context context, a<h> aVar, a<e> aVar2) {
        this.f28151a = context;
        this.f28152b = aVar;
        this.f28153c = aVar2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0052
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f28150f
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007d
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006c
            java.lang.String r11 = ""
            goto L_0x0072
        L_0x006c:
            java.lang.String r12 = ", "
            java.lang.String r11 = j.f.a(r12, r11)
        L_0x0072:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        i.b(f28149e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final URL a(String str) throws d {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e10) {
            throw new d(e10.getMessage(), 2);
        }
    }

    public final HttpURLConnection c(URL url, String str) throws d {
        int a10;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f28151a.getPackageName());
            if (!(this.f28153c.get() == null || this.f28152b.get() == null || (a10 = this.f28153c.get().a("fire-installations-id")) == 1)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f28152b.get().a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(g.f(a10)));
            }
            String str2 = null;
            try {
                Context context = this.f28151a;
                byte[] a11 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
                if (a11 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f28151a.getPackageName());
                } else {
                    str2 = b.b(a11, false);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                StringBuilder a12 = android.support.v4.media.a.a("No such package: ");
                a12.append(this.f28151a.getPackageName());
                Log.e("ContentValues", a12.toString(), e10);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", 2);
        }
    }

    public final d e(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28150f));
        f.a a10 = f.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.C0285b) a10).f28146a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a10.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                fVar = a10.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, fVar, d.a.OK, (a.C0284a) null);
    }

    public final f f(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f28150f));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.C0285b) a10).f28146a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a10.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C0285b bVar = (b.C0285b) a10;
        bVar.f28148c = f.b.OK;
        return bVar.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
