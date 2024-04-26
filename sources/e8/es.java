package e8;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import c8.a;
import c8.b;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.qe;
import f7.f0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l0.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class es implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14505a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14506b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14507c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14508d;

    public es(ld ldVar, Uri uri, a aVar) {
        this.f14506b = ldVar;
        this.f14507c = uri;
        this.f14508d = aVar;
    }

    public final Object call() {
        String str = "";
        switch (this.f14505a) {
            case 0:
                return new js((ns) ((p50) this.f14506b).get(), (JSONObject) ((p50) this.f14507c).get(), (e7) ((p50) this.f14508d).get());
            case 1:
                cs csVar = (cs) this.f14508d;
                p50 p50 = (p50) this.f14506b;
                csVar.getClass();
                String str2 = ((e7) p50.get()).f14378i;
                csVar.f14188f.put(str2, new ks((e7) p50.get(), (JSONObject) ((p50) this.f14507c).get()));
                return new ByteArrayInputStream(str2.getBytes(h40.f14846a));
            case 2:
                cu cuVar = (cu) this.f14506b;
                t00 t00 = (t00) this.f14507c;
                qe qeVar = (qe) this.f14508d;
                ug ugVar = cuVar.f14190a.a(new j8(t00, qeVar, (String) null), new p9(((w00) t00.f16700a.f8042b).a(), (Runnable) new f0(cuVar, t00, qeVar))).f13694m.get();
                jc0.b(ugVar, "Cannot return null from a non-@Nullable @Provides method");
                return ugVar;
            case 3:
                ld ldVar = (ld) this.f14506b;
                List<Uri> list = (List) this.f14507c;
                a aVar = (a) this.f14508d;
                c40 c40 = ldVar.f7370c.f8207b;
                if (c40 != null) {
                    str = c40.d(ldVar.f7369b, (View) b.z0(aVar), (Activity) null);
                }
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    for (Uri uri : list) {
                        if (!ld.t6(uri, ld.f7366u, ld.f7367v)) {
                            String valueOf = String.valueOf(uri);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                            sb2.append("Not a Google URL: ");
                            sb2.append(valueOf);
                            e.K(sb2.toString());
                            arrayList.add(uri);
                        } else {
                            arrayList.add(ld.s6(uri, "ms", str));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new Exception("Empty impression URLs result.");
                }
                throw new Exception("Failed to get view signals.");
            default:
                ld ldVar2 = (ld) this.f14506b;
                Uri uri2 = (Uri) this.f14507c;
                a aVar2 = (a) this.f14508d;
                ldVar2.getClass();
                try {
                    uri2 = ldVar2.f7370c.a(uri2, ldVar2.f7369b, (View) b.z0(aVar2), (Activity) null);
                } catch (o60 e10) {
                    e.D(str, e10);
                }
                if (uri2.getQueryParameter("ms") != null) {
                    return uri2;
                }
                throw new Exception("Failed to append spam signals to click url.");
        }
    }

    public es(ld ldVar, List list, a aVar) {
        this.f14506b = ldVar;
        this.f14507c = list;
        this.f14508d = aVar;
    }

    public es(cs csVar, p50 p50, p50 p502) {
        this.f14508d = csVar;
        this.f14506b = p50;
        this.f14507c = p502;
    }

    public es(cu cuVar, t00 t00, qe qeVar) {
        this.f14506b = cuVar;
        this.f14507c = t00;
        this.f14508d = qeVar;
    }

    public es(p50 p50, p50 p502, p50 p503) {
        this.f14506b = p50;
        this.f14507c = p502;
        this.f14508d = p503;
    }
}
