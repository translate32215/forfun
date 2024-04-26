package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.fn;
import e8.jn;
import e8.l1;
import e8.q9;
import java.util.Collections;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sa extends a2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, l1 {

    /* renamed from: a  reason: collision with root package name */
    public View f8107a;

    /* renamed from: b  reason: collision with root package name */
    public hz f8108b;

    /* renamed from: c  reason: collision with root package name */
    public fn f8109c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8110d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8111e = false;

    public sa(fn fnVar, jn jnVar) {
        this.f8107a = jnVar.n();
        this.f8108b = jnVar.h();
        this.f8109c = fnVar;
        if (jnVar.o() != null) {
            jnVar.o().n0(this);
        }
    }

    public static void t6(b2 b2Var, int i10) {
        try {
            b2Var.m2(i10);
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void destroy() throws RemoteException {
        i.d("#008 Must be called on the main UI thread.");
        u6();
        fn fnVar = this.f8109c;
        if (fnVar != null) {
            fnVar.a();
        }
        this.f8109c = null;
        this.f8107a = null;
        this.f8108b = null;
        this.f8110d = true;
    }

    public final void onGlobalLayout() {
        v6();
    }

    public final void onScrollChanged() {
        v6();
    }

    public final void s6(a aVar, b2 b2Var) throws RemoteException {
        i.d("#008 Must be called on the main UI thread.");
        if (this.f8110d) {
            e.I("Instream ad can not be shown after destroy().");
            t6(b2Var, 2);
            return;
        }
        View view = this.f8107a;
        if (view == null || this.f8108b == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            e.I(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            t6(b2Var, 0);
        } else if (this.f8111e) {
            e.I("Instream ad should not be used again.");
            t6(b2Var, 1);
        } else {
            this.f8111e = true;
            u6();
            ((ViewGroup) b.z0(aVar)).addView(this.f8107a, new ViewGroup.LayoutParams(-1, -1));
            q9 q9Var = l.B.A;
            q9.a(this.f8107a, this);
            q9 q9Var2 = l.B.A;
            q9.b(this.f8107a, this);
            v6();
            try {
                b2Var.W3();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void u6() {
        View view = this.f8107a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8107a);
            }
        }
    }

    public final void v6() {
        View view;
        fn fnVar = this.f8109c;
        if (fnVar != null && (view = this.f8107a) != null) {
            fnVar.g(view, Collections.emptyMap(), Collections.emptyMap(), fn.o(this.f8107a));
        }
    }
}
