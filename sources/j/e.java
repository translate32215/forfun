package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i0.b;
import j.a;
import java.util.ArrayList;
import k.c;
import s.i;

/* compiled from: SupportActionModeWrapper */
public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19429a;

    /* renamed from: b  reason: collision with root package name */
    public final a f19430b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements a.C0165a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f19431a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f19432b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f19433c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final i<Menu, Menu> f19434d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f19432b = context;
            this.f19431a = callback;
        }

        public boolean a(a aVar, MenuItem menuItem) {
            return this.f19431a.onActionItemClicked(e(aVar), new c(this.f19432b, (b) menuItem));
        }

        public boolean b(a aVar, Menu menu) {
            return this.f19431a.onCreateActionMode(e(aVar), f(menu));
        }

        public void c(a aVar) {
            this.f19431a.onDestroyActionMode(e(aVar));
        }

        public boolean d(a aVar, Menu menu) {
            return this.f19431a.onPrepareActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a aVar) {
            int size = this.f19433c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f19433c.get(i10);
                if (eVar != null && eVar.f19430b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f19432b, aVar);
            this.f19433c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f19434d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            k.e eVar = new k.e(this.f19432b, (i0.a) menu);
            this.f19434d.put(menu, eVar);
            return eVar;
        }
    }

    public e(Context context, a aVar) {
        this.f19429a = context;
        this.f19430b = aVar;
    }

    public void finish() {
        this.f19430b.c();
    }

    public View getCustomView() {
        return this.f19430b.d();
    }

    public Menu getMenu() {
        return new k.e(this.f19429a, (i0.a) this.f19430b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f19430b.f();
    }

    public CharSequence getSubtitle() {
        return this.f19430b.g();
    }

    public Object getTag() {
        return this.f19430b.f19415a;
    }

    public CharSequence getTitle() {
        return this.f19430b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.f19430b.f19416b;
    }

    public void invalidate() {
        this.f19430b.i();
    }

    public boolean isTitleOptional() {
        return this.f19430b.j();
    }

    public void setCustomView(View view) {
        this.f19430b.k(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f19430b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.f19430b.f19415a = obj;
    }

    public void setTitle(CharSequence charSequence) {
        this.f19430b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f19430b.p(z10);
    }

    public void setSubtitle(int i10) {
        this.f19430b.l(i10);
    }

    public void setTitle(int i10) {
        this.f19430b.n(i10);
    }
}
