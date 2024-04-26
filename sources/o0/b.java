package o0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f22539a;

    /* compiled from: ActionProvider */
    public interface a {
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.f22539a != null) {
            StringBuilder a10 = android.support.v4.media.a.a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            a10.append(getClass().getSimpleName());
            a10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", a10.toString());
        }
        this.f22539a = aVar;
    }
}
