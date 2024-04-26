package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* compiled from: MenuPopup */
public abstract class d implements f, i, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f19862a;

    public static int n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) listAdapter;
        int count = dVar.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = dVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = dVar.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean v(e eVar) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public void c(Context context, e eVar) {
    }

    public int getId() {
        return 0;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public boolean k(e eVar, g gVar) {
        return false;
    }

    public abstract void m(e eVar);

    public abstract void o(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        androidx.appcompat.view.menu.d dVar;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            dVar = (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            dVar = (androidx.appcompat.view.menu.d) listAdapter;
        }
        dVar.f530a.r((MenuItem) listAdapter.getItem(i10), this, (this instanceof b) ^ true ? 0 : 4);
    }

    public abstract void p(boolean z10);

    public abstract void q(int i10);

    public abstract void r(int i10);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z10);

    public abstract void u(int i10);
}
