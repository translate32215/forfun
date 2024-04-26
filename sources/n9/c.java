package n9;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.activity.result.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* compiled from: NavigationBarMenu */
public final class c extends e {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f22436z;

    public c(Context context, Class<?> cls, int i10) {
        super(context);
        this.f22436z = cls;
        this.A = i10;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.A) {
            A();
            MenuItem a10 = super.a(i10, i11, i12, charSequence);
            ((g) a10).k(true);
            z();
            return a10;
        }
        String simpleName = this.f22436z.getSimpleName();
        StringBuilder a11 = d.a("Maximum number of items supported by ", simpleName, " is ");
        a11.append(this.A);
        a11.append(". Limit can be checked with ");
        a11.append(simpleName);
        a11.append("#getMaxItemCount()");
        throw new IllegalArgumentException(a11.toString());
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f22436z.getSimpleName() + " does not support submenus");
    }
}
