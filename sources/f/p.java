package f;

import android.view.View;
import o0.c0;
import o0.i0;
import o0.j0;
import o0.k0;

/* compiled from: AppCompatDelegateImpl */
public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f17947a;

    /* compiled from: AppCompatDelegateImpl */
    public class a extends k0 {
        public a() {
        }

        public void b(View view) {
            p.this.f17947a.f17903w.setAlpha(1.0f);
            p.this.f17947a.f17906z.d((j0) null);
            p.this.f17947a.f17906z = null;
        }

        public void c(View view) {
            p.this.f17947a.f17903w.setVisibility(0);
        }
    }

    public p(l lVar) {
        this.f17947a = lVar;
    }

    public void run() {
        l lVar = this.f17947a;
        lVar.f17904x.showAtLocation(lVar.f17903w, 55, 0, 0);
        this.f17947a.K();
        if (this.f17947a.Y()) {
            this.f17947a.f17903w.setAlpha(0.0f);
            l lVar2 = this.f17947a;
            i0 b10 = c0.b(lVar2.f17903w);
            b10.a(1.0f);
            lVar2.f17906z = b10;
            i0 i0Var = this.f17947a.f17906z;
            a aVar = new a();
            View view = (View) i0Var.f22585a.get();
            if (view != null) {
                i0Var.e(view, aVar);
                return;
            }
            return;
        }
        this.f17947a.f17903w.setAlpha(1.0f);
        this.f17947a.f17903w.setVisibility(0);
    }
}
