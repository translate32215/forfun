package f7;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final g f18286a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18287b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18288c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18289d;

    public i(g gVar, int i10, int i11, int i12) {
        this.f18286a = gVar;
        this.f18287b = i10;
        this.f18288c = i11;
        this.f18289d = i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            f7.g r5 = r4.f18286a
            int r0 = r4.f18287b
            int r1 = r4.f18288c
            int r2 = r4.f18289d
            r5.getClass()
            if (r6 != r0) goto L_0x00a8
            android.content.Context r6 = r5.f18269a
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 != 0) goto L_0x001a
            java.lang.String r5 = "Can not create dialog without Activity Context"
            l0.e.J(r5)
            goto L_0x00d4
        L_0x001a:
            java.lang.String r6 = r5.f18270b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "\\+"
            java.lang.String r1 = "%20"
            java.lang.String r6 = r6.replaceAll(r0, r1)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r6 = r0.encodedQuery(r6)
            android.net.Uri r6 = r6.build()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            d7.l r1 = d7.l.B
            com.google.android.gms.ads.internal.util.p r1 = r1.f13186c
            java.util.Map r6 = com.google.android.gms.ads.internal.util.p.C(r6)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x004c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = " = "
            r0.append(r3)
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\n\n"
            r0.append(r2)
            goto L_0x004c
        L_0x006f:
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            java.lang.String r6 = "No debug information"
        L_0x0080:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r5.f18269a
            r0.<init>(r1)
            r0.setMessage(r6)
            java.lang.String r1 = "Ad Information"
            r0.setTitle(r1)
            f7.h r1 = new f7.h
            r1.<init>(r5, r6)
            java.lang.String r5 = "Share"
            r0.setPositiveButton(r5, r1)
            android.content.DialogInterface$OnClickListener r5 = f7.k.f18298a
            java.lang.String r6 = "Close"
            r0.setNegativeButton(r6, r5)
            android.app.AlertDialog r5 = r0.create()
            r5.show()
            goto L_0x00d4
        L_0x00a8:
            if (r6 != r1) goto L_0x00be
            java.lang.String r6 = "Debug mode [Creative Preview] selected."
            l0.e.E(r6)
            e8.o50 r6 = e8.h9.f14881a
            f7.j r0 = new f7.j
            r0.<init>((f7.g) r5)
            e8.k9 r6 = (e8.k9) r6
            java.util.concurrent.Executor r5 = r6.f15244a
            r5.execute(r0)
            goto L_0x00d4
        L_0x00be:
            if (r6 != r2) goto L_0x00d4
            java.lang.String r6 = "Debug mode [Troubleshooting] selected."
            l0.e.E(r6)
            e8.o50 r6 = e8.h9.f14881a
            f7.f r0 = new f7.f
            r1 = 1
            r0.<init>(r5, r1)
            e8.k9 r6 = (e8.k9) r6
            java.util.concurrent.Executor r5 = r6.f15244a
            r5.execute(r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.i.onClick(android.content.DialogInterface, int):void");
    }
}
