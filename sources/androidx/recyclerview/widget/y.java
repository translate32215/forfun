package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public abstract class y extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3145a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.q f3146b = new a();

    /* compiled from: SnapHelper */
    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3147a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0 && this.f3147a) {
                this.f3147a = false;
                y.this.b();
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f3147a = true;
            }
        }
    }

    public abstract int[] a(RecyclerView.m mVar, View view);

    public void b() {
        RecyclerView.m layoutManager;
        View view;
        RecyclerView recyclerView = this.f3145a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            s sVar = (s) this;
            if (layoutManager.h()) {
                view = sVar.d(layoutManager, sVar.f(layoutManager));
            } else {
                view = layoutManager.g() ? sVar.d(layoutManager, sVar.e(layoutManager)) : null;
            }
            if (view != null) {
                int[] a10 = a(layoutManager, view);
                if (a10[0] != 0 || a10[1] != 0) {
                    this.f3145a.i0(a10[0], a10[1]);
                }
            }
        }
    }
}
