package f;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.j0;
import f.a;
import f.l;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: ToolbarActionBar */
public class v extends a {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f17961a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f17962b;

    /* renamed from: c  reason: collision with root package name */
    public final l.d f17963c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17964d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17965e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17966f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<a.b> f17967g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f17968h = new a();

    /* compiled from: ToolbarActionBar */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            v vVar = v.this;
            Menu t10 = vVar.t();
            androidx.appcompat.view.menu.e eVar = t10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) t10 : null;
            if (eVar != null) {
                eVar.A();
            }
            try {
                t10.clear();
                if (!vVar.f17962b.onCreatePanelMenu(0, t10) || !vVar.f17962b.onPreparePanel(0, (View) null, t10)) {
                    t10.clear();
                }
            } finally {
                if (eVar != null) {
                    eVar.z();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class b implements Toolbar.f {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class c implements i.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17971a;

        public c() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (!this.f17971a) {
                this.f17971a = true;
                v.this.f17961a.h();
                v.this.f17962b.onPanelClosed(108, eVar);
                this.f17971a = false;
            }
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            v.this.f17962b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class d implements e.a {
        public d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            if (v.this.f17961a.b()) {
                v.this.f17962b.onPanelClosed(108, eVar);
            } else if (v.this.f17962b.onPreparePanel(0, (View) null, eVar)) {
                v.this.f17962b.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class e implements l.d {
        public e() {
        }
    }

    public v(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        i1 i1Var = new i1(toolbar, false);
        this.f17961a = i1Var;
        callback.getClass();
        this.f17962b = callback;
        i1Var.f952l = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        if (!i1Var.f948h) {
            i1Var.z(charSequence);
        }
        this.f17963c = new e();
    }

    public boolean a() {
        return this.f17961a.e();
    }

    public boolean b() {
        if (!this.f17961a.n()) {
            return false;
        }
        this.f17961a.collapseActionView();
        return true;
    }

    public void c(boolean z10) {
        if (z10 != this.f17966f) {
            this.f17966f = z10;
            int size = this.f17967g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f17967g.get(i10).a(z10);
            }
        }
    }

    public int d() {
        return this.f17961a.p();
    }

    public Context e() {
        return this.f17961a.getContext();
    }

    public boolean f() {
        this.f17961a.l().removeCallbacks(this.f17968h);
        ViewGroup l10 = this.f17961a.l();
        Runnable runnable = this.f17968h;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.m(l10, runnable);
        return true;
    }

    public void g(Configuration configuration) {
    }

    public void h() {
        this.f17961a.l().removeCallbacks(this.f17968h);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        Menu t10 = t();
        if (t10 == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        t10.setQwertyMode(z10);
        return t10.performShortcut(i10, keyEvent, 0);
    }

    public boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f17961a.f();
        }
        return true;
    }

    public boolean k() {
        return this.f17961a.f();
    }

    public void l(boolean z10) {
    }

    public void m(boolean z10) {
        this.f17961a.o(((z10 ? 4 : 0) & 4) | (-5 & this.f17961a.p()));
    }

    public void n(int i10) {
        this.f17961a.s(i10);
    }

    public void o(Drawable drawable) {
        this.f17961a.x(drawable);
    }

    public void p(boolean z10) {
    }

    public void q(CharSequence charSequence) {
        this.f17961a.setTitle(charSequence);
    }

    public void r(CharSequence charSequence) {
        this.f17961a.setWindowTitle(charSequence);
    }

    public final Menu t() {
        if (!this.f17965e) {
            this.f17961a.i(new c(), new d());
            this.f17965e = true;
        }
        return this.f17961a.q();
    }
}
