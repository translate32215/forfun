package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l9.r;
import l9.u;
import o0.c0;
import o0.h;
import p0.c;
import s9.i;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f9044s = 0;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f9045a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final e f9046b = new e((a) null);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f9047c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final Comparator<MaterialButton> f9048d = new a();

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f9049e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9050f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9051g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9052h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9053i;

    /* renamed from: r  reason: collision with root package name */
    public Set<Integer> f9054r = new HashSet();

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends o0.a {
        public b() {
        }

        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i10 = MaterialButtonToggleGroup.f9044s;
            materialButtonToggleGroup.getClass();
            int i11 = -1;
            if (view instanceof MaterialButton) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        i11 = i13;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                            i13++;
                        }
                        i12++;
                    }
                }
            }
            cVar.n(c.C0207c.a(0, 1, i11, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final s9.c f9057e = new s9.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public s9.c f9058a;

        /* renamed from: b  reason: collision with root package name */
        public s9.c f9059b;

        /* renamed from: c  reason: collision with root package name */
        public s9.c f9060c;

        /* renamed from: d  reason: collision with root package name */
        public s9.c f9061d;

        public c(s9.c cVar, s9.c cVar2, s9.c cVar3, s9.c cVar4) {
            this.f9058a = cVar;
            this.f9059b = cVar3;
            this.f9060c = cVar4;
            this.f9061d = cVar2;
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public class e implements MaterialButton.b {
        public e(a aVar) {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083829), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d10 = r.d(getContext(), attributeSet, t8.a.f25850q, R.attr.materialButtonToggleGroupStyle, 2132083829, new int[0]);
        setSingleSelection(d10.getBoolean(2, false));
        this.f9053i = d10.getResourceId(0, -1);
        this.f9052h = d10.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d10.recycle();
        c0.I(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            materialButton.setId(c0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9046b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    h.g(layoutParams, 0);
                    h.h(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    h.h(layoutParams, 0);
                }
                c10.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                h.g(layoutParams3, 0);
                h.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9045a.add(new c(shapeAppearanceModel.f25125e, shapeAppearanceModel.f25128h, shapeAppearanceModel.f25126f, shapeAppearanceModel.f25127g));
        c0.C(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f9054r);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f9051g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f9052h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9048d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f9049e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        Set<Integer> set2 = this.f9054r;
        this.f9054r = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f9050f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f9050f = false;
            }
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                boolean contains2 = set.contains(Integer.valueOf(id2));
                Iterator it = this.f9047c.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(this, id2, contains2);
                }
            }
        }
        invalidate();
    }

    public void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.b bVar = new i.b(shapeAppearanceModel);
                c cVar2 = this.f9045a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    if (i10 == firstVisibleChildIndex) {
                        if (!z10) {
                            s9.c cVar3 = cVar2.f9058a;
                            s9.c cVar4 = c.f9057e;
                            cVar = new c(cVar3, cVar4, cVar2.f9059b, cVar4);
                        } else if (u.c(this)) {
                            s9.c cVar5 = c.f9057e;
                            cVar = new c(cVar5, cVar5, cVar2.f9059b, cVar2.f9060c);
                        } else {
                            s9.c cVar6 = cVar2.f9058a;
                            s9.c cVar7 = cVar2.f9061d;
                            s9.c cVar8 = c.f9057e;
                            cVar = new c(cVar6, cVar7, cVar8, cVar8);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z10) {
                        s9.c cVar9 = c.f9057e;
                        cVar = new c(cVar9, cVar2.f9061d, cVar9, cVar2.f9060c);
                    } else if (u.c(this)) {
                        s9.c cVar10 = cVar2.f9058a;
                        s9.c cVar11 = cVar2.f9061d;
                        s9.c cVar12 = c.f9057e;
                        cVar = new c(cVar10, cVar11, cVar12, cVar12);
                    } else {
                        s9.c cVar13 = c.f9057e;
                        cVar = new c(cVar13, cVar13, cVar2.f9059b, cVar2.f9060c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.f25137e = cVar2.f9058a;
                    bVar.f25140h = cVar2.f9061d;
                    bVar.f25138f = cVar2.f9059b;
                    bVar.f25139g = cVar2.f9060c;
                }
                c10.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f9051g || this.f9054r.isEmpty()) {
            return -1;
        }
        return this.f9054r.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.f9054r.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f9049e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9053i;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.b a10 = c.b.a(1, getVisibleButtonCount(), false, this.f9051g ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f23767a);
        }
    }

    public void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9045a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z10) {
        this.f9052h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f9051g != z10) {
            this.f9051g = z10;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
