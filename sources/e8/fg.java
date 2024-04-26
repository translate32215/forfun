package e8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.m9;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.u7;
import com.google.android.gms.internal.ads.xa;
import com.google.android.gms.internal.ads.y8;
import d7.a;
import f7.d0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fg implements ta0<eg> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14617a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<zg> f14618b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Context> f14619c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<pe> f14620d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<View> f14621e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<t7> f14622f;

    /* renamed from: g  reason: collision with root package name */
    public final ab0<y8> f14623g;

    /* renamed from: h  reason: collision with root package name */
    public final ab0<qn> f14624h;

    /* renamed from: i  reason: collision with root package name */
    public final ab0<wl> f14625i;

    /* renamed from: j  reason: collision with root package name */
    public final ab0<bd> f14626j;

    /* renamed from: k  reason: collision with root package name */
    public final ab0<Executor> f14627k;

    public fg(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, ab0 ab05, ab0 ab06, ab0 ab07, ab0 ab08, ab0 ab09, ab0 ab010, int i10) {
        this.f14617a = i10;
        if (i10 == 1) {
            this.f14618b = ab0;
            this.f14619c = ab02;
            this.f14620d = ab03;
            this.f14621e = ab04;
            this.f14622f = ab05;
            this.f14623g = ab06;
            this.f14624h = ab07;
            this.f14625i = ab08;
            this.f14626j = ab09;
            this.f14627k = ab010;
        } else if (i10 == 2) {
            this.f14618b = ab0;
            this.f14619c = ab02;
            this.f14620d = ab03;
            this.f14621e = ab04;
            this.f14622f = ab05;
            this.f14623g = ab06;
            this.f14624h = ab07;
            this.f14625i = ab08;
            this.f14626j = ab09;
            this.f14627k = ab010;
        } else if (i10 == 3) {
            this.f14618b = ab0;
            this.f14619c = ab02;
            this.f14620d = ab03;
            this.f14621e = ab04;
            this.f14622f = ab05;
            this.f14623g = ab06;
            this.f14624h = ab07;
            this.f14625i = ab08;
            this.f14626j = ab09;
            this.f14627k = ab010;
        } else if (i10 != 4) {
            this.f14618b = ab0;
            this.f14619c = ab02;
            this.f14620d = ab03;
            this.f14621e = ab04;
            this.f14622f = ab05;
            this.f14623g = ab06;
            this.f14624h = ab07;
            this.f14625i = ab08;
            this.f14626j = ab09;
            this.f14627k = ab010;
        } else {
            this.f14618b = ab0;
            this.f14619c = ab02;
            this.f14620d = ab03;
            this.f14621e = ab04;
            this.f14622f = ab05;
            this.f14623g = ab06;
            this.f14624h = ab07;
            this.f14625i = ab08;
            this.f14626j = ab09;
            this.f14627k = ab010;
        }
    }

    public static eg a(zg zgVar, Context context, pe peVar, View view, t7 t7Var, y8 y8Var, qn qnVar, wl wlVar, pa0<bd> pa0, Executor executor) {
        return new eg(zgVar, context, peVar, view, t7Var, y8Var, qnVar, wlVar, pa0, executor);
    }

    public static fg b(ab0<n20> ab0, ab0<f9> ab02, ab0<ApplicationInfo> ab03, ab0<String> ab04, ab0<List<String>> ab05, ab0<PackageInfo> ab06, ab0<p50<String>> ab07, ab0<d0> ab08, ab0<String> ab09, ab0<cy<Bundle>> ab010) {
        return new fg(ab0, ab02, ab03, ab04, ab05, ab06, ab07, ab08, ab09, ab010, 1);
    }

    public final /* synthetic */ Object get() {
        switch (this.f14617a) {
            case 0:
                return a(this.f14618b.get(), this.f14619c.get(), this.f14620d.get(), this.f14621e.get(), this.f14622f.get(), this.f14623g.get(), this.f14624h.get(), this.f14625i.get(), ua0.a(this.f14626j), this.f14627k.get());
            case 1:
                pa0<qn> a10 = ua0.a(this.f14624h);
                d0 d0Var = (d0) this.f14625i.get();
                return new di((n20) this.f14618b.get(), (f9) this.f14619c.get(), (ApplicationInfo) this.f14620d.get(), (String) this.f14621e.get(), (List) this.f14622f.get(), (PackageInfo) this.f14623g.get(), a10, (String) this.f14626j.get(), (cy) this.f14627k.get());
            case 2:
                return new no((Context) this.f14618b.get(), (jo) this.f14619c.get(), (tm) this.f14620d.get(), (f9) this.f14621e.get(), (a) this.f14622f.get(), (nv) this.f14623g.get(), (Executor) this.f14624h.get(), (w00) this.f14625i.get(), (uo) this.f14626j.get(), (ScheduledExecutorService) this.f14627k.get());
            case 3:
                return new xa((Context) this.f14618b.get(), (Executor) this.f14619c.get(), (tm) this.f14620d.get(), (f9) this.f14621e.get(), (a) this.f14622f.get(), (u7) this.f14623g.get(), (dt) this.f14624h.get(), (e30) this.f14625i.get(), (oq) this.f14626j.get(), (t20) this.f14627k.get());
            default:
                return new sc((ki) this.f14618b.get(), (yi) this.f14619c.get(), (dj) this.f14620d.get(), (mj) this.f14621e.get(), (ri) this.f14622f.get(), (vk) this.f14623g.get(), (m9) this.f14624h.get(), (uj) this.f14625i.get(), (am) this.f14626j.get(), (pk) this.f14627k.get());
        }
    }
}
