package o8;

import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.o;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f23549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f23550b;

    /* renamed from: c  reason: collision with root package name */
    public final v3 f23551c;

    public v4(o oVar, String str, URL url, v3 v3Var) {
        this.f23550b = oVar;
        i.e(str);
        this.f23549a = url;
        this.f23551c = v3Var;
    }

    public final void a(int i10, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f23550b.f8864a.b().r(new u4(this, i10, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.o r0 = r9.f23550b
            r0.g()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.o r2 = r9.f23550b     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            java.net.URL r3 = r9.f23549a     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            java.net.HttpURLConnection r2 = r2.o(r3)     // Catch:{ IOException -> 0x0068, all -> 0x005a }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            java.util.Map r4 = r2.getHeaderFields()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x003e }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x003c }
        L_0x0024:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x003c }
            if (r8 <= 0) goto L_0x002e
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x002e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x003c }
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
            r2.disconnect()
            r9.a(r3, r1, r0, r4)
            return
        L_0x003c:
            r0 = move-exception
            goto L_0x0040
        L_0x003e:
            r0 = move-exception
            r6 = r1
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0045:
            throw r0     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            goto L_0x005f
        L_0x0048:
            r0 = move-exception
            goto L_0x006d
        L_0x004a:
            r0 = move-exception
            r4 = r1
            goto L_0x005f
        L_0x004d:
            r0 = move-exception
            r4 = r1
            goto L_0x006d
        L_0x0050:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x005f
        L_0x0055:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L_0x006d
        L_0x005a:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.disconnect()
        L_0x0064:
            r9.a(r3, r1, r1, r4)
            throw r0
        L_0x0068:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.disconnect()
        L_0x0072:
            r9.a(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.v4.run():void");
    }
}
