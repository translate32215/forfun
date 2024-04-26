package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public class o extends q {
    public o(RecyclerView.m mVar) {
        super(mVar, (o) null);
    }

    public int b(View view) {
        return this.f3132a.I(view) + ((RecyclerView.n) view.getLayoutParams()).rightMargin;
    }

    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3132a.H(view) + nVar.leftMargin + nVar.rightMargin;
    }

    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3132a.G(view) + nVar.topMargin + nVar.bottomMargin;
    }

    public int e(View view) {
        return this.f3132a.F(view) - ((RecyclerView.n) view.getLayoutParams()).leftMargin;
    }

    public int f() {
        return this.f3132a.f2888n;
    }

    public int g() {
        RecyclerView.m mVar = this.f3132a;
        return mVar.f2888n - mVar.R();
    }

    public int h() {
        return this.f3132a.R();
    }

    public int i() {
        return this.f3132a.f2886l;
    }

    public int j() {
        return this.f3132a.f2887m;
    }

    public int k() {
        return this.f3132a.Q();
    }

    public int l() {
        RecyclerView.m mVar = this.f3132a;
        return (mVar.f2888n - mVar.Q()) - this.f3132a.R();
    }

    public int n(View view) {
        this.f3132a.W(view, true, this.f3134c);
        return this.f3134c.right;
    }

    public int o(View view) {
        this.f3132a.W(view, true, this.f3134c);
        return this.f3134c.left;
    }

    public void p(int i10) {
        this.f3132a.c0(i10);
    }
}
