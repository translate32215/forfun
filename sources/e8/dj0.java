package e8;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.t2;
import e.g;
import k7.c;
import l0.e;
import y6.a;
import y6.k;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class dj0 {

    /* renamed from: a  reason: collision with root package name */
    public final t2 f14287a = new t2();

    /* renamed from: b  reason: collision with root package name */
    public final Context f14288b;

    /* renamed from: c  reason: collision with root package name */
    public a f14289c;

    /* renamed from: d  reason: collision with root package name */
    public wh0 f14290d;

    /* renamed from: e  reason: collision with root package name */
    public dy f14291e;

    /* renamed from: f  reason: collision with root package name */
    public String f14292f;

    /* renamed from: g  reason: collision with root package name */
    public k7.a f14293g;

    /* renamed from: h  reason: collision with root package name */
    public c f14294h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14295i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f14296j;

    public dj0(Context context) {
        this.f14288b = context;
    }

    public final void a(wh0 wh0) {
        try {
            this.f14290d = wh0;
            dy dyVar = this.f14291e;
            if (dyVar != null) {
                dyVar.q1(wh0 != null ? new yh0(wh0) : null);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void b(zi0 zi0) {
        try {
            if (this.f14291e == null) {
                if (this.f14292f == null) {
                    c("loadAd");
                }
                li0 q10 = this.f14295i ? li0.q() : new li0();
                m30 m30 = ti0.f16763j.f16765b;
                Context context = this.f14288b;
                dy dyVar = (dy) new si0(m30, context, q10, this.f14292f, this.f14287a, 1).b(context, false);
                this.f14291e = dyVar;
                if (this.f14289c != null) {
                    dyVar.p6(new bi0(this.f14289c));
                }
                if (this.f14290d != null) {
                    this.f14291e.q1(new yh0(this.f14290d));
                }
                if (this.f14293g != null) {
                    this.f14291e.e0(new gi0(this.f14293g));
                }
                if (this.f14294h != null) {
                    this.f14291e.T(new v7(this.f14294h));
                }
                this.f14291e.y5(new a((k) null));
                Boolean bool = this.f14296j;
                if (bool != null) {
                    this.f14291e.N(bool.booleanValue());
                }
            }
            if (this.f14291e.e1(ji0.a(this.f14288b, zi0))) {
                this.f14287a.f8175a = zi0.f17764g;
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void c(String str) {
        if (this.f14291e == null) {
            throw new IllegalStateException(g.a(str.length() + 63, "The ad unit ID must be set on InterstitialAd before ", str, " is called."));
        }
    }
}
