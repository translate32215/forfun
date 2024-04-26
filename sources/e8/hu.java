package e8;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.i;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.yh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hu implements iu<fn> {

    /* renamed from: a  reason: collision with root package name */
    public final zm f14943a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f14944b;

    /* renamed from: c  reason: collision with root package name */
    public final ko f14945c;

    /* renamed from: d  reason: collision with root package name */
    public final ve<cp> f14946d;

    public hu(zm zmVar, o50 o50, ko koVar, ve<cp> veVar) {
        this.f14943a = zmVar;
        this.f14944b = o50;
        this.f14945c = koVar;
        this.f14946d = veVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        te teVar = qeVar.f7965r;
        return (teVar == null || teVar.f8195c == null) ? false : true;
    }

    public final p50<List<p50<fn>>> b(t00 t00, qe qeVar) {
        return yh.j(yh.j(this.f14946d.b(), new g5(this, qeVar), this.f14944b), new ih(this, t00, qeVar), this.f14944b);
    }

    public final p50<fn> c(t00 t00, qe qeVar, JSONObject jSONObject) {
        p50 p50;
        p50<V> p502;
        p50 p503;
        p50<cp> p504;
        p50 p505;
        p50<cp> p506;
        JSONArray jSONArray;
        p50<O> p507;
        char c10;
        p50<O> p508;
        JSONObject jSONObject2 = jSONObject;
        p50<cp> b10 = this.f14946d.b();
        ko koVar = this.f14945c;
        p50 i10 = koVar.f15310a.i(new mo(koVar, t00, qeVar, jSONObject2));
        no noVar = koVar.f15311b;
        noVar.getClass();
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        n1 n1Var = noVar.f15705h;
        p50<List<t>> a10 = noVar.a(optJSONArray, n1Var.f15572b, n1Var.f15574d);
        no noVar2 = koVar.f15311b;
        noVar2.getClass();
        p50<t> b11 = noVar2.b(jSONObject2.optJSONObject("secondary_image"), noVar2.f15705h.f15572b);
        no noVar3 = koVar.f15311b;
        noVar3.getClass();
        p50<t> b12 = noVar3.b(jSONObject2.optJSONObject("app_icon"), noVar3.f15705h.f15572b);
        no noVar4 = koVar.f15311b;
        noVar4.getClass();
        JSONObject optJSONObject = jSONObject2.optJSONObject("attribution");
        if (optJSONObject == null) {
            p50 = yh.h(null);
        } else {
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("images");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
            if (optJSONArray2 == null && optJSONObject2 != null) {
                optJSONArray2 = new JSONArray();
                optJSONArray2.put(optJSONObject2);
            }
            p50 = no.c(optJSONObject.optBoolean("require"), yh.i(noVar4.a(optJSONArray2, false, true), new f5(noVar4, optJSONObject), noVar4.f15704g));
        }
        no noVar5 = koVar.f15311b;
        noVar5.getClass();
        JSONObject d10 = i.d(jSONObject2, "html_containers", "instream");
        if (d10 == null) {
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("video");
            if (optJSONObject3 == null) {
                p502 = yh.h(null);
            } else if (TextUtils.isEmpty(optJSONObject3.optString("vast_xml"))) {
                e.K("Required field 'vast_xml' is missing");
                p502 = yh.h(null);
            } else {
                uo uoVar = noVar5.f15706i;
                uoVar.getClass();
                p502 = yh.k(yh.e(yh.j(yh.j(yh.h(null), new vo(uoVar), uoVar.f16978b), new h5(uoVar, optJSONObject3), uoVar.f16978b), (long) ((Integer) ti0.f16763j.f16769f.a(t.J1)).intValue(), TimeUnit.SECONDS, noVar5.f15707j), Exception.class, new w3(), h9.f14886f);
            }
        } else {
            uo uoVar2 = noVar5.f15706i;
            String optString = d10.optString("base_url");
            String optString2 = d10.optString("html");
            uoVar2.getClass();
            p50 j10 = yh.j(yh.h(null), new ih(uoVar2, optString, optString2), uoVar2.f16978b);
            p502 = yh.j(j10, new qo(j10, 0), h9.f14886f);
        }
        no noVar6 = koVar.f15311b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            p503 = yh.h(null);
        } else {
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject4 == null) {
                p503 = yh.h(null);
            } else {
                String optString3 = optJSONObject4.optString("omid_html");
                if (TextUtils.isEmpty(optString3)) {
                    p503 = yh.h(null);
                } else {
                    p503 = yh.j(yh.h(null), new h5(noVar6, optString3), h9.f14885e);
                }
            }
        }
        ro roVar = koVar.f15312c;
        roVar.getClass();
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("custom_assets");
        if (optJSONArray3 == null) {
            p504 = b10;
            p505 = yh.h(Collections.emptyList());
        } else {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray3.length();
            int i11 = 0;
            while (i11 < length) {
                int i12 = length;
                JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i11);
                if (optJSONObject5 != null) {
                    jSONArray = optJSONArray3;
                    String optString4 = optJSONObject5.optString("name");
                    if (optString4 != null) {
                        String optString5 = optJSONObject5.optString("type");
                        p506 = b10;
                        if ("string".equals(optString5)) {
                            c10 = 1;
                        } else {
                            c10 = "image".equals(optString5) ? (char) 2 : 0;
                        }
                        if (c10 == 1) {
                            p508 = yh.h(new to(optString4, optJSONObject5.optString("string_value")));
                        } else if (c10 == 2) {
                            no noVar7 = roVar.f16335b;
                            noVar7.getClass();
                            p508 = yh.i(noVar7.b(optJSONObject5.optJSONObject("image_value"), noVar7.f15705h.f15572b), new m7(optString4), roVar.f16334a);
                        }
                        p507 = p508;
                        arrayList.add(p507);
                        i11++;
                        length = i12;
                        optJSONArray3 = jSONArray;
                        b10 = p506;
                    } else {
                        p506 = b10;
                    }
                } else {
                    p506 = b10;
                    jSONArray = optJSONArray3;
                }
                p507 = yh.h(null);
                arrayList.add(p507);
                i11++;
                length = i12;
                optJSONArray3 = jSONArray;
                b10 = p506;
            }
            p504 = b10;
            p505 = yh.i(new j50(ug.A(arrayList)), so.f16504a, roVar.f16334a);
        }
        ug y10 = ug.y(new p50[]{i10, a10, b11, b12, p50, p502, p503, p505});
        p50 p509 = p50;
        lo loVar = r8;
        lo loVar2 = new lo(koVar, i10, a10, b12, b11, p509, jSONObject, p502, p503, p505);
        rh rhVar = new rh(y10, false, koVar.f15310a, loVar);
        return new rh(ug.y(new p50[]{p504, rhVar}), true, this.f14944b, new ku(this, (p50) rhVar, (p50) p504, t00, qeVar, jSONObject));
    }
}
