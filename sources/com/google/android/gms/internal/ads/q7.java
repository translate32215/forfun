package com.google.android.gms.internal.ads;

import android.content.Context;
import d7.l;
import e8.gb;
import e8.ia;
import e8.ib;
import e8.y8;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import t7.f;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class q7 implements f {

    /* renamed from: a  reason: collision with root package name */
    public Context f7919a;

    /* renamed from: b  reason: collision with root package name */
    public String f7920b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<ia> f7921c;

    public q7(ia iaVar) {
        Context context = iaVar.getContext();
        this.f7919a = context;
        this.f7920b = l.B.f13186c.H(context, iaVar.c().f14544a);
        this.f7921c = new WeakReference<>(iaVar);
    }

    public static void j(q7 q7Var, String str, Map map) {
        ia iaVar = (ia) q7Var.f7921c.get();
        if (iaVar != null) {
            iaVar.O(str, map);
        }
    }

    public void a() {
    }

    public abstract void h();

    public final void k(String str, String str2, int i10) {
        y8.f17578b.post(new gb(this, str, str2, i10));
    }

    public final void l(String str, String str2, String str3, String str4) {
        y8.f17578b.post(new ib(this, str, str2, str3, str4));
    }

    public void m(int i10) {
    }

    public void n(int i10) {
    }

    public void o(int i10) {
    }

    public void p(int i10) {
    }

    public boolean q(String str, String[] strArr) {
        return r(str);
    }

    public abstract boolean r(String str);

    public String s(String str) {
        return y8.h(str);
    }
}
