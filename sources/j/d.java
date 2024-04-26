package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import j.a;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class d extends a implements e.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f19423c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f19424d;

    /* renamed from: e  reason: collision with root package name */
    public a.C0165a f19425e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<View> f19426f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19427g;

    /* renamed from: h  reason: collision with root package name */
    public e f19428h;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0165a aVar, boolean z10) {
        this.f19423c = context;
        this.f19424d = actionBarContextView;
        this.f19425e = aVar;
        e eVar = new e(actionBarContextView.getContext());
        eVar.f548l = 1;
        this.f19428h = eVar;
        eVar.f541e = this;
    }

    public boolean a(e eVar, MenuItem menuItem) {
        return this.f19425e.a(this, menuItem);
    }

    public void b(e eVar) {
        i();
        c cVar = this.f19424d.f793d;
        if (cVar != null) {
            cVar.p();
        }
    }

    public void c() {
        if (!this.f19427g) {
            this.f19427g = true;
            this.f19425e.c(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f19426f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f19428h;
    }

    public MenuInflater f() {
        return new g(this.f19424d.getContext());
    }

    public CharSequence g() {
        return this.f19424d.getSubtitle();
    }

    public CharSequence h() {
        return this.f19424d.getTitle();
    }

    public void i() {
        this.f19425e.d(this, this.f19428h);
    }

    public boolean j() {
        return this.f19424d.A;
    }

    public void k(View view) {
        this.f19424d.setCustomView(view);
        this.f19426f = view != null ? new WeakReference<>(view) : null;
    }

    public void l(int i10) {
        this.f19424d.setSubtitle(this.f19423c.getString(i10));
    }

    public void m(CharSequence charSequence) {
        this.f19424d.setSubtitle(charSequence);
    }

    public void n(int i10) {
        this.f19424d.setTitle(this.f19423c.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f19424d.setTitle(charSequence);
    }

    public void p(boolean z10) {
        this.f19416b = z10;
        this.f19424d.setTitleOptional(z10);
    }
}
