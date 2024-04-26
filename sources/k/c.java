package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;
import o0.b;

/* compiled from: MenuItemWrapperICS */
public class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final i0.b f19852d;

    /* renamed from: e  reason: collision with root package name */
    public Method f19853e;

    /* compiled from: MenuItemWrapperICS */
    public class a extends o0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f19854b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f19854b = actionProvider;
        }

        public boolean a() {
            return this.f19854b.hasSubMenu();
        }

        public View c() {
            return this.f19854b.onCreateActionView();
        }

        public boolean e() {
            return this.f19854b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f19854b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f19856d;

        public b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f19854b.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f19854b.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f19854b.overridesItemVisibility();
        }

        public void h(b.a aVar) {
            this.f19856d = aVar;
            this.f19854b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            b.a aVar = this.f19856d;
            if (aVar != null) {
                androidx.appcompat.view.menu.e eVar = g.this.f577n;
                eVar.f544h = true;
                eVar.p(true);
            }
        }
    }

    /* renamed from: k.c$c  reason: collision with other inner class name */
    /* compiled from: MenuItemWrapperICS */
    public static class C0171c extends FrameLayout implements j.b {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f19857a;

        public C0171c(View view) {
            super(view.getContext());
            this.f19857a = (CollapsibleActionView) view;
            addView(view);
        }

        public void c() {
            this.f19857a.onActionViewExpanded();
        }

        public void e() {
            this.f19857a.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f19858a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f19858a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f19858a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f19858a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f19860a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f19860a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f19860a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, i0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f19852d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f19852d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f19852d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        o0.b a10 = this.f19852d.a();
        if (a10 instanceof a) {
            return ((a) a10).f19854b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f19852d.getActionView();
        return actionView instanceof C0171c ? (View) ((C0171c) actionView).f19857a : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f19852d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f19852d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f19852d.getContentDescription();
    }

    public int getGroupId() {
        return this.f19852d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f19852d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f19852d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f19852d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f19852d.getIntent();
    }

    public int getItemId() {
        return this.f19852d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f19852d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f19852d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f19852d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f19852d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f19852d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f19852d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f19852d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f19852d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f19852d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f19852d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f19852d.isCheckable();
    }

    public boolean isChecked() {
        return this.f19852d.isChecked();
    }

    public boolean isEnabled() {
        return this.f19852d.isEnabled();
    }

    public boolean isVisible() {
        return this.f19852d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f19849a, actionProvider);
        i0.b bVar2 = this.f19852d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0171c(view);
        }
        this.f19852d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f19852d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f19852d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f19852d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f19852d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f19852d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f19852d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19852d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19852d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f19852d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f19852d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19852d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19852d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f19852d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f19852d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f19852d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f19852d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19852d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f19852d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f19852d.setVisible(z10);
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f19852d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f19852d.setIcon(i10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f19852d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f19852d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f19852d.setTitle(i10);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f19852d.setActionView(i10);
        View actionView = this.f19852d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f19852d.setActionView((View) new C0171c(actionView));
        }
        return this;
    }
}
