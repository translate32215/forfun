package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.startapp.startappsdk.R;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter */
public class c extends androidx.appcompat.view.menu.a {
    public final SparseBooleanArray A = new SparseBooleanArray();
    public e B;
    public a C;
    public C0012c D;
    public b E;
    public final f F = new f();
    public int G;

    /* renamed from: r  reason: collision with root package name */
    public d f844r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f845s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f846t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f847u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f848v;

    /* renamed from: w  reason: collision with root package name */
    public int f849w;

    /* renamed from: x  reason: collision with root package name */
    public int f850x;

    /* renamed from: y  reason: collision with root package name */
    public int f851y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f852z;

    /* compiled from: ActionMenuPresenter */
    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.A.g()) {
                View view2 = c.this.f844r;
                this.f596f = view2 == null ? (View) c.this.f493h : view2;
            }
            d(c.this.F);
        }

        public void c() {
            c cVar = c.this;
            cVar.C = null;
            cVar.G = 0;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    public class C0012c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public e f855a;

        public C0012c(e eVar) {
            this.f855a = eVar;
        }

        public void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = c.this.f488c;
            if (!(eVar == null || (aVar = eVar.f541e) == null)) {
                aVar.b(eVar);
            }
            View view = (View) c.this.f493h;
            if (!(view == null || view.getWindowToken() == null || !this.f855a.f())) {
                c.this.B = this.f855a;
            }
            c.this.D = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        public class a extends n0 {
            public a(View view, c cVar) {
                super(view);
            }

            public k.f b() {
                e eVar = c.this.B;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                c.this.p();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.D != null) {
                    return false;
                }
                cVar.m();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            j1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.p();
            return true;
        }

        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.i(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, R.attr.actionOverflowMenuStyle, 0);
            this.f597g = 8388613;
            d(c.this.F);
        }

        public void c() {
            androidx.appcompat.view.menu.e eVar = c.this.f488c;
            if (eVar != null) {
                eVar.c(true);
            }
            c.this.B = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class f implements i.a {
        public f() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof l) {
                eVar.k().c(false);
            }
            i.a aVar = c.this.f490e;
            if (aVar != null) {
                aVar.a(eVar, z10);
            }
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            c cVar = c.this;
            if (eVar == cVar.f488c) {
                return false;
            }
            cVar.G = ((l) eVar).A.f564a;
            i.a aVar = cVar.f490e;
            if (aVar != null) {
                return aVar.b(eVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* compiled from: ActionMenuPresenter */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f861a;

        /* compiled from: ActionMenuPresenter */
        public class a implements Parcelable.Creator<g> {
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            public Object[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f861a);
        }

        public g(Parcel parcel) {
            this.f861a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        b();
        i.a aVar = this.f490e;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public boolean b() {
        return m() | n();
    }

    public void c(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f487b = context;
        LayoutInflater.from(context);
        this.f488c = eVar;
        Resources resources = context.getResources();
        if (!this.f848v) {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT < 19) {
                z10 = true ^ ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            this.f847u = z10;
        }
        int i10 = 2;
        this.f849w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f851y = i10;
        int i13 = this.f849w;
        if (this.f847u) {
            if (this.f844r == null) {
                d dVar = new d(this.f486a);
                this.f844r = dVar;
                if (this.f846t) {
                    dVar.setImageDrawable(this.f845s);
                    this.f845s = null;
                    this.f846t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f844r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f844r.getMeasuredWidth();
        } else {
            this.f844r = null;
        }
        this.f850x = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    public void d(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f861a) > 0 && (findItem = this.f488c.findItem(i10)) != null) {
            e((l) findItem.getSubMenu());
        }
    }

    public boolean e(l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (true) {
            androidx.appcompat.view.menu.e eVar = lVar2.f623z;
            if (eVar == this.f488c) {
                break;
            }
            lVar2 = eVar;
        }
        androidx.appcompat.view.menu.g gVar = lVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.f493h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == gVar) {
                    view = childAt;
                    break;
                }
                i10++;
            }
        }
        if (view == null) {
            return false;
        }
        this.G = lVar.A.f564a;
        int size = lVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i11++;
        }
        a aVar = new a(this.f487b, lVar, view);
        this.C = aVar;
        aVar.f598h = z10;
        k.d dVar = aVar.f600j;
        if (dVar != null) {
            dVar.p(z10);
        }
        if (this.C.f()) {
            i.a aVar2 = this.f490e;
            if (aVar2 != null) {
                aVar2.b(lVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public View f(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        j.a aVar;
        View actionView = gVar.getActionView();
        int i10 = 0;
        if (actionView == null || gVar.f()) {
            if (view instanceof j.a) {
                aVar = (j.a) view;
            } else {
                aVar = (j.a) this.f489d.inflate(this.f492g, viewGroup, false);
            }
            aVar.d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f493h);
            if (this.E == null) {
                this.E = new b();
            }
            actionMenuItemView.setPopupCallback(this.E);
            actionView = (View) aVar;
        }
        if (gVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public void g(boolean z10) {
        j jVar;
        int i10;
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) this.f493h;
        ArrayList<androidx.appcompat.view.menu.g> arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.e eVar = this.f488c;
            if (eVar != null) {
                eVar.i();
                ArrayList<androidx.appcompat.view.menu.g> l10 = this.f488c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.g gVar = l10.get(i11);
                    if (gVar.g()) {
                        View childAt = viewGroup.getChildAt(i10);
                        androidx.appcompat.view.menu.g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View f10 = f(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            f10.setPressed(false);
                            f10.jumpDrawablesToCurrentState();
                        }
                        if (f10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) f10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(f10);
                            }
                            ((ViewGroup) this.f493h).addView(f10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f844r) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f493h).requestLayout();
        androidx.appcompat.view.menu.e eVar2 = this.f488c;
        if (eVar2 != null) {
            eVar2.i();
            ArrayList<androidx.appcompat.view.menu.g> arrayList2 = eVar2.f545i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                o0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.e eVar3 = this.f488c;
        if (eVar3 != null) {
            eVar3.i();
            arrayList = eVar3.f546j;
        }
        if (this.f847u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.f844r == null) {
                this.f844r = new d(this.f486a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f844r.getParent();
            if (viewGroup3 != this.f493h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f844r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f493h;
                d dVar = this.f844r;
                ActionMenuView.c l11 = actionMenuView.h();
                l11.f669a = true;
                actionMenuView.addView(dVar, l11);
            }
        } else {
            d dVar2 = this.f844r;
            if (dVar2 != null && dVar2.getParent() == (jVar = this.f493h)) {
                ((ViewGroup) jVar).removeView(this.f844r);
            }
        }
        ((ActionMenuView) this.f493h).setOverflowReserved(this.f847u);
    }

    public boolean h() {
        int i10;
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i11;
        boolean z10;
        androidx.appcompat.view.menu.e eVar = this.f488c;
        if (eVar != null) {
            arrayList = eVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = this.f851y;
        int i13 = this.f850x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f493h;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.g gVar = arrayList.get(i14);
            int i17 = gVar.f588y;
            if ((i17 & 2) == 2) {
                i16++;
            } else {
                if ((i17 & 1) == 1) {
                    i15++;
                } else {
                    z11 = true;
                }
            }
            if (this.f852z && gVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.f847u && (z11 || i15 + i16 > i12)) {
            i12--;
        }
        int i18 = i12 - i16;
        SparseBooleanArray sparseBooleanArray = this.A;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i19);
            int i21 = gVar2.f588y;
            if ((i21 & 2) == i11) {
                View f10 = f(gVar2, (View) null, viewGroup);
                f10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = f10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = gVar2.f565b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                gVar2.l(z10);
            } else {
                if ((i21 & true) == z10) {
                    int i23 = gVar2.f565b;
                    boolean z12 = sparseBooleanArray.get(i23);
                    boolean z13 = (i18 > 0 || z12) && i13 > 0;
                    if (z13) {
                        View f11 = f(gVar2, (View) null, viewGroup);
                        f11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = f11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        z13 &= i13 + i20 > 0;
                    }
                    if (z13 && i23 != 0) {
                        sparseBooleanArray.put(i23, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i23, false);
                        for (int i24 = 0; i24 < i19; i24++) {
                            androidx.appcompat.view.menu.g gVar3 = arrayList.get(i24);
                            if (gVar3.f565b == i23) {
                                if (gVar3.g()) {
                                    i18++;
                                }
                                gVar3.l(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    gVar2.l(z13);
                } else {
                    gVar2.l(false);
                    i19++;
                    i11 = 2;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return true;
    }

    public Parcelable i() {
        g gVar = new g();
        gVar.f861a = this.G;
        return gVar;
    }

    public boolean m() {
        j jVar;
        C0012c cVar = this.D;
        if (cVar == null || (jVar = this.f493h) == null) {
            e eVar = this.B;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f600j.dismiss();
            }
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.D = null;
        return true;
    }

    public boolean n() {
        a aVar = this.C;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f600j.dismiss();
        return true;
    }

    public boolean o() {
        e eVar = this.B;
        return eVar != null && eVar.b();
    }

    public boolean p() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f847u || o() || (eVar = this.f488c) == null || this.f493h == null || this.D != null) {
            return false;
        }
        eVar.i();
        if (eVar.f546j.isEmpty()) {
            return false;
        }
        C0012c cVar = new C0012c(new e(this.f487b, this.f488c, this.f844r, true));
        this.D = cVar;
        ((View) this.f493h).post(cVar);
        return true;
    }
}
