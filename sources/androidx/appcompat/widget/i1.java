package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.startapp.startappsdk.R;
import e.l;
import o0.c0;
import o0.i0;
import o0.k0;

/* compiled from: ToolbarWidgetWrapper */
public class i1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f941a;

    /* renamed from: b  reason: collision with root package name */
    public int f942b;

    /* renamed from: c  reason: collision with root package name */
    public View f943c;

    /* renamed from: d  reason: collision with root package name */
    public View f944d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f945e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f946f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f947g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f948h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f949i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f950j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f951k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f952l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f953m;

    /* renamed from: n  reason: collision with root package name */
    public c f954n;

    /* renamed from: o  reason: collision with root package name */
    public int f955o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f956p;

    /* compiled from: ToolbarWidgetWrapper */
    public class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f957a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f958b;

        public a(int i10) {
            this.f958b = i10;
        }

        public void a(View view) {
            this.f957a = true;
        }

        public void b(View view) {
            if (!this.f957a) {
                i1.this.f941a.setVisibility(this.f958b);
            }
        }

        public void c(View view) {
            i1.this.f941a.setVisibility(0);
        }
    }

    public i1(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f941a = toolbar;
        this.f949i = toolbar.getTitle();
        this.f950j = toolbar.getSubtitle();
        this.f948h = this.f949i != null;
        this.f947g = toolbar.getNavigationIcon();
        g1 r10 = g1.r(toolbar.getContext(), (AttributeSet) null, l.f13501a, R.attr.actionBarStyle, 0);
        int i10 = 15;
        this.f956p = r10.g(15);
        if (z10) {
            CharSequence o10 = r10.o(27);
            if (!TextUtils.isEmpty(o10)) {
                setTitle(o10);
            }
            CharSequence o11 = r10.o(25);
            if (!TextUtils.isEmpty(o11)) {
                this.f950j = o11;
                if ((this.f942b & 8) != 0) {
                    this.f941a.setSubtitle(o11);
                }
            }
            Drawable g10 = r10.g(20);
            if (g10 != null) {
                this.f946f = g10;
                C();
            }
            Drawable g11 = r10.g(17);
            if (g11 != null) {
                this.f945e = g11;
                C();
            }
            if (this.f947g == null && (drawable = this.f956p) != null) {
                this.f947g = drawable;
                B();
            }
            o(r10.j(10, 0));
            int m10 = r10.m(9, 0);
            if (m10 != 0) {
                View inflate = LayoutInflater.from(this.f941a.getContext()).inflate(m10, this.f941a, false);
                View view = this.f944d;
                if (!(view == null || (this.f942b & 16) == 0)) {
                    this.f941a.removeView(view);
                }
                this.f944d = inflate;
                if (!(inflate == null || (this.f942b & 16) == 0)) {
                    this.f941a.addView(inflate);
                }
                o(this.f942b | 16);
            }
            int l10 = r10.l(13, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f941a.getLayoutParams();
                layoutParams.height = l10;
                this.f941a.setLayoutParams(layoutParams);
            }
            int e10 = r10.e(7, -1);
            int e11 = r10.e(3, -1);
            if (e10 >= 0 || e11 >= 0) {
                Toolbar toolbar2 = this.f941a;
                int max = Math.max(e10, 0);
                int max2 = Math.max(e11, 0);
                toolbar2.d();
                toolbar2.B.a(max, max2);
            }
            int m11 = r10.m(28, 0);
            if (m11 != 0) {
                Toolbar toolbar3 = this.f941a;
                Context context = toolbar3.getContext();
                toolbar3.f769t = m11;
                TextView textView = toolbar3.f754b;
                if (textView != null) {
                    textView.setTextAppearance(context, m11);
                }
            }
            int m12 = r10.m(26, 0);
            if (m12 != 0) {
                Toolbar toolbar4 = this.f941a;
                Context context2 = toolbar4.getContext();
                toolbar4.f770u = m12;
                TextView textView2 = toolbar4.f756c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, m12);
                }
            }
            int m13 = r10.m(22, 0);
            if (m13 != 0) {
                this.f941a.setPopupTheme(m13);
            }
        } else {
            if (this.f941a.getNavigationIcon() != null) {
                this.f956p = this.f941a.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f942b = i10;
        }
        r10.f924b.recycle();
        if (R.string.abc_action_bar_up_description != this.f955o) {
            this.f955o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f941a.getNavigationContentDescription())) {
                s(this.f955o);
            }
        }
        this.f951k = this.f941a.getNavigationContentDescription();
        this.f941a.setNavigationOnClickListener(new h1(this));
    }

    public final void A() {
        if ((this.f942b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f951k)) {
            this.f941a.setNavigationContentDescription(this.f955o);
        } else {
            this.f941a.setNavigationContentDescription(this.f951k);
        }
    }

    public final void B() {
        if ((this.f942b & 4) != 0) {
            Toolbar toolbar = this.f941a;
            Drawable drawable = this.f947g;
            if (drawable == null) {
                drawable = this.f956p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f941a.setNavigationIcon((Drawable) null);
    }

    public final void C() {
        Drawable drawable;
        int i10 = this.f942b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f946f;
            if (drawable == null) {
                drawable = this.f945e;
            }
        } else {
            drawable = this.f945e;
        }
        this.f941a.setLogo(drawable);
    }

    public void a(Menu menu, i.a aVar) {
        g gVar;
        if (this.f954n == null) {
            c cVar = new c(this.f941a.getContext());
            this.f954n = cVar;
            cVar.f494i = R.id.action_menu_presenter;
        }
        c cVar2 = this.f954n;
        cVar2.f490e = aVar;
        Toolbar toolbar = this.f941a;
        e eVar = (e) menu;
        if (eVar != null || toolbar.f752a != null) {
            toolbar.f();
            e eVar2 = toolbar.f752a.f666x;
            if (eVar2 != eVar) {
                if (eVar2 != null) {
                    eVar2.t(toolbar.f753a0);
                    eVar2.t(toolbar.f755b0);
                }
                if (toolbar.f755b0 == null) {
                    toolbar.f755b0 = new Toolbar.d();
                }
                cVar2.f852z = true;
                if (eVar != null) {
                    eVar.b(cVar2, toolbar.f767r);
                    eVar.b(toolbar.f755b0, toolbar.f767r);
                } else {
                    cVar2.c(toolbar.f767r, (e) null);
                    Toolbar.d dVar = toolbar.f755b0;
                    e eVar3 = dVar.f779a;
                    if (!(eVar3 == null || (gVar = dVar.f780b) == null)) {
                        eVar3.d(gVar);
                    }
                    dVar.f779a = null;
                    cVar2.g(true);
                    toolbar.f755b0.g(true);
                }
                toolbar.f752a.setPopupTheme(toolbar.f768s);
                toolbar.f752a.setPresenter(cVar2);
                toolbar.f753a0 = cVar2;
            }
        }
    }

    public boolean b() {
        return this.f941a.s();
    }

    public void c() {
        this.f953m = true;
    }

    public void collapseActionView() {
        g gVar;
        Toolbar.d dVar = this.f941a.f755b0;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f780b;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f941a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f752a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.B
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.D
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i1.d():boolean");
    }

    public boolean e() {
        ActionMenuView actionMenuView = this.f941a.f752a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.B;
        if (cVar != null && cVar.m()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f941a.y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f752a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f941a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f752a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i1.g():boolean");
    }

    public Context getContext() {
        return this.f941a.getContext();
    }

    public CharSequence getTitle() {
        return this.f941a.getTitle();
    }

    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f941a.f752a;
        if (actionMenuView != null && (cVar = actionMenuView.B) != null) {
            cVar.b();
        }
    }

    public void i(i.a aVar, e.a aVar2) {
        Toolbar toolbar = this.f941a;
        toolbar.f757c0 = aVar;
        toolbar.f759d0 = aVar2;
        ActionMenuView actionMenuView = toolbar.f752a;
        if (actionMenuView != null) {
            actionMenuView.C = aVar;
            actionMenuView.D = aVar2;
        }
    }

    public void j(int i10) {
        this.f941a.setVisibility(i10);
    }

    public void k(w0 w0Var) {
        Toolbar toolbar;
        View view = this.f943c;
        if (view != null && view.getParent() == (toolbar = this.f941a)) {
            toolbar.removeView(this.f943c);
        }
        this.f943c = null;
    }

    public ViewGroup l() {
        return this.f941a;
    }

    public void m(boolean z10) {
    }

    public boolean n() {
        Toolbar.d dVar = this.f941a.f755b0;
        return (dVar == null || dVar.f780b == null) ? false : true;
    }

    public void o(int i10) {
        View view;
        int i11 = this.f942b ^ i10;
        this.f942b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    A();
                }
                B();
            }
            if ((i11 & 3) != 0) {
                C();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f941a.setTitle(this.f949i);
                    this.f941a.setSubtitle(this.f950j);
                } else {
                    this.f941a.setTitle((CharSequence) null);
                    this.f941a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f944d) != null) {
                if ((i10 & 16) != 0) {
                    this.f941a.addView(view);
                } else {
                    this.f941a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.f942b;
    }

    public Menu q() {
        return this.f941a.getMenu();
    }

    public void r(int i10) {
        this.f946f = i10 != 0 ? g.a.b(getContext(), i10) : null;
        C();
    }

    public void s(int i10) {
        this.f951k = i10 == 0 ? null : getContext().getString(i10);
        A();
    }

    public void setIcon(int i10) {
        this.f945e = i10 != 0 ? g.a.b(getContext(), i10) : null;
        C();
    }

    public void setTitle(CharSequence charSequence) {
        this.f948h = true;
        z(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f952l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f948h) {
            z(charSequence);
        }
    }

    public int t() {
        return 0;
    }

    public i0 u(int i10, long j10) {
        i0 b10 = c0.b(this.f941a);
        b10.a(i10 == 0 ? 1.0f : 0.0f);
        b10.c(j10);
        a aVar = new a(i10);
        View view = (View) b10.f22585a.get();
        if (view != null) {
            b10.e(view, aVar);
        }
        return b10;
    }

    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x(Drawable drawable) {
        this.f947g = drawable;
        B();
    }

    public void y(boolean z10) {
        this.f941a.setCollapsible(z10);
    }

    public final void z(CharSequence charSequence) {
        this.f949i = charSequence;
        if ((this.f942b & 8) != 0) {
            this.f941a.setTitle(charSequence);
            if (this.f948h) {
                c0.E(this.f941a.getRootView(), charSequence);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f945e = drawable;
        C();
    }
}
