package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder */
public class l extends e implements SubMenu {
    public g A;

    /* renamed from: z  reason: collision with root package name */
    public e f623z;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f623z = eVar;
        this.A = gVar;
    }

    public boolean d(g gVar) {
        return this.f623z.d(gVar);
    }

    public boolean e(e eVar, MenuItem menuItem) {
        return super.e(eVar, menuItem) || this.f623z.e(eVar, menuItem);
    }

    public boolean f(g gVar) {
        return this.f623z.f(gVar);
    }

    public MenuItem getItem() {
        return this.A;
    }

    public String j() {
        g gVar = this.A;
        int i10 = gVar != null ? gVar.f564a : 0;
        if (i10 == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i10;
    }

    public e k() {
        return this.f623z.k();
    }

    public boolean m() {
        return this.f623z.m();
    }

    public boolean n() {
        return this.f623z.n();
    }

    public boolean o() {
        return this.f623z.o();
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f623z.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        y(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        y(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        y(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.f623z.setQwertyMode(z10);
    }

    public SubMenu setHeaderIcon(int i10) {
        y(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        y(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
