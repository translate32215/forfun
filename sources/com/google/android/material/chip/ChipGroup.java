package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.startapp.startappsdk.R;
import java.util.List;
import java.util.WeakHashMap;
import l9.f;
import l9.h;
import l9.r;
import o0.c0;
import p0.c;

public class ChipGroup extends f {

    /* renamed from: e  reason: collision with root package name */
    public int f9087e;

    /* renamed from: f  reason: collision with root package name */
    public int f9088f;

    /* renamed from: g  reason: collision with root package name */
    public d f9089g;

    /* renamed from: h  reason: collision with root package name */
    public final l9.b<Chip> f9090h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9091i;

    /* renamed from: r  reason: collision with root package name */
    public final e f9092r;

    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9093a;

        public a(c cVar) {
            this.f9093a = cVar;
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }
    }

    @Deprecated
    public interface c {
        void a(ChipGroup chipGroup, int i10);
    }

    public interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f9095a;

        public e(b bVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    view2.setId(c0.e.a());
                }
                l9.b<Chip> bVar = ChipGroup.this.f9090h;
                Chip chip = (Chip) view2;
                bVar.f21108a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new l9.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9095a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                l9.b<Chip> bVar = chipGroup.f9090h;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener((h.a) null);
                bVar.f21108a.remove(Integer.valueOf(chip.getId()));
                bVar.f21109b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9095a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.chipGroupStyle, 2132083815), attributeSet, R.attr.chipGroupStyle);
        l9.b<Chip> bVar = new l9.b<>();
        this.f9090h = bVar;
        e eVar = new e((b) null);
        this.f9092r = eVar;
        TypedArray d10 = r.d(getContext(), attributeSet, t8.a.f25841h, R.attr.chipGroupStyle, 2132083815, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        this.f9091i = d10.getResourceId(0, -1);
        d10.recycle();
        bVar.f21110c = new b(this);
        super.setOnHierarchyChangeListener(eVar);
        c0.I(this, 1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    public boolean a() {
        return this.f21119c;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f9090h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f9090h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f9087e;
    }

    public int getChipSpacingVertical() {
        return this.f9088f;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9091i;
        if (i10 != -1) {
            l9.b<Chip> bVar = this.f9090h;
            h hVar = (h) bVar.f21108a.get(Integer.valueOf(i10));
            if (hVar != null && bVar.a(hVar)) {
                bVar.d();
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.b a10 = c.b.a(getRowCount(), this.f21119c ? getChipCount() : -1, false, this.f9090h.f21111d ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f23767a);
        }
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f9087e != i10) {
            this.f9087e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f9088f != i10) {
            this.f9088f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((d) null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f9089g = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9092r.f9095a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f9090h.f21112e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        l9.b<Chip> bVar = this.f9090h;
        if (bVar.f21111d != z10) {
            bVar.f21111d = z10;
            boolean z11 = !bVar.f21109b.isEmpty();
            for (T e10 : bVar.f21108a.values()) {
                bVar.e(e10, false);
            }
            if (z11) {
                bVar.d();
            }
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
