package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import c0.j;
import n0.a;

public final /* synthetic */ class y implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1883b;

    public /* synthetic */ y(a0 a0Var, int i10) {
        this.f1882a = i10;
        this.f1883b = a0Var;
    }

    public /* synthetic */ y(q qVar) {
        this.f1882a = 2;
        this.f1883b = qVar;
    }

    public final void a(Object obj) {
        switch (this.f1882a) {
            case 0:
                a0 a0Var = (a0) this.f1883b;
                Configuration configuration = (Configuration) obj;
                if (a0Var.P()) {
                    a0Var.h(configuration, false);
                    return;
                }
                return;
            case 1:
                a0 a0Var2 = (a0) this.f1883b;
                j jVar = (j) obj;
                if (a0Var2.P()) {
                    a0Var2.n(jVar.f3952a, false);
                    return;
                }
                return;
            default:
                Intent intent = (Intent) obj;
                ((q) this.f1883b).f1831v.a();
                return;
        }
    }
}
