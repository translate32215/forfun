package e8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.l;
import com.google.android.gms.ads.internal.util.n;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.y6;
import f7.k0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import l0.e;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sg0 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: w  reason: collision with root package name */
    public static final long f16471w = ((Long) ti0.f16763j.f16769f.a(t.J0)).longValue();

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f16472x = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16473a;

    /* renamed from: b  reason: collision with root package name */
    public Application f16474b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager f16475c;

    /* renamed from: d  reason: collision with root package name */
    public final KeyguardManager f16476d;

    /* renamed from: e  reason: collision with root package name */
    public BroadcastReceiver f16477e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<ViewTreeObserver> f16478f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f16479g;

    /* renamed from: h  reason: collision with root package name */
    public wg0 f16480h;

    /* renamed from: i  reason: collision with root package name */
    public l f16481i = new l(f16471w);

    /* renamed from: r  reason: collision with root package name */
    public boolean f16482r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f16483s = -1;

    /* renamed from: t  reason: collision with root package name */
    public final HashSet<ug0> f16484t = new HashSet<>();

    /* renamed from: u  reason: collision with root package name */
    public final DisplayMetrics f16485u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f16486v;

    public sg0(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f16473a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f16475c = (PowerManager) applicationContext.getSystemService("power");
        this.f16476d = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f16474b = application;
            this.f16480h = new wg0(application, this);
        }
        this.f16485u = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f16486v = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f16479g;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            g(view2);
        }
        this.f16479g = new WeakReference<>(view);
        if (view != null) {
            if (d7.l.B.f13188e.b(view)) {
                f(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        return new Rect(d(rect.left), d(rect.top), d(rect.right), d(rect.bottom));
    }

    public final void b(Activity activity, int i10) {
        Window window;
        if (this.f16479g != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f16479g.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f16483s = i10;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r32) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            java.util.HashSet<e8.ug0> r0 = r1.f16484t
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f16479g
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L_0x001f
            r6 = 1
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r0 = 2
            int[] r12 = new int[r0]
            int[] r0 = new int[r0]
            if (r3 == 0) goto L_0x0075
            boolean r13 = r3.getGlobalVisibleRect(r9)
            boolean r14 = r3.getLocalVisibleRect(r10)
            r3.getHitRect(r11)
            r3.getLocationOnScreen(r12)     // Catch:{ Exception -> 0x0052 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r0 = move-exception
            java.lang.String r15 = "Failure getting view location."
            l0.e.C(r15, r0)
        L_0x0058:
            r0 = r12[r4]
            r8.left = r0
            r12 = r12[r5]
            r8.top = r12
            int r12 = r3.getWidth()
            int r12 = r12 + r0
            r8.right = r12
            int r0 = r8.top
            int r12 = r3.getHeight()
            int r12 = r12 + r0
            r8.bottom = r12
            r24 = r13
            r26 = r14
            goto L_0x0079
        L_0x0075:
            r24 = 0
            r26 = 0
        L_0x0079:
            e8.l<java.lang.Boolean> r0 = e8.t.M0
            e8.ti0 r12 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r12 = r12.f16769f
            java.lang.Object r0 = r12.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ba }
            r0.<init>()     // Catch:{ Exception -> 0x00ba }
            android.view.ViewParent r12 = r3.getParent()     // Catch:{ Exception -> 0x00ba }
        L_0x0096:
            boolean r13 = r12 instanceof android.view.View     // Catch:{ Exception -> 0x00ba }
            if (r13 == 0) goto L_0x00d5
            r13 = r12
            android.view.View r13 = (android.view.View) r13     // Catch:{ Exception -> 0x00ba }
            android.graphics.Rect r14 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ba }
            r14.<init>()     // Catch:{ Exception -> 0x00ba }
            boolean r15 = r13.isScrollContainer()     // Catch:{ Exception -> 0x00ba }
            if (r15 == 0) goto L_0x00b5
            boolean r13 = r13.getGlobalVisibleRect(r14)     // Catch:{ Exception -> 0x00ba }
            if (r13 == 0) goto L_0x00b5
            android.graphics.Rect r13 = r1.a(r14)     // Catch:{ Exception -> 0x00ba }
            r0.add(r13)     // Catch:{ Exception -> 0x00ba }
        L_0x00b5:
            android.view.ViewParent r12 = r12.getParent()     // Catch:{ Exception -> 0x00ba }
            goto L_0x0096
        L_0x00ba:
            r0 = move-exception
            d7.l r12 = d7.l.B
            com.google.android.gms.internal.ads.y6 r12 = r12.f13190g
            android.content.Context r13 = r12.f8584e
            e8.f9 r12 = r12.f8585f
            e8.v6 r12 = com.google.android.gms.internal.ads.a5.d(r13, r12)
            java.lang.String r13 = "PositionWatcher.getParentScrollViewRects"
            r12.c(r0, r13)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00d5
        L_0x00d1:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00d5:
            r30 = r0
            r0 = 8
            if (r3 == 0) goto L_0x00e0
            int r12 = r3.getWindowVisibility()
            goto L_0x00e2
        L_0x00e0:
            r12 = 8
        L_0x00e2:
            int r13 = r1.f16483s
            r14 = -1
            if (r13 == r14) goto L_0x00e8
            r12 = r13
        L_0x00e8:
            if (r7 != 0) goto L_0x0100
            d7.l r7 = d7.l.B
            com.google.android.gms.ads.internal.util.p r7 = r7.f13186c
            android.os.PowerManager r7 = r1.f16475c
            android.app.KeyguardManager r13 = r1.f16476d
            boolean r7 = com.google.android.gms.ads.internal.util.p.j(r3, r7, r13)
            if (r7 == 0) goto L_0x0100
            if (r24 == 0) goto L_0x0100
            if (r26 == 0) goto L_0x0100
            if (r12 != 0) goto L_0x0100
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r6 == 0) goto L_0x0110
            com.google.android.gms.ads.internal.util.l r6 = r1.f16481i
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0110
            boolean r6 = r1.f16482r
            if (r7 != r6) goto L_0x0110
            return
        L_0x0110:
            if (r7 != 0) goto L_0x0119
            boolean r6 = r1.f16482r
            if (r6 != 0) goto L_0x0119
            if (r2 != r5) goto L_0x0119
            return
        L_0x0119:
            e8.vg0 r2 = new e8.vg0
            d7.l r6 = d7.l.B
            z7.b r6 = r6.f13193j
            long r16 = r6.a()
            android.os.PowerManager r6 = r1.f16475c
            boolean r18 = r6.isScreenOn()
            if (r3 == 0) goto L_0x0138
            d7.l r6 = d7.l.B
            f7.m0 r6 = r6.f13188e
            boolean r6 = r6.b(r3)
            if (r6 == 0) goto L_0x0138
            r19 = 1
            goto L_0x013a
        L_0x0138:
            r19 = 0
        L_0x013a:
            if (r3 == 0) goto L_0x0143
            int r0 = r3.getWindowVisibility()
            r20 = r0
            goto L_0x0145
        L_0x0143:
            r20 = 8
        L_0x0145:
            android.graphics.Rect r0 = r1.f16486v
            android.graphics.Rect r21 = r1.a(r0)
            android.graphics.Rect r22 = r1.a(r8)
            android.graphics.Rect r23 = r1.a(r9)
            android.graphics.Rect r25 = r1.a(r10)
            android.graphics.Rect r27 = r1.a(r11)
            android.util.DisplayMetrics r0 = r1.f16485u
            float r0 = r0.density
            r15 = r2
            r28 = r0
            r29 = r7
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.util.HashSet<e8.ug0> r0 = r1.f16484t
            java.util.Iterator r0 = r0.iterator()
        L_0x016d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x017d
            java.lang.Object r3 = r0.next()
            e8.ug0 r3 = (e8.ug0) r3
            r3.t(r2)
            goto L_0x016d
        L_0x017d:
            r1.f16482r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.sg0.c(int):void");
    }

    public final int d(int i10) {
        return (int) (((float) i10) / this.f16485u.density);
    }

    public final void e() {
        p.f5702i.post(new s30(this));
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f16478f = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f16477e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            k0 k0Var = new k0(this);
            this.f16477e = k0Var;
            n nVar = d7.l.B.f13208y;
            Context context = this.f16473a;
            synchronized (nVar) {
                if (nVar.f5677d) {
                    nVar.f5675b.put(k0Var, intentFilter);
                } else {
                    context.registerReceiver(k0Var, intentFilter);
                }
            }
        }
        Application application = this.f16474b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f16480h);
            } catch (Exception e10) {
                e.C("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    public final void g(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f16478f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f16478f = null;
            }
        } catch (Exception e10) {
            e.C("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            e.C("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        BroadcastReceiver broadcastReceiver = this.f16477e;
        if (broadcastReceiver != null) {
            try {
                d7.l.B.f13208y.b(this.f16473a, broadcastReceiver);
            } catch (IllegalStateException e12) {
                e.C("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                y6 y6Var = d7.l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f16477e = null;
        }
        Application application = this.f16474b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f16480h);
            } catch (Exception e14) {
                e.C("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        e();
    }

    public final void onActivityDestroyed(Activity activity) {
        c(3);
        e();
    }

    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        e();
    }

    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        e();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        e();
    }

    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        e();
    }

    public final void onActivityStopped(Activity activity) {
        c(3);
        e();
    }

    public final void onGlobalLayout() {
        c(2);
        e();
    }

    public final void onScrollChanged() {
        c(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f16483s = -1;
        f(view);
        c(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f16483s = -1;
        c(3);
        e();
        g(view);
    }
}
