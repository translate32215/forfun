package e8;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.n6;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.r1;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zh;
import com.startapp.b4;
import d7.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w3 implements oh<r1, ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17208a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17209b;

    public w3() {
        this.f17208a = 6;
        this.f17209b = null;
    }

    public final p50 a(Object obj) {
        yq.h.b bVar;
        p50 h10;
        switch (this.f17208a) {
            case 0:
                d7 d7Var = new d7();
                ((r1) obj).M0((p3) this.f17209b, new v3(d7Var));
                return d7Var;
            case 1:
                t00 t00 = (t00) obj;
                for (u00 u00 : (List) t00.f16701b.f7136d) {
                    if (((Map) this.f17209b).containsKey(u00.f16838a)) {
                        ((we) ((Map) this.f17209b).get(u00.f16838a)).a(u00.f16839b);
                    }
                }
                return yh.h(t00);
            case 2:
                return ((n2) this.f17209b).b((JSONObject) obj);
            case 3:
                n6 n6Var = (n6) this.f17209b;
                Map map = (Map) obj;
                n6Var.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                synchronized (n6Var.f7528i) {
                                    int length = optJSONArray.length();
                                    synchronized (n6Var.f7528i) {
                                        bVar = n6Var.f7521b.get(str);
                                    }
                                    if (bVar == null) {
                                        String valueOf = String.valueOf(str);
                                        uc.d(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                                    } else {
                                        for (int i10 = 0; i10 < length; i10++) {
                                            String string = optJSONArray.getJSONObject(i10).getString("threat_type");
                                            if (bVar.f5971c) {
                                                bVar.n();
                                                bVar.f5971c = false;
                                            }
                                            yq.h.D((yq.h) bVar.f5970b, string);
                                        }
                                        n6Var.f7526g |= length > 0;
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        if (((Boolean) c1.f14074a.b()).booleanValue()) {
                            e.A("Failed to get SafeBrowsing metadata", e10);
                        }
                        return new ai.a(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (n6Var.f7526g) {
                    synchronized (n6Var.f7528i) {
                        yq.b bVar2 = n6Var.f7520a;
                        yq.g gVar = yq.g.OCTAGON_AD_SB_MATCH;
                        if (bVar2.f5971c) {
                            bVar2.n();
                            bVar2.f5971c = false;
                        }
                        yq.C((yq) bVar2.f5970b, gVar);
                    }
                }
                return n6Var.h();
            case 4:
                ((zh) this.f17209b).n((Throwable) obj);
                return yh.h(null);
            case 5:
                return ((ur) this.f17209b).a((l5) obj);
            case 6:
                Object obj2 = this.f17209b;
                e.v("Error during loading assets.", (Exception) obj);
                return yh.h(obj2);
            case 7:
                return yh.h(new t00(new ri(((kr) this.f17209b).f15323c), j8.f(new InputStreamReader((InputStream) obj))));
            case b4.f10106f:
                return ((cy) this.f17209b).a(l.B.f13186c.v((Bundle) obj));
            case 9:
                ld ldVar = (ld) this.f17209b;
                return yh.i(ldVar.v6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new f5(ldVar, (Uri) obj), ldVar.f7373f);
            case 10:
                Throwable th = (Throwable) obj;
                return yh.h(new ny(((py) this.f17209b).f16037c, 0));
            case 11:
                df dfVar = (df) this.f17209b;
                s10 s10 = (s10) obj;
                synchronized (dfVar) {
                    h10 = yh.h(new z10(s10, dfVar.f6202a));
                }
                return h10;
            default:
                return yh.h(((gf) this.f17209b).apply(obj));
        }
    }

    public w3(n2 n2Var) {
        this.f17208a = 2;
        this.f17209b = n2Var;
    }

    public w3(n6 n6Var) {
        this.f17208a = 3;
        this.f17209b = n6Var;
    }

    public w3(ld ldVar) {
        this.f17208a = 9;
        this.f17209b = ldVar;
    }

    public w3(df dfVar) {
        this.f17208a = 11;
        this.f17209b = dfVar;
    }

    public w3(gf gfVar) {
        this.f17208a = 12;
        this.f17209b = gfVar;
    }

    public w3(zh zhVar) {
        this.f17208a = 4;
        this.f17209b = zhVar;
    }

    public w3(kr krVar) {
        this.f17208a = 7;
        this.f17209b = krVar;
    }

    public w3(ur urVar) {
        this.f17208a = 5;
        this.f17209b = urVar;
    }

    public w3(cy cyVar) {
        this.f17208a = 8;
        this.f17209b = cyVar;
    }

    public w3(py pyVar) {
        this.f17208a = 10;
        this.f17209b = pyVar;
    }

    public w3(p3 p3Var) {
        this.f17208a = 0;
        this.f17209b = p3Var;
    }

    public w3(Map map) {
        this.f17208a = 1;
        this.f17209b = map;
    }
}
