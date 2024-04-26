package s4;

import android.content.SharedPreferences;
import android.util.SparseArray;
import androidx.appcompat.app.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.yacinetv.ui.coupon.CouponFragment;
import dev.pankaj.yacinetv.ui.splash.SplashActivity;
import dev.pankaj.ytvclib.utils.C;
import e.j;
import java.util.Date;
import kotlin.reflect.KProperty;
import o4.i;
import qc.e;
import qc.m;
import s8.a;
import sc.f;
import u4.b;
import ud.k;
import v6.o;
import v6.t;
import x4.r0;
import y4.v;
import y4.x;

public final /* synthetic */ class g implements b.a, o.b, a, c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24934a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24935b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f24936c;

    public /* synthetic */ g(c cVar, Date date) {
        this.f24935b = cVar;
        this.f24936c = date;
    }

    public /* synthetic */ g(CouponFragment couponFragment, MainApp mainApp) {
        this.f24935b = couponFragment;
        this.f24936c = mainApp;
    }

    public /* synthetic */ g(SplashActivity splashActivity, MainApp mainApp) {
        this.f24935b = splashActivity;
        this.f24936c = mainApp;
    }

    public /* synthetic */ g(fd.a aVar, LiveData liveData) {
        this.f24935b = aVar;
        this.f24936c = liveData;
    }

    public /* synthetic */ g(hd.a aVar, LiveData liveData) {
        this.f24935b = aVar;
        this.f24936c = liveData;
    }

    public /* synthetic */ g(h hVar, i iVar) {
        this.f24935b = hVar;
        this.f24936c = iVar;
    }

    public /* synthetic */ g(v vVar, r0 r0Var) {
        this.f24935b = vVar;
        this.f24936c = r0Var;
    }

    public Object a() {
        return ((h) this.f24935b).f24939c.S((i) this.f24936c);
    }

    public void c(Object obj, t tVar) {
        r0 r0Var = (r0) this.f24936c;
        x xVar = (x) obj;
        x.b bVar = (x.b) tVar;
        SparseArray<x.a> sparseArray = ((v) this.f24935b).f28080e;
        bVar.f28100b.clear();
        int i10 = 0;
        while (i10 < bVar.f26497a.size()) {
            v6.a.a(i10 >= 0 && i10 < bVar.f26497a.size());
            int keyAt = bVar.f26497a.keyAt(i10);
            SparseArray<x.a> sparseArray2 = bVar.f28100b;
            x.a aVar = sparseArray.get(keyAt);
            aVar.getClass();
            sparseArray2.append(keyAt, aVar);
            i10++;
        }
        xVar.L(r0Var, bVar);
    }

    public Object e(s8.i iVar) {
        c cVar = (c) this.f24935b;
        Date date = (Date) this.f24936c;
        int[] iArr = c.f9783j;
        cVar.getClass();
        if (iVar.l()) {
            d dVar = cVar.f9790g;
            synchronized (dVar.f9798b) {
                dVar.f9797a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception g10 = iVar.g();
            if (g10 != null) {
                if (g10 instanceof db.d) {
                    d dVar2 = cVar.f9790g;
                    synchronized (dVar2.f9798b) {
                        dVar2.f9797a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    d dVar3 = cVar.f9790g;
                    synchronized (dVar3.f9798b) {
                        dVar3.f9797a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return iVar;
    }

    public void g(Object obj) {
        rc.a aVar;
        switch (this.f24934a) {
            case 3:
                CouponFragment couponFragment = (CouponFragment) this.f24935b;
                MainApp mainApp = (MainApp) this.f24936c;
                m mVar = (m) obj;
                KProperty<Object>[] kPropertyArr = CouponFragment.I0;
                k.f(couponFragment, "this$0");
                k.f(mainApp, "$app");
                if (mVar instanceof m.b) {
                    couponFragment.y0(true);
                    return;
                } else if (mVar instanceof m.a) {
                    j.d(couponFragment, couponFragment.D(R.string.error_message), 0, 2);
                    couponFragment.y0(false);
                    return;
                } else if (mVar instanceof m.c) {
                    couponFragment.y0(false);
                    dd.c cVar = (dd.c) mVar.f24279a;
                    if (cVar == null) {
                        return;
                    }
                    if (cVar.b()) {
                        j.d(couponFragment, cVar.c(), 0, 2);
                        return;
                    }
                    sc.g a10 = cVar.a();
                    k.c(a10);
                    String f10 = mainApp.f23979b.f(a10);
                    SharedPreferences sharedPreferences = mainApp.f23978a;
                    k.c(sharedPreferences);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    k.e(edit, "editor");
                    C c10 = C.f13466a;
                    k.e(f10, "data");
                    edit.putString("coupon", c10.enc(f10, "pk"));
                    edit.apply();
                    j.d(couponFragment, couponFragment.D(R.string.premium_activated), 0, 2);
                    couponFragment.r0();
                    return;
                } else {
                    return;
                }
            case 4:
                SplashActivity splashActivity = (SplashActivity) this.f24935b;
                MainApp mainApp2 = (MainApp) this.f24936c;
                m mVar2 = (m) obj;
                KProperty<Object>[] kPropertyArr2 = SplashActivity.M;
                k.f(splashActivity, "this$0");
                k.f(mainApp2, "$app");
                if (mVar2 instanceof m.b) {
                    splashActivity.M(false, nc.a.f22481b);
                    return;
                } else if (mVar2 instanceof m.a) {
                    splashActivity.M(true, new nc.b(splashActivity, mainApp2));
                    return;
                } else if ((mVar2 instanceof m.c) && (aVar = (rc.a) mVar2.f24279a) != null) {
                    mainApp2.h(aVar.a());
                    f a11 = aVar.a();
                    nc.c cVar2 = new nc.c(splashActivity);
                    k.f(a11, "config");
                    if (a11.b().d() != 3) {
                        b.a aVar2 = new b.a(splashActivity);
                        aVar2.f441a.f426f = a11.b().c();
                        aVar2.setPositiveButton(R.string.update, new oc.b(splashActivity, a11, cVar2));
                        aVar2.setNegativeButton(R.string.exit, new oc.c(cVar2));
                        androidx.appcompat.app.b create = aVar2.create();
                        create.setCancelable(false);
                        create.show();
                        return;
                    }
                    cVar2.c(Boolean.TRUE);
                    return;
                } else {
                    return;
                }
            case 5:
                fd.a aVar3 = (fd.a) this.f24935b;
                e eVar = (e) obj;
                aVar3.f18344e.n((LiveData) this.f24936c);
                if (eVar instanceof qc.f) {
                    fd.a.f(aVar3, new m.c(((qc.f) eVar).f24272a));
                    return;
                } else if (eVar instanceof qc.c) {
                    fd.a.f(aVar3, new m.a("", (Object) null, 2));
                    return;
                } else if (eVar instanceof qc.d) {
                    fd.a.f(aVar3, new m.a(((qc.d) eVar).f24271a, (Object) null, 2));
                    return;
                } else {
                    return;
                }
            default:
                hd.a aVar4 = (hd.a) this.f24935b;
                e eVar2 = (e) obj;
                aVar4.f18976e.n((LiveData) this.f24936c);
                if (eVar2 instanceof qc.f) {
                    m.c cVar3 = new m.c(((qc.f) eVar2).f24272a);
                    a0<m<dd.b>> a0Var = aVar4.f18976e;
                    if (!k.a(a0Var.d(), cVar3)) {
                        a0Var.l(cVar3);
                        return;
                    }
                    return;
                } else if (eVar2 instanceof qc.c) {
                    m.a aVar5 = new m.a("", (Object) null, 2);
                    a0<m<dd.b>> a0Var2 = aVar4.f18976e;
                    if (!k.a(a0Var2.d(), aVar5)) {
                        a0Var2.l(aVar5);
                        return;
                    }
                    return;
                } else if (eVar2 instanceof qc.d) {
                    m.a aVar6 = new m.a(((qc.d) eVar2).f24271a, (Object) null, 2);
                    a0<m<dd.b>> a0Var3 = aVar4.f18976e;
                    if (!k.a(a0Var3.d(), aVar6)) {
                        a0Var3.l(aVar6);
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
