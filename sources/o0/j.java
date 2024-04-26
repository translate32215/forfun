package o0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f22588a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<l> f22589b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<l, a> f22590c = new HashMap();

    /* compiled from: MenuHostHelper */
    public static class a {
    }

    public j(Runnable runnable) {
        this.f22588a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<l> it = this.f22589b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator<l> it = this.f22589b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void c(Menu menu) {
        Iterator<l> it = this.f22589b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void d(l lVar) {
        this.f22589b.remove(lVar);
        if (this.f22590c.remove(lVar) == null) {
            this.f22588a.run();
            return;
        }
        throw null;
    }
}
