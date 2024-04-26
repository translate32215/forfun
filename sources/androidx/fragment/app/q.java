package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.d;
import androidx.activity.i;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.core.app.b;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import c0.j;
import c0.o;
import c0.p;
import c0.r;
import d0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o0.l;

/* compiled from: FragmentActivity */
public class q extends ComponentActivity implements b.d, b.e {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public final t f1831v;

    /* renamed from: w  reason: collision with root package name */
    public final u f1832w = new u(this);

    /* renamed from: x  reason: collision with root package name */
    public boolean f1833x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1834y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1835z = true;

    /* compiled from: FragmentActivity */
    public class a extends v<q> implements d0.b, c, o, p, v0, i, f, w1.c, e0, o0.i {
        public a() {
            super(q.this);
        }

        public void A(n0.a<j> aVar) {
            q.this.f334t.add(aVar);
        }

        public void a(a0 a0Var, p pVar) {
            q.this.getClass();
        }

        public View b(int i10) {
            return q.this.findViewById(i10);
        }

        public androidx.lifecycle.o c() {
            return q.this.f1832w;
        }

        public OnBackPressedDispatcher d() {
            return q.this.f329g;
        }

        public w1.a e() {
            return q.this.f327e.f26867b;
        }

        public void f(n0.a<Integer> aVar) {
            q.this.f332r.add(aVar);
        }

        public void g(l lVar) {
            o0.j jVar = q.this.f325c;
            jVar.f22589b.add(lVar);
            jVar.f22588a.run();
        }

        public void h(n0.a<Integer> aVar) {
            q.this.f332r.remove(aVar);
        }

        public boolean i() {
            Window window = q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            q.this.dump(str, (FileDescriptor) null, printWriter, strArr);
        }

        public void k(n0.a<Configuration> aVar) {
            q.this.f331i.add(aVar);
        }

        public Object l() {
            return q.this;
        }

        public void m(n0.a<Configuration> aVar) {
            q.this.f331i.remove(aVar);
        }

        public void n(n0.a<r> aVar) {
            q.this.f335u.remove(aVar);
        }

        public LayoutInflater o() {
            return q.this.getLayoutInflater().cloneInContext(q.this);
        }

        public void p() {
            q.this.invalidateOptionsMenu();
        }

        public e q() {
            return q.this.f330h;
        }

        public void r(l lVar) {
            q.this.f325c.d(lVar);
        }

        public void s(n0.a<r> aVar) {
            q.this.f335u.add(aVar);
        }

        public u0 v() {
            return q.this.v();
        }

        public void y(n0.a<j> aVar) {
            q.this.f334t.remove(aVar);
        }
    }

    public q() {
        a aVar = new a();
        q.a.f(aVar, "callbacks == null");
        this.f1831v = new t(aVar);
        this.f327e.f26867b.d("android:support:lifecycle", new d(this));
        this.f331i.add(new z(this));
        this.f333s.add(new y(this));
        C(new androidx.activity.b(this));
    }

    public static boolean G(a0 a0Var, o.c cVar) {
        o.c cVar2 = o.c.STARTED;
        boolean z10 = false;
        for (p next : a0Var.K()) {
            if (next != null) {
                v<?> vVar = next.C;
                if ((vVar == null ? null : vVar.l()) != null) {
                    z10 |= G(next.p(), cVar);
                }
                n0 n0Var = next.f1795f0;
                if (n0Var != null) {
                    n0Var.b();
                    if (n0Var.f1762c.f2726b.compareTo(cVar2) >= 0) {
                        u uVar = next.f1795f0.f1762c;
                        uVar.e("setCurrentState");
                        uVar.h(cVar);
                        z10 = true;
                    }
                }
                if (next.f1793e0.f2726b.compareTo(cVar2) >= 0) {
                    u uVar2 = next.f1793e0;
                    uVar2.e("setCurrentState");
                    uVar2.h(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public a0 F() {
        return this.f1831v.f1871a.f1876d;
    }

    @Deprecated
    public final void a(int i10) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x006c
            int r2 = r9.length
            if (r2 <= 0) goto L_0x006c
            r2 = r9[r0]
            r2.getClass()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -645125871: goto L_0x0044;
                case 100470631: goto L_0x0039;
                case 472614934: goto L_0x002e;
                case 1159329357: goto L_0x0023;
                case 1455016274: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x004e
        L_0x0018:
            java.lang.String r4 = "--autofill"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            r3 = 4
            goto L_0x004e
        L_0x0023:
            java.lang.String r4 = "--contentcapture"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002c
            goto L_0x004e
        L_0x002c:
            r3 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r4 = "--list-dumpables"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0037
            goto L_0x004e
        L_0x0037:
            r3 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r4 = "--dump-dumpable"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0042
            goto L_0x004e
        L_0x0042:
            r3 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r4 = "--translation"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            switch(r3) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0060;
                case 2: goto L_0x0060;
                case 3: goto L_0x0059;
                case 4: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x006c
        L_0x0052:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x006c
            goto L_0x006b
        L_0x0059:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x006c
            goto L_0x006b
        L_0x0060:
            boolean r0 = k0.a.a()
            goto L_0x006c
        L_0x0065:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0070
            return
        L_0x0070:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.f1833x
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.f1834y
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.f1835z
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto L_0x00c7
            l1.a r1 = l1.a.b(r5)
            r1.a(r0, r7, r8, r9)
        L_0x00c7:
            androidx.fragment.app.t r0 = r5.f1831v
            androidx.fragment.app.v<?> r0 = r0.f1871a
            androidx.fragment.app.a0 r0 = r0.f1876d
            r0.w(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f1831v.a();
        super.onActivityResult(i10, i11, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1832w.f(o.b.ON_CREATE);
        this.f1831v.f1871a.f1876d.j();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1831v.f1871a.f1876d.f1582f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1831v.f1871a.f1876d.l();
        this.f1832w.f(o.b.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f1831v.f1871a.f1876d.i(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f1834y = false;
        this.f1831v.f1871a.f1876d.u(5);
        this.f1832w.f(o.b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1832w.f(o.b.ON_RESUME);
        a0 a0Var = this.f1831v.f1871a.f1876d;
        a0Var.G = false;
        a0Var.H = false;
        a0Var.N.f1653i = false;
        a0Var.u(7);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f1831v.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        this.f1831v.a();
        super.onResume();
        this.f1834y = true;
        this.f1831v.f1871a.f1876d.A(true);
    }

    public void onStart() {
        this.f1831v.a();
        super.onStart();
        this.f1835z = false;
        if (!this.f1833x) {
            this.f1833x = true;
            a0 a0Var = this.f1831v.f1871a.f1876d;
            a0Var.G = false;
            a0Var.H = false;
            a0Var.N.f1653i = false;
            a0Var.u(4);
        }
        this.f1831v.f1871a.f1876d.A(true);
        this.f1832w.f(o.b.ON_START);
        a0 a0Var2 = this.f1831v.f1871a.f1876d;
        a0Var2.G = false;
        a0Var2.H = false;
        a0Var2.N.f1653i = false;
        a0Var2.u(5);
    }

    public void onStateNotSaved() {
        this.f1831v.a();
    }

    public void onStop() {
        super.onStop();
        this.f1835z = true;
        do {
        } while (G(F(), o.c.CREATED));
        a0 a0Var = this.f1831v.f1871a.f1876d;
        a0Var.H = true;
        a0Var.N.f1653i = true;
        a0Var.u(4);
        this.f1832w.f(o.b.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1831v.f1871a.f1876d.f1582f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
