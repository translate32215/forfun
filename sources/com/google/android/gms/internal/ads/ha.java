package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import d7.l;
import e8.co;
import e8.fn;
import e8.q9;
import e8.sg0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ha extends d0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, co {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f6834a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6835b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6836c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f6837d = new HashMap();
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public fn f6838e;

    /* renamed from: f  reason: collision with root package name */
    public sg0 f6839f;

    public ha(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        q9 q9Var = l.B.A;
        q9.a(view, this);
        q9 q9Var2 = l.B.A;
        q9.b(view, this);
        this.f6834a = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f6835b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f6837d.putAll(this.f6835b);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f6836c.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f6837d.putAll(this.f6836c);
        this.f6839f = new sg0(view.getContext(), view);
    }

    public final synchronized Map<String, WeakReference<View>> B5() {
        return this.f6835b;
    }

    public final View E1() {
        return (View) this.f6834a.get();
    }

    public final synchronized View G3(String str) {
        WeakReference weakReference = this.f6837d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized Map<String, WeakReference<View>> H1() {
        return this.f6836c;
    }

    public final sg0 Q5() {
        return this.f6839f;
    }

    public final synchronized JSONObject Y() {
        return null;
    }

    public final synchronized a b2() {
        return null;
    }

    public final synchronized Map<String, WeakReference<View>> d4() {
        return this.f6837d;
    }

    public final synchronized String i3() {
        return "1007";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void j2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6837d     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6835b     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha.j2(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized void onClick(View view) {
        fn fnVar = this.f6838e;
        if (fnVar != null) {
            fnVar.c(view, E1(), d4(), B5(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        fn fnVar = this.f6838e;
        if (fnVar != null) {
            fnVar.g(E1(), d4(), B5(), fn.o(E1()));
        }
    }

    public final synchronized void onScrollChanged() {
        fn fnVar = this.f6838e;
        if (fnVar != null) {
            fnVar.g(E1(), d4(), B5(), fn.o(E1()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        fn fnVar = this.f6838e;
        if (fnVar != null) {
            View E1 = E1();
            synchronized (fnVar) {
                fnVar.f14654j.k(view, motionEvent, E1);
            }
        }
        return false;
    }

    public final synchronized void s6(a aVar) {
        Object z02 = b.z0(aVar);
        if (!(z02 instanceof fn)) {
            e.K("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        fn fnVar = this.f6838e;
        if (fnVar != null) {
            fnVar.i(this);
        }
        if (((fn) z02).f14656l.d()) {
            fn fnVar2 = (fn) z02;
            this.f6838e = fnVar2;
            fnVar2.d(this);
            this.f6838e.e(E1());
            return;
        }
        e.I("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final FrameLayout u4() {
        return null;
    }
}
