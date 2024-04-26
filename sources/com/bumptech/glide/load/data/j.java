package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import g4.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import q3.f;

/* compiled from: HttpUrlFetcher */
public class j implements d<InputStream> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f4981f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final f f4982a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4983b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f4984c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f4985d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4986e;

    /* compiled from: HttpUrlFetcher */
    public static class a implements b {
    }

    /* compiled from: HttpUrlFetcher */
    public interface b {
    }

    public j(f fVar, int i10) {
        this.f4982a = fVar;
        this.f4983b = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f4985d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4984c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4984c = null;
    }

    public void cancel() {
        this.f4986e = true;
    }

    public final InputStream d(URL url, int i10, URL url2, Map<String, String> map) throws k3.b {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new k3.b("In re-direct loop", -1, (Throwable) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f4983b);
                httpURLConnection.setReadTimeout(this.f4983b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f4984c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f4985d = this.f4984c.getInputStream();
                    if (this.f4986e) {
                        return null;
                    }
                    int c10 = c(this.f4984c);
                    int i11 = c10 / 100;
                    if (i11 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f4984c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f4985d = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f4985d = httpURLConnection2.getInputStream();
                            }
                            return this.f4985d;
                        } catch (IOException e10) {
                            throw new k3.b("Failed to obtain InputStream", c(httpURLConnection2), e10);
                        }
                    } else {
                        if (i11 == 3) {
                            String headerField = this.f4984c.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return d(url3, i10 + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new k3.b(j.f.a("Bad redirect url: ", headerField), c10, e11);
                                }
                            } else {
                                throw new k3.b("Received empty or null redirect url", c10, (Throwable) null);
                            }
                        } else if (c10 == -1) {
                            throw new k3.b(c10, 0);
                        } else {
                            try {
                                throw new k3.b(this.f4984c.getResponseMessage(), c10, (Throwable) null);
                            } catch (IOException e12) {
                                throw new k3.b("Failed to get a response message", c10, e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    throw new k3.b("Failed to connect or obtain data", c(this.f4984c), e13);
                }
            } catch (IOException e14) {
                throw new k3.b("URL.openConnection threw", 0, e14);
            }
        } else {
            throw new k3.b("Too many (> 5) redirects!", -1, (Throwable) null);
        }
    }

    public com.bumptech.glide.load.a e() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    public void f(com.bumptech.glide.f fVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        int i10 = g4.f.f18457b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(d(this.f4982a.d(), 0, (URL) null, this.f4982a.f24081b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(g4.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder a10 = android.support.v4.media.a.a("Finished http url fetcher fetch in ");
                a10.append(g4.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", a10.toString());
            }
            throw th;
        }
    }
}
