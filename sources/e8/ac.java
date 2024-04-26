package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.u7;
import d7.a;
import d7.h;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ac implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13671a;

    /* renamed from: b  reason: collision with root package name */
    public final tm f13672b;

    /* renamed from: c  reason: collision with root package name */
    public final f9 f13673c;

    /* renamed from: d  reason: collision with root package name */
    public final a f13674d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13675e;

    public ac(Context context, tm tmVar, f9 f9Var, a aVar, String str) {
        this.f13671a = context;
        this.f13672b = tmVar;
        this.f13673c = f9Var;
        this.f13674d = aVar;
        this.f13675e = str;
    }

    public final p50 a(Object obj) {
        Context context = this.f13671a;
        tm tmVar = this.f13672b;
        f9 f9Var = this.f13673c;
        a aVar = this.f13674d;
        String str = this.f13675e;
        u7 u7Var = l.B.f13187d;
        t7 a10 = u7.a(context, wc.a(), "", false, false, tmVar, (i0) null, f9Var, (h) null, aVar, new nv(), (qe) null, (re) null);
        m9 m9Var = new m9(a10);
        ((s7) a10.H()).f8095g = new bc(m9Var, 0);
        a10.loadUrl(str);
        return m9Var;
    }
}
