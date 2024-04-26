package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s0;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: CascadingMenuPopup */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public i.a F;
    public ViewTreeObserver G;
    public PopupWindow.OnDismissListener H;
    public boolean I;

    /* renamed from: b  reason: collision with root package name */
    public final Context f495b;

    /* renamed from: c  reason: collision with root package name */
    public final int f496c;

    /* renamed from: d  reason: collision with root package name */
    public final int f497d;

    /* renamed from: e  reason: collision with root package name */
    public final int f498e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f499f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f500g;

    /* renamed from: h  reason: collision with root package name */
    public final List<e> f501h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List<d> f502i = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f503r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f504s = new C0010b();

    /* renamed from: t  reason: collision with root package name */
    public final r0 f505t = new c();

    /* renamed from: u  reason: collision with root package name */
    public int f506u;

    /* renamed from: v  reason: collision with root package name */
    public int f507v;

    /* renamed from: w  reason: collision with root package name */
    public View f508w;

    /* renamed from: x  reason: collision with root package name */
    public View f509x;

    /* renamed from: y  reason: collision with root package name */
    public int f510y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f511z;

    /* compiled from: CascadingMenuPopup */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (b.this.b() && b.this.f502i.size() > 0 && !b.this.f502i.get(0).f519a.F) {
                View view = b.this.f509x;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f502i) {
                    dVar.f519a.S();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    public class C0010b implements View.OnAttachStateChangeListener {
        public C0010b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.G = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.G.removeGlobalOnLayoutListener(bVar.f503r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public class c implements r0 {

        /* compiled from: CascadingMenuPopup */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f515a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MenuItem f516b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e f517c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f515a = dVar;
                this.f516b = menuItem;
                this.f517c = eVar;
            }

            public void run() {
                d dVar = this.f515a;
                if (dVar != null) {
                    b.this.I = true;
                    dVar.f520b.c(false);
                    b.this.I = false;
                }
                if (this.f516b.isEnabled() && this.f516b.hasSubMenu()) {
                    this.f517c.q(this.f516b, 4);
                }
            }
        }

        public c() {
        }

        public void a(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.f500g.removeCallbacksAndMessages((Object) null);
            int size = b.this.f502i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f502i.get(i10).f520b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < b.this.f502i.size()) {
                    dVar = b.this.f502i.get(i11);
                }
                b.this.f500g.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void d(e eVar, MenuItem menuItem) {
            b.this.f500g.removeCallbacksAndMessages(eVar);
        }
    }

    /* compiled from: CascadingMenuPopup */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f519a;

        /* renamed from: b  reason: collision with root package name */
        public final e f520b;

        /* renamed from: c  reason: collision with root package name */
        public final int f521c;

        public d(s0 s0Var, e eVar, int i10) {
            this.f519a = s0Var;
            this.f520b = eVar;
            this.f521c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f506u = 0;
        this.f507v = 0;
        this.f495b = context;
        this.f508w = view;
        this.f497d = i10;
        this.f498e = i11;
        this.f499f = z10;
        this.D = false;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        this.f510y = c0.e.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f496c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f500g = new Handler();
    }

    public void S() {
        if (!b()) {
            for (e w10 : this.f501h) {
                w(w10);
            }
            this.f501h.clear();
            View view = this.f508w;
            this.f509x = view;
            if (view != null) {
                boolean z10 = this.G == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.G = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f503r);
                }
                this.f509x.addOnAttachStateChangeListener(this.f504s);
            }
        }
    }

    public void a(e eVar, boolean z10) {
        int size = this.f502i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (eVar == this.f502i.get(i10).f520b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int i11 = i10 + 1;
            if (i11 < this.f502i.size()) {
                this.f502i.get(i11).f520b.c(false);
            }
            d remove = this.f502i.remove(i10);
            remove.f520b.t(this);
            if (this.I) {
                s0 s0Var = remove.f519a;
                s0Var.getClass();
                if (Build.VERSION.SDK_INT >= 23) {
                    s0.a.b(s0Var.G, (Transition) null);
                }
                remove.f519a.G.setAnimationStyle(0);
            }
            remove.f519a.dismiss();
            int size2 = this.f502i.size();
            if (size2 > 0) {
                this.f510y = this.f502i.get(size2 - 1).f521c;
            } else {
                View view = this.f508w;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                this.f510y = c0.e.d(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                i.a aVar = this.F;
                if (aVar != null) {
                    aVar.a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.G;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.G.removeGlobalOnLayoutListener(this.f503r);
                    }
                    this.G = null;
                }
                this.f509x.removeOnAttachStateChangeListener(this.f504s);
                this.H.onDismiss();
            } else if (z10) {
                this.f502i.get(0).f520b.c(false);
            }
        }
    }

    public boolean b() {
        return this.f502i.size() > 0 && this.f502i.get(0).f519a.b();
    }

    public void d(Parcelable parcelable) {
    }

    public void dismiss() {
        int size = this.f502i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f502i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f519a.b()) {
                    dVar.f519a.dismiss();
                }
            }
        }
    }

    public boolean e(l lVar) {
        for (d next : this.f502i) {
            if (lVar == next.f520b) {
                next.f519a.f1060c.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        lVar.b(this, this.f495b);
        if (b()) {
            w(lVar);
        } else {
            this.f501h.add(lVar);
        }
        i.a aVar = this.F;
        if (aVar != null) {
            aVar.b(lVar);
        }
        return true;
    }

    public ListView f() {
        if (this.f502i.isEmpty()) {
            return null;
        }
        List<d> list = this.f502i;
        return list.get(list.size() - 1).f519a.f1060c;
    }

    public void g(boolean z10) {
        for (d dVar : this.f502i) {
            ListAdapter adapter = dVar.f519a.f1060c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((d) adapter).notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public Parcelable i() {
        return null;
    }

    public void l(i.a aVar) {
        this.F = aVar;
    }

    public void m(e eVar) {
        eVar.b(this, this.f495b);
        if (b()) {
            w(eVar);
        } else {
            this.f501h.add(eVar);
        }
    }

    public void o(View view) {
        if (this.f508w != view) {
            this.f508w = view;
            int i10 = this.f506u;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            this.f507v = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        }
    }

    public void onDismiss() {
        d dVar;
        int size = this.f502i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f502i.get(i10);
            if (!dVar.f519a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f520b.c(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(boolean z10) {
        this.D = z10;
    }

    public void q(int i10) {
        if (this.f506u != i10) {
            this.f506u = i10;
            View view = this.f508w;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            this.f507v = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        }
    }

    public void r(int i10) {
        this.f511z = true;
        this.B = i10;
    }

    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    public void t(boolean z10) {
        this.E = z10;
    }

    public void u(int i10) {
        this.A = true;
        this.C = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (((r10.getWidth() + r12[0]) + r4) > r11.right) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        if ((r12[0] - r4) < 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(androidx.appcompat.view.menu.e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f495b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f499f
            r5 = 2131623947(0x7f0e000b, float:1.887506E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.b()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.D
            if (r4 == 0) goto L_0x0022
            r3.f532c = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.b()
            if (r4 == 0) goto L_0x002e
            boolean r4 = k.d.v(r17)
            r3.f532c = r4
        L_0x002e:
            android.content.Context r4 = r0.f495b
            int r6 = r0.f496c
            r7 = 0
            int r4 = k.d.n(r3, r7, r4, r6)
            androidx.appcompat.widget.s0 r6 = new androidx.appcompat.widget.s0
            android.content.Context r8 = r0.f495b
            int r9 = r0.f497d
            int r10 = r0.f498e
            r6.<init>(r8, r7, r9, r10)
            androidx.appcompat.widget.r0 r8 = r0.f505t
            r6.K = r8
            r6.f1073x = r0
            android.widget.PopupWindow r8 = r6.G
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f508w
            r6.f1072w = r8
            int r8 = r0.f507v
            r6.f1069t = r8
            r6.r(r5)
            android.widget.PopupWindow r8 = r6.G
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.o(r3)
            r6.q(r4)
            int r3 = r0.f507v
            r6.f1069t = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f502i
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e6
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f502i
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.b.d) r3
            androidx.appcompat.view.menu.e r10 = r3.f520b
            int r11 = r10.size()
            r12 = 0
        L_0x0085:
            if (r12 >= r11) goto L_0x009b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0098
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0085
        L_0x009b:
            r13 = r7
        L_0x009c:
            if (r13 != 0) goto L_0x009f
            goto L_0x00e8
        L_0x009f:
            androidx.appcompat.widget.s0 r10 = r3.f519a
            androidx.appcompat.widget.l0 r10 = r10.f1060c
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.d) r11
            goto L_0x00bb
        L_0x00b8:
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.d) r11
            r12 = 0
        L_0x00bb:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c0:
            r9 = -1
            if (r15 >= r14) goto L_0x00ce
            androidx.appcompat.view.menu.g r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00c0
        L_0x00ce:
            r15 = -1
        L_0x00cf:
            if (r15 != r9) goto L_0x00d2
            goto L_0x00e7
        L_0x00d2:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e7
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e8
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 == 0) goto L_0x01b5
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0108
            java.lang.reflect.Method r9 = androidx.appcompat.widget.s0.L
            if (r9 == 0) goto L_0x010d
            android.widget.PopupWindow r10 = r6.G     // Catch:{ Exception -> 0x0100 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0100 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0100 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0100 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0100 }
            goto L_0x010d
        L_0x0100:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010d
        L_0x0108:
            android.widget.PopupWindow r9 = r6.G
            androidx.appcompat.widget.s0.b.a(r9, r8)
        L_0x010d:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x0119
            android.widget.PopupWindow r10 = r6.G
            r11 = 0
            androidx.appcompat.widget.s0.a.a(r10, r11)
        L_0x0119:
            java.util.List<androidx.appcompat.view.menu.b$d> r10 = r0.f502i
            int r11 = r10.size()
            int r11 = r11 - r5
            java.lang.Object r10 = r10.get(r11)
            androidx.appcompat.view.menu.b$d r10 = (androidx.appcompat.view.menu.b.d) r10
            androidx.appcompat.widget.s0 r10 = r10.f519a
            androidx.appcompat.widget.l0 r10 = r10.f1060c
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.f509x
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.f510y
            if (r13 != r5) goto L_0x014b
            r12 = r12[r8]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L_0x0150
            goto L_0x0152
        L_0x014b:
            r10 = r12[r8]
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x0152
        L_0x0150:
            r10 = 1
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            if (r10 != r5) goto L_0x0157
            r11 = 1
            goto L_0x0158
        L_0x0157:
            r11 = 0
        L_0x0158:
            r0.f510y = r10
            r10 = 26
            r12 = 5
            if (r9 < r10) goto L_0x0164
            r6.f1072w = r7
            r9 = 0
            r13 = 0
            goto L_0x0195
        L_0x0164:
            r9 = 2
            int[] r10 = new int[r9]
            android.view.View r13 = r0.f508w
            r13.getLocationOnScreen(r10)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f507v
            r13 = r13 & 7
            if (r13 != r12) goto L_0x018b
            r13 = r10[r8]
            android.view.View r14 = r0.f508w
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x018b:
            r13 = r9[r8]
            r14 = r10[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r10 = r10[r5]
            int r9 = r9 - r10
        L_0x0195:
            int r10 = r0.f507v
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01a2
            if (r11 == 0) goto L_0x019d
            goto L_0x01a8
        L_0x019d:
            int r4 = r7.getWidth()
            goto L_0x01aa
        L_0x01a2:
            if (r11 == 0) goto L_0x01aa
            int r4 = r7.getWidth()
        L_0x01a8:
            int r13 = r13 + r4
            goto L_0x01ab
        L_0x01aa:
            int r13 = r13 - r4
        L_0x01ab:
            r6.f1063f = r13
            r6.f1068s = r5
            r6.f1067r = r5
            r6.i(r9)
            goto L_0x01d3
        L_0x01b5:
            boolean r4 = r0.f511z
            if (r4 == 0) goto L_0x01bd
            int r4 = r0.B
            r6.f1063f = r4
        L_0x01bd:
            boolean r4 = r0.A
            if (r4 == 0) goto L_0x01c6
            int r4 = r0.C
            r6.i(r4)
        L_0x01c6:
            android.graphics.Rect r4 = r0.f19862a
            if (r4 == 0) goto L_0x01d0
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r4)
            goto L_0x01d1
        L_0x01d0:
            r11 = 0
        L_0x01d1:
            r6.E = r11
        L_0x01d3:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f510y
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f502i
            r5.add(r4)
            r6.S()
            androidx.appcompat.widget.l0 r4 = r6.f1060c
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0212
            boolean r3 = r0.E
            if (r3 == 0) goto L_0x0212
            java.lang.CharSequence r3 = r1.f549m
            if (r3 == 0) goto L_0x0212
            r3 = 2131623954(0x7f0e0012, float:1.8875074E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f549m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.S()
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.w(androidx.appcompat.view.menu.e):void");
    }
}
