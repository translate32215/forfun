package d7;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.internal.ads.tm;
import e.g;
import e8.n0;
import e8.o60;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13183a;

    public k(c cVar, j jVar) {
        this.f13183a = cVar;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            c cVar = this.f13183a;
            cVar.f5602h = cVar.f5597c.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e.D("", e10);
        }
        c cVar2 = this.f13183a;
        cVar2.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) n0.f15570d.b());
        builder.appendQueryParameter("query", cVar2.f5599e.f13213d);
        builder.appendQueryParameter("pubId", cVar2.f5599e.f13211b);
        Map map = cVar2.f5599e.f13212c;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, (String) map.get(str));
        }
        Uri build = builder.build();
        tm tmVar = cVar2.f5602h;
        if (tmVar != null) {
            try {
                build = tmVar.b(build, tmVar.f8207b.c(cVar2.f5598d));
            } catch (o60 e11) {
                e.D("Unable to process ad data", e11);
            }
        }
        String t62 = cVar2.t6();
        String encodedQuery = build.getEncodedQuery();
        return g.a(o.a(encodedQuery, o.a(t62, 1)), t62, "#", encodedQuery);
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f13183a.f5600f;
        if (webView != null && str != null) {
            webView.loadUrl(str);
        }
    }
}
