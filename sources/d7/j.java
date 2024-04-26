package d7;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.internal.ads.rx;
import e8.o60;
import e8.ti0;
import e8.y8;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13182a;

    public j(c cVar) {
        this.f13182a = cVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        rx rxVar = this.f13182a.f5601g;
        if (rxVar != null) {
            try {
                rxVar.h0(0);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = 0;
        if (str.startsWith(this.f13182a.t6())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            rx rxVar = this.f13182a.f5601g;
            if (rxVar != null) {
                try {
                    rxVar.h0(3);
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                }
            }
            this.f13182a.s6(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            rx rxVar2 = this.f13182a.f5601g;
            if (rxVar2 != null) {
                try {
                    rxVar2.h0(0);
                } catch (RemoteException e11) {
                    e.F("#007 Could not call remote method.", e11);
                }
            }
            this.f13182a.s6(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            rx rxVar3 = this.f13182a.f5601g;
            if (rxVar3 != null) {
                try {
                    rxVar3.v();
                } catch (RemoteException e12) {
                    e.F("#007 Could not call remote method.", e12);
                }
            }
            c cVar = this.f13182a;
            cVar.getClass();
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    y8 y8Var = ti0.f16763j.f16764a;
                    i10 = y8.g(cVar.f5598d, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            this.f13182a.s6(i10);
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            rx rxVar4 = this.f13182a.f5601g;
            if (rxVar4 != null) {
                try {
                    rxVar4.J();
                } catch (RemoteException e13) {
                    e.F("#007 Could not call remote method.", e13);
                }
            }
            c cVar2 = this.f13182a;
            if (cVar2.f5602h != null) {
                Uri parse = Uri.parse(str);
                try {
                    parse = cVar2.f5602h.a(parse, cVar2.f5598d, (View) null, (Activity) null);
                } catch (o60 e14) {
                    e.D("Unable to process ad data", e14);
                }
                str = parse.toString();
            }
            c cVar3 = this.f13182a;
            cVar3.getClass();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            cVar3.f5598d.startActivity(intent);
            return true;
        }
    }
}
