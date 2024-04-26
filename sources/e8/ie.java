package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.l8;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.u7;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.ue;
import d7.a;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ie implements ta0<l8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15019a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f15020b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<f9> f15021c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<gb> f15022d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<ub<ue, ac>> f15023e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<jv> f15024f;

    /* renamed from: g  reason: collision with root package name */
    public final ab0<yq> f15025g;

    /* renamed from: h  reason: collision with root package name */
    public final ab0<p6> f15026h;

    /* renamed from: i  reason: collision with root package name */
    public final ab0<yp> f15027i;

    public ie(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, ab0 ab05, ab0 ab06, ab0 ab07, ab0 ab08, int i10) {
        this.f15019a = i10;
        if (i10 == 1) {
            this.f15020b = ab0;
            this.f15021c = ab02;
            this.f15022d = ab03;
            this.f15023e = ab04;
            this.f15024f = ab05;
            this.f15025g = ab06;
            this.f15026h = ab07;
            this.f15027i = ab08;
        } else if (i10 != 2) {
            this.f15020b = ab0;
            this.f15021c = ab02;
            this.f15022d = ab03;
            this.f15023e = ab04;
            this.f15024f = ab05;
            this.f15025g = ab06;
            this.f15026h = ab07;
            this.f15027i = ab08;
        } else {
            this.f15020b = ab0;
            this.f15021c = ab02;
            this.f15022d = ab03;
            this.f15023e = ab04;
            this.f15024f = ab05;
            this.f15025g = ab06;
            this.f15026h = ab07;
            this.f15027i = ab08;
        }
    }

    public static ie a(ab0<u7> ab0, ab0<Context> ab02, ab0<tm> ab03, ab0<i0> ab04, ab0<f9> ab05, ab0<a> ab06, ab0<nv> ab07, ab0<d9> ab08) {
        return new ie(ab0, ab02, ab03, ab04, ab05, ab06, ab07, ab08, 1);
    }

    public static ie b(ab0<qu> ab0, ab0<f9> ab02, ab0<String> ab03, ab0<String> ab04, ab0<Context> ab05, ab0<v00> ab06, ab0<b> ab07, ab0<tm> ab08) {
        return new ie(ab0, ab02, ab03, ab04, ab05, ab06, ab07, ab08, 2);
    }

    public final /* synthetic */ Object get() {
        switch (this.f15019a) {
            case 0:
                return new l8(this.f15020b.get(), this.f15021c.get(), this.f15022d.get(), this.f15023e.get(), this.f15024f.get(), this.f15025g.get(), this.f15026h.get(), this.f15027i.get());
            case 1:
                return new cb((u7) this.f15020b.get(), (Context) this.f15021c.get(), (tm) this.f15022d.get(), (i0) this.f15023e.get(), (f9) this.f15024f.get(), (a) this.f15025g.get(), (nv) this.f15026h.get(), (d9) this.f15027i.get());
            default:
                return new d30((qu) this.f15020b.get(), this.f15021c.get(), (String) this.f15022d.get(), (String) this.f15023e.get(), (Context) this.f15024f.get(), (v00) this.f15025g.get(), (b) this.f15026h.get(), (tm) this.f15027i.get());
        }
    }
}
