package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.f9;
import e8.gf0;
import e8.h4;
import e8.h9;
import e8.k9;
import e8.l4;
import e8.o50;
import e8.p4;
import e8.r4;
import f7.f0;
import f7.r;
import javax.annotation.ParametersAreNonnullByDefault;
import t1.c;
import x3.d;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6725a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Context f6726b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6727c;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f6728d;

    /* renamed from: e  reason: collision with root package name */
    public r<h4> f6729e;

    /* renamed from: f  reason: collision with root package name */
    public r<h4> f6730f;

    /* renamed from: g  reason: collision with root package name */
    public r4 f6731g;

    /* renamed from: h  reason: collision with root package name */
    public int f6732h = 1;

    public h2(Context context, f9 f9Var, String str, r<h4> rVar, r<h4> rVar2) {
        this.f6727c = str;
        this.f6726b = context.getApplicationContext();
        this.f6728d = f9Var;
        this.f6729e = new d(2);
        this.f6730f = new d(2);
        this.f6729e = rVar;
        this.f6730f = rVar2;
    }

    public final r4 a(tm tmVar) {
        r4 r4Var = new r4(this.f6730f);
        o50 o50 = h9.f14885e;
        ((k9) o50).f15244a.execute(new f0(this, tmVar, r4Var));
        r4Var.j(new c(this, r4Var), new gf0(this, r4Var));
        return r4Var;
    }

    public final p4 b() {
        synchronized (this.f6725a) {
            synchronized (this.f6725a) {
                r4 r4Var = this.f6731g;
                if (r4Var != null && this.f6732h == 0) {
                    r4Var.j(new g2(this), l4.f15357a);
                }
            }
            r4 r4Var2 = this.f6731g;
            if (r4Var2 != null) {
                if (r4Var2.f() != -1) {
                    int i10 = this.f6732h;
                    if (i10 == 0) {
                        p4 p10 = this.f6731g.p();
                        return p10;
                    } else if (i10 == 1) {
                        this.f6732h = 2;
                        a((tm) null);
                        p4 p11 = this.f6731g.p();
                        return p11;
                    } else if (i10 == 2) {
                        p4 p12 = this.f6731g.p();
                        return p12;
                    } else {
                        p4 p13 = this.f6731g.p();
                        return p13;
                    }
                }
            }
            this.f6732h = 2;
            r4 a10 = a((tm) null);
            this.f6731g = a10;
            p4 p14 = a10.p();
            return p14;
        }
    }
}
