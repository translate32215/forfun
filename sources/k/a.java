package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import i0.b;

/* compiled from: ActionMenuItem */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f19833a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f19834b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f19835c;

    /* renamed from: d  reason: collision with root package name */
    public char f19836d;

    /* renamed from: e  reason: collision with root package name */
    public int f19837e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f19838f;

    /* renamed from: g  reason: collision with root package name */
    public int f19839g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f19840h;

    /* renamed from: i  reason: collision with root package name */
    public Context f19841i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f19842j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f19843k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f19844l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f19845m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19846n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19847o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f19848p = 16;

    public a(Context context, int i10, int i11, int i12, CharSequence charSequence) {
        this.f19841i = context;
        this.f19833a = charSequence;
    }

    public o0.b a() {
        return null;
    }

    public b b(o0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f19840h;
        if (drawable == null) {
            return;
        }
        if (this.f19846n || this.f19847o) {
            Drawable n10 = androidx.core.graphics.drawable.a.n(drawable);
            this.f19840h = n10;
            Drawable mutate = n10.mutate();
            this.f19840h = mutate;
            if (this.f19846n) {
                androidx.core.graphics.drawable.a.l(mutate, this.f19844l);
            }
            if (this.f19847o) {
                androidx.core.graphics.drawable.a.m(this.f19840h, this.f19845m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f19839g;
    }

    public char getAlphabeticShortcut() {
        return this.f19838f;
    }

    public CharSequence getContentDescription() {
        return this.f19842j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f19840h;
    }

    public ColorStateList getIconTintList() {
        return this.f19844l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f19845m;
    }

    public Intent getIntent() {
        return this.f19835c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f19837e;
    }

    public char getNumericShortcut() {
        return this.f19836d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f19833a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19834b;
        return charSequence != null ? charSequence : this.f19833a;
    }

    public CharSequence getTooltipText() {
        return this.f19843k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f19848p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f19848p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f19848p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f19848p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f19838f = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f19848p = z10 | (this.f19848p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f19848p = (z10 ? 2 : 0) | (this.f19848p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f19842j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f19848p = (z10 ? 16 : 0) | (this.f19848p & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f19840h = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19844l = colorStateList;
        this.f19846n = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19845m = mode;
        this.f19847o = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f19835c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f19836d = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f19836d = c10;
        this.f19838f = Character.toLowerCase(c11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f19833a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19834b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f19843k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f19848p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f19848p = i11 | i10;
        return this;
    }

    public MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f19838f = Character.toLowerCase(c10);
        this.f19839g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m18setContentDescription(CharSequence charSequence) {
        this.f19842j = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f19836d = c10;
        this.f19837e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f19833a = this.f19841i.getResources().getString(i10);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m19setTooltipText(CharSequence charSequence) {
        this.f19843k = charSequence;
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f19840h = d0.a.c(this.f19841i, i10);
        c();
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f19836d = c10;
        this.f19837e = KeyEvent.normalizeMetaState(i10);
        this.f19838f = Character.toLowerCase(c11);
        this.f19839g = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
