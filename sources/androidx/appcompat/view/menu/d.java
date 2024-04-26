package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public e f530a;

    /* renamed from: b  reason: collision with root package name */
    public int f531b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f532c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f533d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f534e;

    /* renamed from: f  reason: collision with root package name */
    public final int f535f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f533d = z10;
        this.f534e = layoutInflater;
        this.f530a = eVar;
        this.f535f = i10;
        a();
    }

    public void a() {
        e eVar = this.f530a;
        g gVar = eVar.f558v;
        if (gVar != null) {
            eVar.i();
            ArrayList<g> arrayList = eVar.f546j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == gVar) {
                    this.f531b = i10;
                    return;
                }
            }
        }
        this.f531b = -1;
    }

    /* renamed from: b */
    public g getItem(int i10) {
        ArrayList<g> arrayList;
        if (this.f533d) {
            e eVar = this.f530a;
            eVar.i();
            arrayList = eVar.f546j;
        } else {
            arrayList = this.f530a.l();
        }
        int i11 = this.f531b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayList.get(i10);
    }

    public int getCount() {
        ArrayList<g> arrayList;
        if (this.f533d) {
            e eVar = this.f530a;
            eVar.i();
            arrayList = eVar.f546j;
        } else {
            arrayList = this.f530a.l();
        }
        if (this.f531b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f534e.inflate(this.f535f, viewGroup, false);
        }
        int i11 = getItem(i10).f565b;
        int i12 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f530a.m() && i11 != (i12 >= 0 ? getItem(i12).f565b : i11));
        j.a aVar = (j.a) view;
        if (this.f532c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
