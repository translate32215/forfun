package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.ah;
import e8.h9;
import e8.im;
import e8.k9;
import e8.kl;
import e8.lh;
import e8.o50;
import e8.ri;
import e8.t;
import e8.ti0;
import e8.zg;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q9 extends ah {

    /* renamed from: h  reason: collision with root package name */
    public final Context f7929h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<t7> f7930i;

    /* renamed from: j  reason: collision with root package name */
    public final kl f7931j;

    /* renamed from: k  reason: collision with root package name */
    public final t9 f7932k;

    /* renamed from: l  reason: collision with root package name */
    public final lh f7933l;

    /* renamed from: m  reason: collision with root package name */
    public final qf f7934m;

    /* renamed from: n  reason: collision with root package name */
    public final ri f7935n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7936o = false;

    public q9(zg zgVar, Context context, @Nullable t7 t7Var, kl klVar, t9 t9Var, lh lhVar, qf qfVar, ri riVar) {
        super(zgVar);
        this.f7929h = context;
        this.f7930i = new WeakReference<>(t7Var);
        this.f7931j = klVar;
        this.f7932k = t9Var;
        this.f7933l = lhVar;
        this.f7934m = qfVar;
        this.f7935n = riVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(boolean r5, @javax.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            e8.l<java.lang.Boolean> r0 = e8.t.f16597j0
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004e
            d7.l r0 = d7.l.B
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c
            android.content.Context r0 = r4.f7929h
            boolean r0 = com.google.android.gms.ads.internal.util.p.l(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            l0.e.K(r0)
            e8.ri r0 = r4.f7935n
            com.google.android.gms.internal.ads.j9 r3 = e8.si.f16494a
            r0.I0(r3)
            e8.l<java.lang.Boolean> r0 = e8.t.f16603k0
            e8.ti0 r3 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r3 = r3.f16769f
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.qf r0 = r4.f7934m
            e8.t00 r3 = r4.f13724a
            com.google.android.gms.internal.ads.j8 r3 = r3.f16701b
            java.lang.Object r3 = r3.f7135c
            com.google.android.gms.internal.ads.re r3 = (com.google.android.gms.internal.ads.re) r3
            java.lang.String r3 = r3.f8030b
            r0.a(r3)
            goto L_0x0054
        L_0x004e:
            boolean r0 = r4.f7936o
            if (r0 != 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x0058
            return r1
        L_0x0058:
            e8.kl r0 = r4.f7931j
            com.google.android.gms.internal.ads.j9 r3 = e8.jl.f15155a
            r0.I0(r3)
            if (r6 != 0) goto L_0x0063
            android.content.Context r6 = r4.f7929h
        L_0x0063:
            com.google.android.gms.internal.ads.t9 r0 = r4.f7932k     // Catch:{ um -> 0x0072 }
            r0.a(r5, r6)     // Catch:{ um -> 0x0072 }
            e8.kl r5 = r4.f7931j     // Catch:{ um -> 0x0072 }
            com.google.android.gms.internal.ads.j9 r6 = e8.ml.f15526a     // Catch:{ um -> 0x0072 }
            r5.I0(r6)     // Catch:{ um -> 0x0072 }
            r4.f7936o = r2
            return r2
        L_0x0072:
            r5 = move-exception
            e8.ri r6 = r4.f7935n
            com.google.android.gms.internal.ads.g2 r0 = new com.google.android.gms.internal.ads.g2
            r0.<init>((e8.um) r5)
            r6.I0(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q9.c(boolean, android.app.Activity):boolean");
    }

    public final void finalize() throws Throwable {
        try {
            t7 t7Var = (t7) this.f7930i.get();
            if (((Boolean) ti0.f16763j.f16769f.a(t.W3)).booleanValue()) {
                if (!this.f7936o && t7Var != null) {
                    o50 o50 = h9.f14885e;
                    ((k9) o50).f15244a.execute(new im(t7Var, 0));
                }
            } else if (t7Var != null) {
                t7Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
