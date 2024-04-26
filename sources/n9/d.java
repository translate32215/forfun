package n9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import b2.p;
import com.startapp.startappsdk.R;
import java.util.HashSet;
import o0.c0;
import p0.c;
import s9.f;
import s9.i;
import w8.b;

/* compiled from: NavigationBarMenuView */
public abstract class d extends ViewGroup implements j {
    public static final int[] K = {16842912};
    public static final int[] L = {-16842910};
    public int A = -1;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public i F;
    public boolean G = false;
    public ColorStateList H;
    public e I;
    public e J;

    /* renamed from: a  reason: collision with root package name */
    public final p f22437a;

    /* renamed from: b  reason: collision with root package name */
    public final View.OnClickListener f22438b;

    /* renamed from: c  reason: collision with root package name */
    public final n0.d<a> f22439c = new n0.e(5);

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f22440d = new SparseArray<>(5);

    /* renamed from: e  reason: collision with root package name */
    public int f22441e;

    /* renamed from: f  reason: collision with root package name */
    public a[] f22442f;

    /* renamed from: g  reason: collision with root package name */
    public int f22443g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f22444h = 0;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f22445i;

    /* renamed from: r  reason: collision with root package name */
    public int f22446r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f22447s;

    /* renamed from: t  reason: collision with root package name */
    public final ColorStateList f22448t = c(16842808);

    /* renamed from: u  reason: collision with root package name */
    public int f22449u;

    /* renamed from: v  reason: collision with root package name */
    public int f22450v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f22451w;

    /* renamed from: x  reason: collision with root package name */
    public int f22452x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray<b> f22453y = new SparseArray<>(5);

    /* renamed from: z  reason: collision with root package name */
    public int f22454z = -1;

    /* compiled from: NavigationBarMenuView */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            g itemData = ((a) view).getItemData();
            d dVar = d.this;
            if (!dVar.J.r(itemData, dVar.I, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public d(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f22437a = null;
        } else {
            b2.b bVar = new b2.b();
            this.f22437a = bVar;
            bVar.Q(0);
            bVar.O((long) m9.a.c(getContext(), R.attr.motionDurationLong1, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            bVar.P(m9.a.d(getContext(), R.attr.motionEasingStandard, u8.a.f26149b));
            bVar.K(new l9.p());
        }
        this.f22438b = new a();
        c0.I(this, 1);
    }

    private a getNewItem() {
        a b10 = this.f22439c.b();
        return b10 == null ? e(getContext()) : b10;
    }

    private void setBadgeIfNeeded(a aVar) {
        b bVar;
        int id2 = aVar.getId();
        if ((id2 != -1) && (bVar = this.f22453y.get(id2)) != null) {
            aVar.setBadge(bVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a() {
        removeAllViews();
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    this.f22439c.a(aVar);
                    aVar.i(aVar.f22423s);
                    aVar.f22428x = null;
                    aVar.D = 0.0f;
                    aVar.f22413a = false;
                }
            }
        }
        if (this.J.size() == 0) {
            this.f22443g = 0;
            this.f22444h = 0;
            this.f22442f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            hashSet.add(Integer.valueOf(this.J.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f22453y.size(); i11++) {
            int keyAt = this.f22453y.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f22453y.delete(keyAt);
            }
        }
        this.f22442f = new a[this.J.size()];
        boolean f10 = f(this.f22441e, this.J.l().size());
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            this.I.f22457b = true;
            this.J.getItem(i12).setCheckable(true);
            this.I.f22457b = false;
            a newItem = getNewItem();
            this.f22442f[i12] = newItem;
            newItem.setIconTintList(this.f22445i);
            newItem.setIconSize(this.f22446r);
            newItem.setTextColor(this.f22448t);
            newItem.setTextAppearanceInactive(this.f22449u);
            newItem.setTextAppearanceActive(this.f22450v);
            newItem.setTextColor(this.f22447s);
            int i13 = this.f22454z;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.A;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.C);
            newItem.setActiveIndicatorHeight(this.D);
            newItem.setActiveIndicatorMarginHorizontal(this.E);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.G);
            newItem.setActiveIndicatorEnabled(this.B);
            Drawable drawable = this.f22451w;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f22452x);
            }
            newItem.setShifting(f10);
            newItem.setLabelVisibilityMode(this.f22441e);
            g gVar = (g) this.J.getItem(i12);
            newItem.d(gVar, 0);
            newItem.setItemPosition(i12);
            int i15 = gVar.f564a;
            newItem.setOnTouchListener(this.f22440d.get(i15));
            newItem.setOnClickListener(this.f22438b);
            int i16 = this.f22443g;
            if (i16 != 0 && i15 == i16) {
                this.f22444h = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.J.size() - 1, this.f22444h);
        this.f22444h = min;
        this.J.getItem(min).setChecked(true);
    }

    public void b(e eVar) {
        this.J = eVar;
    }

    public ColorStateList c(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList a10 = g.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = a10.getDefaultColor();
        int[] iArr = L;
        return new ColorStateList(new int[][]{iArr, K, ViewGroup.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final Drawable d() {
        if (this.F == null || this.H == null) {
            return null;
        }
        f fVar = new f(this.F);
        fVar.r(this.H);
        return fVar;
    }

    public abstract a e(Context context);

    public boolean f(int i10, int i11) {
        if (i10 == -1) {
            if (i11 > 3) {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<b> getBadgeDrawables() {
        return this.f22453y;
    }

    public ColorStateList getIconTintList() {
        return this.f22445i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.H;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.B;
    }

    public int getItemActiveIndicatorHeight() {
        return this.D;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.E;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.F;
    }

    public int getItemActiveIndicatorWidth() {
        return this.C;
    }

    public Drawable getItemBackground() {
        a[] aVarArr = this.f22442f;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f22451w;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f22452x;
    }

    public int getItemIconSize() {
        return this.f22446r;
    }

    public int getItemPaddingBottom() {
        return this.A;
    }

    public int getItemPaddingTop() {
        return this.f22454z;
    }

    public int getItemTextAppearanceActive() {
        return this.f22450v;
    }

    public int getItemTextAppearanceInactive() {
        return this.f22449u;
    }

    public ColorStateList getItemTextColor() {
        return this.f22447s;
    }

    public int getLabelVisibilityMode() {
        return this.f22441e;
    }

    public e getMenu() {
        return this.J;
    }

    public int getSelectedItemId() {
        return this.f22443g;
    }

    public int getSelectedItemPosition() {
        return this.f22444h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.b a10 = c.b.a(1, this.J.l().size(), false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f23767a);
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f22445i = colorStateList;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.B = z10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorEnabled : aVarArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.D = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorHeight : aVarArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.E = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorMarginHorizontal : aVarArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.G = z10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorResizeable : aVarArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.F = iVar;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.C = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a activeIndicatorWidth : aVarArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f22451w = drawable;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f22452x = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f22446r = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a iconSize : aVarArr) {
                iconSize.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.A = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a itemPaddingBottom : aVarArr) {
                itemPaddingBottom.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f22454z = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a itemPaddingTop : aVarArr) {
                itemPaddingTop.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f22450v = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f22447s;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f22449u = i10;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f22447s;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f22447s = colorStateList;
        a[] aVarArr = this.f22442f;
        if (aVarArr != null) {
            for (a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f22441e = i10;
    }

    public void setPresenter(e eVar) {
        this.I = eVar;
    }
}
