package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d8 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f6189a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d8(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.f6189a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d8.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() throws IOException {
        super.close();
        this.f6189a.disconnect();
    }
}
