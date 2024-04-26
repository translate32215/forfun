package f0;

import a5.d;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.Surface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import c5.j;
import com.startapp.b4;
import d5.x;
import dev.pankaj.ytvclib.data.model.Stream;
import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import f0.g;
import f6.b;
import java.util.Map;
import ra.a;
import v6.e0;
import w6.s;
import xc.e;
import z4.k;
import z5.x;
import z5.y;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18057a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18058b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f18059c;

    public /* synthetic */ i(j.a aVar, j jVar) {
        this.f18058b = aVar;
        this.f18059c = jVar;
    }

    public /* synthetic */ i(PlayerActivity playerActivity, WebResourceRequest webResourceRequest) {
        this.f18058b = playerActivity;
        this.f18059c = webResourceRequest;
    }

    public /* synthetic */ i(g.f fVar, Typeface typeface) {
        this.f18058b = fVar;
        this.f18059c = typeface;
    }

    public /* synthetic */ i(b.a aVar, Uri uri) {
        this.f18058b = aVar;
        this.f18059c = uri;
    }

    public /* synthetic */ i(String str, ControlActivity controlActivity) {
        this.f18058b = str;
        this.f18059c = controlActivity;
    }

    public /* synthetic */ i(Map.Entry entry, a aVar) {
        this.f18058b = entry;
        this.f18059c = aVar;
    }

    public /* synthetic */ i(s.a aVar, d dVar) {
        this.f18058b = aVar;
        this.f18059c = dVar;
    }

    public /* synthetic */ i(s.a aVar, Surface surface) {
        this.f18058b = aVar;
        this.f18059c = surface;
    }

    public /* synthetic */ i(k.a aVar, d dVar) {
        this.f18058b = aVar;
        this.f18059c = dVar;
    }

    public /* synthetic */ i(k.a aVar, String str) {
        this.f18058b = aVar;
        this.f18059c = str;
    }

    public /* synthetic */ i(x xVar, d5.x xVar2) {
        this.f18058b = xVar;
        this.f18059c = xVar2;
    }

    public final void run() {
        d5.x xVar;
        boolean z10 = false;
        switch (this.f18057a) {
            case 0:
                ((g.f) this.f18058b).e((Typeface) this.f18059c);
                return;
            case 1:
                k kVar = ((k.a) this.f18058b).f28366b;
                int i10 = e0.f26436a;
                kVar.K((String) this.f18059c);
                return;
            case 2:
                k kVar2 = ((k.a) this.f18058b).f28366b;
                int i11 = e0.f26436a;
                kVar2.d((d) this.f18059c);
                return;
            case 3:
                j.a aVar = (j.a) this.f18058b;
                ((j) this.f18059c).E(aVar.f4330a, aVar.f4331b);
                return;
            case 4:
                x xVar2 = (x) this.f18058b;
                d5.x xVar3 = (d5.x) this.f18059c;
                if (xVar2.f28673z == null) {
                    xVar = xVar3;
                } else {
                    xVar = new x.b(-9223372036854775807L, 0);
                }
                xVar2.G = xVar;
                xVar2.H = xVar3.c();
                int i12 = 1;
                if (xVar2.N == -1 && xVar3.c() == -9223372036854775807L) {
                    z10 = true;
                }
                xVar2.I = z10;
                if (z10) {
                    i12 = 7;
                }
                xVar2.J = i12;
                ((y) xVar2.f28662g).y(xVar2.H, xVar3.b(), xVar2.I);
                if (!xVar2.D) {
                    xVar2.u();
                    return;
                }
                return;
            case 5:
                b.a aVar2 = (b.a) this.f18058b;
                aVar2.f18152i = false;
                aVar2.b((Uri) this.f18059c);
                return;
            case 6:
                s sVar = ((s.a) this.f18058b).f27133b;
                int i13 = e0.f26436a;
                sVar.G((Surface) this.f18059c);
                return;
            case 7:
                s sVar2 = ((s.a) this.f18058b).f27133b;
                int i14 = e0.f26436a;
                sVar2.z((d) this.f18059c);
                return;
            case b4.f10106f:
                ((ra.b) ((Map.Entry) this.f18058b).getKey()).a((a) this.f18059c);
                return;
            case 9:
                ControlActivity controlActivity = (ControlActivity) this.f18059c;
                int i15 = wc.a.f27182b;
                ud.k.f(controlActivity, "this$0");
                ud.k.f("Get media duration failed, retry later.Duration:" + ((String) this.f18058b) + "intLength:" + controlActivity.K, "msg");
                synchronized (controlActivity) {
                    new wc.a(controlActivity).start();
                }
                return;
            default:
                PlayerActivity playerActivity = (PlayerActivity) this.f18058b;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f18059c;
                int i16 = e.f27931d;
                ud.k.f(playerActivity, "this$0");
                playerActivity.M(false);
                String uri = webResourceRequest.getUrl().toString();
                ud.k.e(uri, "request.url.toString()");
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                ud.k.e(requestHeaders, "request.requestHeaders");
                playerActivity.U(new Stream("", uri, 1, "", requestHeaders));
                WebView webView = playerActivity.f13452m0;
                if (webView != null) {
                    webView.stopLoading();
                }
                WebView webView2 = playerActivity.f13452m0;
                if (webView2 != null) {
                    webView2.destroy();
                }
                playerActivity.f13452m0 = null;
                return;
        }
    }
}
