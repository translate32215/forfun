package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class s0 extends q0 implements r0 {
    public static Method L;
    public r0 K;

    /* compiled from: MenuPopupWindow */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* compiled from: MenuPopupWindow */
    public static class c extends l0 {

        /* renamed from: v  reason: collision with root package name */
        public final int f1089v;

        /* renamed from: w  reason: collision with root package name */
        public final int f1090w;

        /* renamed from: x  reason: collision with root package name */
        public r0 f1091x;

        /* renamed from: y  reason: collision with root package name */
        public MenuItem f1092y;

        /* compiled from: MenuPopupWindow */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1089v = 21;
                this.f1090w = 22;
                return;
            }
            this.f1089v = 22;
            this.f1090w = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            d dVar;
            int pointToPosition;
            int i11;
            if (this.f1091x != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    dVar = (d) adapter;
                }
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f1092y;
                if (menuItem != gVar) {
                    e eVar = dVar.f530a;
                    if (menuItem != null) {
                        this.f1091x.d(eVar, menuItem);
                    }
                    this.f1092y = gVar;
                    if (gVar != null) {
                        this.f1091x.a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1089v) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f1090w) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                }
                dVar.f530a.c(false);
                return true;
            }
        }

        public void setHoverListener(r0 r0Var) {
            this.f1091x = r0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public s0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (AttributeSet) null, i10, i11);
    }

    public void a(e eVar, MenuItem menuItem) {
        r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.a(eVar, menuItem);
        }
    }

    public void d(e eVar, MenuItem menuItem) {
        r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.d(eVar, menuItem);
        }
    }

    public l0 p(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
