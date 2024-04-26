package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import y.e;

/* compiled from: Constraints */
public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public b f1320a;

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public b getConstraintSet() {
        if (this.f1320a == null) {
            this.f1320a = new b();
        }
        b bVar = this.f1320a;
        bVar.getClass();
        int childCount = getChildCount();
        bVar.f1222c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!bVar.f1221b || id2 != -1) {
                if (!bVar.f1222c.containsKey(Integer.valueOf(id2))) {
                    bVar.f1222c.put(Integer.valueOf(id2), new b.a());
                }
                b.a aVar2 = bVar.f1222c.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        a aVar3 = (a) childAt;
                        aVar2.c(id2, aVar);
                        if (aVar3 instanceof Barrier) {
                            b.C0015b bVar2 = aVar2.f1226d;
                            bVar2.f1260i0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar2.f1256g0 = barrier.getType();
                            aVar2.f1226d.f1262j0 = barrier.getReferencedIds();
                            aVar2.f1226d.f1258h0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id2, aVar);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1320a;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    /* compiled from: Constraints */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1321r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1322s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1323t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f1324u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1325v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f1326w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1327x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1328y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f1329z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1321r0 = 1.0f;
            this.f1322s0 = false;
            this.f1323t0 = 0.0f;
            this.f1324u0 = 0.0f;
            this.f1325v0 = 0.0f;
            this.f1326w0 = 0.0f;
            this.f1327x0 = 1.0f;
            this.f1328y0 = 1.0f;
            this.f1329z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1321r0 = 1.0f;
            this.f1322s0 = false;
            this.f1323t0 = 0.0f;
            this.f1324u0 = 0.0f;
            this.f1325v0 = 0.0f;
            this.f1326w0 = 0.0f;
            this.f1327x0 = 1.0f;
            this.f1328y0 = 1.0f;
            this.f1329z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f27964d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1321r0 = obtainStyledAttributes.getFloat(index, this.f1321r0);
                } else if (index == 28) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1323t0 = obtainStyledAttributes.getFloat(index, this.f1323t0);
                        this.f1322s0 = true;
                    }
                } else if (index == 23) {
                    this.f1325v0 = obtainStyledAttributes.getFloat(index, this.f1325v0);
                } else if (index == 24) {
                    this.f1326w0 = obtainStyledAttributes.getFloat(index, this.f1326w0);
                } else if (index == 22) {
                    this.f1324u0 = obtainStyledAttributes.getFloat(index, this.f1324u0);
                } else if (index == 20) {
                    this.f1327x0 = obtainStyledAttributes.getFloat(index, this.f1327x0);
                } else if (index == 21) {
                    this.f1328y0 = obtainStyledAttributes.getFloat(index, this.f1328y0);
                } else if (index == 16) {
                    this.f1329z0 = obtainStyledAttributes.getFloat(index, this.f1329z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27 && Build.VERSION.SDK_INT >= 21) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
