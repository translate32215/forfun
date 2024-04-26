package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper */
public class r extends m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ s f3135q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context) {
        super(context);
        this.f3135q = sVar;
    }

    public void e(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        s sVar = this.f3135q;
        int[] a10 = sVar.a(sVar.f3145a.getLayoutManager(), view);
        int i10 = a10[0];
        int i11 = a10[1];
        int i12 = i(Math.max(Math.abs(i10), Math.abs(i11)));
        if (i12 > 0) {
            aVar.b(i10, i11, i12, this.f3124j);
        }
    }

    public float h(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public int j(int i10) {
        return Math.min(100, super.j(i10));
    }
}
