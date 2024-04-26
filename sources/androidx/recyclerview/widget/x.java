package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class x extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f3144g = true;

    public boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2872a;
        int i13 = cVar.f2873b;
        if (a0Var2.x()) {
            int i14 = cVar.f2872a;
            i10 = cVar.f2873b;
            i11 = i14;
        } else {
            i11 = cVar2.f2872a;
            i10 = cVar2.f2873b;
        }
        return l(a0Var, a0Var2, i12, i13, i11, i10);
    }

    public abstract boolean k(RecyclerView.a0 a0Var);

    public abstract boolean l(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean m(RecyclerView.a0 a0Var, int i10, int i11, int i12, int i13);

    public abstract boolean n(RecyclerView.a0 a0Var);
}
