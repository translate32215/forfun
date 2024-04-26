package z3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import d7.l;
import e7.c;
import e7.p;
import e8.t;
import e8.ti0;
import l0.e;

/* compiled from: ApplicationLifecycle */
public class b implements k {
    public b(int i10) {
    }

    public static boolean c(Context context, Intent intent, p pVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            e.H(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.util.p pVar2 = l.B.f13186c;
            com.google.android.gms.ads.internal.util.p.e(context, intent);
            if (pVar == null) {
                return true;
            }
            pVar.g();
            return true;
        } catch (ActivityNotFoundException e10) {
            e.K(e10.getMessage());
            return false;
        }
    }

    public static boolean d(Context context, c cVar, p pVar) {
        int i10 = 0;
        if (cVar == null) {
            e.K("No intent data for launcher overlay.");
            return false;
        }
        t.a(context);
        Intent intent = cVar.f13635h;
        if (intent != null) {
            return c(context, intent, pVar);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(cVar.f13629b)) {
            e.K("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(cVar.f13630c)) {
            intent2.setDataAndType(Uri.parse(cVar.f13629b), cVar.f13630c);
        } else {
            intent2.setData(Uri.parse(cVar.f13629b));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cVar.f13631d)) {
            intent2.setPackage(cVar.f13631d);
        }
        if (!TextUtils.isEmpty(cVar.f13632e)) {
            String[] split = cVar.f13632e.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(cVar.f13632e);
                e.K(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = cVar.f13633f;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                e.K("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16611l2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16605k2)).booleanValue()) {
                com.google.android.gms.ads.internal.util.p pVar2 = l.B.f13186c;
                com.google.android.gms.ads.internal.util.p.p(context, intent2);
            }
        }
        return c(context, intent2, pVar);
    }

    public void a(l lVar) {
    }

    public void b(l lVar) {
        lVar.v0();
    }
}
