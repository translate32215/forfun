package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i9;
import d7.l;
import e8.aw;
import e8.dg;
import e8.fi0;
import e8.fv;
import e8.li0;
import e8.ov;
import e8.p50;
import e8.pg;
import e8.qn;
import e8.qz;
import e8.t;
import e8.ti0;
import e8.ul;
import e8.w00;
import e8.x0;
import e8.xg;
import e8.y00;
import e8.ym;
import e8.zd;
import e8.zf;
import e8.zh0;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xd implements jd<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8541a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8542b;

    /* renamed from: c  reason: collision with root package name */
    public final b8 f8543c;

    /* renamed from: d  reason: collision with root package name */
    public final ov f8544d;

    /* renamed from: e  reason: collision with root package name */
    public final gd f8545e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f8546f;

    /* renamed from: g  reason: collision with root package name */
    public n f8547g;

    /* renamed from: h  reason: collision with root package name */
    public final d9 f8548h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    public final y00 f8549i;
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    public p50<dg> f8550j;

    public xd(Context context, Executor executor, li0 li0, b8 b8Var, ov ovVar, gd gdVar, y00 y00) {
        this.f8541a = context;
        this.f8542b = executor;
        this.f8543c = b8Var;
        this.f8544d = ovVar;
        this.f8545e = gdVar;
        this.f8549i = y00;
        this.f8548h = b8Var.i();
        this.f8546f = new FrameLayout(context);
        y00.f17546b = li0;
    }

    public final boolean a() {
        ViewParent parent = this.f8546f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        p pVar = l.B.f13186c;
        Context context = view.getContext();
        pVar.getClass();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return p.j(view, powerManager, keyguardManager);
    }

    public final boolean j() {
        p50<dg> p50 = this.f8550j;
        return p50 != null && !p50.isDone();
    }

    public final boolean k(fi0 fi0, String str, ob obVar, aw<? super dg> awVar) throws RemoteException {
        pg pgVar;
        if (str == null) {
            e.I("Ad unit ID should not be null for banner ad.");
            this.f8542b.execute(new qz(this));
            return false;
        } else if (j()) {
            return false;
        } else {
            y00 y00 = this.f8549i;
            y00.f17548d = str;
            y00.f17545a = fi0;
            w00 a10 = y00.a();
            if (!((Boolean) x0.f17424b.b()).booleanValue() || !this.f8549i.f17546b.f15404s) {
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16655s4)).booleanValue()) {
                    zd l10 = this.f8543c.l();
                    b9.a aVar = new b9.a();
                    aVar.f6002a = this.f8541a;
                    aVar.f6003b = a10;
                    b9 a11 = aVar.a();
                    l10.getClass();
                    l10.f17717b = a11;
                    i9.a aVar2 = new i9.a();
                    aVar2.d(this.f8544d, this.f8542b);
                    aVar2.f(this.f8544d, this.f8542b);
                    l10.f17716a = aVar2.g();
                    l10.f17718c = new fv(this.f8547g);
                    l10.f17721f = new ym(qn.f16182h, (rx) null);
                    l10.f17719d = new xg(this.f8548h);
                    l10.f17720e = new zf(this.f8546f);
                    pgVar = l10.b();
                } else {
                    zd l11 = this.f8543c.l();
                    b9.a aVar3 = new b9.a();
                    aVar3.f6002a = this.f8541a;
                    aVar3.f6003b = a10;
                    b9 a12 = aVar3.a();
                    l11.getClass();
                    l11.f17717b = a12;
                    i9.a aVar4 = new i9.a();
                    aVar4.d(this.f8544d, this.f8542b);
                    aVar4.e(this.f8544d, this.f8542b);
                    aVar4.e(this.f8545e, this.f8542b);
                    aVar4.f7045d.add(new ul(this.f8544d, this.f8542b));
                    aVar4.a(this.f8544d, this.f8542b);
                    aVar4.c(this.f8544d, this.f8542b);
                    aVar4.b(this.f8544d, this.f8542b);
                    aVar4.f(this.f8544d, this.f8542b);
                    aVar4.f7052k.add(new ul(this.f8544d, this.f8542b));
                    l11.f17716a = aVar4.g();
                    l11.f17718c = new fv(this.f8547g);
                    l11.f17721f = new ym(qn.f16182h, (rx) null);
                    l11.f17719d = new xg(this.f8548h);
                    l11.f17720e = new zf(this.f8546f);
                    pgVar = l11.b();
                }
                p50<dg> b10 = pgVar.c().b();
                this.f8550j = b10;
                j8 j8Var = new j8(this, (aw) awVar, pgVar);
                Executor executor = this.f8542b;
                ((hf) b10).f6857c.a(new j0((Future) b10, (zh) j8Var), executor);
                return true;
            }
            ov ovVar = this.f8544d;
            if (ovVar != null) {
                ovVar.j0(e.p(we.INVALID_AD_SIZE, (String) null, (zh0) null));
            }
            return false;
        }
    }
}
