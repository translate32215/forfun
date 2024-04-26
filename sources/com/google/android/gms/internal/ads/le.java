package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.appcompat.widget.p;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i9;
import e8.aw;
import e8.b00;
import e8.e00;
import e8.fi0;
import e8.gz;
import e8.kp;
import e8.li0;
import e8.n00;
import e8.o00;
import e8.p50;
import e8.qz;
import e8.td;
import e8.u7;
import e8.v00;
import e8.w00;
import e8.y00;
import e8.yz;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class le implements jd<za> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7378a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7379b;

    /* renamed from: c  reason: collision with root package name */
    public final b8 f7380c;

    /* renamed from: d  reason: collision with root package name */
    public final e00 f7381d;

    /* renamed from: e  reason: collision with root package name */
    public final yz<kp, za> f7382e;

    /* renamed from: f  reason: collision with root package name */
    public final v00 f7383f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public final y00 f7384g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public p50<za> f7385h;

    public le(Context context, Executor executor, b8 b8Var, yz<kp, za> yzVar, e00 e00, y00 y00, v00 v00) {
        this.f7378a = context;
        this.f7379b = executor;
        this.f7380c = b8Var;
        this.f7382e = yzVar;
        this.f7381d = e00;
        this.f7384g = y00;
        this.f7383f = v00;
    }

    public final td a(b00 b00) {
        td t10 = this.f7380c.t();
        b9.a aVar = new b9.a();
        aVar.f6002a = this.f7378a;
        aVar.f6003b = ((o00) b00).f15725a;
        aVar.f6005d = null;
        aVar.f6006e = this.f7383f;
        b9 a10 = aVar.a();
        t10.getClass();
        t10.f16735c = a10;
        t10.f16734b = new i9.a().g();
        return t10;
    }

    public final boolean j() {
        p50<za> p50 = this.f7385h;
        return p50 != null && !p50.isDone();
    }

    public final boolean k(fi0 fi0, String str, ob obVar, aw<? super za> awVar) throws RemoteException {
        u7 u7Var = new u7(fi0, str);
        if (obVar instanceof n00) {
            n00 n00 = (n00) obVar;
        }
        if (u7Var.f16853b == null) {
            e.I("Ad unit ID should not be null for rewarded video ad.");
            this.f7379b.execute(new qz(this));
            return false;
        }
        p50<za> p50 = this.f7385h;
        if (p50 != null && !p50.isDone()) {
            return false;
        }
        p.u(this.f7378a, u7Var.f16852a.f14636f);
        y00 y00 = this.f7384g;
        y00.f17548d = u7Var.f16853b;
        y00.f17546b = li0.q();
        y00.f17545a = u7Var.f16852a;
        w00 a10 = y00.a();
        o00 o00 = new o00((j8) null);
        o00.f15725a = a10;
        p50<za> a11 = this.f7382e.a(new je(o00), new gz(this));
        this.f7385h = a11;
        j8 j8Var = new j8(this, (aw) awVar, o00);
        a11.a(new j0((Future) a11, (zh) j8Var), this.f7379b);
        return true;
    }
}
