package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper */
public class s extends y {

    /* renamed from: c  reason: collision with root package name */
    public q f3136c;

    /* renamed from: d  reason: collision with root package name */
    public q f3137d;

    public int[] a(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.g()) {
            iArr[0] = c(view, e(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.h()) {
            iArr[1] = c(view, f(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, q qVar) {
        return ((qVar.c(view) / 2) + qVar.e(view)) - ((qVar.l() / 2) + qVar.k());
    }

    public final View d(RecyclerView.m mVar, q qVar) {
        int A = mVar.A();
        View view = null;
        if (A == 0) {
            return null;
        }
        int l10 = (qVar.l() / 2) + qVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < A; i11++) {
            View z10 = mVar.z(i11);
            int abs = Math.abs(((qVar.c(z10) / 2) + qVar.e(z10)) - l10);
            if (abs < i10) {
                view = z10;
                i10 = abs;
            }
        }
        return view;
    }

    public final q e(RecyclerView.m mVar) {
        q qVar = this.f3137d;
        if (qVar == null || qVar.f3132a != mVar) {
            this.f3137d = new o(mVar);
        }
        return this.f3137d;
    }

    public final q f(RecyclerView.m mVar) {
        q qVar = this.f3136c;
        if (qVar == null || qVar.f3132a != mVar) {
            this.f3136c = new p(mVar);
        }
        return this.f3136c;
    }
}
