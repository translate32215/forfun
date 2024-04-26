package e8;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.internal.ads.k;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.v7;
import d7.a;
import d7.h;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class cc implements n40 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14104a;

    /* renamed from: b  reason: collision with root package name */
    public final wc f14105b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14106c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14107d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14108e;

    /* renamed from: f  reason: collision with root package name */
    public final tm f14109f;

    /* renamed from: g  reason: collision with root package name */
    public final i0 f14110g;

    /* renamed from: h  reason: collision with root package name */
    public final f9 f14111h;

    /* renamed from: i  reason: collision with root package name */
    public final h f14112i;

    /* renamed from: r  reason: collision with root package name */
    public final a f14113r;

    /* renamed from: s  reason: collision with root package name */
    public final nv f14114s;

    /* renamed from: t  reason: collision with root package name */
    public final qe f14115t;

    /* renamed from: u  reason: collision with root package name */
    public final re f14116u;

    public cc(Context context, wc wcVar, String str, boolean z10, boolean z11, tm tmVar, i0 i0Var, f9 f9Var, h hVar, a aVar, nv nvVar, qe qeVar, re reVar) {
        this.f14104a = context;
        this.f14105b = wcVar;
        this.f14106c = str;
        this.f14107d = z10;
        this.f14108e = z11;
        this.f14109f = tmVar;
        this.f14110g = i0Var;
        this.f14111h = f9Var;
        this.f14112i = hVar;
        this.f14113r = aVar;
        this.f14114s = nvVar;
        this.f14115t = qeVar;
        this.f14116u = reVar;
    }

    public final Object get() {
        Context context = this.f14104a;
        wc wcVar = this.f14105b;
        String str = this.f14106c;
        boolean z10 = this.f14107d;
        boolean z11 = this.f14108e;
        tm tmVar = this.f14109f;
        i0 i0Var = this.f14110g;
        f9 f9Var = this.f14111h;
        h hVar = this.f14112i;
        a aVar = this.f14113r;
        nv nvVar = this.f14114s;
        qe qeVar = this.f14115t;
        re reVar = this.f14116u;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = v7.f8308k0;
            dc dcVar = new dc(new v7(new xc(context), wcVar, str, z10, tmVar, i0Var, f9Var, (k) null, hVar, aVar, nvVar, qeVar, reVar));
            dcVar.setWebViewClient(l.B.f13188e.f(dcVar, nvVar, z11));
            dcVar.setWebChromeClient(new rb(dcVar));
            return dcVar;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
