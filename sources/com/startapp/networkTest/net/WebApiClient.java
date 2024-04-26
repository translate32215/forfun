package com.startapp.networkTest.net;

import com.startapp.jd;
import com.startapp.kd;
import com.startapp.r5;
import com.startapp.x2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: Sta */
public abstract class WebApiClient {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11371a = "WebApiClient";

    /* renamed from: b  reason: collision with root package name */
    private static final int f11372b = 10000;

    /* compiled from: Sta */
    public enum RequestMethod {
        POST,
        GET,
        PUT,
        DELETE
    }

    /* compiled from: Sta */
    public class a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static kd a(RequestMethod requestMethod, String str) throws IOException {
        return a(requestMethod, str, (Object) null);
    }

    public static kd a(RequestMethod requestMethod, String str, Object obj) throws IOException {
        return a(requestMethod, str, obj, new jd[]{new jd("Content-Type", "application/json; charset=UTF-8"), new jd("Accept", "application/json")});
    }

    public static kd a(RequestMethod requestMethod, String str, Object obj, jd[] jdVarArr) throws IOException {
        return a(requestMethod, str, obj, jdVarArr, false);
    }

    public static kd a(RequestMethod requestMethod, String str, Object obj, jd[] jdVarArr, boolean z10) throws IOException {
        HttpsURLConnection httpsURLConnection;
        kd kdVar = new kd();
        URL url = new URL(str);
        URL url2 = new URL(str);
        if (!z10 || !url2.getProtocol().toLowerCase().equals("https")) {
            httpsURLConnection = (HttpURLConnection) url.openConnection();
        } else {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
            a(httpsURLConnection2);
            httpsURLConnection2.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            httpsURLConnection = httpsURLConnection2;
        }
        httpsURLConnection.setRequestMethod(requestMethod.toString());
        if (jdVarArr != null) {
            for (jd jdVar : jdVarArr) {
                httpsURLConnection.setRequestProperty(jdVar.f10737a, jdVar.f10738b);
            }
        }
        httpsURLConnection.setConnectTimeout(f11372b);
        httpsURLConnection.setReadTimeout(f11372b);
        if (obj != null) {
            if (requestMethod.equals(RequestMethod.GET) || requestMethod.equals(RequestMethod.DELETE)) {
                throw new IOException("GET and DELETE does not support a body");
            }
            httpsURLConnection.setDoOutput(true);
            String a10 = r5.a(obj);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(a10.getBytes());
            outputStream.flush();
            outputStream.close();
        }
        kdVar.f10804a = httpsURLConnection.getResponseCode();
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            x2.a(th);
        }
        httpsURLConnection.disconnect();
        kdVar.f10805b = sb2.toString();
        return kdVar;
    }

    private static void a(HttpsURLConnection httpsURLConnection) {
        TrustManager[] trustManagerArr = {new a()};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
        } catch (Throwable th) {
            x2.a(th);
        }
    }
}
