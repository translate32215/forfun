package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
public class w {
    public static int a(RecyclerView.x xVar, q qVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(mVar.T(view) - mVar.T(view2)) + 1;
        }
        return Math.min(qVar.l(), qVar.b(view2) - qVar.e(view));
    }

    public static int b(RecyclerView.x xVar, q qVar, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        int i10;
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(mVar.T(view), mVar.T(view2));
        int max = Math.max(mVar.T(view), mVar.T(view2));
        if (z11) {
            i10 = Math.max(0, (xVar.b() - max) - 1);
        } else {
            i10 = Math.max(0, min);
        }
        if (!z10) {
            return i10;
        }
        return Math.round((((float) i10) * (((float) Math.abs(qVar.b(view2) - qVar.e(view))) / ((float) (Math.abs(mVar.T(view) - mVar.T(view2)) + 1)))) + ((float) (qVar.k() - qVar.e(view))));
    }

    public static int c(RecyclerView.x xVar, q qVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.A() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return xVar.b();
        }
        return (int) ((((float) (qVar.b(view2) - qVar.e(view))) / ((float) (Math.abs(mVar.T(view) - mVar.T(view2)) + 1))) * ((float) xVar.b()));
    }
}
