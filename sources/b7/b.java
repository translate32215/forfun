package b7;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f3650a;

    public b(Map map) {
        this.f3650a = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Map map = this.f3650a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e10) {
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e10);
        } catch (IOException | RuntimeException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message2).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(uri);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e11);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
