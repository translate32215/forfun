package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o8.r5;
import o8.u5;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class i extends r5 {

    /* renamed from: d  reason: collision with root package name */
    public final SSLSocketFactory f8806d;

    public i(u5 u5Var) {
        super(u5Var);
        this.f8806d = Build.VERSION.SDK_INT < 19 ? new t(HttpsURLConnection.getDefaultSSLSocketFactory()) : null;
    }

    public final boolean k() {
        return false;
    }

    public final HttpURLConnection l(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f8806d;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            this.f8864a.getClass();
            httpURLConnection.setConnectTimeout(60000);
            this.f8864a.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    public final boolean m() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8864a.f8837a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
