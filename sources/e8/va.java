package e8;

import android.util.Log;
import com.google.android.gms.internal.ads.i4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class va {
    public static qe0 a(wi0 wi0) {
        long j10;
        long j11;
        boolean z10;
        long j12;
        long j13;
        long j14;
        wi0 wi02 = wi0;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = wi02.f17365c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long c10 = str != null ? c(str) : 0;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i11 = 0;
            j11 = 0;
            j10 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j11 = 0;
            j10 = 0;
        }
        String str3 = map.get("Expires");
        long c11 = str3 != null ? c(str3) : 0;
        String str4 = map.get("Last-Modified");
        long c12 = str4 != null ? c(str4) : 0;
        String str5 = map.get("ETag");
        if (z10) {
            j13 = currentTimeMillis + (j11 * 1000);
            if (i10 != 0) {
                j14 = j13;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (c10 <= 0 || c11 < c10) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (c11 - c10);
                j12 = j13;
            }
        }
        qe0 qe0 = new qe0();
        qe0.f16146a = wi02.f17364b;
        qe0.f16147b = str5;
        qe0.f16151f = j13;
        qe0.f16150e = j12;
        qe0.f16148c = c10;
        qe0.f16149d = c12;
        qe0.f16152g = map;
        qe0.f16153h = wi02.f17366d;
        return qe0;
    }

    public static String b(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(j10));
    }

    public static long c(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                i4.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            Log.e("Volley", i4.d("Unable to parse dateStr: %s, falling back to 0", str), e10);
            return 0;
        }
    }
}
