package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.t7;
import e7.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f5642a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f5643b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f5644c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5645d;

    public b(t7 t7Var) throws g {
        this.f5643b = t7Var.getLayoutParams();
        ViewParent parent = t7Var.getParent();
        this.f5645d = t7Var.D0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f5644c = viewGroup;
        this.f5642a = viewGroup.indexOfChild(t7Var.getView());
        viewGroup.removeView(t7Var.getView());
        t7Var.H0(true);
    }
}
