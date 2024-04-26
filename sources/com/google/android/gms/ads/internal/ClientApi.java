package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.ed;
import com.google.android.gms.internal.ads.hd;
import com.google.android.gms.internal.ads.j4;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.ny;
import com.google.android.gms.internal.ads.r4;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.ry;
import com.google.android.gms.internal.ads.s2;
import e7.n;
import e7.o;
import e7.r;
import e8.ab0;
import e8.ce;
import e8.f9;
import e8.jc0;
import e8.li0;
import e8.m30;
import e8.mr;
import e8.mv;
import e8.nd;
import e8.yd;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class ClientApi extends ny {
    public final dy D1(a aVar, li0 li0, String str, s2 s2Var, int i10) {
        Context context = (Context) b.z0(aVar);
        mr r10 = b8.b(context, s2Var, i10).r();
        r10.getClass();
        context.getClass();
        r10.f15536a = context;
        li0.getClass();
        r10.f15538c = li0;
        str.getClass();
        r10.f15537b = str;
        jc0.f((Context) r10.f15536a, Context.class);
        jc0.f((String) r10.f15537b, String.class);
        jc0.f((li0) r10.f15538c, li0.class);
        return (hd) ((ab0) new m30((nd) r10.f15539d, (Context) r10.f15536a, (String) r10.f15537b, (li0) r10.f15538c).f15457g).get();
    }

    public final ry I5(a aVar, int i10) {
        return b8.z((Context) b.z0(aVar), i10).k();
    }

    public final r4 L4(a aVar) {
        Activity activity = (Activity) b.z0(aVar);
        AdOverlayInfoParcel i10 = AdOverlayInfoParcel.i(activity.getIntent());
        if (i10 == null) {
            return new n(activity);
        }
        int i11 = i10.f5617s;
        if (i11 == 1) {
            return new o(activity);
        }
        if (i11 == 2) {
            return new e7.b(activity);
        }
        if (i11 == 3) {
            return new e7.a(activity);
        }
        if (i11 == 4) {
            return new d(activity, i10);
        }
        if (i11 != 5) {
            return new n(activity);
        }
        return new r(activity);
    }

    public final ay M2(a aVar, String str, s2 s2Var, int i10) {
        Context context = (Context) b.z0(aVar);
        return new mv(b8.b(context, s2Var, i10), context, str);
    }

    public final dy T0(a aVar, li0 li0, String str, int i10) {
        return new c((Context) b.z0(aVar), li0, str, new f9((int) ModuleDescriptor.MODULE_VERSION, i10, true, false, false));
    }

    public final dy Y2(a aVar, li0 li0, String str, s2 s2Var, int i10) {
        Context context = (Context) b.z0(aVar);
        g m10 = b8.b(context, s2Var, i10).m();
        m10.getClass();
        context.getClass();
        m10.f21850a = context;
        li0.getClass();
        m10.f21852c = li0;
        str.getClass();
        m10.f21851b = str;
        jc0.f((Context) m10.f21850a, Context.class);
        jc0.f((String) m10.f21851b, String.class);
        jc0.f((li0) m10.f21852c, li0.class);
        Context context2 = (Context) m10.f21850a;
        String str2 = (String) m10.f21851b;
        li0 li02 = (li0) m10.f21852c;
        ce ceVar = new ce((nd) m10.f21853d, context2, str2, li02);
        return new ed(context2, li02, str2, ceVar.f14127h.get(), ceVar.f14125f.get());
    }

    public final j4 f0(a aVar, s2 s2Var, int i10) {
        return b8.b((Context) b.z0(aVar), s2Var, i10).x();
    }

    public final r5 m5(a aVar, s2 s2Var, int i10) {
        Context context = (Context) b.z0(aVar);
        yd u10 = b8.b(context, s2Var, i10).u();
        u10.getClass();
        context.getClass();
        u10.f17605a = context;
        Class<Context> cls = Context.class;
        return (ne) ((ab0) new ce(u10.f17607c, context, u10.f17606b).f14120a).get();
    }
}
