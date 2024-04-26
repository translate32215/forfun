package r1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import n9.f;
import o1.k;
import o1.r;

/* compiled from: NavigationUI.kt */
public final class d implements k.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference<f> f24498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f24499b;

    public d(WeakReference<f> weakReference, k kVar) {
        this.f24498a = weakReference;
        this.f24499b = kVar;
    }

    public void a(k kVar, r rVar, Bundle bundle) {
        ud.k.f(rVar, "destination");
        f fVar = (f) this.f24498a.get();
        if (fVar == null) {
            k kVar2 = this.f24499b;
            kVar2.getClass();
            kVar2.f22733q.remove(this);
            return;
        }
        Menu menu = fVar.getMenu();
        ud.k.e(menu, "view.menu");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            ud.k.b(item, "getItem(index)");
            if (e.a(rVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
