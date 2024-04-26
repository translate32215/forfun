package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.pv;
import e8.j8;
import e8.li;
import e8.ll;
import e8.p9;
import java.lang.reflect.Method;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x9 implements li, ll {

    /* renamed from: a  reason: collision with root package name */
    public final j8 f8510a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8511b;

    /* renamed from: c  reason: collision with root package name */
    public final p6 f8512c;

    /* renamed from: d  reason: collision with root package name */
    public final View f8513d;

    /* renamed from: e  reason: collision with root package name */
    public String f8514e;

    /* renamed from: f  reason: collision with root package name */
    public final pv.a f8515f;

    public x9(j8 j8Var, Context context, p6 p6Var, View view, pv.a aVar) {
        this.f8510a = j8Var;
        this.f8511b = context;
        this.f8512c = p6Var;
        this.f8513d = view;
        this.f8515f = aVar;
    }

    public final void C() {
        this.f8510a.a(false);
    }

    public final void F() {
        View view = this.f8513d;
        if (!(view == null || this.f8514e == null)) {
            p6 p6Var = this.f8512c;
            Context context = view.getContext();
            String str = this.f8514e;
            if (p6Var.p(context) && (context instanceof Activity)) {
                if (p6.g(context)) {
                    p6Var.e("setScreenName", new p9(context, str));
                } else if (p6Var.f(context, "com.google.firebase.analytics.FirebaseAnalytics", p6Var.f7817h, false)) {
                    Class<String> cls = String.class;
                    Method method = (Method) p6Var.f7818i.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                            p6Var.f7818i.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            p6Var.m("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(p6Var.f7817h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
                    } catch (Exception unused2) {
                        p6Var.m("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f8510a.a(true);
    }

    public final void J() {
    }

    public final void b() {
    }

    public final void c() {
        String str;
        p6 p6Var = this.f8512c;
        Context context = this.f8511b;
        if (!p6Var.p(context)) {
            str = "";
        } else if (p6.g(context)) {
            synchronized (p6Var.f7819j) {
                if (p6Var.f7819j.get() != null) {
                    try {
                        y7 y7Var = p6Var.f7819j.get();
                        String x42 = y7Var.x4();
                        if (x42 == null) {
                            x42 = y7Var.q2();
                            if (x42 == null) {
                                x42 = "";
                            }
                        }
                        str = x42;
                    } catch (Exception unused) {
                        p6Var.m("getCurrentScreenNameOrScreenClass", false);
                    }
                }
                str = "";
            }
        } else if (!p6Var.f(context, "com.google.android.gms.measurement.AppMeasurement", p6Var.f7816g, true)) {
            str = "";
        } else {
            try {
                String str2 = (String) p6Var.n(context, "getCurrentScreenName").invoke(p6Var.f7816g.get(), new Object[0]);
                String str3 = str2 == null ? (String) p6Var.n(context, "getCurrentScreenClass").invoke(p6Var.f7816g.get(), new Object[0]) : str2;
                str = str3 != null ? str3 : "";
            } catch (Exception unused2) {
                p6Var.m("getCurrentScreenName", false);
                str = "";
            }
        }
        this.f8514e = str;
        String valueOf = String.valueOf(str);
        String str4 = this.f8515f == pv.a.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f8514e = str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf);
    }

    public final void d0() {
    }

    public final void g0() {
    }

    @ParametersAreNonnullByDefault
    public final void t(m5 m5Var, String str, String str2) {
        if (this.f8512c.p(this.f8511b)) {
            try {
                p6 p6Var = this.f8512c;
                Context context = this.f8511b;
                p6Var.d(context, p6Var.j(context), this.f8510a.f15100c, m5Var.o(), m5Var.q0());
            } catch (RemoteException e10) {
                e.D("Remote Exception to get reward item.", e10);
            }
        }
    }
}
