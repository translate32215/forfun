package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import i0.a;
import i0.b;
import i0.c;
import s.i;

/* compiled from: MenuWrapperICS */
public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f19863d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f19863d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f19863d.add(charSequence));
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f19863d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = c(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f19863d.addSubMenu(charSequence));
    }

    public void clear() {
        i<b, MenuItem> iVar = this.f19850b;
        if (iVar != null) {
            iVar.clear();
        }
        i<c, SubMenu> iVar2 = this.f19851c;
        if (iVar2 != null) {
            iVar2.clear();
        }
        this.f19863d.clear();
    }

    public void close() {
        this.f19863d.close();
    }

    public MenuItem findItem(int i10) {
        return c(this.f19863d.findItem(i10));
    }

    public MenuItem getItem(int i10) {
        return c(this.f19863d.getItem(i10));
    }

    public boolean hasVisibleItems() {
        return this.f19863d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f19863d.isShortcutKey(i10, keyEvent);
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return this.f19863d.performIdentifierAction(i10, i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f19863d.performShortcut(i10, keyEvent, i11);
    }

    public void removeGroup(int i10) {
        if (this.f19850b != null) {
            int i11 = 0;
            while (true) {
                i<b, MenuItem> iVar = this.f19850b;
                if (i11 >= iVar.f24851c) {
                    break;
                }
                if (iVar.h(i11).getGroupId() == i10) {
                    this.f19850b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f19863d.removeGroup(i10);
    }

    public void removeItem(int i10) {
        if (this.f19850b != null) {
            int i11 = 0;
            while (true) {
                i<b, MenuItem> iVar = this.f19850b;
                if (i11 >= iVar.f24851c) {
                    break;
                } else if (iVar.h(i11).getItemId() == i10) {
                    this.f19850b.j(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f19863d.removeItem(i10);
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f19863d.setGroupCheckable(i10, z10, z11);
    }

    public void setGroupEnabled(int i10, boolean z10) {
        this.f19863d.setGroupEnabled(i10, z10);
    }

    public void setGroupVisible(int i10, boolean z10) {
        this.f19863d.setGroupVisible(i10, z10);
    }

    public void setQwertyMode(boolean z10) {
        this.f19863d.setQwertyMode(z10);
    }

    public int size() {
        return this.f19863d.size();
    }

    public MenuItem add(int i10) {
        return c(this.f19863d.add(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return d(this.f19863d.addSubMenu(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f19863d.add(i10, i11, i12, charSequence));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f19863d.addSubMenu(i10, i11, i12, charSequence));
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f19863d.add(i10, i11, i12, i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f19863d.addSubMenu(i10, i11, i12, i13));
    }
}
