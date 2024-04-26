package e8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import l0.e;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rb extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final t7 f16261a;

    public rb(t7 t7Var) {
        this.f16261a = t7Var;
    }

    public static Context a(WebView webView) {
        if (!(webView instanceof t7)) {
            return webView.getContext();
        }
        t7 t7Var = (t7) webView;
        Activity b10 = t7Var.b();
        if (b10 != null) {
            return b10;
        }
        return t7Var.getContext();
    }

    public final boolean b(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        a aVar;
        try {
            t7 t7Var = this.f16261a;
            if (t7Var == null || t7Var.H() == null || ((s7) this.f16261a.H()).f8105y == null || (aVar = ((s7) this.f16261a.H()).f8105y) == null || aVar.c()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z10) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new xb(jsPromptResult, editText)).setNegativeButton(17039360, new ub(jsPromptResult)).setOnCancelListener(new vb(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new sb(jsResult)).setNegativeButton(17039360, new tb(jsResult)).setOnCancelListener(new qb(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb2.append("window.");
            sb2.append(str);
            sb2.append("('");
            sb2.append(str3);
            sb2.append("')");
            aVar.a(sb2.toString());
            return false;
        } catch (WindowManager.BadTokenException e10) {
            e.D("Fail to display Dialog.", e10);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof t7)) {
            e.K("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.a K = ((t7) webView).K();
        if (K == null) {
            e.K("Tried to close an AdWebView not associated with an overlay.");
        } else {
            K.s6();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder a10 = j4.e.a(o.a(sourceId, o.a(message, 19)), "JS: ", message, " (", sourceId);
        a10.append(":");
        a10.append(lineNumber);
        a10.append(")");
        String sb2 = a10.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = wb.f17235a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            e.I(sb2);
        } else if (i10 == 2) {
            e.K(sb2);
        } else if (i10 == 3 || i10 == 4) {
            e.J(sb2);
        } else if (i10 != 5) {
            e.J(sb2);
        } else {
            e.E(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f16261a.f0() != null) {
            webView2.setWebViewClient(this.f16261a.f0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 != 0) {
            if (j11 == 0) {
                j10 = Math.min(Math.min(131072, j13) + j10, 1048576);
            } else if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        } else if (j11 > j13 || j11 > 1048576) {
            j11 = 0;
        }
        quotaUpdater.updateQuota(j11);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            p pVar = l.B.f13186c;
            if (!p.G(this.f16261a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                p pVar2 = l.B.f13186c;
                if (!p.G(this.f16261a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.a K = this.f16261a.K();
        if (K == null) {
            e.K("Could not get ad overlay when hiding custom view.");
        } else {
            K.y6();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return b(a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return b(a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.a K = this.f16261a.K();
        if (K == null) {
            e.K("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(K.f5625b);
        K.f5631h = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        K.f5631h.addView(view, -1, -1);
        K.f5625b.setContentView(K.f5631h);
        K.f5641z = true;
        K.f5632i = customViewCallback;
        K.f5630g = true;
        K.t6(i10);
    }
}
