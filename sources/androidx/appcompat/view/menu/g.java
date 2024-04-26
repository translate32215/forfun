package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import i0.b;
import o0.b;

/* compiled from: MenuItemImpl */
public final class g implements b {
    public o0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f564a;

    /* renamed from: b  reason: collision with root package name */
    public final int f565b;

    /* renamed from: c  reason: collision with root package name */
    public final int f566c;

    /* renamed from: d  reason: collision with root package name */
    public final int f567d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f568e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f569f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f570g;

    /* renamed from: h  reason: collision with root package name */
    public char f571h;

    /* renamed from: i  reason: collision with root package name */
    public int f572i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f573j;

    /* renamed from: k  reason: collision with root package name */
    public int f574k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f575l;

    /* renamed from: m  reason: collision with root package name */
    public int f576m = 0;

    /* renamed from: n  reason: collision with root package name */
    public e f577n;

    /* renamed from: o  reason: collision with root package name */
    public l f578o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f579p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f580q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f581r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f582s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f583t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f584u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f585v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f586w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f587x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f588y = 0;

    /* renamed from: z  reason: collision with root package name */
    public View f589z;

    /* compiled from: MenuItemImpl */
    public class a implements b.a {
        public a() {
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f577n = eVar;
        this.f564a = i11;
        this.f565b = i10;
        this.f566c = i12;
        this.f567d = i13;
        this.f568e = charSequence;
        this.f588y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public o0.b a() {
        return this.A;
    }

    public i0.b b(o0.b bVar) {
        o0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f22539a = null;
        }
        this.f589z = null;
        this.A = bVar;
        this.f577n.p(true);
        o0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f588y & 8) == 0) {
            return false;
        }
        if (this.f589z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f577n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f586w && (this.f584u || this.f585v)) {
            drawable = androidx.core.graphics.drawable.a.n(drawable).mutate();
            if (this.f584u) {
                androidx.core.graphics.drawable.a.l(drawable, this.f582s);
            }
            if (this.f585v) {
                androidx.core.graphics.drawable.a.m(drawable, this.f583t);
            }
            this.f586w = false;
        }
        return drawable;
    }

    public char e() {
        return this.f577n.n() ? this.f573j : this.f571h;
    }

    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f577n.f(this);
        }
        return false;
    }

    public boolean f() {
        o0.b bVar;
        if ((this.f588y & 8) == 0) {
            return false;
        }
        if (this.f589z == null && (bVar = this.A) != null) {
            this.f589z = bVar.d(this);
        }
        if (this.f589z != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return (this.f587x & 32) == 32;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f589z;
        if (view != null) {
            return view;
        }
        o0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f589z = d10;
        return d10;
    }

    public int getAlphabeticModifiers() {
        return this.f574k;
    }

    public char getAlphabeticShortcut() {
        return this.f573j;
    }

    public CharSequence getContentDescription() {
        return this.f580q;
    }

    public int getGroupId() {
        return this.f565b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f575l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f576m;
        if (i10 == 0) {
            return null;
        }
        Drawable b10 = g.a.b(this.f577n.f537a, i10);
        this.f576m = 0;
        this.f575l = b10;
        return d(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f582s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f583t;
    }

    public Intent getIntent() {
        return this.f570g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f564a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public int getNumericModifiers() {
        return this.f572i;
    }

    public char getNumericShortcut() {
        return this.f571h;
    }

    public int getOrder() {
        return this.f566c;
    }

    public SubMenu getSubMenu() {
        return this.f578o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f568e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f569f;
        if (charSequence == null) {
            charSequence = this.f568e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f581r;
    }

    public boolean h() {
        return (this.f587x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f578o != null;
    }

    public i0.b i(View view) {
        int i10;
        this.f589z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f564a) > 0) {
            view.setId(i10);
        }
        e eVar = this.f577n;
        eVar.f547k = true;
        eVar.p(true);
        return this;
    }

    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        return (this.f587x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f587x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f587x & 16) != 0;
    }

    public boolean isVisible() {
        o0.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            if ((this.f587x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f587x & 8) != 0 || !this.A.b()) {
            return false;
        } else {
            return true;
        }
    }

    public void j(boolean z10) {
        int i10 = this.f587x;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f587x = i11;
        if (i10 != i11) {
            this.f577n.p(false);
        }
    }

    public void k(boolean z10) {
        this.f587x = (z10 ? 4 : 0) | (this.f587x & -5);
    }

    public void l(boolean z10) {
        if (z10) {
            this.f587x |= 32;
        } else {
            this.f587x &= -33;
        }
    }

    public boolean m(boolean z10) {
        int i10 = this.f587x;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f587x = i11;
        if (i10 != i11) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f577n.o() && e() != 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f573j == c10) {
            return this;
        }
        this.f573j = Character.toLowerCase(c10);
        this.f577n.p(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f587x;
        boolean z11 = z10 | (i10 & true);
        this.f587x = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f577n.p(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f587x & 4) != 0) {
            e eVar = this.f577n;
            eVar.getClass();
            int groupId = getGroupId();
            int size = eVar.f542f.size();
            eVar.A();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = eVar.f542f.get(i10);
                if (gVar.f565b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.z();
        } else {
            j(z10);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f580q = charSequence;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f587x |= 16;
        } else {
            this.f587x &= -17;
        }
        this.f577n.p(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f576m = 0;
        this.f575l = drawable;
        this.f586w = true;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f582s = colorStateList;
        this.f584u = true;
        this.f586w = true;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f583t = mode;
        this.f585v = true;
        this.f586w = true;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f570g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f571h == c10) {
            return this;
        }
        this.f571h = c10;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f579p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f571h = c10;
        this.f573j = Character.toLowerCase(c11);
        this.f577n.p(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f588y = i10;
            e eVar = this.f577n;
            eVar.f547k = true;
            eVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f568e = charSequence;
        this.f577n.p(false);
        l lVar = this.f578o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f569f = charSequence;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f581r = charSequence;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (m(z10)) {
            e eVar = this.f577n;
            eVar.f544h = true;
            eVar.p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f568e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem setActionView(int i10) {
        Context context = this.f577n.f537a;
        i(LayoutInflater.from(context).inflate(i10, new LinearLayout(context), false));
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public i0.b m0setContentDescription(CharSequence charSequence) {
        this.f580q = charSequence;
        this.f577n.p(false);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public i0.b m1setTooltipText(CharSequence charSequence) {
        this.f581r = charSequence;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f573j == c10 && this.f574k == i10) {
            return this;
        }
        this.f573j = Character.toLowerCase(c10);
        this.f574k = KeyEvent.normalizeMetaState(i10);
        this.f577n.p(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f571h == c10 && this.f572i == i10) {
            return this;
        }
        this.f571h = c10;
        this.f572i = KeyEvent.normalizeMetaState(i10);
        this.f577n.p(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f571h = c10;
        this.f572i = KeyEvent.normalizeMetaState(i10);
        this.f573j = Character.toLowerCase(c11);
        this.f574k = KeyEvent.normalizeMetaState(i11);
        this.f577n.p(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f575l = null;
        this.f576m = i10;
        this.f586w = true;
        this.f577n.p(false);
        return this;
    }

    public MenuItem setTitle(int i10) {
        setTitle((CharSequence) this.f577n.f537a.getString(i10));
        return this;
    }
}
