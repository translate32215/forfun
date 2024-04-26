package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.core.app.b;
import androidx.lifecycle.g0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import c0.i;
import c0.o;
import c0.p;
import c0.r;
import com.startapp.startappsdk.R;
import d.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.d;
import o0.j;
import o0.l;
import ud.k;

public class ComponentActivity extends i implements v0, n, w1.c, i, f, d0.b, d0.c, o, p, o0.i {

    /* renamed from: b  reason: collision with root package name */
    public final c.a f324b = new c.a();

    /* renamed from: c  reason: collision with root package name */
    public final j f325c = new j(new c(this));

    /* renamed from: d  reason: collision with root package name */
    public final u f326d;

    /* renamed from: e  reason: collision with root package name */
    public final w1.b f327e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f328f;

    /* renamed from: g  reason: collision with root package name */
    public final OnBackPressedDispatcher f329g;

    /* renamed from: h  reason: collision with root package name */
    public final e f330h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList<n0.a<Configuration>> f331i;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList<n0.a<Integer>> f332r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList<n0.a<Intent>> f333s;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList<n0.a<c0.j>> f334t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<n0.a<r>> f335u;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends e {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f341a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a.C0125a f342b;

            public a(int i10, a.C0125a aVar) {
                this.f341a = i10;
                this.f342b = aVar;
            }

            public void run() {
                androidx.activity.result.b<O> bVar;
                b bVar2 = b.this;
                int i10 = this.f341a;
                T t10 = this.f342b.f12939a;
                String str = bVar2.f376b.get(Integer.valueOf(i10));
                if (str != null) {
                    e.b bVar3 = bVar2.f380f.get(str);
                    if (bVar3 == null || (bVar = bVar3.f386a) == null) {
                        bVar2.f382h.remove(str);
                        bVar2.f381g.put(str, t10);
                    } else if (bVar2.f379e.remove(str)) {
                        bVar.a(t10);
                    }
                }
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        public class C0008b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f344a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f345b;

            public C0008b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f344a = i10;
                this.f345b = sendIntentException;
            }

            public void run() {
                b.this.a(this.f344a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f345b));
            }
        }

        public b() {
        }

        public <I, O> void b(int i10, d.a<I, O> aVar, I i11, c0.a aVar2) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0125a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i12 = androidx.core.app.b.f1381c;
                HashSet hashSet = new HashSet();
                int i13 = 0;
                while (i13 < stringArrayExtra.length) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i13])) {
                        if (!k0.a.a() && TextUtils.equals(stringArrayExtra[i13], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i13));
                        }
                        i13++;
                    } else {
                        throw new IllegalArgumentException(e.a(android.support.v4.media.a.a("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                String[] strArr = size > 0 ? new String[(stringArrayExtra.length - size)] : stringArrayExtra;
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i14 = 0;
                        for (int i15 = 0; i15 < stringArrayExtra.length; i15++) {
                            if (!hashSet.contains(Integer.valueOf(i15))) {
                                strArr[i14] = stringArrayExtra[i15];
                                i14++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (componentActivity instanceof b.e) {
                        ((b.e) componentActivity).a(i10);
                    }
                    b.C0016b.b(componentActivity, stringArrayExtra, i10);
                } else if (componentActivity instanceof b.d) {
                    new Handler(Looper.getMainLooper()).post(new androidx.core.app.a(strArr, componentActivity, i10));
                }
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                g gVar = (g) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = gVar.f388a;
                    Intent intent = gVar.f389b;
                    int i16 = gVar.f390c;
                    int i17 = gVar.f391d;
                    int i18 = androidx.core.app.b.f1381c;
                    b.a.c(componentActivity, intentSender, i10, intent, i16, i17, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C0008b(i10, e10));
                }
            } else {
                int i19 = androidx.core.app.b.f1381c;
                b.a.b(componentActivity, a10, i10, bundle2);
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public u0 f347a;
    }

    public ComponentActivity() {
        u uVar = new u(this);
        this.f326d = uVar;
        w1.b a10 = w1.b.a(this);
        this.f327e = a10;
        this.f329g = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f330h = new b();
        this.f331i = new CopyOnWriteArrayList<>();
        this.f332r = new CopyOnWriteArrayList<>();
        this.f333s = new CopyOnWriteArrayList<>();
        this.f334t = new CopyOnWriteArrayList<>();
        this.f335u = new CopyOnWriteArrayList<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            uVar.a(new androidx.lifecycle.r() {
                public void d(t tVar, o.b bVar) {
                    if (bVar == o.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        uVar.a(new androidx.lifecycle.r() {
            public void d(t tVar, o.b bVar) {
                if (bVar == o.b.ON_DESTROY) {
                    ComponentActivity.this.f324b.f3929b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.v().a();
                    }
                }
            }
        });
        uVar.a(new androidx.lifecycle.r() {
            public void d(t tVar, o.b bVar) {
                ComponentActivity.this.D();
                u uVar = ComponentActivity.this.f326d;
                uVar.e("removeObserver");
                uVar.f2725a.j(this);
            }
        });
        a10.b();
        j0.b(this);
        if (19 <= i10 && i10 <= 23) {
            uVar.a(new ImmLeaksCleaner(this));
        }
        a10.f26867b.d("android:support:activity-result", new d(this));
        C(new b(this));
    }

    private void E() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        u.b.e(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        k.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void A(n0.a<c0.j> aVar) {
        this.f334t.add(aVar);
    }

    public final void C(c.b bVar) {
        c.a aVar = this.f324b;
        if (aVar.f3929b != null) {
            bVar.a(aVar.f3929b);
        }
        aVar.f3928a.add(bVar);
    }

    public void D() {
        if (this.f328f == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f328f = cVar.f347a;
            }
            if (this.f328f == null) {
                this.f328f = new u0();
            }
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        super.addContentView(view, layoutParams);
    }

    public androidx.lifecycle.o c() {
        return this.f326d;
    }

    public final OnBackPressedDispatcher d() {
        return this.f329g;
    }

    public final w1.a e() {
        return this.f327e.f26867b;
    }

    public final void f(n0.a<Integer> aVar) {
        this.f332r.add(aVar);
    }

    public void g(l lVar) {
        j jVar = this.f325c;
        jVar.f22589b.add(lVar);
        jVar.f22588a.run();
    }

    public final void h(n0.a<Integer> aVar) {
        this.f332r.remove(aVar);
    }

    public final void k(n0.a<Configuration> aVar) {
        this.f331i.add(aVar);
    }

    public k1.a l() {
        d dVar = new d();
        if (getApplication() != null) {
            s0.a.C0032a aVar = s0.a.f2718d;
            dVar.b(s0.a.C0032a.C0033a.f2721a, getApplication());
        }
        dVar.b(j0.f2671a, this);
        dVar.b(j0.f2672b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.b(j0.f2673c, getIntent().getExtras());
        }
        return dVar;
    }

    public final void m(n0.a<Configuration> aVar) {
        this.f331i.remove(aVar);
    }

    public final void n(n0.a<r> aVar) {
        this.f335u.remove(aVar);
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f330h.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.f329g.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<n0.a<Configuration>> it = this.f331i.iterator();
        while (it.hasNext()) {
            it.next().a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f327e.c(bundle);
        c.a aVar = this.f324b;
        aVar.f3929b = this;
        for (c.b a10 : aVar.f3928a) {
            a10.a(this);
        }
        super.onCreate(bundle);
        g0.c(this);
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f325c.a(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f325c.b(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z10) {
        Iterator<n0.a<c0.j>> it = this.f334t.iterator();
        while (it.hasNext()) {
            it.next().a(new c0.j(z10));
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<n0.a<Intent>> it = this.f333s.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        Iterator<l> it = this.f325c.f22589b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z10) {
        Iterator<n0.a<r>> it = this.f335u.iterator();
        while (it.hasNext()) {
            it.next().a(new r(z10));
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f325c.c(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f330h.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        u0 u0Var = this.f328f;
        if (u0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            u0Var = cVar.f347a;
        }
        if (u0Var == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f347a = u0Var;
        return cVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        u uVar = this.f326d;
        if (uVar instanceof u) {
            o.c cVar = o.c.CREATED;
            uVar.e("setCurrentState");
            uVar.h(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.f327e.d(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<n0.a<Integer>> it = this.f332r.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i10));
        }
    }

    public final e q() {
        return this.f330h;
    }

    public void r(l lVar) {
        this.f325c.d(lVar);
    }

    public void reportFullyDrawn() {
        try {
            if (a2.a.c()) {
                a2.a.a("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && d0.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            a2.a.b();
        }
    }

    public final void s(n0.a<r> aVar) {
        this.f335u.add(aVar);
    }

    public void setContentView(int i10) {
        E();
        super.setContentView(i10);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public u0 v() {
        if (getApplication() != null) {
            D();
            return this.f328f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void y(n0.a<c0.j> aVar) {
        this.f334t.remove(aVar);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        Iterator<n0.a<c0.j>> it = this.f334t.iterator();
        while (it.hasNext()) {
            it.next().a(new c0.j(z10, configuration));
        }
    }

    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        Iterator<n0.a<r>> it = this.f335u.iterator();
        while (it.hasNext()) {
            it.next().a(new r(z10, configuration));
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        E();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        super.setContentView(view, layoutParams);
    }
}
