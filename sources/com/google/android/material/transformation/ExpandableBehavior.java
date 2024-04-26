package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o0.c0;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f9598a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9599a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f9600b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j9.a f9601c;

        public a(View view, int i10, j9.a aVar) {
            this.f9599a = view;
            this.f9600b = i10;
            this.f9601c = aVar;
        }

        public boolean onPreDraw() {
            this.f9599a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f9598a == this.f9600b) {
                j9.a aVar = this.f9601c;
                expandableBehavior.t((View) aVar, this.f9599a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        j9.a aVar = (j9.a) view2;
        if (!s(aVar.a())) {
            return false;
        }
        this.f9598a = aVar.a() ? 1 : 2;
        return t((View) aVar, view, aVar.a(), true);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        j9.a aVar;
        if (!c0.r(view)) {
            List<View> d10 = coordinatorLayout.d(view);
            int size = d10.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d10.get(i11);
                if (b(coordinatorLayout, view, view2)) {
                    aVar = (j9.a) view2;
                    break;
                }
                i11++;
            }
            if (aVar != null && s(aVar.a())) {
                int i12 = aVar.a() ? 1 : 2;
                this.f9598a = i12;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, aVar));
            }
        }
        return false;
    }

    public final boolean s(boolean z10) {
        if (z10) {
            int i10 = this.f9598a;
            return i10 == 0 || i10 == 2;
        } else if (this.f9598a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean t(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
