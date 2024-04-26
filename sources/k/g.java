package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import i0.c;

/* compiled from: SubMenuWrapperICS */
public class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f19864e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f19864e = cVar;
    }

    public void clearHeader() {
        this.f19864e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f19864e.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f19864e.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f19864e.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f19864e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f19864e.setIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f19864e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f19864e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f19864e.setIcon(drawable);
        return this;
    }
}
