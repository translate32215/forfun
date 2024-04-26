package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import e8.ah;
import e8.h9;
import e8.im;
import e8.jl;
import e8.k9;
import e8.kl;
import e8.lh;
import e8.ml;
import e8.o50;
import e8.oj;
import e8.qi;
import e8.ri;
import e8.si;
import e8.t;
import e8.ti0;
import e8.um;
import e8.zg;
import e8.zh0;
import java.lang.ref.WeakReference;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class za extends ah {

    /* renamed from: h  reason: collision with root package name */
    public final Context f8682h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<t7> f8683i;

    /* renamed from: j  reason: collision with root package name */
    public final t9 f8684j;

    /* renamed from: k  reason: collision with root package name */
    public final kl f8685k;

    /* renamed from: l  reason: collision with root package name */
    public final ri f8686l;

    /* renamed from: m  reason: collision with root package name */
    public final oj f8687m;

    /* renamed from: n  reason: collision with root package name */
    public final lh f8688n;

    /* renamed from: o  reason: collision with root package name */
    public final b6 f8689o;

    /* renamed from: p  reason: collision with root package name */
    public final qf f8690p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8691q = false;

    public za(zg zgVar, Context context, t7 t7Var, t9 t9Var, kl klVar, ri riVar, oj ojVar, lh lhVar, qe qeVar, qf qfVar) {
        super(zgVar);
        this.f8682h = context;
        this.f8684j = t9Var;
        this.f8683i = new WeakReference<>(t7Var);
        this.f8685k = klVar;
        this.f8686l = riVar;
        this.f8687m = ojVar;
        this.f8688n = lhVar;
        this.f8690p = qfVar;
        a6 a6Var = qeVar.f7959l;
        this.f8689o = new m6(a6Var != null ? a6Var.f5941a : "", a6Var != null ? a6Var.f5942b : 1);
    }

    public final boolean c(boolean z10, Activity activity) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16597j0)).booleanValue()) {
            p pVar = l.B.f13186c;
            if (p.l(this.f8682h)) {
                e.K("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f8686l.I0(si.f16494a);
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16603k0)).booleanValue()) {
                    this.f8690p.a(((re) this.f13724a.f16701b.f7135c).f8030b);
                }
                return false;
            }
        }
        if (this.f8691q) {
            e.K("The rewarded ad have been showed.");
            this.f8686l.I0(new qi(e.p(we.AD_REUSED, (String) null, (zh0) null), 0));
            return false;
        }
        this.f8691q = true;
        this.f8685k.I0(jl.f15155a);
        Context context = activity;
        if (activity == null) {
            context = this.f8682h;
        }
        try {
            this.f8684j.a(z10, context);
            this.f8685k.I0(ml.f15526a);
            return true;
        } catch (um e10) {
            this.f8686l.I0(new g2(e10));
            return false;
        }
    }

    public final void finalize() throws Throwable {
        try {
            t7 t7Var = (t7) this.f8683i.get();
            if (((Boolean) ti0.f16763j.f16769f.a(t.W3)).booleanValue()) {
                if (!this.f8691q && t7Var != null) {
                    o50 o50 = h9.f14885e;
                    ((k9) o50).f15244a.execute(new im(t7Var, 1));
                }
            } else if (t7Var != null) {
                t7Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
