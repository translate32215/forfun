package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.p;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i9;
import e8.ah;
import e8.aw;
import e8.b00;
import e8.ei;
import e8.fi0;
import e8.gz;
import e8.hz;
import e8.iz;
import e8.li0;
import e8.p50;
import e8.rf;
import e8.t;
import e8.ti0;
import e8.ul;
import e8.w00;
import e8.y00;
import e8.yz;
import e8.zf;
import f7.j;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class vd<AppOpenAd extends ah, AppOpenRequestComponent extends rf<AppOpenAd>, AppOpenRequestComponentBuilder extends ei<AppOpenRequestComponent>> implements jd<AppOpenAd> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8352a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8353b;

    /* renamed from: c  reason: collision with root package name */
    public final b8 f8354c;

    /* renamed from: d  reason: collision with root package name */
    public final hz f8355d;

    /* renamed from: e  reason: collision with root package name */
    public final yz<AppOpenRequestComponent, AppOpenAd> f8356e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f8357f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public final y00 f8358g;
    @GuardedBy("this")
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public p50<AppOpenAd> f8359h;

    public vd(Context context, Executor executor, b8 b8Var, yz<AppOpenRequestComponent, AppOpenAd> yzVar, hz hzVar, y00 y00) {
        this.f8352a = context;
        this.f8353b = executor;
        this.f8354c = b8Var;
        this.f8356e = yzVar;
        this.f8355d = hzVar;
        this.f8358g = y00;
        this.f8357f = new FrameLayout(context);
    }

    public abstract AppOpenRequestComponentBuilder a(zf zfVar, b9 b9Var, i9 i9Var);

    public final synchronized AppOpenRequestComponentBuilder b(b00 b00) {
        iz izVar = (iz) b00;
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16661t4)).booleanValue()) {
            zf zfVar = new zf(this.f8357f);
            b9.a aVar = new b9.a();
            aVar.f6002a = this.f8352a;
            aVar.f6003b = izVar.f15081a;
            return a(zfVar, aVar.a(), new i9.a().g());
        }
        hz hzVar = this.f8355d;
        hz hzVar2 = new hz(hzVar.f14957a);
        hzVar2.f14963g = hzVar;
        i9.a aVar2 = new i9.a();
        aVar2.f7048g.add(new ul(hzVar2, this.f8353b));
        aVar2.f7046e.add(new ul(hzVar2, this.f8353b));
        aVar2.f7053l.add(new ul(hzVar2, this.f8353b));
        aVar2.f7054m = hzVar2;
        zf zfVar2 = new zf(this.f8357f);
        b9.a aVar3 = new b9.a();
        aVar3.f6002a = this.f8352a;
        aVar3.f6003b = izVar.f15081a;
        return a(zfVar2, aVar3.a(), aVar2.g());
    }

    public final boolean j() {
        p50<AppOpenAd> p50 = this.f8359h;
        return p50 != null && !p50.isDone();
    }

    public final synchronized boolean k(fi0 fi0, String str, ob obVar, aw<? super AppOpenAd> awVar) throws RemoteException {
        fi0 fi02 = fi0;
        String str2 = str;
        synchronized (this) {
            i.d("loadAd must be called on the main UI thread.");
            if (str2 == null) {
                e.I("Ad unit ID should not be null for app open ad.");
                this.f8353b.execute(new j(this));
                return false;
            } else if (this.f8359h != null) {
                return false;
            } else {
                p.u(this.f8352a, fi02.f14636f);
                y00 y00 = this.f8358g;
                y00.f17548d = str2;
                y00.f17546b = new li0("interstitial_mb", 0, 0, false, 0, 0, (li0[]) null, false, false, false, false, true, false, false);
                y00.f17545a = fi02;
                w00 a10 = y00.a();
                iz izVar = new iz((j8) null);
                izVar.f15081a = a10;
                p50<AppOpenAd> a11 = this.f8356e.a(new je(izVar), new gz(this));
                this.f8359h = a11;
                j8 j8Var = new j8(this, (aw) awVar, izVar);
                a11.a(new j0((Future) a11, (zh) j8Var), this.f8353b);
                return true;
            }
        }
    }
}
