package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import o0.c0;

/* compiled from: FragmentTransitionImpl */
public class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1753b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1754c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1755d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1756e;

    public l0(m0 m0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1752a = i10;
        this.f1753b = arrayList;
        this.f1754c = arrayList2;
        this.f1755d = arrayList3;
        this.f1756e = arrayList4;
    }

    public void run() {
        for (int i10 = 0; i10 < this.f1752a; i10++) {
            c0.L((View) this.f1753b.get(i10), (String) this.f1754c.get(i10));
            c0.L((View) this.f1755d.get(i10), (String) this.f1756e.get(i10));
        }
    }
}
