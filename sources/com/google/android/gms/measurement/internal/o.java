package com.google.android.gms.measurement.internal;

import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o8.c4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class o extends c4 {

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f8865c;

    public o(l lVar) {
        super(lVar);
        this.f8865c = Build.VERSION.SDK_INT < 19 ? new t(HttpsURLConnection.getDefaultSSLSocketFactory()) : null;
    }

    public final boolean j() {
        return false;
    }

    public final HttpURLConnection o(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f8865c;
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
}
