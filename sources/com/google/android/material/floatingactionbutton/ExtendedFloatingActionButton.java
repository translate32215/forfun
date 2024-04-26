package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.WeakHashMap;
import l9.e;
import o0.c0;
import u8.g;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            return Float.valueOf((float) c0.e.f((View) obj));
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.k(view, intValue, paddingTop, c0.e.e(view), view.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            return Float.valueOf((float) c0.e.e((View) obj));
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.k(view, c0.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        Class<Float> cls = Float.class;
        new a(cls, "width");
        new b(cls, "height");
        new c(cls, "paddingStart");
        new d(cls, "paddingEnd");
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.A = z10;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.b(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f9224a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9225b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9226c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9225b = false;
            this.f9226c = true;
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public void c(CoordinatorLayout.f fVar) {
            if (fVar.f1360h == 0) {
                fVar.f1360h = 80;
            }
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1353a instanceof BottomSheetBehavior : false) {
                    u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> d10 = coordinatorLayout.d(extendedFloatingActionButton);
            int size = d10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = d10.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1353a instanceof BottomSheetBehavior : false) && u(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean s(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f9225b || this.f9226c) && fVar.f1358f == view.getId()) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f9224a == null) {
                this.f9224a = new Rect();
            }
            Rect rect = this.f9224a;
            e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f9226c) {
                    int i10 = ExtendedFloatingActionButton.B;
                } else {
                    int i11 = ExtendedFloatingActionButton.B;
                }
                throw null;
            }
            if (this.f9226c) {
                int i12 = ExtendedFloatingActionButton.B;
            } else {
                int i13 = ExtendedFloatingActionButton.B;
            }
            throw null;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.f9226c) {
                    int i10 = ExtendedFloatingActionButton.B;
                } else {
                    int i11 = ExtendedFloatingActionButton.B;
                }
                throw null;
            }
            if (this.f9226c) {
                int i12 = ExtendedFloatingActionButton.B;
            } else {
                int i13 = ExtendedFloatingActionButton.B;
            }
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25844k);
            this.f9225b = obtainStyledAttributes.getBoolean(0, false);
            this.f9226c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
