package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import d7.l;
import e7.h;
import e8.b1;
import e8.d9;
import e8.f9;
import e8.h9;
import e8.p0;
import e8.p50;
import e8.t;
import e8.ti0;
import e8.v8;
import e8.x8;
import f7.d0;
import f7.h0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class y6 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8580a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final o f8581b;

    /* renamed from: c  reason: collision with root package name */
    public final x8 f8582c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8583d;

    /* renamed from: e  reason: collision with root package name */
    public Context f8584e;

    /* renamed from: f  reason: collision with root package name */
    public f9 f8585f;

    /* renamed from: g  reason: collision with root package name */
    public f f8586g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f8587h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f8588i;

    /* renamed from: j  reason: collision with root package name */
    public final v8 f8589j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f8590k;

    /* renamed from: l  reason: collision with root package name */
    public p50<ArrayList<String>> f8591l;

    public y6() {
        o oVar = new o();
        this.f8581b = oVar;
        this.f8582c = new x8(ti0.f16763j.f16766c, oVar);
        this.f8583d = false;
        this.f8586g = null;
        this.f8587h = null;
        this.f8588i = new AtomicInteger(0);
        this.f8589j = new v8((h) null);
        this.f8590k = new Object();
    }

    public final Resources a() {
        if (this.f8585f.f14547d) {
            return this.f8584e.getResources();
        }
        try {
            DynamiteModule.d(this.f8584e, DynamiteModule.f5902b, ModuleDescriptor.MODULE_ID).f5915a.getResources();
            return null;
        } catch (Exception e10) {
            throw new d9(e10);
        } catch (d9 e11) {
            e.D("Cannot load resource from dynamite apk or local jar", e11);
            return null;
        }
    }

    public final void b(Throwable th, String str) {
        a5.d(this.f8584e, this.f8585f).c(th, str);
    }

    public final void c(Throwable th, String str) {
        a5.d(this.f8584e, this.f8585f).a(th, str, ((Double) b1.f13868g.b()).floatValue());
    }

    @TargetApi(23)
    public final void d(Context context, f9 f9Var) {
        f fVar;
        synchronized (this.f8580a) {
            if (!this.f8583d) {
                this.f8584e = context.getApplicationContext();
                this.f8585f = f9Var;
                l.B.f13189f.d(this.f8582c);
                this.f8581b.q(this.f8584e);
                a5.d(this.f8584e, this.f8585f);
                h hVar = l.B.f13195l;
                if (!((Boolean) p0.f15860c.b()).booleanValue()) {
                    e.H("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    fVar = null;
                } else {
                    fVar = new f();
                }
                this.f8586g = fVar;
                if (fVar != null) {
                    e.e.g(new h(this).b(), "AppState.registerCsiReporter");
                }
                this.f8583d = true;
                g();
            }
        }
        l.B.f13186c.H(context, f9Var.f14544a);
    }

    public final f e() {
        f fVar;
        synchronized (this.f8580a) {
            fVar = this.f8586g;
        }
        return fVar;
    }

    public final d0 f() {
        o oVar;
        synchronized (this.f8580a) {
            oVar = this.f8581b;
        }
        return oVar;
    }

    public final p50<ArrayList<String>> g() {
        if (this.f8584e != null) {
            if (!((Boolean) ti0.f16763j.f16769f.a(t.f16646r1)).booleanValue()) {
                synchronized (this.f8590k) {
                    p50<ArrayList<String>> p50 = this.f8591l;
                    if (p50 != null) {
                        return p50;
                    }
                    p50<ArrayList<String>> i10 = ((ih) h9.f14881a).i(new h0(this));
                    this.f8591l = i10;
                    return i10;
                }
            }
        }
        return yh.h(new ArrayList());
    }
}
