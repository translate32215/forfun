package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import i0.c;
import s.i;

/* compiled from: BaseMenuWrapper */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19849a;

    /* renamed from: b  reason: collision with root package name */
    public i<i0.b, MenuItem> f19850b;

    /* renamed from: c  reason: collision with root package name */
    public i<c, SubMenu> f19851c;

    public b(Context context) {
        this.f19849a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof i0.b)) {
            return menuItem;
        }
        i0.b bVar = (i0.b) menuItem;
        if (this.f19850b == null) {
            this.f19850b = new i<>();
        }
        MenuItem menuItem2 = this.f19850b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f19849a, bVar);
        this.f19850b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f19851c == null) {
            this.f19851c = new i<>();
        }
        SubMenu subMenu2 = this.f19851c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f19849a, cVar);
        this.f19851c.put(cVar, gVar);
        return gVar;
    }
}
