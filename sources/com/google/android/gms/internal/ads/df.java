package com.google.android.gms.internal.ads;

import e8.a20;
import e8.ah;
import e8.gz;
import e8.i10;
import e8.j10;
import e8.l10;
import e8.p50;
import e8.r10;
import e8.s10;
import e8.y10;
import e8.yz;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class df<AdT extends ah> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public a20 f6202a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public fi<s10<AdT>> f6203b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public p50<s10<AdT>> f6204c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public int f6205d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final l10 f6206e;

    /* renamed from: f  reason: collision with root package name */
    public final gz f6207f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedList<a20> f6208g;

    /* renamed from: h  reason: collision with root package name */
    public final zh<s10<AdT>> f6209h = new g2(this);

    public df(l10 l10, i10 i10, gz gzVar) {
        this.f6206e = l10;
        this.f6207f = gzVar;
        this.f6208g = new LinkedList<>();
        i10.f14969a = new y10(this);
    }

    public final void a(a20 a20) {
        while (true) {
            p50<s10<AdT>> p50 = this.f6204c;
            boolean z10 = true;
            if (!(p50 == null || p50.isDone())) {
                if (a20 != null) {
                    this.f6208g.add(a20);
                    return;
                }
                return;
            } else if (a20 != null || !this.f6208g.isEmpty()) {
                if (a20 == null) {
                    a20 = this.f6208g.remove();
                }
                if (a20.a() != null) {
                    l10 l10 = this.f6206e;
                    r10 a10 = a20.a();
                    ye yeVar = (ye) l10;
                    synchronized (yeVar) {
                        j10 j10 = yeVar.f8604a.get(a10);
                        if (j10 != null) {
                            int a11 = j10.a();
                            int i10 = yeVar.f8605b.f8701e;
                            if (a11 >= i10) {
                                z10 = false;
                            }
                        }
                    }
                    if (z10) {
                        this.f6202a = a20.b();
                        this.f6203b = new fi<>();
                        gz gzVar = this.f6207f;
                        a20 a202 = this.f6202a;
                        gzVar.getClass();
                        ae aeVar = (ae) a202;
                        p50<s10<AdT>> a12 = ((yz) gzVar.f14835b).a(aeVar.f5954b, aeVar.f5953a);
                        this.f6204c = a12;
                        yh.g(a12, this.f6209h, a20.c());
                        return;
                    }
                }
                a20 = null;
            } else {
                return;
            }
        }
    }
}
