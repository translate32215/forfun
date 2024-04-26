package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public class p extends q {
    public p(RecyclerView.m mVar) {
        super(mVar, (o) null);
    }

    public int b(View view) {
        return this.f3132a.D(view) + ((RecyclerView.n) view.getLayoutParams()).bottomMargin;
    }

    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3132a.G(view) + nVar.topMargin + nVar.bottomMargin;
    }

    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3132a.H(view) + nVar.leftMargin + nVar.rightMargin;
    }

    public int e(View view) {
        return this.f3132a.J(view) - ((RecyclerView.n) view.getLayoutParams()).topMargin;
    }

    public int f() {
        return this.f3132a.f2889o;
    }

    public int g() {
        RecyclerView.m mVar = this.f3132a;
        return mVar.f2889o - mVar.P();
    }

    public int h() {
        return this.f3132a.P();
    }

    public int i() {
        return this.f3132a.f2887m;
    }

    public int j() {
        return this.f3132a.f2886l;
    }

    public int k() {
        return this.f3132a.S();
    }

    public int l() {
        RecyclerView.m mVar = this.f3132a;
        return (mVar.f2889o - mVar.S()) - this.f3132a.P();
    }

    public int n(View view) {
        this.f3132a.W(view, true, this.f3134c);
        return this.f3134c.bottom;
    }

    public int o(View view) {
        this.f3132a.W(view, true, this.f3134c);
        return this.f3134c.top;
    }

    public void p(int i10) {
        this.f3132a.d0(i10);
    }
}
