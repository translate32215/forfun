package d3;

import android.content.Context;
import com.airbnb.lottie.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import u2.d;
import u2.k;

/* compiled from: NetworkFetcher */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12960a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12961b;

    public c(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f12960a = str;
        if (str2 == null) {
            this.f12961b = null;
        } else {
            this.f12961b = new b(applicationContext);
        }
    }

    public final k<d> a() throws IOException {
        g3.c.f18423a.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f12960a).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    k<d> c10 = c(httpURLConnection);
                    V v10 = c10.f26011a;
                    g3.c.f18423a.getClass();
                    httpURLConnection.disconnect();
                    return c10;
                }
            }
            String b10 = b(httpURLConnection);
            return new k<>((Throwable) new IllegalArgumentException("Unable to fetch " + this.f12960a + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + b10));
        } catch (Exception e10) {
            return new k<>((Throwable) e10);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final String b(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                throw e10;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    public final k<d> c(HttpURLConnection httpURLConnection) throws IOException {
        k<d> kVar;
        a aVar;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            g3.c.f18423a.getClass();
            aVar = a.ZIP;
            b bVar = this.f12961b;
            if (bVar == null) {
                kVar = a.d(new ZipInputStream(httpURLConnection.getInputStream()), (String) null);
            } else {
                kVar = a.d(new ZipInputStream(new FileInputStream(bVar.c(this.f12960a, httpURLConnection.getInputStream(), aVar))), this.f12960a);
            }
        } else {
            g3.c.f18423a.getClass();
            aVar = a.JSON;
            b bVar2 = this.f12961b;
            if (bVar2 == null) {
                kVar = a.b(httpURLConnection.getInputStream(), (String) null);
            } else {
                kVar = a.b(new FileInputStream(new File(bVar2.c(this.f12960a, httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f12960a);
            }
        }
        b bVar3 = this.f12961b;
        if (!(bVar3 == null || kVar.f26011a == null)) {
            File file = new File(bVar3.b(), b.a(this.f12960a, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            g3.c.f18423a.getClass();
            if (!renameTo) {
                StringBuilder a10 = android.support.v4.media.a.a("Unable to rename cache file ");
                a10.append(file.getAbsolutePath());
                a10.append(" to ");
                a10.append(file2.getAbsolutePath());
                a10.append(".");
                g3.c.a(a10.toString());
            }
        }
        return kVar;
    }
}
