package dev.pankaj.ytvlib.utils;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ud.k;

/* compiled from: AutoFitGridLayoutManager.kt */
public final class AutoFitGridLayoutManager extends GridLayoutManager {
    public int M;
    public boolean N = true;

    public AutoFitGridLayoutManager(Context context, int i10) {
        super(context, 1);
        this.M = i10;
    }

    public void t0(RecyclerView.s sVar, RecyclerView.x xVar) {
        int i10;
        int i11;
        k.f(sVar, "recycler");
        k.f(xVar, "state");
        if (this.N && this.M > 0) {
            if (this.f2761p == 1) {
                i11 = this.f2888n - R();
                i10 = Q();
            } else {
                i11 = this.f2889o - S();
                i10 = P();
            }
            M1(Math.max(1, (i11 - i10) / this.M));
            this.N = false;
        }
        super.t0(sVar, xVar);
    }
}
