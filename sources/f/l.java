package f;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n1;
import androidx.appcompat.widget.t0;
import com.startapp.startappsdk.R;
import f.v;
import f.x;
import j.a;
import j.i;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import o0.j0;
import o0.k0;
import o0.o0;

/* compiled from: AppCompatDelegateImpl */
public class l extends k implements e.a, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    public static final s.i<String, Integer> f17872n0 = new s.i<>();

    /* renamed from: o0  reason: collision with root package name */
    public static final boolean f17873o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f17874p0 = {16842836};

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f17875q0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f17876r0 = true;

    /* renamed from: s0  reason: collision with root package name */
    public static boolean f17877s0 = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public C0136l[] M;
    public C0136l N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int Z = -100;

    /* renamed from: a0  reason: collision with root package name */
    public int f17878a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f17879b0;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17880c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f17881c0;

    /* renamed from: d  reason: collision with root package name */
    public final Context f17882d;

    /* renamed from: d0  reason: collision with root package name */
    public i f17883d0;

    /* renamed from: e  reason: collision with root package name */
    public Window f17884e;

    /* renamed from: e0  reason: collision with root package name */
    public i f17885e0;

    /* renamed from: f  reason: collision with root package name */
    public g f17886f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f17887f0;

    /* renamed from: g  reason: collision with root package name */
    public final j f17888g;

    /* renamed from: g0  reason: collision with root package name */
    public int f17889g0;

    /* renamed from: h  reason: collision with root package name */
    public a f17890h;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f17891h0 = new b();

    /* renamed from: i  reason: collision with root package name */
    public MenuInflater f17892i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f17893i0;

    /* renamed from: j0  reason: collision with root package name */
    public Rect f17894j0;

    /* renamed from: k0  reason: collision with root package name */
    public Rect f17895k0;

    /* renamed from: l0  reason: collision with root package name */
    public androidx.appcompat.app.c f17896l0;

    /* renamed from: m0  reason: collision with root package name */
    public cb.d f17897m0;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f17898r;

    /* renamed from: s  reason: collision with root package name */
    public i0 f17899s;

    /* renamed from: t  reason: collision with root package name */
    public e f17900t;

    /* renamed from: u  reason: collision with root package name */
    public m f17901u;

    /* renamed from: v  reason: collision with root package name */
    public j.a f17902v;

    /* renamed from: w  reason: collision with root package name */
    public ActionBarContextView f17903w;

    /* renamed from: x  reason: collision with root package name */
    public PopupWindow f17904x;

    /* renamed from: y  reason: collision with root package name */
    public Runnable f17905y;

    /* renamed from: z  reason: collision with root package name */
    public o0.i0 f17906z = null;

    /* compiled from: AppCompatDelegateImpl */
    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f17907a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f17907a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z10 = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z10 = true;
            }
            if (z10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f17907a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f17907a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = l.this;
            if ((lVar.f17889g0 & 1) != 0) {
                lVar.J(0);
            }
            l lVar2 = l.this;
            if ((lVar2.f17889g0 & 4096) != 0) {
                lVar2.J(108);
            }
            l lVar3 = l.this;
            lVar3.f17887f0 = false;
            lVar3.f17889g0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class c implements b {
        public c() {
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public interface d {
    }

    /* compiled from: AppCompatDelegateImpl */
    public final class e implements i.a {
        public e() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            l.this.F(eVar);
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback R = l.this.R();
            if (R == null) {
                return true;
            }
            R.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class f implements a.C0165a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0165a f17911a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends k0 {
            public a() {
            }

            public void b(View view) {
                l.this.f17903w.setVisibility(8);
                l lVar = l.this;
                PopupWindow popupWindow = lVar.f17904x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (lVar.f17903w.getParent() instanceof View) {
                    c0.A((View) l.this.f17903w.getParent());
                }
                l.this.f17903w.h();
                l.this.f17906z.d((j0) null);
                l lVar2 = l.this;
                lVar2.f17906z = null;
                c0.A(lVar2.B);
            }
        }

        public f(a.C0165a aVar) {
            this.f17911a = aVar;
        }

        public boolean a(j.a aVar, MenuItem menuItem) {
            return this.f17911a.a(aVar, menuItem);
        }

        public boolean b(j.a aVar, Menu menu) {
            return this.f17911a.b(aVar, menu);
        }

        public void c(j.a aVar) {
            this.f17911a.c(aVar);
            l lVar = l.this;
            if (lVar.f17904x != null) {
                lVar.f17884e.getDecorView().removeCallbacks(l.this.f17905y);
            }
            l lVar2 = l.this;
            if (lVar2.f17903w != null) {
                lVar2.K();
                l lVar3 = l.this;
                o0.i0 b10 = c0.b(lVar3.f17903w);
                b10.a(0.0f);
                lVar3.f17906z = b10;
                o0.i0 i0Var = l.this.f17906z;
                a aVar2 = new a();
                View view = (View) i0Var.f22585a.get();
                if (view != null) {
                    i0Var.e(view, aVar2);
                }
            }
            l lVar4 = l.this;
            j jVar = lVar4.f17888g;
            if (jVar != null) {
                jVar.i(lVar4.f17902v);
            }
            l lVar5 = l.this;
            lVar5.f17902v = null;
            c0.A(lVar5.B);
        }

        public boolean d(j.a aVar, Menu menu) {
            c0.A(l.this.B);
            return this.f17911a.d(aVar, menu);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class h extends i {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f17919c;

        public h(Context context) {
            super();
            this.f17919c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f17919c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        public void d() {
            l.this.B();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f17921a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                i.this.d();
            }
        }

        public i() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f17921a;
            if (broadcastReceiver != null) {
                try {
                    l.this.f17882d.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f17921a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f17921a == null) {
                    this.f17921a = new a();
                }
                l.this.f17882d.registerReceiver(this.f17921a, b10);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class j extends i {

        /* renamed from: c  reason: collision with root package name */
        public final x f17924c;

        public j(x xVar) {
            super();
            this.f17924c = xVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            boolean z10;
            long j10;
            x xVar = this.f17924c;
            x.a aVar = xVar.f17982c;
            boolean z11 = false;
            if (aVar.f17984b > System.currentTimeMillis()) {
                z10 = aVar.f17983a;
            } else {
                Location location = null;
                Location a10 = e.i.d(xVar.f17980a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? xVar.a("network") : null;
                if (e.i.d(xVar.f17980a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = xVar.a("gps");
                }
                if (location == null || a10 == null ? location != null : location.getTime() > a10.getTime()) {
                    a10 = location;
                }
                if (a10 != null) {
                    x.a aVar2 = xVar.f17982c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (w.f17975d == null) {
                        w.f17975d = new w();
                    }
                    w wVar = w.f17975d;
                    w wVar2 = wVar;
                    wVar2.a(currentTimeMillis - 86400000, a10.getLatitude(), a10.getLongitude());
                    wVar2.a(currentTimeMillis, a10.getLatitude(), a10.getLongitude());
                    if (wVar.f17978c == 1) {
                        z11 = true;
                    }
                    long j11 = wVar.f17977b;
                    long j12 = wVar.f17976a;
                    long j13 = j11;
                    wVar.a(currentTimeMillis + 86400000, a10.getLatitude(), a10.getLongitude());
                    long j14 = wVar.f17977b;
                    if (j13 == -1 || j12 == -1) {
                        j10 = 43200000 + currentTimeMillis;
                    } else {
                        j10 = (currentTimeMillis > j12 ? j14 + 0 : currentTimeMillis > j13 ? j12 + 0 : j13 + 0) + 60000;
                    }
                    aVar2.f17983a = z11;
                    aVar2.f17984b = j10;
                    z10 = aVar.f17983a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z11 = true;
                    }
                    z10 = z11;
                }
            }
            if (z10) {
                return 2;
            }
            return 1;
        }

        public void d() {
            l.this.B();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class k extends ContentFrameLayout {
        public k(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return l.this.I(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    l lVar = l.this;
                    lVar.G(lVar.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    /* renamed from: f.l$l  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    public static final class C0136l {

        /* renamed from: a  reason: collision with root package name */
        public int f17927a;

        /* renamed from: b  reason: collision with root package name */
        public int f17928b;

        /* renamed from: c  reason: collision with root package name */
        public int f17929c;

        /* renamed from: d  reason: collision with root package name */
        public int f17930d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f17931e;

        /* renamed from: f  reason: collision with root package name */
        public View f17932f;

        /* renamed from: g  reason: collision with root package name */
        public View f17933g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f17934h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f17935i;

        /* renamed from: j  reason: collision with root package name */
        public Context f17936j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f17937k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f17938l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f17939m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f17940n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f17941o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f17942p;

        public C0136l(int i10) {
            this.f17927a = i10;
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f17934h;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.t(this.f17935i);
                }
                this.f17934h = eVar;
                if (eVar != null && (cVar = this.f17935i) != null) {
                    eVar.b(cVar, eVar.f537a);
                }
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public final class m implements i.a {
        public m() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e k10 = eVar.k();
            boolean z11 = k10 != eVar;
            l lVar = l.this;
            if (z11) {
                eVar = k10;
            }
            C0136l N = lVar.N(eVar);
            if (N == null) {
                return;
            }
            if (z11) {
                l.this.E(N.f17927a, N, k10);
                l.this.G(N, true);
                return;
            }
            l.this.G(N, z10);
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback R;
            if (eVar != eVar.k()) {
                return true;
            }
            l lVar = l.this;
            if (!lVar.G || (R = lVar.R()) == null || l.this.R) {
                return true;
            }
            R.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        boolean z10 = Build.VERSION.SDK_INT < 21;
        f17873o0 = z10;
        if (z10 && !f17877s0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r4, android.view.Window r5, f.j r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f17906z = r0
            r1 = -100
            r3.Z = r1
            f.l$b r2 = new f.l$b
            r2.<init>()
            r3.f17891h0 = r2
            r3.f17882d = r4
            r3.f17888g = r6
            r3.f17880c = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L_0x003c
        L_0x001b:
            if (r4 == 0) goto L_0x002f
            boolean r6 = r4 instanceof f.i
            if (r6 == 0) goto L_0x0024
            f.i r4 = (f.i) r4
            goto L_0x0030
        L_0x0024:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001b
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x003c
            f.k r4 = r4.H()
            int r4 = r4.g()
            r3.Z = r4
        L_0x003c:
            int r4 = r3.Z
            if (r4 != r1) goto L_0x0067
            s.i<java.lang.String, java.lang.Integer> r4 = f17872n0
            java.lang.Object r6 = r3.f17880c
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0067
            int r6 = r6.intValue()
            r3.Z = r6
            java.lang.Object r6 = r3.f17880c
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r3.D(r5)
        L_0x006c:
            androidx.appcompat.widget.k.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.<init>(android.content.Context, android.view.Window, f.j, java.lang.Object):void");
    }

    public final void A(CharSequence charSequence) {
        this.f17898r = charSequence;
        i0 i0Var = this.f17899s;
        if (i0Var != null) {
            i0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f17890h;
        if (aVar != null) {
            aVar.r(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean B() {
        return C(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(boolean r14) {
        /*
            r13 = this;
            boolean r0 = r13.R
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r13.Z
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = -100
        L_0x000f:
            android.content.Context r2 = r13.f17882d
            int r2 = r13.U(r2, r0)
            android.content.Context r3 = r13.f17882d
            r4 = 0
            android.content.res.Configuration r2 = r13.H(r3, r2, r4, r1)
            android.content.Context r3 = r13.f17882d
            boolean r5 = r13.f17881c0
            r6 = 24
            r7 = 1
            if (r5 != 0) goto L_0x0069
            java.lang.Object r5 = r13.f17880c
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0069
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            if (r5 != 0) goto L_0x0033
            r3 = 0
            goto L_0x006d
        L_0x0033:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005f }
            r9 = 29
            if (r8 < r9) goto L_0x003c
            r8 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0042
        L_0x003c:
            if (r8 < r6) goto L_0x0041
            r8 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Object r10 = r13.f17880c     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x005f }
            r9.<init>(r3, r10)     // Catch:{ NameNotFoundException -> 0x005f }
            android.content.pm.ActivityInfo r3 = r5.getActivityInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x005f }
            if (r3 == 0) goto L_0x005b
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x005f }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            r13.f17879b0 = r3     // Catch:{ NameNotFoundException -> 0x005f }
            goto L_0x0069
        L_0x005f:
            r3 = move-exception
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r5, r8, r3)
            r13.f17879b0 = r1
        L_0x0069:
            r13.f17881c0 = r7
            boolean r3 = r13.f17879b0
        L_0x006d:
            android.content.res.Configuration r5 = r13.S
            if (r5 != 0) goto L_0x007b
            android.content.Context r5 = r13.f17882d
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
        L_0x007b:
            int r5 = r5.uiMode
            r5 = r5 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            r8 = 28
            if (r5 == r2) goto L_0x00c6
            if (r14 == 0) goto L_0x00c6
            if (r3 != 0) goto L_0x00c6
            boolean r14 = r13.P
            if (r14 == 0) goto L_0x00c6
            boolean r14 = f17875q0
            if (r14 != 0) goto L_0x0097
            boolean r14 = r13.Q
            if (r14 == 0) goto L_0x00c6
        L_0x0097:
            java.lang.Object r14 = r13.f17880c
            boolean r9 = r14 instanceof android.app.Activity
            if (r9 == 0) goto L_0x00c6
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r14 = r14.isChild()
            if (r14 != 0) goto L_0x00c6
            java.lang.Object r14 = r13.f17880c
            android.app.Activity r14 = (android.app.Activity) r14
            int r9 = androidx.core.app.b.f1381c
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r8) goto L_0x00b3
            r14.recreate()
            goto L_0x00c4
        L_0x00b3:
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r10 = r14.getMainLooper()
            r9.<init>(r10)
            androidx.activity.c r10 = new androidx.activity.c
            r10.<init>((android.app.Activity) r14)
            r9.post(r10)
        L_0x00c4:
            r14 = 1
            goto L_0x00c7
        L_0x00c6:
            r14 = 0
        L_0x00c7:
            if (r14 != 0) goto L_0x0204
            if (r5 == r2) goto L_0x0204
            android.content.Context r14 = r13.f17882d
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r5 = new android.content.res.Configuration
            android.content.res.Configuration r9 = r14.getConfiguration()
            r5.<init>(r9)
            android.content.res.Configuration r9 = r14.getConfiguration()
            int r9 = r9.uiMode
            r9 = r9 & -49
            r2 = r2 | r9
            r5.uiMode = r2
            r14.updateConfiguration(r5, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            r10 = 23
            if (r2 >= r9) goto L_0x01b8
            if (r2 < r8) goto L_0x00f4
            goto L_0x01b8
        L_0x00f4:
            java.lang.String r8 = "mDrawableCache"
            java.lang.String r9 = "ResourcesFlusher"
            if (r2 < r6) goto L_0x0159
            boolean r2 = f.u.f17960h
            if (r2 != 0) goto L_0x0114
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r6 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x010c }
            f.u.f17959g = r2     // Catch:{ NoSuchFieldException -> 0x010c }
            r2.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x010c }
            goto L_0x0112
        L_0x010c:
            r2 = move-exception
            java.lang.String r6 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r9, r6, r2)
        L_0x0112:
            f.u.f17960h = r7
        L_0x0114:
            java.lang.reflect.Field r2 = f.u.f17959g
            if (r2 != 0) goto L_0x011a
            goto L_0x01b8
        L_0x011a:
            java.lang.Object r14 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x011f }
            goto L_0x0126
        L_0x011f:
            r14 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r9, r2, r14)
            r14 = r4
        L_0x0126:
            if (r14 != 0) goto L_0x012a
            goto L_0x01b8
        L_0x012a:
            boolean r2 = f.u.f17954b
            if (r2 != 0) goto L_0x0144
            java.lang.Class r2 = r14.getClass()     // Catch:{ NoSuchFieldException -> 0x013c }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x013c }
            f.u.f17953a = r2     // Catch:{ NoSuchFieldException -> 0x013c }
            r2.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r2 = move-exception
            java.lang.String r6 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r9, r6, r2)
        L_0x0142:
            f.u.f17954b = r7
        L_0x0144:
            java.lang.reflect.Field r2 = f.u.f17953a
            if (r2 == 0) goto L_0x0153
            java.lang.Object r4 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x014d }
            goto L_0x0153
        L_0x014d:
            r14 = move-exception
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r9, r2, r14)
        L_0x0153:
            if (r4 == 0) goto L_0x01b8
            f.u.a(r4)
            goto L_0x01b8
        L_0x0159:
            java.lang.String r6 = "Could not retrieve Resources#mDrawableCache field"
            java.lang.String r11 = "Could not retrieve value from Resources#mDrawableCache"
            if (r2 < r10) goto L_0x0189
            boolean r2 = f.u.f17954b
            if (r2 != 0) goto L_0x0175
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x016f }
            f.u.f17953a = r2     // Catch:{ NoSuchFieldException -> 0x016f }
            r2.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x016f }
            goto L_0x0173
        L_0x016f:
            r2 = move-exception
            android.util.Log.e(r9, r6, r2)
        L_0x0173:
            f.u.f17954b = r7
        L_0x0175:
            java.lang.reflect.Field r2 = f.u.f17953a
            if (r2 == 0) goto L_0x0182
            java.lang.Object r4 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x017e }
            goto L_0x0182
        L_0x017e:
            r14 = move-exception
            android.util.Log.e(r9, r11, r14)
        L_0x0182:
            if (r4 != 0) goto L_0x0185
            goto L_0x01b8
        L_0x0185:
            f.u.a(r4)
            goto L_0x01b8
        L_0x0189:
            r12 = 21
            if (r2 < r12) goto L_0x01b8
            boolean r2 = f.u.f17954b
            if (r2 != 0) goto L_0x01a3
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x019d }
            f.u.f17953a = r2     // Catch:{ NoSuchFieldException -> 0x019d }
            r2.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r2 = move-exception
            android.util.Log.e(r9, r6, r2)
        L_0x01a1:
            f.u.f17954b = r7
        L_0x01a3:
            java.lang.reflect.Field r2 = f.u.f17953a
            if (r2 == 0) goto L_0x01b8
            java.lang.Object r14 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x01af }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ IllegalAccessException -> 0x01af }
            r4 = r14
            goto L_0x01b3
        L_0x01af:
            r14 = move-exception
            android.util.Log.e(r9, r11, r14)
        L_0x01b3:
            if (r4 == 0) goto L_0x01b8
            r4.clear()
        L_0x01b8:
            int r14 = r13.f17878a0
            if (r14 == 0) goto L_0x01d0
            android.content.Context r2 = r13.f17882d
            r2.setTheme(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r10) goto L_0x01d0
            android.content.Context r14 = r13.f17882d
            android.content.res.Resources$Theme r14 = r14.getTheme()
            int r2 = r13.f17878a0
            r14.applyStyle(r2, r7)
        L_0x01d0:
            if (r3 == 0) goto L_0x0205
            java.lang.Object r14 = r13.f17880c
            boolean r2 = r14 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0205
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r2 = r14 instanceof androidx.lifecycle.t
            if (r2 == 0) goto L_0x01f8
            r2 = r14
            androidx.lifecycle.t r2 = (androidx.lifecycle.t) r2
            androidx.lifecycle.o r2 = r2.c()
            androidx.lifecycle.o$c r2 = r2.b()
            androidx.lifecycle.o$c r3 = androidx.lifecycle.o.c.CREATED
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x01f2
            r1 = 1
        L_0x01f2:
            if (r1 == 0) goto L_0x0205
            r14.onConfigurationChanged(r5)
            goto L_0x0205
        L_0x01f8:
            boolean r1 = r13.Q
            if (r1 == 0) goto L_0x0205
            boolean r1 = r13.R
            if (r1 != 0) goto L_0x0205
            r14.onConfigurationChanged(r5)
            goto L_0x0205
        L_0x0204:
            r7 = r14
        L_0x0205:
            if (r7 == 0) goto L_0x0212
            java.lang.Object r14 = r13.f17880c
            boolean r1 = r14 instanceof f.i
            if (r1 == 0) goto L_0x0212
            f.i r14 = (f.i) r14
            r14.getClass()
        L_0x0212:
            if (r0 != 0) goto L_0x021e
            android.content.Context r14 = r13.f17882d
            f.l$i r14 = r13.P(r14)
            r14.e()
            goto L_0x0225
        L_0x021e:
            f.l$i r14 = r13.f17883d0
            if (r14 == 0) goto L_0x0225
            r14.a()
        L_0x0225:
            r14 = 3
            if (r0 != r14) goto L_0x023b
            android.content.Context r14 = r13.f17882d
            f.l$i r0 = r13.f17885e0
            if (r0 != 0) goto L_0x0235
            f.l$h r0 = new f.l$h
            r0.<init>(r14)
            r13.f17885e0 = r0
        L_0x0235:
            f.l$i r14 = r13.f17885e0
            r14.e()
            goto L_0x0242
        L_0x023b:
            f.l$i r14 = r13.f17885e0
            if (r14 == 0) goto L_0x0242
            r14.a()
        L_0x0242:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.C(boolean):boolean");
    }

    public final void D(Window window) {
        if (this.f17884e == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof g)) {
                g gVar = new g(callback);
                this.f17886f = gVar;
                window.setCallback(gVar);
                g1 q10 = g1.q(this.f17882d, (AttributeSet) null, f17874p0);
                Drawable h10 = q10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                q10.f924b.recycle();
                this.f17884e = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public void E(int i10, C0136l lVar, Menu menu) {
        if (menu == null) {
            menu = lVar.f17934h;
        }
        if (lVar.f17939m && !this.R) {
            g gVar = this.f17886f;
            Window.Callback callback = this.f17884e.getCallback();
            gVar.getClass();
            try {
                gVar.f17917e = true;
                callback.onPanelClosed(i10, menu);
                gVar.f17917e = false;
            } catch (Throwable th) {
                gVar.f17917e = false;
                throw th;
            }
        }
    }

    public void F(androidx.appcompat.view.menu.e eVar) {
        if (!this.L) {
            this.L = true;
            this.f17899s.l();
            Window.Callback R2 = R();
            if (R2 != null && !this.R) {
                R2.onPanelClosed(108, eVar);
            }
            this.L = false;
        }
    }

    public void G(C0136l lVar, boolean z10) {
        ViewGroup viewGroup;
        i0 i0Var;
        if (!z10 || lVar.f17927a != 0 || (i0Var = this.f17899s) == null || !i0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f17882d.getSystemService("window");
            if (!(windowManager == null || !lVar.f17939m || (viewGroup = lVar.f17931e) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    E(lVar.f17927a, lVar, (Menu) null);
                }
            }
            lVar.f17937k = false;
            lVar.f17938l = false;
            lVar.f17939m = false;
            lVar.f17932f = null;
            lVar.f17940n = true;
            if (this.N == lVar) {
                this.N = null;
                return;
            }
            return;
        }
        F(lVar.f17934h);
    }

    public final Configuration H(Context context, int i10, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f17880c
            boolean r1 = r0 instanceof o0.f.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof f.s
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f17884e
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = o0.f.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            r3 = 0
            if (r0 != r1) goto L_0x003d
            f.l$g r0 = r6.f17886f
            android.view.Window r4 = r6.f17884e
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f17916d = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f17916d = r3
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f17916d = r3
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0065
            if (r0 == r1) goto L_0x0052
            goto L_0x0071
        L_0x0052:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0129
            f.l$l r0 = r6.Q(r3)
            boolean r1 = r0.f17939m
            if (r1 != 0) goto L_0x0129
            r6.X(r0, r7)
            goto L_0x0129
        L_0x0065:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            r6.O = r2
        L_0x0071:
            r2 = 0
            goto L_0x0129
        L_0x0074:
            if (r0 == r5) goto L_0x00fd
            if (r0 == r1) goto L_0x0079
            goto L_0x0071
        L_0x0079:
            j.a r0 = r6.f17902v
            if (r0 == 0) goto L_0x007f
            goto L_0x0129
        L_0x007f:
            f.l$l r0 = r6.Q(r3)
            androidx.appcompat.widget.i0 r1 = r6.f17899s
            if (r1 == 0) goto L_0x00b9
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00b9
            android.content.Context r1 = r6.f17882d
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00b9
            androidx.appcompat.widget.i0 r1 = r6.f17899s
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00b2
            boolean r1 = r6.R
            if (r1 != 0) goto L_0x00d9
            boolean r7 = r6.X(r0, r7)
            if (r7 == 0) goto L_0x00d9
            androidx.appcompat.widget.i0 r7 = r6.f17899s
            boolean r7 = r7.f()
            goto L_0x00df
        L_0x00b2:
            androidx.appcompat.widget.i0 r7 = r6.f17899s
            boolean r7 = r7.e()
            goto L_0x00df
        L_0x00b9:
            boolean r1 = r0.f17939m
            if (r1 != 0) goto L_0x00db
            boolean r4 = r0.f17938l
            if (r4 == 0) goto L_0x00c2
            goto L_0x00db
        L_0x00c2:
            boolean r1 = r0.f17937k
            if (r1 == 0) goto L_0x00d9
            boolean r1 = r0.f17941o
            if (r1 == 0) goto L_0x00d1
            r0.f17937k = r3
            boolean r1 = r6.X(r0, r7)
            goto L_0x00d2
        L_0x00d1:
            r1 = 1
        L_0x00d2:
            if (r1 == 0) goto L_0x00d9
            r6.V(r0, r7)
            r7 = 1
            goto L_0x00df
        L_0x00d9:
            r7 = 0
            goto L_0x00df
        L_0x00db:
            r6.G(r0, r2)
            r7 = r1
        L_0x00df:
            if (r7 == 0) goto L_0x0129
            android.content.Context r7 = r6.f17882d
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00f5
            r7.playSoundEffect(r3)
            goto L_0x0129
        L_0x00f5:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0129
        L_0x00fd:
            boolean r7 = r6.O
            r6.O = r3
            f.l$l r0 = r6.Q(r3)
            boolean r1 = r0.f17939m
            if (r1 == 0) goto L_0x010f
            if (r7 != 0) goto L_0x0129
            r6.G(r0, r2)
            goto L_0x0129
        L_0x010f:
            j.a r7 = r6.f17902v
            if (r7 == 0) goto L_0x0117
            r7.c()
            goto L_0x0124
        L_0x0117:
            r6.S()
            f.a r7 = r6.f17890h
            if (r7 == 0) goto L_0x0126
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0126
        L_0x0124:
            r7 = 1
            goto L_0x0127
        L_0x0126:
            r7 = 0
        L_0x0127:
            if (r7 == 0) goto L_0x0071
        L_0x0129:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.I(android.view.KeyEvent):boolean");
    }

    public void J(int i10) {
        C0136l Q2 = Q(i10);
        if (Q2.f17934h != null) {
            Bundle bundle = new Bundle();
            Q2.f17934h.w(bundle);
            if (bundle.size() > 0) {
                Q2.f17942p = bundle;
            }
            Q2.f17934h.A();
            Q2.f17934h.clear();
        }
        Q2.f17941o = true;
        Q2.f17940n = true;
        if ((i10 == 108 || i10 == 0) && this.f17899s != null) {
            C0136l Q3 = Q(0);
            Q3.f17937k = false;
            X(Q3, (KeyEvent) null);
        }
    }

    public void K() {
        o0.i0 i0Var = this.f17906z;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public final void L() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.A) {
            TypedArray obtainStyledAttributes = this.f17882d.obtainStyledAttributes(e.l.f13510j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    u(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    u(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    u(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    u(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                M();
                this.f17884e.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f17882d);
                if (this.K) {
                    viewGroup = this.I ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.J) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.H = false;
                    this.G = false;
                } else if (this.G) {
                    TypedValue typedValue = new TypedValue();
                    this.f17882d.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new j.c(this.f17882d, typedValue.resourceId);
                    } else {
                        context = this.f17882d;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    i0 i0Var = (i0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f17899s = i0Var;
                    i0Var.setWindowCallback(R());
                    if (this.H) {
                        this.f17899s.k(109);
                    }
                    if (this.E) {
                        this.f17899s.k(2);
                    }
                    if (this.F) {
                        this.f17899s.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0.J(viewGroup, new m(this));
                    } else if (viewGroup instanceof m0) {
                        ((m0) viewGroup).setOnFitSystemWindowsListener(new n(this));
                    }
                    if (this.f17899s == null) {
                        this.C = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = n1.f1037a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (IllegalAccessException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f17884e.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f17884e.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new o(this));
                    this.B = viewGroup;
                    Object obj = this.f17880c;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f17898r;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        i0 i0Var2 = this.f17899s;
                        if (i0Var2 != null) {
                            i0Var2.setWindowTitle(charSequence);
                        } else {
                            a aVar = this.f17890h;
                            if (aVar != null) {
                                aVar.r(charSequence);
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(16908290);
                    View decorView = this.f17884e.getDecorView();
                    contentFrameLayout2.f695g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (c0.r(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f17882d.obtainStyledAttributes(e.l.f13510j);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    C0136l Q2 = Q(0);
                    if (!this.R && Q2.f17934h == null) {
                        T(108);
                        return;
                    }
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a10.append(this.G);
                a10.append(", windowActionBarOverlay: ");
                a10.append(this.H);
                a10.append(", android:windowIsFloating: ");
                a10.append(this.J);
                a10.append(", windowActionModeOverlay: ");
                a10.append(this.I);
                a10.append(", windowNoTitle: ");
                a10.append(this.K);
                a10.append(" }");
                throw new IllegalArgumentException(a10.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void M() {
        if (this.f17884e == null) {
            Object obj = this.f17880c;
            if (obj instanceof Activity) {
                D(((Activity) obj).getWindow());
            }
        }
        if (this.f17884e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public C0136l N(Menu menu) {
        C0136l[] lVarArr = this.M;
        int length = lVarArr != null ? lVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            C0136l lVar = lVarArr[i10];
            if (lVar != null && lVar.f17934h == menu) {
                return lVar;
            }
        }
        return null;
    }

    public final Context O() {
        S();
        a aVar = this.f17890h;
        Context e10 = aVar != null ? aVar.e() : null;
        return e10 == null ? this.f17882d : e10;
    }

    public final i P(Context context) {
        if (this.f17883d0 == null) {
            if (x.f17979d == null) {
                Context applicationContext = context.getApplicationContext();
                x.f17979d = new x(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f17883d0 = new j(x.f17979d);
        }
        return this.f17883d0;
    }

    public C0136l Q(int i10) {
        C0136l[] lVarArr = this.M;
        if (lVarArr == null || lVarArr.length <= i10) {
            C0136l[] lVarArr2 = new C0136l[(i10 + 1)];
            if (lVarArr != null) {
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            }
            this.M = lVarArr2;
            lVarArr = lVarArr2;
        }
        C0136l lVar = lVarArr[i10];
        if (lVar != null) {
            return lVar;
        }
        C0136l lVar2 = new C0136l(i10);
        lVarArr[i10] = lVar2;
        return lVar2;
    }

    public final Window.Callback R() {
        return this.f17884e.getCallback();
    }

    public final void S() {
        L();
        if (this.G && this.f17890h == null) {
            Object obj = this.f17880c;
            if (obj instanceof Activity) {
                this.f17890h = new y((Activity) this.f17880c, this.H);
            } else if (obj instanceof Dialog) {
                this.f17890h = new y((Dialog) this.f17880c);
            }
            a aVar = this.f17890h;
            if (aVar != null) {
                aVar.l(this.f17893i0);
            }
        }
    }

    public final void T(int i10) {
        this.f17889g0 = (1 << i10) | this.f17889g0;
        if (!this.f17887f0) {
            View decorView = this.f17884e.getDecorView();
            Runnable runnable = this.f17891h0;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.m(decorView, runnable);
            this.f17887f0 = true;
        }
    }

    public int U(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        if (this.f17885e0 == null) {
                            this.f17885e0 = new h(context);
                        }
                        return this.f17885e0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return P(context).c();
            } else {
                return -1;
            }
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
        if (r14 != null) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(f.l.C0136l r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f17939m
            if (r0 != 0) goto L_0x01cb
            boolean r0 = r12.R
            if (r0 == 0) goto L_0x000a
            goto L_0x01cb
        L_0x000a:
            int r0 = r13.f17927a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f17882d
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.R()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f17927a
            androidx.appcompat.view.menu.e r4 = r13.f17934h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.G(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f17882d
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.X(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f17931e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r5 = r13.f17940n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f17933g
            if (r14 == 0) goto L_0x01a8
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01a8
            int r14 = r14.width
            if (r14 != r4) goto L_0x01a8
            r5 = -1
            goto L_0x01a9
        L_0x006b:
            if (r14 != 0) goto L_0x00d9
            android.content.Context r14 = r12.O()
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130968581(0x7f040005, float:1.754582E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x0092
            r5.applyStyle(r6, r1)
        L_0x0092:
            r6 = 2130969528(0x7f0403b8, float:1.754774E38)
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x00a0
            r5.applyStyle(r4, r1)
            goto L_0x00a6
        L_0x00a0:
            r4 = 2132083258(0x7f15023a, float:1.9806653E38)
            r5.applyStyle(r4, r1)
        L_0x00a6:
            j.c r4 = new j.c
            r4.<init>((android.content.Context) r14, (int) r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f17936j = r4
            int[] r14 = e.l.f13510j
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 86
            int r4 = r14.getResourceId(r4, r2)
            r13.f17928b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f17930d = r4
            r14.recycle()
            f.l$k r14 = new f.l$k
            android.content.Context r4 = r13.f17936j
            r14.<init>(r4)
            r13.f17931e = r14
            r14 = 81
            r13.f17929c = r14
            goto L_0x00e8
        L_0x00d9:
            boolean r4 = r13.f17940n
            if (r4 == 0) goto L_0x00e8
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00e8
            android.view.ViewGroup r14 = r13.f17931e
            r14.removeAllViews()
        L_0x00e8:
            android.view.View r14 = r13.f17933g
            if (r14 == 0) goto L_0x00ef
            r13.f17932f = r14
            goto L_0x014c
        L_0x00ef:
            androidx.appcompat.view.menu.e r14 = r13.f17934h
            if (r14 != 0) goto L_0x00f4
            goto L_0x014e
        L_0x00f4:
            f.l$m r14 = r12.f17901u
            if (r14 != 0) goto L_0x00ff
            f.l$m r14 = new f.l$m
            r14.<init>()
            r12.f17901u = r14
        L_0x00ff:
            f.l$m r14 = r12.f17901u
            androidx.appcompat.view.menu.c r4 = r13.f17935i
            if (r4 != 0) goto L_0x011a
            androidx.appcompat.view.menu.c r4 = new androidx.appcompat.view.menu.c
            android.content.Context r5 = r13.f17936j
            r6 = 2131623952(0x7f0e0010, float:1.887507E38)
            r4.<init>(r5, r6)
            r13.f17935i = r4
            r4.f526e = r14
            androidx.appcompat.view.menu.e r14 = r13.f17934h
            android.content.Context r5 = r14.f537a
            r14.b(r4, r5)
        L_0x011a:
            androidx.appcompat.view.menu.c r14 = r13.f17935i
            android.view.ViewGroup r4 = r13.f17931e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f525d
            if (r5 != 0) goto L_0x0146
            android.view.LayoutInflater r5 = r14.f523b
            r6 = 2131623949(0x7f0e000d, float:1.8875064E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f525d = r4
            androidx.appcompat.view.menu.c$a r4 = r14.f527f
            if (r4 != 0) goto L_0x013a
            androidx.appcompat.view.menu.c$a r4 = new androidx.appcompat.view.menu.c$a
            r4.<init>()
            r14.f527f = r4
        L_0x013a:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f525d
            androidx.appcompat.view.menu.c$a r5 = r14.f527f
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f525d
            r4.setOnItemClickListener(r14)
        L_0x0146:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f525d
            r13.f17932f = r14
            if (r14 == 0) goto L_0x014e
        L_0x014c:
            r14 = 1
            goto L_0x014f
        L_0x014e:
            r14 = 0
        L_0x014f:
            if (r14 == 0) goto L_0x01c9
            android.view.View r14 = r13.f17932f
            if (r14 != 0) goto L_0x0156
            goto L_0x016b
        L_0x0156:
            android.view.View r14 = r13.f17933g
            if (r14 == 0) goto L_0x015b
            goto L_0x0169
        L_0x015b:
            androidx.appcompat.view.menu.c r14 = r13.f17935i
            android.widget.ListAdapter r14 = r14.b()
            androidx.appcompat.view.menu.c$a r14 = (androidx.appcompat.view.menu.c.a) r14
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x016b
        L_0x0169:
            r14 = 1
            goto L_0x016c
        L_0x016b:
            r14 = 0
        L_0x016c:
            if (r14 != 0) goto L_0x016f
            goto L_0x01c9
        L_0x016f:
            android.view.View r14 = r13.f17932f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x017c
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x017c:
            int r4 = r13.f17928b
            android.view.ViewGroup r5 = r13.f17931e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f17932f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0194
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f17932f
            r4.removeView(r5)
        L_0x0194:
            android.view.ViewGroup r4 = r13.f17931e
            android.view.View r5 = r13.f17932f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f17932f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01a8
            android.view.View r14 = r13.f17932f
            r14.requestFocus()
        L_0x01a8:
            r5 = -2
        L_0x01a9:
            r13.f17938l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f17929c
            r14.gravity = r2
            int r2 = r13.f17930d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f17931e
            r0.addView(r2, r14)
            r13.f17939m = r1
            return
        L_0x01c9:
            r13.f17940n = r1
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.V(f.l$l, android.view.KeyEvent):void");
    }

    public final boolean W(C0136l lVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((lVar.f17937k || X(lVar, keyEvent)) && (eVar = lVar.f17934h) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f17899s == null) {
            G(lVar, true);
        }
        return z10;
    }

    public final boolean X(C0136l lVar, KeyEvent keyEvent) {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        Resources.Theme theme;
        i0 i0Var4;
        if (this.R) {
            return false;
        }
        if (lVar.f17937k) {
            return true;
        }
        C0136l lVar2 = this.N;
        if (!(lVar2 == null || lVar2 == lVar)) {
            G(lVar2, false);
        }
        Window.Callback R2 = R();
        if (R2 != null) {
            lVar.f17933g = R2.onCreatePanelView(lVar.f17927a);
        }
        int i10 = lVar.f17927a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (i0Var4 = this.f17899s) != null) {
            i0Var4.c();
        }
        if (lVar.f17933g == null && (!z10 || !(this.f17890h instanceof v))) {
            androidx.appcompat.view.menu.e eVar = lVar.f17934h;
            if (eVar == null || lVar.f17941o) {
                if (eVar == null) {
                    Context context = this.f17882d;
                    int i11 = lVar.f17927a;
                    if ((i11 == 0 || i11 == 108) && this.f17899s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            j.c cVar = new j.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.f541e = this;
                    lVar.a(eVar2);
                    if (lVar.f17934h == null) {
                        return false;
                    }
                }
                if (z10 && (i0Var3 = this.f17899s) != null) {
                    if (this.f17900t == null) {
                        this.f17900t = new e();
                    }
                    i0Var3.a(lVar.f17934h, this.f17900t);
                }
                lVar.f17934h.A();
                if (!R2.onCreatePanelMenu(lVar.f17927a, lVar.f17934h)) {
                    lVar.a((androidx.appcompat.view.menu.e) null);
                    if (z10 && (i0Var2 = this.f17899s) != null) {
                        i0Var2.a((Menu) null, this.f17900t);
                    }
                    return false;
                }
                lVar.f17941o = false;
            }
            lVar.f17934h.A();
            Bundle bundle = lVar.f17942p;
            if (bundle != null) {
                lVar.f17934h.u(bundle);
                lVar.f17942p = null;
            }
            if (!R2.onPreparePanel(0, lVar.f17933g, lVar.f17934h)) {
                if (z10 && (i0Var = this.f17899s) != null) {
                    i0Var.a((Menu) null, this.f17900t);
                }
                lVar.f17934h.z();
                return false;
            }
            lVar.f17934h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            lVar.f17934h.z();
        }
        lVar.f17937k = true;
        lVar.f17938l = false;
        this.N = lVar;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y() {
        /*
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.B
            if (r0 == 0) goto L_0x0010
            boolean r0 = o0.c0.r(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.Y():boolean");
    }

    public final void Z() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        C0136l N2;
        Window.Callback R2 = R();
        if (R2 == null || this.R || (N2 = N(eVar.k())) == null) {
            return false;
        }
        return R2.onMenuItemSelected(N2.f17927a, menuItem);
    }

    public final int a0(o0 o0Var, Rect rect) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i14;
        int i15 = 0;
        if (o0Var != null) {
            i10 = o0Var.f();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f17903w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f17903w.getLayoutParams();
            boolean z12 = true;
            if (this.f17903w.isShown()) {
                if (this.f17894j0 == null) {
                    this.f17894j0 = new Rect();
                    this.f17895k0 = new Rect();
                }
                Rect rect2 = this.f17894j0;
                Rect rect3 = this.f17895k0;
                if (o0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o0Var.d(), o0Var.f(), o0Var.e(), o0Var.c());
                }
                n1.a(this.B, rect2, rect3);
                int i16 = rect2.top;
                int i17 = rect2.left;
                int i18 = rect2.right;
                o0 o10 = c0.o(this.B);
                if (o10 == null) {
                    i11 = 0;
                } else {
                    i11 = o10.d();
                }
                if (o10 == null) {
                    i12 = 0;
                } else {
                    i12 = o10.e();
                }
                if (marginLayoutParams2.topMargin == i16 && marginLayoutParams2.leftMargin == i17 && marginLayoutParams2.rightMargin == i18) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i16;
                    marginLayoutParams2.leftMargin = i17;
                    marginLayoutParams2.rightMargin = i18;
                    z11 = true;
                }
                if (i16 <= 0 || this.D != null) {
                    View view = this.D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i14 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12))) {
                        marginLayoutParams.height = i14;
                        marginLayoutParams.leftMargin = i11;
                        marginLayoutParams.rightMargin = i12;
                        this.D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f17882d);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    View view4 = this.D;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    if ((c0.d.g(view4) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        i13 = d0.a.b(this.f17882d, R.color.abc_decor_view_status_guard_light);
                    } else {
                        i13 = d0.a.b(this.f17882d, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i13);
                }
                if (!this.I && z10) {
                    i10 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f17903w.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.D;
        if (view5 != null) {
            if (!z10) {
                i15 = 8;
            }
            view5.setVisibility(i15);
        }
        return i10;
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        i0 i0Var = this.f17899s;
        if (i0Var == null || !i0Var.g() || (ViewConfiguration.get(this.f17882d).hasPermanentMenuKey() && !this.f17899s.d())) {
            C0136l Q2 = Q(0);
            Q2.f17940n = true;
            G(Q2, false);
            V(Q2, (KeyEvent) null);
            return;
        }
        Window.Callback R2 = R();
        if (this.f17899s.b()) {
            this.f17899s.e();
            if (!this.R) {
                R2.onPanelClosed(108, Q(0).f17934h);
            }
        } else if (R2 != null && !this.R) {
            if (this.f17887f0 && (1 & this.f17889g0) != 0) {
                this.f17884e.getDecorView().removeCallbacks(this.f17891h0);
                this.f17891h0.run();
            }
            C0136l Q3 = Q(0);
            androidx.appcompat.view.menu.e eVar2 = Q3.f17934h;
            if (eVar2 != null && !Q3.f17941o && R2.onPreparePanel(0, Q3.f17933g, eVar2)) {
                R2.onMenuOpened(108, Q3.f17934h);
                this.f17899s.f();
            }
        }
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.f17886f.a(this.f17884e.getCallback());
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context d(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 1
            r10.P = r0
            int r1 = r10.Z
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = -100
        L_0x000c:
            int r1 = r10.U(r11, r1)
            boolean r2 = f17876r0
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0026
            boolean r2 = r11 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0026
            android.content.res.Configuration r2 = r10.H(r11, r1, r3, r4)
            r5 = r11
            android.view.ContextThemeWrapper r5 = (android.view.ContextThemeWrapper) r5     // Catch:{ IllegalStateException -> 0x0025 }
            r5.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0025 }
            return r11
        L_0x0025:
        L_0x0026:
            boolean r2 = r11 instanceof j.c
            if (r2 == 0) goto L_0x0036
            android.content.res.Configuration r2 = r10.H(r11, r1, r3, r4)
            r5 = r11
            j.c r5 = (j.c) r5     // Catch:{ IllegalStateException -> 0x0035 }
            r5.a(r2)     // Catch:{ IllegalStateException -> 0x0035 }
            return r11
        L_0x0035:
        L_0x0036:
            boolean r2 = f17875q0
            if (r2 != 0) goto L_0x003b
            return r11
        L_0x003b:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>()
            r6 = -1
            r5.uiMode = r6
            r6 = 0
            r5.fontScale = r6
            android.content.Context r5 = r11.createConfigurationContext(r5)
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.content.res.Resources r7 = r11.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r8 = r7.uiMode
            r5.uiMode = r8
            boolean r8 = r5.equals(r7)
            if (r8 != 0) goto L_0x0184
            android.content.res.Configuration r8 = new android.content.res.Configuration
            r8.<init>()
            r8.fontScale = r6
            int r6 = r5.diff(r7)
            if (r6 != 0) goto L_0x0075
            goto L_0x0185
        L_0x0075:
            float r6 = r5.fontScale
            float r9 = r7.fontScale
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x007f
            r8.fontScale = r9
        L_0x007f:
            int r6 = r5.mcc
            int r9 = r7.mcc
            if (r6 == r9) goto L_0x0087
            r8.mcc = r9
        L_0x0087:
            int r6 = r5.mnc
            int r9 = r7.mnc
            if (r6 == r9) goto L_0x008f
            r8.mnc = r9
        L_0x008f:
            r6 = 24
            if (r2 < r6) goto L_0x00a9
            android.os.LocaleList r6 = r5.getLocales()
            android.os.LocaleList r9 = r7.getLocales()
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x00b7
            r8.setLocales(r9)
            java.util.Locale r6 = r7.locale
            r8.locale = r6
            goto L_0x00b7
        L_0x00a9:
            java.util.Locale r6 = r5.locale
            java.util.Locale r9 = r7.locale
            boolean r6 = n0.b.a(r6, r9)
            if (r6 != 0) goto L_0x00b7
            java.util.Locale r6 = r7.locale
            r8.locale = r6
        L_0x00b7:
            int r6 = r5.touchscreen
            int r9 = r7.touchscreen
            if (r6 == r9) goto L_0x00bf
            r8.touchscreen = r9
        L_0x00bf:
            int r6 = r5.keyboard
            int r9 = r7.keyboard
            if (r6 == r9) goto L_0x00c7
            r8.keyboard = r9
        L_0x00c7:
            int r6 = r5.keyboardHidden
            int r9 = r7.keyboardHidden
            if (r6 == r9) goto L_0x00cf
            r8.keyboardHidden = r9
        L_0x00cf:
            int r6 = r5.navigation
            int r9 = r7.navigation
            if (r6 == r9) goto L_0x00d7
            r8.navigation = r9
        L_0x00d7:
            int r6 = r5.navigationHidden
            int r9 = r7.navigationHidden
            if (r6 == r9) goto L_0x00df
            r8.navigationHidden = r9
        L_0x00df:
            int r6 = r5.orientation
            int r9 = r7.orientation
            if (r6 == r9) goto L_0x00e7
            r8.orientation = r9
        L_0x00e7:
            int r6 = r5.screenLayout
            r6 = r6 & 15
            int r9 = r7.screenLayout
            r9 = r9 & 15
            if (r6 == r9) goto L_0x00f6
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x00f6:
            int r6 = r5.screenLayout
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r9 = r7.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r6 == r9) goto L_0x0105
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0105:
            int r6 = r5.screenLayout
            r6 = r6 & 48
            int r9 = r7.screenLayout
            r9 = r9 & 48
            if (r6 == r9) goto L_0x0114
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0114:
            int r6 = r5.screenLayout
            r6 = r6 & 768(0x300, float:1.076E-42)
            int r9 = r7.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r6 == r9) goto L_0x0123
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0123:
            r6 = 26
            if (r2 < r6) goto L_0x0145
            int r2 = r5.colorMode
            r2 = r2 & 3
            int r6 = r7.colorMode
            r6 = r6 & 3
            if (r2 == r6) goto L_0x0136
            int r2 = r8.colorMode
            r2 = r2 | r6
            r8.colorMode = r2
        L_0x0136:
            int r2 = r5.colorMode
            r2 = r2 & 12
            int r6 = r7.colorMode
            r6 = r6 & 12
            if (r2 == r6) goto L_0x0145
            int r2 = r8.colorMode
            r2 = r2 | r6
            r8.colorMode = r2
        L_0x0145:
            int r2 = r5.uiMode
            r2 = r2 & 15
            int r6 = r7.uiMode
            r6 = r6 & 15
            if (r2 == r6) goto L_0x0154
            int r2 = r8.uiMode
            r2 = r2 | r6
            r8.uiMode = r2
        L_0x0154:
            int r2 = r5.uiMode
            r2 = r2 & 48
            int r6 = r7.uiMode
            r6 = r6 & 48
            if (r2 == r6) goto L_0x0163
            int r2 = r8.uiMode
            r2 = r2 | r6
            r8.uiMode = r2
        L_0x0163:
            int r2 = r5.screenWidthDp
            int r6 = r7.screenWidthDp
            if (r2 == r6) goto L_0x016b
            r8.screenWidthDp = r6
        L_0x016b:
            int r2 = r5.screenHeightDp
            int r6 = r7.screenHeightDp
            if (r2 == r6) goto L_0x0173
            r8.screenHeightDp = r6
        L_0x0173:
            int r2 = r5.smallestScreenWidthDp
            int r6 = r7.smallestScreenWidthDp
            if (r2 == r6) goto L_0x017b
            r8.smallestScreenWidthDp = r6
        L_0x017b:
            int r2 = r5.densityDpi
            int r5 = r7.densityDpi
            if (r2 == r5) goto L_0x0185
            r8.densityDpi = r5
            goto L_0x0185
        L_0x0184:
            r8 = r3
        L_0x0185:
            android.content.res.Configuration r1 = r10.H(r11, r1, r8, r0)
            j.c r2 = new j.c
            r5 = 2132083270(0x7f150246, float:1.9806678E38)
            r2.<init>((android.content.Context) r11, (int) r5)
            r2.a(r1)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch:{ NullPointerException -> 0x019c }
            if (r11 == 0) goto L_0x019c
            r11 = 1
            goto L_0x019d
        L_0x019c:
            r11 = 0
        L_0x019d:
            if (r11 == 0) goto L_0x01ed
            android.content.res.Resources$Theme r11 = r2.getTheme()
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r1 < r5) goto L_0x01ad
            f0.l.a(r11)
            goto L_0x01ed
        L_0x01ad:
            r5 = 23
            if (r1 < r5) goto L_0x01ed
            java.lang.Object r1 = f0.k.f18060a
            monitor-enter(r1)
            boolean r5 = f0.k.f18062c     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x01d2
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01c8 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            f0.k.f18061b = r5     // Catch:{ NoSuchMethodException -> 0x01c8 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            goto L_0x01d0
        L_0x01c8:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01ea }
        L_0x01d0:
            f0.k.f18062c = r0     // Catch:{ all -> 0x01ea }
        L_0x01d2:
            java.lang.reflect.Method r0 = f0.k.f18061b     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01e8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            r0.invoke(r11, r4)     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            goto L_0x01e8
        L_0x01dc:
            r11 = move-exception
            goto L_0x01df
        L_0x01de:
            r11 = move-exception
        L_0x01df:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r4 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r4, r11)     // Catch:{ all -> 0x01ea }
            f0.k.f18061b = r3     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            monitor-exit(r1)     // Catch:{ all -> 0x01ea }
            goto L_0x01ed
        L_0x01ea:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ea }
            throw r11
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.d(android.content.Context):android.content.Context");
    }

    public <T extends View> T e(int i10) {
        L();
        return this.f17884e.findViewById(i10);
    }

    public final b f() {
        return new c();
    }

    public int g() {
        return this.Z;
    }

    public MenuInflater h() {
        if (this.f17892i == null) {
            S();
            a aVar = this.f17890h;
            this.f17892i = new j.g(aVar != null ? aVar.e() : this.f17882d);
        }
        return this.f17892i;
    }

    public a i() {
        S();
        return this.f17890h;
    }

    public void j() {
        LayoutInflater from = LayoutInflater.from(this.f17882d);
        if (from.getFactory() == null) {
            o0.g.b(from, this);
        } else if (!(from.getFactory2() instanceof l)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void k() {
        if (this.f17890h != null) {
            S();
            if (!this.f17890h.f()) {
                T(0);
            }
        }
    }

    public void l(Configuration configuration) {
        if (this.G && this.A) {
            S();
            a aVar = this.f17890h;
            if (aVar != null) {
                aVar.g(configuration);
            }
        }
        androidx.appcompat.widget.k a10 = androidx.appcompat.widget.k.a();
        Context context = this.f17882d;
        synchronized (a10) {
            t0 t0Var = a10.f968a;
            synchronized (t0Var) {
                s.f fVar = t0Var.f1101d.get(context);
                if (fVar != null) {
                    fVar.b();
                }
            }
        }
        this.S = new Configuration(this.f17882d.getResources().getConfiguration());
        C(false);
        configuration.updateFrom(this.f17882d.getResources().getConfiguration());
    }

    public void m(Bundle bundle) {
        this.P = true;
        C(false);
        M();
        Object obj = this.f17880c;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = androidx.core.app.c.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.f17890h;
                if (aVar == null) {
                    this.f17893i0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (k.f17871b) {
                k.t(this);
                k.f17870a.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.f17882d.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17880c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = f.k.f17871b
            monitor-enter(r0)
            f.k.t(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f17887f0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f17884e
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f17891h0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.R = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f17880c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            s.i<java.lang.String, java.lang.Integer> r0 = f17872n0
            java.lang.Object r1 = r3.f17880c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            s.i<java.lang.String, java.lang.Integer> r0 = f17872n0
            java.lang.Object r1 = r3.f17880c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            f.a r0 = r3.f17890h
            if (r0 == 0) goto L_0x0063
            r0.h()
        L_0x0063:
            f.l$i r0 = r3.f17883d0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            f.l$i r0 = r3.f17885e0
            if (r0 == 0) goto L_0x0071
            r0.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.n():void");
    }

    public void o(Bundle bundle) {
        L();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: j.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: androidx.appcompat.widget.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: androidx.appcompat.widget.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: androidx.appcompat.widget.AppCompatTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: androidx.appcompat.widget.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: androidx.appcompat.widget.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: androidx.appcompat.widget.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: androidx.appcompat.widget.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: androidx.appcompat.widget.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: androidx.appcompat.widget.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: org.xmlpull.v1.XmlPullParser} */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r13v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e5, code lost:
        if (r13.equals("TextView") == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e2, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x00f3;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0209 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028f A[Catch:{ Exception -> 0x02c3, all -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02af A[SYNTHETIC, Splitter:B:159:0x02af] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x00af A[EDGE_INSN: B:192:0x00af->B:34:0x00af ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[LOOP:0: B:19:0x0084->B:32:0x00aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.c r0 = r11.f17896l0
            r1 = 0
            if (r0 != 0) goto L_0x005b
            android.content.Context r0 = r11.f17882d
            int[] r2 = e.l.f13510j
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            androidx.appcompat.app.c r0 = new androidx.appcompat.app.c
            r0.<init>()
            r11.f17896l0 = r0
            goto L_0x005b
        L_0x001d:
            android.content.Context r2 = r11.f17882d     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0038 }
            androidx.appcompat.app.c r2 = (androidx.appcompat.app.c) r2     // Catch:{ all -> 0x0038 }
            r11.f17896l0 = r2     // Catch:{ all -> 0x0038 }
            goto L_0x005b
        L_0x0038:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.c r0 = new androidx.appcompat.app.c
            r0.<init>()
            r11.f17896l0 = r0
        L_0x005b:
            boolean r0 = f17873o0
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x010a
            cb.d r0 = r11.f17897m0
            if (r0 != 0) goto L_0x006e
            cb.d r0 = new cb.d
            r0.<init>((int) r5)
            r11.f17897m0 = r0
        L_0x006e:
            cb.d r0 = r11.f17897m0
            r0.getClass()
            boolean r6 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r6 == 0) goto L_0x00d5
            r7 = r15
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7
            int r8 = r7.getDepth()
            if (r8 != r5) goto L_0x00d5
            java.util.Set<cb.e> r8 = r0.f4374b
            java.util.Deque r8 = (java.util.Deque) r8
        L_0x0084:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00ae
            java.lang.Object r9 = r8.peek()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r9 = r9.get()
            org.xmlpull.v1.XmlPullParser r9 = (org.xmlpull.v1.XmlPullParser) r9
            if (r9 == 0) goto L_0x00a7
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a7 }
            if (r10 == r2) goto L_0x00a7
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a7 }
            if (r10 != r5) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r10 = 0
            goto L_0x00a8
        L_0x00a7:
            r10 = 1
        L_0x00a8:
            if (r10 == 0) goto L_0x00af
            r8.pop()
            goto L_0x0084
        L_0x00ae:
            r9 = r3
        L_0x00af:
            java.util.Set<cb.e> r0 = r0.f4374b
            java.util.Deque r0 = (java.util.Deque) r0
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r7)
            r0.push(r8)
            if (r9 == 0) goto L_0x00d0
            if (r7 == r9) goto L_0x00d0
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00d0 }
            if (r0 != r4) goto L_0x00d0
            java.lang.String r0 = "include"
            java.lang.String r7 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00d0 }
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x00d0 }
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            if (r0 == 0) goto L_0x00d9
            goto L_0x00f3
        L_0x00d9:
            if (r6 == 0) goto L_0x00e5
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r5) goto L_0x010a
            goto L_0x00f3
        L_0x00e5:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x00eb
            goto L_0x010a
        L_0x00eb:
            android.view.Window r6 = r11.f17884e
            android.view.View r6 = r6.getDecorView()
        L_0x00f1:
            if (r0 != 0) goto L_0x00f5
        L_0x00f3:
            r0 = 1
            goto L_0x010b
        L_0x00f5:
            if (r0 == r6) goto L_0x010a
            boolean r7 = r0 instanceof android.view.View
            if (r7 == 0) goto L_0x010a
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            boolean r7 = o0.c0.q(r7)
            if (r7 == 0) goto L_0x0105
            goto L_0x010a
        L_0x0105:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x00f1
        L_0x010a:
            r0 = 0
        L_0x010b:
            androidx.appcompat.app.c r6 = r11.f17896l0
            boolean r7 = f17873o0
            int r8 = androidx.appcompat.widget.m1.f1023b
            r6.getClass()
            if (r0 == 0) goto L_0x011d
            if (r12 == 0) goto L_0x011d
            android.content.Context r12 = r12.getContext()
            goto L_0x011e
        L_0x011d:
            r12 = r14
        L_0x011e:
            int[] r0 = e.l.f13526z
            android.content.res.TypedArray r0 = r12.obtainStyledAttributes(r15, r0, r1, r1)
            if (r7 == 0) goto L_0x012b
            int r7 = r0.getResourceId(r1, r1)
            goto L_0x012c
        L_0x012b:
            r7 = 0
        L_0x012c:
            r8 = 4
            if (r7 != 0) goto L_0x013c
            int r7 = r0.getResourceId(r8, r1)
            if (r7 == 0) goto L_0x013c
            java.lang.String r9 = "AppCompatViewInflater"
            java.lang.String r10 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r9, r10)
        L_0x013c:
            r0.recycle()
            if (r7 == 0) goto L_0x0152
            boolean r0 = r12 instanceof j.c
            if (r0 == 0) goto L_0x014c
            r0 = r12
            j.c r0 = (j.c) r0
            int r0 = r0.f19418a
            if (r0 == r7) goto L_0x0152
        L_0x014c:
            j.c r0 = new j.c
            r0.<init>((android.content.Context) r12, (int) r7)
            r12 = r0
        L_0x0152:
            r13.getClass()
            int r0 = r13.hashCode()
            r7 = -1
            switch(r0) {
                case -1946472170: goto L_0x01fe;
                case -1455429095: goto L_0x01f3;
                case -1346021293: goto L_0x01e8;
                case -938935918: goto L_0x01df;
                case -937446323: goto L_0x01d4;
                case -658531749: goto L_0x01c9;
                case -339785223: goto L_0x01be;
                case 776382189: goto L_0x01b3;
                case 799298502: goto L_0x01a5;
                case 1125864064: goto L_0x0197;
                case 1413872058: goto L_0x0189;
                case 1601505219: goto L_0x017b;
                case 1666676343: goto L_0x016d;
                case 2001146706: goto L_0x015f;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x0209
        L_0x015f:
            java.lang.String r0 = "Button"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0169
            goto L_0x0209
        L_0x0169:
            r2 = 13
            goto L_0x020a
        L_0x016d:
            java.lang.String r0 = "EditText"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0177
            goto L_0x0209
        L_0x0177:
            r2 = 12
            goto L_0x020a
        L_0x017b:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0185
            goto L_0x0209
        L_0x0185:
            r2 = 11
            goto L_0x020a
        L_0x0189:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0193
            goto L_0x0209
        L_0x0193:
            r2 = 10
            goto L_0x020a
        L_0x0197:
            java.lang.String r0 = "ImageView"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0209
        L_0x01a1:
            r2 = 9
            goto L_0x020a
        L_0x01a5:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01af
            goto L_0x0209
        L_0x01af:
            r2 = 8
            goto L_0x020a
        L_0x01b3:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01bc
            goto L_0x0209
        L_0x01bc:
            r2 = 7
            goto L_0x020a
        L_0x01be:
            java.lang.String r0 = "Spinner"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01c7
            goto L_0x0209
        L_0x01c7:
            r2 = 6
            goto L_0x020a
        L_0x01c9:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0209
        L_0x01d2:
            r2 = 5
            goto L_0x020a
        L_0x01d4:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0209
        L_0x01dd:
            r2 = 4
            goto L_0x020a
        L_0x01df:
            java.lang.String r0 = "TextView"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x020a
            goto L_0x0209
        L_0x01e8:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01f1
            goto L_0x0209
        L_0x01f1:
            r2 = 2
            goto L_0x020a
        L_0x01f3:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01fc
            goto L_0x0209
        L_0x01fc:
            r2 = 1
            goto L_0x020a
        L_0x01fe:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r2 = 0
            goto L_0x020a
        L_0x0209:
            r2 = -1
        L_0x020a:
            switch(r2) {
                case 0: goto L_0x026a;
                case 1: goto L_0x0264;
                case 2: goto L_0x025e;
                case 3: goto L_0x0256;
                case 4: goto L_0x0250;
                case 5: goto L_0x024a;
                case 6: goto L_0x0241;
                case 7: goto L_0x0239;
                case 8: goto L_0x0233;
                case 9: goto L_0x022d;
                case 10: goto L_0x0225;
                case 11: goto L_0x021d;
                case 12: goto L_0x0217;
                case 13: goto L_0x020f;
                default: goto L_0x020d;
            }
        L_0x020d:
            r0 = r3
            goto L_0x026f
        L_0x020f:
            androidx.appcompat.widget.f r0 = r6.b(r12, r15)
            r6.g(r0, r13)
            goto L_0x026f
        L_0x0217:
            androidx.appcompat.widget.l r0 = new androidx.appcompat.widget.l
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x021d:
            androidx.appcompat.widget.g r0 = r6.c(r12, r15)
            r6.g(r0, r13)
            goto L_0x026f
        L_0x0225:
            androidx.appcompat.widget.d r0 = r6.a(r12, r15)
            r6.g(r0, r13)
            goto L_0x026f
        L_0x022d:
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x0233:
            androidx.appcompat.widget.h0 r0 = new androidx.appcompat.widget.h0
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x0239:
            androidx.appcompat.widget.v r0 = r6.d(r12, r15)
            r6.g(r0, r13)
            goto L_0x026f
        L_0x0241:
            androidx.appcompat.widget.b0 r0 = new androidx.appcompat.widget.b0
            r2 = 2130969710(0x7f04046e, float:1.754811E38)
            r0.<init>(r12, r15, r2)
            goto L_0x026f
        L_0x024a:
            androidx.appcompat.widget.y r0 = new androidx.appcompat.widget.y
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x0250:
            androidx.appcompat.widget.q r0 = new androidx.appcompat.widget.q
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x0256:
            androidx.appcompat.widget.AppCompatTextView r0 = r6.e(r12, r15)
            r6.g(r0, r13)
            goto L_0x026f
        L_0x025e:
            androidx.appcompat.widget.s r0 = new androidx.appcompat.widget.s
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x0264:
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r12, r15)
            goto L_0x026f
        L_0x026a:
            androidx.appcompat.widget.w r0 = new androidx.appcompat.widget.w
            r0.<init>(r12, r15)
        L_0x026f:
            if (r0 != 0) goto L_0x02ca
            if (r14 == r12) goto L_0x02ca
            java.lang.String r14 = "view"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x0281
            java.lang.String r13 = "class"
            java.lang.String r13 = r15.getAttributeValue(r3, r13)
        L_0x0281:
            java.lang.Object[] r14 = r6.f450a     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            r14[r1] = r12     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            r14[r5] = r15     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            r14 = 46
            int r14 = r13.indexOf(r14)     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            if (r7 != r14) goto L_0x02af
            r14 = 0
        L_0x0290:
            java.lang.String[] r0 = androidx.appcompat.app.c.f448g     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            int r2 = r0.length     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            if (r14 >= r2) goto L_0x02a8
            r0 = r0[r14]     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            android.view.View r0 = r6.f(r12, r13, r0)     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            if (r0 == 0) goto L_0x02a5
            java.lang.Object[] r13 = r6.f450a
            r13[r1] = r3
            r13[r5] = r3
            r3 = r0
            goto L_0x02c9
        L_0x02a5:
            int r14 = r14 + 1
            goto L_0x0290
        L_0x02a8:
            java.lang.Object[] r13 = r6.f450a
            r13[r1] = r3
            r13[r5] = r3
            goto L_0x02c9
        L_0x02af:
            android.view.View r13 = r6.f(r12, r13, r3)     // Catch:{ Exception -> 0x02c3, all -> 0x02bb }
            java.lang.Object[] r14 = r6.f450a
            r14[r1] = r3
            r14[r5] = r3
            r3 = r13
            goto L_0x02c9
        L_0x02bb:
            r12 = move-exception
            java.lang.Object[] r13 = r6.f450a
            r13[r1] = r3
            r13[r5] = r3
            throw r12
        L_0x02c3:
            java.lang.Object[] r13 = r6.f450a
            r13[r1] = r3
            r13[r5] = r3
        L_0x02c9:
            r0 = r3
        L_0x02ca:
            if (r0 == 0) goto L_0x035f
            android.content.Context r13 = r0.getContext()
            boolean r14 = r13 instanceof android.content.ContextWrapper
            if (r14 == 0) goto L_0x02f4
            java.util.WeakHashMap<android.view.View, java.lang.String> r14 = o0.c0.f22553a
            boolean r14 = o0.c0.c.a(r0)
            if (r14 != 0) goto L_0x02dd
            goto L_0x02f4
        L_0x02dd:
            int[] r14 = androidx.appcompat.app.c.f444c
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r15, r14)
            java.lang.String r14 = r13.getString(r1)
            if (r14 == 0) goto L_0x02f1
            androidx.appcompat.app.c$a r2 = new androidx.appcompat.app.c$a
            r2.<init>(r0, r14)
            r0.setOnClickListener(r2)
        L_0x02f1:
            r13.recycle()
        L_0x02f4:
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r14 < r2) goto L_0x035f
            r2 = 28
            if (r14 <= r2) goto L_0x0301
            goto L_0x035f
        L_0x0301:
            int[] r14 = androidx.appcompat.app.c.f445d
            android.content.res.TypedArray r14 = r12.obtainStyledAttributes(r15, r14)
            boolean r3 = r14.hasValue(r1)
            if (r3 == 0) goto L_0x0322
            boolean r3 = r14.getBoolean(r1, r1)
            java.util.WeakHashMap<android.view.View, java.lang.String> r4 = o0.c0.f22553a
            o0.b0 r4 = new o0.b0
            r5 = 2131428056(0x7f0b02d8, float:1.8477746E38)
            r4.<init>(r5, r13, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.e(r0, r3)
        L_0x0322:
            r14.recycle()
            int[] r14 = androidx.appcompat.app.c.f446e
            android.content.res.TypedArray r14 = r12.obtainStyledAttributes(r15, r14)
            boolean r3 = r14.hasValue(r1)
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = r14.getString(r1)
            o0.c0.E(r0, r3)
        L_0x0338:
            r14.recycle()
            int[] r14 = androidx.appcompat.app.c.f447f
            android.content.res.TypedArray r12 = r12.obtainStyledAttributes(r15, r14)
            boolean r14 = r12.hasValue(r1)
            if (r14 == 0) goto L_0x035c
            boolean r14 = r12.getBoolean(r1, r1)
            java.util.WeakHashMap<android.view.View, java.lang.String> r15 = o0.c0.f22553a
            o0.z r15 = new o0.z
            r1 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            r15.<init>(r1, r13, r2)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            r15.e(r0, r13)
        L_0x035c:
            r12.recycle()
        L_0x035f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void p() {
        S();
        a aVar = this.f17890h;
        if (aVar != null) {
            aVar.p(true);
        }
    }

    public void q(Bundle bundle) {
    }

    public void r() {
        B();
    }

    public void s() {
        S();
        a aVar = this.f17890h;
        if (aVar != null) {
            aVar.p(false);
        }
    }

    public boolean u(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.K && i10 == 108) {
            return false;
        }
        if (this.G && i10 == 1) {
            this.G = false;
        }
        if (i10 == 1) {
            Z();
            this.K = true;
            return true;
        } else if (i10 == 2) {
            Z();
            this.E = true;
            return true;
        } else if (i10 == 5) {
            Z();
            this.F = true;
            return true;
        } else if (i10 == 10) {
            Z();
            this.I = true;
            return true;
        } else if (i10 == 108) {
            Z();
            this.G = true;
            return true;
        } else if (i10 != 109) {
            return this.f17884e.requestFeature(i10);
        } else {
            Z();
            this.H = true;
            return true;
        }
    }

    public void v(int i10) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f17882d).inflate(i10, viewGroup);
        this.f17886f.a(this.f17884e.getCallback());
    }

    public void w(View view) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f17886f.a(this.f17884e.getCallback());
    }

    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        L();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f17886f.a(this.f17884e.getCallback());
    }

    public void y(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.f17880c instanceof Activity) {
            S();
            a aVar = this.f17890h;
            if (!(aVar instanceof y)) {
                this.f17892i = null;
                if (aVar != null) {
                    aVar.h();
                }
                this.f17890h = null;
                if (toolbar != null) {
                    Object obj = this.f17880c;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f17898r;
                    }
                    v vVar = new v(toolbar, charSequence, this.f17886f);
                    this.f17890h = vVar;
                    this.f17886f.f17914b = vVar.f17963c;
                } else {
                    this.f17886f.f17914b = null;
                }
                k();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void z(int i10) {
        this.f17878a0 = i10;
    }

    /* compiled from: AppCompatDelegateImpl */
    public class g extends j.i {

        /* renamed from: b  reason: collision with root package name */
        public d f17914b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17915c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17916d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17917e;

        public g(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public void a(Window.Callback callback) {
            try {
                this.f17915c = true;
                callback.onContentChanged();
                this.f17915c = false;
            } catch (Throwable th) {
                this.f17915c = false;
                throw th;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode b(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                j.e$a r0 = new j.e$a
                f.l r1 = f.l.this
                android.content.Context r1 = r1.f17882d
                r0.<init>(r1, r10)
                f.l r10 = f.l.this
                r10.getClass()
                j.a r1 = r10.f17902v
                if (r1 == 0) goto L_0x0015
                r1.c()
            L_0x0015:
                f.l$f r1 = new f.l$f
                r1.<init>(r0)
                r10.S()
                f.a r2 = r10.f17890h
                if (r2 == 0) goto L_0x0030
                j.a r2 = r2.s(r1)
                r10.f17902v = r2
                if (r2 == 0) goto L_0x0030
                f.j r3 = r10.f17888g
                if (r3 == 0) goto L_0x0030
                r3.u(r2)
            L_0x0030:
                j.a r2 = r10.f17902v
                r3 = 0
                if (r2 != 0) goto L_0x019f
                r10.K()
                j.a r2 = r10.f17902v
                if (r2 == 0) goto L_0x003f
                r2.c()
            L_0x003f:
                f.j r2 = r10.f17888g
                if (r2 == 0) goto L_0x004c
                boolean r4 = r10.R
                if (r4 != 0) goto L_0x004c
                j.a r2 = r2.p(r1)     // Catch:{ AbstractMethodError -> 0x004c }
                goto L_0x004d
            L_0x004c:
                r2 = r3
            L_0x004d:
                if (r2 == 0) goto L_0x0053
                r10.f17902v = r2
                goto L_0x0190
            L_0x0053:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f17903w
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L_0x0102
                boolean r2 = r10.J
                if (r2 == 0) goto L_0x00e2
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r6 = r10.f17882d
                android.content.res.Resources$Theme r6 = r6.getTheme()
                r7 = 2130968588(0x7f04000c, float:1.7545834E38)
                r6.resolveAttribute(r7, r2, r4)
                int r7 = r2.resourceId
                if (r7 == 0) goto L_0x0093
                android.content.Context r7 = r10.f17882d
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r2.resourceId
                r7.applyStyle(r6, r4)
                j.c r6 = new j.c
                android.content.Context r8 = r10.f17882d
                r6.<init>((android.content.Context) r8, (int) r5)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x0095
            L_0x0093:
                android.content.Context r6 = r10.f17882d
            L_0x0095:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r3)
                r10.f17903w = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                r8 = 2130968603(0x7f04001b, float:1.7545864E38)
                r7.<init>(r6, r3, r8)
                r10.f17904x = r7
                r8 = 2
                s0.h.b(r7, r8)
                android.widget.PopupWindow r7 = r10.f17904x
                androidx.appcompat.widget.ActionBarContextView r8 = r10.f17903w
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.f17904x
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130968582(0x7f040006, float:1.7545822E38)
                r7.resolveAttribute(r8, r2, r4)
                int r2 = r2.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f17903w
                r6.setContentHeight(r2)
                android.widget.PopupWindow r2 = r10.f17904x
                r6 = -2
                r2.setHeight(r6)
                f.p r2 = new f.p
                r2.<init>(r10)
                r10.f17905y = r2
                goto L_0x0102
            L_0x00e2:
                android.view.ViewGroup r2 = r10.B
                r6 = 2131427404(0x7f0b004c, float:1.8476423E38)
                android.view.View r2 = r2.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x0102
                android.content.Context r6 = r10.O()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r2.setLayoutInflater(r6)
                android.view.View r2 = r2.a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r10.f17903w = r2
            L_0x0102:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f17903w
                if (r2 == 0) goto L_0x0190
                r10.K()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f17903w
                r2.h()
                j.d r2 = new j.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f17903w
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.f17903w
                android.widget.PopupWindow r8 = r10.f17904x
                if (r8 != 0) goto L_0x011d
                goto L_0x011e
            L_0x011d:
                r4 = 0
            L_0x011e:
                r2.<init>(r6, r7, r1, r4)
                androidx.appcompat.view.menu.e r4 = r2.f19428h
                boolean r1 = r1.b(r2, r4)
                if (r1 == 0) goto L_0x018e
                r2.i()
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                r1.f(r2)
                r10.f17902v = r2
                boolean r1 = r10.Y()
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L_0x015f
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                r4 = 0
                r1.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                o0.i0 r1 = o0.c0.b(r1)
                r1.a(r2)
                r10.f17906z = r1
                f.q r2 = new f.q
                r2.<init>(r10)
                java.lang.ref.WeakReference<android.view.View> r4 = r1.f22585a
                java.lang.Object r4 = r4.get()
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L_0x017e
                r1.e(r4, r2)
                goto L_0x017e
            L_0x015f:
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                r1.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                r1.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x017e
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f17903w
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                o0.c0.A(r1)
            L_0x017e:
                android.widget.PopupWindow r1 = r10.f17904x
                if (r1 == 0) goto L_0x0190
                android.view.Window r1 = r10.f17884e
                android.view.View r1 = r1.getDecorView()
                java.lang.Runnable r2 = r10.f17905y
                r1.post(r2)
                goto L_0x0190
            L_0x018e:
                r10.f17902v = r3
            L_0x0190:
                j.a r1 = r10.f17902v
                if (r1 == 0) goto L_0x019b
                f.j r2 = r10.f17888g
                if (r2 == 0) goto L_0x019b
                r2.u(r1)
            L_0x019b:
                j.a r1 = r10.f17902v
                r10.f17902v = r1
            L_0x019f:
                j.a r10 = r10.f17902v
                if (r10 == 0) goto L_0x01a8
                android.view.ActionMode r10 = r0.e(r10)
                return r10
            L_0x01a8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f.l.g.b(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f17916d) {
                return this.f19479a.dispatchKeyEvent(keyEvent);
            }
            return l.this.I(keyEvent) || this.f19479a.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f19479a
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                f.l r0 = f.l.this
                int r3 = r6.getKeyCode()
                r0.S()
                f.a r4 = r0.f17890h
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.i(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = 1
                goto L_0x004d
            L_0x001f:
                f.l$l r3 = r0.N
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.W(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                f.l$l r6 = r0.N
                if (r6 == 0) goto L_0x001d
                r6.f17938l = r2
                goto L_0x001d
            L_0x0034:
                f.l$l r3 = r0.N
                if (r3 != 0) goto L_0x004c
                f.l$l r3 = r0.Q(r1)
                r0.X(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.W(r3, r4, r6, r2)
                r3.f17937k = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = 0
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = 1
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.l.g.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
            if (this.f17915c) {
                this.f19479a.onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return this.f19479a.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i10) {
            d dVar = this.f17914b;
            if (dVar != null) {
                v.e eVar = (v.e) dVar;
                eVar.getClass();
                View view = i10 == 0 ? new View(v.this.f17961a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f19479a.onCreatePanelView(i10);
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            this.f19479a.onMenuOpened(i10, menu);
            l lVar = l.this;
            lVar.getClass();
            if (i10 == 108) {
                lVar.S();
                a aVar = lVar.f17890h;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            if (this.f17917e) {
                this.f19479a.onPanelClosed(i10, menu);
                return;
            }
            this.f19479a.onPanelClosed(i10, menu);
            l lVar = l.this;
            lVar.getClass();
            if (i10 == 108) {
                lVar.S();
                a aVar = lVar.f17890h;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i10 == 0) {
                C0136l Q = lVar.Q(i10);
                if (Q.f17939m) {
                    lVar.G(Q, false);
                }
            }
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f560x = true;
            }
            d dVar = this.f17914b;
            if (dVar != null) {
                v.e eVar2 = (v.e) dVar;
                if (i10 == 0) {
                    v vVar = v.this;
                    if (!vVar.f17964d) {
                        vVar.f17961a.c();
                        v.this.f17964d = true;
                    }
                }
            }
            boolean onPreparePanel = this.f19479a.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.f560x = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar = l.this.Q(0).f17934h;
            if (eVar != null) {
                i.b.a(this.f19479a, list, eVar, i10);
            } else {
                i.b.a(this.f19479a, list, menu, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            l.this.getClass();
            return b(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            l.this.getClass();
            if (i10 != 0) {
                return i.a.b(this.f19479a, callback, i10);
            }
            return b(callback);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
