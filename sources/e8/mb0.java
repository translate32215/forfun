package e8;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import f7.z;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mb0 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: u  reason: collision with root package name */
    public static final Handler f15482u = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final Context f15483a;

    /* renamed from: b  reason: collision with root package name */
    public Application f15484b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager f15485c;

    /* renamed from: d  reason: collision with root package name */
    public final KeyguardManager f15486d;

    /* renamed from: e  reason: collision with root package name */
    public BroadcastReceiver f15487e;

    /* renamed from: f  reason: collision with root package name */
    public final fb0 f15488f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<ViewTreeObserver> f15489g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f15490h;

    /* renamed from: i  reason: collision with root package name */
    public z80 f15491i;

    /* renamed from: r  reason: collision with root package name */
    public byte f15492r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f15493s = -1;

    /* renamed from: t  reason: collision with root package name */
    public long f15494t = -3;

    public mb0(Context context, fb0 fb0) {
        Context applicationContext = context.getApplicationContext();
        this.f15483a = applicationContext;
        this.f15488f = fb0;
        this.f15485c = (PowerManager) applicationContext.getSystemService("power");
        this.f15486d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f15484b = (Application) applicationContext;
            this.f15491i = new z80((Application) applicationContext, this);
        }
        e((View) null);
    }

    public final View a() {
        WeakReference<View> weakReference = this.f15490h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void b(Activity activity, int i10) {
        Window window;
        if (this.f15490h != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View a10 = a();
            if (a10 != null && peekDecorView != null && a10.getRootView() == peekDecorView.getRootView()) {
                this.f15493s = i10;
            }
        }
    }

    public final long c() {
        if (this.f15494t <= -2 && a() == null) {
            this.f15494t = -3;
        }
        return this.f15494t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0086, code lost:
        if (r7 == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r11.f15490h
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r11.a()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r11.f15494t = r2
            r11.f15492r = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0027
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0027:
            android.os.PowerManager r7 = r11.f15485c
            if (r7 == 0) goto L_0x0034
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0034
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0034:
            e8.fb0 r7 = r11.f15488f
            boolean r7 = r7.f14554a
            if (r7 != 0) goto L_0x008a
            android.app.KeyguardManager r7 = r11.f15486d
            if (r7 == 0) goto L_0x0089
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x0089
            int r7 = e8.lb0.f15378a
            android.view.View r7 = r0.getRootView()
            if (r7 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r7 = r0
        L_0x004e:
            android.content.Context r7 = r7.getContext()
            r8 = 0
        L_0x0053:
            boolean r9 = r7 instanceof android.content.ContextWrapper
            r10 = 0
            if (r9 == 0) goto L_0x006c
            r9 = 10
            if (r8 >= r9) goto L_0x006c
            boolean r9 = r7 instanceof android.app.Activity
            if (r9 == 0) goto L_0x0063
            android.app.Activity r7 = (android.app.Activity) r7
            goto L_0x006d
        L_0x0063:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r8 = r8 + 1
            goto L_0x0053
        L_0x006c:
            r7 = r10
        L_0x006d:
            if (r7 == 0) goto L_0x0085
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            android.view.WindowManager$LayoutParams r10 = r7.getAttributes()
        L_0x007a:
            if (r10 == 0) goto L_0x0085
            int r7 = r10.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0085
            r7 = 1
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            if (r5 != 0) goto L_0x008f
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x008f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x009d
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x009d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x00ab
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x00ab:
            int r0 = r0.getWindowVisibility()
            int r5 = r11.f15493s
            if (r5 == r1) goto L_0x00b4
            r0 = r5
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x00b9:
            byte r0 = r11.f15492r
            if (r0 == r4) goto L_0x00cb
            r11.f15492r = r4
            if (r4 != 0) goto L_0x00c6
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00c9
        L_0x00c6:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x00c9:
            r11.f15494t = r0
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mb0.d():void");
    }

    public final void e(View view) {
        View a10 = a();
        if (a10 != null) {
            a10.removeOnAttachStateChangeListener(this);
            g(a10);
        }
        this.f15490h = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                f(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f15494t = -2;
            return;
        }
        this.f15494t = -3;
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f15489g = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f15487e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            z zVar = new z(this);
            this.f15487e = zVar;
            this.f15483a.registerReceiver(zVar, intentFilter);
        }
        Application application = this.f15484b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f15491i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f15489g     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001b }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001b }
            if (r2 == 0) goto L_0x0019
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001b }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            r3.f15489g = r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002c }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002c }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f15487e
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f15483a     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f15487e = r0
        L_0x0038:
            android.app.Application r4 = r3.f15484b
            if (r4 == 0) goto L_0x0041
            e8.z80 r0 = r3.f15491i     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mb0.g(android.view.View):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        d();
    }

    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        d();
    }

    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        d();
        f15482u.post(new qz(this));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        d();
    }

    public final void onActivityStopped(Activity activity) {
        d();
    }

    public final void onGlobalLayout() {
        d();
    }

    public final void onScrollChanged() {
        d();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f15493s = -1;
        f(view);
        d();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f15493s = -1;
        d();
        f15482u.post(new qz(this));
        g(view);
    }
}
