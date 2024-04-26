package e8;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.leanback.widget.s;
import com.google.android.gms.ads.internal.util.p;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n8 {
    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = indexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
        s.a(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static String b(String str, Context context) {
        String h10 = l.B.f13207x.h(context);
        String i10 = l.B.f13207x.i(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(h10)) {
            str = a(str, "gmp_app_id", h10).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(i10)) ? str : a(str, "fbs_aiid", i10).toString();
    }

    public static String c(String str, Context context, boolean z10) {
        String j10;
        if ((((Boolean) ti0.f16763j.f16769f.a(t.f16555c0)).booleanValue() && !z10) || !l.B.f13207x.p(context) || TextUtils.isEmpty(str) || (j10 = l.B.f13207x.j(context)) == null) {
            return str;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.U)).booleanValue()) {
            String str2 = (String) ti0.f16763j.f16769f.a(t.V);
            if (!str.contains(str2)) {
                return str;
            }
            if (p.k(str, l.B.f13186c.f5703a, (String) ti0.f16763j.f16769f.a(t.S))) {
                l.B.f13207x.c(context, "_ac", j10, (Bundle) null);
                return b(str, context).replace(str2, j10);
            }
            if (!p.k(str, l.B.f13186c.f5704b, (String) ti0.f16763j.f16769f.a(t.T))) {
                return str;
            }
            l.B.f13207x.c(context, "_ai", j10, (Bundle) null);
            return b(str, context).replace(str2, j10);
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (p.k(str, l.B.f13186c.f5703a, (String) ti0.f16763j.f16769f.a(t.S))) {
                l.B.f13207x.c(context, "_ac", j10, (Bundle) null);
                return a(b(str, context), "fbs_aeid", j10).toString();
            }
            if (!p.k(str, l.B.f13186c.f5704b, (String) ti0.f16763j.f16769f.a(t.T))) {
                return str;
            }
            l.B.f13207x.c(context, "_ai", j10, (Bundle) null);
            return a(b(str, context), "fbs_aeid", j10).toString();
        }
    }
}
