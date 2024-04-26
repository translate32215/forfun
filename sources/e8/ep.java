package e8;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.p1;
import e7.k;
import e7.p;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ep implements k, p, o1, p1, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public wh0 f14495a;

    /* renamed from: b  reason: collision with root package name */
    public o1 f14496b;

    /* renamed from: c  reason: collision with root package name */
    public k f14497c;

    /* renamed from: d  reason: collision with root package name */
    public p1 f14498d;

    /* renamed from: e  reason: collision with root package name */
    public p f14499e;

    public ep(ob obVar) {
    }

    public final synchronized void C(String str, Bundle bundle) {
        o1 o1Var = this.f14496b;
        if (o1Var != null) {
            o1Var.C(str, bundle);
        }
    }

    public final synchronized void G1() {
        k kVar = this.f14497c;
        if (kVar != null) {
            kVar.G1();
        }
    }

    public final synchronized void J3(c cVar) {
        k kVar = this.f14497c;
        if (kVar != null) {
            kVar.J3(cVar);
        }
    }

    public final synchronized void a(String str, String str2) {
        p1 p1Var = this.f14498d;
        if (p1Var != null) {
            p1Var.a(str, str2);
        }
    }

    public final synchronized void g() {
        p pVar = this.f14499e;
        if (pVar != null) {
            pVar.g();
        }
    }

    public final synchronized void n() {
        wh0 wh0 = this.f14495a;
        if (wh0 != null) {
            wh0.n();
        }
    }

    public final synchronized void onPause() {
        k kVar = this.f14497c;
        if (kVar != null) {
            kVar.onPause();
        }
    }

    public final synchronized void onResume() {
        k kVar = this.f14497c;
        if (kVar != null) {
            kVar.onResume();
        }
    }

    public final synchronized void x0() {
        k kVar = this.f14497c;
        if (kVar != null) {
            kVar.x0();
        }
    }
}
