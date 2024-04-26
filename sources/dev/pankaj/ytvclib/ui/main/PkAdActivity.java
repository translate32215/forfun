package dev.pankaj.ytvclib.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import com.startapp.startappsdk.R;
import f.i;
import kd.o;
import pc.l;
import sc.f;
import tc.c;
import ud.k;

/* compiled from: PkAdActivity.kt */
public final class PkAdActivity extends i {
    public c C;

    /* compiled from: PkAdActivity.kt */
    public static final class a extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context;
            if (str == null || webView == null || (context = webView.getContext()) == null) {
                return true;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding c10 = d.c(this, R.layout.activity_pk_ad);
        k.e(c10, "setContentView(this, R.layout.activity_pk_ad)");
        this.C = (c) c10;
        f c11 = l.g().c();
        o oVar = null;
        if (c11 != null) {
            c cVar = this.C;
            if (cVar != null) {
                WebView webView = cVar.f25893w;
                webView.loadData(k.j("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" />", c11.a().f().b()), "text/html", "UTF-8");
                webView.setBackgroundColor(0);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new a());
                l.g().k();
                oVar = o.f20627a;
            } else {
                k.l("binding");
                throw null;
            }
        }
        if (oVar == null) {
            finish();
        }
    }
}
