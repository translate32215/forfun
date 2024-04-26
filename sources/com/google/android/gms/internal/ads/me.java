package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.e00;
import e8.fi0;
import e8.gz;
import e8.n00;
import e8.v00;
import e8.zh0;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class me extends d6 {

    /* renamed from: a  reason: collision with root package name */
    public final le f7479a;

    /* renamed from: b  reason: collision with root package name */
    public final e00 f7480b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7481c;

    /* renamed from: d  reason: collision with root package name */
    public final v00 f7482d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f7483e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public za f7484f;

    public me(String str, le leVar, Context context, e00 e00, v00 v00) {
        this.f7481c = str;
        this.f7479a = leVar;
        this.f7480b = e00;
        this.f7482d = v00;
        this.f7483e = context;
    }

    public final synchronized void s6(a aVar, boolean z10) throws RemoteException {
        i.d("#008 Must be called on the main UI thread.");
        if (this.f7484f == null) {
            e.K("Rewarded can not be shown before loaded");
            this.f7480b.g(e.p(we.NOT_READY, (String) null, (zh0) null));
            return;
        }
        this.f7484f.c(z10, (Activity) b.z0(aVar));
    }

    public final synchronized void t6(fi0 fi0, g6 g6Var) throws RemoteException {
        u6(fi0, g6Var, 2);
    }

    public final synchronized void u6(fi0 fi0, g6 g6Var, int i10) throws RemoteException {
        i.d("#008 Must be called on the main UI thread.");
        this.f7480b.f14346c.set(g6Var);
        p pVar = l.B.f13186c;
        if (p.s(this.f7483e) && fi0.A == null) {
            e.I("Failed to load the ad because app ID is missing.");
            this.f7480b.j0(e.p(we.APP_ID_MISSING, (String) null, (zh0) null));
        } else if (this.f7484f == null) {
            n00 n00 = new n00();
            le leVar = this.f7479a;
            leVar.f7384g.f17560p.f16946b = i10;
            leVar.k(fi0, this.f7481c, n00, new gz(this));
        }
    }

    public final synchronized void v6(fi0 fi0, g6 g6Var) throws RemoteException {
        u6(fi0, g6Var, 3);
    }
}
