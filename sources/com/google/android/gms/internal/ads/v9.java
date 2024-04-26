package com.google.android.gms.internal.ads;

import android.content.Context;
import c8.a;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.internal.ads.pv;
import d7.l;
import e7.k;
import e8.f9;
import e8.pj;
import e8.t;
import e8.ti0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class v9 implements k, pj {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8339a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f8340b;

    /* renamed from: c  reason: collision with root package name */
    public final qe f8341c;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f8342d;

    /* renamed from: e  reason: collision with root package name */
    public final pv.a f8343e;

    /* renamed from: f  reason: collision with root package name */
    public a f8344f;

    public v9(Context context, t7 t7Var, qe qeVar, f9 f9Var, pv.a aVar) {
        this.f8339a = context;
        this.f8340b = t7Var;
        this.f8341c = qeVar;
        this.f8342d = f9Var;
        this.f8343e = aVar;
    }

    public final void G1() {
        t7 t7Var;
        if (this.f8344f != null && (t7Var = this.f8340b) != null) {
            t7Var.O("onSdkImpression", new s.a());
        }
    }

    public final void J3(c cVar) {
        this.f8344f = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void v() {
        p4 p4Var;
        q4 q4Var;
        q4 q4Var2;
        pv.a aVar = this.f8343e;
        if ((aVar == pv.a.REWARD_BASED_VIDEO_AD || aVar == pv.a.INTERSTITIAL || aVar == pv.a.APP_OPEN) && this.f8341c.N && this.f8340b != null && l.B.f13205v.e(this.f8339a)) {
            f9 f9Var = this.f8342d;
            int i10 = f9Var.f14545b;
            int i11 = f9Var.f14546c;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(i10);
            sb2.append(".");
            sb2.append(i11);
            String sb3 = sb2.toString();
            String c10 = this.f8341c.P.c();
            if (((Boolean) ti0.f16763j.f16769f.a(t.H2)).booleanValue()) {
                if (this.f8341c.P.a() == j7.a.VIDEO) {
                    p4Var = p4.VIDEO;
                    q4Var = q4.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.f8341c.S == 2) {
                        q4Var2 = q4.UNSPECIFIED;
                    } else {
                        q4Var2 = q4.BEGIN_TO_RENDER;
                    }
                    q4Var = q4Var2;
                    p4Var = p4.HTML_DISPLAY;
                }
                this.f8344f = l.B.f13205v.a(sb3, this.f8340b.getWebView(), "", "javascript", c10, q4Var, p4Var, this.f8341c.f7953f0);
            } else {
                this.f8344f = l.B.f13205v.b(sb3, this.f8340b.getWebView(), "", "javascript", c10, "Google");
            }
            if (this.f8344f != null && this.f8340b.getView() != null) {
                l.B.f13205v.c(this.f8344f, this.f8340b.getView());
                this.f8340b.D(this.f8344f);
                l.B.f13205v.d(this.f8344f);
                if (((Boolean) ti0.f16763j.f16769f.a(t.J2)).booleanValue()) {
                    this.f8340b.O("onSdkLoaded", new s.a());
                }
            }
        }
    }

    public final void x0() {
    }
}
