package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.c;

/* compiled from: RecyclerView */
public class t implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3138a;

    public t(RecyclerView recyclerView) {
        this.f3138a = recyclerView;
    }

    public View a(int i10) {
        return this.f3138a.getChildAt(i10);
    }

    public int b() {
        return this.f3138a.getChildCount();
    }

    public void c(int i10) {
        View childAt = this.f3138a.getChildAt(i10);
        if (childAt != null) {
            this.f3138a.p(childAt);
            childAt.clearAnimation();
        }
        this.f3138a.removeViewAt(i10);
    }
}
