package m7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import l0.e;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a extends ViewGroup {
    public final y6.a getAdListener() {
        throw null;
    }

    public final d getAdSize() {
        throw null;
    }

    public final String getAdUnitId() {
        throw null;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e10) {
                e.C("Unable to retrieve ad size.", e10);
            }
            if (dVar != null) {
                Context context = getContext();
                int b10 = dVar.b(context);
                i12 = dVar.a(context);
                i13 = b10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public final void setAdListener(y6.a aVar) {
        throw null;
    }

    public final void setAdSize(d dVar) {
        throw null;
    }

    public final void setAdUnitId(String str) {
        throw null;
    }
}
