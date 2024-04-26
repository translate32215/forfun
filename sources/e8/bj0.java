package e8;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.t2;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.e;
import y6.a;
import y6.d;
import y6.k;
import y6.m;
import z6.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class bj0 {

    /* renamed from: a  reason: collision with root package name */
    public final t2 f14021a = new t2();

    /* renamed from: b  reason: collision with root package name */
    public final f f14022b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final ej0 f14023c = new ej0(this);

    /* renamed from: d  reason: collision with root package name */
    public wh0 f14024d;

    /* renamed from: e  reason: collision with root package name */
    public a f14025e;

    /* renamed from: f  reason: collision with root package name */
    public d[] f14026f;

    /* renamed from: g  reason: collision with root package name */
    public z6.a f14027g;

    /* renamed from: h  reason: collision with root package name */
    public dy f14028h;

    /* renamed from: i  reason: collision with root package name */
    public b f14029i;

    /* renamed from: j  reason: collision with root package name */
    public m f14030j;

    /* renamed from: k  reason: collision with root package name */
    public String f14031k;

    /* renamed from: l  reason: collision with root package name */
    public ViewGroup f14032l;

    /* renamed from: m  reason: collision with root package name */
    public int f14033m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14034n;

    /* renamed from: o  reason: collision with root package name */
    public k f14035o;

    public bj0(ViewGroup viewGroup, int i10) {
        this.f14032l = viewGroup;
        this.f14028h = null;
        new AtomicBoolean(false);
        this.f14033m = i10;
    }

    public static li0 f(Context context, d[] dVarArr, int i10) {
        boolean z10 = false;
        for (d equals : dVarArr) {
            if (equals.equals(d.f28118n)) {
                return li0.s();
            }
        }
        li0 li0 = new li0(context, dVarArr);
        if (i10 == 1) {
            z10 = true;
        }
        li0.f15403r = z10;
        return li0;
    }

    public final d a() {
        li0 O4;
        try {
            dy dyVar = this.f14028h;
            if (!(dyVar == null || (O4 = dyVar.O4()) == null)) {
                return new d(O4.f15398e, O4.f15395b, O4.f15394a);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        d[] dVarArr = this.f14026f;
        if (dVarArr != null) {
            return dVarArr[0];
        }
        return null;
    }

    public final String b() {
        dy dyVar;
        if (this.f14031k == null && (dyVar = this.f14028h) != null) {
            try {
                this.f14031k = dyVar.H4();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        return this.f14031k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.e c() {
        /*
            r3 = this;
            r0 = 0
            com.google.android.gms.internal.ads.dy r1 = r3.f14028h     // Catch:{ RemoteException -> 0x000a }
            if (r1 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.gz r1 = r1.B()     // Catch:{ RemoteException -> 0x000a }
            goto L_0x0011
        L_0x000a:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            l0.e.F(r2, r1)
        L_0x0010:
            r1 = r0
        L_0x0011:
            if (r1 == 0) goto L_0x0018
            com.google.android.gms.ads.e r0 = new com.google.android.gms.ads.e
            r0.<init>(r1)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.bj0.c():com.google.android.gms.ads.e");
    }

    public final void d(a aVar) {
        this.f14025e = aVar;
        ej0 ej0 = this.f14023c;
        synchronized (ej0.f14486a) {
            ej0.f14487b = aVar;
        }
    }

    public final void e(String str) {
        if (this.f14031k == null) {
            this.f14031k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void g(wh0 wh0) {
        try {
            this.f14024d = wh0;
            dy dyVar = this.f14028h;
            if (dyVar != null) {
                dyVar.q1(wh0 != null ? new yh0(wh0) : null);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void h(z6.a aVar) {
        try {
            this.f14027g = aVar;
            dy dyVar = this.f14028h;
            if (dyVar != null) {
                dyVar.k1(aVar != null ? new qi0(this.f14027g) : null);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void i(d... dVarArr) {
        this.f14026f = dVarArr;
        try {
            dy dyVar = this.f14028h;
            if (dyVar != null) {
                dyVar.n5(f(this.f14032l.getContext(), this.f14026f, this.f14033m));
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        this.f14032l.requestLayout();
    }

    public final hz j() {
        dy dyVar = this.f14028h;
        if (dyVar == null) {
            return null;
        }
        try {
            return dyVar.getVideoController();
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
