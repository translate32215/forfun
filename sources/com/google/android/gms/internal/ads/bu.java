package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import e8.gc0;
import e8.hd0;
import e8.ic0;
import e8.pe0;
import e8.pf0;
import e8.se0;
import e8.uf0;
import e8.vb0;
import e8.ze0;
import f7.j0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.a;
import u6.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bu implements se0, du {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f6055a;

    /* renamed from: b  reason: collision with root package name */
    public final pf0 f6056b;

    /* renamed from: c  reason: collision with root package name */
    public final hd0 f6057c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6058d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f6059e;

    /* renamed from: f  reason: collision with root package name */
    public final pe0 f6060f;

    /* renamed from: g  reason: collision with root package name */
    public final ic0 f6061g = new ic0();

    /* renamed from: h  reason: collision with root package name */
    public final int f6062h;

    /* renamed from: i  reason: collision with root package name */
    public se0 f6063i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6064r;

    public bu(Uri uri, pf0 pf0, hd0 hd0, int i10, Handler handler, pe0 pe0, int i11) {
        this.f6055a = uri;
        this.f6056b = pf0;
        this.f6057c = hd0;
        this.f6058d = i10;
        this.f6059e = handler;
        this.f6060f = pe0;
        this.f6062h = i11;
    }

    public final cu a(int i10, f fVar) {
        a.a(i10 == 0);
        return new yt(this.f6055a, this.f6056b.c(), this.f6057c.d(), this.f6058d, this.f6059e, this.f6060f, this, fVar, this.f6062h);
    }

    public final void b() throws IOException {
    }

    public final void c(cu cuVar) {
        yt ytVar = (yt) cuVar;
        au auVar = ytVar.f8651r;
        j8 j8Var = ytVar.f8650i;
        j0 j0Var = new j0(ytVar, auVar);
        uf0 uf0 = (uf0) j8Var.f7135c;
        if (uf0 != null) {
            uf0.b(true);
        }
        ((ExecutorService) j8Var.f7134b).execute(j0Var);
        ((ExecutorService) j8Var.f7134b).shutdown();
        ytVar.f8655v.removeCallbacksAndMessages((Object) null);
        ytVar.O = true;
    }

    public final void d(gc0 gc0, Object obj) {
        boolean z10 = false;
        if (gc0.e(0, this.f6061g, false).f15017c != -9223372036854775807L) {
            z10 = true;
        }
        if (!this.f6064r || z10) {
            this.f6064r = z10;
            this.f6063i.d(gc0, (Object) null);
        }
    }

    public final void e() {
        this.f6063i = null;
    }

    public final void f(vb0 vb0, boolean z10, se0 se0) {
        this.f6063i = se0;
        se0.d(new ze0(-9223372036854775807L, false), (Object) null);
    }
}
