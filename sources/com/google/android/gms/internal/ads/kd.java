package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i9;
import d7.l;
import e8.ah;
import e8.aw;
import e8.fh;
import e8.fi0;
import e8.gf0;
import e8.gh;
import e8.od;
import e8.ov;
import e8.p50;
import e8.qn;
import e8.w00;
import e8.y00;
import e8.ym;
import e8.zf;
import e8.zm;
import e8.zv;
import f7.j;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kd implements jd<ah> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final y00 f7234a;

    /* renamed from: b  reason: collision with root package name */
    public final b8 f7235b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7236c;

    /* renamed from: d  reason: collision with root package name */
    public final j8 f7237d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public gh f7238e;

    public kd(b8 b8Var, Context context, j8 j8Var, y00 y00) {
        this.f7235b = b8Var;
        this.f7236c = context;
        this.f7237d = j8Var;
        this.f7234a = y00;
    }

    public final boolean j() {
        gh ghVar = this.f7238e;
        return ghVar != null && ghVar.f14783d;
    }

    public final boolean k(fi0 fi0, String str, ob obVar, aw<? super ah> awVar) throws RemoteException {
        p pVar = l.B.f13186c;
        if (p.s(this.f7236c) && fi0.A == null) {
            e.I("Failed to load the ad because app ID is missing.");
            this.f7235b.e().execute(new j(this));
            return false;
        } else if (str == null) {
            e.I("Ad unit ID should not be null for NativeAdLoader.");
            this.f7235b.e().execute(new e7.e(this));
            return false;
        } else {
            androidx.appcompat.widget.p.u(this.f7236c, fi0.f14636f);
            int i10 = ((zv) obVar).f17798a;
            y00 y00 = this.f7234a;
            y00.f17545a = fi0;
            y00.f17558n = i10;
            w00 a10 = y00.a();
            od s10 = this.f7235b.s();
            b9.a aVar = new b9.a();
            aVar.f6002a = this.f7236c;
            aVar.f6003b = a10;
            b9 a11 = aVar.a();
            s10.getClass();
            s10.f15783b = a11;
            s10.f15782a = new i9.a().g();
            j8 j8Var = this.f7237d;
            s10.f15784c = new ym((qn) j8Var.f7134b, ((ov) j8Var.f7135c).m());
            s10.f15785d = new zf((ViewGroup) null);
            zm e10 = s10.b();
            this.f7235b.y().a(1);
            Executor g10 = this.f7235b.g();
            ScheduledExecutorService f10 = this.f7235b.f();
            p50<fh> b10 = e10.c().b();
            gh ghVar = new gh(g10, f10, b10);
            this.f7238e = ghVar;
            ((hf) b10).f6857c.a(new j0((Future) b10, (zh) new gf0(ghVar, (zh) new j8(this, (aw) awVar, e10))), g10);
            return true;
        }
    }
}
