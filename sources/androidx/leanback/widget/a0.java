package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.p;
import androidx.leanback.widget.z;

/* compiled from: ItemAlignmentFacetHelper */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static Rect f2284a = new Rect();

    public static int a(View view, z.a aVar, int i10) {
        View view2;
        int i11;
        int i12;
        int i13;
        int i14;
        p.d dVar = (p.d) view.getLayoutParams();
        int i15 = aVar.f2582a;
        if (i15 == 0 || (view2 = view.findViewById(i15)) == null) {
            view2 = view;
        }
        int i16 = aVar.f2583b;
        if (i10 != 0) {
            if (aVar.f2585d) {
                float f10 = aVar.f2584c;
                if (f10 == 0.0f) {
                    i16 += view2.getPaddingTop();
                } else if (f10 == 100.0f) {
                    i16 -= view2.getPaddingBottom();
                }
            }
            if (aVar.f2584c != -1.0f) {
                if (view2 == view) {
                    dVar.getClass();
                    i11 = (view2.getHeight() - dVar.f2485f) - dVar.f2487h;
                } else {
                    i11 = view2.getHeight();
                }
                i16 += (int) ((((float) i11) * aVar.f2584c) / 100.0f);
            }
            if (view == view2) {
                return i16;
            }
            Rect rect = f2284a;
            rect.top = i16;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
            return f2284a.top - dVar.f2485f;
        } else if (view.getLayoutDirection() == 1) {
            if (view2 == view) {
                i13 = dVar.e(view2);
            } else {
                i13 = view2.getWidth();
            }
            int i17 = i13 - i16;
            if (aVar.f2585d) {
                float f11 = aVar.f2584c;
                if (f11 == 0.0f) {
                    i17 -= view2.getPaddingRight();
                } else if (f11 == 100.0f) {
                    i17 += view2.getPaddingLeft();
                }
            }
            if (aVar.f2584c != -1.0f) {
                if (view2 == view) {
                    i14 = dVar.e(view2);
                } else {
                    i14 = view2.getWidth();
                }
                i17 -= (int) ((((float) i14) * aVar.f2584c) / 100.0f);
            }
            if (view == view2) {
                return i17;
            }
            Rect rect2 = f2284a;
            rect2.right = i17;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect2);
            return f2284a.right + dVar.f2486g;
        } else {
            if (aVar.f2585d) {
                float f12 = aVar.f2584c;
                if (f12 == 0.0f) {
                    i16 += view2.getPaddingLeft();
                } else if (f12 == 100.0f) {
                    i16 -= view2.getPaddingRight();
                }
            }
            if (aVar.f2584c != -1.0f) {
                if (view2 == view) {
                    i12 = dVar.e(view2);
                } else {
                    i12 = view2.getWidth();
                }
                i16 += (int) ((((float) i12) * aVar.f2584c) / 100.0f);
            }
            int i18 = i16;
            if (view == view2) {
                return i18;
            }
            Rect rect3 = f2284a;
            rect3.left = i18;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect3);
            return f2284a.left - dVar.f2484e;
        }
    }
}
