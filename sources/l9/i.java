package l9;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* compiled from: NavigationMenu */
public class i extends e {
    public i(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        k kVar = new k(this.f537a, this, gVar);
        gVar.f578o = kVar;
        kVar.setHeaderTitle(gVar.f568e);
        return kVar;
    }
}
