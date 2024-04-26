package dev.pankaj.yacinetv.ui.main;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.b;
import androidx.drawerlayout.widget.DrawerLayout;
import be.c;
import be.f;
import be.g;
import be.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kd.d;
import kd.e;
import ld.u;
import o1.c0;
import o1.r;
import td.l;
import ud.j;
import ud.k;

/* compiled from: MainActivity.kt */
public final class MainActivity extends gc.a<zb.a> {
    public static final /* synthetic */ int O = 0;
    public final d K = e.b(new b(this));
    public r1.b L;
    public Toast M;
    public long N;

    /* compiled from: MainActivity.kt */
    public /* synthetic */ class a extends j implements l<LayoutInflater, zb.a> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13406i = new a();

        public a() {
            super(1, zb.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Ldev/pankaj/yacinetv/databinding/ActivityMainBinding;", 0);
        }

        public Object c(Object obj) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            k.f(layoutInflater, "p0");
            View inflate = layoutInflater.inflate(R.layout.activity_main, (ViewGroup) null, false);
            int i10 = R.id.app_bar_main;
            View d10 = b8.a.d(inflate, R.id.app_bar_main);
            if (d10 != null) {
                int i11 = R.id.appbar;
                AppBarLayout appBarLayout = (AppBarLayout) b8.a.d(d10, R.id.appbar);
                if (appBarLayout != null) {
                    i11 = R.id.bottom_navigation;
                    BottomNavigationView bottomNavigationView = (BottomNavigationView) b8.a.d(d10, R.id.bottom_navigation);
                    if (bottomNavigationView != null) {
                        i11 = R.id.title;
                        TextView textView = (TextView) b8.a.d(d10, R.id.title);
                        if (textView != null) {
                            i11 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) b8.a.d(d10, R.id.toolbar);
                            if (materialToolbar != null) {
                                zb.c cVar = new zb.c((CoordinatorLayout) d10, appBarLayout, bottomNavigationView, textView, materialToolbar);
                                DrawerLayout drawerLayout = (DrawerLayout) inflate;
                                NavigationView navigationView = (NavigationView) b8.a.d(inflate, R.id.nav_view);
                                if (navigationView != null) {
                                    return new zb.a(drawerLayout, cVar, drawerLayout, navigationView);
                                }
                                i10 = R.id.nav_view;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(d10.getResources().getResourceName(i11)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class b extends ud.l implements td.a<o1.k> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MainActivity f13407b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MainActivity mainActivity) {
            super(0);
            this.f13407b = mainActivity;
        }

        public Object d() {
            View view;
            Object obj;
            MainActivity mainActivity = this.f13407b;
            k.f(mainActivity, "activity");
            int i10 = androidx.core.app.b.f1381c;
            if (Build.VERSION.SDK_INT >= 28) {
                view = (View) b.c.a(mainActivity, R.id.nav_host_fragment);
            } else {
                view = mainActivity.findViewById(R.id.nav_host_fragment);
                if (view == null) {
                    throw new IllegalArgumentException("ID does not reference a View inside this Activity");
                }
            }
            k.e(view, "requireViewById<View>(activity, viewId)");
            f h10 = i.h(g.c(view, c0.a.f22665b), c0.b.f22666b);
            k.f(h10, "<this>");
            c.a aVar = (c.a) ((be.c) h10).iterator();
            if (!aVar.hasNext()) {
                obj = null;
            } else {
                obj = aVar.next();
            }
            o1.k kVar = (o1.k) obj;
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalStateException("Activity " + mainActivity + " does not have a NavController set on " + R.id.nav_host_fragment);
        }
    }

    /* compiled from: AppBarConfiguration.kt */
    public static final class c extends ud.l implements td.a<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f13408b = new c();

        public c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Boolean.FALSE;
        }
    }

    public MainActivity() {
        super(a.f13406i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r4 = r4.getIntent();
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fd A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean K() {
        /*
            r14 = this;
            o1.k r0 = r14.N()
            r1.b r1 = r14.L
            r2 = 0
            if (r1 == 0) goto L_0x01ff
            java.lang.String r3 = "<this>"
            ud.k.f(r0, r3)
            java.lang.String r4 = "appBarConfiguration"
            ud.k.f(r1, r4)
            java.lang.String r4 = "navController"
            ud.k.f(r0, r4)
            java.lang.String r4 = "configuration"
            ud.k.f(r1, r4)
            v0.c r4 = r1.f24494b
            o1.r r5 = r0.g()
            java.util.Set<java.lang.Integer> r6 = r1.f24493a
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0036
            if (r5 == 0) goto L_0x0036
            boolean r5 = r1.e.b(r5, r6)
            if (r5 == 0) goto L_0x0036
            r4.a()
            goto L_0x01e8
        L_0x0036:
            int r4 = r0.h()
            if (r4 != r7) goto L_0x01e2
            android.app.Activity r4 = r0.f22718b
            if (r4 == 0) goto L_0x004b
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L_0x004b
            android.os.Bundle r4 = r4.getExtras()
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            java.lang.String r5 = "android-support-nav:controller:deepLinkIds"
            if (r4 == 0) goto L_0x0055
            int[] r4 = r4.getIntArray(r5)
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            java.lang.String r9 = "android-support-nav:controller:deepLinkExtras"
            if (r4 == 0) goto L_0x0141
            boolean r4 = r0.f22722f
            if (r4 != 0) goto L_0x0062
            goto L_0x01e0
        L_0x0062:
            android.app.Activity r4 = r0.f22718b
            ud.k.c(r4)
            android.content.Intent r4 = r4.getIntent()
            android.os.Bundle r10 = r4.getExtras()
            ud.k.c(r10)
            int[] r5 = r10.getIntArray(r5)
            ud.k.c(r5)
            ud.k.f(r5, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r11 = r5.length
            r3.<init>(r11)
            int r11 = r5.length
            r12 = 0
        L_0x0084:
            if (r12 >= r11) goto L_0x0092
            r13 = r5[r12]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.add(r13)
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0092:
            java.lang.String r5 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r5 = r10.getParcelableArrayList(r5)
            java.lang.Object r11 = ld.k.h(r3)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r12 = ld.k.h(r5)
            android.os.Bundle r12 = (android.os.Bundle) r12
        L_0x00aa:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x00b2
            goto L_0x01e0
        L_0x00b2:
            o1.t r12 = r0.i()
            o1.r r12 = r0.e(r12, r11)
            boolean r13 = r12 instanceof o1.t
            if (r13 == 0) goto L_0x00c6
            o1.t r12 = (o1.t) r12
            o1.r r11 = o1.t.F(r12)
            int r11 = r11.f22806h
        L_0x00c6:
            o1.r r12 = r0.g()
            if (r12 == 0) goto L_0x00d2
            int r12 = r12.f22806h
            if (r11 != r12) goto L_0x00d2
            r11 = 1
            goto L_0x00d3
        L_0x00d2:
            r11 = 0
        L_0x00d3:
            if (r11 != 0) goto L_0x00d7
            goto L_0x01e0
        L_0x00d7:
            o1.o r11 = new o1.o
            r11.<init>(r0)
            kd.g[] r12 = new kd.g[r7]
            kd.g r13 = new kd.g
            r13.<init>(r6, r4)
            r12[r8] = r13
            android.os.Bundle r4 = androidx.appcompat.widget.p.b(r12)
            android.os.Bundle r6 = r10.getBundle(r9)
            if (r6 == 0) goto L_0x00f2
            r4.putAll(r6)
        L_0x00f2:
            android.content.Intent r6 = r11.f22789b
            r6.putExtra(r9, r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x00fc:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0131
            java.lang.Object r6 = r3.next()
            int r8 = r4 + 1
            if (r4 < 0) goto L_0x012d
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r5 == 0) goto L_0x0119
            java.lang.Object r4 = r5.get(r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            goto L_0x011a
        L_0x0119:
            r4 = r2
        L_0x011a:
            java.util.List<o1.o$a> r9 = r11.f22791d
            o1.o$a r10 = new o1.o$a
            r10.<init>(r6, r4)
            r9.add(r10)
            o1.t r4 = r11.f22790c
            if (r4 == 0) goto L_0x012b
            r11.c()
        L_0x012b:
            r4 = r8
            goto L_0x00fc
        L_0x012d:
            ld.h.e()
            throw r2
        L_0x0131:
            c0.t r2 = r11.a()
            r2.h()
            android.app.Activity r0 = r0.f22718b
            if (r0 == 0) goto L_0x01d8
            r0.finish()
            goto L_0x01d8
        L_0x0141:
            o1.r r3 = r0.g()
            ud.k.c(r3)
            int r4 = r3.f22806h
            o1.t r3 = r3.f22800b
        L_0x014c:
            if (r3 == 0) goto L_0x01e0
            int r5 = r3.f22815t
            if (r5 == r4) goto L_0x01da
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            android.app.Activity r5 = r0.f22718b
            if (r5 == 0) goto L_0x01a8
            ud.k.c(r5)
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x01a8
            android.app.Activity r5 = r0.f22718b
            ud.k.c(r5)
            android.content.Intent r5 = r5.getIntent()
            android.net.Uri r5 = r5.getData()
            if (r5 == 0) goto L_0x01a8
            android.app.Activity r5 = r0.f22718b
            ud.k.c(r5)
            android.content.Intent r5 = r5.getIntent()
            r4.putParcelable(r6, r5)
            o1.t r5 = r0.f22719c
            ud.k.c(r5)
            o1.p r6 = new o1.p
            android.app.Activity r8 = r0.f22718b
            ud.k.c(r8)
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r10 = "activity!!.intent"
            ud.k.e(r8, r10)
            r6.<init>((android.content.Intent) r8)
            o1.r$b r5 = r5.x(r6)
            if (r5 == 0) goto L_0x01a8
            o1.r r6 = r5.f22809a
            android.os.Bundle r5 = r5.f22810b
            android.os.Bundle r5 = r6.f(r5)
            r4.putAll(r5)
        L_0x01a8:
            o1.o r5 = new o1.o
            r5.<init>(r0)
            int r3 = r3.f22806h
            java.util.List<o1.o$a> r6 = r5.f22791d
            r6.clear()
            java.util.List<o1.o$a> r6 = r5.f22791d
            o1.o$a r8 = new o1.o$a
            r8.<init>(r3, r2)
            r6.add(r8)
            o1.t r2 = r5.f22790c
            if (r2 == 0) goto L_0x01c5
            r5.c()
        L_0x01c5:
            android.content.Intent r2 = r5.f22789b
            r2.putExtra(r9, r4)
            c0.t r2 = r5.a()
            r2.h()
            android.app.Activity r0 = r0.f22718b
            if (r0 == 0) goto L_0x01d8
            r0.finish()
        L_0x01d8:
            r0 = 1
            goto L_0x01e6
        L_0x01da:
            int r4 = r3.f22806h
            o1.t r3 = r3.f22800b
            goto L_0x014c
        L_0x01e0:
            r0 = 0
            goto L_0x01e6
        L_0x01e2:
            boolean r0 = r0.n()
        L_0x01e6:
            if (r0 == 0) goto L_0x01ea
        L_0x01e8:
            r0 = 1
            goto L_0x01f4
        L_0x01ea:
            r1.b$a r0 = r1.f24495c
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r0.b()
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            if (r0 != 0) goto L_0x01fe
            boolean r0 = super.K()
            if (r0 == 0) goto L_0x01fd
            goto L_0x01fe
        L_0x01fd:
            r7 = 0
        L_0x01fe:
            return r7
        L_0x01ff:
            java.lang.String r0 = "appBarConfig"
            ud.k.l(r0)
            goto L_0x0206
        L_0x0205:
            throw r2
        L_0x0206:
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.pankaj.yacinetv.ui.main.MainActivity.K():boolean");
    }

    public final o1.k N() {
        return (o1.k) this.K.getValue();
    }

    public final void O(String str) {
        k.f(str, "title");
        ((zb.a) L()).f28780b.f28787c.setText(str);
    }

    public void onBackPressed() {
        r g10 = N().g();
        boolean z10 = false;
        if (g10 != null && N().i().f22815t == g10.f22806h) {
            z10 = true;
        }
        if (!z10) {
            this.f329g.b();
        } else if (this.N < System.currentTimeMillis() - ((long) 4000)) {
            Toast makeText = Toast.makeText(this, R.string.press_back, 1);
            this.M = makeText;
            if (makeText != null) {
                makeText.show();
            }
            this.N = System.currentTimeMillis();
        } else {
            Toast toast = this.M;
            if (toast != null) {
                toast.cancel();
            }
            this.f329g.b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H().y(((zb.a) L()).f28780b.f28788d);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }
        Set a10 = u.a(Integer.valueOf(R.id.liveTvFragment));
        DrawerLayout drawerLayout = ((zb.a) L()).f28781c;
        c cVar = c.f13408b;
        k.f(a10, "topLevelDestinationIds");
        HashSet hashSet = new HashSet();
        hashSet.addAll(a10);
        this.L = new r1.b(hashSet, drawerLayout, new lc.b(cVar), (ud.f) null);
        o1.k N2 = N();
        r1.b bVar = this.L;
        if (bVar != null) {
            k.f(this, "<this>");
            k.f(N2, "navController");
            k.f(bVar, "configuration");
            k.f(this, "activity");
            k.f(N2, "navController");
            k.f(bVar, "configuration");
            N2.b(new r1.a(this, bVar));
            BottomNavigationView bottomNavigationView = ((zb.a) L()).f28780b.f28786b;
            k.e(bottomNavigationView, "binding.appBarMain.bottomNavigation");
            o1.k N3 = N();
            k.f(bottomNavigationView, "<this>");
            k.f(N3, "navController");
            k.f(bottomNavigationView, "navigationBarView");
            k.f(N3, "navController");
            bottomNavigationView.setOnItemSelectedListener(new r1.c(N3));
            N3.b(new r1.d(new WeakReference(bottomNavigationView), N3));
            String string = getString(R.string.app_name);
            k.e(string, "getString(R.string.app_name)");
            O(string);
            N().b(new lc.a(this));
            ((zb.a) L()).f28782d.setNavigationItemSelectedListener(new r1.c(this));
            return;
        }
        k.l("appBarConfig");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        k.f(menu, "menu");
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        k.f(menuItem, "item");
        o1.k N2 = N();
        k.f(menuItem, "<this>");
        k.f(N2, "navController");
        return r1.e.c(menuItem, N2) || super.onOptionsItemSelected(menuItem);
    }
}
