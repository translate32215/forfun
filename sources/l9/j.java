package l9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.c0;
import p0.c;

/* compiled from: NavigationMenuPresenter */
public class j implements androidx.appcompat.view.menu.i {
    public int A;
    public int B;
    public boolean C;
    public boolean D = true;
    public int E;
    public int F;
    public int G;
    public int H = -1;
    public final View.OnClickListener I = new a();

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f21124a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f21125b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f21126c;

    /* renamed from: d  reason: collision with root package name */
    public int f21127d;

    /* renamed from: e  reason: collision with root package name */
    public c f21128e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f21129f;

    /* renamed from: g  reason: collision with root package name */
    public int f21130g = 0;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f21131h;

    /* renamed from: i  reason: collision with root package name */
    public int f21132i = 0;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f21133r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f21134s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f21135t;

    /* renamed from: u  reason: collision with root package name */
    public RippleDrawable f21136u;

    /* renamed from: v  reason: collision with root package name */
    public int f21137v;

    /* renamed from: w  reason: collision with root package name */
    public int f21138w;

    /* renamed from: x  reason: collision with root package name */
    public int f21139x;

    /* renamed from: y  reason: collision with root package name */
    public int f21140y;

    /* renamed from: z  reason: collision with root package name */
    public int f21141z;

    /* compiled from: NavigationMenuPresenter */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            boolean z10 = true;
            j.this.f(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            j jVar = j.this;
            boolean r10 = jVar.f21126c.r(itemData, jVar, 0);
            if (itemData == null || !itemData.isCheckable() || !r10) {
                z10 = false;
            } else {
                j.this.f21128e.m(itemData);
            }
            j.this.f(false);
            if (z10) {
                j.this.g(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public class c extends RecyclerView.e<l> {

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<e> f21143d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f21144e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21145f;

        public c() {
            l();
        }

        public int b() {
            return this.f21143d.size();
        }

        public long c(int i10) {
            return (long) i10;
        }

        public int d(int i10) {
            e eVar = this.f21143d.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f21149a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void e(RecyclerView.a0 a0Var, int i10) {
            l lVar = (l) a0Var;
            int d10 = d(i10);
            if (d10 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f2842a;
                navigationMenuItemView.setIconTintList(j.this.f21134s);
                int i11 = j.this.f21132i;
                if (i11 != 0) {
                    navigationMenuItemView.setTextAppearance(i11);
                }
                ColorStateList colorStateList = j.this.f21133r;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = j.this.f21135t;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.q(navigationMenuItemView, newDrawable);
                RippleDrawable rippleDrawable = j.this.f21136u;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) this.f21143d.get(i10);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f21150b);
                j jVar = j.this;
                int i12 = jVar.f21137v;
                int i13 = jVar.f21138w;
                navigationMenuItemView.setPadding(i12, i13, i12, i13);
                navigationMenuItemView.setIconPadding(j.this.f21139x);
                j jVar2 = j.this;
                if (jVar2.C) {
                    navigationMenuItemView.setIconSize(jVar2.f21140y);
                }
                navigationMenuItemView.setMaxLines(j.this.E);
                navigationMenuItemView.d(gVar.f21149a, 0);
            } else if (d10 == 1) {
                TextView textView = (TextView) lVar.f2842a;
                textView.setText(((g) this.f21143d.get(i10)).f21149a.f568e);
                int i14 = j.this.f21130g;
                if (i14 != 0) {
                    s0.i.h(textView, i14);
                }
                int i15 = j.this.B;
                int paddingTop = textView.getPaddingTop();
                j.this.getClass();
                textView.setPadding(i15, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList2 = j.this.f21131h;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
            } else if (d10 == 2) {
                f fVar = (f) this.f21143d.get(i10);
                View view = lVar.f2842a;
                j jVar3 = j.this;
                view.setPadding(jVar3.f21141z, fVar.f21147a, jVar3.A, fVar.f21148b);
            }
        }

        public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
            RecyclerView.a0 a0Var;
            if (i10 == 0) {
                j jVar = j.this;
                a0Var = new i(jVar.f21129f, viewGroup, jVar.I);
            } else if (i10 == 1) {
                a0Var = new k(j.this.f21129f, viewGroup);
            } else if (i10 == 2) {
                a0Var = new C0183j(j.this.f21129f, viewGroup);
            } else if (i10 != 3) {
                return null;
            } else {
                return new b(j.this.f21125b);
            }
            return a0Var;
        }

        public void k(RecyclerView.a0 a0Var) {
            l lVar = (l) a0Var;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f2842a;
                FrameLayout frameLayout = navigationMenuItemView.H;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.G.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public final void l() {
            if (!this.f21145f) {
                this.f21145f = true;
                this.f21143d.clear();
                this.f21143d.add(new d());
                int i10 = -1;
                int size = j.this.f21126c.l().size();
                boolean z10 = false;
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.g gVar = j.this.f21126c.l().get(i11);
                    if (gVar.isChecked()) {
                        m(gVar);
                    }
                    if (gVar.isCheckable()) {
                        gVar.k(z10);
                    }
                    if (gVar.hasSubMenu()) {
                        androidx.appcompat.view.menu.l lVar = gVar.f578o;
                        if (lVar.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f21143d.add(new f(j.this.G, z10 ? 1 : 0));
                            }
                            this.f21143d.add(new g(gVar));
                            int size2 = lVar.size();
                            int i13 = 0;
                            boolean z12 = false;
                            while (i13 < size2) {
                                androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) lVar.getItem(i13);
                                if (gVar2.isVisible()) {
                                    if (!z12 && gVar2.getIcon() != null) {
                                        z12 = true;
                                    }
                                    if (gVar2.isCheckable()) {
                                        gVar2.k(z10);
                                    }
                                    if (gVar.isChecked()) {
                                        m(gVar);
                                    }
                                    this.f21143d.add(new g(gVar2));
                                }
                                i13++;
                                z10 = false;
                            }
                            if (z12) {
                                int size3 = this.f21143d.size();
                                for (int size4 = this.f21143d.size(); size4 < size3; size4++) {
                                    ((g) this.f21143d.get(size4)).f21150b = true;
                                }
                            }
                        }
                    } else {
                        int i14 = gVar.f565b;
                        if (i14 != i10) {
                            i12 = this.f21143d.size();
                            z11 = gVar.getIcon() != null;
                            if (i11 != 0) {
                                i12++;
                                ArrayList<e> arrayList = this.f21143d;
                                int i15 = j.this.G;
                                arrayList.add(new f(i15, i15));
                            }
                        } else if (!z11 && gVar.getIcon() != null) {
                            int size5 = this.f21143d.size();
                            for (int i16 = i12; i16 < size5; i16++) {
                                ((g) this.f21143d.get(i16)).f21150b = true;
                            }
                            z11 = true;
                        }
                        g gVar3 = new g(gVar);
                        gVar3.f21150b = z11;
                        this.f21143d.add(gVar3);
                        i10 = i14;
                    }
                    i11++;
                    z10 = false;
                }
                this.f21145f = false;
            }
        }

        public void m(androidx.appcompat.view.menu.g gVar) {
            if (this.f21144e != gVar && gVar.isCheckable()) {
                androidx.appcompat.view.menu.g gVar2 = this.f21144e;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.f21144e = gVar;
                gVar.setChecked(true);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f21147a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21148b;

        public f(int i10, int i11) {
            this.f21147a = i10;
            this.f21148b = i11;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.g f21149a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21150b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.f21149a = gVar;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public class h extends v {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void d(View view, p0.c cVar) {
            c.b bVar;
            super.d(view, cVar);
            c cVar2 = j.this.f21128e;
            int i10 = j.this.f21125b.getChildCount() == 0 ? 0 : 1;
            for (int i11 = 0; i11 < j.this.f21128e.b(); i11++) {
                if (j.this.f21128e.d(i11) == 0) {
                    i10++;
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bVar = new c.b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 0, false));
            } else {
                bVar = new c.b((Object) null);
            }
            cVar.m(bVar);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class i extends l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
            /*
                r2 = this;
                r0 = 2131623986(0x7f0e0032, float:1.8875139E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l9.j.i.<init>(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener):void");
        }
    }

    /* renamed from: l9.j$j  reason: collision with other inner class name */
    /* compiled from: NavigationMenuPresenter */
    public static class C0183j extends l {
        public C0183j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static abstract class l extends RecyclerView.a0 {
        public l(View view) {
            super(view);
        }
    }

    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }

    public void b(int i10) {
        this.f21139x = i10;
        g(false);
    }

    public void c(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f21129f = LayoutInflater.from(context);
        this.f21126c = eVar;
        this.G = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public void d(Parcelable parcelable) {
        androidx.appcompat.view.menu.g gVar;
        View actionView;
        l lVar;
        androidx.appcompat.view.menu.g gVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f21124a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f21128e;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                if (i10 != 0) {
                    cVar.f21145f = true;
                    int size = cVar.f21143d.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        e eVar = cVar.f21143d.get(i11);
                        if ((eVar instanceof g) && (gVar2 = ((g) eVar).f21149a) != null && gVar2.f564a == i10) {
                            cVar.m(gVar2);
                            break;
                        }
                        i11++;
                    }
                    cVar.f21145f = false;
                    cVar.l();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f21143d.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = cVar.f21143d.get(i12);
                        if (!(!(eVar2 instanceof g) || (gVar = ((g) eVar2).f21149a) == null || (actionView = gVar.getActionView()) == null || (lVar = (l) sparseParcelableArray2.get(gVar.f564a)) == null)) {
                            actionView.restoreHierarchyState(lVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f21125b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public boolean e(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    public void f(boolean z10) {
        c cVar = this.f21128e;
        if (cVar != null) {
            cVar.f21145f = z10;
        }
    }

    public void g(boolean z10) {
        c cVar = this.f21128e;
        if (cVar != null) {
            cVar.l();
            cVar.f2863a.b();
        }
    }

    public int getId() {
        return this.f21127d;
    }

    public boolean h() {
        return false;
    }

    public Parcelable i() {
        Bundle bundle = new Bundle();
        if (this.f21124a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f21124a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f21128e;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.g gVar = cVar.f21144e;
            if (gVar != null) {
                bundle2.putInt("android:menu:checked", gVar.f564a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f21143d.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = cVar.f21143d.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVar2 = ((g) eVar).f21149a;
                    View actionView = gVar2 != null ? gVar2.getActionView() : null;
                    if (actionView != null) {
                        l lVar = new l();
                        actionView.saveHierarchyState(lVar);
                        sparseArray2.put(gVar2.f564a, lVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f21125b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f21125b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public final void m() {
        int i10 = (this.f21125b.getChildCount() != 0 || !this.D) ? 0 : this.F;
        NavigationMenuView navigationMenuView = this.f21124a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }
}
