package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.sdk.omsdk.AdVerification;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import vb.a;
import vb.b;
import vb.d;
import vb.e;

/* compiled from: Sta */
public class q {
    public static boolean a(Context context) {
        try {
            if (t7.f12614a.f11633a) {
                return true;
            }
            t7.a(context);
            return true;
        } catch (Throwable th) {
            i4.a(th);
            return false;
        }
    }

    public static n b(WebView webView) {
        try {
            return a(webView);
        } catch (Throwable th) {
            i4.a(th);
            return null;
        }
    }

    public static n b(Context context, AdVerification adVerification, boolean z10) {
        try {
            return a(context, adVerification, z10);
        } catch (Throwable th) {
            i4.a(th);
            return null;
        }
    }

    public static n a(WebView webView) {
        if (!a(webView.getContext())) {
            return null;
        }
        se.a("Startio", "Name is null or empty");
        se.a("4.10.5", "Version is null or empty");
        return a(new p(new y7("Startio", "4.10.5"), webView, (String) null, (List<hc>) null, (String) null, "", a.HTML), false, false);
    }

    public static g6 b(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return g6.a(nVar);
        } catch (Throwable th) {
            i4.a(th);
            return null;
        }
    }

    public static n a(Context context, AdVerification adVerification, boolean z10) {
        URL url;
        if (!a(context)) {
            return null;
        }
        if (adVerification == null || adVerification.a() == null) {
            i4 i4Var = new i4(j4.f10588e);
            i4Var.f10537d = "OMSDK: Verification details can't be null!";
            i4Var.a();
            return null;
        }
        String a10 = u7.a();
        List<VerificationDetails> a11 = adVerification.a();
        ArrayList arrayList = new ArrayList(a11.size());
        for (VerificationDetails next : a11) {
            try {
                url = new URL(next.c());
            } catch (Throwable th) {
                i4.a(th);
                url = null;
            }
            if (url != null) {
                String a12 = next.a();
                String b10 = next.b();
                se.a(a12, "VendorKey is null or empty");
                se.a(b10, "VerificationParameters is null or empty");
                arrayList.add(new hc(a12, url, b10));
            }
        }
        se.a("Startio", "Name is null or empty");
        se.a("4.10.5", "Version is null or empty");
        y7 y7Var = new y7("Startio", "4.10.5");
        se.a((Object) a10, "OM SDK JS script content is null");
        return a(new p(y7Var, (WebView) null, a10, arrayList, (String) null, "", a.NATIVE), z10, true);
    }

    public static n a(p pVar, boolean z10, boolean z11) {
        e eVar;
        b bVar = z10 ? b.VIDEO : z11 ? b.NATIVE_DISPLAY : b.HTML_DISPLAY;
        d dVar = d.VIEWABLE;
        e eVar2 = e.NATIVE;
        if (z10) {
            eVar = eVar2;
        } else {
            eVar = e.NONE;
        }
        if (bVar != b.DEFINED_BY_JAVASCRIPT) {
            o oVar = new o(bVar, dVar, eVar2, eVar, false);
            if (t7.f12614a.f11633a) {
                return new rd(oVar, pVar);
            }
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public static k a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return k.a(nVar);
        } catch (Throwable th) {
            i4.a(th);
            return null;
        }
    }
}
