package e8;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.tm;
import java.util.ArrayList;
import java.util.List;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d30 {

    /* renamed from: a  reason: collision with root package name */
    public final qu f14209a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14210b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14211c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14212d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f14213e;

    /* renamed from: f  reason: collision with root package name */
    public final v00 f14214f;

    /* renamed from: g  reason: collision with root package name */
    public final b f14215g;

    /* renamed from: h  reason: collision with root package name */
    public final tm f14216h;

    public d30(qu quVar, f9 f9Var, String str, String str2, Context context, v00 v00, b bVar, tm tmVar) {
        this.f14209a = quVar;
        this.f14210b = f9Var.f14544a;
        this.f14211c = str;
        this.f14212d = str2;
        this.f14213e = context;
        this.f14214f = v00;
        this.f14215g = bVar;
        this.f14216h = tmVar;
    }

    public static String c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List<String> a(t00 t00, qe qeVar, List<String> list) {
        return b(t00, qeVar, false, "", "", list);
    }

    public final List<String> b(t00 t00, qe qeVar, boolean z10, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z10 ? "1" : "0";
        for (String c10 : list) {
            String c11 = c(c(c(c10, "@gw_adlocid@", ((w00) t00.f16700a.f8042b).f17192f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f14210b);
            if (qeVar != null) {
                c11 = n8.c(c(c(c(c11, "@gw_qdata@", qeVar.f7971x), "@gw_adnetid@", qeVar.f7970w), "@gw_allocid@", qeVar.f7969v), this.f14213e, qeVar.Q);
            }
            String c12 = c(c(c(c11, "@gw_adnetstatus@", TextUtils.join("_", this.f14209a.f16206c)), "@gw_seqnum@", this.f14211c), "@gw_sessid@", this.f14212d);
            boolean z11 = ((Boolean) ti0.f16763j.f16769f.a(t.C1)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z11 || isEmpty) {
                if (this.f14216h.c(Uri.parse(c12))) {
                    Uri.Builder buildUpon = Uri.parse(c12).buildUpon();
                    if (z11) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    c12 = buildUpon.build().toString();
                }
            }
            arrayList.add(c12);
        }
        return arrayList;
    }
}
