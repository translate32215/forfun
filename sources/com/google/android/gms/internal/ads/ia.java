package com.google.android.gms.internal.ads;

import android.view.View;
import e8.cp;
import e8.ec;
import e8.hf;
import e8.li0;
import e8.pn;
import e8.xn;
import e8.yn;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ia {

    /* renamed from: a  reason: collision with root package name */
    public final cb f7055a;

    /* renamed from: b  reason: collision with root package name */
    public final cp f7056b;

    /* renamed from: c  reason: collision with root package name */
    public final hf f7057c;

    /* renamed from: d  reason: collision with root package name */
    public final pn f7058d;

    public ia(cb cbVar, cp cpVar, hf hfVar, pn pnVar) {
        this.f7055a = cbVar;
        this.f7056b = cpVar;
        this.f7057c = hfVar;
        this.f7058d = pnVar;
    }

    public final View a() throws ec {
        t7 a10 = this.f7055a.a(li0.j(), (qe) null, (re) null);
        a10.getView().setVisibility(8);
        a10.r("/sendMessageToSdk", new yn(this, 0));
        a10.r("/adMuted", new xn(this, 0));
        this.f7056b.c(new WeakReference(a10), "/loadHtml", new yn(this, 1));
        this.f7056b.c(new WeakReference(a10), "/showOverlay", new xn(this, 1));
        this.f7056b.c(new WeakReference(a10), "/hideOverlay", new xn(this, 2));
        return a10.getView();
    }
}
