package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.startapp.startappsdk.R;
import java.util.HashMap;
import java.util.Map;
import o0.c0;
import u8.g;
import u8.i;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map<View, Integer> f9620i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationBehavior.b B(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f9614a = g.b(context, i10);
        bVar.f9615b = new i(17, 0.0f, 0.0f);
        return bVar;
    }

    public boolean t(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f9620i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1353a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        Map<View, Integer> map = this.f9620i;
                        if (map != null && map.containsKey(childAt)) {
                            c0.I(childAt, this.f9620i.get(childAt).intValue());
                        }
                    } else {
                        this.f9620i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        c0.I(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f9620i = null;
            }
        }
        super.t(view, view2, z10, z11);
        return true;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
