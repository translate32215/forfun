package e8;

import com.google.android.gms.internal.ads.b7;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class c9 implements a9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14097a;

    public c9() {
        this.f14097a = null;
    }

    public final void c(String str) {
        HttpURLConnection httpURLConnection;
        try {
            String valueOf = String.valueOf(str);
            e.E(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            y8 y8Var = ti0.f16763j.f16764a;
            String str2 = this.f14097a;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(60000);
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setUseCaches(false);
            b7 b7Var = new b7((String) null);
            b7Var.e(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            b7Var.d(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(str);
                e.K(sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e10) {
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            e.K(sb3.toString());
        } catch (IOException | RuntimeException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            e.K(sb4.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public c9(String str) {
        this.f14097a = str;
    }
}
