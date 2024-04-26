package e8;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import d7.l;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3<t7> f16061a = p2.f15864a;

    /* renamed from: b  reason: collision with root package name */
    public static final f3<t7> f16062b = s2.f16368a;

    /* renamed from: c  reason: collision with root package name */
    public static final f3<t7> f16063c = r2.f16224a;

    /* renamed from: d  reason: collision with root package name */
    public static final f3<t7> f16064d = u2.f16841a;

    /* renamed from: e  reason: collision with root package name */
    public static final f3<t7> f16065e = new v2();

    /* renamed from: f  reason: collision with root package name */
    public static final f3<t7> f16066f = new x2();

    /* renamed from: g  reason: collision with root package name */
    public static final f3<t7> f16067g = t2.f16703a;

    /* renamed from: h  reason: collision with root package name */
    public static final f3<Object> f16068h = new a3();

    /* renamed from: i  reason: collision with root package name */
    public static final f3<t7> f16069i = new z2();

    /* renamed from: j  reason: collision with root package name */
    public static final f3<t7> f16070j = w2.f17204a;

    /* renamed from: k  reason: collision with root package name */
    public static final f3<t7> f16071k = new c3();

    /* renamed from: l  reason: collision with root package name */
    public static final f3<t7> f16072l = new b3();

    /* renamed from: m  reason: collision with root package name */
    public static final f3<ia> f16073m = new xa();

    /* renamed from: n  reason: collision with root package name */
    public static final f3<ia> f16074n = new ab();

    /* renamed from: o  reason: collision with root package name */
    public static final f3<t7> f16075o = new o2();

    /* renamed from: p  reason: collision with root package name */
    public static final q1 f16076p = new q1();

    /* renamed from: q  reason: collision with root package name */
    public static final f3<t7> f16077q = new e3();

    /* renamed from: r  reason: collision with root package name */
    public static final f3<t7> f16078r = new d3();

    /* renamed from: s  reason: collision with root package name */
    public static final f3<t7> f16079s = new g3();

    /* renamed from: t  reason: collision with root package name */
    public static final f3<t7> f16080t = new y2();

    public static <T extends lc & qc & rc> String a(T t10, String str) {
        Uri parse = Uri.parse(str);
        try {
            tm s10 = ((qc) t10).s();
            if (s10 != null && s10.c(parse)) {
                parse = s10.a(parse, t10.getContext(), ((rc) t10).getView(), t10.b());
            }
        } catch (o60 unused) {
            e.K(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        Context context = t10.getContext();
        if (!l.B.f13207x.p(context)) {
            return parse.toString();
        }
        String j10 = l.B.f13207x.j(context);
        if (j10 == null) {
            return parse.toString();
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.U)).booleanValue()) {
            String str2 = (String) ti0.f16763j.f16769f.a(t.V);
            String uri = parse.toString();
            if (uri.contains(str2)) {
                l.B.f13207x.c(context, "_ac", j10, (Bundle) null);
                return n8.b(uri, context).replace(str2, j10);
            }
        } else if (TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
            String uri2 = n8.a(n8.b(parse.toString(), context), "fbs_aeid", j10).toString();
            l.B.f13207x.c(context, "_ac", j10, (Bundle) null);
            return uri2;
        }
        return parse.toString();
    }
}
