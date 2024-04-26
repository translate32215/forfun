package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.a;
import e8.ao;
import e8.b6;
import e8.cp;
import e8.dt;
import e8.ec;
import e8.i3;
import e8.l2;
import e8.li0;
import e8.oq;
import e8.t20;
import e8.ti0;
import e8.y8;
import e8.zn;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ja {

    /* renamed from: a  reason: collision with root package name */
    public final cb f7137a;

    /* renamed from: b  reason: collision with root package name */
    public final cp f7138b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver.OnScrollChangedListener f7139c = null;

    public ja(cb cbVar, cp cpVar) {
        this.f7137a = cbVar;
        this.f7138b = cpVar;
    }

    public static int a(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        y8 y8Var = ti0.f16763j.f16764a;
        return y8.a(context.getResources().getDisplayMetrics(), i10);
    }

    public final View b(View view, WindowManager windowManager) throws ec {
        t7 a10 = this.f7137a.a(li0.j(), (qe) null, (re) null);
        a10.getView().setVisibility(4);
        a10.getView().setContentDescription("policy_validator");
        a10.r("/sendMessageToSdk", new l2(this));
        a10.r("/hideValidatorOverlay", new zn(this, windowManager, view));
        a10.r("/open", new i3((a) null, (b6) null, (dt) null, (oq) null, (t20) null));
        this.f7138b.c(new WeakReference(a10), "/loadNativeAdPolicyViolations", new zn(this, view, windowManager));
        this.f7138b.c(new WeakReference(a10), "/showValidatorOverlay", ao.f13735a);
        return a10.getView();
    }
}
