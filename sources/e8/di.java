package e8;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.l5;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class di {

    /* renamed from: a  reason: collision with root package name */
    public final n20 f14278a;

    /* renamed from: b  reason: collision with root package name */
    public final f9 f14279b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f14280c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14281d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f14282e;

    /* renamed from: f  reason: collision with root package name */
    public final PackageInfo f14283f;

    /* renamed from: g  reason: collision with root package name */
    public final pa0<p50<String>> f14284g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14285h;

    /* renamed from: i  reason: collision with root package name */
    public final cy<Bundle> f14286i;

    public di(n20 n20, f9 f9Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, pa0 pa0, String str2, cy cyVar) {
        this.f14278a = n20;
        this.f14279b = f9Var;
        this.f14280c = applicationInfo;
        this.f14281d = str;
        this.f14282e = list;
        this.f14283f = packageInfo;
        this.f14284g = pa0;
        this.f14285h = str2;
        this.f14286i = cyVar;
    }

    public final p50<Bundle> a() {
        return this.f14278a.c(Cif.SIGNALS).s(this.f14286i.a(new Bundle())).e();
    }

    public final p50<l5> b() {
        p50<Bundle> a10 = a();
        return this.f14278a.a(Cif.REQUEST_PARCEL, a10, this.f14284g.get()).i(new q(this, (p50) a10)).e();
    }
}
