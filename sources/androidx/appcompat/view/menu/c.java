package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.startapp.startappsdk.R;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f522a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f523b;

    /* renamed from: c  reason: collision with root package name */
    public e f524c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f525d;

    /* renamed from: e  reason: collision with root package name */
    public i.a f526e;

    /* renamed from: f  reason: collision with root package name */
    public a f527f;

    /* compiled from: ListMenuPresenter */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f528a = -1;

        public a() {
            a();
        }

        public void a() {
            e eVar = c.this.f524c;
            g gVar = eVar.f558v;
            if (gVar != null) {
                eVar.i();
                ArrayList<g> arrayList = eVar.f546j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == gVar) {
                        this.f528a = i10;
                        return;
                    }
                }
            }
            this.f528a = -1;
        }

        /* renamed from: b */
        public g getItem(int i10) {
            e eVar = c.this.f524c;
            eVar.i();
            ArrayList<g> arrayList = eVar.f546j;
            c.this.getClass();
            int i11 = i10 + 0;
            int i12 = this.f528a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        public int getCount() {
            e eVar = c.this.f524c;
            eVar.i();
            int size = eVar.f546j.size();
            c.this.getClass();
            int i10 = size + 0;
            return this.f528a < 0 ? i10 : i10 - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f523b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).d(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this.f522a = context;
        this.f523b = LayoutInflater.from(context);
    }

    public void a(e eVar, boolean z10) {
        i.a aVar = this.f526e;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f527f == null) {
            this.f527f = new a();
        }
        return this.f527f;
    }

    public void c(Context context, e eVar) {
        if (this.f522a != null) {
            this.f522a = context;
            if (this.f523b == null) {
                this.f523b = LayoutInflater.from(context);
            }
        }
        this.f524c = eVar;
        a aVar = this.f527f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void d(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f525d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        f fVar = new f(lVar);
        b.a aVar = new b.a(lVar.f537a);
        c cVar = new c(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        fVar.f563c = cVar;
        cVar.f526e = fVar;
        e eVar = fVar.f561a;
        eVar.b(cVar, eVar.f537a);
        ListAdapter b10 = fVar.f563c.b();
        AlertController.b bVar = aVar.f441a;
        bVar.f432l = b10;
        bVar.f433m = fVar;
        View view = lVar.f551o;
        if (view != null) {
            bVar.f425e = view;
        } else {
            bVar.f423c = lVar.f550n;
            aVar.setTitle(lVar.f549m);
        }
        aVar.f441a.f431k = fVar;
        b create = aVar.create();
        fVar.f562b = create;
        create.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f562b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f562b.show();
        i.a aVar2 = this.f526e;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(lVar);
        return true;
    }

    public void g(boolean z10) {
        a aVar = this.f527f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public int getId() {
        return 0;
    }

    public boolean h() {
        return false;
    }

    public Parcelable i() {
        if (this.f525d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f525d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public boolean k(e eVar, g gVar) {
        return false;
    }

    public void l(i.a aVar) {
        this.f526e = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f524c.r(this.f527f.getItem(i10), this, 0);
    }
}
