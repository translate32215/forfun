package e8;

import com.google.android.gms.internal.ads.ud;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ez implements aw<qf> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ud f14521a;

    public ez(ud udVar) {
        this.f14521a = udVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (r6.f14521a.f8241h.f14546c < ((java.lang.Integer) e8.ti0.f16763j.f16769f.a(e8.t.K2)).intValue()) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r7) {
        /*
            r6 = this;
            e8.qf r7 = (e8.qf) r7
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            e8.qf r0 = r0.f8244s
            if (r0 == 0) goto L_0x000b
            r0.a()
        L_0x000b:
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            r0.f8244s = r7
            android.view.ViewGroup r0 = r0.f8236c
            r0.removeAllViews()
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            android.view.ViewGroup r0 = r0.f8236c
            android.view.View r1 = r7.f16154h
            d7.l r2 = d7.l.B
            f7.m0 r2 = r2.f13188e
            android.view.ViewGroup$LayoutParams r2 = r2.o()
            r0.addView(r1, r2)
            boolean r0 = r7.f16157k
            if (r0 != 0) goto L_0x0041
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            e8.f9 r0 = r0.f8241h
            int r0 = r0.f14546c
            e8.l<java.lang.Integer> r1 = e8.t.K2
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 >= r1) goto L_0x00c0
        L_0x0041:
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            r0.getClass()
            boolean r1 = r7.c()
            e8.l<java.lang.Integer> r2 = e8.t.f16689y2
            e8.ti0 r3 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r3 = r3.f16769f
            java.lang.Object r2 = r3.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            e7.l r3 = new e7.l
            r3.<init>()
            r4 = 50
            r3.f13648d = r4
            r4 = 0
            if (r1 == 0) goto L_0x0068
            r5 = r2
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            r3.f13645a = r5
            if (r1 == 0) goto L_0x006f
            r1 = 0
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            r3.f13646b = r1
            r3.f13647c = r2
            e7.m r1 = new e7.m
            android.content.Context r2 = r0.f8235b
            r1.<init>(r2, r3, r0)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r0.<init>(r2, r2)
            r2 = 10
            r0.addRule(r2)
            boolean r2 = r7.c()
            if (r2 == 0) goto L_0x008f
            r2 = 11
            goto L_0x0091
        L_0x008f:
            r2 = 9
        L_0x0091:
            r0.addRule(r2)
            com.google.android.gms.internal.ads.t7 r2 = r7.f16155i
            r3 = 1
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r2.u0()
            if (r2 == 0) goto L_0x00a1
            r2 = 1
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            if (r2 == 0) goto L_0x00a9
            boolean r2 = r7.f16158l
            if (r2 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 == 0) goto L_0x00b4
            android.widget.ImageButton r2 = r1.f13649a
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x00b9
        L_0x00b4:
            android.widget.ImageButton r2 = r1.f13649a
            r2.setVisibility(r4)
        L_0x00b9:
            com.google.android.gms.internal.ads.ud r2 = r6.f14521a
            android.view.ViewGroup r2 = r2.f8236c
            r2.addView(r1, r0)
        L_0x00c0:
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            r0.getClass()
            com.google.android.gms.internal.ads.t7 r1 = r7.f16155i
            if (r1 == 0) goto L_0x00cc
            r1.x(r0)
        L_0x00cc:
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            android.view.ViewGroup r1 = r0.f8236c
            e8.li0 r0 = com.google.android.gms.internal.ads.ud.s6(r0)
            int r0 = r0.f15396c
            r1.setMinimumHeight(r0)
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            android.view.ViewGroup r1 = r0.f8236c
            e8.li0 r0 = com.google.android.gms.internal.ads.ud.s6(r0)
            int r0 = r0.f15399f
            r1.setMinimumWidth(r0)
            com.google.android.gms.internal.ads.ud r0 = r6.f14521a
            e8.hz r0 = r0.f8240g
            e8.ag r1 = new e8.ag
            com.google.android.gms.internal.ads.ud r2 = r6.f14521a
            r1.<init>(r7, r2)
            r0.getClass()
        L_0x00f4:
            e8.hz r2 = r0.f14963g
            if (r2 == 0) goto L_0x00fa
            r0 = r2
            goto L_0x00f4
        L_0x00fa:
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.av> r0 = r0.f14958b
            com.google.android.gms.internal.ads.ri r2 = new com.google.android.gms.internal.ads.ri
            r2.<init>((com.google.android.gms.internal.ads.yu) r1)
            androidx.activity.k.d(r0, r2)
            r7.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ez.a(java.lang.Object):void");
    }

    public final void w() {
        this.f14521a.f8244s = null;
    }
}
