package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.i9;
import e8.aw;
import e8.d00;
import e8.de;
import e8.e00;
import e8.fi0;
import e8.fv;
import e8.li0;
import e8.ov;
import e8.p50;
import e8.rm;
import e8.t;
import e8.ti0;
import e8.ul;
import e8.w00;
import e8.y00;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ke implements jd<q9> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7239a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7240b;

    /* renamed from: c  reason: collision with root package name */
    public final b8 f7241c;

    /* renamed from: d  reason: collision with root package name */
    public final ov f7242d;

    /* renamed from: e  reason: collision with root package name */
    public final e00 f7243e;

    /* renamed from: f  reason: collision with root package name */
    public n f7244f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public final y00 f7245g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public p50<q9> f7246h;

    public ke(Context context, Executor executor, b8 b8Var, ov ovVar, e00 e00, y00 y00) {
        this.f7239a = context;
        this.f7240b = executor;
        this.f7241c = b8Var;
        this.f7242d = ovVar;
        this.f7245g = y00;
        this.f7243e = e00;
    }

    public final boolean j() {
        p50<q9> p50 = this.f7246h;
        return p50 != null && !p50.isDone();
    }

    public final boolean k(fi0 fi0, String str, ob obVar, aw<? super q9> awVar) {
        li0 li0;
        rm rmVar;
        if (str == null) {
            e.I("Ad unit ID should not be null for interstitial ad.");
            this.f7240b.execute(new e7.e(this));
            return false;
        } else if (j()) {
            return false;
        } else {
            if (obVar instanceof d00) {
                li0 = ((d00) obVar).f14200a;
            } else {
                li0 = new li0();
            }
            y00 y00 = this.f7245g;
            y00.f17548d = str;
            y00.f17546b = li0;
            y00.f17545a = fi0;
            w00 a10 = y00.a();
            if (((Boolean) ti0.f16763j.f16769f.a(t.f16667u4)).booleanValue()) {
                de q10 = this.f7241c.q();
                b9.a aVar = new b9.a();
                aVar.f6002a = this.f7239a;
                aVar.f6003b = a10;
                b9 a11 = aVar.a();
                q10.getClass();
                q10.f14257b = a11;
                i9.a aVar2 = new i9.a();
                aVar2.d(this.f7242d, this.f7240b);
                aVar2.f(this.f7242d, this.f7240b);
                q10.f14256a = aVar2.g();
                q10.f14258c = new fv(this.f7244f);
                rmVar = q10.b();
            } else {
                i9.a aVar3 = new i9.a();
                e00 e00 = this.f7243e;
                if (e00 != null) {
                    aVar3.f7044c.add(new ul(e00, this.f7240b));
                    aVar3.c(this.f7243e, this.f7240b);
                    aVar3.b(this.f7243e, this.f7240b);
                }
                de q11 = this.f7241c.q();
                b9.a aVar4 = new b9.a();
                aVar4.f6002a = this.f7239a;
                aVar4.f6003b = a10;
                b9 a12 = aVar4.a();
                q11.getClass();
                q11.f14257b = a12;
                aVar3.d(this.f7242d, this.f7240b);
                aVar3.a(this.f7242d, this.f7240b);
                aVar3.c(this.f7242d, this.f7240b);
                aVar3.b(this.f7242d, this.f7240b);
                aVar3.e(this.f7242d, this.f7240b);
                aVar3.f(this.f7242d, this.f7240b);
                aVar3.f7052k.add(new ul(this.f7242d, this.f7240b));
                aVar3.f7051j.add(new ul(this.f7242d, this.f7240b));
                q11.f14256a = aVar3.g();
                q11.f14258c = new fv(this.f7244f);
                rmVar = q11.b();
            }
            p50<q9> b10 = rmVar.b().b();
            this.f7246h = b10;
            j8 j8Var = new j8(this, (aw) awVar, rmVar);
            Executor executor = this.f7240b;
            ((hf) b10).f6857c.a(new j0((Future) b10, (zh) j8Var), executor);
            return true;
        }
    }
}
