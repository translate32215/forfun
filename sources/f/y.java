package f;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.w0;
import com.startapp.startappsdk.R;
import e.l;
import f.a;
import j.a;
import j.g;
import j.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o0.c0;
import o0.i0;
import o0.k0;
import o0.l0;

/* compiled from: WindowDecorActionBar */
public class y extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new DecelerateInterpolator();

    /* renamed from: z  reason: collision with root package name */
    public static final Interpolator f17985z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f17986a;

    /* renamed from: b  reason: collision with root package name */
    public Context f17987b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f17988c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f17989d;

    /* renamed from: e  reason: collision with root package name */
    public j0 f17990e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f17991f;

    /* renamed from: g  reason: collision with root package name */
    public View f17992g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17993h;

    /* renamed from: i  reason: collision with root package name */
    public d f17994i;

    /* renamed from: j  reason: collision with root package name */
    public j.a f17995j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0165a f17996k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f17997l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f17998m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f17999n;

    /* renamed from: o  reason: collision with root package name */
    public int f18000o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f18001p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18002q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f18003r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f18004s = true;

    /* renamed from: t  reason: collision with root package name */
    public h f18005t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18006u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18007v;

    /* renamed from: w  reason: collision with root package name */
    public final o0.j0 f18008w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final o0.j0 f18009x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final l0 f18010y = new c();

    /* compiled from: WindowDecorActionBar */
    public class a extends k0 {
        public a() {
        }

        public void b(View view) {
            View view2;
            y yVar = y.this;
            if (yVar.f18001p && (view2 = yVar.f17992g) != null) {
                view2.setTranslationY(0.0f);
                y.this.f17989d.setTranslationY(0.0f);
            }
            y.this.f17989d.setVisibility(8);
            y.this.f17989d.setTransitioning(false);
            y yVar2 = y.this;
            yVar2.f18005t = null;
            a.C0165a aVar = yVar2.f17996k;
            if (aVar != null) {
                aVar.c(yVar2.f17995j);
                yVar2.f17995j = null;
                yVar2.f17996k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = y.this.f17988c;
            if (actionBarOverlayLayout != null) {
                c0.A(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class b extends k0 {
        public b() {
        }

        public void b(View view) {
            y yVar = y.this;
            yVar.f18005t = null;
            yVar.f17989d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class c implements l0 {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends j.a implements e.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f18014c;

        /* renamed from: d  reason: collision with root package name */
        public final e f18015d;

        /* renamed from: e  reason: collision with root package name */
        public a.C0165a f18016e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<View> f18017f;

        public d(Context context, a.C0165a aVar) {
            this.f18014c = context;
            this.f18016e = aVar;
            e eVar = new e(context);
            eVar.f548l = 1;
            this.f18015d = eVar;
            eVar.f541e = this;
        }

        public boolean a(e eVar, MenuItem menuItem) {
            a.C0165a aVar = this.f18016e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f18016e != null) {
                i();
                androidx.appcompat.widget.c cVar = y.this.f17991f.f793d;
                if (cVar != null) {
                    cVar.p();
                }
            }
        }

        public void c() {
            y yVar = y.this;
            if (yVar.f17994i == this) {
                if (!(!yVar.f18002q)) {
                    yVar.f17995j = this;
                    yVar.f17996k = this.f18016e;
                } else {
                    this.f18016e.c(this);
                }
                this.f18016e = null;
                y.this.t(false);
                ActionBarContextView actionBarContextView = y.this.f17991f;
                if (actionBarContextView.f636s == null) {
                    actionBarContextView.h();
                }
                y yVar2 = y.this;
                yVar2.f17988c.setHideOnContentScrollEnabled(yVar2.f18007v);
                y.this.f17994i = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f18017f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f18015d;
        }

        public MenuInflater f() {
            return new g(this.f18014c);
        }

        public CharSequence g() {
            return y.this.f17991f.getSubtitle();
        }

        public CharSequence h() {
            return y.this.f17991f.getTitle();
        }

        public void i() {
            if (y.this.f17994i == this) {
                this.f18015d.A();
                try {
                    this.f18016e.d(this, this.f18015d);
                } finally {
                    this.f18015d.z();
                }
            }
        }

        public boolean j() {
            return y.this.f17991f.A;
        }

        public void k(View view) {
            y.this.f17991f.setCustomView(view);
            this.f18017f = new WeakReference<>(view);
        }

        public void l(int i10) {
            y.this.f17991f.setSubtitle(y.this.f17986a.getResources().getString(i10));
        }

        public void m(CharSequence charSequence) {
            y.this.f17991f.setSubtitle(charSequence);
        }

        public void n(int i10) {
            y.this.f17991f.setTitle(y.this.f17986a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            y.this.f17991f.setTitle(charSequence);
        }

        public void p(boolean z10) {
            this.f19416b = z10;
            y.this.f17991f.setTitleOptional(z10);
        }
    }

    public y(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (!z10) {
            this.f17992g = decorView.findViewById(16908290);
        }
    }

    public boolean b() {
        j0 j0Var = this.f17990e;
        if (j0Var == null || !j0Var.n()) {
            return false;
        }
        this.f17990e.collapseActionView();
        return true;
    }

    public void c(boolean z10) {
        if (z10 != this.f17997l) {
            this.f17997l = z10;
            int size = this.f17998m.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17998m.get(i10).a(z10);
            }
        }
    }

    public int d() {
        return this.f17990e.p();
    }

    public Context e() {
        if (this.f17987b == null) {
            TypedValue typedValue = new TypedValue();
            this.f17986a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f17987b = new ContextThemeWrapper(this.f17986a, i10);
            } else {
                this.f17987b = this.f17986a;
            }
        }
        return this.f17987b;
    }

    public void g(Configuration configuration) {
        v(this.f17986a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        e eVar;
        d dVar = this.f17994i;
        if (dVar == null || (eVar = dVar.f18015d) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        eVar.setQwertyMode(z10);
        return eVar.performShortcut(i10, keyEvent, 0);
    }

    public void l(boolean z10) {
        if (!this.f17993h) {
            m(z10);
        }
    }

    public void m(boolean z10) {
        int i10 = z10 ? 4 : 0;
        int p10 = this.f17990e.p();
        this.f17993h = true;
        this.f17990e.o((i10 & 4) | (-5 & p10));
    }

    public void n(int i10) {
        this.f17990e.s(i10);
    }

    public void o(Drawable drawable) {
        this.f17990e.x(drawable);
    }

    public void p(boolean z10) {
        h hVar;
        this.f18006u = z10;
        if (!z10 && (hVar = this.f18005t) != null) {
            hVar.a();
        }
    }

    public void q(CharSequence charSequence) {
        this.f17990e.setTitle(charSequence);
    }

    public void r(CharSequence charSequence) {
        this.f17990e.setWindowTitle(charSequence);
    }

    public j.a s(a.C0165a aVar) {
        d dVar = this.f17994i;
        if (dVar != null) {
            dVar.c();
        }
        this.f17988c.setHideOnContentScrollEnabled(false);
        this.f17991f.h();
        d dVar2 = new d(this.f17991f.getContext(), aVar);
        dVar2.f18015d.A();
        try {
            if (!dVar2.f18016e.b(dVar2, dVar2.f18015d)) {
                return null;
            }
            this.f17994i = dVar2;
            dVar2.i();
            this.f17991f.f(dVar2);
            t(true);
            return dVar2;
        } finally {
            dVar2.f18015d.z();
        }
    }

    public void t(boolean z10) {
        i0 i0Var;
        i0 i0Var2;
        if (z10) {
            if (!this.f18003r) {
                this.f18003r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17988c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f18003r) {
            this.f18003r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17988c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (c0.r(this.f17989d)) {
            if (z10) {
                i0Var = this.f17990e.u(4, 100);
                i0Var2 = this.f17991f.e(0, 200);
            } else {
                i0Var2 = this.f17990e.u(0, 200);
                i0Var = this.f17991f.e(8, 100);
            }
            h hVar = new h();
            hVar.f19470a.add(i0Var);
            View view = (View) i0Var.f22585a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) i0Var2.f22585a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            hVar.f19470a.add(i0Var2);
            hVar.b();
        } else if (z10) {
            this.f17990e.j(4);
            this.f17991f.setVisibility(0);
        } else {
            this.f17990e.j(0);
            this.f17991f.setVisibility(8);
        }
    }

    public final void u(View view) {
        j0 j0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f17988c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof j0) {
            j0Var = (j0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            j0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Can't make a decor toolbar out of ");
            a10.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a10.toString());
        }
        this.f17990e = j0Var;
        this.f17991f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f17989d = actionBarContainer;
        j0 j0Var2 = this.f17990e;
        if (j0Var2 == null || this.f17991f == null || actionBarContainer == null) {
            throw new IllegalStateException(y.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f17986a = j0Var2.getContext();
        boolean z10 = (this.f17990e.p() & 4) != 0;
        if (z10) {
            this.f17993h = true;
        }
        Context context = this.f17986a;
        this.f17990e.m((context.getApplicationInfo().targetSdkVersion < 14) || z10);
        v(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f17986a.obtainStyledAttributes((AttributeSet) null, l.f13501a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17988c;
            if (actionBarOverlayLayout2.f652h) {
                this.f18007v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            c0.H(this.f17989d, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void v(boolean z10) {
        this.f17999n = z10;
        if (!z10) {
            this.f17990e.k((w0) null);
            this.f17989d.setTabContainer((w0) null);
        } else {
            this.f17989d.setTabContainer((w0) null);
            this.f17990e.k((w0) null);
        }
        boolean z11 = true;
        boolean z12 = this.f17990e.t() == 2;
        this.f17990e.y(!this.f17999n && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f17988c;
        if (this.f17999n || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    public final void w(boolean z10) {
        View view;
        View view2;
        View view3;
        if (this.f18003r || !this.f18002q) {
            if (!this.f18004s) {
                this.f18004s = true;
                h hVar = this.f18005t;
                if (hVar != null) {
                    hVar.a();
                }
                this.f17989d.setVisibility(0);
                if (this.f18000o != 0 || (!this.f18006u && !z10)) {
                    this.f17989d.setAlpha(1.0f);
                    this.f17989d.setTranslationY(0.0f);
                    if (this.f18001p && (view2 = this.f17992g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f18009x.b((View) null);
                } else {
                    this.f17989d.setTranslationY(0.0f);
                    float f10 = (float) (-this.f17989d.getHeight());
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.f17989d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.f17989d.setTranslationY(f10);
                    h hVar2 = new h();
                    i0 b10 = c0.b(this.f17989d);
                    b10.g(0.0f);
                    b10.f(this.f18010y);
                    if (!hVar2.f19474e) {
                        hVar2.f19470a.add(b10);
                    }
                    if (this.f18001p && (view3 = this.f17992g) != null) {
                        view3.setTranslationY(f10);
                        i0 b11 = c0.b(this.f17992g);
                        b11.g(0.0f);
                        if (!hVar2.f19474e) {
                            hVar2.f19470a.add(b11);
                        }
                    }
                    Interpolator interpolator = A;
                    boolean z11 = hVar2.f19474e;
                    if (!z11) {
                        hVar2.f19472c = interpolator;
                    }
                    if (!z11) {
                        hVar2.f19471b = 250;
                    }
                    o0.j0 j0Var = this.f18009x;
                    if (!z11) {
                        hVar2.f19473d = j0Var;
                    }
                    this.f18005t = hVar2;
                    hVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17988c;
                if (actionBarOverlayLayout != null) {
                    c0.A(actionBarOverlayLayout);
                }
            }
        } else if (this.f18004s) {
            this.f18004s = false;
            h hVar3 = this.f18005t;
            if (hVar3 != null) {
                hVar3.a();
            }
            if (this.f18000o != 0 || (!this.f18006u && !z10)) {
                this.f18008w.b((View) null);
                return;
            }
            this.f17989d.setAlpha(1.0f);
            this.f17989d.setTransitioning(true);
            h hVar4 = new h();
            float f11 = (float) (-this.f17989d.getHeight());
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f17989d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            i0 b12 = c0.b(this.f17989d);
            b12.g(f11);
            b12.f(this.f18010y);
            if (!hVar4.f19474e) {
                hVar4.f19470a.add(b12);
            }
            if (this.f18001p && (view = this.f17992g) != null) {
                i0 b13 = c0.b(view);
                b13.g(f11);
                if (!hVar4.f19474e) {
                    hVar4.f19470a.add(b13);
                }
            }
            Interpolator interpolator2 = f17985z;
            boolean z12 = hVar4.f19474e;
            if (!z12) {
                hVar4.f19472c = interpolator2;
            }
            if (!z12) {
                hVar4.f19471b = 250;
            }
            o0.j0 j0Var2 = this.f18008w;
            if (!z12) {
                hVar4.f19473d = j0Var2;
            }
            this.f18005t = hVar4;
            hVar4.b();
        }
    }

    public y(Dialog dialog) {
        new ArrayList();
        u(dialog.getWindow().getDecorView());
    }
}
